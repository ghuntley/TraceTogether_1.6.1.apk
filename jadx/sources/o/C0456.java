package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ıԐ  reason: contains not printable characters */
final class C0456 implements Runnable {

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ AtomicReference f4073;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C0305 f4074;

    C0456(C0305 r1, AtomicReference atomicReference) {
        this.f4074 = r1;
        this.f4073 = atomicReference;
    }

    public final void run() {
        synchronized (this.f4073) {
            try {
                this.f4073.set(Long.valueOf(this.f4074.r_().m13370(this.f4074.m11086().m11201(), C2529.f11599)));
                this.f4073.notify();
            } catch (Throwable th) {
                this.f4073.notify();
                throw th;
            }
        }
    }
}
