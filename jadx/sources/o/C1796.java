package o;

import android.graphics.PointF;
import o.C2383;

/* renamed from: o.ΙƗ  reason: contains not printable characters */
final class C1796 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C2383.C2385 f9229 = C2383.C2385.m12397("nm", "p", "s", "hd", "d");

    /* renamed from: ǃ  reason: contains not printable characters */
    static C2715 m9973(C2383 r10, C0343 r11, int i) {
        boolean z = i == 3;
        String str = null;
        C1431<PointF, PointF> r6 = null;
        C1333 r7 = null;
        boolean z2 = false;
        while (r10.m12383()) {
            int r12 = r10.m12385(f9229);
            if (r12 == 0) {
                str = r10.m12384();
            } else if (r12 == 1) {
                r6 = C1742.m9809(r10, r11);
            } else if (r12 == 2) {
                r7 = new C1333(C2040.m10922(r10, r11, C2467.m12711(), C2114.f10240));
            } else if (r12 == 3) {
                z2 = r10.m12394();
            } else if (r12 != 4) {
                r10.m12393();
                r10.m12396();
            } else {
                z = r10.m12389() == 3;
            }
        }
        return new C2715(str, r6, r7, z, z2);
    }
}
