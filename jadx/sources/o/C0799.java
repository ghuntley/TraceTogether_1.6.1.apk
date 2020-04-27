package o;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: o.Ƶ  reason: contains not printable characters */
final class C0799<TResult> {

    /* renamed from: ı  reason: contains not printable characters */
    private final Object f5269 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f5270;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Queue<C0642<TResult>> f5271;

    C0799() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6177(C0642<TResult> r3) {
        synchronized (this.f5269) {
            if (this.f5271 == null) {
                this.f5271 = new ArrayDeque();
            }
            this.f5271.add(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f5269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f5271.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f5270 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.m5420(r3);
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m6176(o.C0329<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f5269
            monitor-enter(r0)
            java.util.Queue<o.Ɩŧ<TResult>> r1 = r2.f5271     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f5270     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f5270 = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f5269
            monitor-enter(r1)
            java.util.Queue<o.Ɩŧ<TResult>> r0 = r2.f5271     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            o.Ɩŧ r0 = (o.C0642) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f5270 = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.m5420(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0799.m6176(o.ıə):void");
    }
}
