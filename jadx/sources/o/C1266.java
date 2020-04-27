package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.ɩɹ  reason: contains not printable characters */
public final class C1266 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Method f7156;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean f7157;

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f7158;

    /* renamed from: ι  reason: contains not printable characters */
    private static Method f7159;

    @Deprecated
    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m8144(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m8154(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m8142(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m8150(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m8151(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m8148(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C1328) {
            ((C1328) drawable).setTint(i);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m8152(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C1328) {
            ((C1328) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m8153(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C1328) {
            ((C1328) drawable).setTintMode(mode);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m8156(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m8145(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m8155(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static ColorFilter m8147(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static void m8159(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        while (Build.VERSION.SDK_INT < 23 && Build.VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                drawable = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof C1465) {
                drawable = ((C1465) drawable).m8791();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    Drawable child = drawableContainerState.getChild(i);
                    if (child != null) {
                        m8159(child);
                    }
                }
                return;
            } else {
                return;
            }
        }
        drawable.clearColorFilter();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m8146(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public static Drawable m8158(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        return Build.VERSION.SDK_INT >= 21 ? !(drawable instanceof C1328) ? new C1470(drawable) : drawable : !(drawable instanceof C1328) ? new C1342(drawable) : drawable;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static <T extends Drawable> T m8149(Drawable drawable) {
        return drawable instanceof C1465 ? ((C1465) drawable).m8791() : drawable;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m8157(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (!f7158) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f7156 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f7158 = true;
            }
            Method method = f7156;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception unused2) {
                    f7156 = null;
                }
            }
        }
        return false;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static int m8143(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (!f7157) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f7159 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f7157 = true;
            }
            Method method = f7159;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception unused2) {
                    f7159 = null;
                }
            }
        }
        return 0;
    }
}
