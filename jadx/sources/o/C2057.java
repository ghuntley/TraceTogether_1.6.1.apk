package o;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C1685;
import o.C2383;
import o.C2771;

/* renamed from: o.ιт  reason: contains not printable characters */
public final class C2057 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2383.C2385 f10115 = C2383.C2385.m12397("list");

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2383.C2385 f10116 = C2383.C2385.m12397("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2383.C2385 f10117 = C2383.C2385.m12397("id", "layers", "w", "h", "p", "u");

    /* renamed from: ι  reason: contains not printable characters */
    private static final C2383.C2385 f10118 = C2383.C2385.m12397("cm", "tm", "dr");

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0343 m10954(C2383 r19) {
        ArrayList arrayList;
        HashMap hashMap;
        C2383 r0 = r19;
        float r1 = C2467.m12711();
        C0782<C1685> r2 = new C0782<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C1286<C1460> r8 = new C1286<>();
        C0343 r9 = new C0343();
        r19.m12391();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (r19.m12383()) {
            switch (r0.m12385(f10116)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = r19.m12389();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = r19.m12389();
                    continue;
                case 2:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f = (float) r19.m12387();
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) r19.m12387()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) r19.m12387();
                    break;
                case 5:
                    String[] split = r19.m12384().split("\\.");
                    arrayList = arrayList3;
                    if (!C2467.m12709(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        C2414.m12460("Lottie only supports bodymovin >= 4.4.0");
                        r9.f3722.add("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    break;
                case 6:
                    m10957(r0, r9, (List<C1685>) arrayList2, r2);
                    break;
                case 7:
                    m10958(r0, r9, (Map<String, List<C1685>>) hashMap2, (Map<String, C2771.If>) hashMap3);
                    break;
                case 8:
                    m10956(r0, hashMap4);
                    break;
                case 9:
                    m10955(r0, r9, r8);
                    break;
                case 10:
                    m10953(r0, arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    r19.m12393();
                    r19.m12396();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            r0 = r19;
        }
        r9.f3729 = new Rect(0, 0, (int) (((float) i) * r1), (int) (((float) i2) * r1));
        r9.f3725 = f;
        r9.f3730 = f2;
        r9.f3726 = f3;
        r9.f3723 = arrayList2;
        r9.f3735 = r2;
        r9.f3727 = hashMap2;
        r9.f3724 = hashMap3;
        r9.f3733 = r8;
        r9.f3732 = hashMap4;
        r9.f3734 = arrayList3;
        return r9;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m10957(C2383 r4, C0343 r5, List<C1685> list, C0782<C1685> r7) {
        r4.m12388();
        int i = 0;
        while (r4.m12383()) {
            C1685 r1 = C2056.m10951(r4, r5);
            if (r1.f8736 == C1685.If.IMAGE) {
                i++;
            }
            list.add(r1);
            r7.m6116(r1.f8728, r1);
            if (i > 4) {
                StringBuilder sb = new StringBuilder("You have ");
                sb.append(i);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                C2414.m12460(sb.toString());
            }
        }
        r4.m12386();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m10958(C2383 r9, C0343 r10, Map<String, List<C1685>> map, Map<String, C2771.If> map2) {
        r9.m12388();
        while (r9.m12383()) {
            ArrayList arrayList = new ArrayList();
            C0782 r1 = new C0782();
            r9.m12391();
            String str = null;
            String str2 = null;
            int i = 0;
            int i2 = 0;
            while (r9.m12383()) {
                int r6 = r9.m12385(f10117);
                if (r6 == 0) {
                    str2 = r9.m12384();
                } else if (r6 == 1) {
                    r9.m12388();
                    while (r9.m12383()) {
                        C1685 r62 = C2056.m10951(r9, r10);
                        r1.m6116(r62.f8728, r62);
                        arrayList.add(r62);
                    }
                    r9.m12386();
                } else if (r6 == 2) {
                    i = r9.m12389();
                } else if (r6 == 3) {
                    i2 = r9.m12389();
                } else if (r6 == 4) {
                    str = r9.m12384();
                } else if (r6 != 5) {
                    r9.m12393();
                    r9.m12396();
                } else {
                    r9.m12384();
                }
            }
            r9.m12392();
            if (str != null) {
                C2771.If ifR = new C2771.If(i, i2, str2, str);
                map2.put(ifR.f13122, ifR);
            } else {
                map.put(str2, arrayList);
            }
        }
        r9.m12386();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m10956(C2383 r2, Map<String, C1311> map) {
        r2.m12391();
        while (r2.m12383()) {
            if (r2.m12385(f10115) != 0) {
                r2.m12393();
                r2.m12396();
            } else {
                r2.m12388();
                while (r2.m12383()) {
                    C1311 r0 = C1988.m10781(r2);
                    map.put(r0.f7293, r0);
                }
                r2.m12386();
            }
        }
        r2.m12392();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m10955(C2383 r2, C0343 r3, C1286<C1460> r4) {
        r2.m12388();
        while (r2.m12383()) {
            C1460 r0 = C1968.m10692(r2, r3);
            r4.m8219(r0.hashCode(), r0);
        }
        r2.m12386();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m10953(C2383 r5, List<C1248> list) {
        r5.m12388();
        while (r5.m12383()) {
            String str = null;
            r5.m12391();
            float f = 0.0f;
            float f2 = 0.0f;
            while (r5.m12383()) {
                int r3 = r5.m12385(f10118);
                if (r3 == 0) {
                    str = r5.m12384();
                } else if (r3 == 1) {
                    f = (float) r5.m12387();
                } else if (r3 != 2) {
                    r5.m12393();
                    r5.m12396();
                } else {
                    f2 = (float) r5.m12387();
                }
            }
            r5.m12392();
            list.add(new C1248(str, f, f2));
        }
        r5.m12386();
    }
}
