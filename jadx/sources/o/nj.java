package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class nj implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2038 f3402;

    /* renamed from: ι  reason: contains not printable characters */
    private final Object f3403;

    nj() {
    }

    /* renamed from: o.nj$ı  reason: contains not printable characters */
    public static class C0264 implements Executor {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: o.nj$ɩ  reason: contains not printable characters */
    public static class C0265 implements Executor {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Handler f3404 = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.f3404.post(runnable);
            }
        }
    }

    public nj(C2038 r1, Object obj) {
        this.f3402 = r1;
        this.f3403 = obj;
    }

    public final void run() {
        C2038 r0 = this.f3402;
        Object obj = this.f3403;
        if (obj != null) {
            synchronized (r0.f10073.f6039) {
                r0.f10071.remove(obj);
                r0.f10074.remove(obj);
                C2378.m12371().m12373(obj);
            }
            return;
        }
        throw new NullPointerException("null reference");
    }
}
