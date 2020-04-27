package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import o.C0785;

/* renamed from: o.ƨɪ  reason: contains not printable characters */
public final class C0767 extends View {

    /* renamed from: ı  reason: contains not printable characters */
    private final Paint f5129;

    /* renamed from: ŀ  reason: contains not printable characters */
    private int f5130;

    /* renamed from: ł  reason: contains not printable characters */
    private float f5131;

    /* renamed from: ſ  reason: contains not printable characters */
    private float f5132;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int f5133;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private float f5134;

    /* renamed from: ƚ  reason: contains not printable characters */
    private float f5135;

    /* renamed from: ǀ  reason: contains not printable characters */
    private int f5136;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Paint f5137;

    /* renamed from: ȷ  reason: contains not printable characters */
    private int f5138;

    /* renamed from: ɍ  reason: contains not printable characters */
    private float f5139;

    /* renamed from: ɔ  reason: contains not printable characters */
    private ColorStateList f5140;

    /* renamed from: ɟ  reason: contains not printable characters */
    private ColorStateList f5141;

    /* renamed from: ɨ  reason: contains not printable characters */
    private int f5142;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Paint f5143;

    /* renamed from: ɪ  reason: contains not printable characters */
    private int f5144;

    /* renamed from: ɹ  reason: contains not printable characters */
    private List<Object> f5145;

    /* renamed from: ɺ  reason: contains not printable characters */
    private ColorStateList f5146;

    /* renamed from: ɼ  reason: contains not printable characters */
    private float[] f5147;

    /* renamed from: ɾ  reason: contains not printable characters */
    private int f5148;

    /* renamed from: ɿ  reason: contains not printable characters */
    private C0769 f5149;

    /* renamed from: ʅ  reason: contains not printable characters */
    private boolean f5150;

    /* renamed from: ʟ  reason: contains not printable characters */
    private int f5151;

    /* renamed from: ͻ  reason: contains not printable characters */
    private ColorStateList f5152;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Paint f5153;

    /* renamed from: ι  reason: contains not printable characters */
    private final Paint f5154;

    /* renamed from: ϳ  reason: contains not printable characters */
    private final C0671 f5155;

    /* renamed from: І  reason: contains not printable characters */
    private final Paint f5156;

    /* renamed from: г  reason: contains not printable characters */
    private int f5157;

    /* renamed from: с  reason: contains not printable characters */
    private ColorStateList f5158;

    /* renamed from: і  reason: contains not printable characters */
    private List<Object> f5159;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C1457 f5160;

    /* renamed from: ӏ  reason: contains not printable characters */
    private int f5161;

    /* renamed from: o.ƨɪ$ɩ  reason: contains not printable characters */
    public interface C0769 {
        /* renamed from: Ι  reason: contains not printable characters */
        String m6058();
    }

    public C0767(Context context) {
        this(context, (AttributeSet) null);
    }

