package o;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.ȷɪ  reason: contains not printable characters */
public class C0964 {

    /* renamed from: ı  reason: contains not printable characters */
    private final ExecutorService f5967;

    public C0964(ExecutorService executorService) {
        this.f5967 = executorService;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public <T> T m6881(Callable<T> callable) {
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                return this.f5967.submit(callable).get(4, TimeUnit.SECONDS);
            }
            return this.f5967.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            C3263ac.m1563();
            return null;
        } catch (Exception unused2) {
            C3263ac.m1563();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public Future<?> m6879(final Runnable runnable) {
        try {
            return this.f5967.submit(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception unused) {
                        C3263ac.m1563();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            C3263ac.m1563();
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public <T> Future<T> m6880(final Callable<T> callable) {
        try {
            return this.f5967.submit(new Callable<T>() {
                public T call() {
                    try {
                        return callable.call();
                    } catch (Exception unused) {
                        C3263ac.m1563();
                        return null;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            C3263ac.m1563();
            return null;
        }
    }
}
