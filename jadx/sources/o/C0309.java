package o;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: o.ıǝ  reason: contains not printable characters */
public final class C0309 implements C0541 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2736 f3616;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <TResult> C0329<TResult> m4374(TResult tresult) {
        C0770 r0 = new C0770();
        r0.m6079(tresult);
        return r0;
    }

    /* renamed from: o.ıǝ$ǃ  reason: contains not printable characters */
    static final class C0310 implements C2970 {

        /* renamed from: ι  reason: contains not printable characters */
        final CountDownLatch f3625;

        private C0310() {
            this.f3625 = new CountDownLatch(1);
        }

        public final void onSuccess(Object obj) {
            this.f3625.countDown();
        }

        public final void onFailure(Exception exc) {
            this.f3625.countDown();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m4380() {
            this.f3625.countDown();
        }

        /* synthetic */ C0310(byte b) {
            this();
        }
    }

    /* renamed from: o.ıǝ$if  reason: invalid class name */
    public static final class Cif implements C2970 {

        /* renamed from: ı  reason: contains not printable characters */
        private int f3617;

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f3618;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C0770<Void> f3619;

        /* renamed from: ɹ  reason: contains not printable characters */
        private int f3620;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Object f3621 = new Object();

        /* renamed from: ι  reason: contains not printable characters */
        private int f3622;

        /* renamed from: і  reason: contains not printable characters */
        private Exception f3623;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private boolean f3624;

        public Cif(int i, C0770<Void> r3) {
            this.f3618 = i;
            this.f3619 = r3;
        }

        public final void onFailure(Exception exc) {
            synchronized (this.f3621) {
                this.f3622++;
                this.f3623 = exc;
                m4378();
            }
        }

        public final void onSuccess(Object obj) {
            synchronized (this.f3621) {
                this.f3617++;
                m4378();
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m4379() {
            synchronized (this.f3621) {
                this.f3620++;
                this.f3624 = true;
                m4378();
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private final void m4378() {
            int i = this.f3617;
            int i2 = this.f3622;
            int i3 = i + i2 + this.f3620;
            int i4 = this.f3618;
            if (i3 != i4) {
                return;
            }
            if (this.f3623 != null) {
                C0770<Void> r0 = this.f3619;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i2);
                sb.append(" out of ");
                sb.append(i4);
                sb.append(" underlying tasks failed");
                r0.m6073((Exception) new ExecutionException(sb.toString(), this.f3623));
            } else if (this.f3624) {
                this.f3619.m6088();
            } else {
                this.f3619.m6079(null);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <TResult> C0329<TResult> m4375(Executor executor, Callable<TResult> callable) {
        if (executor != null) {
            C0770 r0 = new C0770();
            executor.execute(new C0814(r0, callable));
            return r0;
        }
        throw new NullPointerException("Executor must not be null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static <TResult> TResult m4373(C0329<TResult> r1) {
        if (r1.m4421()) {
            return r1.m4401();
        }
        if (r1.m4405()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(r1.m4406());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static <TResult> TResult m4376(C0329<TResult> r2) {
        if (C2396.m12409()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        } else if (r2 == null) {
            throw new NullPointerException("Task must not be null");
        } else if (r2.m4415()) {
            return m4373(r2);
        } else {
            C0310 r0 = new C0310((byte) 0);
            r2.m4408(C0322.f3662, (C3153<? super TResult>) r0);
            r2.m4403(C0322.f3662, (C3191) r0);
            r2.m4402(C0322.f3662, (C2970) r0);
            r0.f3625.await();
            return m4373(r2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <TResult> TResult m4372(C0329<TResult> r2, long j, TimeUnit timeUnit) {
        if (C2396.m12409()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        } else if (r2 == null) {
            throw new NullPointerException("Task must not be null");
        } else if (timeUnit == null) {
            throw new NullPointerException("TimeUnit must not be null");
        } else if (r2.m4415()) {
            return m4373(r2);
        } else {
            C0310 r0 = new C0310((byte) 0);
            r2.m4408(C0322.f3662, (C3153<? super TResult>) r0);
            r2.m4403(C0322.f3662, (C3191) r0);
            r2.m4402(C0322.f3662, (C2970) r0);
            if (r0.f3625.await(j, timeUnit)) {
                return m4373(r2);
            }
            throw new TimeoutException("Timed out waiting for Task");
        }
    }

    public C0309(C2736 r1) {
        this.f3616 = r1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4377(Object obj, Object obj2) {
        this.f3616.m14482((C2972) obj, (C3203) obj2);
    }
}
