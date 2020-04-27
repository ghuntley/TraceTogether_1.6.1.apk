package o;

import android.graphics.PointF;
import o.C2383;
import o.C2715;

/* renamed from: o.ιґ  reason: contains not printable characters */
final class C2069 {

    /* renamed from: ι  reason: contains not printable characters */
    private static C2383.C2385 f10142 = C2383.C2385.m12397("nm", "p", "s", "r", "hd");

    /* renamed from: ι  reason: contains not printable characters */
    static C2715.If m10996(C2383 r8, C0343 r9) {
        String str = null;
        C1431<PointF, PointF> r4 = null;
        C1333 r5 = null;
        C1282 r6 = null;
        boolean z = false;
        while (r8.m12383()) {
            int r0 = r8.m12385(f10142);
            if (r0 == 0) {
                str = r8.m12384();
            } else if (r0 == 1) {
                r4 = C1742.m9809(r8, r9);
            } else if (r0 == 2) {
                r5 = new C1333(C2040.m10922(r8, r9, C2467.m12711(), C2114.f10240));
            } else if (r0 == 3) {
                r6 = C2745.m14507(r8, r9);
            } else if (r0 != 4) {
                r8.m12396();
            } else {
                z = r8.m12394();
            }
        }
        return new C2715.If(str, r4, r5, r6, z);
    }
}
