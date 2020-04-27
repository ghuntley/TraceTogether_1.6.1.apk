package o;

/* renamed from: o.ıʀ  reason: contains not printable characters */
final class C0354 implements Runnable {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0329 f3792;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C0355 f3793;

    C0354(C0355 r1, C0329 r2) {
        this.f3793 = r1;
        this.f3792 = r2;
    }

    public final void run() {
        if (this.f3792.m4405()) {
            this.f3793.f3795.m6088();
            return;
        }
        try {
            this.f3793.f3795.m6079(this.f3793.f3794.m15305(this.f3792));
        } catch (C3053 e) {
            if (e.getCause() instanceof Exception) {
                this.f3793.f3795.m6073((Exception) e.getCause());
            } else {
                this.f3793.f3795.m6073((Exception) e);
            }
        } catch (Exception e2) {
            this.f3793.f3795.m6073(e2);
        }
    }
}
