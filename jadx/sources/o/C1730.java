package o;

/* renamed from: o.ͱӀ  reason: contains not printable characters */
final class C1730 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Runnable f8946 = new C1732(this);

    /* renamed from: Ι  reason: contains not printable characters */
    private C1798 f8947;

    /* renamed from: ι  reason: contains not printable characters */
    final /* synthetic */ C1729 f8948;

    C1730(C1729 r1) {
        this.f8948 = r1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9752() {
        this.f8948.y_();
        if (!this.f8948.r_().m13372(C2529.f11610)) {
            return;
        }
        if (!C1150.m7608() || !this.f8948.r_().m13384(this.f8948.m11086().m11201(), C2529.f11540)) {
            this.f8948.f8942.removeCallbacks(this.f8946);
        } else if (this.f8947 != null) {
            this.f8948.f8942.removeCallbacks(this.f8947);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9753() {
        if (!this.f8948.r_().m13372(C2529.f11610)) {
            return;
        }
        if (!C1150.m7608() || !this.f8948.r_().m13384(this.f8948.m11086().m11201(), C2529.f11540)) {
            this.f8948.f8942.postDelayed(this.f8946, 2000);
            return;
        }
        this.f8947 = new C1798(this, this.f8948.w_().m10846());
        this.f8948.f8942.postDelayed(this.f8947, 2000);
    }
}
