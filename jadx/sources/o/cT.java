package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class cT {

    /* renamed from: ı  reason: contains not printable characters */
    private static int f1929;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static AtomicReference<ScheduledExecutorService> f1930 = new AtomicReference<>();

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f1931;

    /* renamed from: ι  reason: contains not printable characters */
    static final Map<ScheduledThreadPoolExecutor, Object> f1932 = new ConcurrentHashMap();

    static {
        C0138 r0 = new C0138();
        boolean r1 = m1928("rx2.purge-enabled", r0);
        f1931 = r1;
        f1929 = m1930(r1, "rx2.purge-period-seconds", r0);
        m1929();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m1929() {
        if (f1931) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = f1930.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new cS("RxSchedulerPurge"));
                    if (f1930.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        Cif ifVar = new Cif();
                        int i = f1929;
                        newScheduledThreadPool.scheduleAtFixedRate(ifVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m1930(boolean z, String str, C3341ct<String, String> ctVar) {
        if (z) {
            try {
                String r1 = ctVar.m2023(str);
                if (r1 == null) {
                    return 1;
                }
                return Integer.parseInt(r1);
            } catch (Throwable unused) {
            }
        }
        return 1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m1928(String str, C3341ct<String, String> ctVar) {
        try {
            String r1 = ctVar.m2023(str);
            if (r1 == null) {
                return true;
            }
            return "true".equals(r1);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: o.cT$ǃ  reason: contains not printable characters */
    static final class C0138 implements C3341ct<String, String> {
        C0138() {
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final /* synthetic */ Object m1932(Object obj) {
            return System.getProperty((String) obj);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static ScheduledExecutorService m1931(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f1931 && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f1932.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }

    /* renamed from: o.cT$if  reason: invalid class name */
    static final class Cif implements Runnable {
        Cif() {
        }

        public final void run() {
            Iterator it = new ArrayList(cT.f1932.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    cT.f1932.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }
}
