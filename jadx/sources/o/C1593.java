package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: o.ʁ  reason: contains not printable characters */
public final class C1593 extends C1578 {

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Rect f8442 = new Rect();

    /* renamed from: ɾ  reason: contains not printable characters */
    private C0742<ColorFilter, ColorFilter> f8443;

    /* renamed from: І  reason: contains not printable characters */
    private final Paint f8444 = new C0552(3);

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Rect f8445 = new Rect();

    C1593(C0379 r1, C1685 r2) {
        super(r1, r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9282(RectF rectF, Matrix matrix, boolean z) {
        super.m9256(rectF, matrix, z);
        Bitmap r3 = this.f8384.m4601(this.f8400.f8737);
        if (r3 != null) {
            rectF.set(0.0f, 0.0f, ((float) r3.getWidth()) * C2467.m12711(), ((float) r3.getHeight()) * C2467.m12711());
            this.f8399.mapRect(rectF);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m9281(T t, C2476<T> r3) {
        super.m9253(t, r3);
        if (t != C0349.f3761) {
            return;
        }
        if (r3 == null) {
            this.f8443 = null;
        } else {
            this.f8443 = new C1120(r3);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9280(Canvas canvas, Matrix matrix, int i) {
        Bitmap r0 = this.f8384.m4601(this.f8400.f8737);
        if (r0 != null && !r0.isRecycled()) {
            float r1 = C2467.m12711();
            this.f8444.setAlpha(i);
            C0742<ColorFilter, ColorFilter> r7 = this.f8443;
            if (r7 != null) {
                this.f8444.setColorFilter(r7.m5937());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f8445.set(0, 0, r0.getWidth(), r0.getHeight());
            this.f8442.set(0, 0, (int) (((float) r0.getWidth()) * r1), (int) (((float) r0.getHeight()) * r1));
            canvas.drawBitmap(r0, this.f8445, this.f8442, this.f8444);
            canvas.restore();
        }
    }
}
