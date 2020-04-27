package o;

import o.C2383;
import o.C2864;

/* renamed from: o.ϲι  reason: contains not printable characters */
final class C2176 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2383.C2385 f10357 = C2383.C2385.m12397("nm", "ind", "ks", "hd");

    /* renamed from: ɩ  reason: contains not printable characters */
    static C2864.C2866 m11539(C2383 r6, C0343 r7) {
        int i = 0;
        String str = null;
        C1296 r2 = null;
        boolean z = false;
        while (r6.m12383()) {
            int r4 = r6.m12385(f10357);
            if (r4 == 0) {
                str = r6.m12384();
            } else if (r4 == 1) {
                i = r6.m12389();
            } else if (r4 == 2) {
                r2 = new C1296(C2040.m10922(r6, r7, C2467.m12711(), C2157.f10322));
            } else if (r4 != 3) {
                r6.m12396();
            } else {
                z = r6.m12394();
            }
        }
        return new C2864.C2866(str, i, r2, z);
    }
}
