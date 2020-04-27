package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import o.C0785;
import o.C0858;

/* renamed from: o.ʑı  reason: contains not printable characters */
final class C1649 {

    /* renamed from: ŀ  reason: contains not printable characters */
    private static final double f8628 = Math.cos(Math.toRadians(45.0d));

    /* renamed from: ɿ  reason: contains not printable characters */
    private static final int[] f8629 = {16842912};

    /* renamed from: ı  reason: contains not printable characters */
    final int f8630;

    /* renamed from: ł  reason: contains not printable characters */
    private Drawable f8631;

    /* renamed from: ſ  reason: contains not printable characters */
    private C0671 f8632;

    /* renamed from: Ɩ  reason: contains not printable characters */
    Drawable f8633;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C0671 f8634;

    /* renamed from: ȷ  reason: contains not printable characters */
    C0785 f8635;

    /* renamed from: ɨ  reason: contains not printable characters */
    LayerDrawable f8636;

    /* renamed from: ɩ  reason: contains not printable characters */
    final C1616 f8637;

    /* renamed from: ɪ  reason: contains not printable characters */
    ColorStateList f8638;

    /* renamed from: ɹ  reason: contains not printable characters */
    final int f8639;

    /* renamed from: ɾ  reason: contains not printable characters */
    C0671 f8640;

    /* renamed from: ʟ  reason: contains not printable characters */
    boolean f8641;

    /* renamed from: Ι  reason: contains not printable characters */
    final C0671 f8642;

    /* renamed from: ι  reason: contains not printable characters */
    final Rect f8643 = new Rect();

    /* renamed from: І  reason: contains not printable characters */
    ColorStateList f8644;

    /* renamed from: г  reason: contains not printable characters */
    boolean f8645 = false;

    /* renamed from: і  reason: contains not printable characters */
    int f8646;

    /* renamed from: Ӏ  reason: contains not printable characters */
    Drawable f8647;

    /* renamed from: ӏ  reason: contains not printable characters */
    ColorStateList f8648;

