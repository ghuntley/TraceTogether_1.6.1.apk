package o;

import android.annotation.TargetApi;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class aP extends ThreadPoolExecutor {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final int f1469;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final int f1470;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int f1471 = ((f1470 << 1) + 1);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f1470 = availableProcessors;
        f1469 = availableProcessors + 1;
    }

    private <T extends Runnable & aJ & aW & aO> aP(int i, int i2, TimeUnit timeUnit, aM<T> aMVar, ThreadFactory threadFactory) {
        super(i, i2, 1, timeUnit, aMVar, threadFactory);
        prestartAllCoreThreads();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static aP m1521() {
        return new aP(f1469, f1471, TimeUnit.SECONDS, new aM(), new C0114());
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new aS(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new aS(callable);
    }

    @TargetApi(9)
    public final void execute(Runnable runnable) {
        if (aQ.m1522(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, (Object) null));
        }
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        aW aWVar = (aW) runnable;
        aWVar.m1546(true);
        aWVar.m1545(th);
        ((aM) super.getQueue()).m1509();
        super.afterExecute(runnable, th);
    }

    /* renamed from: o.aP$ɩ  reason: contains not printable characters */
    public static final class C0114 implements ThreadFactory {
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("Queue");
            return thread;
        }
    }

    public final /* bridge */ /* synthetic */ BlockingQueue getQueue() {
        return (aM) super.getQueue();
    }
}
