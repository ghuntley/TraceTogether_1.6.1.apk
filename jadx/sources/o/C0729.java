package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: o.ƚǃ  reason: contains not printable characters */
public final class C0729 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean f4957;

    /* renamed from: Ι  reason: contains not printable characters */
    private static Field f4958;

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m5866(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C0892) {
            ((C0892) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static ColorStateList m5867(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof C0892) {
            return ((C0892) compoundButton).m6615();
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m5868(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof C0892) {
            ((C0892) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Drawable m5865(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f4957) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f4958 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4957 = true;
        }
        Field field = f4958;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                f4958 = null;
            }
        }
        return null;
    }
}
