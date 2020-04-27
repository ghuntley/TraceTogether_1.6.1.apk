package o;

/* renamed from: o.ıΞ  reason: contains not printable characters */
class C0384 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final long f3939 = 1000000;

    /* renamed from: ı  reason: contains not printable characters */
    long f3940;

    /* renamed from: Ι  reason: contains not printable characters */
    private C3291bb f3941;

    public C0384(C3291bb bbVar) {
        if (bbVar != null) {
            this.f3941 = bbVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m4641(long j) {
        C3291bb bbVar = this.f3941;
        return j - this.f3940 >= bbVar.f1727.m1543(bbVar.f1726) * f3939;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m4640(long j) {
        this.f3940 = j;
        C3291bb bbVar = this.f3941;
        this.f3941 = new C3291bb(bbVar.f1726 + 1, bbVar.f1727, bbVar.f1728);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m4639() {
        this.f3940 = 0;
        C3291bb bbVar = this.f3941;
        this.f3941 = new C3291bb(bbVar.f1727, bbVar.f1728);
    }
}
