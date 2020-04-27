package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import o.C0858;

/* renamed from: o.ʇɟ  reason: contains not printable characters */
public class C1616 extends C2963 implements Checkable, C0710 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final int[] f8529 = {16842912};

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final int[] f8530 = {16842911};

    /* renamed from: ɾ  reason: contains not printable characters */
    private static final int[] f8531 = {R.attr.f154422130969261};

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f8532;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f8533;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final C1649 f8534;

    /* renamed from: г  reason: contains not printable characters */
    private If f8535;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f8536;

    /* renamed from: o.ʇɟ$If */
    public interface If {
    }

    public C1616(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1616(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153362130969145);
    }

    public C1616(Context context, AttributeSet attributeSet, int i) {
        super(C1400.m8576(context, attributeSet, i, R.style.f175062131952255), attributeSet, i);
        this.f8536 = false;
        this.f8533 = false;
        this.f8532 = true;
        Context context2 = getContext();
        int[] iArr = C0858.Aux.f5587;
        C3160.m15978(context2, attributeSet, i, R.style.f175062131952255);
        C3160.m15976(context2, attributeSet, iArr, i, R.style.f175062131952255, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.f175062131952255);
        this.f8534 = new C1649(this, attributeSet, i);
        C1649 r12 = this.f8534;
        ColorStateList r13 = super.m15229();
        C0671 r122 = r12.f8634;
        if (r122.f4785.f4804 != r13) {
            r122.f4785.f4804 = r13;
            r122.onStateChange(r122.getState());
        }
        C1649 r123 = this.f8534;
        r123.f8643.set(super.D_(), super.E_(), super.F_(), super.G_());
        r123.m9493();
        C1649 r124 = this.f8534;
        r124.f8638 = C0344.m4473(r124.f8637.getContext(), obtainStyledAttributes, 8);
        if (r124.f8638 == null) {
            r124.f8638 = ColorStateList.valueOf(-1);
        }
        r124.f8646 = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        r124.f8641 = obtainStyledAttributes.getBoolean(0, false);
        r124.f8637.setLongClickable(r124.f8641);
        r124.f8648 = C0344.m4473(r124.f8637.getContext(), obtainStyledAttributes, 3);
        r124.m9492(C0344.m4474(r124.f8637.getContext(), obtainStyledAttributes, 2));
        r124.f8644 = C0344.m4473(r124.f8637.getContext(), obtainStyledAttributes, 4);
        if (r124.f8644 == null) {
            C1616 r132 = r124.f8637;
            r124.f8644 = ColorStateList.valueOf(C0328.m4398(r132.getContext(), (int) R.attr.f150252130968805, r132.getClass().getCanonicalName()));
        }
        ColorStateList r133 = C0344.m4473(r124.f8637.getContext(), obtainStyledAttributes, 1);
        C0671 r1 = r124.f8642;
        r133 = r133 == null ? ColorStateList.valueOf(0) : r133;
        if (r1.f4785.f4804 != r133) {
            r1.f4785.f4804 = r133;
            r1.onStateChange(r1.getState());
        }
        r124.m9494();
        C0671 r11 = r124.f8634;
        float r134 = C2963.f13694.m4057(r124.f8637.f13699);
        if (r11.f4785.f4803 != r134) {
            r11.f4785.f4803 = r134;
            r11.m5521();
        }
        r124.f8642.m5525((float) r124.f8646, r124.f8638);
        super.setBackgroundDrawable(r124.m9495(r124.f8634));
        r124.f8633 = r124.f8637.isClickable() ? r124.m9497() : r124.f8642;
        r124.f8637.setForeground(r124.m9495(r124.f8633));
        obtainStyledAttributes.recycle();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        C1649 r0 = this.f8534;
        accessibilityNodeInfo.setCheckable(r0 != null && r0.f8641);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        C1649 r9 = this.f8534;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (r9.f8636 != null) {
            int i5 = (measuredWidth - r9.f8630) - r9.f8639;
            int i6 = (measuredHeight - r9.f8630) - r9.f8639;
            int i7 = r9.f8630;
            if (C0293.m4156(r9.f8637) == 1) {
                i3 = i5;
                i4 = i7;
            } else {
                i4 = i5;
                i3 = i7;
            }
            r9.f8636.setLayerInset(2, i4, r9.f8630, i3, i6);
        }
    }

    public void setStrokeColor(int i) {
        C1649 r0 = this.f8534;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (r0.f8638 != valueOf) {
            r0.f8638 = valueOf;
            r0.f8642.m5525((float) r0.f8646, r0.f8638);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C1649 r0 = this.f8534;
        if (r0.f8638 != colorStateList) {
            r0.f8638 = colorStateList;
            r0.f8642.m5525((float) r0.f8646, r0.f8638);
        }
    }

    public void setStrokeWidth(int i) {
        C1649 r0 = this.f8534;
        if (i != r0.f8646) {
            r0.f8646 = i;
            r0.f8642.m5525((float) r0.f8646, r0.f8638);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        if (r1 != false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRadius(float r7) {
        /*
            r6 = this;
            super.setRadius(r7)
            o.ʑı r0 = r6.f8534
            o.ƭł r1 = r0.f8635
            o.ƭł$If r2 = new o.ƭł$If
            r2.<init>(r1)
            o.łƭ r1 = new o.łƭ
            r1.<init>(r7)
            r2.f5228 = r1
            o.łƭ r1 = new o.łƭ
            r1.<init>(r7)
            r2.f5227 = r1
            o.łƭ r1 = new o.łƭ
            r1.<init>(r7)
            r2.f5235 = r1
            o.łƭ r1 = new o.łƭ
            r1.<init>(r7)
            r2.f5231 = r1
            o.ƭł r7 = new o.ƭł
            r1 = 0
            r7.<init>(r2, r1)
            r0.m9489(r7)
            android.graphics.drawable.Drawable r7 = r0.f8633
            r7.invalidateSelf()
            boolean r7 = r0.m9490()
            if (r7 != 0) goto L_0x0068
            o.ʇɟ r7 = r0.f8637
            boolean r7 = r7.f13696
            r2 = 1
            if (r7 == 0) goto L_0x0066
            int r7 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r7 < r3) goto L_0x0062
            o.Ɨŧ r7 = r0.f8634
            o.Ɨŧ$if r3 = r7.f4785
            o.ƭł r3 = r3.f4796
            android.graphics.RectF r4 = r7.f4790
            android.graphics.Rect r5 = r7.getBounds()
            r4.set(r5)
            android.graphics.RectF r7 = r7.f4790
            boolean r7 = r3.m6132(r7)
            if (r7 == 0) goto L_0x0062
            r7 = 1
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            if (r7 != 0) goto L_0x0066
            r1 = 1
        L_0x0066:
            if (r1 == 0) goto L_0x006b
        L_0x0068:
            r0.m9493()
        L_0x006b:
            boolean r7 = r0.m9490()
            if (r7 == 0) goto L_0x0074
            r0.m9496()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1616.setRadius(float):void");
    }

    /* renamed from: і  reason: contains not printable characters */
    public final float m9358() {
        return this.f8534.f8634.m5535();
    }

    public void setProgress(float f) {
        C1649 r0 = this.f8534;
        C0671 r1 = r0.f8634;
        if (r1.f4785.f4807 != f) {
            r1.f4785.f4807 = f;
            r1.f4787 = true;
            r1.invalidateSelf();
        }
        if (r0.f8642 != null) {
            C0671 r12 = r0.f8642;
            if (r12.f4785.f4807 != f) {
                r12.f4785.f4807 = f;
                r12.f4787 = true;
                r12.invalidateSelf();
            }
        }
        if (r0.f8640 != null) {
            C0671 r02 = r0.f8640;
            if (r02.f4785.f4807 != f) {
                r02.f4785.f4807 = f;
                r02.f4787 = true;
                r02.invalidateSelf();
            }
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        C1649 r0 = this.f8534;
        r0.f8643.set(i, i2, i3, i4);
        r0.m9493();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9355(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    public final int D_() {
        return this.f8534.f8643.left;
    }

    public final int E_() {
        return this.f8534.f8643.top;
    }

    public final int F_() {
        return this.f8534.f8643.right;
    }

    public final int G_() {
        return this.f8534.f8643.bottom;
    }

    public void setCardBackgroundColor(int i) {
        C1649 r0 = this.f8534;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C0671 r02 = r0.f8634;
        if (r02.f4785.f4804 != valueOf) {
            r02.f4785.f4804 = valueOf;
            r02.onStateChange(r02.getState());
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C0671 r0 = this.f8534.f8634;
        if (r0.f4785.f4804 != colorStateList) {
            r0.f4785.f4804 = colorStateList;
            r0.onStateChange(r0.getState());
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final ColorStateList m9356() {
        return this.f8534.f8634.f4785.f4804;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C1649 r4 = this.f8534;
        Drawable drawable = r4.f8633;
        r4.f8633 = r4.f8637.isClickable() ? r4.m9497() : r4.f8642;
        if (drawable != r4.f8633) {
            Drawable drawable2 = r4.f8633;
            if (Build.VERSION.SDK_INT < 23 || !(r4.f8637.getForeground() instanceof InsetDrawable)) {
                r4.f8637.setForeground(r4.m9495(drawable2));
            } else {
                ((InsetDrawable) r4.f8637.getForeground()).setDrawable(drawable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14514((View) this, this.f8534.f8634);
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C1649 r3 = this.f8534;
        C0671 r0 = r3.f8634;
        float r32 = C2963.f13694.m4057(r3.f8637.f13699);
        if (r0.f4785.f4803 != r32) {
            r0.f4785.f4803 = r32;
            r0.m5521();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f8534.m9496();
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f8534.m9496();
        this.f8534.m9493();
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f8534.m9496();
        this.f8534.m9493();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f8532) {
            if (!this.f8534.f8645) {
                this.f8534.f8645 = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9357(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public boolean isChecked() {
        return this.f8536;
    }

    public void setChecked(boolean z) {
        if (this.f8536 != z) {
            toggle();
        }
    }

    public void setDragged(boolean z) {
        if (this.f8533 != z) {
            this.f8533 = z;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                this.f8534.m9491();
            }
            invalidate();
        }
    }

    public void setCheckable(boolean z) {
        this.f8534.f8641 = z;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        C1649 r0 = this.f8534;
        if (r0 != null && r0.f8641) {
            mergeDrawableStates(onCreateDrawableState, f8530);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f8529);
        }
        if (this.f8533) {
            mergeDrawableStates(onCreateDrawableState, f8531);
        }
        return onCreateDrawableState;
    }

    public void setOnCheckedChangeListener(If ifR) {
        this.f8535 = ifR;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1649 r0 = this.f8534;
        r0.f8644 = colorStateList;
        r0.m9494();
    }

    public void setRippleColorResource(int i) {
        C1649 r0 = this.f8534;
        r0.f8644 = C3257Con.m1342(getContext(), i);
        r0.m9494();
    }

    public void setCheckedIconResource(int i) {
        this.f8534.m9492(C3257Con.m1345(getContext(), i));
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f8534.m9492(drawable);
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C1649 r0 = this.f8534;
        r0.f8648 = colorStateList;
        if (r0.f8647 != null) {
            C1266.m8152(r0.f8647, colorStateList);
        }
    }

    public void setShapeAppearanceModel(C0785 r2) {
        this.f8534.m9489(r2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final float m9359() {
        return super.m15230();
    }

    public void toggle() {
        C1649 r0 = this.f8534;
        if ((r0 != null && r0.f8641) && isEnabled()) {
            this.f8536 = !this.f8536;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                this.f8534.m9491();
            }
        }
    }
}
