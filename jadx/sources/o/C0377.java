package o;

import java.util.Random;

/* renamed from: o.ıͼ  reason: contains not printable characters */
class C0377 implements aV {

    /* renamed from: ǃ  reason: contains not printable characters */
    final Random f3869;

    /* renamed from: Ι  reason: contains not printable characters */
    final aV f3870;

    /* renamed from: ι  reason: contains not printable characters */
    final double f3871;

    public C0377(aV aVVar, double d) {
        this(aVVar, d, new Random());
    }

    public C0377(aV aVVar, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (aVVar == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random != null) {
            this.f3870 = aVVar;
            this.f3871 = d;
            this.f3869 = random;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public long m4588(int i) {
        return (long) (m4587() * ((double) this.f3870.m1543(i)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public double m4587() {
        double d = this.f3871;
        double d2 = 1.0d - d;
        return d2 + (((d + 1.0d) - d2) * this.f3869.nextDouble());
    }
}
