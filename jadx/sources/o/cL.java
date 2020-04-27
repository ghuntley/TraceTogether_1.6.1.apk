package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.C3321cb;

public final class cL extends C3321cb {

    /* renamed from: ı  reason: contains not printable characters */
    static final C0135 f1880;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static int f1881;

    /* renamed from: Ι  reason: contains not printable characters */
    private static cS f1882 = new cS("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);

    /* renamed from: ι  reason: contains not printable characters */
    private static C0134 f1883;

    /* renamed from: ɩ  reason: contains not printable characters */
    private ThreadFactory f1884;

    /* renamed from: і  reason: contains not printable characters */
    private AtomicReference<C0134> f1885;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f1881 = availableProcessors;
        C0135 r0 = new C0135(new cS("RxComputationShutdown"));
        f1880 = r0;
        r0.m1899();
        C0134 r02 = new C0134(0, f1882);
        f1883 = r02;
        for (C0135 r3 : r02.f1892) {
            r3.m1899();
        }
    }

    /* renamed from: o.cL$ǃ  reason: contains not printable characters */
    static final class C0134 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private long f1891;

        /* renamed from: Ι  reason: contains not printable characters */
        final C0135[] f1892;

        /* renamed from: ι  reason: contains not printable characters */
        private int f1893;

        C0134(int i, ThreadFactory threadFactory) {
            this.f1893 = i;
            this.f1892 = new C0135[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f1892[i2] = new C0135(threadFactory);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0135 m1894() {
            int i = this.f1893;
            if (i == 0) {
                return cL.f1880;
            }
            C0135[] r1 = this.f1892;
            long j = this.f1891;
            this.f1891 = 1 + j;
            return r1[(int) (j % ((long) i))];
        }
    }

    public cL() {
        this(f1882);
    }

    private cL(ThreadFactory threadFactory) {
        this.f1884 = threadFactory;
        this.f1885 = new AtomicReference<>(f1883);
        m1950();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3321cb.Cif m1888() {
        return new C0133(this.f1885.get().m1894());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3326cg m1889(Runnable runnable, TimeUnit timeUnit) {
        return this.f1885.get().m1894().m1898(runnable, timeUnit);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1890() {
        C0134 r0 = new C0134(f1881, this.f1884);
        if (!this.f1885.compareAndSet(f1883, r0)) {
            for (C0135 r3 : r0.f1892) {
                r3.m1899();
            }
        }
    }

    /* renamed from: o.cL$ı  reason: contains not printable characters */
    static final class C0133 extends C3321cb.Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private final C3328ci f1886 = new C3328ci();

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C0135 f1887;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C3346cy f1888 = new C3346cy();

        /* renamed from: Ι  reason: contains not printable characters */
        private volatile boolean f1889;

        /* renamed from: ι  reason: contains not printable characters */
        private final C3346cy f1890 = new C3346cy();

        C0133(C0135 r2) {
            this.f1887 = r2;
            this.f1890.m2042(this.f1888);
            this.f1890.m2042(this.f1886);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1893() {
            if (!this.f1889) {
                this.f1889 = true;
                this.f1890.m2041();
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3326cg m1891(Runnable runnable) {
            if (this.f1889) {
                return C3345cx.INSTANCE;
            }
            return this.f1887.m1895(runnable, TimeUnit.MILLISECONDS, this.f1888);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3326cg m1892(Runnable runnable, TimeUnit timeUnit) {
            if (this.f1889) {
                return C3345cx.INSTANCE;
            }
            return this.f1887.m1895(runnable, timeUnit, this.f1886);
        }
    }

    /* renamed from: o.cL$ɩ  reason: contains not printable characters */
    static final class C0135 extends cM {
        C0135(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
