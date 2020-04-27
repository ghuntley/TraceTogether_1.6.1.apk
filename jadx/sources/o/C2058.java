package o;

import o.C1501;
import o.C2383;

/* renamed from: o.ιх  reason: contains not printable characters */
final class C2058 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2383.C2385 f10119 = C2383.C2385.m12397("nm", "mm", "hd");

    /* renamed from: ǃ  reason: contains not printable characters */
    static C1501 m10959(C2383 r5) {
        String str = null;
        C1501.C1502 r1 = null;
        boolean z = false;
        while (r5.m12383()) {
            int r3 = r5.m12385(f10119);
            if (r3 == 0) {
                str = r5.m12384();
            } else if (r3 == 1) {
                r1 = C1501.C1502.m8919(r5.m12389());
            } else if (r3 != 2) {
                r5.m12393();
                r5.m12396();
            } else {
                z = r5.m12394();
            }
        }
        return new C1501(str, r1, z);
    }
}
