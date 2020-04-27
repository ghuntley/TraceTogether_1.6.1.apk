package o;

import java.util.ArrayList;
import o.C2383;
import o.C2864;

/* renamed from: o.ϲɩ  reason: contains not printable characters */
final class C2171 {

    /* renamed from: ι  reason: contains not printable characters */
    private static C2383.C2385 f10341 = C2383.C2385.m12397("nm", "hd", "it");

    /* renamed from: ι  reason: contains not printable characters */
    static C2864.If m11528(C2383 r5, C0343 r6) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (r5.m12383()) {
            int r3 = r5.m12385(f10341);
            if (r3 == 0) {
                str = r5.m12384();
            } else if (r3 == 1) {
                z = r5.m12394();
            } else if (r3 != 2) {
                r5.m12396();
            } else {
                r5.m12388();
                while (r5.m12383()) {
                    C1455 r32 = C1791.m9954(r5, r6);
                    if (r32 != null) {
                        arrayList.add(r32);
                    }
                }
                r5.m12386();
            }
        }
        return new C2864.If(str, arrayList, z);
    }
}
