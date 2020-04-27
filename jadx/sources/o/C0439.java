package o;

/* renamed from: o.ıҍ  reason: contains not printable characters */
final class C0439 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C0329 f4025;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0407 f4026;

    C0439(C0407 r1, C0329 r2) {
        this.f4026 = r1;
        this.f4025 = r2;
    }

    public final void run() {
        synchronized (this.f4026.f3966) {
            if (this.f4026.f3965 != null) {
                this.f4026.f3965.m15936(this.f4025);
            }
        }
    }
}
