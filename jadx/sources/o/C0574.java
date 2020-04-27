package o;

import java.util.concurrent.CancellationException;

/* renamed from: o.ŧӏ  reason: contains not printable characters */
final class C0574 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C0329 f4484;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0461 f4485;

    C0574(C0461 r1, C0329 r2) {
        this.f4485 = r1;
        this.f4484 = r2;
    }

    public final void run() {
        try {
            C0329 r0 = this.f4485.f4077.m16059(this.f4484.m4401());
            if (r0 == null) {
                this.f4485.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            r0.m4408(C0322.f3662, this.f4485);
            r0.m4403(C0322.f3662, (C3191) this.f4485);
            r0.m4402(C0322.f3662, (C2970) this.f4485);
        } catch (C3053 e) {
            if (e.getCause() instanceof Exception) {
                this.f4485.onFailure((Exception) e.getCause());
            } else {
                this.f4485.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f4485.m4789();
        } catch (Exception e2) {
            this.f4485.onFailure(e2);
        }
    }
}
