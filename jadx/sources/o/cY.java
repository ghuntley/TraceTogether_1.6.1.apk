package o;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.C3321cb;

public final class cY extends C3321cb {

    /* renamed from: ı  reason: contains not printable characters */
    private static final cY f1945 = new cY();

    /* renamed from: ı  reason: contains not printable characters */
    public static cY m1939() {
        return f1945;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3321cb.Cif m1940() {
        return new C0144();
    }

    cY() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C3326cg m1942(Runnable runnable) {
        runnable.run();
        return C3345cx.INSTANCE;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3326cg m1941(Runnable runnable, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(0);
            if (runnable != null) {
                runnable.run();
                return C3345cx.INSTANCE;
            }
            throw new NullPointerException("run is null");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            cX.m1936(e);
        }
    }

    /* renamed from: o.cY$ɩ  reason: contains not printable characters */
    static final class C0144 extends C3321cb.Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private AtomicInteger f1953 = new AtomicInteger();

        /* renamed from: ɩ  reason: contains not printable characters */
        private final AtomicInteger f1954 = new AtomicInteger();

        /* renamed from: Ι  reason: contains not printable characters */
        final PriorityBlockingQueue<C0143> f1955 = new PriorityBlockingQueue<>();

        /* renamed from: ι  reason: contains not printable characters */
        volatile boolean f1956;

        C0144() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3326cg m1944(Runnable runnable) {
            return m1943(runnable, TimeUnit.MILLISECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS));
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3326cg m1945(Runnable runnable, TimeUnit timeUnit) {
            long convert = TimeUnit.MILLISECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) + timeUnit.toMillis(0);
            return m1943(new Cif(runnable, this, convert), convert);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private C3326cg m1943(Runnable runnable, long j) {
            if (this.f1956) {
                return C3345cx.INSTANCE;
            }
            C0143 r0 = new C0143(runnable, Long.valueOf(j), this.f1953.incrementAndGet());
            this.f1955.add(r0);
            if (this.f1954.getAndIncrement() != 0) {
                return new C3334co(new C0145(r0));
            }
            int i = 1;
            while (!this.f1956) {
                C0143 poll = this.f1955.poll();
                if (poll == null) {
                    i = this.f1954.addAndGet(-i);
                    if (i == 0) {
                        return C3345cx.INSTANCE;
                    }
                } else if (!poll.f1950) {
                    poll.f1951.run();
                }
            }
            this.f1955.clear();
            return C3345cx.INSTANCE;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1946() {
            this.f1956 = true;
        }

        /* renamed from: o.cY$ɩ$ı  reason: contains not printable characters */
        final class C0145 implements Runnable {

            /* renamed from: ǃ  reason: contains not printable characters */
            private C0143 f1957;

            C0145(C0143 r2) {
                this.f1957 = r2;
            }

            public final void run() {
                this.f1957.f1950 = true;
                C0144.this.f1955.remove(this.f1957);
            }
        }
    }

    /* renamed from: o.cY$ı  reason: contains not printable characters */
    static final class C0143 implements Comparable<C0143> {

        /* renamed from: ı  reason: contains not printable characters */
        private int f1949;

        /* renamed from: ɩ  reason: contains not printable characters */
        volatile boolean f1950;

        /* renamed from: Ι  reason: contains not printable characters */
        final Runnable f1951;

        /* renamed from: ι  reason: contains not printable characters */
        private long f1952;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            C0143 r9 = (C0143) obj;
            int i = (this.f1952 > r9.f1952 ? 1 : (this.f1952 == r9.f1952 ? 0 : -1));
            int i2 = i < 0 ? -1 : i > 0 ? 1 : 0;
            if (i2 != 0) {
                return i2;
            }
            int i3 = this.f1949;
            int i4 = r9.f1949;
            if (i3 < i4) {
                return -1;
            }
            return i3 > i4 ? 1 : 0;
        }

        C0143(Runnable runnable, Long l, int i) {
            this.f1951 = runnable;
            this.f1952 = l.longValue();
            this.f1949 = i;
        }
    }

    /* renamed from: o.cY$if  reason: invalid class name */
    static final class Cif implements Runnable {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C0144 f1946;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final long f1947;

        /* renamed from: ι  reason: contains not printable characters */
        private final Runnable f1948;

        Cif(Runnable runnable, C0144 r2, long j) {
            this.f1948 = runnable;
            this.f1946 = r2;
            this.f1947 = j;
        }

        public final void run() {
            if (!this.f1946.f1956) {
                long convert = TimeUnit.MILLISECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
                long j = this.f1947;
                if (j > convert) {
                    try {
                        Thread.sleep(j - convert);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        cX.m1936(e);
                        return;
                    }
                }
                if (!this.f1946.f1956) {
                    this.f1948.run();
                }
            }
        }
    }
}
