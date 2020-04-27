package androidx.navigation;

import o.C0540;
import o.C0546;
import o.C2319;
import o.C2456;
import o.C2851;

public class NavController$1 implements C2456 {

    /* renamed from: ι  reason: contains not printable characters */
    final /* synthetic */ C0540 f261;

    public NavController$1(C0540 r1) {
        this.f261 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m219(C2851 r4, C2319.C2320 r5) {
        C2319.Cif ifVar;
        if (this.f261.f4384 != null) {
            for (C0546 next : this.f261.f4386) {
                switch (C0546.AnonymousClass5.f4433[r5.ordinal()]) {
                    case 1:
                    case 2:
                        ifVar = C2319.Cif.CREATED;
                        break;
                    case 3:
                    case 4:
                        ifVar = C2319.Cif.STARTED;
                        break;
                    case 5:
                        ifVar = C2319.Cif.RESUMED;
                        break;
                    case 6:
                        ifVar = C2319.Cif.DESTROYED;
                        break;
                    default:
                        throw new IllegalArgumentException("Unexpected event value ".concat(String.valueOf(r5)));
                }
                next.f4423 = ifVar;
                next.m5133();
            }
        }
    }
}
