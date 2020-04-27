package o;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: o.ԏ  reason: contains not printable characters */
public final class C2966 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Runnable f13704;

    /* renamed from: Ι  reason: contains not printable characters */
    private ViewTreeObserver f13705;

    /* renamed from: ι  reason: contains not printable characters */
    private final View f13706;

    private C2966(View view, Runnable runnable) {
        this.f13706 = view;
        this.f13705 = view.getViewTreeObserver();
        this.f13704 = runnable;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2966 m15241(View view, Runnable runnable) {
        if (view != null) {
            C2966 r0 = new C2966(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(r0);
            view.addOnAttachStateChangeListener(r0);
            return r0;
        }
        throw new NullPointerException("view == null");
    }

    public final boolean onPreDraw() {
        m15240();
        this.f13704.run();
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m15240() {
        if (this.f13705.isAlive()) {
            this.f13705.removeOnPreDrawListener(this);
        } else {
            this.f13706.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f13706.removeOnAttachStateChangeListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f13705 = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        m15240();
    }
}
