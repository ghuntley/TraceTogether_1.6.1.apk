package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.іı  reason: contains not printable characters */
public final class C2559 extends C2575 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private volatile Handler f11665;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Object f11666 = new Object();

    /* renamed from: ι  reason: contains not printable characters */
    private final ExecutorService f11667 = Executors.newFixedThreadPool(4, new ThreadFactory() {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final AtomicInteger f11669 = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f11669.getAndIncrement())}));
            return thread;
        }
    });

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13634(Runnable runnable) {
        this.f11667.execute(runnable);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13636(Runnable runnable) {
        if (this.f11665 == null) {
            synchronized (this.f11666) {
                if (this.f11665 == null) {
                    this.f11665 = m13633(Looper.getMainLooper());
                }
            }
        }
        this.f11665.post(runnable);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m13635() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Handler m13633(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }
}
