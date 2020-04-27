package o;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Տ  reason: contains not printable characters */
final class C3050 {

    /* renamed from: ı  reason: contains not printable characters */
    private static long f13983 = TimeUnit.HOURS.toSeconds(1);

    C3050() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m15562(C0399 r8) {
        if (!TextUtils.isEmpty(r8.m4668()) && r8.m4673() + r8.m4670() >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + f13983) {
            return false;
        }
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static long m15563() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }
}
