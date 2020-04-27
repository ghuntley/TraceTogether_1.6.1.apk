package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bÀ\u0002\u0018\u00002\u00020\u00182\u00060\u0019j\u0002`\u001aB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00058U@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u000f"}, d2 = {"Lo/hC;", "", "ı", "J", "Ι", "Ljava/lang/Thread;", "_thread", "Ljava/lang/Thread;", "", "debugStatus", "I", "", "ɨ", "()Z", "ǃ", "()Ljava/lang/Thread;", "ι", "", "ɾ", "()V", "ȷ", "ɪ", "run", "<init>", "Lo/hL;", "Ljava/lang/Runnable;", "Lo/ɩ;"}, k = 1, mv = {1, 1, 15})
public final class hC extends hL implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: ı  reason: contains not printable characters */
    private static final long f2250;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final hC f2251;

    static {
        Long l;
        hC hCVar = new hC();
        f2251 = hCVar;
        hO.m2479$default(hCVar, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        fM.m2252((Object) l, "");
        f2250 = timeUnit.toNanos(l.longValue());
    }

    private hC() {
    }

    /* access modifiers changed from: protected */
    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final Thread m2434() {
        Thread thread = _thread;
        return thread != null ? thread : m2430();
    }

    @JvmName(name = "ɨ")
    /* renamed from: ɨ  reason: contains not printable characters */
    private final boolean m2431() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    public final void run() {
        C3501iw.f2385.m2806(this);
        C3500iv r0 = C3499iu.m2796();
        if (r0 != null) {
            r0.m2801();
        }
        try {
            if (m2432()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long r5 = m2471();
                    if (r5 == Long.MAX_VALUE) {
                        int i = (j > Long.MAX_VALUE ? 1 : (j == Long.MAX_VALUE ? 0 : -1));
                        if (i == 0) {
                            C3500iv r10 = C3499iu.m2796();
                            long r102 = r10 != null ? r10.m2804() : System.nanoTime();
                            if (i == 0) {
                                j = f2250 + r102;
                            }
                            long j2 = j - r102;
                            if (j2 <= 0) {
                                _thread = null;
                                m2433();
                                C3500iv r02 = C3499iu.m2796();
                                if (r02 != null) {
                                    r02.m2797();
                                }
                                if (!m2467()) {
                                    m2434();
                                    return;
                                }
                                return;
                            }
                            r5 = C3435gj.m2409(r5, j2);
                        } else {
                            r5 = C3435gj.m2409(r5, f2250);
                        }
                    }
                    if (r5 > 0) {
                        if (m2431()) {
                            _thread = null;
                            m2433();
                            C3500iv r03 = C3499iu.m2796();
                            if (r03 != null) {
                                r03.m2797();
                            }
                            if (!m2467()) {
                                m2434();
                                return;
                            }
                            return;
                        }
                        C3500iv r7 = C3499iu.m2796();
                        if (r7 != null) {
                            r7.m2803(this, r5);
                        } else {
                            LockSupport.parkNanos(this, r5);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            m2433();
            C3500iv r04 = C3499iu.m2796();
            if (r04 != null) {
                r04.m2797();
            }
            if (!m2467()) {
                m2434();
            }
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private final synchronized Thread m2430() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private final synchronized boolean m2432() {
        if (m2431()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private final synchronized void m2433() {
        if (m2431()) {
            debugStatus = 3;
            m2464();
            notifyAll();
        }
    }
}
