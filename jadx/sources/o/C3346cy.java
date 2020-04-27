package o;

import java.util.LinkedList;
import java.util.List;

/* renamed from: o.cy  reason: case insensitive filesystem */
public final class C3346cy implements C3326cg, C3342cu {

    /* renamed from: ı  reason: contains not printable characters */
    private List<C3326cg> f2015;

    /* renamed from: Ι  reason: contains not printable characters */
    private volatile boolean f2016;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r1.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.next().m1959();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        o.C2745.m14522(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r2.size() != 1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        throw o.cW.m1935((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        throw new o.C3337cp((java.lang.Iterable<? extends java.lang.Throwable>) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m2041() {
        /*
            r4 = this;
            boolean r0 = r4.f2016
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.f2016     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x000c:
            r0 = 1
            r4.f2016 = r0     // Catch:{ all -> 0x0055 }
            java.util.List<o.cg> r1 = r4.f2015     // Catch:{ all -> 0x0055 }
            r2 = 0
            r4.f2015 = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0054
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r1.next()
            o.cg r3 = (o.C3326cg) r3
            r3.m1959()     // Catch:{ all -> 0x002b }
            goto L_0x001b
        L_0x002b:
            r3 = move-exception
            o.C2745.m14522((java.lang.Throwable) r3)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r3)
            goto L_0x001b
        L_0x003a:
            if (r2 == 0) goto L_0x0054
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004e
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = o.cW.m1935(r0)
            throw r0
        L_0x004e:
            o.cp r0 = new o.cp
            r0.<init>((java.lang.Iterable<? extends java.lang.Throwable>) r2)
            throw r0
        L_0x0054:
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3346cy.m2041():void");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2042(C3326cg cgVar) {
        if (cgVar != null) {
            if (!this.f2016) {
                synchronized (this) {
                    if (!this.f2016) {
                        List list = this.f2015;
                        if (list == null) {
                            list = new LinkedList();
                            this.f2015 = list;
                        }
                        list.add(cgVar);
                        return true;
                    }
                }
            }
            cgVar.m1959();
            return false;
        }
        throw new NullPointerException("d is null");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m2043(C3326cg cgVar) {
        if (!m2040(cgVar)) {
            return false;
        }
        cgVar.m1959();
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2040(C3326cg cgVar) {
        if (cgVar == null) {
            throw new NullPointerException("Disposable item is null");
        } else if (this.f2016) {
            return false;
        } else {
            synchronized (this) {
                if (this.f2016) {
                    return false;
                }
                List<C3326cg> list = this.f2015;
                if (list == null || !list.remove(cgVar)) {
                    return false;
                }
                return true;
            }
        }
    }
}
