package o;

import java.util.concurrent.Callable;

public final class cP extends cO implements Callable<Void> {
    public cP(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public Void call() {
        this.f1901 = Thread.currentThread();
        try {
            this.f1900.run();
            return null;
        } finally {
            lazySet(f1899);
            this.f1901 = null;
        }
    }
}
