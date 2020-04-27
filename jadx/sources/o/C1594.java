package o;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import o.C0520;
import o.C0785;
import o.C0858;
import o.C1789;

/* renamed from: o.ʁı  reason: contains not printable characters */
public final class C1594 extends C1905 implements C1789.C1790, C0710 {

    /* renamed from: ı  reason: contains not printable characters */
    static final Rect f8446 = new Rect();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final int[] f8447 = {16842911};

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final int[] f8448 = {16842913};

    /* renamed from: ŀ  reason: contains not printable characters */
    private final C0413 f8449;

    /* renamed from: ł  reason: contains not printable characters */
    private final Rect f8450;

    /* renamed from: ǃ  reason: contains not printable characters */
    CompoundButton.OnCheckedChangeListener f8451;

    /* renamed from: ȷ  reason: contains not printable characters */
    private boolean f8452;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f8453;

    /* renamed from: ɩ  reason: contains not printable characters */
    boolean f8454;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f8455;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f8456;

    /* renamed from: ɾ  reason: contains not printable characters */
    private boolean f8457;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final RectF f8458;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final If f8459;

    /* renamed from: Ι  reason: contains not printable characters */
    C1789 f8460;

    /* renamed from: ι  reason: contains not printable characters */
    View.OnClickListener f8461;

    /* renamed from: І  reason: contains not printable characters */
    private RippleDrawable f8462;

    /* renamed from: і  reason: contains not printable characters */
    private InsetDrawable f8463;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f8464;

    public final void setBackgroundColor(int i) {
    }

