package o;

import android.os.Bundle;

/* renamed from: o.ƾǃ  reason: contains not printable characters */
final class C0823 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ boolean f5361;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0856 f5362;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ long f5363;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0847 f5364;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C0856 f5365;

    C0823(C0847 r1, boolean z, long j, C0856 r5, C0856 r6) {
        this.f5364 = r1;
        this.f5361 = z;
        this.f5363 = j;
        this.f5362 = r5;
        this.f5365 = r6;
    }

    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.f5364.r_().m13372(C2529.f11516)) {
            z = this.f5361 && this.f5364.f5544 != null;
            if (z) {
                C0847 r3 = this.f5364;
                r3.m6321(r3.f5544, true, this.f5363);
            }
        } else {
            if (this.f5361 && this.f5364.f5544 != null) {
                C0847 r0 = this.f5364;
                r0.m6321(r0.f5544, true, this.f5363);
            }
            z = false;
        }
        C0856 r32 = this.f5362;
        if (r32 == null || r32.f5573 != this.f5365.f5573 || !C2151.m11340(this.f5362.f5574, this.f5365.f5574) || !C2151.m11340(this.f5362.f5572, this.f5365.f5572)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            C0847.m6320(this.f5365, bundle, true);
            C0856 r2 = this.f5362;
            if (r2 != null) {
                if (r2.f5572 != null) {
                    bundle.putString("_pn", this.f5362.f5572);
                }
                bundle.putString("_pc", this.f5362.f5574);
                bundle.putLong("_pi", this.f5362.f5573);
            }
            if (this.f5364.r_().m13372(C2529.f11516) && z) {
                long r22 = this.f5364.m11084().f8945.m10230();
                if (r22 > 0) {
                    this.f5364.m15901().m11380(bundle, r22);
                }
            }
            this.f5364.m11088().m4350("auto", "_vs", bundle);
        }
        C0847 r02 = this.f5364;
        r02.f5544 = this.f5365;
        r02.m11089().m6384(this.f5365);
    }
}
