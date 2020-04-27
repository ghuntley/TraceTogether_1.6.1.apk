package o;

import o.C1559;
import o.C2383;

/* renamed from: o.ІƗ  reason: contains not printable characters */
final class C2223 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C2383.C2385 f10500 = C2383.C2385.m12397("s", "e", "o", "nm", "m", "hd");

    /* renamed from: Ι  reason: contains not printable characters */
    static C1559 m11670(C2383 r9, C0343 r10) {
        String str = null;
        C1559.If ifR = null;
        C1282 r5 = null;
        C1282 r6 = null;
        C1282 r7 = null;
        boolean z = false;
        while (r9.m12383()) {
            int r0 = r9.m12385(f10500);
            if (r0 == 0) {
                r5 = C2745.m14540(r9, r10);
            } else if (r0 == 1) {
                r6 = C2745.m14540(r9, r10);
            } else if (r0 == 2) {
                r7 = C2745.m14540(r9, r10);
            } else if (r0 == 3) {
                str = r9.m12384();
            } else if (r0 == 4) {
                ifR = C1559.If.m9185(r9.m12389());
            } else if (r0 != 5) {
                r9.m12396();
            } else {
                z = r9.m12394();
            }
        }
        return new C1559(str, ifR, r5, r6, r7, z);
    }
}
