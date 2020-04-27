package o;

/* renamed from: o.ıɞ  reason: contains not printable characters */
final class C0332 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C0366 f3687;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C3178 f3688;

    C0332(C3178 r1, C0366 r2) {
        this.f3688 = r1;
        this.f3687 = r2;
    }

    public final void run() {
        synchronized (this.f3688.f14438.f14517) {
            if (!this.f3688.f14438.f14517.isEmpty()) {
                this.f3687.m4555(this.f3688.f14438.f14517.get(0));
            }
        }
    }
}
