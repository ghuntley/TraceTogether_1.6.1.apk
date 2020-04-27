package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import o.C1841;
import o.C2771;
import o.C3616p;

/* renamed from: o.ԍ  reason: contains not printable characters */
public class C2963 extends FrameLayout {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final int[] f13693 = {16842801};

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C3616p.C0270 f13694;

    /* renamed from: ı  reason: contains not printable characters */
    int f13695;

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f13696;

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean f13697;

    /* renamed from: ι  reason: contains not printable characters */
    int f13698;

    /* renamed from: І  reason: contains not printable characters */
    public final C1841.C1842 f13699;

    /* renamed from: і  reason: contains not printable characters */
    final Rect f13700;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final Rect f13701;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f13694 = new C2932();
        } else if (Build.VERSION.SDK_INT >= 17) {
            f13694 = new C3218();
        } else {
            f13694 = new C0346();
        }
        f13694.m4052();
    }

    public C2963(Context context) {
        this(context, (AttributeSet) null);
    }

    public C2963(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f149352130968712);
    }

    public C2963(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        this.f13701 = new Rect();
        this.f13700 = new Rect();
        this.f13699 = new C1841.C1842() {

            /* renamed from: ı  reason: contains not printable characters */
            private Drawable f13702;

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m15234(Drawable drawable) {
                this.f13702 = drawable;
                C2963.this.setBackgroundDrawable(drawable);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final boolean m15235() {
                return C2963.this.f13697;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final boolean m15237() {
                return C2963.this.f13696;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m15233(int i, int i2, int i3, int i4) {
                C2963.this.f13700.set(i, i2, i3, i4);
                C2963 r0 = C2963.this;
                C2963.super.setPadding(i + r0.f13701.left, i2 + C2963.this.f13701.top, i3 + C2963.this.f13701.right, i4 + C2963.this.f13701.bottom);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m15232(int i, int i2) {
                if (i > C2963.this.f13698) {
                    C2963.super.setMinimumWidth(i);
                }
                if (i2 > C2963.this.f13695) {
                    C2963.super.setMinimumHeight(i2);
                }
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final Drawable m15236() {
                return this.f13702;
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final View m15231() {
                return C2963.this;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2771.C2773.f13129, i, R.style.f173402131951841);
        if (obtainStyledAttributes.hasValue(C2771.C2773.f13132)) {
            valueOf = obtainStyledAttributes.getColorStateList(C2771.C2773.f13132);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f13693);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                getResources();
                i2 = -1;
            } else {
                getResources();
                i2 = -12434878;
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C2771.C2773.f13136, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C2771.C2773.f13139, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C2771.C2773.f13137, 0.0f);
        this.f13697 = obtainStyledAttributes.getBoolean(C2771.C2773.f13133, false);
        this.f13696 = obtainStyledAttributes.getBoolean(C2771.C2773.f13128, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2771.C2773.f13138, 0);
        this.f13701.left = obtainStyledAttributes.getDimensionPixelSize(C2771.C2773.f13130, dimensionPixelSize);
        this.f13701.top = obtainStyledAttributes.getDimensionPixelSize(C2771.C2773.f13131, dimensionPixelSize);
        this.f13701.right = obtainStyledAttributes.getDimensionPixelSize(C2771.C2773.f13140, dimensionPixelSize);
        this.f13701.bottom = obtainStyledAttributes.getDimensionPixelSize(C2771.C2773.f13134, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f13698 = obtainStyledAttributes.getDimensionPixelSize(C2771.C2773.f13135, 0);
        this.f13695 = obtainStyledAttributes.getDimensionPixelSize(C2771.C2773.f13127, 0);
        obtainStyledAttributes.recycle();
        f13694.m4059(this.f13699, context, colorStateList, dimension, dimension2, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f13697 != z) {
            this.f13697 = z;
            f13694.m4062(this.f13699);
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f13701.set(i, i2, i3, i4);
        f13694.m4056(this.f13699);
    }

    public void onMeasure(int i, int i2) {
        if (!(f13694 instanceof C2932)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f13694.m4060(this.f13699)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f13694.m4054(this.f13699)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMinimumWidth(int i) {
        this.f13698 = i;
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        this.f13695 = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        f13694.m4053(this.f13699, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f13694.m4053(this.f13699, colorStateList);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public ColorStateList m15229() {
        return f13694.m4050(this.f13699);
    }

    public int D_() {
        return this.f13701.left;
    }

    public int F_() {
        return this.f13701.right;
    }

    public int E_() {
        return this.f13701.top;
    }

    public int G_() {
        return this.f13701.bottom;
    }

    public void setRadius(float f) {
        f13694.m4055(this.f13699, f);
    }

    /* renamed from: і  reason: contains not printable characters */
    public float m15230() {
        return f13694.m4051(this.f13699);
    }

    public void setCardElevation(float f) {
        f13694.m4058(this.f13699, f);
    }

    public void setMaxCardElevation(float f) {
        f13694.m4049(this.f13699, f);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f13696) {
            this.f13696 = z;
            f13694.m4061(this.f13699);
        }
    }
}
