package o;

/* renamed from: o.ʫ  reason: contains not printable characters */
public abstract class C1698 extends C2089 {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f8876;

    C1698(C2658 r1) {
        super(r1);
        this.f14314.m14097(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɟ  reason: contains not printable characters */
    public abstract boolean m9664();

    /* access modifiers changed from: protected */
    /* renamed from: ɺ  reason: contains not printable characters */
    public void m9665() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ʅ  reason: contains not printable characters */
    public final boolean m9666() {
        return this.f8876;
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public final void m9662() {
        if (!m9666()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public final void m9661() {
        if (this.f8876) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!m9664()) {
            this.f14314.m14114();
            this.f8876 = true;
        }
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    public final void m9663() {
        if (!this.f8876) {
            m9665();
            this.f14314.m14114();
            this.f8876 = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
