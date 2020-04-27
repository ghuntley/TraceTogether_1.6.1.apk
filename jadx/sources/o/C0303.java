package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import o.C0858;
import o.C0913;

/* renamed from: o.ıƩ  reason: contains not printable characters */
public class C0303 {

    /* renamed from: ı  reason: contains not printable characters */
    public final int f3578;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private int f3579;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final float f3580;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final ColorStateList f3581;

    /* renamed from: ɪ  reason: contains not printable characters */
    private String f3582;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final float f3583;

    /* renamed from: Ι  reason: contains not printable characters */
    public final float f3584;

    /* renamed from: ι  reason: contains not printable characters */
    public final ColorStateList f3585;

    /* renamed from: І  reason: contains not printable characters */
    public Typeface f3586;

    /* renamed from: і  reason: contains not printable characters */
    public final float f3587;

    /* renamed from: Ӏ  reason: contains not printable characters */
    boolean f3588 = false;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final int f3589;

    public C0303(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C0858.Aux.f5614);
        this.f3584 = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f3585 = C0344.m4473(context, obtainStyledAttributes, 3);
        C0344.m4473(context, obtainStyledAttributes, 4);
        C0344.m4473(context, obtainStyledAttributes, 5);
        this.f3578 = obtainStyledAttributes.getInt(2, 0);
        this.f3579 = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f3589 = obtainStyledAttributes.getResourceId(i2, 0);
        this.f3582 = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f3581 = C0344.m4473(context, obtainStyledAttributes, 6);
        this.f3580 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f3583 = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f3587 = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4292(Context context, final C0413 r6) {
        m4289();
        if (this.f3589 == 0) {
            this.f3588 = true;
        }
        if (this.f3588) {
            r6.m4702(this.f3586, true);
            return;
        }
        try {
            C0913.m6729(context, this.f3589, new C0913.If() {
                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m4295(Typeface typeface) {
                    C0303 r0 = C0303.this;
                    r0.f3586 = Typeface.create(typeface, r0.f3578);
                    C0303 r3 = C0303.this;
                    r3.f3588 = true;
                    r6.m4702(r3.f3586, false);
                }

                /* renamed from: ǃ  reason: contains not printable characters */
                public final void m4294(int i) {
                    C0303.this.f3588 = true;
                    r6.m4703(i);
                }
            }, (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f3588 = true;
            r6.m4703(1);
        } catch (Exception unused2) {
            this.f3588 = true;
            r6.m4703(-3);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4289() {
        String str;
        if (this.f3586 == null && (str = this.f3582) != null) {
            this.f3586 = Typeface.create(str, this.f3578);
        }
        if (this.f3586 == null) {
            int i = this.f3579;
            if (i == 1) {
                this.f3586 = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f3586 = Typeface.SERIF;
            } else if (i != 3) {
                this.f3586 = Typeface.DEFAULT;
            } else {
                this.f3586 = Typeface.MONOSPACE;
            }
            this.f3586 = Typeface.create(this.f3586, this.f3578);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4290(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f3578;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3584);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4293(Context context, final TextPaint textPaint, final C0413 r4) {
        m4289();
        m4290(textPaint, this.f3586);
        m4292(context, new C0413() {
            /* renamed from: ı  reason: contains not printable characters */
            public final void m4296(Typeface typeface, boolean z) {
                C0303.this.m4290(textPaint, typeface);
                r4.m4702(typeface, z);
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m4297(int i) {
                r4.m4703(i);
            }
        });
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4291(Context context, TextPaint textPaint, C0413 r7) {
        m4293(context, textPaint, r7);
        ColorStateList colorStateList = this.f3585;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.f3585.getDefaultColor()) : -16777216);
        float f = this.f3587;
        float f2 = this.f3580;
        float f3 = this.f3583;
        ColorStateList colorStateList2 = this.f3581;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.f3581.getDefaultColor()) : 0);
    }
}
