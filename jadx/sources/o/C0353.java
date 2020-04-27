package o;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.ıɿ  reason: contains not printable characters */
public final class C0353 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Set<String> f3787 = new HashSet();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Object f3788 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f3789 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    private final NotificationManager f3790 = ((NotificationManager) this.f3791.getSystemService("notification"));

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f3791;

    /* renamed from: ι  reason: contains not printable characters */
    public static C0353 m4510(Context context) {
        return new C0353(context);
    }

    private C0353(Context context) {
        this.f3791 = context;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m4511() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f3790.areNotificationsEnabled();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f3791.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f3791.getApplicationInfo();
            String packageName = this.f3791.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                    return true;
                }
                return false;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            }
        }
        return true;
    }
}
