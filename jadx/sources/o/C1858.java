package o;

import android.os.Bundle;

/* renamed from: o.ΙϜ  reason: contains not printable characters */
final class C1858 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2335 f9494 = new C1792(this, this.f9495.f14314);

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C1729 f9495;

    /* renamed from: ɩ  reason: contains not printable characters */
    private long f9496;

    /* renamed from: ι  reason: contains not printable characters */
    private long f9497;

    public C1858(C1729 r3) {
        this.f9495 = r3;
        this.f9497 = r3.w_().m10847();
        this.f9496 = this.f9497;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10231(long j) {
        this.f9495.y_();
        this.f9494.m12177();
        this.f9497 = j;
        this.f9496 = this.f9497;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10234(long j) {
        this.f9494.m12177();
        if (this.f9497 != 0) {
            this.f9495.s_().f10786.m13398(this.f9495.s_().f10786.m13399() + (j - this.f9497));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10233() {
        this.f9494.m12177();
        this.f9497 = 0;
        this.f9496 = this.f9497;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10229() {
        this.f9495.y_();
        m10232(false, false, this.f9495.w_().m10847());
        this.f9495.m11082().m13594(this.f9495.w_().m10847());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m10232(boolean z, boolean z2, long j) {
        this.f9495.y_();
        this.f9495.m9662();
        if (!C0866.m6431() || !this.f9495.r_().m13372(C2529.f11564)) {
            j = this.f9495.w_().m10847();
        }
        if (!C1174.m7692() || !this.f9495.r_().m13372(C2529.f11531) || this.f9495.f14314.m14094()) {
            this.f9495.s_().f10772.m13398(this.f9495.w_().m10846());
        }
        long j2 = j - this.f9497;
        if (z || j2 >= 1000) {
            if (this.f9495.r_().m13372(C2529.f11516) && !z2) {
                j2 = m10230();
            }
            this.f9495.s_().f10786.m13398(j2);
            this.f9495.t_().m11713().m11603("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C0847.m6320(this.f9495.m11085().m6337(), bundle, true);
            if (this.f9495.r_().m13372(C2529.f11516) && !this.f9495.r_().m13372(C2529.f11525) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f9495.r_().m13372(C2529.f11525) || !z2) {
                this.f9495.m11088().m4344("auto", "_e", bundle);
            }
            this.f9497 = j;
            this.f9494.m12177();
            this.f9494.m12178(Math.max(0, 3600000 - this.f9495.s_().f10786.m13399()));
            return true;
        }
        this.f9495.t_().m11713().m11603("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final long m10230() {
        long r0 = this.f9495.w_().m10847();
        long j = r0 - this.f9496;
        this.f9496 = r0;
        return j;
    }
}
