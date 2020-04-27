package o;

import android.os.Bundle;

/* renamed from: o.Ιʝ  reason: contains not printable characters */
final /* synthetic */ class C1839 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1798 f9435;

    C1839(C1798 r1) {
        this.f9435 = r1;
    }

    public final void run() {
        C1798 r0 = this.f9435;
        C1730 r1 = r0.f9231;
        long j = r0.f9232;
        r1.f8948.y_();
        r1.f8948.t_().m11711().m11606("Application going to the background");
        r1.f8948.m11088().m4316("auto", "_ab", j, new Bundle());
    }
}
