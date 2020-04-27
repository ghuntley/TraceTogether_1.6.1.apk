package o;

import android.icu.util.ULocale;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: o.ιɹ  reason: contains not printable characters */
public final class C1996 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Method f9937;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Method f9938;

    static {
        if (Build.VERSION.SDK_INT < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f9937 = cls.getMethod("getScript", new Class[]{String.class});
                    f9938 = cls.getMethod("addLikelySubtags", new Class[]{String.class});
                }
            } catch (Exception unused) {
                f9937 = null;
                f9938 = null;
            }
        } else if (Build.VERSION.SDK_INT < 24) {
            try {
                f9938 = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m10797(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) f9938.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return locale.getScript();
            }
        } else {
            String r3 = m10795(locale);
            if (r3 != null) {
                return m10796(r3);
            }
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m10796(String str) {
        try {
            if (f9937 != null) {
                return (String) f9937.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m10795(Locale locale) {
        String obj = locale.toString();
        try {
            if (f9938 != null) {
                return (String) f9938.invoke((Object) null, new Object[]{obj});
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return obj;
    }
}
