package o;

import o.C2383;

/* renamed from: o.Γǃ  reason: contains not printable characters */
public final class C1773 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C2383.C2385 f9105 = C2383.C2385.m12397("fc", "sc", "sw", "t");

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2383.C2385 f9106 = C2383.C2385.m12397("a");

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2724 m9886(C2383 r8, C0343 r9) {
        r8.m12391();
        C2724 r1 = null;
        while (r8.m12383()) {
            if (r8.m12385(f9106) != 0) {
                r8.m12393();
                r8.m12396();
            } else {
                r8.m12391();
                C1292 r12 = null;
                C1292 r2 = null;
                C1282 r3 = null;
                C1282 r4 = null;
                while (r8.m12383()) {
                    int r5 = r8.m12385(f9105);
                    if (r5 == 0) {
                        r12 = new C1292(C2040.m10922(r8, r9, 1.0f, C1797.f9230));
                    } else if (r5 == 1) {
                        r2 = new C1292(C2040.m10922(r8, r9, 1.0f, C1797.f9230));
                    } else if (r5 == 2) {
                        r3 = C2745.m14507(r8, r9);
                    } else if (r5 != 3) {
                        r8.m12393();
                        r8.m12396();
                    } else {
                        r4 = C2745.m14507(r8, r9);
                    }
                }
                r8.m12392();
                r1 = new C2724(r12, r2, r3, r4);
            }
        }
        r8.m12392();
        return r1 == null ? new C2724((C1292) null, (C1292) null, (C1282) null, (C1282) null) : r1;
    }
}
