package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: o.ıʅ  reason: contains not printable characters */
public final class C0358 {

    /* renamed from: ı  reason: contains not printable characters */
    Runnable f3802 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f3803 = -1;

    /* renamed from: ɩ  reason: contains not printable characters */
    Runnable f3804 = null;

    /* renamed from: ι  reason: contains not printable characters */
    private WeakReference<View> f3805;

    C0358(View view) {
        this.f3805 = new WeakReference<>(view);
    }

    /* renamed from: o.ıʅ$if  reason: invalid class name */
    static class Cif implements C0300 {

        /* renamed from: ı  reason: contains not printable characters */
        C0358 f3812;

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f3813;

        Cif(C0358 r1) {
            this.f3812 = r1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.ıƗ} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m4539(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f3813 = r0
                o.ıʅ r0 = r3.f3812
                int r0 = r0.f3803
                r1 = 0
                if (r0 < 0) goto L_0x000e
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000e:
                o.ıʅ r0 = r3.f3812
                java.lang.Runnable r0 = r0.f3804
                if (r0 == 0) goto L_0x001f
                o.ıʅ r0 = r3.f3812
                java.lang.Runnable r0 = r0.f3804
                o.ıʅ r2 = r3.f3812
                r2.f3804 = r1
                r0.run()
            L_0x001f:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof o.C0300
                if (r2 == 0) goto L_0x002c
                r1 = r0
                o.ıƗ r1 = (o.C0300) r1
            L_0x002c:
                if (r1 == 0) goto L_0x0031
                r1.m4278(r4)
            L_0x0031:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0358.Cif.m4539(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: o.ıƗ} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m4538(android.view.View r4) {
            /*
                r3 = this;
                o.ıʅ r0 = r3.f3812
                int r0 = r0.f3803
                r1 = 0
                if (r0 < 0) goto L_0x0013
                o.ıʅ r0 = r3.f3812
                int r0 = r0.f3803
                r4.setLayerType(r0, r1)
                o.ıʅ r0 = r3.f3812
                r2 = -1
                r0.f3803 = r2
            L_0x0013:
                int r0 = android.os.Build.VERSION.SDK_INT
                r2 = 16
                if (r0 >= r2) goto L_0x001d
                boolean r0 = r3.f3813
                if (r0 != 0) goto L_0x0043
            L_0x001d:
                o.ıʅ r0 = r3.f3812
                java.lang.Runnable r0 = r0.f3802
                if (r0 == 0) goto L_0x002e
                o.ıʅ r0 = r3.f3812
                java.lang.Runnable r0 = r0.f3802
                o.ıʅ r2 = r3.f3812
                r2.f3802 = r1
                r0.run()
            L_0x002e:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof o.C0300
                if (r2 == 0) goto L_0x003b
                r1 = r0
                o.ıƗ r1 = (o.C0300) r1
            L_0x003b:
                if (r1 == 0) goto L_0x0040
                r1.m4277(r4)
            L_0x0040:
                r4 = 1
                r3.f3813 = r4
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0358.Cif.m4538(android.view.View):void");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public void m4537(View view) {
            Object tag = view.getTag(2113929216);
            C0300 r0 = tag instanceof C0300 ? (C0300) tag : null;
            if (r0 != null) {
                r0.m4276(view);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0358 m4531(long j) {
        View view = this.f3805.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0358 m4526(float f) {
        View view = this.f3805.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0358 m4532(float f) {
        View view = this.f3805.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final long m4530() {
        View view = this.f3805.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0358 m4535(Interpolator interpolator) {
        View view = this.f3805.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0358 m4528(long j) {
        View view = this.f3805.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0358 m4534(float f) {
        View view = this.f3805.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4529() {
        View view = this.f3805.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4536() {
        View view = this.f3805.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0358 m4533(C0300 r4) {
        View view = this.f3805.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m4525(view, r4);
            } else {
                view.setTag(2113929216, r4);
                m4525(view, new Cif(this));
            }
        }
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m4525(final View view, final C0300 r4) {
        if (r4 != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    r4.m4276(view);
                }

                public void onAnimationEnd(Animator animator) {
                    r4.m4277(view);
                }

                public void onAnimationStart(Animator animator) {
                    r4.m4278(view);
                }
            });
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0358 m4527(final C0493 r4) {
        final View view = this.f3805.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            AnonymousClass1 r1 = null;
            if (r4 != null) {
                r1 = new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        r4.m4869();
                    }
                };
            }
            view.animate().setUpdateListener(r1);
        }
        return this;
    }
}
