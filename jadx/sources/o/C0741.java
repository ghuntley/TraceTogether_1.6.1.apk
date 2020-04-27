package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.ƚʝ  reason: contains not printable characters */
public final class C0741 implements Executor {

    /* renamed from: Ι  reason: contains not printable characters */
    private static C0741 f4998 = new C0741();

    /* renamed from: ı  reason: contains not printable characters */
    private Handler f4999 = new C1603(Looper.getMainLooper());

    private C0741() {
    }

    public final void execute(Runnable runnable) {
        this.f4999.post(runnable);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C0741 m5928() {
        return f4998;
    }
}
