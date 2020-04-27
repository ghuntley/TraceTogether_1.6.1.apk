package o;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: o.ιͼ  reason: contains not printable characters */
public final class C2022 implements C2023 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static If f9991;

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C2022 f9992 = new C2022();

    /* renamed from: o.ιͼ$If */
    public interface If {
        /* renamed from: ǃ  reason: contains not printable characters */
        ScheduledExecutorService m10845();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static synchronized If m10840() {
        If ifR;
        synchronized (C2022.class) {
            if (f9991 == null) {
                f9991 = new C2008();
            }
            ifR = f9991;
        }
        return ifR;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C2023 m10841() {
        return f9992;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m10842() {
        return System.currentTimeMillis();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final long m10843() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final long m10844() {
        return System.nanoTime();
    }

    private C2022() {
    }
}
