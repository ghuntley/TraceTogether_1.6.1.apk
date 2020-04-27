package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import o.C2572;
import o.C2745;

/* renamed from: o.іɟ  reason: contains not printable characters */
public final class C2581 implements C2606 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f11734;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2572 f11735;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2602 f11736;

    public C2581(Context context, C2602 r2, C2572 r3) {
        this.f11734 = context;
        this.f11736 = r2;
        this.f11735 = r3;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m13700(JobScheduler jobScheduler, int i, int i2) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                if (i3 >= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m13701(C2291 r13, int i) {
        ComponentName componentName = new ComponentName(this.f11734, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f11734.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f11734.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(r13.m11959().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C2745.C3657iF.m14550(r13.m11961())).array());
        if (r13.m11960() != null) {
            adler32.update(r13.m11960());
        }
        int value = (int) adler32.getValue();
        if (m13700(jobScheduler, value, i)) {
            new Object[1][0] = r13;
            return;
        }
        long r7 = this.f11736.m13792(r13);
        C2572 r4 = this.f11735;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        C1766 r0 = r13.m11961();
        builder.setMinimumLatency(r4.m13681(r0, r7, i));
        Set<C2572.Cif> r02 = r4.m13683().get(r0).m13686();
        if (r02.contains(C2572.Cif.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (r02.contains(C2572.Cif.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (r02.contains(C2572.Cif.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", r13.m11959());
        persistableBundle.putInt("priority", C2745.C3657iF.m14550(r13.m11961()));
        if (r13.m11960() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(r13.m11960(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {r13, Integer.valueOf(value), Long.valueOf(this.f11735.m13681(r13.m11961(), r7, i)), Long.valueOf(r7), Integer.valueOf(i)};
        jobScheduler.schedule(builder.build());
    }
}