    public final void setBackgroundResource(int i) {
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public final void setHideMotionSpec(C1091 r1) {
    }

    public final void setShowMotionSpec(C1091 r1) {
    }

    public C1594(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1594(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f150072130968785);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1594(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        int resourceId2;
        int resourceId3;
        ColorStateList colorStateList;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f8450 = new Rect();
        this.f8458 = new RectF();
        this.f8449 = new C0413() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m9296(int i) {
            }

            /* renamed from: ı  reason: contains not printable characters */
            public final void m9295(Typeface typeface, boolean z) {
                CharSequence charSequence;
                C1594 r1 = C1594.this;
                if (r1.f8460.f9190) {
                    charSequence = C1594.this.f8460.f9149;
                } else {
                    charSequence = C1594.this.getText();
                }
                r1.setText(charSequence);
                C1594.this.requestLayout();
                C1594.this.invalidate();
            }
        };
        if (attributeSet2 != null) {
            attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet2.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet2.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                attributeSet2.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
            } else {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
        }
        C1789 r12 = new C1789(context2, attributeSet2, i2);
        Context context3 = r12.f9148;
        int[] iArr = C0858.Aux.f5594;
        C3160.m15978(context3, attributeSet2, i2, R.style.f175072131952257);
        C3160.m15976(context3, attributeSet, iArr, i, R.style.f175072131952257, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet2, iArr, i2, R.style.f175072131952257);
        r12.f9188 = obtainStyledAttributes.hasValue(35);
        ColorStateList r2 = C0344.m4473(r12.f9148, obtainStyledAttributes, 22);
        if (r12.f9164 != r2) {
            r12.f9164 = r2;
            r12.onStateChange(r12.getState());
        }
        ColorStateList r22 = C0344.m4473(r12.f9148, obtainStyledAttributes, 9);
        if (r12.f9141 != r22) {
            r12.f9141 = r22;
            r12.onStateChange(r12.getState());
        }
        r12.m9944(obtainStyledAttributes.getDimension(17, 0.0f));
        if (obtainStyledAttributes.hasValue(10)) {
            float dimension = obtainStyledAttributes.getDimension(10, 0.0f);
            if (r12.f9182 != dimension) {
                r12.f9182 = dimension;
                C0785.If ifR = new C0785.If(r12.f4785.f4796);
                ifR.f5228 = new C0531(dimension);
                ifR.f5227 = new C0531(dimension);
                ifR.f5235 = new C0531(dimension);
                ifR.f5231 = new C0531(dimension);
                r12.setShapeAppearanceModel(new C0785(ifR, (byte) 0));
            }
        }
        r12.m9928(C0344.m4473(r12.f9148, obtainStyledAttributes, 20));
        r12.m9927(obtainStyledAttributes.getDimension(21, 0.0f));
        ColorStateList r23 = C0344.m4473(r12.f9148, obtainStyledAttributes, 34);
        C0303 r5 = null;
        if (r12.f9153 != r23) {
            r12.f9153 = r23;
            if (r12.f9161) {
                colorStateList = C0410.m4695(r12.f9153);
            } else {
                colorStateList = null;
            }
            r12.f9162 = colorStateList;
            r12.onStateChange(r12.getState());
        }
        r12.m9929(obtainStyledAttributes.getText(4));
        Context context4 = r12.f9148;
        if (obtainStyledAttributes.hasValue(0) && (resourceId3 = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            r5 = new C0303(context4, resourceId3);
        }
        r12.f9169.m16030(r5, r12.f9148);
        int i3 = obtainStyledAttributes.getInt(2, 0);
        if (i3 == 1) {
            r12.f9193 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            r12.f9193 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            r12.f9193 = TextUtils.TruncateAt.END;
        }
        r12.m9949(obtainStyledAttributes.getBoolean(16, false));
        if (!(attributeSet2 == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            r12.m9949(obtainStyledAttributes.getBoolean(13, false));
        }
        r12.m9941(C0344.m4474(r12.f9148, obtainStyledAttributes, 12));
        if (obtainStyledAttributes.hasValue(15)) {
            r12.m9947(C0344.m4473(r12.f9148, obtainStyledAttributes, 15));
        }
        r12.m9933(obtainStyledAttributes.getDimension(14, 0.0f));
        r12.m9930(obtainStyledAttributes.getBoolean(29, false));
        if (!(attributeSet2 == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            r12.m9930(obtainStyledAttributes.getBoolean(24, false));
        }
        r12.m9936(C0344.m4474(r12.f9148, obtainStyledAttributes, 23));
        r12.m9934(C0344.m4473(r12.f9148, obtainStyledAttributes, 28));
        r12.m9940(obtainStyledAttributes.getDimension(26, 0.0f));
        r12.m9937(obtainStyledAttributes.getBoolean(5, false));
        r12.m9945(obtainStyledAttributes.getBoolean(8, false));
        if (!(attributeSet2 == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet2.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            r12.m9945(obtainStyledAttributes.getBoolean(7, false));
        }
        r12.m9948(C0344.m4474(r12.f9148, obtainStyledAttributes, 6));
        Context context5 = r12.f9148;
        if (obtainStyledAttributes.hasValue(37) && (resourceId2 = obtainStyledAttributes.getResourceId(37, 0)) != 0) {
            C1091.m7459(context5, resourceId2);
        }
        Context context6 = r12.f9148;
        if (obtainStyledAttributes.hasValue(31) && (resourceId = obtainStyledAttributes.getResourceId(31, 0)) != 0) {
            C1091.m7459(context6, resourceId);
        }
        r12.m9946(obtainStyledAttributes.getDimension(19, 0.0f));
        r12.m9942(obtainStyledAttributes.getDimension(33, 0.0f));
        r12.m9951(obtainStyledAttributes.getDimension(32, 0.0f));
        r12.m9950(obtainStyledAttributes.getDimension(39, 0.0f));
        r12.m9932(obtainStyledAttributes.getDimension(38, 0.0f));
        r12.m9952(obtainStyledAttributes.getDimension(27, 0.0f));
        r12.m9943(obtainStyledAttributes.getDimension(25, 0.0f));
        r12.m9938(obtainStyledAttributes.getDimension(11, 0.0f));
        r12.f9178 = obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE);
        obtainStyledAttributes.recycle();
        int[] iArr2 = C0858.Aux.f5594;
        C3160.m15978(context2, attributeSet2, i2, R.style.f175072131952257);
        C3160.m15976(context, attributeSet, iArr2, i, R.style.f175072131952257, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, R.style.f175072131952257);
        this.f8457 = obtainStyledAttributes2.getBoolean(30, false);
        this.f8464 = (int) Math.ceil((double) obtainStyledAttributes2.getDimension(18, (float) Math.ceil((double) TypedValue.applyDimension(1, 48.0f, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes2.recycle();
        setChipDrawable(r12);
        float r1 = C0293.m4188(this);
        if (r12.f4785.f4803 != r1) {
            r12.f4785.f4803 = r1;
            r12.m5521();
        }
        int[] iArr3 = C0858.Aux.f5594;
        C3160.m15978(context2, attributeSet2, i2, R.style.f175072131952257);
        C3160.m15976(context, attributeSet, iArr3, i, R.style.f175072131952257, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet2, iArr3, i2, R.style.f175072131952257);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C0344.m4473(context2, obtainStyledAttributes3, 1));
        }
        boolean hasValue = obtainStyledAttributes3.hasValue(35);
        obtainStyledAttributes3.recycle();
        this.f8459 = new If(this);
        m9289();
        if (!hasValue && Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider() {
                @TargetApi(21)
                public final void getOutline(View view, Outline outline) {
                    if (C1594.this.f8460 != null) {
                        C1594.this.f8460.getOutline(outline);
                    } else {
                        outline.setAlpha(0.0f);
                    }
                }
            });
        }
        setChecked(this.f8456);
        setText(r12.f9149);
        setEllipsize(r12.f9193);
        setIncludeFontPadding(false);
        m9285();
        if (!this.f8460.f9190) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m9286();
        if (this.f8457) {
            setMinHeight(this.f8464);
        }
        this.f8455 = C0293.m4156(this);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2745.m14514((View) this, (C0671) this.f8460);
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        C1789 r0 = this.f8460;
        if (r0 != null && r0.f4785.f4803 != f) {
            r0.f4785.f4803 = f;
            r0.m5521();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1789 r0 = this.f8460;
        boolean z = true;
        int i3 = 0;
        if ((r0 != null && r0.f9163) || isClickable()) {
            C1789 r02 = this.f8460;
            accessibilityNodeInfo.setClassName(r02 != null && r02.f9163 ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        C1789 r03 = this.f8460;
        if (r03 == null || !r03.f9163) {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C1862) {
            C1862 r04 = (C1862) getParent();
            C0520 r11 = C0520.m4998(accessibilityNodeInfo);
            if (r04.m15301()) {
                int i4 = 0;
                while (true) {
                    if (i3 >= r04.getChildCount()) {
                        break;
                    }
                    if (r04.getChildAt(i3) instanceof C1594) {
                        if (((C1594) r04.getChildAt(i3)) == this) {
                            i = i4;
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
            }
            i = -1;
            Object tag = getTag(R.id.f167192131362305);
            if (!(tag instanceof Integer)) {
                i2 = -1;
            } else {
                i2 = ((Integer) tag).intValue();
            }
            r11.m5023((Object) C0520.If.m5072(i2, 1, i, 1, false, isChecked()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r3 != false) goto L_0x005d;
     */
    /* renamed from: ɹ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9286() {
        /*
            r7 = this;
            java.lang.CharSequence r0 = r7.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0087
            o.ΙŁ r0 = r7.f8460
            if (r0 != 0) goto L_0x0010
            goto L_0x0087
        L_0x0010:
            float r0 = r0.f9173
            o.ΙŁ r1 = r7.f8460
            float r1 = r1.f9160
            float r0 = r0 + r1
            o.ΙŁ r1 = r7.f8460
            boolean r2 = r1.f9189
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0025
            android.graphics.drawable.Drawable r2 = r1.f9170
            if (r2 == 0) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r5 = 0
            if (r2 == 0) goto L_0x0032
            float r2 = r1.f9151
            float r6 = r1.f9197
            float r2 = r2 + r6
            float r1 = r1.f9150
            float r1 = r1 + r2
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            float r0 = r0 + r1
            int r0 = (int) r0
            o.ΙŁ r1 = r7.f8460
            float r1 = r1.f9147
            o.ΙŁ r2 = r7.f8460
            float r2 = r2.f9171
            float r1 = r1 + r2
            o.ΙŁ r2 = r7.f8460
            boolean r6 = r2.f9166
            if (r6 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r6 = r2.f9195
            if (r6 == 0) goto L_0x004a
            r6 = 1
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 != 0) goto L_0x005d
            boolean r6 = r2.f9165
            if (r6 == 0) goto L_0x005a
            android.graphics.drawable.Drawable r6 = r2.f9192
            if (r6 == 0) goto L_0x005a
            boolean r6 = r2.f9167
            if (r6 == 0) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x0066
        L_0x005d:
            float r3 = r2.f9146
            float r4 = r2.f9196
            float r3 = r3 + r4
            float r2 = r2.f9177
            float r5 = r3 + r2
        L_0x0066:
            float r1 = r1 + r5
            int r1 = (int) r1
            android.graphics.drawable.InsetDrawable r2 = r7.f8463
            if (r2 == 0) goto L_0x007c
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.drawable.InsetDrawable r3 = r7.f8463
            r3.getPadding(r2)
            int r3 = r2.left
            int r1 = r1 + r3
            int r2 = r2.right
            int r0 = r0 + r2
        L_0x007c:
            int r2 = r7.getPaddingTop()
            int r3 = r7.getPaddingBottom()
            o.C0293.m4178(r7, r1, r2, r0, r3)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1594.m9286():void");
    }

    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f8455 != i) {
            this.f8455 = i;
            m9286();
        }
    }

    public final void setChipDrawable(C1789 r4) {
        C1789 r0 = this.f8460;
        if (r0 != r4) {
            if (r0 != null) {
                r0.f9152 = new WeakReference<>((Object) null);
            }
            this.f8460 = r4;
            C1789 r42 = this.f8460;
            r42.f9190 = false;
            r42.f9152 = new WeakReference<>(this);
            m9287(this.f8464);
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m9288() {
        ColorStateList colorStateList;
        if (C0410.f3979) {
            m9284();
            return;
        }
        C1789 r0 = this.f8460;
        if (!r0.f9161) {
            r0.f9161 = true;
            if (r0.f9161) {
                colorStateList = C0410.m4695(r0.f9153);
            } else {
                colorStateList = null;
            }
            r0.f9162 = colorStateList;
            r0.onStateChange(r0.getState());
        }
        Drawable drawable = this.f8463;
        if (drawable == null) {
            drawable = this.f8460;
        }
        C0293.m4199((View) this, drawable);
        m9286();
        Object obj = this.f8463;
        if (obj == null) {
            obj = this.f8460;
        }
        if (obj == this.f8463 && this.f8460.getCallback() == null) {
            this.f8460.setCallback(this.f8463);
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private void m9284() {
        ColorStateList r1 = C0410.m4695(this.f8460.f9153);
        Drawable drawable = this.f8463;
        if (drawable == null) {
            drawable = this.f8460;
        }
        ColorStateList colorStateList = null;
        this.f8462 = new RippleDrawable(r1, drawable, (Drawable) null);
        C1789 r0 = this.f8460;
        if (r0.f9161) {
            r0.f9161 = false;
            if (r0.f9161) {
                colorStateList = C0410.m4695(r0.f9153);
            }
            r0.f9162 = colorStateList;
            r0.onStateChange(r0.getState());
        }
        C0293.m4199((View) this, (Drawable) this.f8462);
        m9286();
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f8448);
        }
        C1789 r0 = this.f8460;
        if (r0 != null && r0.f9163) {
            mergeDrawableStates(onCreateDrawableState, f8447);
        }
        return onCreateDrawableState;
    }

    public final void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final TextUtils.TruncateAt getEllipsize() {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            return r0.f9193;
        }
        return null;
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f8460 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C1789 r0 = this.f8460;
                if (r0 != null) {
                    r0.f9193 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public final void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.f9178 = i;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9291() {
        m9287(this.f8464);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public final void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C1789 r0 = this.f8460;
        if (r0 == null) {
            this.f8456 = z;
        } else if (r0.f9163) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f8451) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public final void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f8461 = onClickListener;
        m9289();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9292() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f8461;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f8459.m7859(1, 1);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r0 != 3) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080 A[RETURN] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            android.graphics.RectF r1 = r6.f8458
            r1.setEmpty()
            o.ΙŁ r1 = r6.f8460
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001f
            android.graphics.drawable.Drawable r4 = r1.f9170
            if (r4 == 0) goto L_0x001a
            android.graphics.drawable.Drawable r1 = r1.f9170
            android.graphics.drawable.Drawable r1 = o.C1266.m8149(r1)
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x002d
            o.ΙŁ r1 = r6.f8460
            android.graphics.RectF r4 = r6.f8458
            android.graphics.Rect r5 = r1.getBounds()
            r1.m9935(r5, r4)
        L_0x002d:
            android.graphics.RectF r1 = r6.f8458
            float r4 = r7.getX()
            float r5 = r7.getY()
            boolean r1 = r1.contains(r4, r5)
            if (r0 == 0) goto L_0x0068
            if (r0 == r3) goto L_0x0054
            r4 = 2
            if (r0 == r4) goto L_0x0046
            r1 = 3
            if (r0 == r1) goto L_0x005d
            goto L_0x0075
        L_0x0046:
            boolean r0 = r6.f8452
            if (r0 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0073
            if (r0 == 0) goto L_0x0073
            r6.f8452 = r2
            r6.refreshDrawableState()
            goto L_0x0073
        L_0x0054:
            boolean r0 = r6.f8452
            if (r0 == 0) goto L_0x005d
            r6.m9292()
            r0 = 1
            goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            boolean r1 = r6.f8452
            if (r1 == 0) goto L_0x0076
            r6.f8452 = r2
            r6.refreshDrawableState()
            goto L_0x0076
        L_0x0068:
            if (r1 == 0) goto L_0x0075
            boolean r0 = r6.f8452
            if (r0 == r3) goto L_0x0073
            r6.f8452 = r3
            r6.refreshDrawableState()
        L_0x0073:
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            if (r0 != 0) goto L_0x0080
            boolean r7 = super.onTouchEvent(r7)
            if (r7 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            return r2
        L_0x0080:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1594.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 7) {
            this.f8458.setEmpty();
            C1789 r0 = this.f8460;
            if (r0 != null) {
                if ((r0.f9170 != null ? C1266.m8149(r0.f9170) : null) != null) {
                    z = true;
                }
            }
            if (z) {
                C1789 r02 = this.f8460;
                r02.m9935(r02.getBounds(), this.f8458);
            }
            boolean contains = this.f8458.contains(motionEvent.getX(), motionEvent.getY());
            if (this.f8453 != contains) {
                this.f8453 = contains;
                refreshDrawableState();
            }
        } else if (actionMasked == 10 && this.f8453) {
            this.f8453 = false;
            refreshDrawableState();
        }
        return super.onHoverEvent(motionEvent);
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: ı  reason: contains not printable characters */
    private boolean m9283(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = C1212.class.getDeclaredField("ɩ");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f8459)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = C1212.class.getDeclaredMethod("ι", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f8459, new Object[]{Integer.valueOf(RecyclerView.UNDEFINED_DURATION)});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m9283(motionEvent) || this.f8459.m7867(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f8459.m7857(keyEvent) || this.f8459.f6877 == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f8459.m7863(z, i, rect);
    }

    public final void getFocusedRect(Rect rect) {
        if (this.f8459.f6877 == 1 || this.f8459.f6875 == 1) {
            rect.set(m9294());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1789 r0 = this.f8460;
        int i = 0;
        if (r0 != null) {
            Drawable drawable = r0.f9170;
            if (drawable != null && drawable.isStateful()) {
                C1789 r02 = this.f8460;
                int i2 = isEnabled() ? 1 : 0;
                if (this.f8454) {
                    i2++;
                }
                if (this.f8453) {
                    i2++;
                }
                if (this.f8452) {
                    i2++;
                }
                if (isChecked()) {
                    i2++;
                }
                int[] iArr = new int[i2];
                if (isEnabled()) {
                    iArr[0] = 16842910;
                    i = 1;
                }
                if (this.f8454) {
                    iArr[i] = 16842908;
                    i++;
                }
                if (this.f8453) {
                    iArr[i] = 16843623;
                    i++;
                }
                if (this.f8452) {
                    iArr[i] = 16842919;
                    i++;
                }
                if (isChecked()) {
                    iArr[i] = 16842913;
                }
                i = r02.m9931(iArr);
            }
        }
        if (i != 0) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m9293() {
        C1789 r0 = this.f8460;
        if (r0 == null) {
            return false;
        }
        return (r0.f9170 != null ? C1266.m8149(r0.f9170) : null) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final RectF m9290() {
        this.f8458.setEmpty();
        if (m9293()) {
            C1789 r0 = this.f8460;
            r0.m9935(r0.getBounds(), this.f8458);
        }
        return this.f8458;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final Rect m9294() {
        RectF r0 = m9290();
        this.f8450.set((int) r0.left, (int) r0.top, (int) r0.right, (int) r0.bottom);
        return this.f8450;
    }

    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!m9290().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    /* renamed from: o.ʁı$If */
    class If extends C1212 {
        If(C1594 r2) {
            super(r2);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m9297(float f, float f2) {
            return (!C1594.this.m9293() || !C1594.this.m9290().contains(f, f2)) ? 0 : 1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m9302(List<Integer> list) {
            boolean z = false;
            list.add(0);
            if (C1594.this.m9293()) {
                C1594 r1 = C1594.this;
                if (r1.f8460 != null && r1.f8460.f9189) {
                    z = true;
                }
                if (z && C1594.this.f8461 != null) {
                    list.add(1);
                }
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m9300(int i, boolean z) {
            if (i == 1) {
                C1594 r2 = C1594.this;
                r2.f8454 = z;
                r2.refreshDrawableState();
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m9299(int i, C0520 r8) {
            CharSequence charSequence;
            if (i == 1) {
                C1594 r7 = C1594.this;
                if (r7.f8460 != null) {
                    charSequence = r7.f8460.f9156;
                } else {
                    charSequence = null;
                }
                if (charSequence != null) {
                    r8.m5034(charSequence);
                } else {
                    CharSequence text = C1594.this.getText();
                    Context context = C1594.this.getContext();
                    Object[] objArr = new Object[1];
                    if (TextUtils.isEmpty(text)) {
                        text = "";
                    }
                    objArr[0] = text;
                    r8.m5034((CharSequence) context.getString(R.string.f170922131886212, objArr).trim());
                }
                r8.m5050(C1594.this.m9294());
                r8.m5052(C0520.Cif.f4329);
                r8.m5063(C1594.this.isEnabled());
                return;
            }
            r8.m5034((CharSequence) "");
            r8.m5050(C1594.f8446);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m9298(C0520 r5) {
            C1594 r0 = C1594.this;
            boolean z = true;
            r5.m5060(r0.f8460 != null && r0.f8460.f9163);
            r5.m5068(C1594.this.isClickable());
            C1594 r02 = C1594.this;
            if ((r02.f8460 != null && r02.f8460.f9163) || C1594.this.isClickable()) {
                C1594 r03 = C1594.this;
                if (r03.f8460 == null || !r03.f8460.f9163) {
                    z = false;
                }
                r5.m5022((CharSequence) z ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                r5.m5022((CharSequence) "android.view.View");
            }
            CharSequence text = C1594.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                r5.m5059(text);
            } else {
                r5.m5034(text);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m9301(int i, int i2) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return C1594.this.performClick();
            }
            if (i == 1) {
                return C1594.this.m9292();
            }
            return false;
        }
    }

    public final void setChipBackgroundColorResource(int i) {
        ColorStateList r3;
        C1789 r0 = this.f8460;
        if (r0 != null && r0.f9141 != (r3 = C3257Con.m1342(r0.f9148, i))) {
            r0.f9141 = r3;
            r0.onStateChange(r0.getState());
        }
    }

    public final void setChipBackgroundColor(ColorStateList colorStateList) {
        C1789 r0 = this.f8460;
        if (r0 != null && r0.f9141 != colorStateList) {
            r0.f9141 = colorStateList;
            r0.onStateChange(r0.getState());
        }
    }

    public final void setChipMinHeightResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9944(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setChipMinHeight(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9944(f);
        }
    }

    @Deprecated
    public final void setChipCornerRadiusResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            float dimension = r0.f9148.getResources().getDimension(i);
            if (r0.f9182 != dimension) {
                r0.f9182 = dimension;
                C0785.If ifR = new C0785.If(r0.f4785.f4796);
                ifR.f5228 = new C0531(dimension);
                ifR.f5227 = new C0531(dimension);
                ifR.f5235 = new C0531(dimension);
                ifR.f5231 = new C0531(dimension);
                r0.setShapeAppearanceModel(new C0785(ifR, (byte) 0));
            }
        }
    }

    public final void setShapeAppearanceModel(C0785 r2) {
        this.f8460.setShapeAppearanceModel(r2);
    }

    @Deprecated
    public final void setChipCornerRadius(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null && r0.f9182 != f) {
            r0.f9182 = f;
            C0785.If ifR = new C0785.If(r0.f4785.f4796);
            ifR.f5228 = new C0531(f);
            ifR.f5227 = new C0531(f);
            ifR.f5235 = new C0531(f);
            ifR.f5231 = new C0531(f);
            r0.setShapeAppearanceModel(new C0785(ifR, (byte) 0));
        }
    }

    public final void setChipStrokeColorResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9928(C3257Con.m1342(r0.f9148, i));
        }
    }

    public final void setChipStrokeColor(ColorStateList colorStateList) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9928(colorStateList);
        }
    }

    public final void setChipStrokeWidthResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9927(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setChipStrokeWidth(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9927(f);
        }
    }

    public final void setRippleColorResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            ColorStateList r3 = C3257Con.m1342(r0.f9148, i);
            if (r0.f9153 != r3) {
                r0.f9153 = r3;
                r0.f9162 = r0.f9161 ? C0410.m4695(r0.f9153) : null;
                r0.onStateChange(r0.getState());
            }
            if (!this.f8460.f9161) {
                m9284();
            }
        }
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        C1789 r0 = this.f8460;
        if (!(r0 == null || r0.f9153 == colorStateList)) {
            r0.f9153 = colorStateList;
            r0.f9162 = r0.f9161 ? C0410.m4695(r0.f9153) : null;
            r0.onStateChange(r0.getState());
        }
        if (!this.f8460.f9161) {
            m9284();
        }
    }

    public final void setLayoutDirection(int i) {
        if (this.f8460 != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f8460 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(this.f8460.f9190 ? null : charSequence, bufferType);
            C1789 r3 = this.f8460;
            if (r3 != null) {
                r3.m9929(charSequence);
            }
        }
    }

    @Deprecated
    public final void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    @Deprecated
    public final void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    public final void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public final void setTextAppearance(C0303 r3) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.f9169.m16030(r3, r0.f9148);
        }
        m9285();
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1789 r3 = this.f8460;
        if (r3 != null) {
            r3.f9169.m16030(new C0303(r3.f9148, i), r3.f9148);
        }
        m9285();
    }

    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.f9169.m16030(new C0303(r0.f9148, i), r0.f9148);
        }
        m9285();
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private void m9285() {
        C0303 r1;
        TextPaint paint = getPaint();
        C1789 r12 = this.f8460;
        if (r12 != null) {
            paint.drawableState = r12.getState();
        }
        C1789 r13 = this.f8460;
        if (r13 != null) {
            r1 = r13.f9169.f14436;
        } else {
            r1 = null;
        }
        if (r1 != null) {
            r1.m4291(getContext(), paint, this.f8449);
        }
    }

    public final void setChipIconVisible(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9949(r0.f9148.getResources().getBoolean(i));
        }
    }

    public final void setChipIconVisible(boolean z) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9949(z);
        }
    }

    @Deprecated
    public final void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public final void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    public final void setChipIconResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9941(C3257Con.m1345(r0.f9148, i));
        }
    }

    public final void setChipIcon(Drawable drawable) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9941(drawable);
        }
    }

    public final void setChipIconTintResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9947(C3257Con.m1342(r0.f9148, i));
        }
    }

    public final void setChipIconTint(ColorStateList colorStateList) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9947(colorStateList);
        }
    }

    public final void setChipIconSizeResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9933(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setChipIconSize(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9933(f);
        }
    }

    public final void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCloseIconVisible(boolean z) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9930(z);
        }
        m9289();
    }

