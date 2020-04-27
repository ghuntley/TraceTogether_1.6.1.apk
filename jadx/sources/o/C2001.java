package o;

import android.view.animation.Interpolator;

/* renamed from: o.ιɿ  reason: contains not printable characters */
abstract class C2001 implements Interpolator {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final float[] f9946;

    /* renamed from: Ι  reason: contains not printable characters */
    private final float f9947 = (1.0f / ((float) (this.f9946.length - 1)));

    protected C2001(float[] fArr) {
        this.f9946 = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f9946;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f9947;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f9946;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
