package o;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;

@SuppressLint({"RestrictedAPI"})
/* renamed from: o.Ґ  reason: contains not printable characters */
public final class C2674 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[] f12310 = new int[0];

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f12311 = {16842912};

    /* renamed from: Ι  reason: contains not printable characters */
    public static final Rect f12312 = new Rect();

    /* renamed from: ι  reason: contains not printable characters */
    private static Class<?> f12313;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f12313 = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Rect m14213(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (f12313 != null) {
            try {
                Drawable r12 = C1266.m8149(drawable);
                Object invoke = r12.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(r12, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f12313.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f12312;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static void m14211(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(f12311);
            } else {
                drawable.setState(f12310);
            }
            drawable.setState(state);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m14212(Drawable drawable) {
        while (true) {
            if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
                return false;
            }
            if (drawable instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                    return true;
                }
                for (Drawable r3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!m14212(r3)) {
                        return false;
                    }
                }
                return true;
            } else if (drawable instanceof C1465) {
                drawable = ((C1465) drawable).m8791();
            } else if (drawable instanceof C1678) {
                drawable = ((C1678) drawable).f8701;
            } else if (!(drawable instanceof ScaleDrawable)) {
                return true;
            } else {
                drawable = ((ScaleDrawable) drawable).getDrawable();
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static PorterDuff.Mode m14214(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
