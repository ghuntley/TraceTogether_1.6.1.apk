package o;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: o.ʎ  reason: contains not printable characters */
public final class C1644 {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1850 m9466(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1850.m10207(configuration.getLocales());
        }
        return C1850.m10209(configuration.locale);
    }
}
