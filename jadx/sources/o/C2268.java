package o;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: o.Іʟ  reason: contains not printable characters */
class C2268 {

    /* renamed from: ı  reason: contains not printable characters */
    private static Method f10598;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean f10599;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static LayoutTransition f10600;

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f10601;

    /* renamed from: ι  reason: contains not printable characters */
    private static Field f10602;

    /* renamed from: ι  reason: contains not printable characters */
    static void m11831(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f10600 == null) {
            AnonymousClass2 r0 = new LayoutTransition() {
                public final boolean isChangingLayout() {
                    return true;
                }
            };
            f10600 = r0;
            r0.setAnimator(2, (Animator) null);
            f10600.setAnimator(0, (Animator) null);
            f10600.setAnimator(1, (Animator) null);
            f10600.setAnimator(3, (Animator) null);
            f10600.setAnimator(4, (Animator) null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    m11830(layoutTransition);
                }
                if (layoutTransition != f10600) {
                    viewGroup.setTag(R.id.f167912131362407, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f10600);
            return;
        }
        viewGroup.setLayoutTransition((LayoutTransition) null);
        if (!f10599) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f10602 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10599 = true;
        }
        Field field = f10602;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        f10602.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(R.id.f167912131362407);
        if (layoutTransition2 != null) {
            viewGroup.setTag(R.id.f167912131362407, (Object) null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static void m11830(LayoutTransition layoutTransition) {
        if (!f10601) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f10598 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f10601 = true;
        }
        Method method = f10598;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