    public C1649(C1616 r6, AttributeSet attributeSet, int i) {
        this.f8637 = r6;
        this.f8634 = new C0671(r6.getContext(), attributeSet, i, R.style.f175062131952255);
        C0671 r1 = this.f8634;
        Context context = r6.getContext();
        r1.f4785.f4812 = new C2610(context);
        r1.m5521();
        this.f8634.m5531();
        C0785.If ifR = new C0785.If(this.f8634.f4785.f4796);
        TypedArray obtainStyledAttributes = r6.getContext().obtainStyledAttributes(attributeSet, C0858.Aux.f5616, i, R.style.f173402131951841);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            ifR.f5228 = new C0531(dimension);
            ifR.f5227 = new C0531(dimension);
            ifR.f5235 = new C0531(dimension);
            ifR.f5231 = new C0531(dimension);
        }
        this.f8642 = new C0671();
        m9489(new C0785(ifR, (byte) 0));
        Resources resources = r6.getResources();
        this.f8630 = resources.getDimensionPixelSize(R.dimen.f158962131165436);
        this.f8639 = resources.getDimensionPixelSize(R.dimen.f158972131165437);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9492(Drawable drawable) {
        this.f8647 = drawable;
        if (drawable != null) {
            this.f8647 = C1266.m8158(drawable.mutate());
            C1266.m8152(this.f8647, this.f8648);
        }
        if (this.f8636 != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.f8647;
            if (drawable2 != null) {
                stateListDrawable.addState(f8629, drawable2);
            }
            this.f8636.setDrawableByLayerId(R.id.f166032131362162, stateListDrawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9491() {
        Drawable drawable = this.f8631;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f8631.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f8631.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9489(C0785 r5) {
        this.f8635 = r5;
        this.f8634.setShapeAppearanceModel(r5);
        C0671 r0 = this.f8634;
        C0785 r1 = r0.f4785.f4796;
        r0.f4790.set(r0.getBounds());
        r0.f4788 = !r1.m6132(r0.f4790);
        C0671 r02 = this.f8642;
        if (r02 != null) {
            r02.setShapeAppearanceModel(r5);
        }
        C0671 r03 = this.f8640;
        if (r03 != null) {
            r03.setShapeAppearanceModel(r5);
        }
        C0671 r04 = this.f8632;
        if (r04 != null) {
            r04.setShapeAppearanceModel(r5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Drawable m9495(Drawable drawable) {
        int i;
        int i2;
        if ((Build.VERSION.SDK_INT < 21) || this.f8637.f13697) {
            float f = 0.0f;
            int ceil = (int) Math.ceil((double) ((C2963.f13694.m4048(this.f8637.f13699) * 1.5f) + (m9490() ? m9486() : 0.0f)));
            float r0 = C2963.f13694.m4048(this.f8637.f13699);
            if (m9490()) {
                f = m9486();
            }
            i2 = (int) Math.ceil((double) (r0 + f));
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new InsetDrawable(drawable, i2, i, i2, i) {
            public final int getMinimumHeight() {
                return -1;
            }

            public final int getMinimumWidth() {
                return -1;
            }

            public final boolean getPadding(Rect rect) {
                return false;
            }
        };
    }

    /* renamed from: і  reason: contains not printable characters */
    private float m9487() {
        if (!this.f8637.f13696) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT < 21 || this.f8637.f13697) {
            return (float) ((1.0d - f8628) * ((double) this.f8637.m9359()));
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m9490() {
        /*
            r6 = this;
            o.ʇɟ r0 = r6.f8637
            boolean r0 = r0.f13696
            r1 = 0
            if (r0 == 0) goto L_0x0031
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 1
            if (r0 < r2) goto L_0x0027
            o.Ɨŧ r0 = r6.f8634
            o.Ɨŧ$if r2 = r0.f4785
            o.ƭł r2 = r2.f4796
            android.graphics.RectF r4 = r0.f4790
            android.graphics.Rect r5 = r0.getBounds()
            r4.set(r5)
            android.graphics.RectF r0 = r0.f4790
            boolean r0 = r2.m6132(r0)
            if (r0 == 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            o.ʇɟ r0 = r6.f8637
            boolean r0 = r0.f13697
            if (r0 == 0) goto L_0x0031
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1649.m9490():boolean");
    }

    /* renamed from: І  reason: contains not printable characters */
    private float m9486() {
        float f;
        float f2;
        float f3;
        C2197 r0 = this.f8635.f5221;
        float r1 = this.f8634.m5535();
        float f4 = 0.0f;
        if (r0 instanceof C0623) {
            f = (float) ((1.0d - f8628) * ((double) r1));
        } else {
            f = r0 instanceof C0567 ? r1 / 2.0f : 0.0f;
        }
        C2197 r12 = this.f8635.f5220;
        float r2 = this.f8634.m5534();
        if (r12 instanceof C0623) {
            f2 = (float) ((1.0d - f8628) * ((double) r2));
        } else {
            f2 = r12 instanceof C0567 ? r2 / 2.0f : 0.0f;
        }
        float max = Math.max(f, f2);
        C2197 r13 = this.f8635.f5214;
        float r22 = this.f8634.m5523();
        if (r13 instanceof C0623) {
            f3 = (float) ((1.0d - f8628) * ((double) r22));
        } else {
            f3 = r13 instanceof C0567 ? r22 / 2.0f : 0.0f;
        }
        C2197 r23 = this.f8635.f5216;
        float r7 = this.f8634.m5528();
        if (r23 instanceof C0623) {
            f4 = (float) ((1.0d - f8628) * ((double) r7));
        } else if (r23 instanceof C0567) {
            f4 = r7 / 2.0f;
        }
        return Math.max(max, Math.max(f3, f4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final Drawable m9497() {
        if (this.f8631 == null) {
            this.f8631 = m9488();
        }
        if (this.f8636 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = this.f8647;
            if (drawable != null) {
                stateListDrawable.addState(f8629, drawable);
            }
            this.f8636 = new LayerDrawable(new Drawable[]{this.f8631, this.f8642, stateListDrawable});
            this.f8636.setId(2, R.id.f166032131362162);
        }
        return this.f8636;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Drawable m9488() {
        if (!C0410.f3979) {
            return m9485();
        }
        this.f8640 = new C0671(this.f8635);
        return new RippleDrawable(this.f8644, (Drawable) null, this.f8640);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Drawable m9485() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f8632 = new C0671(this.f8635);
        C0671 r1 = this.f8632;
        ColorStateList colorStateList = this.f8644;
        if (r1.f4785.f4804 != colorStateList) {
            r1.f4785.f4804 = colorStateList;
            r1.onStateChange(r1.getState());
        }
        stateListDrawable.addState(new int[]{16842919}, this.f8632);
        return stateListDrawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m9494() {
        ColorStateList colorStateList;
        Drawable drawable;
        if (!C0410.f3979 || (drawable = this.f8631) == null) {
            C0671 r0 = this.f8632;
            if (r0 != null && r0.f4785.f4804 != (colorStateList = this.f8644)) {
                r0.f4785.f4804 = colorStateList;
                r0.onStateChange(r0.getState());
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f8644);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9496() {
        if (!this.f8645) {
            this.f8637.m9357(m9495(this.f8634));
        }
        this.f8637.setForeground(m9495(this.f8633));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9493() {
        /*
            r6 = this;
            o.ʇɟ r0 = r6.f8637
            boolean r0 = r0.f13696
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r0 < r3) goto L_0x0027
            o.Ɨŧ r0 = r6.f8634
            o.Ɨŧ$if r3 = r0.f4785
            o.ƭł r3 = r3.f4796
            android.graphics.RectF r4 = r0.f4790
            android.graphics.Rect r5 = r0.getBounds()
            r4.set(r5)
            android.graphics.RectF r0 = r0.f4790
            boolean r0 = r3.m6132(r0)
            if (r0 == 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 != 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x0037
            boolean r0 = r6.m9490()
            if (r0 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            if (r1 == 0) goto L_0x003e
            float r0 = r6.m9486()
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            float r1 = r6.m9487()
            float r0 = r0 - r1
            int r0 = (int) r0
            o.ʇɟ r1 = r6.f8637
            android.graphics.Rect r2 = r6.f8643
            int r2 = r2.left
            int r2 = r2 + r0
            android.graphics.Rect r3 = r6.f8643
            int r3 = r3.top
            int r3 = r3 + r0
            android.graphics.Rect r4 = r6.f8643
            int r4 = r4.right
            int r4 = r4 + r0
            android.graphics.Rect r5 = r6.f8643
            int r5 = r5.bottom
            int r5 = r5 + r0
            r1.m9355(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1649.m9493():void");
    }
}
