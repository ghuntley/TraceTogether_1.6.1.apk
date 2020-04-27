package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.C1822;
import o.C1976;

/* renamed from: o.сǃ  reason: contains not printable characters */
public abstract class C2461 extends C1976 {

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final String[] f11197 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: і  reason: contains not printable characters */
    private int f11198 = 3;

    /* renamed from: ɩ  reason: contains not printable characters */
    public Animator m12688(View view, C2259 r2) {
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public Animator m12692(View view, C2259 r2) {
        return null;
    }

    /* renamed from: o.сǃ$If */
    static class If {

        /* renamed from: ı  reason: contains not printable characters */
        ViewGroup f11203;

        /* renamed from: ǃ  reason: contains not printable characters */
        boolean f11204;

        /* renamed from: ɩ  reason: contains not printable characters */
        boolean f11205;

        /* renamed from: Ι  reason: contains not printable characters */
        int f11206;

        /* renamed from: ι  reason: contains not printable characters */
        int f11207;

        /* renamed from: і  reason: contains not printable characters */
        ViewGroup f11208;

        If() {
        }
    }

    public C2461() {
    }

    @SuppressLint({"RestrictedApi"})
    public C2461(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2004.f9953);
        int i = ((XmlResourceParser) attributeSet).getAttributeValue("http://schemas.android.com/apk/res/android", "transitionVisibilityMode") != null ? obtainStyledAttributes.getInt(0, 0) : 0;
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return;
        }
        if ((i & -4) == 0) {
            this.f11198 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12690(int i) {
        if ((i & -4) == 0) {
            this.f11198 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final int m12687() {
        return this.f11198;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String[] m12686() {
        return f11197;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m12683(C2259 r3) {
        r3.f10585.put("android:visibility:visibility", Integer.valueOf(r3.f10584.getVisibility()));
        r3.f10585.put("android:visibility:parent", r3.f10584.getParent());
        int[] iArr = new int[2];
        r3.f10584.getLocationOnScreen(iArr);
        r3.f10585.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m12693(C2259 r1) {
        m12683(r1);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12685(C2259 r1) {
        m12683(r1);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static If m12684(C2259 r7, C2259 r8) {
        If ifR = new If();
        ifR.f11204 = false;
        ifR.f11205 = false;
        if (r7 == null || !r7.f10585.containsKey("android:visibility:visibility")) {
            ifR.f11207 = -1;
            ifR.f11203 = null;
        } else {
            ifR.f11207 = ((Integer) r7.f10585.get("android:visibility:visibility")).intValue();
            ifR.f11203 = (ViewGroup) r7.f10585.get("android:visibility:parent");
        }
        if (r8 == null || !r8.f10585.containsKey("android:visibility:visibility")) {
            ifR.f11206 = -1;
            ifR.f11208 = null;
        } else {
            ifR.f11206 = ((Integer) r8.f10585.get("android:visibility:visibility")).intValue();
            ifR.f11208 = (ViewGroup) r8.f10585.get("android:visibility:parent");
        }
        if (r7 == null || r8 == null) {
            if (r7 == null && ifR.f11206 == 0) {
                ifR.f11205 = true;
                ifR.f11204 = true;
            } else if (r8 == null && ifR.f11207 == 0) {
                ifR.f11205 = false;
                ifR.f11204 = true;
            }
        } else if (ifR.f11207 == ifR.f11206 && ifR.f11203 == ifR.f11208) {
            return ifR;
        } else {
            if (ifR.f11207 != ifR.f11206) {
                if (ifR.f11207 == 0) {
                    ifR.f11205 = false;
                    ifR.f11204 = true;
                } else if (ifR.f11206 == 0) {
                    ifR.f11205 = true;
                    ifR.f11204 = true;
                }
            } else if (ifR.f11208 == null) {
                ifR.f11205 = false;
                ifR.f11204 = true;
            } else if (ifR.f11203 == null) {
                ifR.f11205 = true;
                ifR.f11204 = true;
            }
        }
        return ifR;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        if (r11.f9906 != false) goto L_0x00c2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator m12689(final android.view.ViewGroup r12, o.C2259 r13, o.C2259 r14) {
        /*
            r11 = this;
            o.сǃ$If r0 = m12684((o.C2259) r13, (o.C2259) r14)
            boolean r1 = r0.f11204
            r2 = 0
            if (r1 == 0) goto L_0x013c
            android.view.ViewGroup r1 = r0.f11203
            if (r1 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r0.f11208
            if (r1 == 0) goto L_0x013c
        L_0x0011:
            boolean r1 = r0.f11205
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0042
            int r12 = r11.f11198
            r12 = r12 & r4
            if (r12 != r4) goto L_0x0041
            if (r14 != 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            if (r13 != 0) goto L_0x003a
            android.view.View r12 = r14.f10584
            android.view.ViewParent r12 = r12.getParent()
            android.view.View r12 = (android.view.View) r12
            o.Іɾ r0 = r11.m10724((android.view.View) r12, (boolean) r3)
            o.Іɾ r12 = r11.m10735(r12, r3)
            o.сǃ$If r12 = m12684((o.C2259) r0, (o.C2259) r12)
            boolean r12 = r12.f11204
            if (r12 == 0) goto L_0x003a
            return r2
        L_0x003a:
            android.view.View r12 = r14.f10584
            android.animation.Animator r12 = r11.m12692((android.view.View) r12, (o.C2259) r13)
            return r12
        L_0x0041:
            return r2
        L_0x0042:
            int r0 = r0.f11206
            int r1 = r11.f11198
            r5 = 2
            r1 = r1 & r5
            if (r1 != r5) goto L_0x013c
            if (r13 == 0) goto L_0x013c
            android.view.View r1 = r13.f10584
            if (r14 == 0) goto L_0x0053
            android.view.View r14 = r14.f10584
            goto L_0x0054
        L_0x0053:
            r14 = r2
        L_0x0054:
            r6 = 2131362307(0x7f0a0203, float:1.834439E38)
            java.lang.Object r7 = r1.getTag(r6)
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L_0x0063
            r8 = r2
            r14 = 1
            goto L_0x00c4
        L_0x0063:
            if (r14 == 0) goto L_0x0075
            android.view.ViewParent r7 = r14.getParent()
            if (r7 != 0) goto L_0x006c
            goto L_0x0075
        L_0x006c:
            r7 = 4
            if (r0 != r7) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            if (r1 != r14) goto L_0x007b
        L_0x0072:
            r8 = r14
            r7 = r2
            goto L_0x0079
        L_0x0075:
            if (r14 == 0) goto L_0x007b
            r7 = r14
            r8 = r2
        L_0x0079:
            r14 = 0
            goto L_0x007e
        L_0x007b:
            r7 = r2
            r8 = r7
            r14 = 1
        L_0x007e:
            if (r14 == 0) goto L_0x00c3
            android.view.ViewParent r14 = r1.getParent()
            if (r14 != 0) goto L_0x0087
            goto L_0x00c2
        L_0x0087:
            android.view.ViewParent r14 = r1.getParent()
            boolean r14 = r14 instanceof android.view.View
            if (r14 == 0) goto L_0x00c3
            android.view.ViewParent r14 = r1.getParent()
            android.view.View r14 = (android.view.View) r14
            o.Іɾ r9 = r11.m10735(r14, r4)
            o.Іɾ r10 = r11.m10724((android.view.View) r14, (boolean) r4)
            o.сǃ$If r9 = m12684((o.C2259) r9, (o.C2259) r10)
            boolean r9 = r9.f11204
            if (r9 != 0) goto L_0x00ab
            android.view.View r14 = o.C2112.m11267(r12, r1, r14)
            r7 = r14
            goto L_0x00c3
        L_0x00ab:
            int r9 = r14.getId()
            android.view.ViewParent r14 = r14.getParent()
            if (r14 != 0) goto L_0x00c3
            r14 = -1
            if (r9 == r14) goto L_0x00c3
            android.view.View r14 = r12.findViewById(r9)
            if (r14 == 0) goto L_0x00c3
            boolean r14 = r11.f9906
            if (r14 == 0) goto L_0x00c3
        L_0x00c2:
            r7 = r1
        L_0x00c3:
            r14 = 0
        L_0x00c4:
            if (r7 == 0) goto L_0x0114
            if (r14 != 0) goto L_0x00f8
            java.util.Map<java.lang.String, java.lang.Object> r0 = r13.f10585
            java.lang.String r2 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r2)
            int[] r0 = (int[]) r0
            r2 = r0[r3]
            r0 = r0[r4]
            int[] r5 = new int[r5]
            r12.getLocationOnScreen(r5)
            r3 = r5[r3]
            int r2 = r2 - r3
            int r3 = r7.getLeft()
            int r2 = r2 - r3
            r7.offsetLeftAndRight(r2)
            r2 = r5[r4]
            int r0 = r0 - r2
            int r2 = r7.getTop()
            int r0 = r0 - r2
            r7.offsetTopAndBottom(r0)
            o.Іɿ r0 = o.C2235.m11685(r12)
            r0.m11823(r7)
        L_0x00f8:
            android.animation.Animator r13 = r11.m12688((android.view.View) r7, (o.C2259) r13)
            if (r14 != 0) goto L_0x0113
            if (r13 != 0) goto L_0x0108
            o.Іɿ r12 = o.C2235.m11685(r12)
            r12.m11824(r7)
            goto L_0x0113
        L_0x0108:
            r1.setTag(r6, r7)
            o.сǃ$4 r14 = new o.сǃ$4
            r14.<init>(r12, r7, r1)
            r11.m10747((o.C1976.If) r14)
        L_0x0113:
            return r13
        L_0x0114:
            if (r8 == 0) goto L_0x013c
            int r12 = r8.getVisibility()
            o.C2300.m11984(r8, r3)
            android.animation.Animator r13 = r11.m12688((android.view.View) r8, (o.C2259) r13)
            if (r13 == 0) goto L_0x0138
            o.сǃ$ǃ r12 = new o.сǃ$ǃ
            r12.<init>(r8, r0)
            r13.addListener(r12)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r14 < r0) goto L_0x0134
            r13.addPauseListener(r12)
        L_0x0134:
            r11.m10747((o.C1976.If) r12)
            goto L_0x013b
        L_0x0138:
            o.C2300.m11984(r8, r12)
        L_0x013b:
            return r13
        L_0x013c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2461.m12689(android.view.ViewGroup, o.Іɾ, o.Іɾ):android.animation.Animator");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m12691(C2259 r5, C2259 r6) {
        if (r5 == null && r6 == null) {
            return false;
        }
        if (r5 != null && r6 != null && r6.f10585.containsKey("android:visibility:visibility") != r5.f10585.containsKey("android:visibility:visibility")) {
            return false;
        }
        If r52 = m12684(r5, r6);
        if (!r52.f11204 || (r52.f11207 != 0 && r52.f11206 != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: o.сǃ$ǃ  reason: contains not printable characters */
    static class C2462 extends AnimatorListenerAdapter implements C1976.If, C1822.C1823 {

        /* renamed from: ı  reason: contains not printable characters */
        private final int f11209;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private boolean f11210 = false;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final View f11211;

        /* renamed from: ɩ  reason: contains not printable characters */
        private boolean f11212;

        /* renamed from: Ι  reason: contains not printable characters */
        private final ViewGroup f11213;

        /* renamed from: ι  reason: contains not printable characters */
        private final boolean f11214;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12699() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m12701() {
        }

        C2462(View view, int i) {
            this.f11211 = view;
            this.f11209 = i;
            this.f11213 = (ViewGroup) view.getParent();
            this.f11214 = true;
            m12698(true);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f11210) {
                C2300.m11984(this.f11211, this.f11209);
            }
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f11210) {
                C2300.m11984(this.f11211, 0);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f11210 = true;
        }

        public final void onAnimationEnd(Animator animator) {
            m12697();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m12700(C1976 r1) {
            m12697();
            r1.m10741((C1976.If) this);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m12703() {
            m12698(false);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m12702() {
            m12698(true);
        }

        /* renamed from: ı  reason: contains not printable characters */
        private void m12697() {
            if (!this.f11210) {
                C2300.m11984(this.f11211, this.f11209);
                ViewGroup viewGroup = this.f11213;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m12698(false);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private void m12698(boolean z) {
            ViewGroup viewGroup;
            if (this.f11214 && this.f11212 != z && (viewGroup = this.f11213) != null) {
                this.f11212 = z;
                C2235.m11686(viewGroup, z);
            }
        }
    }
}
