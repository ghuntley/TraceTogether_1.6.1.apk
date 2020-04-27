package o;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: o.ǃſ  reason: contains not printable characters */
public final class C0887 {

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean f5698;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Method f5699;

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f5700;

    /* renamed from: ι  reason: contains not printable characters */
    private static Field f5701;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m6599(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C2409.m12455(i3, C0293.m4156(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m6600(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (Build.VERSION.SDK_INT >= 21) {
            if (!f5700) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f5701 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f5700 = true;
            }
            Field field = f5701;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException unused2) {
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m6601(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f5698) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f5699 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f5698 = true;
        }
        Method method = f5699;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }
}
