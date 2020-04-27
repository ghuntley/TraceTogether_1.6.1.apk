package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ıъ  reason: contains not printable characters */
final class C0424 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0305 f4007;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f4008;

    C0424(C0305 r1, AtomicReference atomicReference) {
        this.f4007 = r1;
        this.f4008 = atomicReference;
    }

    public final void run() {
        synchronized (this.f4008) {
            try {
                this.f4008.set(this.f4007.r_().m13395(this.f4007.m11086().m11201()));
                this.f4008.notify();
            } catch (Throwable th) {
                this.f4008.notify();
                throw th;
            }
        }
    }
}
