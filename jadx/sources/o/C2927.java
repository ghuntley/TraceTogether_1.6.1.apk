package o;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import o.C3207;

/* renamed from: o.әı  reason: contains not printable characters */
public final class C2927 implements C3207.C3208 {

    /* renamed from: ŀ  reason: contains not printable characters */
    private static final boolean f13560 = (Build.VERSION.SDK_INT < 18);

    /* renamed from: ı  reason: contains not printable characters */
    public float f13561 = 15.0f;

    /* renamed from: ıı  reason: contains not printable characters */
    private float f13562;

    /* renamed from: ł  reason: contains not printable characters */
    private final Rect f13563;

    /* renamed from: ſ  reason: contains not printable characters */
    private float f13564;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public Typeface f13565;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private float f13566;

    /* renamed from: ƚ  reason: contains not printable characters */
    private float f13567;

    /* renamed from: ǀ  reason: contains not printable characters */
    private Typeface f13568;

    /* renamed from: ǃ  reason: contains not printable characters */
    public float f13569;

    /* renamed from: ȷ  reason: contains not printable characters */
    public int[] f13570;

    /* renamed from: ɍ  reason: contains not printable characters */
    private final RectF f13571;

    /* renamed from: ɔ  reason: contains not printable characters */
    private float f13572;

    /* renamed from: ɟ  reason: contains not printable characters */
    private float f13573;

    /* renamed from: ɨ  reason: contains not printable characters */
    public C3207 f13574;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final View f13575;

    /* renamed from: ɪ  reason: contains not printable characters */
    public CharSequence f13576;

    /* renamed from: ɭ  reason: contains not printable characters */
    private boolean f13577;

    /* renamed from: ɹ  reason: contains not printable characters */
    public Typeface f13578;

    /* renamed from: ɺ  reason: contains not printable characters */
    private float f13579;

    /* renamed from: ɻ  reason: contains not printable characters */
    private float f13580;

    /* renamed from: ɼ  reason: contains not printable characters */
    private CharSequence f13581;

    /* renamed from: ɾ  reason: contains not printable characters */
    public final TextPaint f13582;

    /* renamed from: ɿ  reason: contains not printable characters */
    public TimeInterpolator f13583;

    /* renamed from: ʅ  reason: contains not printable characters */
    private float f13584 = 15.0f;

    /* renamed from: ʏ  reason: contains not printable characters */
    private ColorStateList f13585;

    /* renamed from: ʔ  reason: contains not printable characters */
    private float f13586;

    /* renamed from: ʕ  reason: contains not printable characters */
    private float f13587;

    /* renamed from: ʖ  reason: contains not printable characters */
    private float f13588;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final Rect f13589;

    /* renamed from: ͻ  reason: contains not printable characters */
    private boolean f13590;

    /* renamed from: Γ  reason: contains not printable characters */
    private ColorStateList f13591;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f13592 = 16;

    /* renamed from: ι  reason: contains not printable characters */
    public int f13593 = 16;

    /* renamed from: ϲ  reason: contains not printable characters */
    private boolean f13594;

    /* renamed from: ϳ  reason: contains not printable characters */
    private Bitmap f13595;

    /* renamed from: І  reason: contains not printable characters */
    public ColorStateList f13596;

    /* renamed from: Ј  reason: contains not printable characters */
    private Paint f13597;

    /* renamed from: г  reason: contains not printable characters */
    private boolean f13598;

    /* renamed from: с  reason: contains not printable characters */
    private float f13599;

    /* renamed from: т  reason: contains not printable characters */
    private float f13600;

    /* renamed from: х  reason: contains not printable characters */
    private final TextPaint f13601;

    /* renamed from: і  reason: contains not printable characters */
    public ColorStateList f13602;

    /* renamed from: ј  reason: contains not printable characters */
    private float f13603;

    /* renamed from: ґ  reason: contains not printable characters */
    private float f13604;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public C3207 f13605;

    /* renamed from: ӏ  reason: contains not printable characters */
    public TimeInterpolator f13606;

