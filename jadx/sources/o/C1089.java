package o;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: o.ɏ  reason: contains not printable characters */
public class C1089 implements TypeEvaluator<Matrix> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final float[] f6494 = new float[9];

    /* renamed from: Ι  reason: contains not printable characters */
    private final Matrix f6495 = new Matrix();

    /* renamed from: ι  reason: contains not printable characters */
    private final float[] f6496 = new float[9];

    /* renamed from: ǃ  reason: contains not printable characters */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f6494);
        matrix2.getValues(this.f6496);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f6496;
            float f2 = fArr[i];
            float[] fArr2 = this.f6494;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f6495.setValues(this.f6496);
        return this.f6495;
    }
}
