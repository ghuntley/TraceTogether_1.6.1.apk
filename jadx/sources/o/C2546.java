package o;

import android.os.Build;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: o.ѕ  reason: contains not printable characters */
public final class C2546 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Field f11630;

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f11631;

    /* renamed from: ι  reason: contains not printable characters */
    private static void m13575(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f11631) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f11630 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11631 = true;
        }
        Field field = f11630;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m13574(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m13575(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m13575(layoutInflater, factory2);
            }
        }
    }
}
