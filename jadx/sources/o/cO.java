package o;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

abstract class cO extends AtomicReference<Future<?>> implements C3326cg {

    /* renamed from: ı  reason: contains not printable characters */
    private static FutureTask<Void> f1898 = new FutureTask<>(C3347cz.f2020, (Object) null);

    /* renamed from: ι  reason: contains not printable characters */
    protected static final FutureTask<Void> f1899 = new FutureTask<>(C3347cz.f2020, (Object) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    protected final Runnable f1900;

    /* renamed from: Ι  reason: contains not printable characters */
    protected Thread f1901;

    cO(Runnable runnable) {
        this.f1900 = runnable;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1901() {
        FutureTask<Void> futureTask;
        Future future = (Future) get();
        if (future != f1899 && future != (futureTask = f1898) && compareAndSet(future, futureTask) && future != null) {
            future.cancel(this.f1901 != Thread.currentThread());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1902(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f1899) {
                return;
            }
            if (future2 == f1898) {
                future.cancel(this.f1901 != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
