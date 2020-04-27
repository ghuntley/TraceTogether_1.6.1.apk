package o;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020%2\u00020&2\u00020\u0004B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u000f\u0010\b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\b\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u000e\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0019\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u000e\u0010\u001aJ#\u0010\n\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0019\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\n\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0015\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00048W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005R\u0015\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u000e\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u00020\u00108\u0017@\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013"}, d2 = {"Lo/jt;", "Lo/jr;", "ǃ", "Lo/jr;", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "ι", "", "ɩ", "I", "ı", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/lang/Runnable;", "Lo/ɩ;", "Ι", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lo/jz;", "Ɩ", "Lo/jz;", "()Lo/jz;", "", "()V", "close", "Lo/ex;", "p0", "p1", "(Lo/ex;Ljava/lang/Runnable;)V", "", "(Ljava/lang/Runnable;Z)V", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "p2", "<init>", "(Lo/jr;ILo/jz;)V", "Lo/hT;", "Lo/jy;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.jt  reason: case insensitive filesystem */
final class C3524jt extends hT implements C3529jy, Executor {

    /* renamed from: ı  reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f2523 = AtomicIntegerFieldUpdater.newUpdater(C3524jt.class, "inFlightTasks");
    private volatile int inFlightTasks = 0;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C3530jz f2524;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3523jr f2525;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int f2526;

    /* renamed from: Ι  reason: contains not printable characters */
    private final ConcurrentLinkedQueue<Runnable> f2527 = new ConcurrentLinkedQueue<>();

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final C3530jz m3184() {
        return this.f2524;
    }

    public C3524jt(C3523jr jrVar, int i, C3530jz jzVar) {
        fM.m2254(jrVar, "");
        fM.m2254(jzVar, "");
        this.f2525 = jrVar;
        this.f2526 = i;
        this.f2524 = jzVar;
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Executor m3182() {
        return this;
    }

    public final void execute(Runnable runnable) {
        fM.m2254(runnable, "");
        m3181(runnable, false);
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m3185(C3396ex exVar, Runnable runnable) {
        fM.m2254(exVar, "");
        fM.m2254(runnable, "");
        m3181(runnable, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m3181(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f2523
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.f2526
            if (r0 > r1) goto L_0x0013
            o.jr r0 = r2.f2525
            r1 = r2
            o.jy r1 = (o.C3529jy) r1
            r0.m3179(r3, r1, r4)
            return
        L_0x0013:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.f2527
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f2523
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.f2526
            if (r3 < r0) goto L_0x0023
            return
        L_0x0023:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.f2527
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 == 0) goto L_0x002e
            goto L_0x0000
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3524jt.m3181(java.lang.Runnable, boolean):void");
    }

    public final String toString() {
        return super.toString() + "[dispatcher = " + this.f2525 + ']';
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3183() {
        Runnable poll = this.f2527.poll();
        if (poll != null) {
            this.f2525.m3179(poll, this, true);
            return;
        }
        f2523.decrementAndGet(this);
        Runnable poll2 = this.f2527.poll();
        if (poll2 != null) {
            m3181(poll2, true);
        }
    }
}
