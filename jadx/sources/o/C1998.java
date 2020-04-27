package o;

import java.util.ArrayList;
import o.C1547;
import o.C2383;

/* renamed from: o.ιɼ  reason: contains not printable characters */
final class C1998 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2383.C2385 f9940 = C2383.C2385.m12397("n", "v");

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2383.C2385 f9941 = C2383.C2385.m12397("p", "k");

    /* renamed from: ι  reason: contains not printable characters */
    private static C2383.C2385 f9942 = C2383.C2385.m12397("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: ı  reason: contains not printable characters */
    static C1496 m10799(C2383 r21, C0343 r22) {
        C2383 r0 = r21;
        C0343 r1 = r22;
        ArrayList arrayList = new ArrayList();
        String str = null;
        C1485 r5 = null;
        C1258 r6 = null;
        C1267 r7 = null;
        C1333 r8 = null;
        C1333 r9 = null;
        C1282 r10 = null;
        C1547.Cif ifVar = null;
        C1547.C1548 r13 = null;
        float f = 0.0f;
        C1282 r15 = null;
        boolean z = false;
        while (r21.m12383()) {
            switch (r0.m12385(f9942)) {
                case 0:
                    str = r21.m12384();
                    break;
                case 1:
                    int i = -1;
                    r21.m12391();
                    while (r21.m12383()) {
                        int r3 = r0.m12385(f9941);
                        if (r3 != 0) {
                            C1258 r19 = r6;
                            if (r3 != 1) {
                                r21.m12393();
                                r21.m12396();
                                r6 = r19;
                            } else {
                                r6 = new C1258(C2040.m10922(r0, r1, 1.0f, new C1982(i)));
                                i = i;
                            }
                        } else {
                            C1258 r192 = r6;
                            i = r21.m12389();
                        }
                    }
                    C1258 r193 = r6;
                    r21.m12392();
                    break;
                case 2:
                    r7 = new C1267(C2040.m10922(r0, r1, 1.0f, C1997.f9939));
                    break;
                case 3:
                    r5 = r21.m12389() == 1 ? C1485.LINEAR : C1485.RADIAL;
                    break;
                case 4:
                    r8 = new C1333(C2040.m10922(r0, r1, C2467.m12711(), C2114.f10240));
                    break;
                case 5:
                    r9 = new C1333(C2040.m10922(r0, r1, C2467.m12711(), C2114.f10240));
                    break;
                case 6:
                    r10 = C2745.m14507(r21, r22);
                    break;
                case 7:
                    ifVar = C1547.Cif.values()[r21.m12389() - 1];
                    break;
                case 8:
                    r13 = C1547.C1548.values()[r21.m12389() - 1];
                    break;
                case 9:
                    f = (float) r21.m12387();
                    break;
                case 10:
                    z = r21.m12394();
                    break;
                case 11:
                    r21.m12388();
                    while (r21.m12383()) {
                        r21.m12391();
                        String str2 = null;
                        C1282 r194 = null;
                        while (r21.m12383()) {
                            int r2 = r0.m12385(f9940);
                            if (r2 != 0) {
                                C1282 r18 = r15;
                                if (r2 != 1) {
                                    r21.m12393();
                                    r21.m12396();
                                } else {
                                    r194 = C2745.m14507(r21, r22);
                                }
                                r15 = r18;
                            } else {
                                C1282 r182 = r15;
                                str2 = r21.m12384();
                            }
                        }
                        C1282 r183 = r15;
                        r21.m12392();
                        if (str2.equals("o")) {
                            r15 = r194;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                r1.f3728 = true;
                                arrayList.add(r194);
                            }
                            r15 = r183;
                        }
                    }
                    C1282 r184 = r15;
                    r21.m12386();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    r15 = r184;
                    break;
                default:
                    r21.m12393();
                    r21.m12396();
                    break;
            }
        }
        return new C1496(str, r5, r6, r7, r8, r9, r10, ifVar, r13, f, arrayList, r15, z);
    }
}
