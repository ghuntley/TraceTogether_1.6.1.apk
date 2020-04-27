package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.cb  reason: case insensitive filesystem */
public abstract class C3321cb {
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract Cif m1947();

    /* renamed from: ι  reason: contains not printable characters */
    public void m1950() {
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public C3326cg m1949(Runnable runnable) {
        return m1948(runnable, TimeUnit.NANOSECONDS);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C3326cg m1948(Runnable runnable, TimeUnit timeUnit) {
        Cif r0 = m1947();
        if (runnable != null) {
            C0146 r1 = new C0146(runnable, r0);
            r0.m1952(r1, timeUnit);
            return r1;
        }
        throw new NullPointerException("run is null");
    }

    /* renamed from: o.cb$if  reason: invalid class name */
    public static abstract class Cif implements C3326cg {
        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract C3326cg m1952(Runnable runnable, TimeUnit timeUnit);

        /* renamed from: ɩ  reason: contains not printable characters */
        public C3326cg m1951(Runnable runnable) {
            return m1952(runnable, TimeUnit.NANOSECONDS);
        }
    }

    /* renamed from: o.cb$ı  reason: contains not printable characters */
    static final class C0146 implements C3326cg, Runnable {

        /* renamed from: ǃ  reason: contains not printable characters */
        private Runnable f1960;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Cif f1961;

        /* renamed from: Ι  reason: contains not printable characters */
        private Thread f1962;

        C0146(Runnable runnable, Cif ifVar) {
            this.f1960 = runnable;
            this.f1961 = ifVar;
        }

        public final void run() {
            this.f1962 = Thread.currentThread();
            try {
                this.f1960.run();
            } finally {
                m1953();
                this.f1962 = null;
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1953() {
            if (this.f1962 == Thread.currentThread()) {
                Cif ifVar = this.f1961;
                if (ifVar instanceof cM) {
                    cM cMVar = (cM) ifVar;
                    if (!cMVar.f1894) {
                        cMVar.f1894 = true;
                        cMVar.f1895.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f1961.m1959();
        }
    }
}
