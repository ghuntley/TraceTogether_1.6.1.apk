package o;

/* renamed from: o.ıɵ  reason: contains not printable characters */
final class C0345 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0329 f3738;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C0365 f3739;

    C0345(C0365 r1, C0329 r2) {
        this.f3739 = r1;
        this.f3738 = r2;
    }

    public final void run() {
        try {
            C0329 r0 = (C0329) this.f3739.f3827.m15305(this.f3738);
            if (r0 == null) {
                this.f3739.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            r0.m4408(C0322.f3662, this.f3739);
            r0.m4403(C0322.f3662, (C3191) this.f3739);
            r0.m4402(C0322.f3662, (C2970) this.f3739);
        } catch (C3053 e) {
            if (e.getCause() instanceof Exception) {
                this.f3739.f3826.m6073((Exception) e.getCause());
            } else {
                this.f3739.f3826.m6073((Exception) e);
            }
        } catch (Exception e2) {
            this.f3739.f3826.m6073(e2);
        }
    }
}
