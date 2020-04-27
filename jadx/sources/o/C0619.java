package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.Ɛı  reason: contains not printable characters */
final class C0619 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C0305 f4584;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f4585;

    C0619(C0305 r1, AtomicReference atomicReference) {
        this.f4584 = r1;
        this.f4585 = atomicReference;
    }

    public final void run() {
        synchronized (this.f4585) {
            try {
                this.f4585.set(Double.valueOf(this.f4584.r_().m13390(this.f4584.m11086().m11201(), C2529.f11593)));
                this.f4585.notify();
            } catch (Throwable th) {
                this.f4585.notify();
                throw th;
            }
        }
    }
}
