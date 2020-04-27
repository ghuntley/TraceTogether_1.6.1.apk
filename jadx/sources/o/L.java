package o;

import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

public final class L {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final List<String> f1273 = Arrays.asList(new String[]{"he", "yi", "id"});

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m1389(Locale locale) {
        if (locale == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        if (P.m1406(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(Locale.US));
        }
        return sb.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Locale m1387(String str) {
        F.m1359();
        Locale locale = Locale.getDefault();
        if (P.m1406(str)) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
            int countTokens = stringTokenizer.countTokens();
            int i = 2;
            if (countTokens == 1 || countTokens == 2) {
                if (countTokens != 1) {
                    i = 5;
                }
                if (i != str.length()) {
                    F.m1359();
                } else {
                    String nextToken = stringTokenizer.nextToken();
                    String upperCase = (stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "").toUpperCase(Locale.US);
                    if (!f1273.contains(nextToken)) {
                        return new Locale(nextToken, upperCase);
                    }
                    F.m1359();
                    Locale r1 = m1388(nextToken, upperCase);
                    if (r1 == null) {
                        r1 = m1390(nextToken, upperCase);
                    }
                    if (r1 == null) {
                        return new Locale(nextToken, upperCase);
                    }
                    return r1;
                }
            } else {
                F.m1361();
            }
        }
        return locale;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Locale m1388(String str, String str2) {
        try {
            Method declaredMethod = Locale.class.getDeclaredMethod("createConstant", new Class[]{String.class, String.class});
            declaredMethod.setAccessible(true);
            return (Locale) declaredMethod.invoke((Object) null, new Object[]{str, str2});
        } catch (Exception unused) {
            F.m1355();
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Locale m1390(String str, String str2) {
        try {
            if (Build.VERSION.SDK_INT >= 14) {
                Constructor<Locale> declaredConstructor = Locale.class.getDeclaredConstructor(new Class[]{Boolean.TYPE, String.class, String.class});
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[]{Boolean.TRUE, str, str2});
            }
            Constructor<Locale> declaredConstructor2 = Locale.class.getDeclaredConstructor(new Class[0]);
            declaredConstructor2.setAccessible(true);
            Locale newInstance = declaredConstructor2.newInstance(new Object[0]);
            Class<?> cls = newInstance.getClass();
            Field declaredField = cls.getDeclaredField("languageCode");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, str);
            Field declaredField2 = cls.getDeclaredField("countryCode");
            declaredField2.setAccessible(true);
            declaredField2.set(newInstance, str2);
            return newInstance;
        } catch (Exception unused) {
            F.m1355();
            return null;
        }
    }
}
