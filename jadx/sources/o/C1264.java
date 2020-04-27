package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import o.C2745;

/* renamed from: o.ɩɩ  reason: contains not printable characters */
public class C1264 extends CompoundButton {

    /* renamed from: ʖ  reason: contains not printable characters */
    private static final int[] f7112 = {16842912};

    /* renamed from: ι  reason: contains not printable characters */
    private static final Property<C1264, Float> f7113 = new Property<C1264, Float>(Float.class, "thumbPos") {
        /* renamed from: ı  reason: contains not printable characters */
        public final Float get(C1264 r1) {
            return Float.valueOf(r1.f7128);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void set(C1264 r1, Float f) {
            r1.m8113(f.floatValue());
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    ObjectAnimator f7114;

    /* renamed from: ŀ  reason: contains not printable characters */
    private boolean f7115;

    /* renamed from: ł  reason: contains not printable characters */
    private boolean f7116;

    /* renamed from: ſ  reason: contains not printable characters */
    private int f7117;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private PorterDuff.Mode f7118;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private float f7119;

    /* renamed from: ƚ  reason: contains not printable characters */
    private int f7120;

    /* renamed from: ǀ  reason: contains not printable characters */
    private int f7121;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Drawable f7122;

    /* renamed from: ȷ  reason: contains not printable characters */
    private PorterDuff.Mode f7123;

    /* renamed from: ɍ  reason: contains not printable characters */
    private VelocityTracker f7124;

    /* renamed from: ɔ  reason: contains not printable characters */
    private int f7125;

    /* renamed from: ɟ  reason: contains not printable characters */
    private int f7126;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f7127;

    /* renamed from: ɩ  reason: contains not printable characters */
    float f7128;

    /* renamed from: ɪ  reason: contains not printable characters */
    private boolean f7129;

    /* renamed from: ɭ  reason: contains not printable characters */
    private final C1412 f7130;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f7131;

    /* renamed from: ɺ  reason: contains not printable characters */
    private int f7132;

    /* renamed from: ɼ  reason: contains not printable characters */
    private int f7133;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f7134;

    /* renamed from: ɿ  reason: contains not printable characters */
    private CharSequence f7135;

    /* renamed from: ʅ  reason: contains not printable characters */
    private float f7136;

    /* renamed from: ʟ  reason: contains not printable characters */
    private CharSequence f7137;

    /* renamed from: ͻ  reason: contains not printable characters */
    private int f7138;

    /* renamed from: Ι  reason: contains not printable characters */
    private ColorStateList f7139;

    /* renamed from: ϲ  reason: contains not printable characters */
    private ColorStateList f7140;

    /* renamed from: ϳ  reason: contains not printable characters */
    private int f7141;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f7142;

    /* renamed from: Ј  reason: contains not printable characters */
    private int f7143;

    /* renamed from: г  reason: contains not printable characters */
    private int f7144;

    /* renamed from: с  reason: contains not printable characters */
    private final TextPaint f7145;

    /* renamed from: т  reason: contains not printable characters */
    private TransformationMethod f7146;

    /* renamed from: х  reason: contains not printable characters */
    private final Rect f7147;

    /* renamed from: і  reason: contains not printable characters */
    private Drawable f7148;

    /* renamed from: ј  reason: contains not printable characters */
    private Layout f7149;

    /* renamed from: ґ  reason: contains not printable characters */
    private Layout f7150;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private ColorStateList f7151;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f7152;

    /* renamed from: ı  reason: contains not printable characters */
    private static float m8100(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public C1264(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1264(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f154622130969281);
    }

    public C1264(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7139 = null;
        this.f7118 = null;
        this.f7131 = false;
        this.f7142 = false;
        this.f7151 = null;
        this.f7123 = null;
        this.f7127 = false;
        this.f7129 = false;
        this.f7124 = VelocityTracker.obtain();
        this.f7147 = new Rect();
        this.f7145 = new TextPaint(1);
        Resources resources = getResources();
        this.f7145.density = resources.getDisplayMetrics().density;
        C1992 r4 = new C1992(context, context.obtainStyledAttributes(attributeSet, C2745.aux.f12789, i, 0));
        this.f7122 = r4.m10793(C2745.aux.f12803);
        Drawable drawable = this.f7122;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f7148 = r4.m10793(C2745.aux.f12829);
        Drawable drawable2 = this.f7148;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        int i2 = C2745.aux.f12813;
        this.f7137 = r4.f9934.getText(0);
        int i3 = C2745.aux.f12795;
        this.f7135 = r4.f9934.getText(1);
        int i4 = C2745.aux.f12810;
        this.f7115 = r4.f9934.getBoolean(3, true);
        int i5 = C2745.aux.f12823;
        this.f7152 = r4.f9934.getDimensionPixelSize(8, 0);
        int i6 = C2745.aux.f12822;
        this.f7134 = r4.f9934.getDimensionPixelSize(5, 0);
        int i7 = C2745.aux.f12825;
        this.f7144 = r4.f9934.getDimensionPixelSize(6, 0);
        int i8 = C2745.aux.f12809;
        this.f7116 = r4.f9934.getBoolean(4, false);
        ColorStateList r2 = r4.m10792(C2745.aux.f12827);
        if (r2 != null) {
            this.f7139 = r2;
            this.f7131 = true;
        }
        int i9 = C2745.aux.f12839;
        PorterDuff.Mode r22 = C2674.m14214(r4.f9934.getInt(10, -1), (PorterDuff.Mode) null);
        if (this.f7118 != r22) {
            this.f7118 = r22;
            this.f7142 = true;
        }
        if (this.f7131 || this.f7142) {
            m8110();
        }
        ColorStateList r23 = r4.m10792(C2745.aux.f12833);
        if (r23 != null) {
            this.f7151 = r23;
            this.f7127 = true;
        }
        int i10 = C2745.aux.f12828;
        PorterDuff.Mode r0 = C2674.m14214(r4.f9934.getInt(13, -1), (PorterDuff.Mode) null);
        if (this.f7123 != r0) {
            this.f7123 = r0;
            this.f7129 = true;
        }
        if (this.f7127 || this.f7129) {
            m8101();
        }
        int i11 = C2745.aux.f12814;
        int resourceId = r4.f9934.getResourceId(7, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        this.f7130 = new C1412(this);
        this.f7130.m8610(attributeSet, i);
        r4.f9934.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7120 = viewConfiguration.getScaledTouchSlop();
        this.f7125 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTextAppearance(Context context, int i) {
        C1992 r1 = new C1992(context, context.obtainStyledAttributes(i, C2745.aux.f12838));
        ColorStateList r5 = r1.m10792(C2745.aux.f12854);
        if (r5 != null) {
            this.f7140 = r5;
        } else {
            this.f7140 = getTextColors();
        }
        int i2 = C2745.aux.f12857;
        int dimensionPixelSize = r1.f9934.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            if (f != this.f7145.getTextSize()) {
                this.f7145.setTextSize(f);
                requestLayout();
            }
        }
        int i3 = C2745.aux.f12860;
        int i4 = r1.f9934.getInt(1, -1);
        int i5 = C2745.aux.f12853;
        m8104(i4, r1.f9934.getInt(2, -1));
        int i6 = C2745.aux.f12884;
        if (r1.f9934.getBoolean(14, false)) {
            this.f7146 = new C2745.C2746(getContext());
        } else {
            this.f7146 = null;
        }
        r1.f9934.recycle();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8104(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i2);
    }

    public void setSwitchTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.f7145;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f7145;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f7145.setFakeBoldText(false);
        this.f7145.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f7145.getTypeface() != null && !this.f7145.getTypeface().equals(typeface)) || (this.f7145.getTypeface() == null && typeface != null)) {
            this.f7145.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setSwitchPadding(int i) {
        this.f7144 = i;
        requestLayout();
    }

    public void setSwitchMinWidth(int i) {
        this.f7134 = i;
        requestLayout();
    }

    public void setThumbTextPadding(int i) {
        this.f7152 = i;
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7148;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f7148 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C3257Con.m1345(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f7151 = colorStateList;
        this.f7127 = true;
        m8101();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public ColorStateList m8114() {
        return this.f7151;
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f7123 = mode;
        this.f7129 = true;
        m8101();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8101() {
        if (this.f7148 == null) {
            return;
        }
        if (this.f7127 || this.f7129) {
            this.f7148 = C1266.m8158(this.f7148).mutate();
            if (this.f7127) {
                C1266.m8152(this.f7148, this.f7151);
            }
            if (this.f7129) {
                C1266.m8153(this.f7148, this.f7123);
            }
            if (this.f7148.isStateful()) {
                this.f7148.setState(getDrawableState());
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7122;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f7122 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C3257Con.m1345(getContext(), i));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f7139 = colorStateList;
        this.f7131 = true;
        m8110();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public ColorStateList m8115() {
        return this.f7139;
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f7118 = mode;
        this.f7142 = true;
        m8110();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m8110() {
        if (this.f7122 == null) {
            return;
        }
        if (this.f7131 || this.f7142) {
            this.f7122 = C1266.m8158(this.f7122).mutate();
            if (this.f7131) {
                C1266.m8152(this.f7122, this.f7139);
            }
            if (this.f7142) {
                C1266.m8153(this.f7122, this.f7118);
            }
            if (this.f7122.isStateful()) {
                this.f7122.setState(getDrawableState());
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f7116 = z;
        invalidate();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f7137 = charSequence;
        requestLayout();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f7135 = charSequence;
        requestLayout();
    }

    public void setShowText(boolean z) {
        if (this.f7115 != z) {
            this.f7115 = z;
            requestLayout();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f7115) {
            if (this.f7150 == null) {
                this.f7150 = m8109(this.f7137);
            }
            if (this.f7149 == null) {
                this.f7149 = m8109(this.f7135);
            }
        }
        Rect rect = this.f7147;
        Drawable drawable = this.f7122;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f7122.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f7122.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f7133 = Math.max(this.f7115 ? Math.max(this.f7150.getWidth(), this.f7149.getWidth()) + (this.f7152 << 1) : 0, i4);
        Drawable drawable2 = this.f7148;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f7148.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f7122;
        if (drawable3 != null) {
            Rect r4 = C2674.m14213(drawable3);
            i6 = Math.max(i6, r4.left);
            i7 = Math.max(i7, r4.right);
        }
        int max = Math.max(this.f7134, (this.f7133 * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f7121 = max;
        this.f7126 = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f7137 : this.f7135;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private Layout m8109(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f7146;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f7145;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m8108(float f, float f2) {
        if (this.f7122 == null) {
            return false;
        }
        int r0 = m8111();
        this.f7122.getPadding(this.f7147);
        int i = this.f7141;
        int i2 = this.f7120;
        int i3 = i - i2;
        int i4 = (this.f7132 + r0) - i2;
        int i5 = this.f7133 + i4 + this.f7147.left + this.f7147.right;
        int i6 = this.f7120;
        int i7 = i5 + i6;
        int i8 = this.f7143 + i6;
        if (f <= ((float) i4) || f >= ((float) i7) || f2 <= ((float) i3) || f2 >= ((float) i8)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f7124
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x00a0
            r2 = 2
            if (r0 == r1) goto L_0x008c
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008c
            goto L_0x00ba
        L_0x0016:
            int r0 = r6.f7117
            if (r0 == 0) goto L_0x00ba
            if (r0 == r1) goto L_0x0058
            if (r0 == r2) goto L_0x0020
            goto L_0x00ba
        L_0x0020:
            float r7 = r7.getX()
            int r0 = r6.m8106()
            float r2 = r6.f7136
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = (float) r0
            float r0 = r2 / r0
            goto L_0x003e
        L_0x0035:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003e
        L_0x003c:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003e:
            boolean r2 = o.C2373.m12363(r6)
            if (r2 == 0) goto L_0x0045
            float r0 = -r0
        L_0x0045:
            float r2 = r6.f7128
            float r2 = r2 + r0
            float r0 = m8100(r2, r4, r3)
            float r2 = r6.f7128
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0057
            r6.f7136 = r7
            r6.m8113((float) r0)
        L_0x0057:
            return r1
        L_0x0058:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f7136
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f7120
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007e
            float r4 = r6.f7119
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f7120
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ba
        L_0x007e:
            r6.f7117 = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f7136 = r0
            r6.f7119 = r3
            return r1
        L_0x008c:
            int r0 = r6.f7117
            if (r0 != r2) goto L_0x0097
            r6.m8102((android.view.MotionEvent) r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0097:
            r0 = 0
            r6.f7117 = r0
            android.view.VelocityTracker r0 = r6.f7124
            r0.clear()
            goto L_0x00ba
        L_0x00a0:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00ba
            boolean r3 = r6.m8108(r0, r2)
            if (r3 == 0) goto L_0x00ba
            r6.f7117 = r1
            r6.f7136 = r0
            r6.f7119 = r2
        L_0x00ba:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1264.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m8105(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8102(MotionEvent motionEvent) {
        boolean z;
        this.f7117 = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.f7124.computeCurrentVelocity(1000);
            float xVelocity = this.f7124.getXVelocity();
            if (Math.abs(xVelocity) > ((float) this.f7125)) {
                if (!C2373.m12363(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                    z2 = false;
                }
                z = z2;
            } else {
                z = m8112();
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m8105(motionEvent);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m8103(boolean z) {
        this.f7114 = ObjectAnimator.ofFloat(this, f7113, new float[]{z ? 1.0f : 0.0f});
        this.f7114.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f7114.setAutoCancel(true);
        }
        this.f7114.start();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m8107() {
        ObjectAnimator objectAnimator = this.f7114;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private boolean m8112() {
        return this.f7128 > 0.5f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m8113(float f) {
        this.f7128 = f;
        invalidate();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C0293.m4186(this)) {
            m8107();
            m8113(isChecked ? 1.0f : 0.0f);
            return;
        }
        m8103(isChecked);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f7122 != null) {
            Rect rect = this.f7147;
            Drawable drawable = this.f7148;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect r3 = C2674.m14213(this.f7122);
            i5 = Math.max(0, r3.left - rect.left);
            i11 = Math.max(0, r3.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C2373.m12363(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f7121 + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f7121) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f7126;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f7126;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f7126;
            this.f7132 = i7;
            this.f7141 = i9;
            this.f7143 = i8;
            this.f7138 = i6;
        }
        i8 = i10 + i9;
        this.f7132 = i7;
        this.f7141 = i9;
        this.f7143 = i8;
        this.f7138 = i6;
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f7147;
        int i3 = this.f7132;
        int i4 = this.f7141;
        int i5 = this.f7138;
        int i6 = this.f7143;
        int r5 = m8111() + i3;
        Drawable drawable = this.f7122;
        if (drawable != null) {
            rect = C2674.m14213(drawable);
        } else {
            rect = C2674.f12312;
        }
        Drawable drawable2 = this.f7148;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            r5 += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                i = rect.top > rect2.top ? (rect.top - rect2.top) + i4 : i4;
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i2 = i6 - (rect.bottom - rect2.bottom);
                    this.f7148.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f7148.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f7122;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = r5 - rect2.left;
            int i8 = r5 + this.f7133 + rect2.right;
            this.f7122.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C1266.m8151(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f7147;
        Drawable drawable = this.f7148;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f7141;
        int i3 = this.f7143;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f7122;
        if (drawable != null) {
            if (!this.f7116 || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect r5 = C2674.m14213(drawable2);
                drawable2.copyBounds(rect);
                rect.left += r5.left;
                rect.right -= r5.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = m8112() ? this.f7150 : this.f7149;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f7140;
            if (colorStateList != null) {
                this.f7145.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f7145.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public int getCompoundPaddingLeft() {
        if (!C2373.m12363(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f7121;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f7144 : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C2373.m12363(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f7121;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f7144 : compoundPaddingRight;
    }

    /* renamed from: І  reason: contains not printable characters */
    private int m8111() {
        float f;
        if (C2373.m12363(this)) {
            f = 1.0f - this.f7128;
        } else {
            f = this.f7128;
        }
        return (int) ((f * ((float) m8106())) + 0.5f);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private int m8106() {
        Rect rect;
        Drawable drawable = this.f7148;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f7147;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f7122;
        if (drawable2 != null) {
            rect = C2674.m14213(drawable2);
        } else {
            rect = C2674.f12312;
        }
        return ((((this.f7121 - this.f7133) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f7112);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7122;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f7148;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f7122;
        if (drawable != null) {
            C1266.m8150(drawable, f, f2);
        }
        Drawable drawable2 = this.f7148;
        if (drawable2 != null) {
            C1266.m8150(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7122 || drawable == this.f7148;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7122;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7148;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f7114;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f7114.end();
            this.f7114 = null;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f7137 : this.f7135;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0893.m6623((TextView) this, callback));
    }
}
