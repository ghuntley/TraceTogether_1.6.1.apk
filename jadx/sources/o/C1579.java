package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0785;

/* renamed from: o.ʀı  reason: contains not printable characters */
public class C1579 extends C0881 implements Checkable, C0710 {

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final int[] f8409 = {16842912};

    /* renamed from: і  reason: contains not printable characters */
    private static final int[] f8410 = {16842911};

    /* renamed from: ı  reason: contains not printable characters */
    final LinkedHashSet<C1581> f8411;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private PorterDuff.Mode f8412;

    /* renamed from: ǃ  reason: contains not printable characters */
    C1580 f8413;

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f8414;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f8415;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f8416;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f8417;

    /* renamed from: Ι  reason: contains not printable characters */
    public Drawable f8418;

    /* renamed from: ι  reason: contains not printable characters */
    final C1456 f8419;

    /* renamed from: І  reason: contains not printable characters */
    private ColorStateList f8420;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public int f8421;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f8422;

    /* renamed from: o.ʀı$ı  reason: contains not printable characters */
    interface C1580 {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m9267(C1579 r1);
    }

    /* renamed from: o.ʀı$ǃ  reason: contains not printable characters */
    public interface C1581 {
        /* renamed from: ǃ  reason: contains not printable characters */
        void m9268(C1579 r1, boolean z);
    }

