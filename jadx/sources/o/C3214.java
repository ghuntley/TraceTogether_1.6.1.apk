package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ւӀ  reason: contains not printable characters */
final class C3214 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C0305 f14579;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f14580;

    C3214(C0305 r1, AtomicReference atomicReference) {
        this.f14579 = r1;
        this.f14580 = atomicReference;
    }

    public final void run() {
        synchronized (this.f14580) {
            try {
                this.f14580.set(Boolean.valueOf(this.f14579.r_().m13393(this.f14579.m11086().m11201())));
                this.f14580.notify();
            } catch (Throwable th) {
                this.f14580.notify();
                throw th;
            }
        }
    }
}
