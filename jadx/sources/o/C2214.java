package o;

import android.graphics.Path;
import o.C2383;

/* renamed from: o.Іŀ  reason: contains not printable characters */
final class C2214 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2383.C2385 f10482 = C2383.C2385.m12397("nm", "c", "o", "fillEnabled", "r", "hd");

    /* renamed from: ι  reason: contains not printable characters */
    static C1577 m11654(C2383 r10, C0343 r11) {
        String str = null;
        C1292 r6 = null;
        C1267 r7 = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (r10.m12383()) {
            int r2 = r10.m12385(f10482);
            if (r2 == 0) {
                str = r10.m12384();
            } else if (r2 == 1) {
                r6 = new C1292(C2040.m10922(r10, r11, 1.0f, C1797.f9230));
            } else if (r2 == 2) {
                r7 = new C1267(C2040.m10922(r10, r11, 1.0f, C1997.f9939));
            } else if (r2 == 3) {
                z = r10.m12394();
            } else if (r2 == 4) {
                i = r10.m12389();
            } else if (r2 != 5) {
                r10.m12393();
                r10.m12396();
            } else {
                z2 = r10.m12394();
            }
        }
        return new C1577(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, r6, r7, z2);
    }
}
