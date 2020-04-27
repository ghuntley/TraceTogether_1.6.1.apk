package o;

/* renamed from: o.ȼı  reason: contains not printable characters */
final class C0982 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6002;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ boolean f6003;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C2113 f6004;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6005;

    C0982(C0848 r1, boolean z, C2113 r3, C2270 r4) {
        this.f6002 = r1;
        this.f6003 = z;
        this.f6004 = r3;
        this.f6005 = r4;
    }

    public final void run() {
        C2082 r0 = this.f6002.f5552;
        if (r0 == null) {
            this.f6002.t_().m11714().m11606("Discarding data. Failed to set user property");
            return;
        }
        this.f6002.m6376(r0, (C1519) this.f6003 ? null : this.f6004, this.f6005);
        this.f6002.m6359();
    }
}
