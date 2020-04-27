package o;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: o.ɪє  reason: contains not printable characters */
final class C1399 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C1353 f7657;

    C1399(C1353 r1) {
        this.f7657 = r1;
    }

    public final void run() {
        C0848 r0 = this.f7657.f7507;
        Context r2 = this.f7657.f7507.m15904();
        this.f7657.f7507.q_();
        r0.m6349(new ComponentName(r2, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
