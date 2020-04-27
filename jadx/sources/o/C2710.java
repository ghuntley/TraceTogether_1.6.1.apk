package o;

import android.content.Context;
import android.os.Looper;

/* renamed from: o.ҡ  reason: contains not printable characters */
class C2710 {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f12534 = "session_analytics_to_send";

    /* renamed from: ǃ  reason: contains not printable characters */
    static final String f12535 = "session_analytics.tap";

    /* renamed from: ɩ  reason: contains not printable characters */
    final Context f12536;

    /* renamed from: ι  reason: contains not printable characters */
    final C3303bn f12537;

    public C2710(Context context, C3303bn bnVar) {
        this.f12536 = context;
        this.f12537 = bnVar;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0470 m14407() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new C0470(this.f12536, new C0542(), new aI(), new C3295bf(this.f12536, this.f12537.m1823(), f12535, f12534));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
