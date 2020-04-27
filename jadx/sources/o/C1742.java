package o;

import android.graphics.PointF;
import java.util.ArrayList;
import o.C2383;

/* renamed from: o.ͻι  reason: contains not printable characters */
public final class C1742 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C2383.C2385 f9040 = C2383.C2385.m12397("k", "x", "y");

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1302 m9808(C2383 r4, C0343 r5) {
        ArrayList arrayList = new ArrayList();
        if (r4.m12390() == C2383.C2384.BEGIN_ARRAY) {
            r4.m12388();
            while (r4.m12383()) {
                arrayList.add(new C1083(r5, C2021.m10839(r4, r5, C2467.m12711(), C2122.f10263, r4.m12390() == C2383.C2384.BEGIN_OBJECT)));
            }
            r4.m12386();
            C2040.m10921(arrayList);
        } else {
            arrayList.add(new C2463(C2041.m10923(r4, C2467.m12711())));
        }
        return new C1302(arrayList);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static C1431<PointF, PointF> m9809(C2383 r7, C0343 r8) {
        r7.m12391();
        C1302 r1 = null;
        boolean z = false;
        C1282 r3 = null;
        C1282 r4 = null;
        while (r7.m12390() != C2383.C2384.END_OBJECT) {
            int r5 = r7.m12385(f9040);
            if (r5 != 0) {
                if (r5 != 1) {
                    if (r5 != 2) {
                        r7.m12393();
                        r7.m12396();
                    } else if (r7.m12390() == C2383.C2384.STRING) {
                        r7.m12396();
                    } else {
                        r4 = C2745.m14507(r7, r8);
                    }
                } else if (r7.m12390() == C2383.C2384.STRING) {
                    r7.m12396();
                } else {
                    r3 = C2745.m14507(r7, r8);
                }
                z = true;
            } else {
                r1 = m9808(r7, r8);
            }
        }
        r7.m12392();
        if (z) {
            C2414.m12460("Lottie doesn't support expressions.");
            r8.f3722.add("Lottie doesn't support expressions.");
        }
        return r1 != null ? r1 : new C1313(r3, r4);
    }
}
