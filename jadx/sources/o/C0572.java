package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ŧі  reason: contains not printable characters */
final class C0572 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f4480;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0305 f4481;

    C0572(C0305 r1, AtomicReference atomicReference) {
        this.f4481 = r1;
        this.f4480 = atomicReference;
    }

    public final void run() {
        synchronized (this.f4480) {
            try {
                this.f4480.set(Integer.valueOf(this.f4481.r_().m13387(this.f4481.m11086().m11201(), C2529.f11602)));
                this.f4480.notify();
            } catch (Throwable th) {
                this.f4480.notify();
                throw th;
            }
        }
    }
}
