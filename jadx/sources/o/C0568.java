package o;

/* renamed from: o.ŧɹ  reason: contains not printable characters */
final class C0568 implements Runnable {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0329 f4470;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0449 f4471;

    C0568(C0449 r1, C0329 r2) {
        this.f4471 = r1;
        this.f4470 = r2;
    }

    public final void run() {
        synchronized (this.f4471.f4054) {
            if (this.f4471.f4053 != null) {
                this.f4471.f4053.onFailure(this.f4470.m4406());
            }
        }
    }
}