    public C0767(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f154242130969241);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0767(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r2 = r19
            r4 = r20
            r1 = 2131952294(0x7f1302a6, float:1.9541027E38)
            r3 = r18
            android.content.Context r1 = o.C1400.m8576(r3, r2, r4, r1)
            r0.<init>(r1, r2, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f5159 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f5145 = r1
            r7 = 0
            r0.f5150 = r7
            r8 = 0
            r0.f5132 = r8
            o.Ɨŧ r1 = new o.Ɨŧ
            r1.<init>()
            r0.f5155 = r1
            android.content.Context r9 = r17.getContext()
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f5137 = r1
            android.graphics.Paint r1 = r0.f5137
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint r1 = r0.f5137
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f5143 = r1
            android.graphics.Paint r1 = r0.f5143
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint r1 = r0.f5143
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r10 = 1
            r1.<init>(r10)
            r0.f5153 = r1
            android.graphics.Paint r1 = r0.f5153
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r1.setStyle(r3)
            android.graphics.Paint r1 = r0.f5153
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.CLEAR
            r3.<init>(r5)
            r1.setXfermode(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r10)
            r0.f5154 = r1
            android.graphics.Paint r1 = r0.f5154
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r1.setStyle(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f5129 = r1
            android.graphics.Paint r1 = r0.f5129
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint r1 = r0.f5129
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r3)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0.f5156 = r1
            android.graphics.Paint r1 = r0.f5156
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r3)
            android.graphics.Paint r1 = r0.f5156
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            r1.setStrokeCap(r3)
            android.content.res.Resources r1 = r9.getResources()
            r3 = 2131165497(0x7f070139, float:1.7945213E38)
            int r3 = r1.getDimensionPixelSize(r3)
            r0.f5161 = r3
            r3 = 2131165495(0x7f070137, float:1.7945209E38)
            int r3 = r1.getDimensionPixelOffset(r3)
            r0.f5138 = r3
            r3 = 2131165496(0x7f070138, float:1.794521E38)
            int r3 = r1.getDimensionPixelOffset(r3)
            r0.f5148 = r3
            r3 = 2131165489(0x7f070131, float:1.7945197E38)
            int r1 = r1.getDimensionPixelSize(r3)
            r0.f5151 = r1
            int[] r3 = o.C0858.Aux.f5602
            int[] r6 = new int[r7]
            r5 = 2131952294(0x7f1302a6, float:1.9541027E38)
            r1 = r9
            android.content.res.TypedArray r1 = o.C3160.m15974(r1, r2, r3, r4, r5, r6)
            r2 = 2
            float r3 = r1.getFloat(r2, r8)
            r0.f5135 = r3
            r3 = 3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r1.getFloat(r3, r4)
            r0.f5134 = r4
            float r4 = r0.f5135
            float r4 = r1.getFloat(r7, r4)
            r0.setValue(r4)
            float r4 = r1.getFloat(r10, r8)
            r0.f5132 = r4
            r4 = 14
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x010c
            r6 = 14
            goto L_0x010e
        L_0x010c:
            r6 = 16
        L_0x010e:
            if (r5 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            r4 = 15
        L_0x0113:
            android.content.res.ColorStateList r5 = o.C0344.m4473(r9, r1, r6)
            if (r5 == 0) goto L_0x011a
            goto L_0x0121
        L_0x011a:
            r5 = 2131099806(0x7f06009e, float:1.7811976E38)
            android.content.res.ColorStateList r5 = o.C3257Con.m1342(r9, r5)
        L_0x0121:
            r0.setTrackColorInactive(r5)
            android.content.res.ColorStateList r4 = o.C0344.m4473(r9, r1, r4)
            if (r4 == 0) goto L_0x012b
            goto L_0x0132
        L_0x012b:
            r4 = 2131099803(0x7f06009b, float:1.781197E38)
            android.content.res.ColorStateList r4 = o.C3257Con.m1342(r9, r4)
        L_0x0132:
            r0.setTrackColorActive(r4)
            r4 = 8
            android.content.res.ColorStateList r4 = o.C0344.m4473(r9, r1, r4)
            o.Ɨŧ r5 = r0.f5155
            o.Ɨŧ$if r6 = r5.f4785
            android.content.res.ColorStateList r6 = r6.f4804
            if (r6 == r4) goto L_0x014e
            o.Ɨŧ$if r6 = r5.f4785
            r6.f4804 = r4
            int[] r4 = r5.getState()
            r5.onStateChange(r4)
        L_0x014e:
            r4 = 4
            android.content.res.ColorStateList r5 = o.C0344.m4473(r9, r1, r4)
            if (r5 == 0) goto L_0x0156
            goto L_0x015d
        L_0x0156:
            r5 = 2131099804(0x7f06009c, float:1.7811972E38)
            android.content.res.ColorStateList r5 = o.C3257Con.m1342(r9, r5)
        L_0x015d:
            r0.setHaloColor(r5)
            r5 = 11
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x016b
            r11 = 11
            goto L_0x016d
        L_0x016b:
            r11 = 13
        L_0x016d:
            if (r6 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r5 = 12
        L_0x0172:
            android.content.res.ColorStateList r6 = o.C0344.m4473(r9, r1, r11)
            if (r6 == 0) goto L_0x0179
            goto L_0x0180
        L_0x0179:
            r6 = 2131099805(0x7f06009d, float:1.7811974E38)
            android.content.res.ColorStateList r6 = o.C3257Con.m1342(r9, r6)
        L_0x0180:
            r0.setTickColorInactive(r6)
            android.content.res.ColorStateList r5 = o.C0344.m4473(r9, r1, r5)
            if (r5 == 0) goto L_0x018a
            goto L_0x0191
        L_0x018a:
            r5 = 2131099802(0x7f06009a, float:1.7811967E38)
            android.content.res.ColorStateList r5 = o.C3257Con.m1342(r9, r5)
        L_0x0191:
            r0.setTickColorActive(r5)
            r5 = 7
            r6 = 2131952318(0x7f1302be, float:1.9541075E38)
            int r15 = r1.getResourceId(r5, r6)
            o.ɶ r5 = new o.ɶ
            r5.<init>(r9, r15)
            android.content.Context r11 = r5.f7848
            r12 = 0
            int[] r13 = o.C0858.Aux.f5600
            r14 = 0
            int[] r6 = new int[r7]
            r16 = r6
            android.content.res.TypedArray r6 = o.C3160.m15974(r11, r12, r13, r14, r15, r16)
            android.content.Context r11 = r5.f7848
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131165513(0x7f070149, float:1.7945245E38)
            int r11 = r11.getDimensionPixelSize(r12)
            r5.f7851 = r11
            o.Ɨŧ$if r11 = r5.f4785
            o.ƭł r11 = r11.f4796
            o.ƭł$If r12 = new o.ƭł$If
            r12.<init>(r11)
            o.ŧɨ r11 = r5.m8723()
            r12.f5229 = r11
            o.ƭł r11 = new o.ƭł
            r11.<init>(r12, r7)
            r5.setShapeAppearanceModel(r11)
            r11 = 5
            java.lang.CharSequence r12 = r6.getText(r11)
            java.lang.CharSequence r13 = r5.f7841
            boolean r13 = android.text.TextUtils.equals(r13, r12)
            if (r13 != 0) goto L_0x01eb
            r5.f7841 = r12
            o.ջ r12 = r5.f7849
            r12.f14432 = r10
            r5.invalidateSelf()
        L_0x01eb:
            android.content.Context r12 = r5.f7848
            boolean r13 = r6.hasValue(r7)
            if (r13 == 0) goto L_0x01ff
            int r13 = r6.getResourceId(r7, r7)
            if (r13 == 0) goto L_0x01ff
            o.ıƩ r14 = new o.ıƩ
            r14.<init>(r12, r13)
            goto L_0x0200
        L_0x01ff:
            r14 = 0
        L_0x0200:
            o.ջ r12 = r5.f7849
            android.content.Context r13 = r5.f7848
            r12.m16030(r14, r13)
            android.content.Context r12 = r5.f7848
            java.lang.Class<o.ɶ> r13 = o.C1457.class
            java.lang.String r13 = r13.getCanonicalName()
            r14 = 2130968808(0x7f0400e8, float:1.754628E38)
            int r12 = o.C0328.m4398((android.content.Context) r12, (int) r14, (java.lang.String) r13)
            android.content.Context r13 = r5.f7848
            java.lang.Class<o.ɶ> r14 = o.C1457.class
            java.lang.String r14 = r14.getCanonicalName()
            r15 = 16842801(0x1010031, float:2.3693695E-38)
            int r13 = o.C0328.m4398((android.content.Context) r13, (int) r15, (java.lang.String) r14)
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r14
            r15 = -452984832(0xffffffffe5000000, float:-3.7778932E22)
            r13 = r13 | r15
            r12 = r12 & r14
            r14 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r12 = r12 | r14
            int r12 = o.C0960.m6875(r12, r13)
            r13 = 6
            int r12 = r6.getColor(r13, r12)
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            o.Ɨŧ$if r14 = r5.f4785
            android.content.res.ColorStateList r14 = r14.f4804
            if (r14 == r12) goto L_0x024e
            o.Ɨŧ$if r14 = r5.f4785
            r14.f4804 = r12
            int[] r12 = r5.getState()
            r5.onStateChange(r12)
        L_0x024e:
            int r12 = r6.getDimensionPixelSize(r10, r7)
            r5.f7842 = r12
            int r3 = r6.getDimensionPixelSize(r3, r7)
            r5.f7846 = r3
            int r3 = r6.getDimensionPixelSize(r4, r7)
            r5.f7850 = r3
            int r2 = r6.getDimensionPixelSize(r2, r7)
            r5.f7852 = r2
            r6.recycle()
            r0.f5160 = r5
            r2 = 10
            int r2 = r1.getDimensionPixelSize(r2, r7)
            r0.setThumbRadius(r2)
            int r2 = r1.getDimensionPixelSize(r11, r7)
            r0.setHaloRadius(r2)
            r2 = 9
            float r2 = r1.getDimension(r2, r8)
            r0.setThumbElevation(r2)
            r2 = 17
            int r2 = r1.getDimensionPixelSize(r2, r7)
            r0.setTrackHeight(r2)
            int r2 = r1.getInt(r13, r7)
            r0.f5144 = r2
            r1.recycle()
            float r1 = r0.f5135
            float r2 = r0.f5134
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x02c0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x02b8
            r17.m6055()
            r0.setFocusable(r10)
            o.Ɨŧ r1 = r0.f5155
            r1.m5529()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r9)
            int r1 = r1.getScaledTouchSlop()
            r0.f5133 = r1
            return
        L_0x02b8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "valueTo must be greater than valueFrom"
            r1.<init>(r2)
            throw r1
        L_0x02c0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "valueFrom must be smaller than valueTo"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0767.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6055() {
        float f = this.f5132;
        if (f < 0.0f) {
            throw new IllegalArgumentException("The stepSize must be 0, or a factor of the valueFrom-valueTo range");
        } else if (f > 0.0f && ((double) (((this.f5134 - this.f5135) / f) % 1.0f)) > 1.0E-4d) {
            throw new IllegalArgumentException("The stepSize must be 0, or a factor of the valueFrom-valueTo range");
        }
    }

    public final void setValueFrom(float f) {
        this.f5135 = f;
        if (this.f5135 >= this.f5134) {
            throw new IllegalArgumentException("valueFrom must be smaller than valueTo");
        }
    }

    public final void setValueTo(float f) {
        this.f5134 = f;
        if (this.f5134 <= this.f5135) {
            throw new IllegalArgumentException("valueTo must be greater than valueFrom");
        }
    }

    public final void setStepSize(float f) {
        if (this.f5132 != f) {
            this.f5132 = f;
            m6055();
            if (this.f5136 > 0) {
                m6052();
            }
            postInvalidate();
        }
    }

    public final void setLabelFormatter(C0769 r1) {
        this.f5149 = r1;
    }

    public final void setThumbElevation(float f) {
        this.f5155.m5526(f);
    }

    public final void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public final void setThumbRadius(int i) {
        if (i != this.f5157) {
            this.f5157 = i;
            C0671 r8 = this.f5155;
            C0785.If ifR = new C0785.If();
            float f = (float) this.f5157;
            C2197 r3 = C2745.m14530(0);
            ifR.f5234 = r3;
            float r4 = C0785.If.m6133(r3);
            if (r4 != -1.0f) {
                ifR.f5228 = new C0531(r4);
            }
            ifR.f5226 = r3;
            float r42 = C0785.If.m6133(r3);
            if (r42 != -1.0f) {
                ifR.f5227 = new C0531(r42);
            }
            ifR.f5233 = r3;
            float r43 = C0785.If.m6133(r3);
            if (r43 != -1.0f) {
                ifR.f5235 = new C0531(r43);
            }
            ifR.f5230 = r3;
            float r32 = C0785.If.m6133(r3);
            if (r32 != -1.0f) {
                ifR.f5231 = new C0531(r32);
            }
            ifR.f5228 = new C0531(f);
            ifR.f5227 = new C0531(f);
            ifR.f5235 = new C0531(f);
            ifR.f5231 = new C0531(f);
            r8.setShapeAppearanceModel(new C0785(ifR, (byte) 0));
            C0671 r82 = this.f5155;
            int i2 = this.f5157;
            r82.setBounds(0, 0, i2 << 1, i2 << 1);
            postInvalidate();
        }
    }

    public final void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public final void setHaloRadius(int i) {
        if (i != this.f5130) {
            this.f5130 = i;
            if (!(Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable))) {
                Drawable background = getBackground();
                if (background instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    int i2 = this.f5130;
                    if (Build.VERSION.SDK_INT >= 23) {
                        rippleDrawable.setRadius(i2);
                        return;
                    }
                    try {
                        RippleDrawable.class.getDeclaredMethod("setMaxRadius", new Class[]{Integer.TYPE}).invoke(rippleDrawable, new Object[]{Integer.valueOf(i2)});
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
                    }
                }
            } else {
                postInvalidate();
            }
        }
    }

    public final void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public final void setLabelBehavior(int i) {
        if (this.f5144 != i) {
            this.f5144 = i;
            requestLayout();
        }
    }

    public final void setTrackHeight(int i) {
        if (this.f5142 != i) {
            this.f5142 = i;
            this.f5137.setStrokeWidth((float) this.f5142);
            this.f5143.setStrokeWidth((float) this.f5142);
            this.f5129.setStrokeWidth(((float) this.f5142) / 2.0f);
            this.f5156.setStrokeWidth(((float) this.f5142) / 2.0f);
            postInvalidate();
        }
    }

    public final void setHaloColor(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f5140)) {
            this.f5140 = colorStateList;
            if (!(Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable))) {
                Drawable background = getBackground();
                if (background instanceof RippleDrawable) {
                    ((RippleDrawable) background).setColor(colorStateList);
                    return;
                }
                return;
            }
            this.f5154.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
            this.f5154.setAlpha(63);
            invalidate();
        }
    }

    public final void setThumbColor(ColorStateList colorStateList) {
        C0671 r0 = this.f5155;
        if (r0.f4785.f4804 != colorStateList) {
            r0.f4785.f4804 = colorStateList;
            r0.onStateChange(r0.getState());
        }
    }

    public final void setTickColor(ColorStateList colorStateList) {
        setTickColorInactive(colorStateList);
        setTickColorActive(colorStateList);
    }

    public final void setTickColorActive(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f5146)) {
            this.f5146 = colorStateList;
            Paint paint = this.f5156;
            ColorStateList colorStateList2 = this.f5146;
            paint.setColor(colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()));
            invalidate();
        }
    }

    public final void setTickColorInactive(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f5141)) {
            this.f5141 = colorStateList;
            Paint paint = this.f5129;
            ColorStateList colorStateList2 = this.f5141;
            paint.setColor(colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()));
            invalidate();
        }
    }

    public final void setTrackColor(ColorStateList colorStateList) {
        setTrackColorInactive(colorStateList);
        setTrackColorActive(colorStateList);
    }

    public final void setTrackColorActive(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f5152)) {
            this.f5152 = colorStateList;
            Paint paint = this.f5143;
            ColorStateList colorStateList2 = this.f5152;
            paint.setColor(colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()));
            invalidate();
        }
    }

    public final void setTrackColorInactive(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f5158)) {
            this.f5158 = colorStateList;
            Paint paint = this.f5137;
            ColorStateList colorStateList2 = this.f5158;
            paint.setColor(colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()));
            invalidate();
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1457 r0 = this.f5160;
        ViewGroup r1 = C3198.m16135(this);
        int[] iArr = new int[2];
        r1.getLocationOnScreen(iArr);
        r0.f7847 = iArr[0];
        r1.getWindowVisibleDisplayFrame(r0.f7844);
        r1.addOnLayoutChangeListener(r0.f7843);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3198.m16136(this).m16130(this.f5160);
        C3198.m16135(this).removeOnLayoutChangeListener(this.f5160.f7843);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f5161 + (this.f5144 == 1 ? this.f5160.getIntrinsicHeight() : 0), 1073741824));
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5136 = i - (this.f5138 << 1);
        if (this.f5132 > 0.0f) {
            m6052();
        }
        m6057();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m6052() {
        int min = Math.min((int) (((this.f5134 - this.f5135) / this.f5132) + 1.0f), (this.f5136 / (this.f5142 << 1)) + 1);
        float[] fArr = this.f5147;
        if (fArr == null || fArr.length != (min << 1)) {
            this.f5147 = new float[(min << 1)];
        }
        float f = ((float) this.f5136) / ((float) (min - 1));
        for (int i = 0; i < (min << 1); i += 2) {
            float[] fArr2 = this.f5147;
            fArr2[i] = ((float) this.f5138) + (((float) (i / 2)) * f);
            fArr2[i + 1] = (float) (this.f5148 + (this.f5144 == 1 ? this.f5160.getIntrinsicHeight() : 0));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z = false;
        int intrinsicHeight = this.f5148 + (this.f5144 == 1 ? this.f5160.getIntrinsicHeight() : 0);
        int i = this.f5136;
        int i2 = this.f5138;
        float f = this.f5139;
        float f2 = this.f5135;
        float f3 = ((float) i2) + (((f - f2) / (this.f5134 - f2)) * ((float) i));
        if (f3 < ((float) (i2 + i))) {
            float f4 = (float) intrinsicHeight;
            canvas.drawLine(f3, f4, (float) (i2 + i), f4, this.f5137);
        }
        float f5 = this.f5139;
        float f6 = this.f5135;
        float f7 = this.f5134;
        if ((f5 - f6) / (f7 - f6) > 0.0f) {
            int i3 = this.f5136;
            int i4 = this.f5138;
            float f8 = (float) i4;
            float f9 = (float) intrinsicHeight;
            canvas.drawLine(f8, f9, ((float) i4) + (((f5 - f6) / (f7 - f6)) * ((float) i3)), f9, this.f5143);
        }
        if (this.f5132 > 0.0f) {
            float[] fArr = this.f5147;
            float f10 = this.f5139;
            float f11 = this.f5135;
            int round = Math.round(((f10 - f11) / (this.f5134 - f11)) * ((float) ((fArr.length / 2) - 1))) << 1;
            canvas.drawPoints(this.f5147, 0, round, this.f5156);
            float[] fArr2 = this.f5147;
            canvas.drawPoints(fArr2, round, fArr2.length - round, this.f5129);
        }
        if ((this.f5150 || isFocused()) && isEnabled()) {
            int i5 = this.f5136;
            if (Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable)) {
                z = true;
            }
            if (z) {
                float f12 = this.f5139;
                float f13 = this.f5135;
                int i6 = (int) (((float) this.f5138) + (((f12 - f13) / (this.f5134 - f13)) * ((float) i5)));
                if (Build.VERSION.SDK_INT < 28) {
                    int i7 = this.f5130;
                    canvas.clipRect((float) (i6 - i7), (float) (intrinsicHeight - i7), (float) (i6 + i7), (float) (i7 + intrinsicHeight), Region.Op.UNION);
                }
                canvas.drawCircle((float) i6, (float) intrinsicHeight, (float) this.f5130, this.f5154);
            }
        }
        int i8 = this.f5136;
        if (!isEnabled()) {
            float f14 = this.f5139;
            float f15 = this.f5135;
            canvas.drawCircle(((float) this.f5138) + (((f14 - f15) / (this.f5134 - f15)) * ((float) i8)), (float) intrinsicHeight, (float) this.f5157, this.f5153);
        }
        canvas.save();
        int i9 = this.f5138;
        float f16 = this.f5139;
        float f17 = this.f5135;
        int i10 = i9 + ((int) (((f16 - f17) / (this.f5134 - f17)) * ((float) i8)));
        int i11 = this.f5157;
        canvas.translate((float) (i10 - i11), (float) (intrinsicHeight - i11));
        this.f5155.draw(canvas);
        canvas.restore();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float min = Math.min(1.0f, Math.max(0.0f, (x - ((float) this.f5138)) / ((float) this.f5136)));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f5150 = false;
                if (m6056(min)) {
                    Iterator<Object> it = this.f5159.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                C3198.m16136(this).m16130(this.f5160);
                Iterator<Object> it2 = this.f5145.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            } else if (actionMasked == 2) {
                if (!this.f5150) {
                    if (Math.abs(x - this.f5131) < ((float) this.f5133)) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Iterator<Object> it3 = this.f5145.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                }
                this.f5150 = true;
                if (m6056(min)) {
                    Iterator<Object> it4 = this.f5159.iterator();
                    while (it4.hasNext()) {
                        it4.next();
                    }
                }
                m6057();
                m6054();
                m6053();
            }
            invalidate();
        } else {
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                } else if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                    z = true;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (z) {
                this.f5131 = motionEvent.getX();
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
                requestFocus();
                this.f5150 = true;
                if (m6056(min)) {
                    Iterator<Object> it5 = this.f5159.iterator();
                    while (it5.hasNext()) {
                        it5.next();
                    }
                }
                m6057();
                m6054();
                m6053();
                invalidate();
                Iterator<Object> it6 = this.f5145.iterator();
                while (it6.hasNext()) {
                    it6.next();
                }
            }
        }
        setPressed(this.f5150);
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m6056(float f) {
        float f2 = this.f5132;
        if (f2 > 0.0f) {
            float f3 = (float) ((int) ((this.f5134 - this.f5135) / f2));
            f = ((float) Math.round(f * f3)) / f3;
        }
        float f4 = this.f5139;
        float f5 = this.f5135;
        float f6 = this.f5134;
        if (f == (f4 - f5) / (f6 - f5)) {
            return false;
        }
        this.f5139 = (f * (f6 - f5)) + f5;
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m6053() {
        if (this.f5144 != 2) {
            int i = this.f5138;
            float f = this.f5139;
            float f2 = this.f5135;
            int intrinsicWidth = (i + ((int) (((f - f2) / (this.f5134 - f2)) * ((float) this.f5136)))) - (this.f5160.getIntrinsicWidth() / 2);
            int intrinsicHeight = (this.f5148 + (this.f5144 == 1 ? this.f5160.getIntrinsicHeight() : 0)) - (this.f5151 + this.f5157);
            C1457 r2 = this.f5160;
            r2.setBounds(intrinsicWidth, intrinsicHeight - r2.getIntrinsicHeight(), this.f5160.getIntrinsicWidth() + intrinsicWidth, intrinsicHeight);
            Rect rect = new Rect(this.f5160.getBounds());
            C2715.m14418(C3198.m16135(this), this, rect);
            this.f5160.setBounds(rect);
            C3198.m16136(this).m16129(this.f5160);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Paint paint = this.f5137;
        ColorStateList colorStateList = this.f5158;
        paint.setColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        Paint paint2 = this.f5143;
        ColorStateList colorStateList2 = this.f5152;
        paint2.setColor(colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()));
        Paint paint3 = this.f5129;
        ColorStateList colorStateList3 = this.f5141;
        paint3.setColor(colorStateList3.getColorForState(getDrawableState(), colorStateList3.getDefaultColor()));
        Paint paint4 = this.f5156;
        ColorStateList colorStateList4 = this.f5146;
        paint4.setColor(colorStateList4.getColorForState(getDrawableState(), colorStateList4.getDefaultColor()));
        if (this.f5160.isStateful()) {
            this.f5160.setState(getDrawableState());
        }
        if (this.f5155.isStateful()) {
            this.f5155.setState(getDrawableState());
        }
        Paint paint5 = this.f5154;
        ColorStateList colorStateList5 = this.f5140;
        paint5.setColor(colorStateList5.getColorForState(getDrawableState(), colorStateList5.getDefaultColor()));
        this.f5154.setAlpha(63);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        C0768 r1 = new C0768(super.onSaveInstanceState());
        r1.f5165 = this.f5135;
        r1.f5163 = this.f5134;
        r1.f5164 = this.f5139;
        r1.f5166 = this.f5132;
        r1.f5162 = hasFocus();
        return r1;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C0768 r2 = (C0768) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.f5135 = r2.f5165;
        this.f5134 = r2.f5163;
        this.f5139 = r2.f5164;
        this.f5132 = r2.f5166;
        if (r2.f5162) {
            requestFocus();
        }
        Iterator<Object> it = this.f5159.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: o.ƨɪ$ı  reason: contains not printable characters */
    static class C0768 extends View.BaseSavedState {
        public static final Parcelable.Creator<C0768> CREATOR = new Parcelable.Creator<C0768>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0768[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0768(parcel, (byte) 0);
            }
        };

        /* renamed from: ı  reason: contains not printable characters */
        boolean f5162;

        /* renamed from: ǃ  reason: contains not printable characters */
        float f5163;

        /* renamed from: ɩ  reason: contains not printable characters */
        float f5164;

        /* renamed from: Ι  reason: contains not printable characters */
        float f5165;

        /* renamed from: ι  reason: contains not printable characters */
        float f5166;

        /* synthetic */ C0768(Parcel parcel, byte b) {
            this(parcel);
        }

        C0768(Parcelable parcelable) {
            super(parcelable);
        }

        private C0768(Parcel parcel) {
            super(parcel);
            this.f5165 = parcel.readFloat();
            this.f5163 = parcel.readFloat();
            this.f5164 = parcel.readFloat();
            this.f5166 = parcel.readFloat();
            this.f5162 = parcel.createBooleanArray()[0];
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f5165);
            parcel.writeFloat(this.f5163);
            parcel.writeFloat(this.f5164);
            parcel.writeFloat(this.f5166);
            parcel.writeBooleanArray(new boolean[]{this.f5162});
        }
    }

    public final void setValue(float f) {
        float f2 = this.f5135;
        boolean z = false;
        if (f >= f2 && f <= this.f5134) {
            float f3 = this.f5132;
            if (f3 <= 0.0f || ((double) (((f2 - f) / f3) % 1.0f)) <= 1.0E-4d) {
                z = true;
            }
        }
        if (z && ((double) Math.abs(this.f5139 - f)) >= 1.0E-4d) {
            this.f5139 = f;
            Iterator<Object> it = this.f5159.iterator();
            while (it.hasNext()) {
                it.next();
            }
            invalidate();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m6057() {
        int i = 0;
        if (!(Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable)) && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                float f = this.f5139;
                float f2 = this.f5135;
                int i2 = (int) ((((f - f2) / (this.f5134 - f2)) * ((float) this.f5136)) + ((float) this.f5138));
                int i3 = this.f5148;
                if (this.f5144 == 1) {
                    i = this.f5160.getIntrinsicHeight();
                }
                int i4 = i3 + i;
                int i5 = this.f5130;
                C1266.m8151(background, i2 - i5, i4 - i5, i2 + i5, i4 + i5);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m6054() {
        float f = this.f5139;
        if (this.f5149 != null) {
            C1457 r0 = this.f5160;
            String r1 = this.f5149.m6058();
            if (!TextUtils.equals(r0.f7841, r1)) {
                r0.f7841 = r1;
                r0.f7849.f14432 = true;
                r0.invalidateSelf();
                return;
            }
            return;
        }
        C1457 r12 = this.f5160;
        String format = String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
        if (!TextUtils.equals(r12.f7841, format)) {
            r12.f7841 = format;
            r12.f7849.f14432 = true;
            r12.invalidateSelf();
        }
    }
}