    /* renamed from: ӷ  reason: contains not printable characters */
    private float f13607;

    public C2927(View view) {
        this.f13575 = view;
        this.f13601 = new TextPaint(129);
        this.f13582 = new TextPaint(this.f13601);
        this.f13563 = new Rect();
        this.f13589 = new Rect();
        this.f13571 = new RectF();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m15117(float f) {
        if (this.f13561 != f) {
            this.f13561 = f;
            if (this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
                m15103();
                m15107(this.f13569);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15105(ColorStateList colorStateList) {
        if (this.f13596 != colorStateList) {
            this.f13596 = colorStateList;
            if (this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
                m15103();
                m15107(this.f13569);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15109(ColorStateList colorStateList) {
        if (this.f13602 != colorStateList) {
            this.f13602 = colorStateList;
            if (this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
                m15103();
                m15107(this.f13569);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m15119(int i, int i2, int i3, int i4) {
        if (!m15096(this.f13589, i, i2, i3, i4)) {
            this.f13589.set(i, i2, i3, i4);
            this.f13577 = true;
            m15098();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15114(int i, int i2, int i3, int i4) {
        if (!m15096(this.f13563, i, i2, i3, i4)) {
            this.f13563.set(i, i2, i3, i4);
            this.f13577 = true;
            m15098();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m15122(android.graphics.RectF r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.CharSequence r0 = r7.f13576
            boolean r0 = r7.m15097((java.lang.CharSequence) r0)
            r7.f13594 = r0
            r0 = 1
            r1 = 17
            r2 = 5
            r3 = 8388613(0x800005, float:1.175495E-38)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x0043
            r5 = r10 & 7
            if (r5 != r0) goto L_0x0018
            goto L_0x0043
        L_0x0018:
            r5 = r10 & r3
            if (r5 == r3) goto L_0x002f
            r5 = r10 & 5
            if (r5 != r2) goto L_0x0021
            goto L_0x002f
        L_0x0021:
            boolean r5 = r7.f13594
            if (r5 == 0) goto L_0x003d
            android.graphics.Rect r5 = r7.f13563
            int r5 = r5.right
            float r5 = (float) r5
            float r6 = r7.m15100()
            goto L_0x004a
        L_0x002f:
            boolean r5 = r7.f13594
            if (r5 != 0) goto L_0x003d
            android.graphics.Rect r5 = r7.f13563
            int r5 = r5.right
            float r5 = (float) r5
            float r6 = r7.m15100()
            goto L_0x004a
        L_0x003d:
            android.graphics.Rect r5 = r7.f13563
            int r5 = r5.left
            float r5 = (float) r5
            goto L_0x004b
        L_0x0043:
            float r5 = (float) r9
            float r5 = r5 / r4
            float r6 = r7.m15100()
            float r6 = r6 / r4
        L_0x004a:
            float r5 = r5 - r6
        L_0x004b:
            r8.left = r5
            android.graphics.Rect r5 = r7.f13563
            int r5 = r5.top
            float r5 = (float) r5
            r8.top = r5
            if (r10 == r1) goto L_0x007e
            r1 = r10 & 7
            if (r1 != r0) goto L_0x005b
            goto L_0x007e
        L_0x005b:
            r9 = r10 & r3
            if (r9 == r3) goto L_0x006d
            r9 = r10 & 5
            if (r9 != r2) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            boolean r9 = r7.f13594
            if (r9 == 0) goto L_0x0077
            android.graphics.Rect r9 = r7.f13563
            int r9 = r9.right
            goto L_0x0075
        L_0x006d:
            boolean r9 = r7.f13594
            if (r9 != 0) goto L_0x0077
            android.graphics.Rect r9 = r7.f13563
            int r9 = r9.right
        L_0x0075:
            float r9 = (float) r9
            goto L_0x0086
        L_0x0077:
            float r9 = r8.left
            float r10 = r7.m15100()
            goto L_0x0085
        L_0x007e:
            float r9 = (float) r9
            float r9 = r9 / r4
            float r10 = r7.m15100()
            float r10 = r10 / r4
        L_0x0085:
            float r9 = r9 + r10
        L_0x0086:
            r8.right = r9
            android.graphics.Rect r9 = r7.f13563
            int r9 = r9.top
            float r9 = (float) r9
            android.text.TextPaint r10 = r7.f13582
            float r0 = r7.f13584
            r10.setTextSize(r0)
            android.graphics.Typeface r0 = r7.f13578
            r10.setTypeface(r0)
            android.text.TextPaint r10 = r7.f13582
            float r10 = r10.ascent()
            float r9 = r9 - r10
            r8.bottom = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2927.m15122(android.graphics.RectF, int, int):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private float m15100() {
        if (this.f13576 == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.f13582;
        textPaint.setTextSize(this.f13584);
        textPaint.setTypeface(this.f13578);
        TextPaint textPaint2 = this.f13582;
        CharSequence charSequence = this.f13576;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final float m15116() {
        TextPaint textPaint = this.f13582;
        textPaint.setTextSize(this.f13584);
        textPaint.setTypeface(this.f13578);
        return -this.f13582.ascent();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private void m15098() {
        this.f13598 = this.f13563.width() > 0 && this.f13563.height() > 0 && this.f13589.width() > 0 && this.f13589.height() > 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m15121(int i) {
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if (this.f13593 != i) {
            this.f13593 = i;
            if (this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
                m15103();
                m15107(this.f13569);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15104(int i) {
        if ((8388615 & i) == 0) {
            i |= 8388611;
        }
        if (this.f13592 != i) {
            this.f13592 = i;
            if (this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
                m15103();
                m15107(this.f13569);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15108(int i) {
        C0303 r0 = new C0303(this.f13575.getContext(), i);
        if (r0.f3585 != null) {
            this.f13596 = r0.f3585;
        }
        if (r0.f3584 != 0.0f) {
            this.f13584 = r0.f3584;
        }
        if (r0.f3581 != null) {
            this.f13585 = r0.f3581;
        }
        this.f13580 = r0.f3580;
        this.f13588 = r0.f3583;
        this.f13587 = r0.f3587;
        C3207 r3 = this.f13574;
        if (r3 != null) {
            r3.f14565 = true;
        }
        r0.m4289();
        this.f13574 = new C3207(this, r0.f3586);
        r0.m4292(this.f13575.getContext(), this.f13574);
        if (this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
            m15103();
            m15107(this.f13569);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m15118(int i) {
        C0303 r0 = new C0303(this.f13575.getContext(), i);
        if (r0.f3585 != null) {
            this.f13602 = r0.f3585;
        }
        if (r0.f3584 != 0.0f) {
            this.f13561 = r0.f3584;
        }
        if (r0.f3581 != null) {
            this.f13591 = r0.f3581;
        }
        this.f13562 = r0.f3580;
        this.f13607 = r0.f3583;
        this.f13586 = r0.f3587;
        C3207 r4 = this.f13605;
        if (r4 != null) {
            r4.f14565 = true;
        }
        AnonymousClass1 r1 = new C3207.C3208() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m15123(Typeface typeface) {
                C2927 r0 = C2927.this;
                boolean z = true;
                if (r0.f13605 != null) {
                    r0.f13605.f14565 = true;
                }
                if (r0.f13565 != typeface) {
                    r0.f13565 = typeface;
                } else {
                    z = false;
                }
                if (z && r0.f13575.getHeight() > 0 && r0.f13575.getWidth() > 0) {
                    r0.m15103();
                    r0.m15107(r0.f13569);
                }
            }
        };
        r0.m4289();
        this.f13605 = new C3207(r1, r0.f3586);
        r0.m4292(this.f13575.getContext(), this.f13605);
        if (this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
            m15103();
            m15107(this.f13569);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m15120(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f13569) {
            this.f13569 = f;
            m15107(this.f13569);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m15112() {
        ColorStateList colorStateList = this.f13596;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f13602;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15107(float f) {
        float f2;
        float f3;
        float f4;
        TextPaint textPaint;
        int i;
        int i2;
        int i3;
        int i4;
        m15095(f);
        float f5 = this.f13564;
        float f6 = this.f13572;
        TimeInterpolator timeInterpolator = this.f13606;
        if (timeInterpolator != null) {
            f2 = timeInterpolator.getInterpolation(f);
        } else {
            f2 = f;
        }
        this.f13579 = f5 + (f2 * (f6 - f5));
        float f7 = this.f13566;
        float f8 = this.f13567;
        TimeInterpolator timeInterpolator2 = this.f13606;
        if (timeInterpolator2 != null) {
            f3 = timeInterpolator2.getInterpolation(f);
        } else {
            f3 = f;
        }
        this.f13573 = f7 + (f3 * (f8 - f7));
        float f9 = this.f13561;
        float f10 = this.f13584;
        TimeInterpolator timeInterpolator3 = this.f13583;
        if (timeInterpolator3 != null) {
            f4 = timeInterpolator3.getInterpolation(f);
        } else {
            f4 = f;
        }
        m15099(f9 + (f4 * (f10 - f9)));
        ColorStateList colorStateList = this.f13596;
        ColorStateList colorStateList2 = this.f13602;
        int i5 = 0;
        if (colorStateList != colorStateList2) {
            TextPaint textPaint2 = this.f13601;
            if (colorStateList2 == null) {
                i3 = 0;
            } else {
                int[] iArr = this.f13570;
                if (iArr != null) {
                    i3 = colorStateList2.getColorForState(iArr, 0);
                } else {
                    i3 = colorStateList2.getDefaultColor();
                }
            }
            ColorStateList colorStateList3 = this.f13596;
            if (colorStateList3 == null) {
                i4 = 0;
            } else {
                int[] iArr2 = this.f13570;
                if (iArr2 != null) {
                    i4 = colorStateList3.getColorForState(iArr2, 0);
                } else {
                    i4 = colorStateList3.getDefaultColor();
                }
            }
            int r8 = m15094(i3, i4, f);
            textPaint = textPaint2;
            i = r8;
        } else {
            textPaint = this.f13601;
            if (colorStateList == null) {
                i = 0;
            } else {
                int[] iArr3 = this.f13570;
                if (iArr3 != null) {
                    i = colorStateList.getColorForState(iArr3, 0);
                } else {
                    i = colorStateList.getDefaultColor();
                }
            }
        }
        textPaint.setColor(i);
        TextPaint textPaint3 = this.f13601;
        float f11 = this.f13586;
        float f12 = f11 + ((this.f13587 - f11) * f);
        float f13 = this.f13562;
        float f14 = f13 + ((this.f13580 - f13) * f);
        float f15 = this.f13607;
        float f16 = f15 + ((this.f13588 - f15) * f);
        ColorStateList colorStateList4 = this.f13591;
        if (colorStateList4 == null) {
            i2 = 0;
        } else {
            int[] iArr4 = this.f13570;
            if (iArr4 != null) {
                i2 = colorStateList4.getColorForState(iArr4, 0);
            } else {
                i2 = colorStateList4.getDefaultColor();
            }
        }
        ColorStateList colorStateList5 = this.f13585;
        if (colorStateList5 != null) {
            int[] iArr5 = this.f13570;
            if (iArr5 != null) {
                i5 = colorStateList5.getColorForState(iArr5, 0);
            } else {
                i5 = colorStateList5.getDefaultColor();
            }
        }
        textPaint3.setShadowLayer(f12, f14, f16, m15094(i2, i5, f));
        C0293.m4176(this.f13575);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15103() {
        float f = this.f13600;
        m15101(this.f13584);
        CharSequence charSequence = this.f13581;
        float f2 = 0.0f;
        float measureText = charSequence != null ? this.f13601.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int r4 = C2409.m12455(this.f13592, this.f13594 ? 1 : 0);
        int i = r4 & 112;
        if (i == 48) {
            this.f13567 = ((float) this.f13563.top) - this.f13601.ascent();
        } else if (i != 80) {
            this.f13567 = ((float) this.f13563.centerY()) + (((this.f13601.descent() - this.f13601.ascent()) / 2.0f) - this.f13601.descent());
        } else {
            this.f13567 = (float) this.f13563.bottom;
        }
        int i2 = r4 & 8388615;
        if (i2 == 1) {
            this.f13572 = ((float) this.f13563.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f13572 = (float) this.f13563.left;
        } else {
            this.f13572 = ((float) this.f13563.right) - measureText;
        }
        m15101(this.f13561);
        CharSequence charSequence2 = this.f13581;
        if (charSequence2 != null) {
            f2 = this.f13601.measureText(charSequence2, 0, charSequence2.length());
        }
        int r1 = C2409.m12455(this.f13593, this.f13594 ? 1 : 0);
        int i3 = r1 & 112;
        if (i3 == 48) {
            this.f13566 = ((float) this.f13589.top) - this.f13601.ascent();
        } else if (i3 != 80) {
            this.f13566 = ((float) this.f13589.centerY()) + (((this.f13601.descent() - this.f13601.ascent()) / 2.0f) - this.f13601.descent());
        } else {
            this.f13566 = (float) this.f13589.bottom;
        }
        int i4 = r1 & 8388615;
        if (i4 == 1) {
            this.f13564 = ((float) this.f13589.centerX()) - (f2 / 2.0f);
        } else if (i4 != 5) {
            this.f13564 = (float) this.f13589.left;
        } else {
            this.f13564 = ((float) this.f13589.right) - f2;
        }
        Bitmap bitmap = this.f13595;
        if (bitmap != null) {
            bitmap.recycle();
            this.f13595 = null;
        }
        m15099(f);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m15095(float f) {
        float f2;
        float f3;
        float f4;
        RectF rectF = this.f13571;
        float f5 = (float) this.f13589.left;
        float f6 = (float) this.f13563.left;
        TimeInterpolator timeInterpolator = this.f13606;
        if (timeInterpolator != null) {
            f2 = timeInterpolator.getInterpolation(f);
        } else {
            f2 = f;
        }
        rectF.left = f5 + (f2 * (f6 - f5));
        RectF rectF2 = this.f13571;
        float f7 = this.f13566;
        float f8 = this.f13567;
        TimeInterpolator timeInterpolator2 = this.f13606;
        if (timeInterpolator2 != null) {
            f3 = timeInterpolator2.getInterpolation(f);
        } else {
            f3 = f;
        }
        rectF2.top = f7 + (f3 * (f8 - f7));
        RectF rectF3 = this.f13571;
        float f9 = (float) this.f13589.right;
        float f10 = (float) this.f13563.right;
        TimeInterpolator timeInterpolator3 = this.f13606;
        if (timeInterpolator3 != null) {
            f4 = timeInterpolator3.getInterpolation(f);
        } else {
            f4 = f;
        }
        rectF3.right = f9 + (f4 * (f10 - f9));
        RectF rectF4 = this.f13571;
        float f11 = (float) this.f13589.bottom;
        float f12 = (float) this.f13563.bottom;
        TimeInterpolator timeInterpolator4 = this.f13606;
        if (timeInterpolator4 != null) {
            f = timeInterpolator4.getInterpolation(f);
        }
        rectF4.bottom = f11 + (f * (f12 - f11));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m15106(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f13581 != null && this.f13598) {
            float f2 = this.f13579;
            float f3 = this.f13573;
            boolean z = this.f13590 && this.f13595 != null;
            if (z) {
                f = this.f13599 * this.f13603;
            } else {
                this.f13601.ascent();
                f = 0.0f;
                this.f13601.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.f13603;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f13595, f2, f4, this.f13597);
            } else {
                CharSequence charSequence = this.f13581;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.f13601);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m15097(CharSequence charSequence) {
        boolean z = true;
        if (C0293.m4156(this.f13575) != 1) {
            z = false;
        }
        return (z ? C2139.f10292 : C2139.f10294).m11005(charSequence, 0, charSequence.length());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m15099(float f) {
        m15101(f);
        this.f13590 = f13560 && this.f13603 != 1.0f;
        if (this.f13590) {
            m15102();
        }
        C0293.m4176(this.f13575);
    }

    /* renamed from: І  reason: contains not printable characters */
    private void m15101(float f) {
        boolean z;
        float f2;
        boolean z2;
        if (this.f13576 != null) {
            float width = (float) this.f13563.width();
            float width2 = (float) this.f13589.width();
            boolean z3 = true;
            if (Math.abs(f - this.f13584) < 0.001f) {
                float f3 = this.f13584;
                this.f13603 = 1.0f;
                Typeface typeface = this.f13568;
                Typeface typeface2 = this.f13578;
                if (typeface != typeface2) {
                    this.f13568 = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                f2 = f3;
                z = z2;
            } else {
                f2 = this.f13561;
                Typeface typeface3 = this.f13568;
                Typeface typeface4 = this.f13565;
                if (typeface3 != typeface4) {
                    this.f13568 = typeface4;
                    z = true;
                } else {
                    z = false;
                }
                if (Math.abs(f - this.f13561) < 0.001f) {
                    this.f13603 = 1.0f;
                } else {
                    this.f13603 = f / this.f13561;
                }
                float f4 = this.f13584 / this.f13561;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
            }
            if (width > 0.0f) {
                z = this.f13600 != f2 || this.f13577 || z;
                this.f13600 = f2;
                this.f13577 = false;
            }
            if (this.f13581 == null || z) {
                this.f13601.setTextSize(this.f13600);
                this.f13601.setTypeface(this.f13568);
                TextPaint textPaint = this.f13601;
                if (this.f13603 == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f13576, this.f13601, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f13581)) {
                    this.f13581 = ellipsize;
                    this.f13594 = m15097(this.f13581);
                }
            }
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private void m15102() {
        if (this.f13595 == null && !this.f13589.isEmpty() && !TextUtils.isEmpty(this.f13581)) {
            m15107(0.0f);
            this.f13599 = this.f13601.ascent();
            this.f13604 = this.f13601.descent();
            TextPaint textPaint = this.f13601;
            CharSequence charSequence = this.f13581;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f13604 - this.f13599);
            if (round > 0 && round2 > 0) {
                this.f13595 = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f13595);
                CharSequence charSequence2 = this.f13581;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f13601.descent(), this.f13601);
                if (this.f13597 == null) {
                    this.f13597 = new Paint(3);
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15113() {
        if (this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
            m15103();
            m15107(this.f13569);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15111(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f13576, charSequence)) {
            this.f13576 = charSequence;
            this.f13581 = null;
            Bitmap bitmap = this.f13595;
            if (bitmap != null) {
                bitmap.recycle();
                this.f13595 = null;
            }
            m15113();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static int m15094(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m15096(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15110(Typeface typeface) {
        boolean z;
        C3207 r0 = this.f13574;
        boolean z2 = true;
        if (r0 != null) {
            r0.f14565 = true;
        }
        if (this.f13578 != typeface) {
            this.f13578 = typeface;
            z = true;
        } else {
            z = false;
        }
        C3207 r3 = this.f13605;
        if (r3 != null) {
            r3.f14565 = true;
        }
        if (this.f13565 != typeface) {
            this.f13565 = typeface;
        } else {
            z2 = false;
        }
        if ((z || z2) && this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
            m15103();
            m15107(this.f13569);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15115(Typeface typeface) {
        C3207 r0 = this.f13574;
        boolean z = true;
        if (r0 != null) {
            r0.f14565 = true;
        }
        if (this.f13578 != typeface) {
            this.f13578 = typeface;
        } else {
            z = false;
        }
        if (z && this.f13575.getHeight() > 0 && this.f13575.getWidth() > 0) {
            m15103();
            m15107(this.f13569);
        }
    }
}
