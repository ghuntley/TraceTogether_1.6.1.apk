package androidx.fragment.app;

import o.C1277;
import o.C2319;
import o.C2456;
import o.C2851;

public class Fragment$2 implements C2456 {

    /* renamed from: Ι  reason: contains not printable characters */
    final /* synthetic */ C1277 f211;

    public Fragment$2(C1277 r1) {
        this.f211 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m179(C2851 r1, C2319.C2320 r2) {
        if (r2 == C2319.C2320.ON_STOP && this.f211.mView != null) {
            this.f211.mView.cancelPendingInputEvents();
        }
    }
}
