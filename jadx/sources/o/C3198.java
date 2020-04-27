package o;

import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Map;
import o.C3204;

/* renamed from: o.ւɨ  reason: contains not printable characters */
public final class C3198 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Map.Entry f14531;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3123 f14532;

    /* renamed from: o.ւɨ$if  reason: invalid class name */
    public interface Cif {
        /* renamed from: ɩ  reason: contains not printable characters */
        C0501 m16140(View view, C0501 r2, C3199 r3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static PorterDuff.Mode m16133(int i, PorterDuff.Mode mode) {
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

    /* renamed from: o.ւɨ$ǃ  reason: contains not printable characters */
    public static class C3199 {

        /* renamed from: ı  reason: contains not printable characters */
        public int f14539;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f14540;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f14541;

        /* renamed from: ι  reason: contains not printable characters */
        public int f14542;

        public C3199(int i, int i2, int i3, int i4) {
            this.f14540 = i;
            this.f14539 = i2;
            this.f14542 = i3;
            this.f14541 = i4;
        }

        public C3199(C3199 r2) {
            this.f14540 = r2.f14540;
            this.f14539 = r2.f14539;
            this.f14542 = r2.f14542;
            this.f14541 = r2.f14541;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m16134(View view, final Cif ifVar) {
        final C3199 r0 = new C3199(C0293.m4184(view), view.getPaddingTop(), C0293.m4173(view), view.getPaddingBottom());
        C0293.m4207(view, (C2850) new C2850() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final C0501 m16139(View view, C0501 r5) {
                return ifVar.m16140(view, r5, new C3199(r0));
            }
        });
        if (C0293.m4187(view)) {
            C0293.m4154(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                }

                public final void onViewAttachedToWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                    C0293.m4154(view);
                }
            });
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static float m16137(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C0293.m4188((View) parent);
        }
        return f;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static ViewGroup m16135(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C3195 m16136(View view) {
        ViewGroup r5 = m16135(view);
        if (Build.VERSION.SDK_INT >= 18) {
            return new C2154(r5);
        }
        ViewGroup r0 = m16135(r5);
        if (r0 == null) {
            return null;
        }
        int childCount = r0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = r0.getChildAt(i);
            if (childAt instanceof C3204.C3205) {
                return ((C3204.C3205) childAt).f14561;
            }
        }
        return new C3152(r0.getContext(), r0, r5);
    }

    public C3198(Map.Entry entry, C3123 r2) {
        this.f14531 = entry;
        this.f14532 = r2;
    }

    public final void run() {
        ((C3197) this.f14531.getKey()).m16132();
    }
}
