package o;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import o.C2745;

/* renamed from: o.іƭ  reason: contains not printable characters */
public final class C2570 extends C3067 {
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static final AtomicLong f11693 = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public C2549 f11694;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final BlockingQueue<C2646<?>> f11695 = new LinkedBlockingQueue();
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2549 f11696;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public volatile boolean f11697;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Thread.UncaughtExceptionHandler f11698 = new C2554(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: ι  reason: contains not printable characters */
    private final PriorityBlockingQueue<C2646<?>> f11699 = new PriorityBlockingQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: І  reason: contains not printable characters */
    public final Object f11700 = new Object();

    /* renamed from: і  reason: contains not printable characters */
    private final Thread.UncaughtExceptionHandler f11701 = new C2554(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final Semaphore f11702 = new Semaphore(2);

    C2570(C2658 r2) {
        super(r2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m13673() {
        return false;
    }

    public final void y_() {
        if (Thread.currentThread() != this.f11694) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public final void m13674() {
        if (Thread.currentThread() != this.f11696) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m13670() {
        return Thread.currentThread() == this.f11694;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <V> Future<V> m13667(Callable<V> callable) {
        m15649();
        C2745.C2746.m14555(callable);
        C2646 r0 = new C2646(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f11694) {
            if (!this.f11699.isEmpty()) {
                t_().A_().m11606("Callable skipped the worker queue.");
            }
            r0.run();
        } else {
            m13663((C2646<?>) r0);
        }
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final <V> Future<V> m13669(Callable<V> callable) {
        m15649();
        C2745.C2746.m14555(callable);
        C2646 r0 = new C2646(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f11694) {
            r0.run();
        } else {
            m13663((C2646<?>) r0);
        }
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13668(Runnable runnable) {
        m15649();
        C2745.C2746.m14555(runnable);
        m13663((C2646<?>) new C2646(this, runnable, false, "Task exception on worker thread"));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r4 = "Timed out waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r3.m11606(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = t_().A_();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r5.length() != 0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = "Interrupted waiting for ".concat(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r3.m11606(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = t_().A_();
        r5 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T m13666(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            o.іƭ r0 = r1.u_()     // Catch:{ all -> 0x005a }
            r0.m13668((java.lang.Runnable) r6)     // Catch:{ all -> 0x005a }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0034
            o.Іɛ r3 = r1.t_()
            o.ϵı r3 = r3.A_()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r6 = r5.length()
            if (r6 == 0) goto L_0x002b
            java.lang.String r4 = r4.concat(r5)
            goto L_0x0031
        L_0x002b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            r4 = r5
        L_0x0031:
            r3.m11606(r4)
        L_0x0034:
            return r2
        L_0x0035:
            o.Іɛ r3 = r1.t_()     // Catch:{ all -> 0x005a }
            o.ϵı r3 = r3.A_()     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "Interrupted waiting for "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005a }
            int r6 = r5.length()     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004e
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0054
        L_0x004e:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x005a }
            r5.<init>(r4)     // Catch:{ all -> 0x005a }
            r4 = r5
        L_0x0054:
            r3.m11606(r4)     // Catch:{ all -> 0x005a }
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            return r3
        L_0x005a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2570.m13666(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m13663(C2646<?> r4) {
        synchronized (this.f11700) {
            this.f11699.add(r4);
            if (this.f11694 == null) {
                this.f11694 = new C2549(this, "Measurement Worker", this.f11699);
                this.f11694.setUncaughtExceptionHandler(this.f11698);
                this.f11694.start();
            } else {
                this.f11694.m13602();
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m13672(Runnable runnable) {
        m15649();
        C2745.C2746.m14555(runnable);
        C2646 r0 = new C2646(this, runnable, false, "Task exception on network thread");
        synchronized (this.f11700) {
            this.f11695.add(r0);
            if (this.f11696 == null) {
                this.f11696 = new C2549(this, "Measurement Network", this.f11695);
                this.f11696.setUncaughtExceptionHandler(this.f11701);
                this.f11696.start();
            } else {
                this.f11696.m13602();
            }
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13665() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13675() {
        super.m15903();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m13676() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m13671() {
        return super.m15901();
    }

    public final /* bridge */ /* synthetic */ C2570 u_() {
        return super.u_();
    }

    public final /* bridge */ /* synthetic */ C2244 t_() {
        return super.t_();
    }

    public final /* bridge */ /* synthetic */ C2327 s_() {
        return super.s_();
    }

    public final /* bridge */ /* synthetic */ C2518 r_() {
        return super.r_();
    }

    public final /* bridge */ /* synthetic */ C2448 q_() {
        return super.q_();
    }
}
