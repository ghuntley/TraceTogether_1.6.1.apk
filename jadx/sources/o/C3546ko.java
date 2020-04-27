package o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;

/* renamed from: o.ko  reason: case insensitive filesystem */
public abstract class C3546ko<T> {

    /* renamed from: ι  reason: contains not printable characters */
    public T f2669;

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract void m3293(String str, String str2, String str3, int i, int i2, String... strArr);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract boolean m3294(String str);

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m3296(int i, String... strArr);

    /* renamed from: ι  reason: contains not printable characters */
    public abstract Context m3297();

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C3546ko<? extends Activity> m3292(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            return new C3547kp(activity);
        }
        if (activity instanceof C1459) {
            return new C3540ki((C1459) activity);
        }
        return new C3542kk(activity);
    }

    public C3546ko(T t) {
        this.f2669 = t;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m3295(String... strArr) {
        for (String r3 : strArr) {
            if (m3294(r3)) {
                return true;
            }
        }
        return false;
    }
}
