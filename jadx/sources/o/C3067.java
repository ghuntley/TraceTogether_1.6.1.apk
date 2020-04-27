package o;

/* renamed from: o.է  reason: contains not printable characters */
abstract class C3067 extends C3138 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f14014;

    C3067(C2658 r1) {
        super(r1);
        this.f14314.m14098(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public void m15645() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract boolean m15650();

    /* access modifiers changed from: package-private */
    /* renamed from: ǀ  reason: contains not printable characters */
    public final boolean m15646() {
        return this.f14014;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɼ  reason: contains not printable characters */
    public final void m15649() {
        if (!m15646()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: ɟ  reason: contains not printable characters */
    public final void m15648() {
        if (this.f14014) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!m15650()) {
            this.f14314.m14114();
            this.f14014 = true;
        }
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    public final void m15647() {
        if (!this.f14014) {
            m15645();
            this.f14314.m14114();
            this.f14014 = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
