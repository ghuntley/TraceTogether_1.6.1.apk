package o;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.C3321cb;

public final class cR extends C3321cb {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static cS f1919 = new cS("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: ɩ  reason: contains not printable characters */
    private static ScheduledExecutorService f1920;

    /* renamed from: Ι  reason: contains not printable characters */
    private AtomicReference<ScheduledExecutorService> f1921;

    /* renamed from: ι  reason: contains not printable characters */
    private ThreadFactory f1922;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f1920 = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public cR() {
        this(f1919);
    }

    private cR(ThreadFactory threadFactory) {
        this.f1921 = new AtomicReference<>();
        this.f1922 = threadFactory;
        this.f1921.lazySet(cT.m1931(threadFactory));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1925() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.f1921.get();
            if (scheduledExecutorService != f1920) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = cT.m1931(this.f1922);
            }
        } while (!this.f1921.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3321cb.Cif m1923() {
        return new C0136(this.f1921.get());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3326cg m1924(Runnable runnable, TimeUnit timeUnit) {
        if (runnable != null) {
            cP cPVar = new cP(runnable);
            try {
                cPVar.m1902(this.f1921.get().submit(cPVar));
                return cPVar;
            } catch (RejectedExecutionException e) {
                cX.m1936(e);
                return C3345cx.INSTANCE;
            }
        } else {
            throw new NullPointerException("run is null");
        }
    }

    /* renamed from: o.cR$ɩ  reason: contains not printable characters */
    static final class C0136 extends C3321cb.Cif {

        /* renamed from: ɩ  reason: contains not printable characters */
        private volatile boolean f1923;

        /* renamed from: Ι  reason: contains not printable characters */
        private ScheduledExecutorService f1924;

        /* renamed from: ι  reason: contains not printable characters */
        private C3328ci f1925 = new C3328ci();

        C0136(ScheduledExecutorService scheduledExecutorService) {
            this.f1924 = scheduledExecutorService;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3326cg m1926(Runnable runnable, TimeUnit timeUnit) {
            if (this.f1923) {
                return C3345cx.INSTANCE;
            }
            if (runnable != null) {
                cQ cQVar = new cQ(runnable, this.f1925);
                this.f1925.m1967(cQVar);
                try {
                    cQVar.m1921(this.f1924.submit(cQVar));
                    return cQVar;
                } catch (RejectedExecutionException e) {
                    m1927();
                    cX.m1936(e);
                    return C3345cx.INSTANCE;
                }
            } else {
                throw new NullPointerException("run is null");
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1927() {
            if (!this.f1923) {
                this.f1923 = true;
                this.f1925.m1966();
            }
        }
    }
}
