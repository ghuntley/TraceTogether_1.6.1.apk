package o;

import java.util.ArrayList;
import java.util.List;
import o.C2383;

/* renamed from: o.ιϲ  reason: contains not printable characters */
public final class C2040 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C2383.C2385 f10083 = C2383.C2385.m12397("k");

    /* renamed from: ι  reason: contains not printable characters */
    public static <T> List<C2463<T>> m10922(C2383 r4, C0343 r5, float f, C2218<T> r7) {
        ArrayList arrayList = new ArrayList();
        if (r4.m12390() == C2383.C2384.STRING) {
            C2414.m12460("Lottie doesn't support expressions.");
            r5.f3722.add("Lottie doesn't support expressions.");
            return arrayList;
        }
        r4.m12391();
        while (r4.m12383()) {
            if (r4.m12385(f10083) != 0) {
                r4.m12396();
            } else if (r4.m12390() == C2383.C2384.BEGIN_ARRAY) {
                r4.m12388();
                if (r4.m12390() == C2383.C2384.NUMBER) {
                    arrayList.add(C2021.m10839(r4, r5, f, r7, false));
                } else {
                    while (r4.m12383()) {
                        arrayList.add(C2021.m10839(r4, r5, f, r7, true));
                    }
                }
                r4.m12386();
            } else {
                arrayList.add(C2021.m10839(r4, r5, f, r7, false));
            }
        }
        r4.m12392();
        m10921(arrayList);
        return arrayList;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T> void m10921(List<? extends C2463<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C2463 r2 = (C2463) list.get(i2);
            i2++;
            C2463 r3 = (C2463) list.get(i2);
            r2.f11221 = Float.valueOf(r3.f11224);
            if (r2.f11223 == null && r3.f11217 != null) {
                r2.f11223 = r3.f11217;
                if (r2 instanceof C1083) {
                    ((C1083) r2).m7442();
                }
            }
        }
        C2463 r0 = (C2463) list.get(i);
        if ((r0.f11217 == null || r0.f11223 == null) && list.size() > 1) {
            list.remove(r0);
        }
    }
}
