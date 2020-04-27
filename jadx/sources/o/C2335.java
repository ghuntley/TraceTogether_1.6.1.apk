package o;

import android.os.Handler;
import o.C2745;

/* renamed from: o.Јϳ  reason: contains not printable characters */
abstract class C2335 {

    /* renamed from: ι  reason: contains not printable characters */
    private static volatile Handler f10827;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public volatile long f10828;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3005 f10829;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Runnable f10830;

    C2335(C3005 r2) {
        C2745.C2746.m14555(r2);
        this.f10829 = r2;
        this.f10830 = new C2359(this, r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m12179();

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m12178(long j) {
        m12177();
        if (j >= 0) {
            this.f10828 = this.f10829.w_().m10846();
            if (!m12176().postDelayed(this.f10830, j)) {
                this.f10829.t_().m11714().m11603("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m12180() {
        return this.f10828 != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m12177() {
        this.f10828 = 0;
        m12176().removeCallbacks(this.f10830);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Handler m12176() {
        Handler handler;
        if (f10827 != null) {
            return f10827;
        }
        synchronized (C2335.class) {
            if (f10827 == null) {
                f10827 = new C2937(this.f10829.m15396().getMainLooper());
            }
            handler = f10827;
        }
        return handler;
    }
}
