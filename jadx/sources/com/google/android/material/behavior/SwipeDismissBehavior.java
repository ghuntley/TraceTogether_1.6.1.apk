package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o.C0293;
import o.C0520;
import o.C0607;
import o.C1068;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C3238If<V> {

    /* renamed from: ı  reason: contains not printable characters */
    public int f652 = 2;

    /* renamed from: ǃ  reason: contains not printable characters */
    C1068 f653;

    /* renamed from: ɩ  reason: contains not printable characters */
    float f654 = 0.5f;

    /* renamed from: ɹ  reason: contains not printable characters */
    public float f655 = 0.5f;

    /* renamed from: Ι  reason: contains not printable characters */
    public float f656 = 0.0f;

    /* renamed from: ι  reason: contains not printable characters */
    public C0062 f657;

    /* renamed from: І  reason: contains not printable characters */
    private final C1068.If f658 = new C1068.If() {

        /* renamed from: ı  reason: contains not printable characters */
        private int f660 = -1;

        /* renamed from: ι  reason: contains not printable characters */
        private int f662;

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m874(View view, int i) {
            int i2 = this.f660;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.m869(view);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m877(View view, int i) {
            this.f660 = i;
            this.f662 = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m876(int i) {
            if (SwipeDismissBehavior.this.f657 != null) {
                SwipeDismissBehavior.this.f657.m879(i);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f662) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f661.f654)) goto L_0x005b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
        /* renamed from: Ι  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m873(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f660 = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003f
                int r4 = o.C0293.m4156(r8)
                if (r4 != r2) goto L_0x0016
                r4 = 1
                goto L_0x0017
            L_0x0016:
                r4 = 0
            L_0x0017:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f652
                r6 = 2
                if (r5 != r6) goto L_0x001f
                goto L_0x005b
            L_0x001f:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f652
                if (r5 != 0) goto L_0x002f
                if (r4 == 0) goto L_0x002c
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x005d
                goto L_0x005b
            L_0x002c:
                if (r3 <= 0) goto L_0x005d
                goto L_0x005b
            L_0x002f:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f652
                if (r5 != r2) goto L_0x005d
                if (r4 == 0) goto L_0x003a
                if (r3 <= 0) goto L_0x005d
                goto L_0x005b
            L_0x003a:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x005d
                goto L_0x005b
            L_0x003f:
                int r9 = r8.getLeft()
                int r0 = r7.f662
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f654
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x005d
            L_0x005b:
                r9 = 1
                goto L_0x005e
            L_0x005d:
                r9 = 0
            L_0x005e:
                if (r9 == 0) goto L_0x006d
                int r9 = r8.getLeft()
                int r0 = r7.f662
                if (r9 >= r0) goto L_0x006a
                int r0 = r0 - r10
                goto L_0x006b
            L_0x006a:
                int r0 = r0 + r10
            L_0x006b:
                r1 = 1
                goto L_0x006f
            L_0x006d:
                int r0 = r7.f662
            L_0x006f:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                o.ɍǃ r9 = r9.f653
                int r10 = r8.getTop()
                boolean r9 = r9.m7384((int) r0, (int) r10)
                if (r9 == 0) goto L_0x0088
                com.google.android.material.behavior.SwipeDismissBehavior$ı r9 = new com.google.android.material.behavior.SwipeDismissBehavior$ı
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                o.C0293.m4204((android.view.View) r8, (java.lang.Runnable) r9)
                return
            L_0x0088:
                if (r1 == 0) goto L_0x0097
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$ǃ r9 = r9.f657
                if (r9 == 0) goto L_0x0097
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$ǃ r9 = r9.f657
                r9.m880((android.view.View) r8)
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass2.m873(android.view.View, float, float):void");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final int m875(View view) {
            return view.getWidth();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m872(View view, int i) {
            int i2;
            int i3;
            int width;
            boolean z = C0293.m4156(view) == 1;
            if (SwipeDismissBehavior.this.f652 != 0) {
                if (SwipeDismissBehavior.this.f652 != 1) {
                    i3 = this.f662 - view.getWidth();
                    i2 = view.getWidth() + this.f662;
                } else if (z) {
                    i3 = this.f662;
                    width = view.getWidth();
                } else {
                    i3 = this.f662 - view.getWidth();
                    i2 = this.f662;
                }
                return Math.min(Math.max(i3, i), i2);
            } else if (z) {
                i3 = this.f662 - view.getWidth();
                i2 = this.f662;
                return Math.min(Math.max(i3, i), i2);
            } else {
                i3 = this.f662;
                width = view.getWidth();
            }
            i2 = width + i3;
            return Math.min(Math.max(i3, i), i2);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m870(View view, int i) {
            return view.getTop();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m871(View view, int i) {
            float width = ((float) this.f662) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f656);
            float width2 = ((float) this.f662) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f655);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }
    };

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f659;

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$ǃ  reason: contains not printable characters */
    public interface C0062 {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m879(int i);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m880(View view);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m869(View view) {
        return true;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (C0293.m4217(v) == 0) {
            C0293.m4203((View) v, 1);
            C0293.m4147((View) v, 1048576);
            if (m869(v)) {
                C0293.m4150(v, C0520.Cif.f4327, (CharSequence) null, new C0607() {
                    /* renamed from: ı  reason: contains not printable characters */
                    public final boolean m878(View view) {
                        boolean z = false;
                        if (!SwipeDismissBehavior.this.m869(view)) {
                            return false;
                        }
                        boolean z2 = C0293.m4156(view) == 1;
                        if ((SwipeDismissBehavior.this.f652 == 0 && z2) || (SwipeDismissBehavior.this.f652 == 1 && !z2)) {
                            z = true;
                        }
                        int width = view.getWidth();
                        if (z) {
                            width = -width;
                        }
                        C0293.m4221(view, width);
                        view.setAlpha(0.0f);
                        if (SwipeDismissBehavior.this.f657 != null) {
                            SwipeDismissBehavior.this.f657.m880(view);
                        }
                        return true;
                    }
                });
            }
        }
        return onLayoutChild;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f659;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f659 = coordinatorLayout.m143(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f659;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f659 = false;
        }
        if (!z) {
            return false;
        }
        if (this.f653 == null) {
            this.f653 = C1068.m7371((ViewGroup) coordinatorLayout, this.f658);
        }
        return this.f653.m7379(motionEvent);
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C1068 r1 = this.f653;
        if (r1 == null) {
            return false;
        }
        r1.m7382(motionEvent);
        return true;
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$ı  reason: contains not printable characters */
    class C0061 implements Runnable {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final boolean f664;

        /* renamed from: ι  reason: contains not printable characters */
        private final View f666;

        C0061(View view, boolean z) {
            this.f666 = view;
            this.f664 = z;
        }

        public final void run() {
            if (SwipeDismissBehavior.this.f653 != null && SwipeDismissBehavior.this.f653.m7381()) {
                C0293.m4204(this.f666, (Runnable) this);
            } else if (this.f664 && SwipeDismissBehavior.this.f657 != null) {
                SwipeDismissBehavior.this.f657.m880(this.f666);
            }
        }
    }
}
