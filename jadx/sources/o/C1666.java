package o;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.ʙɹ  reason: contains not printable characters */
public final class C1666 {

    /* renamed from: ı  reason: contains not printable characters */
    private static BlockingQueue<Runnable> f8668 = new LinkedBlockingQueue();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static BlockingQueue<Runnable> f8669 = new LinkedBlockingQueue();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C1666 f8670 = new C1666();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static BlockingQueue<Runnable> f8671 = new LinkedBlockingQueue();

    /* renamed from: ɹ  reason: contains not printable characters */
    private static BlockingQueue<Runnable> f8672 = new LinkedBlockingQueue();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final ThreadPoolExecutor f8673 = new ThreadPoolExecutor(5, 5, 5, TimeUnit.SECONDS, f8671, new C1667("Command-"));

    /* renamed from: ι  reason: contains not printable characters */
    private static final ThreadPoolExecutor f8674 = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, f8668, new C1667("Upload-"));

    /* renamed from: і  reason: contains not printable characters */
    private static final ThreadPoolExecutor f8675 = new ThreadPoolExecutor(3, 3, 5, TimeUnit.SECONDS, f8672, new C1667("Download-"));

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final ThreadPoolExecutor f8676 = new ThreadPoolExecutor(1, 1, 5, TimeUnit.SECONDS, f8669, new C1667("Callbacks-"));

    static {
        f8673.allowCoreThreadTimeOut(true);
        f8674.allowCoreThreadTimeOut(true);
        f8675.allowCoreThreadTimeOut(true);
        f8676.allowCoreThreadTimeOut(true);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C1666 m9526() {
        return f8670;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m9528(Runnable runnable) {
        f8673.execute(runnable);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m9527(Runnable runnable) {
        f8674.execute(runnable);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m9529(Runnable runnable) {
        f8676.execute(runnable);
    }

    /* renamed from: o.ʙɹ$ɩ  reason: contains not printable characters */
    static class C1667 implements ThreadFactory {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final AtomicInteger f8677 = new AtomicInteger(1);

        /* renamed from: ι  reason: contains not printable characters */
        private final String f8678;

        C1667(String str) {
            this.f8678 = str;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("FirebaseStorage-");
            sb.append(this.f8678);
            sb.append(this.f8677.getAndIncrement());
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }
}
