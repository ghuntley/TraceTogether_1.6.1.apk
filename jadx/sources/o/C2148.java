package o;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: o.Ϝ  reason: contains not printable characters */
public final class C2148 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Locale f10307 = new Locale("", "");

    /* renamed from: ι  reason: contains not printable characters */
    public static int m11333(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f10307)) {
            return 0;
        }
        String r0 = C1996.m10797(locale);
        if (r0 == null) {
            return m11332(locale);
        }
        return (r0.equalsIgnoreCase("Arab") || r0.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m11332(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }
}
