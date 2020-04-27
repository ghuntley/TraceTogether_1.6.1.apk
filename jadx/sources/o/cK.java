package o;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C3321cb;

public final class cK extends C3321cb {

    /* renamed from: ı  reason: contains not printable characters */
    private static final long f1861 = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: ǃ  reason: contains not printable characters */
    static final C0131 f1862;

    /* renamed from: ɩ  reason: contains not printable characters */
    static final cS f1863;

    /* renamed from: Ι  reason: contains not printable characters */
    private static cS f1864;

    /* renamed from: ι  reason: contains not printable characters */
    private static final TimeUnit f1865 = TimeUnit.SECONDS;

    /* renamed from: І  reason: contains not printable characters */
    private static Cif f1866;

    /* renamed from: ɹ  reason: contains not printable characters */
    private AtomicReference<Cif> f1867;

    /* renamed from: і  reason: contains not printable characters */
    private ThreadFactory f1868;

    static {
        C0131 r0 = new C0131(new cS("RxCachedThreadSchedulerShutdown"));
        f1862 = r0;
        r0.m1899();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f1864 = new cS("RxCachedThreadScheduler", max);
        f1863 = new cS("RxCachedWorkerPoolEvictor", max);
        Cif ifVar = new Cif(0, (TimeUnit) null, f1864);
        f1866 = ifVar;
        ifVar.m1884();
    }

    /* renamed from: o.cK$if  reason: invalid class name */
    static final class Cif implements Runnable {

        /* renamed from: ı  reason: contains not printable characters */
        private final ScheduledExecutorService f1869;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private final ThreadFactory f1870;

        /* renamed from: ǃ  reason: contains not printable characters */
        final long f1871;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C3328ci f1872;

        /* renamed from: Ι  reason: contains not printable characters */
        final ConcurrentLinkedQueue<C0131> f1873;

        /* renamed from: ι  reason: contains not printable characters */
        private final Future<?> f1874;

        Cif(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFuture;
            this.f1871 = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f1873 = new ConcurrentLinkedQueue<>();
            this.f1872 = new C3328ci();
            this.f1870 = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, cK.f1863);
                long j2 = this.f1871;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f1869 = scheduledExecutorService;
            this.f1874 = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final C0131 m1885() {
            if (this.f1872.f1970) {
                return cK.f1862;
            }
            while (!this.f1873.isEmpty()) {
                C0131 poll = this.f1873.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C0131 r0 = new C0131(this.f1870);
            this.f1872.m1967(r0);
            return r0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final void m1884() {
            this.f1872.m1966();
            Future<?> future = this.f1874;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f1869;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public final void run() {
            if (!this.f1873.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<C0131> it = this.f1873.iterator();
                while (it.hasNext()) {
                    C0131 next = it.next();
                    if (next.f1875 > nanoTime) {
                        return;
                    }
                    if (this.f1873.remove(next) && this.f1872.m1965(next)) {
                        next.m1959();
                    }
                }
            }
        }
    }

    public cK() {
        this(f1864);
    }

    private cK(ThreadFactory threadFactory) {
        this.f1868 = threadFactory;
        this.f1867 = new AtomicReference<>(f1866);
        m1950();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1883() {
        Cif ifVar = new Cif(f1861, f1865, this.f1868);
        if (!this.f1867.compareAndSet(f1866, ifVar)) {
            ifVar.m1884();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3321cb.Cif m1882() {
        return new C0132(this.f1867.get());
    }

    /* renamed from: o.cK$ɩ  reason: contains not printable characters */
    static final class C0132 extends C3321cb.Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private final C3328ci f1876;

        /* renamed from: ǃ  reason: contains not printable characters */
        private AtomicBoolean f1877 = new AtomicBoolean();

        /* renamed from: Ι  reason: contains not printable characters */
        private final C0131 f1878;

        /* renamed from: ι  reason: contains not printable characters */
        private final Cif f1879;

        C0132(Cif ifVar) {
            this.f1879 = ifVar;
            this.f1876 = new C3328ci();
            this.f1878 = ifVar.m1885();
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1887() {
            if (this.f1877.compareAndSet(false, true)) {
                this.f1876.m1966();
                Cif ifVar = this.f1879;
                C0131 r1 = this.f1878;
                r1.f1875 = System.nanoTime() + ifVar.f1871;
                ifVar.f1873.offer(r1);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3326cg m1886(Runnable runnable, TimeUnit timeUnit) {
            if (this.f1876.f1970) {
                return C3345cx.INSTANCE;
            }
            return this.f1878.m1895(runnable, timeUnit, this.f1876);
        }
    }

    /* renamed from: o.cK$ı  reason: contains not printable characters */
    static final class C0131 extends cM {

        /* renamed from: Ι  reason: contains not printable characters */
        long f1875 = 0;

        C0131(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
