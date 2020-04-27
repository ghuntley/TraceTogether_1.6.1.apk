package o;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.Т  reason: contains not printable characters */
public final class C2373 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Method f10899;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                f10899 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f10899.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m12363(View view) {
        return C0293.m4156(view) == 1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m12362(View view, Rect rect, Rect rect2) {
        Method method = f10899;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m12361(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }
}
