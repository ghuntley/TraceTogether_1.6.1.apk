package o;

import android.graphics.Path;
import o.C2383;

/* renamed from: o.Χ  reason: contains not printable characters */
final class C1923 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2383.C2385 f9704 = C2383.C2385.m12397("p", "k");

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2383.C2385 f9705 = C2383.C2385.m12397("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: ǃ  reason: contains not printable characters */
    static C1466 m10462(C2383 r12, C0343 r13) {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        C1485 r5 = null;
        C1258 r7 = null;
        C1267 r8 = null;
        C1333 r9 = null;
        C1333 r10 = null;
        boolean z = false;
        while (r12.m12383()) {
            switch (r12.m12385(f9705)) {
                case 0:
                    str = r12.m12384();
                    break;
                case 1:
                    int i = -1;
                    r12.m12391();
                    while (r12.m12383()) {
                        int r3 = r12.m12385(f9704);
                        if (r3 == 0) {
                            i = r12.m12389();
                        } else if (r3 != 1) {
                            r12.m12393();
                            r12.m12396();
                        } else {
                            r7 = new C1258(C2040.m10922(r12, r13, 1.0f, new C1982(i)));
                        }
                    }
                    r12.m12392();
                    break;
                case 2:
                    r8 = new C1267(C2040.m10922(r12, r13, 1.0f, C1997.f9939));
                    break;
                case 3:
                    r5 = r12.m12389() == 1 ? C1485.LINEAR : C1485.RADIAL;
                    break;
                case 4:
                    r9 = new C1333(C2040.m10922(r12, r13, C2467.m12711(), C2114.f10240));
                    break;
                case 5:
                    r10 = new C1333(C2040.m10922(r12, r13, C2467.m12711(), C2114.f10240));
                    break;
                case 6:
                    fillType = r12.m12389() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = r12.m12394();
                    break;
                default:
                    r12.m12393();
                    r12.m12396();
                    break;
            }
        }
        return new C1466(str, r5, fillType, r7, r8, r9, r10, z);
    }
}
