package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: o.Γı  reason: contains not printable characters */
public final class C1772 extends C1578 {

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Path f9099 = new Path();

    /* renamed from: ɹ  reason: contains not printable characters */
    private final float[] f9100 = new float[8];

    /* renamed from: ɾ  reason: contains not printable characters */
    private final C1685 f9101;

    /* renamed from: І  reason: contains not printable characters */
    private final Paint f9102 = new C0552();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final RectF f9103 = new RectF();

    /* renamed from: ӏ  reason: contains not printable characters */
    private C0742<ColorFilter, ColorFilter> f9104;

    C1772(C0379 r2, C1685 r3) {
        super(r2, r3);
        this.f9101 = r3;
        this.f9102.setAlpha(0);
        this.f9102.setStyle(Paint.Style.FILL);
        this.f9102.setColor(r3.f8729);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9883(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f9101.f8729);
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.f8387.f6577 == null ? 100 : this.f8387.f6577.m5937().intValue()))) / 100.0f) * 255.0f);
            this.f9102.setAlpha(intValue);
            C0742<ColorFilter, ColorFilter> r0 = this.f9104;
            if (r0 != null) {
                this.f9102.setColorFilter(r0.m5937());
            }
            if (intValue > 0) {
                float[] fArr = this.f9100;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f9101.f8730;
                float[] fArr2 = this.f9100;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f9101.f8730;
                this.f9100[5] = (float) this.f9101.f8726;
                float[] fArr3 = this.f9100;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f9101.f8726;
                matrix.mapPoints(this.f9100);
                this.f9099.reset();
                Path path = this.f9099;
                float[] fArr4 = this.f9100;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f9099;
                float[] fArr5 = this.f9100;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f9099;
                float[] fArr6 = this.f9100;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f9099;
                float[] fArr7 = this.f9100;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f9099;
                float[] fArr8 = this.f9100;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f9099.close();
                canvas.drawPath(this.f9099, this.f9102);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9885(RectF rectF, Matrix matrix, boolean z) {
        super.m9256(rectF, matrix, z);
        this.f9103.set(0.0f, 0.0f, (float) this.f9101.f8730, (float) this.f9101.f8726);
        this.f8399.mapRect(this.f9103);
        rectF.set(this.f9103);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m9884(T t, C2476<T> r3) {
        super.m9253(t, r3);
        if (t != C0349.f3761) {
            return;
        }
        if (r3 == null) {
            this.f9104 = null;
        } else {
            this.f9104 = new C1120(r3);
        }
    }
}
