package o;

import o.C2383;

/* renamed from: o.ιɟ  reason: contains not printable characters */
final class C1988 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2383.C2385 f9931 = C2383.C2385.m12397("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: Ι  reason: contains not printable characters */
    static C1311 m10781(C2383 r5) {
        r5.m12391();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (r5.m12383()) {
            int r3 = r5.m12385(f9931);
            if (r3 == 0) {
                str = r5.m12384();
            } else if (r3 == 1) {
                str2 = r5.m12384();
            } else if (r3 == 2) {
                str3 = r5.m12384();
            } else if (r3 != 3) {
                r5.m12393();
                r5.m12396();
            } else {
                r5.m12387();
            }
        }
        r5.m12392();
        return new C1311(str, str2, str3);
    }
}
