package o;

import java.util.concurrent.BlockingQueue;
import o.C2745;

/* renamed from: o.ѕɩ  reason: contains not printable characters */
final class C2549 extends Thread {

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f11636 = false;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final BlockingQueue<C2646<?>> f11637;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Object f11638;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2570 f11639;

    public C2549(C2570 r1, String str, BlockingQueue<C2646<?>> blockingQueue) {
        this.f11639 = r1;
        C2745.C2746.m14555(str);
        C2745.C2746.m14555(blockingQueue);
        this.f11638 = new Object();
        this.f11637 = blockingQueue;
        setName(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0075, code lost:
        m13600();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            o.іƭ r1 = r5.f11639     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f11702     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r5.m13601(r1)
            goto L_0x0001
        L_0x0013:
            int r0 = android.os.Process.myTid()     // Catch:{ all -> 0x0081 }
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch:{ all -> 0x0081 }
        L_0x001b:
            java.util.concurrent.BlockingQueue<o.ѫ<?>> r1 = r5.f11637     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0081 }
            o.ѫ r1 = (o.C2646) r1     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.f12138     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x002b
            r2 = r0
            goto L_0x002d
        L_0x002b:
            r2 = 10
        L_0x002d:
            android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x0081 }
            r1.run()     // Catch:{ all -> 0x0081 }
            goto L_0x001b
        L_0x0034:
            java.lang.Object r1 = r5.f11638     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<o.ѫ<?>> r2 = r5.f11637     // Catch:{ all -> 0x007e }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            o.іƭ r2 = r5.f11639     // Catch:{ all -> 0x007e }
            boolean r2 = r2.f11697     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x0053
            java.lang.Object r2 = r5.f11638     // Catch:{ InterruptedException -> 0x004f }
            r3 = 30000(0x7530, double:1.4822E-319)
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r5.m13601(r2)     // Catch:{ all -> 0x007e }
        L_0x0053:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            o.іƭ r1 = r5.f11639     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r1.f11700     // Catch:{ all -> 0x0081 }
            monitor-enter(r1)     // Catch:{ all -> 0x0081 }
            java.util.concurrent.BlockingQueue<o.ѫ<?>> r2 = r5.f11637     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0079
            o.іƭ r0 = r5.f11639     // Catch:{ all -> 0x007b }
            o.ьɹ r0 = r0.r_()     // Catch:{ all -> 0x007b }
            o.ιͱ<java.lang.Boolean> r2 = o.C2529.f11536     // Catch:{ all -> 0x007b }
            boolean r0 = r0.m13372((o.C2019<java.lang.Boolean>) r2)     // Catch:{ all -> 0x007b }
            if (r0 == 0) goto L_0x0074
            r5.m13600()     // Catch:{ all -> 0x007b }
        L_0x0074:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r5.m13600()
            return
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x001b
        L_0x007b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            r5.m13600()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2549.run():void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m13600() {
        synchronized (this.f11639.f11700) {
            if (!this.f11636) {
                this.f11639.f11702.release();
                this.f11639.f11700.notifyAll();
                if (this == this.f11639.f11694) {
                    C2549 unused = this.f11639.f11694 = null;
                } else if (this == this.f11639.f11696) {
                    C2549 unused2 = this.f11639.f11696 = null;
                } else {
                    this.f11639.t_().m11714().m11606("Current scheduler thread is neither worker nor network");
                }
                this.f11636 = true;
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13602() {
        synchronized (this.f11638) {
            this.f11638.notifyAll();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m13601(InterruptedException interruptedException) {
        this.f11639.t_().A_().m11603(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
