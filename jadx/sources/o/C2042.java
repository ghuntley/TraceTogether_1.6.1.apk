package o;

/* renamed from: o.ιϵ  reason: contains not printable characters */
abstract class C2042 extends C2053 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f10086;

    C2042(C1924 r1) {
        super(r1);
        this.f10106.m10493(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract boolean m10933();

    /* access modifiers changed from: package-private */
    /* renamed from: ƚ  reason: contains not printable characters */
    public final boolean m10932() {
        return this.f10086;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ɨ  reason: contains not printable characters */
    public final void m10931() {
        if (!m10932()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public final void m10930() {
        if (!this.f10086) {
            m10933();
            this.f10106.m10509();
            this.f10086 = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
