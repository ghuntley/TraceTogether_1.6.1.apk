package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: o.ІԼ  reason: contains not printable characters */
public final class C2324 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final Executor f10761 = C2390.f10941;

    /* renamed from: ı  reason: contains not printable characters */
    public static Executor m12102() {
        return f10761;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static ExecutorService m12104() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C2285.f10669);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static final /* synthetic */ Thread m12103(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
