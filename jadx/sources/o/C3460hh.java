package o;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\bÀ\u0002\u0018\u00002\u00020 B\t\b\u0002¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u000e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u000f\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\n\u0010\u0013J#\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u0007\u0010\u0019J\u000f\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J#\u0010\u0005\u001a\u00020\f2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u0018\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0005\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00018W@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\r"}, d2 = {"Lo/hh;", "Ljava/util/concurrent/Executor;", "ǃ", "()Ljava/util/concurrent/Executor;", "", "ı", "()I", "Ι", "pool", "Ljava/util/concurrent/Executor;", "ɩ", "I", "", "Z", "ι", "", "close", "()V", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "Lo/ex;", "p0", "Ljava/lang/Runnable;", "Lo/ɩ;", "p1", "(Lo/ex;Ljava/lang/Runnable;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Ljava/util/concurrent/ExecutorService;)Z", "", "toString", "()Ljava/lang/String;", "<init>", "Lo/hT;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.hh  reason: case insensitive filesystem */
public final class C3460hh extends hT {
    private static volatile Executor pool;

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3460hh f2285 = new C3460hh();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean f2286;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final int f2287;

    public final String toString() {
        return "CommonPool";
    }

    static {
        String str;
        int i;
        C3460hh hhVar = f2285;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str != null) {
            Integer r1 = gK.m2347(str);
            if (r1 == null || r1.intValue() < 1) {
                throw new IllegalStateException(("Expected positive number in kotlinx.coroutines.default.parallelism, but has " + str).toString());
            }
            i = r1.intValue();
        } else {
            i = -1;
        }
        f2287 = i;
    }

    private C3460hh() {
    }

    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public final Executor m2533() {
        Executor executor = pool;
        return executor != null ? executor : m2530();
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    private final int m2528() {
        Integer valueOf = Integer.valueOf(f2287);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return C3435gj.m2407(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ExecutorService m2529() {
        Class<?> cls;
        ExecutorService executorService;
        if (System.getSecurityManager() != null) {
            return m2531();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m2531();
        }
        if (!f2286 && f2287 < 0) {
            try {
                Method method = cls.getMethod("commonPool", new Class[0]);
                Object invoke = method != null ? method.invoke((Object) null, new Object[0]) : null;
                if (!(invoke instanceof ExecutorService)) {
                    invoke = null;
                }
                executorService = (ExecutorService) invoke;
            } catch (Throwable unused2) {
                executorService = null;
            }
            if (executorService != null) {
                if (!f2285.m2532(cls, executorService)) {
                    executorService = null;
                }
                if (executorService != null) {
                    return executorService;
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[]{Integer.TYPE}).newInstance(new Object[]{Integer.valueOf(f2285.m2528())});
            if (!(newInstance instanceof ExecutorService)) {
                newInstance = null;
            }
            executorService2 = (ExecutorService) newInstance;
        } catch (Throwable unused3) {
        }
        if (executorService2 != null) {
            return executorService2;
        }
        return m2531();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2532(Class<?> cls, ExecutorService executorService) {
        Integer num;
        fM.m2254(cls, "");
        fM.m2254(executorService, "");
        executorService.submit(AnonymousClass2.f2288);
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (!(invoke instanceof Integer)) {
                invoke = null;
            }
            num = (Integer) invoke;
        } catch (Throwable unused) {
            num = null;
        }
        return num != null && num.intValue() >= 1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final ExecutorService m2531() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(m2528(), new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "CommonPool-worker-" + atomicInteger.incrementAndGet());
                thread.setDaemon(true);
                return thread;
            }
        });
        fM.m2252((Object) newFixedThreadPool, "");
        return newFixedThreadPool;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final synchronized Executor m2530() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            ExecutorService r0 = m2529();
            pool = r0;
            executor = r0;
        }
        return executor;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2534(C3396ex exVar, Runnable runnable) {
        Runnable runnable2;
        fM.m2254(exVar, "");
        fM.m2254(runnable, "");
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m2530();
            }
            C3500iv r0 = C3499iu.m2796();
            if (r0 == null || (runnable2 = r0.m2799(runnable)) == null) {
                runnable2 = runnable;
            }
            executor.execute(runnable2);
        } catch (RejectedExecutionException unused) {
            C3500iv r2 = C3499iu.m2796();
            if (r2 != null) {
                r2.m2800();
            }
            hC.f2251.m2466(runnable);
        }
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }
}
