package o;

import java.util.ArrayList;
import o.C2383;
import o.C2864;

/* renamed from: o.ιǀ  reason: contains not printable characters */
final class C1968 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2383.C2385 f9871 = C2383.C2385.m12397("shapes");

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2383.C2385 f9872 = C2383.C2385.m12397("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: ı  reason: contains not printable characters */
    static C1460 m10692(C2383 r9, C0343 r10) {
        ArrayList arrayList = new ArrayList();
        r9.m12391();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (r9.m12383()) {
            int r0 = r9.m12385(f9872);
            if (r0 == 0) {
                c = r9.m12384().charAt(0);
            } else if (r0 == 1) {
                r9.m12387();
            } else if (r0 == 2) {
                d = r9.m12387();
            } else if (r0 == 3) {
                str = r9.m12384();
            } else if (r0 == 4) {
                str2 = r9.m12384();
            } else if (r0 != 5) {
                r9.m12393();
                r9.m12396();
            } else {
                r9.m12391();
                while (r9.m12383()) {
                    if (r9.m12385(f9871) != 0) {
                        r9.m12393();
                        r9.m12396();
                    } else {
                        r9.m12388();
                        while (r9.m12383()) {
                            arrayList.add((C2864.If) C1791.m9954(r9, r10));
                        }
                        r9.m12386();
                    }
                }
                r9.m12392();
            }
        }
        r9.m12392();
        return new C1460(arrayList, c, d, str, str2);
    }
}
