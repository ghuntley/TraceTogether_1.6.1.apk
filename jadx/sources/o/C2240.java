package o;

import o.C2383;

/* renamed from: o.Іɍ  reason: contains not printable characters */
final class C2240 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C2383.C2385 f10526 = C2383.C2385.m12397("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2383.C2385 f10527 = C2383.C2385.m12397("n", "v");

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009f  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static o.C1547 m11691(o.C2383 r18, o.C0343 r19) {
        /*
            r0 = r18
            r1 = r19
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0013:
            boolean r14 = r18.m12383()
            if (r14 == 0) goto L_0x0112
            o.а$ɩ r14 = f10526
            int r14 = r0.m12385(r14)
            r15 = 1065353216(0x3f800000, float:1.0)
            r4 = 1
            switch(r14) {
                case 0: goto L_0x010b;
                case 1: goto L_0x00fd;
                case 2: goto L_0x00f6;
                case 3: goto L_0x00e8;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00ca;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00bb;
                case 8: goto L_0x002a;
                default: goto L_0x0025;
            }
        L_0x0025:
            r2 = 0
            r18.m12396()
            goto L_0x0013
        L_0x002a:
            r18.m12388()
        L_0x002d:
            boolean r14 = r18.m12383()
            if (r14 == 0) goto L_0x00a2
            r18.m12391()
            r14 = 0
            r15 = 0
        L_0x0038:
            boolean r16 = r18.m12383()
            if (r16 == 0) goto L_0x0059
            o.а$ɩ r2 = f10527
            int r2 = r0.m12385(r2)
            if (r2 == 0) goto L_0x0054
            if (r2 == r4) goto L_0x004f
            r18.m12393()
            r18.m12396()
            goto L_0x0038
        L_0x004f:
            o.ɩͻ r15 = o.C2745.m14507((o.C2383) r18, (o.C0343) r19)
            goto L_0x0038
        L_0x0054:
            java.lang.String r14 = r18.m12384()
            goto L_0x0038
        L_0x0059:
            r18.m12392()
            int r2 = r14.hashCode()
            r4 = 100
            r17 = r6
            r6 = 2
            if (r2 == r4) goto L_0x0084
            r4 = 103(0x67, float:1.44E-43)
            if (r2 == r4) goto L_0x007a
            r4 = 111(0x6f, float:1.56E-43)
            if (r2 == r4) goto L_0x0070
            goto L_0x008e
        L_0x0070:
            java.lang.String r2 = "o"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x008e
            r2 = 0
            goto L_0x008f
        L_0x007a:
            java.lang.String r2 = "g"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x008e
            r2 = 2
            goto L_0x008f
        L_0x0084:
            java.lang.String r2 = "d"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x008e
            r2 = 1
            goto L_0x008f
        L_0x008e:
            r2 = -1
        L_0x008f:
            if (r2 == 0) goto L_0x009f
            r4 = 1
            if (r2 == r4) goto L_0x0097
            if (r2 == r6) goto L_0x0097
            goto L_0x009c
        L_0x0097:
            r1.f3728 = r4
            r3.add(r15)
        L_0x009c:
            r6 = r17
            goto L_0x002d
        L_0x009f:
            r6 = r15
            r4 = 1
            goto L_0x002d
        L_0x00a2:
            r17 = r6
            r18.m12386()
            int r2 = r3.size()
            if (r2 != r4) goto L_0x00b6
            r2 = 0
            java.lang.Object r4 = r3.get(r2)
            r3.add(r4)
            goto L_0x00b7
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            r6 = r17
            goto L_0x0013
        L_0x00bb:
            r2 = 0
            boolean r13 = r18.m12394()
            goto L_0x0013
        L_0x00c2:
            r2 = 0
            double r14 = r18.m12387()
            float r12 = (float) r14
            goto L_0x0013
        L_0x00ca:
            r2 = 0
            o.ɾɹ$ǃ[] r4 = o.C1547.C1548.values()
            int r11 = r18.m12389()
            r14 = 1
            int r11 = r11 - r14
            r11 = r4[r11]
            goto L_0x0013
        L_0x00d9:
            r2 = 0
            r14 = 1
            o.ɾɹ$if[] r4 = o.C1547.Cif.values()
            int r10 = r18.m12389()
            int r10 = r10 - r14
            r10 = r4[r10]
            goto L_0x0013
        L_0x00e8:
            r2 = 0
            o.ɩɺ r8 = new o.ɩɺ
            o.ιɺ r4 = o.C1997.f9939
            java.util.List r4 = o.C2040.m10922(r0, r1, r15, r4)
            r8.<init>(r4)
            goto L_0x0013
        L_0x00f6:
            r2 = 0
            o.ɩͻ r9 = o.C2745.m14507((o.C2383) r18, (o.C0343) r19)
            goto L_0x0013
        L_0x00fd:
            r2 = 0
            o.ɩϳ r7 = new o.ɩϳ
            o.Ιƚ r4 = o.C1797.f9230
            java.util.List r4 = o.C2040.m10922(r0, r1, r15, r4)
            r7.<init>(r4)
            goto L_0x0013
        L_0x010b:
            r2 = 0
            java.lang.String r5 = r18.m12384()
            goto L_0x0013
        L_0x0112:
            o.ɾɹ r14 = new o.ɾɹ
            r0 = r14
            r1 = r5
            r2 = r6
            r4 = r7
            r5 = r8
            r6 = r9
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2240.m11691(o.а, o.ıɭ):o.ɾɹ");
    }
}
