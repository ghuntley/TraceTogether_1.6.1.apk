package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: o.ƖΙ  reason: contains not printable characters */
class C0655 implements Interpolator {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final float[] f4697;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final float[] f4698;

    C0655(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.f4698 = new float[i];
        this.f4697 = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, (float[]) null);
            this.f4698[i2] = fArr[0];
            this.f4697[i2] = fArr[1];
        }
    }

    C0655(float f, float f2, float f3, float f4) {
        this(m5469(f, f2, f3, f4));
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f4698.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f4698[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f4698;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f4697[i];
        }
        float[] fArr2 = this.f4697;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Path m5469(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
