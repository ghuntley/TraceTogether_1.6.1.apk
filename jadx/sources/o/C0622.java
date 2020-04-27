package o;

/* renamed from: o.ƐІ  reason: contains not printable characters */
public final class C0622 extends C0565 {

    /* renamed from: ı  reason: contains not printable characters */
    private final float f4588;

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m5331() {
        return true;
    }

    public C0622(float f) {
        this.f4588 = f - 0.001f;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5330(float f, float f2, float f3, C0723 r12) {
        float sqrt = (float) ((((double) this.f4588) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f4588, 2.0d) - Math.pow((double) sqrt, 2.0d));
        r12.m5851(f2 - sqrt, ((float) (-((((double) this.f4588) * Math.sqrt(2.0d)) - ((double) this.f4588)))) + sqrt2, 270.0f, 0.0f);
        r12.m5849(f2, (float) (-((((double) this.f4588) * Math.sqrt(2.0d)) - ((double) this.f4588))));
        r12.m5849(f2 + sqrt, ((float) (-((((double) this.f4588) * Math.sqrt(2.0d)) - ((double) this.f4588)))) + sqrt2);
    }
}
