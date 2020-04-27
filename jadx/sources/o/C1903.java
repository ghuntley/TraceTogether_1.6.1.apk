package o;

import o.C2319;

/* renamed from: o.Λ  reason: contains not printable characters */
class C1903 implements C2851 {

    /* renamed from: ı  reason: contains not printable characters */
    private C2656 f9638 = null;

    C1903() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10373() {
        if (this.f9638 == null) {
            this.f9638 = new C2656(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10372() {
        return this.f9638 != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m10374(C2319.C2320 r2) {
        this.f9638.m14067(C2656.m14063(r2));
    }

    public C2319 getLifecycle() {
        if (this.f9638 == null) {
            this.f9638 = new C2656(this);
        }
        return this.f9638;
    }
}
