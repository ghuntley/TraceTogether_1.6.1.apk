package o;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ıɑ  reason: contains not printable characters */
final class C0324 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ long f3666;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0305 f3667;

    C0324(C0305 r1, long j) {
        this.f3667 = r1;
        this.f3666 = j;
    }

    public final void run() {
        C0305 r0 = this.f3667;
        long j = this.f3666;
        r0.y_();
        r0.m15903();
        r0.m9662();
        r0.t_().m11711().m11606("Resetting analytics data (FE)");
        C1729 r3 = r0.m11084();
        r3.y_();
        r3.f8945.m10233();
        boolean r32 = r0.f14314.m14094();
        C2327 s_ = r0.s_();
        s_.f10793.m13398(j);
        if (!TextUtils.isEmpty(s_.s_().f10775.m12586())) {
            s_.f10775.m12587((String) null);
        }
        if (C1174.m7692() && s_.r_().m13372(C2529.f11531)) {
            s_.f10772.m13398(0);
        }
        if (!s_.r_().m13378()) {
            s_.m12125(!r32);
        }
        r0.m11089().m6379();
        if (C1174.m7692() && r0.r_().m13372(C2529.f11531)) {
            r0.m11084().f8944.m10377();
        }
        r0.f3595 = !r32;
        this.f3667.m11089().m6382((AtomicReference<String>) new AtomicReference());
    }
}
