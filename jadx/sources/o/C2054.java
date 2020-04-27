package o;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: o.ιо  reason: contains not printable characters */
public final class C2054 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Method f10107 = m10950();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Method f10108 = m10948();

    /* renamed from: Ι  reason: contains not printable characters */
    private final JobScheduler f10109;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Method m10950() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Method m10948() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m10946() {
        Method method = f10108;
        if (method != null) {
            try {
                return ((Integer) method.invoke((Object) null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }

    private C2054(JobScheduler jobScheduler) {
        this.f10109 = jobScheduler;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int m10949(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f10107;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f10109, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f10109.schedule(jobInfo);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m10947(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f10107 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new C2054(jobScheduler).m10949(jobInfo, str, m10946(), str2);
    }
}
