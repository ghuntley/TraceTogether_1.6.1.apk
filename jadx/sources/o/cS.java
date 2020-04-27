package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class cS extends AtomicLong implements ThreadFactory {

    /* renamed from: ǃ  reason: contains not printable characters */
    private int f1926;

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f1927;

    /* renamed from: ι  reason: contains not printable characters */
    private String f1928;

    public cS(String str) {
        this(str, 5, false);
    }

    public cS(String str, int i) {
        this(str, i, false);
    }

    public cS(String str, int i, boolean z) {
        this.f1928 = str;
        this.f1926 = i;
        this.f1927 = z;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.f1928);
        sb.append('-');
        sb.append(incrementAndGet());
        String obj = sb.toString();
        Thread r1 = this.f1927 ? new C0137(runnable, obj) : new Thread(runnable, obj);
        r1.setPriority(this.f1926);
        r1.setDaemon(true);
        return r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RxThreadFactory[");
        sb.append(this.f1928);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: o.cS$ı  reason: contains not printable characters */
    static final class C0137 extends Thread {
        C0137(Runnable runnable, String str) {
            super(runnable, str);
        }
    }
}
