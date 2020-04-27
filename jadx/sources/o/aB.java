package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class aB implements Runnable {

    /* renamed from: ι  reason: contains not printable characters */
    private final C2859 f1381;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final void m1451(final String str, final ExecutorService executorService, final TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new C3280at() {

            /* renamed from: ɩ  reason: contains not printable characters */
            private /* synthetic */ long f1383 = 2;

            /* renamed from: ı  reason: contains not printable characters */
            public final void m1452() {
                try {
                    C3263ac.m1563();
                    executorService.shutdown();
                    if (!executorService.awaitTermination(this.f1383, timeUnit)) {
                        C3263ac.m1563();
                        executorService.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    C3263ac.m1563();
                    new Object[1][0] = str;
                    executorService.shutdownNow();
                }
            }
        }, "Crashlytics Shutdown Hook for ".concat(String.valueOf(str))));
    }

    public aB(C2859 r1) {
        this.f1381 = r1;
    }

    public final void run() {
        this.f1381.m14844(false);
    }
}
