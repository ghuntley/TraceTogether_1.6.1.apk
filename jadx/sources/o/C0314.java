package o;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.ıȷ  reason: contains not printable characters */
public final class C0314 {

    /* renamed from: o.ıȷ$ı  reason: contains not printable characters */
    static class C0315 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private static Method f3655;

        /* renamed from: Ι  reason: contains not printable characters */
        private static boolean f3656;

        /* renamed from: ı  reason: contains not printable characters */
        public static IBinder m4384(Bundle bundle, String str) {
            if (!f3656) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f3655 = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f3656 = true;
            }
            Method method2 = f3655;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    f3655 = null;
                }
            }
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static IBinder m4383(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0315.m4384(bundle, str);
    }
}
