package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: o.ΙІ  reason: contains not printable characters */
public final class C1866 implements Handler.Callback {

    /* renamed from: ı  reason: contains not printable characters */
    private HandlerThread f9517;

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f9518;

    /* renamed from: ɩ  reason: contains not printable characters */
    final int f9519;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final int f9520;

    /* renamed from: Ι  reason: contains not printable characters */
    final Object f9521 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private Handler f9522;

    /* renamed from: і  reason: contains not printable characters */
    private final String f9523;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private Handler.Callback f9524 = this;

    /* renamed from: o.ΙІ$ǃ  reason: contains not printable characters */
    public interface C1867<T> {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m10244(T t);
    }

    public C1866(String str) {
        this.f9523 = str;
        this.f9520 = 10;
        this.f9519 = C3273am.f1527;
        this.f9518 = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m10242(Runnable runnable) {
        synchronized (this.f9521) {
            if (this.f9517 == null) {
                this.f9517 = new HandlerThread(this.f9523, this.f9520);
                this.f9517.start();
                this.f9522 = new Handler(this.f9517.getLooper(), this.f9524);
                this.f9518++;
            }
            this.f9522.removeMessages(0);
            this.f9522.sendMessage(this.f9522.obtainMessage(1, runnable));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T m10243(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            o.ΙІ$4 r11 = new o.ΙІ$4
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.m10242(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1866.m10243(java.util.concurrent.Callable, int):java.lang.Object");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f9521) {
                if (!this.f9522.hasMessages(1)) {
                    this.f9517.quit();
                    this.f9517 = null;
                    this.f9522 = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            ((Runnable) message.obj).run();
            synchronized (this.f9521) {
                this.f9522.removeMessages(0);
                this.f9522.sendMessageDelayed(this.f9522.obtainMessage(0), (long) this.f9519);
            }
            return true;
        }
    }
}
