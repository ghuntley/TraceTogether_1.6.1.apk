package o;

import o.C2383;

/* renamed from: o.σ  reason: contains not printable characters */
final class C2116 {

    /* renamed from: ι  reason: contains not printable characters */
    private static C2383.C2385 f10243 = C2383.C2385.m12397("nm", "c", "o", "tr", "hd");

    /* renamed from: ι  reason: contains not printable characters */
    static C2864 m11272(C2383 r8, C0343 r9) {
        String str = null;
        C1282 r4 = null;
        C1282 r5 = null;
        C1360 r6 = null;
        boolean z = false;
        while (r8.m12383()) {
            int r0 = r8.m12385(f10243);
            if (r0 == 0) {
                str = r8.m12384();
            } else if (r0 == 1) {
                r4 = C2745.m14540(r8, r9);
            } else if (r0 == 2) {
                r5 = C2745.m14540(r8, r9);
            } else if (r0 == 3) {
                r6 = C1812.m10011(r8, r9);
            } else if (r0 != 4) {
                r8.m12396();
            } else {
                z = r8.m12394();
            }
        }
        return new C2864(str, r4, r5, r6, z);
    }
}