    public C1579(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1579(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f153332130969133);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1579(android.content.Context r23, android.util.AttributeSet r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r7 = r24
            r8 = r25
            r9 = 2131952243(0x7f130273, float:1.9540923E38)
            r1 = r23
            android.content.Context r1 = o.C1400.m8576(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f8411 = r1
            r10 = 0
            r0.f8414 = r10
            r0.f8415 = r10
            android.content.Context r11 = r22.getContext()
            int[] r12 = o.C0858.Aux.f5598
            int[] r6 = new int[r10]
            o.C3160.m15978(r11, r7, r8, r9)
            r5 = 2131952243(0x7f130273, float:1.9540923E38)
            r1 = r11
            r2 = r24
            r3 = r12
            r4 = r25
            o.C3160.m15976(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r7, r12, r8, r9)
            r2 = 11
            int r2 = r1.getDimensionPixelSize(r2, r10)
            r0.f8416 = r2
            r2 = -1
            r3 = 14
            int r3 = r1.getInt(r3, r2)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r3 = o.C3198.m16133((int) r3, (android.graphics.PorterDuff.Mode) r4)
            r0.f8412 = r3
            android.content.Context r3 = r22.getContext()
            r4 = 13
            android.content.res.ColorStateList r3 = o.C0344.m4473(r3, r1, r4)
            r0.f8420 = r3
            android.content.Context r3 = r22.getContext()
            r4 = 9
            android.graphics.drawable.Drawable r3 = o.C0344.m4474(r3, r1, r4)
            r0.f8418 = r3
            r3 = 1
            r4 = 10
            int r4 = r1.getInteger(r4, r3)
            r0.f8422 = r4
            r4 = 12
            int r4 = r1.getDimensionPixelSize(r4, r10)
            r0.f8421 = r4
            o.łƭ r4 = new o.łƭ
            r5 = 0
            r4.<init>(r5)
            o.ƭł$If r4 = o.C0785.m6131(r11, r7, r8, r9, r4)
            o.ƭł r5 = new o.ƭł
            r5.<init>(r4, r10)
            o.ɵı r4 = new o.ɵı
            r4.<init>(r0, r5)
            r0.f8419 = r4
            o.ɵı r4 = r0.f8419
            int r5 = r1.getDimensionPixelOffset(r10, r10)
            r4.f7823 = r5
            int r5 = r1.getDimensionPixelOffset(r3, r10)
            r4.f7826 = r5
            r5 = 2
            int r6 = r1.getDimensionPixelOffset(r5, r10)
            r4.f7839 = r6
            r6 = 3
            int r7 = r1.getDimensionPixelOffset(r6, r10)
            r4.f7836 = r7
            r7 = 7
            boolean r8 = r1.hasValue(r7)
            if (r8 == 0) goto L_0x00ea
            int r7 = r1.getDimensionPixelSize(r7, r2)
            r4.f7838 = r7
            o.ƭł r7 = r4.f7834
            int r8 = r4.f7838
            float r8 = (float) r8
            o.ƭł$If r9 = new o.ƭł$If
            r9.<init>(r7)
            o.łƭ r7 = new o.łƭ
            r7.<init>(r8)
            r9.f5228 = r7
            o.łƭ r7 = new o.łƭ
            r7.<init>(r8)
            r9.f5227 = r7
            o.łƭ r7 = new o.łƭ
            r7.<init>(r8)
            r9.f5235 = r7
            o.łƭ r7 = new o.łƭ
            r7.<init>(r8)
            r9.f5231 = r7
            o.ƭł r7 = new o.ƭł
            r7.<init>(r9, r10)
            r4.f7834 = r7
            r4.m8719((o.C0785) r7)
            r4.f7832 = r3
        L_0x00ea:
            r7 = 19
            int r7 = r1.getDimensionPixelSize(r7, r10)
            r4.f7825 = r7
            r7 = 6
            int r7 = r1.getInt(r7, r2)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r7 = o.C3198.m16133((int) r7, (android.graphics.PorterDuff.Mode) r8)
            r4.f7830 = r7
            o.ʀı r7 = r4.f7835
            android.content.Context r7 = r7.getContext()
            r8 = 5
            android.content.res.ColorStateList r7 = o.C0344.m4473(r7, r1, r8)
            r4.f7840 = r7
            o.ʀı r7 = r4.f7835
            android.content.Context r7 = r7.getContext()
            r8 = 18
            android.content.res.ColorStateList r7 = o.C0344.m4473(r7, r1, r8)
            r4.f7828 = r7
            o.ʀı r7 = r4.f7835
            android.content.Context r7 = r7.getContext()
            r8 = 15
            android.content.res.ColorStateList r7 = o.C0344.m4473(r7, r1, r8)
            r4.f7831 = r7
            r7 = 4
            boolean r7 = r1.getBoolean(r7, r10)
            r4.f7824 = r7
            r7 = 8
            int r7 = r1.getDimensionPixelSize(r7, r10)
            o.ʀı r8 = r4.f7835
            int r8 = o.C0293.m4184(r8)
            o.ʀı r9 = r4.f7835
            int r9 = r9.getPaddingTop()
            o.ʀı r11 = r4.f7835
            int r11 = o.C0293.m4173(r11)
            o.ʀı r12 = r4.f7835
            int r12 = r12.getPaddingBottom()
            o.ʀı r13 = r4.f7835
            o.Ɨŧ r14 = new o.Ɨŧ
            o.ƭł r15 = r4.f7834
            r14.<init>((o.C0785) r15)
            o.ʀı r15 = r4.f7835
            android.content.Context r15 = r15.getContext()
            o.Ɨŧ$if r6 = r14.f4785
            o.іյ r3 = new o.іյ
            r3.<init>(r15)
            r6.f4812 = r3
            r14.m5521()
            android.content.res.ColorStateList r3 = r4.f7840
            o.C1266.m8152((android.graphics.drawable.Drawable) r14, (android.content.res.ColorStateList) r3)
            android.graphics.PorterDuff$Mode r3 = r4.f7830
            if (r3 == 0) goto L_0x0176
            android.graphics.PorterDuff$Mode r3 = r4.f7830
            o.C1266.m8153((android.graphics.drawable.Drawable) r14, (android.graphics.PorterDuff.Mode) r3)
        L_0x0176:
            int r3 = r4.f7825
            float r3 = (float) r3
            android.content.res.ColorStateList r6 = r4.f7828
            r14.m5525(r3, r6)
            o.Ɨŧ r3 = new o.Ɨŧ
            o.ƭł r6 = r4.f7834
            r3.<init>((o.C0785) r6)
            r3.setTint(r10)
            int r6 = r4.f7825
            float r6 = (float) r6
            boolean r15 = r4.f7829
            if (r15 == 0) goto L_0x01a5
            o.ʀı r15 = r4.f7835
            android.content.Context r10 = r15.getContext()
            r5 = 2130968822(0x7f0400f6, float:1.7546308E38)
            java.lang.Class r15 = r15.getClass()
            java.lang.String r15 = r15.getCanonicalName()
            int r10 = o.C0328.m4398((android.content.Context) r10, (int) r5, (java.lang.String) r15)
            goto L_0x01a6
        L_0x01a5:
            r10 = 0
        L_0x01a6:
            r3.m5532((float) r6, (int) r10)
            boolean r5 = o.C1456.f7822
            if (r5 == 0) goto L_0x01f5
            o.Ɨŧ r5 = new o.Ɨŧ
            o.ƭł r6 = r4.f7834
            r5.<init>((o.C0785) r6)
            r4.f7827 = r5
            android.graphics.drawable.Drawable r5 = r4.f7827
            o.C1266.m8148(r5, r2)
            android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r5 = r4.f7831
            android.content.res.ColorStateList r5 = o.C0410.m4695(r5)
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            r10 = 2
            android.graphics.drawable.Drawable[] r10 = new android.graphics.drawable.Drawable[r10]
            r15 = 0
            r10[r15] = r3
            r3 = 1
            r10[r3] = r14
            r6.<init>(r10)
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            int r10 = r4.f7823
            int r14 = r4.f7839
            int r15 = r4.f7826
            int r0 = r4.f7836
            r16 = r3
            r17 = r6
            r18 = r10
            r19 = r14
            r20 = r15
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21)
            android.graphics.drawable.Drawable r0 = r4.f7827
            r2.<init>(r5, r3, r0)
            r4.f7837 = r2
            android.graphics.drawable.LayerDrawable r0 = r4.f7837
            r3 = 1
            goto L_0x023a
        L_0x01f5:
            o.ıΣ r0 = new o.ıΣ
            o.ƭł r2 = r4.f7834
            r0.<init>((o.C0785) r2)
            r4.f7827 = r0
            android.graphics.drawable.Drawable r0 = r4.f7827
            android.content.res.ColorStateList r2 = r4.f7831
            android.content.res.ColorStateList r2 = o.C0410.m4695(r2)
            o.C1266.m8152((android.graphics.drawable.Drawable) r0, (android.content.res.ColorStateList) r2)
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r2 = 3
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
            r5 = 0
            r2[r5] = r3
            r3 = 1
            r2[r3] = r14
            android.graphics.drawable.Drawable r5 = r4.f7827
            r6 = 2
            r2[r6] = r5
            r0.<init>(r2)
            r4.f7837 = r0
            android.graphics.drawable.LayerDrawable r0 = r4.f7837
            android.graphics.drawable.InsetDrawable r2 = new android.graphics.drawable.InsetDrawable
            int r5 = r4.f7823
            int r6 = r4.f7839
            int r10 = r4.f7826
            int r14 = r4.f7836
            r16 = r2
            r17 = r0
            r18 = r5
            r19 = r6
            r20 = r10
            r21 = r14
            r16.<init>(r17, r18, r19, r20, r21)
            r0 = r2
        L_0x023a:
            super.setBackgroundDrawable(r0)
            r15 = 0
            o.Ɨŧ r0 = r4.m8718((boolean) r15)
            if (r0 == 0) goto L_0x0254
            float r2 = (float) r7
            o.Ɨŧ$if r5 = r0.f4785
            float r5 = r5.f4803
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0254
            o.Ɨŧ$if r5 = r0.f4785
            r5.f4803 = r2
            r0.m5521()
        L_0x0254:
            o.ʀı r0 = r4.f7835
            int r2 = r4.f7823
            int r8 = r8 + r2
            int r2 = r4.f7839
            int r9 = r9 + r2
            int r2 = r4.f7826
            int r11 = r11 + r2
            int r2 = r4.f7836
            int r12 = r12 + r2
            o.C0293.m4178(r0, r8, r9, r11, r12)
            r1.recycle()
            r0 = r22
            int r1 = r0.f8416
            r0.setCompoundDrawablePadding(r1)
            android.graphics.drawable.Drawable r1 = r0.f8418
            if (r1 == 0) goto L_0x0274
            r15 = 1
        L_0x0274:
            r0.m9264(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1579.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(m9262());
        C1456 r0 = this.f8419;
        accessibilityNodeInfo.setCheckable(r0 != null && r0.f7824);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(m9262());
        accessibilityEvent.setChecked(isChecked());
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C3257Con.m1345(getContext(), i) : null);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1456 r3;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (r3 = this.f8419) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            if (r3.f7827 != null) {
                r3.f7827.setBounds(r3.f7823, r3.f7839, i6 - r3.f7826, i5 - r3.f7836);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m9263();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m9263();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14514((View) this, this.f8419.m8718(false));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C0671 r02 = this.f8419.m8718(false);
            if (r02.f4785.f4803 != f) {
                r02.f4785.f4803 = f;
                r02.m5521();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m9263() {
        if (this.f8418 != null && getLayout() != null) {
            int i = this.f8422;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f8417 = 0;
                m9264(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f8421;
            if (i2 == 0) {
                i2 = this.f8418.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C0293.m4173(this)) - i2) - this.f8416) - C0293.m4184(this)) / 2;
            boolean z2 = C0293.m4156(this) == 1;
            if (this.f8422 != 4) {
                z = false;
            }
            if (z2 != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f8417 != measuredWidth) {
                this.f8417 = measuredWidth;
                m9264(false);
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.f8416 != i) {
            this.f8416 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f8421 != i) {
            this.f8421 = i;
            m9264(true);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f8418 != drawable) {
            this.f8418 = drawable;
            m9264(true);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C3257Con.m1345(getContext(), i) : null);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f8420 != colorStateList) {
            this.f8420 = colorStateList;
            m9264(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C3257Con.m1342(getContext(), i));
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f8412 != mode) {
            this.f8412 = mode;
            m9264(false);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m9264(boolean z) {
        Drawable drawable = this.f8418;
        boolean z2 = false;
        if (drawable != null) {
            this.f8418 = C1266.m8158(drawable).mutate();
            C1266.m8152(this.f8418, this.f8420);
            PorterDuff.Mode mode = this.f8412;
            if (mode != null) {
                C1266.m8153(this.f8418, mode);
            }
            int i = this.f8421;
            if (i == 0) {
                i = this.f8418.getIntrinsicWidth();
            }
            int i2 = this.f8421;
            if (i2 == 0) {
                i2 = this.f8418.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f8418;
            int i3 = this.f8417;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f8422;
        boolean z3 = i4 == 1 || i4 == 2;
        if (!z) {
            Drawable[] r7 = C0893.m6630((TextView) this);
            Drawable drawable3 = r7[0];
            Drawable drawable4 = r7[2];
            if ((z3 && drawable3 != this.f8418) || (!z3 && drawable4 != this.f8418)) {
                z2 = true;
            }
            if (!z2) {
                return;
            }
            if (z3) {
                C0893.m6621(this, this.f8418, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                C0893.m6621(this, (Drawable) null, (Drawable) null, this.f8418, (Drawable) null);
            }
        } else if (z3) {
            C0893.m6621(this, this.f8418, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            C0893.m6621(this, (Drawable) null, (Drawable) null, this.f8418, (Drawable) null);
        }
    }

    public void setIconGravity(int i) {
        if (this.f8422 != i) {
            this.f8422 = i;
            m9263();
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C1456 r0 = this.f8419;
        if (r0 != null && r0.f7824) {
            mergeDrawableStates(onCreateDrawableState, f8410);
        }
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f8409);
        }
        return onCreateDrawableState;
    }

    public boolean isChecked() {
        return this.f8414;
    }

    public void toggle() {
        setChecked(!this.f8414);
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setPressed(boolean z) {
        C1580 r0 = this.f8413;
        if (r0 != null) {
            r0.m9267(this);
        }
        super.setPressed(z);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private String m9262() {
        C1456 r0 = this.f8419;
        return (r0 != null && r0.f7824 ? CompoundButton.class : Button.class).getName();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C1456 r02 = this.f8419;
            if (r02.f7840 != colorStateList) {
                r02.f7840 = colorStateList;
                if (r02.m8718(false) != null) {
                    C1266.m8152((Drawable) r02.m8718(false), r02.f7840);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            return this.f8419.f7840;
        }
        return super.getSupportBackgroundTintList();
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C1456 r02 = this.f8419;
            if (r02.f7830 != mode) {
                r02.f7830 = mode;
                if (r02.m8718(false) != null && r02.f7830 != null) {
                    C1266.m8153((Drawable) r02.m8718(false), r02.f7830);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            return this.f8419.f7830;
        }
        return super.getSupportBackgroundTintMode();
    }

    public void setBackgroundColor(int i) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C1456 r02 = this.f8419;
            if (r02.m8718(false) != null) {
                r02.m8718(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            if (drawable != getBackground()) {
                C1456 r02 = this.f8419;
                r02.f7833 = true;
                r02.f7835.setSupportBackgroundTintList(r02.f7840);
                r02.f7835.setSupportBackgroundTintMode(r02.f7830);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C1456 r02 = this.f8419;
            if (r02.f7831 != colorStateList) {
                r02.f7831 = colorStateList;
                if (C1456.f7822 && (r02.f7835.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) r02.f7835.getBackground()).setColor(C0410.m4695(colorStateList));
                } else if (!C1456.f7822 && (r02.f7835.getBackground() instanceof C0385)) {
                    ((C0385) r02.f7835.getBackground()).setTintList(C0410.m4695(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            setRippleColor(C3257Con.m1342(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C1456 r02 = this.f8419;
            if (r02.f7828 != colorStateList) {
                r02.f7828 = colorStateList;
                r02.m8720();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            setStrokeColor(C3257Con.m1342(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C1456 r02 = this.f8419;
            if (r02.f7825 != i) {
                r02.f7825 = i;
                r02.m8720();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m9266() {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            return this.f8419.f7825;
        }
        return 0;
    }

    public void setCornerRadius(int i) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C1456 r02 = this.f8419;
            if (!r02.f7832 || r02.f7838 != i) {
                r02.f7838 = i;
                r02.f7832 = true;
                float f = (float) i;
                C0785.If ifR = new C0785.If(r02.f7834);
                ifR.f5228 = new C0531(f);
                ifR.f5227 = new C0531(f);
                ifR.f5235 = new C0531(f);
                ifR.f5231 = new C0531(f);
                C0785 r5 = new C0785(ifR, (byte) 0);
                r02.f7834 = r5;
                r02.m8719(r5);
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setChecked(boolean z) {
        C1456 r0 = this.f8419;
        if ((r0 != null && r0.f7824) && isEnabled() && this.f8414 != z) {
            this.f8414 = z;
            refreshDrawableState();
            if (!this.f8415) {
                this.f8415 = true;
                Iterator<C1581> it = this.f8411.iterator();
                while (it.hasNext()) {
                    it.next().m9268(this, this.f8414);
                }
                this.f8415 = false;
            }
        }
    }

    public void setCheckable(boolean z) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            this.f8419.f7824 = z;
        }
    }

    public void setShapeAppearanceModel(C0785 r2) {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            C1456 r02 = this.f8419;
            r02.f7834 = r2;
            r02.m8719(r2);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0785 m9265() {
        C1456 r0 = this.f8419;
        if (r0 != null && !r0.f7833) {
            return this.f8419.f7834;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }
}
