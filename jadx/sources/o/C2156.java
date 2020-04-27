package o;

import android.graphics.PointF;
import o.C1567;
import o.C2383;

/* renamed from: o.ϡ  reason: contains not printable characters */
final class C2156 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2383.C2385 f10321 = C2383.C2385.m12397("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* renamed from: ɩ  reason: contains not printable characters */
    static C1567 m11422(C2383 r13, C0343 r14) {
        String str = null;
        C1567.If ifR = null;
        C1282 r5 = null;
        C1431<PointF, PointF> r6 = null;
        C1282 r7 = null;
        C1282 r8 = null;
        C1282 r9 = null;
        C1282 r10 = null;
        C1282 r11 = null;
        boolean z = false;
        while (r13.m12383()) {
            switch (r13.m12385(f10321)) {
                case 0:
                    str = r13.m12384();
                    break;
                case 1:
                    ifR = C1567.If.m9208(r13.m12389());
                    break;
                case 2:
                    r5 = C2745.m14540(r13, r14);
                    break;
                case 3:
                    r6 = C1742.m9809(r13, r14);
                    break;
                case 4:
                    r7 = C2745.m14540(r13, r14);
                    break;
                case 5:
                    r9 = C2745.m14507(r13, r14);
                    break;
                case 6:
                    r11 = C2745.m14540(r13, r14);
                    break;
                case 7:
                    r8 = C2745.m14507(r13, r14);
                    break;
                case 8:
                    r10 = C2745.m14540(r13, r14);
                    break;
                case 9:
                    z = r13.m12394();
                    break;
                default:
                    r13.m12393();
                    r13.m12396();
                    break;
            }
        }
        return new C1567(str, ifR, r5, r6, r7, r8, r9, r10, r11, z);
    }
}
