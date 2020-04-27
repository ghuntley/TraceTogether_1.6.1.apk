package o;

import o.C2745;

/* renamed from: o.Ιѕ  reason: contains not printable characters */
final class C1883 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2023 f9573;

    /* renamed from: ɩ  reason: contains not printable characters */
    private long f9574;

    public C1883(C2023 r1) {
        C2745.C2746.m14555(r1);
        this.f9573 = r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10288() {
        this.f9574 = this.f9573.m10847();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10287() {
        this.f9574 = 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m10289(long j) {
        if (this.f9574 != 0 && this.f9573.m10847() - this.f9574 < 3600000) {
            return false;
        }
        return true;
    }
}
