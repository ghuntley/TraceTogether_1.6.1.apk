package o;

/* renamed from: o.ŧӀ  reason: contains not printable characters */
final class C0573 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C0305 f4482;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ boolean f4483;

    C0573(C0305 r1, boolean z) {
        this.f4482 = r1;
        this.f4483 = z;
    }

    public final void run() {
        boolean r0 = this.f4482.f14314.m14094();
        boolean r1 = this.f4482.f14314.m14102();
        this.f4482.f14314.m14109(this.f4483);
        if (r1 == this.f4483) {
            this.f4482.f14314.t_().m11713().m11603("Default data collection state already set to", Boolean.valueOf(this.f4483));
        }
        if (this.f4482.f14314.m14094() == r0 || this.f4482.f14314.m14094() != this.f4482.f14314.m14102()) {
            this.f4482.f14314.t_().m11708().m11605("Default data collection is different than actual status", Boolean.valueOf(this.f4483), Boolean.valueOf(r0));
        }
        this.f4482.m4312();
    }
}
