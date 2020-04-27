package o;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import o.C3321cb;

/* renamed from: o.ch  reason: case insensitive filesystem */
final class C3327ch extends C3321cb {

    /* renamed from: ı  reason: contains not printable characters */
    private final Handler f1963;

    C3327ch(Handler handler) {
        this.f1963 = handler;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: Ι  reason: contains not printable characters */
    public final C3326cg m1961(Runnable runnable, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C0147 r0 = new C0147(this.f1963, runnable);
            this.f1963.sendMessageDelayed(Message.obtain(this.f1963, r0), timeUnit.toMillis(0));
            return r0;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C3321cb.Cif m1960() {
        return new Cif(this.f1963);
    }

    /* renamed from: o.ch$if  reason: invalid class name */
    static final class Cif extends C3321cb.Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private final Handler f1964;

        /* renamed from: ǃ  reason: contains not printable characters */
        private volatile boolean f1965;

        Cif(Handler handler) {
            this.f1964 = handler;
        }

        @SuppressLint({"NewApi"})
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3326cg m1962(Runnable runnable, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f1965) {
                return C3345cx.INSTANCE;
            } else {
                C0147 r0 = new C0147(this.f1964, runnable);
                Message obtain = Message.obtain(this.f1964, r0);
                obtain.obj = this;
                this.f1964.sendMessageDelayed(obtain, timeUnit.toMillis(0));
                if (!this.f1965) {
                    return r0;
                }
                this.f1964.removeCallbacks(r0);
                return C3345cx.INSTANCE;
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1963() {
            this.f1965 = true;
            this.f1964.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: o.ch$ı  reason: contains not printable characters */
    static final class C0147 implements Runnable, C3326cg {

        /* renamed from: ı  reason: contains not printable characters */
        private final Handler f1966;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Runnable f1967;

        /* renamed from: ι  reason: contains not printable characters */
        private volatile boolean f1968;

        C0147(Handler handler, Runnable runnable) {
            this.f1966 = handler;
            this.f1967 = runnable;
        }

        public final void run() {
            try {
                this.f1967.run();
            } catch (Throwable th) {
                cX.m1936(th);
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m1964() {
            this.f1966.removeCallbacks(this);
            this.f1968 = true;
        }
    }
}
