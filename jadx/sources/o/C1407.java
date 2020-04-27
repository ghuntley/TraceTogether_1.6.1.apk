package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import o.C0520;
import o.C1429;

/* renamed from: o.ɪԁ  reason: contains not printable characters */
public final class C1407 extends FrameLayout implements C1429.C1430 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int[] f7685 = {16842912};

    /* renamed from: ı  reason: contains not printable characters */
    C2459 f7686;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f7687;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final TextView f7688;

    /* renamed from: ɨ  reason: contains not printable characters */
    private Drawable f7689;

    /* renamed from: ɩ  reason: contains not printable characters */
    C1349 f7690;

    /* renamed from: ɪ  reason: contains not printable characters */
    private ColorStateList f7691;

    /* renamed from: ɹ  reason: contains not printable characters */
    private float f7692;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f7693;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f7694;

    /* renamed from: ι  reason: contains not printable characters */
    ImageView f7695;

    /* renamed from: І  reason: contains not printable characters */
    private float f7696;

    /* renamed from: г  reason: contains not printable characters */
    private Drawable f7697;

    /* renamed from: і  reason: contains not printable characters */
    private float f7698;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private int f7699;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final TextView f7700;

    public final void setShortcut(boolean z, char c) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m8592() {
        return false;
    }

    public C1407(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1407(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1407(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7693 = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(R.layout.f169012131558444, this, true);
        setBackgroundResource(R.drawable.f160912131230867);
        this.f7694 = resources.getDimensionPixelSize(R.dimen.f158052131165290);
        this.f7695 = (ImageView) findViewById(R.id.f165412131362083);
        this.f7688 = (TextView) findViewById(R.id.f167432131362339);
        this.f7700 = (TextView) findViewById(R.id.f165622131362111);
        C0293.m4203((View) this.f7688, 2);
        C0293.m4203((View) this.f7700, 2);
        setFocusable(true);
        float textSize = this.f7688.getTextSize();
        float textSize2 = this.f7700.getTextSize();
        this.f7698 = textSize - textSize2;
        this.f7692 = textSize2 / textSize;
        this.f7696 = textSize / textSize2;
        ImageView imageView = this.f7695;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* JADX WARNING: type inference failed for: r1v6, types: [android.view.ViewParent] */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                    /*
                        r0 = this;
                        o.ɪԁ r1 = o.C1407.this
                        android.widget.ImageView r1 = r1.f7695
                        int r1 = r1.getVisibility()
                        if (r1 != 0) goto L_0x002e
                        o.ɪԁ r1 = o.C1407.this
                        android.widget.ImageView r2 = r1.f7695
                        o.ɪɛ r3 = r1.f7690
                        if (r3 == 0) goto L_0x0014
                        r3 = 1
                        goto L_0x0015
                    L_0x0014:
                        r3 = 0
                    L_0x0015:
                        if (r3 == 0) goto L_0x002e
                        o.ɪɛ r3 = r1.f7690
                        android.widget.ImageView r4 = r1.f7695
                        r5 = 0
                        if (r2 != r4) goto L_0x002b
                        boolean r4 = o.C1315.f7313
                        if (r4 == 0) goto L_0x002b
                        android.widget.ImageView r1 = r1.f7695
                        android.view.ViewParent r1 = r1.getParent()
                        r5 = r1
                        android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
                    L_0x002b:
                        o.C1315.m8286(r3, r2, r5)
                    L_0x002e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.C1407.AnonymousClass5.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
                }
            });
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8589(C2459 r2) {
        CharSequence charSequence;
        this.f7686 = r2;
        setCheckable(r2.isCheckable());
        setChecked(r2.isChecked());
        setEnabled(r2.isEnabled());
        setIcon(r2.getIcon());
        setTitle(r2.getTitle());
        setId(r2.getItemId());
        if (!TextUtils.isEmpty(r2.getContentDescription())) {
            setContentDescription(r2.getContentDescription());
        }
        if (!TextUtils.isEmpty(r2.getTooltipText())) {
            charSequence = r2.getTooltipText();
        } else {
            charSequence = r2.getTitle();
        }
        C2110.m11263(this, charSequence);
        setVisibility(r2.isVisible() ? 0 : 8);
    }

    public final void setItemPosition(int i) {
        this.f7693 = i;
    }

    public final void setShifting(boolean z) {
        if (this.f7687 != z) {
            this.f7687 = z;
            if (this.f7686 != null) {
                setChecked(this.f7686.isChecked());
            }
        }
    }

    public final void setLabelVisibilityMode(int i) {
        if (this.f7699 != i) {
            this.f7699 = i;
            if (this.f7686 != null) {
                setChecked(this.f7686.isChecked());
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2459 m8590() {
        return this.f7686;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f7688.setText(charSequence);
        this.f7700.setText(charSequence);
        C2459 r0 = this.f7686;
        if (r0 == null || TextUtils.isEmpty(r0.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C2459 r02 = this.f7686;
        if (r02 != null && !TextUtils.isEmpty(r02.getTooltipText())) {
            charSequence = this.f7686.getTooltipText();
        }
        C2110.m11263(this, charSequence);
    }

    public final void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public final void setChecked(boolean z) {
        TextView textView = this.f7700;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f7700;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f7688;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f7688;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f7699;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    ImageView imageView = this.f7695;
                    int i2 = this.f7694;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                    layoutParams.topMargin = i2;
                    layoutParams.gravity = 49;
                    imageView.setLayoutParams(layoutParams);
                    TextView textView5 = this.f7700;
                    textView5.setScaleX(1.0f);
                    textView5.setScaleY(1.0f);
                    textView5.setVisibility(0);
                } else {
                    ImageView imageView2 = this.f7695;
                    int i3 = this.f7694;
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView2.getLayoutParams();
                    layoutParams2.topMargin = i3;
                    layoutParams2.gravity = 17;
                    imageView2.setLayoutParams(layoutParams2);
                    TextView textView6 = this.f7700;
                    textView6.setScaleX(0.5f);
                    textView6.setScaleY(0.5f);
                    textView6.setVisibility(4);
                }
                this.f7688.setVisibility(4);
            } else if (i != 1) {
                if (i == 2) {
                    ImageView imageView3 = this.f7695;
                    int i4 = this.f7694;
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) imageView3.getLayoutParams();
                    layoutParams3.topMargin = i4;
                    layoutParams3.gravity = 17;
                    imageView3.setLayoutParams(layoutParams3);
                    this.f7700.setVisibility(8);
                    this.f7688.setVisibility(8);
                }
            } else if (z) {
                ImageView imageView4 = this.f7695;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) imageView4.getLayoutParams();
                layoutParams4.topMargin = (int) (((float) this.f7694) + this.f7698);
                layoutParams4.gravity = 49;
                imageView4.setLayoutParams(layoutParams4);
                TextView textView7 = this.f7700;
                textView7.setScaleX(1.0f);
                textView7.setScaleY(1.0f);
                textView7.setVisibility(0);
                TextView textView8 = this.f7688;
                float f = this.f7692;
                textView8.setScaleX(f);
                textView8.setScaleY(f);
                textView8.setVisibility(4);
            } else {
                ImageView imageView5 = this.f7695;
                int i5 = this.f7694;
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) imageView5.getLayoutParams();
                layoutParams5.topMargin = i5;
                layoutParams5.gravity = 49;
                imageView5.setLayoutParams(layoutParams5);
                TextView textView9 = this.f7700;
                float f2 = this.f7696;
                textView9.setScaleX(f2);
                textView9.setScaleY(f2);
                textView9.setVisibility(4);
                TextView textView10 = this.f7688;
                textView10.setScaleX(1.0f);
                textView10.setScaleY(1.0f);
                textView10.setVisibility(0);
            }
        } else if (this.f7687) {
            if (z) {
                ImageView imageView6 = this.f7695;
                int i6 = this.f7694;
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) imageView6.getLayoutParams();
                layoutParams6.topMargin = i6;
                layoutParams6.gravity = 49;
                imageView6.setLayoutParams(layoutParams6);
                TextView textView11 = this.f7700;
                textView11.setScaleX(1.0f);
                textView11.setScaleY(1.0f);
                textView11.setVisibility(0);
            } else {
                ImageView imageView7 = this.f7695;
                int i7 = this.f7694;
                FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) imageView7.getLayoutParams();
                layoutParams7.topMargin = i7;
                layoutParams7.gravity = 17;
                imageView7.setLayoutParams(layoutParams7);
                TextView textView12 = this.f7700;
                textView12.setScaleX(0.5f);
                textView12.setScaleY(0.5f);
                textView12.setVisibility(4);
            }
            this.f7688.setVisibility(4);
        } else if (z) {
            ImageView imageView8 = this.f7695;
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) imageView8.getLayoutParams();
            layoutParams8.topMargin = (int) (((float) this.f7694) + this.f7698);
            layoutParams8.gravity = 49;
            imageView8.setLayoutParams(layoutParams8);
            TextView textView13 = this.f7700;
            textView13.setScaleX(1.0f);
            textView13.setScaleY(1.0f);
            textView13.setVisibility(0);
            TextView textView14 = this.f7688;
            float f3 = this.f7692;
            textView14.setScaleX(f3);
            textView14.setScaleY(f3);
            textView14.setVisibility(4);
        } else {
            ImageView imageView9 = this.f7695;
            int i8 = this.f7694;
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) imageView9.getLayoutParams();
            layoutParams9.topMargin = i8;
            layoutParams9.gravity = 49;
            imageView9.setLayoutParams(layoutParams9);
            TextView textView15 = this.f7700;
            float f4 = this.f7696;
            textView15.setScaleX(f4);
            textView15.setScaleY(f4);
            textView15.setVisibility(4);
            TextView textView16 = this.f7688;
            textView16.setScaleX(1.0f);
            textView16.setScaleY(1.0f);
            textView16.setVisibility(0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1349 r0 = this.f7690;
        if (r0 != null && r0.isVisible()) {
            CharSequence title = this.f7686.getTitle();
            if (!TextUtils.isEmpty(this.f7686.getContentDescription())) {
                title = this.f7686.getContentDescription();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(title);
            sb.append(", ");
            C1349 r02 = this.f7690;
            Object obj = null;
            if (r02.isVisible()) {
                boolean z = true;
                if (!(r02.f7481.f7495 != -1)) {
                    obj = r02.f7481.f7496;
                } else if (r02.f7481.f7503 > 0 && (context = r02.f7479.get()) != null) {
                    Resources resources = context.getResources();
                    int i3 = r02.f7481.f7503;
                    if (!(r02.f7481.f7495 != -1)) {
                        i = 0;
                    } else {
                        i = r02.f7481.f7495;
                    }
                    Object[] objArr = new Object[1];
                    if (r02.f7481.f7495 == -1) {
                        z = false;
                    }
                    if (!z) {
                        i2 = 0;
                    } else {
                        i2 = r02.f7481.f7495;
                    }
                    objArr[0] = Integer.valueOf(i2);
                    obj = resources.getQuantityString(i3, i, objArr);
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        C0520 r11 = C0520.m4998(accessibilityNodeInfo);
        r11.m5023((Object) C0520.If.m5072(0, 1, this.f7693, 1, false, isSelected()));
        if (isSelected()) {
            r11.m5068(false);
            r11.m5011(C0520.Cif.f4329);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f7688.setEnabled(z);
        this.f7700.setEnabled(z);
        this.f7695.setEnabled(z);
        if (z) {
            C0293.m4208((View) this, C3014.m15447(getContext(), 1002));
        } else {
            C0293.m4208((View) this, (C3014) null);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C2459 r0 = this.f7686;
        if (r0 != null && r0.isCheckable() && this.f7686.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f7685);
        }
        return onCreateDrawableState;
    }

    public final void setIcon(Drawable drawable) {
        if (drawable != this.f7689) {
            this.f7689 = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C1266.m8158(drawable).mutate();
                this.f7697 = drawable;
                ColorStateList colorStateList = this.f7691;
                if (colorStateList != null) {
                    C1266.m8152(this.f7697, colorStateList);
                }
            }
            this.f7695.setImageDrawable(drawable);
        }
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f7691 = colorStateList;
        if (this.f7686 != null && (drawable = this.f7697) != null) {
            C1266.m8152(drawable, this.f7691);
            this.f7697.invalidateSelf();
        }
    }

    public final void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7695.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f7695.setLayoutParams(layoutParams);
    }

    public final void setTextAppearanceInactive(int i) {
        C0893.m6632(this.f7688, i);
        float textSize = this.f7688.getTextSize();
        float textSize2 = this.f7700.getTextSize();
        this.f7698 = textSize - textSize2;
        this.f7692 = textSize2 / textSize;
        this.f7696 = textSize / textSize2;
    }

    public final void setTextAppearanceActive(int i) {
        C0893.m6632(this.f7700, i);
        float textSize = this.f7688.getTextSize();
        float textSize2 = this.f7700.getTextSize();
        this.f7698 = textSize - textSize2;
        this.f7692 = textSize2 / textSize;
        this.f7696 = textSize / textSize2;
    }

    public final void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f7688.setTextColor(colorStateList);
            this.f7700.setTextColor(colorStateList);
        }
    }

    public final void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0651.m5458(getContext(), i));
    }

    public final void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C0293.m4199((View) this, drawable);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.view.ViewParent] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m8591(o.C1349 r4) {
        /*
            r3 = this;
            r3.f7690 = r4
            android.widget.ImageView r4 = r3.f7695
            if (r4 == 0) goto L_0x003e
            o.ɪɛ r0 = r3.f7690
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x003e
            if (r4 == 0) goto L_0x003e
            r3.setClipChildren(r1)
            r3.setClipToPadding(r1)
            o.ɪɛ r0 = r3.f7690
            android.widget.ImageView r1 = r3.f7695
            r2 = 0
            if (r4 != r1) goto L_0x002c
            boolean r1 = o.C1315.f7313
            if (r1 == 0) goto L_0x002c
            android.widget.ImageView r1 = r3.f7695
            android.view.ViewParent r1 = r1.getParent()
            r2 = r1
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
        L_0x002c:
            o.C1315.m8286(r0, r4, r2)
            boolean r1 = o.C1315.f7313
            if (r1 == 0) goto L_0x0037
            r2.setForeground(r0)
            return
        L_0x0037:
            android.view.ViewOverlay r4 = r4.getOverlay()
            r4.add(r0)
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1407.m8591(o.ɪɛ):void");
    }
}
