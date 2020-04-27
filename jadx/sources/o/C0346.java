package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import o.C0624;
import o.C1841;
import o.C3616p;

/* renamed from: o.ıɹ  reason: contains not printable characters */
class C0346 implements C3616p.C0270, C0624.C0625 {

    /* renamed from: ǃ  reason: contains not printable characters */
    final RectF f3740 = new RectF();

    /* renamed from: Ӏ  reason: contains not printable characters */
    public void m4494(C1841.C1842 r1) {
    }

    C0346() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m4484() {
        C0624.f4590 = this;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m4491(C1841.C1842 r7, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0624 r8 = m4477(context, colorStateList, f, f2, f3);
        r8.f4605 = r7.m10195();
        r8.invalidateSelf();
        r7.m10192(r8);
        m4488(r7);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private C0624 m4477(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0624(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public void m4488(C1841.C1842 r5) {
        Rect rect = new Rect();
        m4478(r5).getPadding(rect);
        r5.m10190((int) Math.ceil((double) m4492(r5)), (int) Math.ceil((double) m4486(r5)));
        r5.m10191(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: І  reason: contains not printable characters */
    public void m4493(C1841.C1842 r3) {
        C0624 r0 = m4478(r3);
        r0.f4605 = r3.m10195();
        r0.invalidateSelf();
        m4488(r3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m4485(C1841.C1842 r1, ColorStateList colorStateList) {
        C0624 r12 = m4478(r1);
        r12.m5336(colorStateList);
        r12.invalidateSelf();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public ColorStateList m4482(C1841.C1842 r1) {
        return m4478(r1).f4600;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m4487(C1841.C1842 r3, float f) {
        C0624 r0 = m4478(r3);
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (r0.f4598 != f2) {
                r0.f4598 = f2;
                r0.f4594 = true;
                r0.invalidateSelf();
            }
            m4488(r3);
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public float m4483(C1841.C1842 r1) {
        return m4478(r1).f4598;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m4490(C1841.C1842 r2, float f) {
        C0624 r22 = m4478(r2);
        r22.m5335(f, r22.f4595);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public float m4489(C1841.C1842 r1) {
        return m4478(r1).f4604;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m4481(C1841.C1842 r3, float f) {
        C0624 r0 = m4478(r3);
        r0.m5335(r0.f4604, f);
        m4488(r3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public float m4479(C1841.C1842 r1) {
        return m4478(r1).f4595;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public float m4492(C1841.C1842 r5) {
        C0624 r52 = m4478(r5);
        return (Math.max(r52.f4595, r52.f4598 + ((float) r52.f4592) + (r52.f4595 / 2.0f)) * 2.0f) + ((r52.f4595 + ((float) r52.f4592)) * 2.0f);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public float m4486(C1841.C1842 r6) {
        C0624 r62 = m4478(r6);
        return (Math.max(r62.f4595, r62.f4598 + ((float) r62.f4592) + ((r62.f4595 * 1.5f) / 2.0f)) * 2.0f) + (((r62.f4595 * 1.5f) + ((float) r62.f4592)) * 2.0f);
    }

    /* renamed from: і  reason: contains not printable characters */
    private C0624 m4478(C1841.C1842 r1) {
        return (C0624) r1.m10194();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m4480(Canvas canvas, RectF rectF, float f, Paint paint) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        float f2 = 2.0f * f;
        float width = (rectF.width() - f2) - 1.0f;
        float height = (rectF.height() - f2) - 1.0f;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            float f4 = -f3;
            this.f3740.set(f4, f4, f3, f3);
            int save = canvas.save();
            canvas2.translate(rectF2.left + f3, rectF2.top + f3);
            Canvas canvas3 = canvas;
            Paint paint2 = paint;
            canvas3.drawArc(this.f3740, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas3.drawArc(this.f3740, 180.0f, 90.0f, true, paint2);
            canvas2.translate(height, 0.0f);
            canvas2.rotate(90.0f);
            canvas3.drawArc(this.f3740, 180.0f, 90.0f, true, paint2);
            canvas2.translate(width, 0.0f);
            canvas2.rotate(90.0f);
            canvas3.drawArc(this.f3740, 180.0f, 90.0f, true, paint2);
            canvas2.restoreToCount(save);
            canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint2);
            canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint2);
        }
        canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
    }
}
