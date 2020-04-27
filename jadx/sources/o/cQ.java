package o;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class cQ extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, C3326cg {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Object f1914 = new Object();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Object f1915 = new Object();

    /* renamed from: Ι  reason: contains not printable characters */
    private static Object f1916 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private static Object f1917 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    private Runnable f1918;

    public cQ(Runnable runnable, C3342cu cuVar) {
        super(3);
        this.f1918 = runnable;
        lazySet(0, cuVar);
    }

    public final Object call() {
        run();
        return null;
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f1918.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == f1916 || !compareAndSet(0, obj3, f1914) || obj3 == null)) {
                ((C3342cu) obj3).m2024(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f1917 || obj2 == f1915 || compareAndSet(1, obj2, f1914)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, f1914));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == f1916 || !compareAndSet(0, obj4, f1914) || obj4 == null)) {
            ((C3342cu) obj4).m2024(this);
        }
        do {
            obj = get(1);
            if (obj == f1917 || obj == f1915 || compareAndSet(1, obj, f1914)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, f1914));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1921(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f1914) {
                if (obj == f1917) {
                    future.cancel(false);
                    return;
                } else if (obj == f1915) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1922() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = f1914
            r3 = 0
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = f1917
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = f1915
            if (r1 == r2) goto L_0x0034
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r4 = f1915
            goto L_0x0027
        L_0x0025:
            java.lang.Object r4 = f1917
        L_0x0027:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0034
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0034:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = f1914
            if (r0 == r1) goto L_0x004e
            java.lang.Object r1 = f1916
            if (r0 == r1) goto L_0x004e
            if (r0 != 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0034
            o.cu r0 = (o.C3342cu) r0
            r0.m2024(r5)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cQ.m1922():void");
    }
}