    @Deprecated
    public final void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    @Deprecated
    public final void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    public final void setCloseIconResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9936(C3257Con.m1345(r0.f9148, i));
        }
        m9289();
    }

    public final void setCloseIcon(Drawable drawable) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9936(drawable);
        }
        m9289();
    }

    public final void setCloseIconTintResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9934(C3257Con.m1342(r0.f9148, i));
        }
    }

    public final void setCloseIconTint(ColorStateList colorStateList) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9934(colorStateList);
        }
    }

    public final void setCloseIconSizeResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9940(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setCloseIconSize(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9940(f);
        }
    }

    public final void setCloseIconContentDescription(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        C2075 r2;
        C2075 r5;
        String str;
        C1789 r0 = this.f8460;
        if (r0 != null && r0.f9156 != charSequence) {
            C1891 r1 = C1891.m10299();
            C2075 r22 = r1.f9585;
            if (charSequence == null) {
                spannableStringBuilder = null;
            } else {
                boolean r23 = r22.m11005(charSequence, 0, charSequence.length());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                String str2 = "";
                if ((r1.f9583 & 2) != 0) {
                    if (r23) {
                        r5 = C2139.f10293;
                    } else {
                        r5 = C2139.f10291;
                    }
                    boolean r52 = r5.m11005(charSequence, 0, charSequence.length());
                    if (!r1.f9584 && (r52 || C1891.m10297(charSequence) == 1)) {
                        str = C1891.f9579;
                    } else if (!r1.f9584 || (r52 && C1891.m10297(charSequence) != -1)) {
                        str = str2;
                    } else {
                        str = C1891.f9580;
                    }
                    spannableStringBuilder2.append(str);
                }
                if (r23 != r1.f9584) {
                    spannableStringBuilder2.append(r23 ? (char) 8235 : 8234);
                    spannableStringBuilder2.append(charSequence);
                    spannableStringBuilder2.append(8236);
                } else {
                    spannableStringBuilder2.append(charSequence);
                }
                if (r23) {
                    r2 = C2139.f10293;
                } else {
                    r2 = C2139.f10291;
                }
                boolean r24 = r2.m11005(charSequence, 0, charSequence.length());
                if (!r1.f9584 && (r24 || C1891.m10296(charSequence) == 1)) {
                    str2 = C1891.f9579;
                } else if (r1.f9584 && (!r24 || C1891.m10296(charSequence) == -1)) {
                    str2 = C1891.f9580;
                }
                spannableStringBuilder2.append(str2);
                spannableStringBuilder = spannableStringBuilder2;
            }
            r0.f9156 = spannableStringBuilder;
            r0.invalidateSelf();
        }
    }

    public final void setCheckableResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9937(r0.f9148.getResources().getBoolean(i));
        }
    }

    public final void setCheckable(boolean z) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9937(z);
        }
    }

    public final void setCheckedIconVisible(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9945(r0.f9148.getResources().getBoolean(i));
        }
    }

    public final void setCheckedIconVisible(boolean z) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9945(z);
        }
    }

    @Deprecated
    public final void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public final void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    public final void setCheckedIconResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9948(C3257Con.m1345(r0.f9148, i));
        }
    }

    public final void setCheckedIcon(Drawable drawable) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9948(drawable);
        }
    }

    public final void setShowMotionSpecResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            C1091.m7459(r0.f9148, i);
        }
    }

    public final void setHideMotionSpecResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            C1091.m7459(r0.f9148, i);
        }
    }

    public final void setChipStartPaddingResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9946(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setChipStartPadding(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9946(f);
        }
    }

    public final void setIconStartPaddingResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9942(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setIconStartPadding(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9942(f);
        }
    }

    public final void setIconEndPaddingResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9951(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setIconEndPadding(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9951(f);
        }
    }

    public final void setTextStartPaddingResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9950(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setTextStartPadding(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9950(f);
        }
    }

    public final void setTextEndPaddingResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9932(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setTextEndPadding(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9932(f);
        }
    }

    public final void setCloseIconStartPaddingResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9952(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setCloseIconStartPadding(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9952(f);
        }
    }

    public final void setCloseIconEndPaddingResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9943(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setCloseIconEndPadding(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9943(f);
        }
    }

    public final void setChipEndPaddingResource(int i) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9938(r0.f9148.getResources().getDimension(i));
        }
    }

    public final void setChipEndPadding(float f) {
        C1789 r0 = this.f8460;
        if (r0 != null) {
            r0.m9938(f);
        }
    }

    public final void setEnsureMinTouchTargetSize(boolean z) {
        this.f8457 = z;
        m9287(this.f8464);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m9287(int i) {
        this.f8464 = i;
        float f = 0.0f;
        if (!this.f8457) {
            InsetDrawable insetDrawable = this.f8463;
            if (insetDrawable == null) {
                m9288();
            } else if (insetDrawable != null) {
                this.f8463 = null;
                setMinWidth(0);
                C1789 r11 = this.f8460;
                if (r11 != null) {
                    f = r11.f9184;
                }
                setMinHeight((int) f);
                m9288();
            }
            return false;
        }
        int max = Math.max(0, i - this.f8460.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f8460.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i2 = max2 > 0 ? max2 / 2 : 0;
            int i3 = max > 0 ? max / 2 : 0;
            if (this.f8463 != null) {
                Rect rect = new Rect();
                this.f8463.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                    m9288();
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
            } else {
                setMinHeight(i);
                setMinWidth(i);
            }
            this.f8463 = new InsetDrawable(this.f8460, i2, i3, i2, i3);
            m9288();
            return true;
        }
        InsetDrawable insetDrawable2 = this.f8463;
        if (insetDrawable2 == null) {
            m9288();
        } else if (insetDrawable2 != null) {
            this.f8463 = null;
            setMinWidth(0);
            C1789 r112 = this.f8460;
            if (r112 != null) {
                f = r112.f9184;
            }
            setMinHeight((int) f);
            m9288();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* renamed from: Ӏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9289() {
        /*
            r5 = this;
            o.ΙŁ r0 = r5.f8460
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0017
            android.graphics.drawable.Drawable r4 = r0.f9170
            if (r4 == 0) goto L_0x0012
            android.graphics.drawable.Drawable r0 = r0.f9170
            android.graphics.drawable.Drawable r0 = o.C1266.m8149(r0)
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            if (r0 == 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0030
            o.ΙŁ r0 = r5.f8460
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.f9189
            if (r0 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0030
            android.view.View$OnClickListener r0 = r5.f8461
            if (r0 == 0) goto L_0x0030
            o.ʁı$If r0 = r5.f8459
            o.C0293.m4151((android.view.View) r5, (o.C2449) r0)
            return
        L_0x0030:
            o.C0293.m4151((android.view.View) r5, (o.C2449) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1594.m9289():void");
    }

    public final void setBackground(Drawable drawable) {
        Drawable drawable2 = this.f8463;
        if (drawable2 == null) {
            drawable2 = this.f8460;
        }
        if (drawable == drawable2 || drawable == this.f8462) {
            super.setBackground(drawable);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8463;
        if (drawable2 == null) {
            drawable2 = this.f8460;
        }
        if (drawable == drawable2 || drawable == this.f8462) {
            super.setBackgroundDrawable(drawable);
        }
    }
}
