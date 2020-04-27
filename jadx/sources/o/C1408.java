package o;

/* renamed from: o.ɪԑ  reason: contains not printable characters */
public final class C1408 extends C0565 implements Cloneable {

    /* renamed from: ı  reason: contains not printable characters */
    public float f7702;

    /* renamed from: ǃ  reason: contains not printable characters */
    public float f7703;

    /* renamed from: ɩ  reason: contains not printable characters */
    public float f7704;

    /* renamed from: Ι  reason: contains not printable characters */
    public float f7705;

    /* renamed from: ι  reason: contains not printable characters */
    public float f7706;

    public C1408(float f, float f2, float f3) {
        this.f7704 = f;
        this.f7703 = f2;
        this.f7702 = f3;
        if (f3 >= 0.0f) {
            this.f7705 = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m8593(float f, float f2, float f3, C0723 r24) {
        float f4 = f;
        C0723 r9 = r24;
        float f5 = this.f7706;
        if (f5 == 0.0f) {
            r9.m5849(f4, 0.0f);
            return;
        }
        float f6 = ((this.f7704 * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f7703;
        float f8 = f2 + this.f7705;
        float f9 = (this.f7702 * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            r9.m5849(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        r9.m5849(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        r24.m5852(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        r24.m5852(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        r24.m5852(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        r9.m5849(f4, 0.0f);
    }
}
