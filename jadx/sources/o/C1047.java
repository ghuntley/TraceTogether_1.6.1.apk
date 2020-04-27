package o;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.ɉǃ  reason: contains not printable characters */
class C1047 implements Thread.UncaughtExceptionHandler {

    /* renamed from: ı  reason: contains not printable characters */
    private final Cif f6310;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final If f6311;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Thread.UncaughtExceptionHandler f6312;

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean f6313;

    /* renamed from: ι  reason: contains not printable characters */
    private final AtomicBoolean f6314 = new AtomicBoolean(false);

    /* renamed from: o.ɉǃ$If */
    interface If {
        /* renamed from: Ι  reason: contains not printable characters */
        void m7300(Cif ifVar, Thread thread, Throwable th, boolean z);
    }

    /* renamed from: o.ɉǃ$if  reason: invalid class name */
    interface Cif {
        /* renamed from: ǃ  reason: contains not printable characters */
        bM m7301();
    }

    public C1047(If ifR, Cif ifVar, boolean z, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6311 = ifR;
        this.f6310 = ifVar;
        this.f6313 = z;
        this.f6312 = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        o.C3263ac.m1563();
        r4.f6312.uncaughtException(r5, r6);
        r4.f6314.set(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f6314
            r1 = 1
            r0.set(r1)
            r0 = 0
            o.ɉǃ$If r1 = r4.f6311     // Catch:{ Exception -> 0x0020 }
            o.ɉǃ$if r2 = r4.f6310     // Catch:{ Exception -> 0x0020 }
            boolean r3 = r4.f6313     // Catch:{ Exception -> 0x0020 }
            r1.m7300(r2, r5, r6, r3)     // Catch:{ Exception -> 0x0020 }
        L_0x0010:
            o.C3263ac.m1563()
            java.lang.Thread$UncaughtExceptionHandler r1 = r4.f6312
            r1.uncaughtException(r5, r6)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f6314
            r5.set(r0)
            return
        L_0x001e:
            r1 = move-exception
            goto L_0x0024
        L_0x0020:
            o.C3263ac.m1563()     // Catch:{ all -> 0x001e }
            goto L_0x0010
        L_0x0024:
            o.C3263ac.m1563()
            java.lang.Thread$UncaughtExceptionHandler r2 = r4.f6312
            r2.uncaughtException(r5, r6)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.f6314
            r5.set(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1047.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m7299() {
        return this.f6314.get();
    }
}
