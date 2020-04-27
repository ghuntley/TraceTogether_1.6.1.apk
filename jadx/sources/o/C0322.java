package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: o.ıɐ  reason: contains not printable characters */
public final class C0322 implements C0541 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final Executor f3662 = new C0791();

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final Executor f3663 = new C0323();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2739 f3664;

    /* renamed from: o.ıɐ$ǃ  reason: contains not printable characters */
    static final class C0323 implements Executor {

        /* renamed from: Ι  reason: contains not printable characters */
        private final Handler f3665 = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f3665.post(runnable);
        }
    }

    public C0322(C2739 r1) {
        this.f3664 = r1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4392(Object obj, Object obj2) {
        this.f3664.m14487((C2972) obj, (C3203) obj2);
    }
}
