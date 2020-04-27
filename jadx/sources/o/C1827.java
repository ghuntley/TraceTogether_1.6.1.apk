package o;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: o.Ιɹ  reason: contains not printable characters */
public final class C1827 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final int[] f9325 = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C1902 f9326 = m10103();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C1902 f9327 = (Build.VERSION.SDK_INT >= 21 ? new C1893() : null);

    /* renamed from: o.Ιɹ$ǃ  reason: contains not printable characters */
    interface C1828 {
        /* renamed from: ı  reason: contains not printable characters */
        void m10111(C1277 r1, C1562 r2);

        /* renamed from: Ι  reason: contains not printable characters */
        void m10112(C1277 r1, C1562 r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C1902 m10103() {
        try {
            return (C1902) Class.forName("o.Ιɿ").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        r9 = r10.f9362;
        r14 = r10.f9365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0250, code lost:
        r3 = r10.f9362;
        r4 = r10.f9365;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ce A[ADDED_TO_REGION] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m10101(o.C1550 r42, java.util.ArrayList<o.C1265> r43, java.util.ArrayList<java.lang.Boolean> r44, int r45, int r46, boolean r47, o.C1827.C1828 r48) {
        /*
            r0 = r42
            r1 = r43
            r2 = r44
            r3 = r46
            r4 = r47
            r5 = r48
            int r6 = r0.f8266
            if (r6 > 0) goto L_0x0011
            return
        L_0x0011:
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            r7 = r45
        L_0x0018:
            if (r7 >= r3) goto L_0x0036
            java.lang.Object r8 = r1.get(r7)
            o.ɩɪ r8 = (o.C1265) r8
            java.lang.Object r9 = r2.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0030
            m10108(r8, r6, r4)
            goto L_0x0033
        L_0x0030:
            m10105((o.C1265) r8, (android.util.SparseArray<o.C1827.Cif>) r6, (boolean) r4)
        L_0x0033:
            int r7 = r7 + 1
            goto L_0x0018
        L_0x0036:
            int r7 = r6.size()
            if (r7 == 0) goto L_0x03f6
            android.view.View r7 = new android.view.View
            o.ɹі<?> r8 = r0.f8263
            android.content.Context r8 = r8.f7905
            r7.<init>(r8)
            int r15 = r6.size()
            r13 = 0
        L_0x004a:
            if (r13 >= r15) goto L_0x03f6
            int r8 = r6.keyAt(r13)
            r12 = r45
            o.ıƖ r11 = m10092(r8, r1, r2, r12, r3)
            java.lang.Object r9 = r6.valueAt(r13)
            r10 = r9
            o.Ιɹ$if r10 = (o.C1827.Cif) r10
            r21 = 0
            if (r4 == 0) goto L_0x0230
            o.ɪι r9 = r0.f8265
            boolean r9 = r9.m8523()
            if (r9 == 0) goto L_0x0072
            o.ɪι r9 = r0.f8265
            android.view.View r8 = r9.m8524(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L_0x0074
        L_0x0072:
            r8 = r21
        L_0x0074:
            if (r8 == 0) goto L_0x0226
            o.ɩʟ r9 = r10.f9362
            o.ɩʟ r14 = r10.f9365
            o.Κ r1 = m10100(r14, r9)
            if (r1 == 0) goto L_0x0226
            boolean r2 = r10.f9366
            boolean r3 = r10.f9363
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r37 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r9 != 0) goto L_0x0095
            r12 = r21
            goto L_0x00a6
        L_0x0095:
            if (r2 == 0) goto L_0x009c
            java.lang.Object r16 = r9.getReenterTransition()
            goto L_0x00a0
        L_0x009c:
            java.lang.Object r16 = r9.getEnterTransition()
        L_0x00a0:
            r12 = r16
            java.lang.Object r12 = r1.m10348((java.lang.Object) r12)
        L_0x00a6:
            if (r14 != 0) goto L_0x00ad
            r38 = r13
            r3 = r21
            goto L_0x00be
        L_0x00ad:
            if (r3 == 0) goto L_0x00b4
            java.lang.Object r3 = r14.getReturnTransition()
            goto L_0x00b8
        L_0x00b4:
            java.lang.Object r3 = r14.getExitTransition()
        L_0x00b8:
            java.lang.Object r3 = r1.m10348((java.lang.Object) r3)
            r38 = r13
        L_0x00be:
            o.ɩʟ r13 = r10.f9362
            r39 = r15
            o.ɩʟ r15 = r10.f9365
            if (r13 == 0) goto L_0x00ce
            android.view.View r0 = r13.requireView()
            r5 = 0
            r0.setVisibility(r5)
        L_0x00ce:
            if (r13 == 0) goto L_0x0173
            if (r15 != 0) goto L_0x00d4
            goto L_0x0173
        L_0x00d4:
            boolean r0 = r10.f9366
            boolean r5 = r11.isEmpty()
            if (r5 == 0) goto L_0x00e1
            r16 = r2
            r5 = r21
            goto L_0x00e7
        L_0x00e1:
            java.lang.Object r5 = m10107(r1, r13, r15, r0)
            r16 = r2
        L_0x00e7:
            o.ıƖ r2 = m10093((o.C1902) r1, (o.C0299<java.lang.String, java.lang.String>) r11, (java.lang.Object) r5, (o.C1827.Cif) r10)
            r17 = r9
            o.ıƖ r9 = m10099(r1, r11, r5, r10)
            boolean r18 = r11.isEmpty()
            if (r18 == 0) goto L_0x0104
            if (r2 == 0) goto L_0x00fc
            r2.clear()
        L_0x00fc:
            if (r9 == 0) goto L_0x0101
            r9.clear()
        L_0x0101:
            r5 = r21
            goto L_0x0116
        L_0x0104:
            r18 = r5
            java.util.Set r5 = r11.keySet()
            m10104((java.util.ArrayList<android.view.View>) r6, (o.C0299<java.lang.String, android.view.View>) r2, (java.util.Collection<java.lang.String>) r5)
            java.util.Collection r5 = r11.values()
            m10104((java.util.ArrayList<android.view.View>) r4, (o.C0299<java.lang.String, android.view.View>) r9, (java.util.Collection<java.lang.String>) r5)
            r5 = r18
        L_0x0116:
            if (r12 != 0) goto L_0x0121
            if (r3 != 0) goto L_0x0121
            if (r5 != 0) goto L_0x0121
            r41 = r4
        L_0x011e:
            r40 = r11
            goto L_0x017a
        L_0x0121:
            m10106(r13, r15, r0, r2)
            if (r5 == 0) goto L_0x0156
            r4.add(r7)
            r1.m10362((java.lang.Object) r5, (android.view.View) r7, (java.util.ArrayList<android.view.View>) r6)
            r40 = r11
            boolean r11 = r10.f9363
            r41 = r4
            o.ɩɪ r4 = r10.f9367
            r22 = r1
            r23 = r5
            r24 = r3
            r25 = r2
            r26 = r11
            r27 = r4
            m10102(r22, r23, r24, r25, r26, r27)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r21 = m10091((o.C0299<java.lang.String, android.view.View>) r9, (o.C1827.Cif) r10, (java.lang.Object) r12, (boolean) r0)
            if (r21 == 0) goto L_0x0151
            r1.m10355((java.lang.Object) r12, (android.graphics.Rect) r2)
        L_0x0151:
            r36 = r2
            r34 = r21
            goto L_0x015e
        L_0x0156:
            r41 = r4
            r40 = r11
            r34 = r21
            r36 = r34
        L_0x015e:
            o.Ιɹ$1 r2 = new o.Ιɹ$1
            r29 = r2
            r30 = r13
            r31 = r15
            r32 = r0
            r33 = r9
            r35 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            o.C2966.m15241(r8, r2)
            goto L_0x017c
        L_0x0173:
            r16 = r2
            r41 = r4
            r17 = r9
            goto L_0x011e
        L_0x017a:
            r5 = r21
        L_0x017c:
            if (r12 != 0) goto L_0x0187
            if (r5 != 0) goto L_0x0187
            if (r3 == 0) goto L_0x0183
            goto L_0x0187
        L_0x0183:
            r15 = r48
            goto L_0x0223
        L_0x0187:
            java.util.ArrayList r0 = m10098(r1, r3, r14, r6, r7)
            r2 = r17
            r4 = r41
            java.util.ArrayList r9 = m10098(r1, r12, r2, r4, r7)
            r10 = 4
            m10096((java.util.ArrayList<android.view.View>) r9, (int) r10)
            r22 = r1
            r23 = r12
            r24 = r3
            r25 = r5
            r26 = r2
            r27 = r16
            java.lang.Object r2 = m10094(r22, r23, r24, r25, r26, r27)
            if (r14 == 0) goto L_0x01ca
            if (r0 == 0) goto L_0x01ca
            int r10 = r0.size()
            if (r10 > 0) goto L_0x01b7
            int r10 = r6.size()
            if (r10 <= 0) goto L_0x01ca
        L_0x01b7:
            o.ɿǃ r10 = new o.ɿǃ
            r10.<init>()
            r15 = r48
            r15.m10112(r14, r10)
            o.Ιɹ$5 r11 = new o.Ιɹ$5
            r11.<init>(r15, r14, r10)
            r1.m10353(r14, r2, r10, r11)
            goto L_0x01cc
        L_0x01ca:
            r15 = r48
        L_0x01cc:
            if (r2 == 0) goto L_0x0223
            if (r14 == 0) goto L_0x01f3
            if (r3 == 0) goto L_0x01f3
            boolean r10 = r14.mAdded
            if (r10 == 0) goto L_0x01f3
            boolean r10 = r14.mHidden
            if (r10 == 0) goto L_0x01f3
            boolean r10 = r14.mHiddenChanged
            if (r10 == 0) goto L_0x01f3
            r10 = 1
            r14.setHideReplaced(r10)
            android.view.View r10 = r14.getView()
            r1.m10352((java.lang.Object) r3, (android.view.View) r10, (java.util.ArrayList<android.view.View>) r0)
            android.view.ViewGroup r10 = r14.mContainer
            o.Ιɹ$3 r11 = new o.Ιɹ$3
            r11.<init>(r0)
            o.C2966.m15241(r10, r11)
        L_0x01f3:
            java.util.ArrayList r20 = r1.m10361((java.util.ArrayList<android.view.View>) r4)
            r29 = r1
            r30 = r2
            r31 = r12
            r32 = r9
            r33 = r3
            r34 = r0
            r35 = r5
            r36 = r4
            r29.m10357(r30, r31, r32, r33, r34, r35, r36)
            r1.m10368((android.view.ViewGroup) r8, (java.lang.Object) r2)
            r16 = r1
            r17 = r8
            r18 = r6
            r19 = r4
            r21 = r40
            r16.m10358(r17, r18, r19, r20, r21)
            r0 = 0
            m10096((java.util.ArrayList<android.view.View>) r9, (int) r0)
            r1.m10364((java.lang.Object) r5, (java.util.ArrayList<android.view.View>) r6, (java.util.ArrayList<android.view.View>) r4)
            goto L_0x03dc
        L_0x0223:
            r0 = 0
            goto L_0x03dc
        L_0x0226:
            r37 = r6
            r38 = r13
            r39 = r15
            r0 = 0
            r15 = r5
            goto L_0x03dc
        L_0x0230:
            r1 = r0
            r37 = r6
            r40 = r11
            r38 = r13
            r39 = r15
            r0 = 0
            r15 = r5
            o.ɪι r2 = r1.f8265
            boolean r2 = r2.m8523()
            if (r2 == 0) goto L_0x024c
            o.ɪι r2 = r1.f8265
            android.view.View r2 = r2.m8524(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x024e
        L_0x024c:
            r2 = r21
        L_0x024e:
            if (r2 == 0) goto L_0x03dc
            o.ɩʟ r3 = r10.f9362
            o.ɩʟ r4 = r10.f9365
            o.Κ r5 = m10100(r4, r3)
            if (r5 == 0) goto L_0x03dc
            boolean r6 = r10.f9366
            boolean r8 = r10.f9363
            if (r3 != 0) goto L_0x0263
            r6 = r21
            goto L_0x0272
        L_0x0263:
            if (r6 == 0) goto L_0x026a
            java.lang.Object r6 = r3.getReenterTransition()
            goto L_0x026e
        L_0x026a:
            java.lang.Object r6 = r3.getEnterTransition()
        L_0x026e:
            java.lang.Object r6 = r5.m10348((java.lang.Object) r6)
        L_0x0272:
            if (r4 != 0) goto L_0x0277
            r14 = r21
            goto L_0x0287
        L_0x0277:
            if (r8 == 0) goto L_0x027e
            java.lang.Object r8 = r4.getReturnTransition()
            goto L_0x0282
        L_0x027e:
            java.lang.Object r8 = r4.getExitTransition()
        L_0x0282:
            java.lang.Object r8 = r5.m10348((java.lang.Object) r8)
            r14 = r8
        L_0x0287:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            o.ɩʟ r11 = r10.f9362
            o.ɩʟ r9 = r10.f9365
            if (r11 == 0) goto L_0x034a
            if (r9 != 0) goto L_0x029b
            goto L_0x034a
        L_0x029b:
            boolean r8 = r10.f9366
            boolean r16 = r40.isEmpty()
            if (r16 == 0) goto L_0x02aa
            r16 = r12
            r1 = r21
            r0 = r40
            goto L_0x02b4
        L_0x02aa:
            java.lang.Object r16 = m10107(r5, r11, r9, r8)
            r1 = r16
            r0 = r40
            r16 = r12
        L_0x02b4:
            o.ıƖ r12 = m10093((o.C1902) r5, (o.C0299<java.lang.String, java.lang.String>) r0, (java.lang.Object) r1, (o.C1827.Cif) r10)
            boolean r17 = r0.isEmpty()
            if (r17 == 0) goto L_0x02c1
            r1 = r21
            goto L_0x02cc
        L_0x02c1:
            r17 = r1
            java.util.Collection r1 = r12.values()
            r13.addAll(r1)
            r1 = r17
        L_0x02cc:
            if (r6 != 0) goto L_0x02e5
            if (r14 != 0) goto L_0x02e5
            if (r1 != 0) goto L_0x02e5
            r40 = r0
            r22 = r10
            r26 = r13
            r0 = r14
            r23 = r16
            r17 = r21
            r25 = r38
            r28 = r39
            r27 = 0
            goto L_0x0359
        L_0x02e5:
            m10106(r11, r9, r8, r12)
            if (r1 == 0) goto L_0x0313
            r17 = r8
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r5.m10362((java.lang.Object) r1, (android.view.View) r7, (java.util.ArrayList<android.view.View>) r13)
            r18 = r9
            boolean r9 = r10.f9363
            r19 = r11
            o.ɩɪ r11 = r10.f9367
            r22 = r5
            r23 = r1
            r24 = r14
            r25 = r12
            r26 = r9
            r27 = r11
            m10102(r22, r23, r24, r25, r26, r27)
            if (r6 == 0) goto L_0x0310
            r5.m10355((java.lang.Object) r6, (android.graphics.Rect) r8)
        L_0x0310:
            r20 = r8
            goto L_0x031b
        L_0x0313:
            r17 = r8
            r18 = r9
            r19 = r11
            r20 = r21
        L_0x031b:
            o.Ιɹ$6 r12 = new o.Ιɹ$6
            r8 = r12
            r9 = r5
            r11 = r10
            r10 = r0
            r22 = r11
            r11 = r1
            r24 = r1
            r1 = r12
            r23 = r16
            r12 = r22
            r26 = r13
            r25 = r38
            r13 = r23
            r40 = r0
            r0 = r14
            r27 = 0
            r14 = r7
            r28 = r39
            r15 = r19
            r16 = r18
            r18 = r26
            r19 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            o.C2966.m15241(r2, r1)
            r17 = r24
            goto L_0x0359
        L_0x034a:
            r22 = r10
            r23 = r12
            r26 = r13
            r0 = r14
            r25 = r38
            r28 = r39
            r27 = 0
            r17 = r21
        L_0x0359:
            if (r6 != 0) goto L_0x035f
            if (r17 != 0) goto L_0x035f
            if (r0 == 0) goto L_0x03e2
        L_0x035f:
            r1 = r26
            java.util.ArrayList r19 = m10098(r5, r0, r4, r1, r7)
            if (r19 == 0) goto L_0x036d
            boolean r8 = r19.isEmpty()
            if (r8 == 0) goto L_0x036f
        L_0x036d:
            r0 = r21
        L_0x036f:
            r5.m10356((java.lang.Object) r6, (android.view.View) r7)
            r9 = r22
            boolean r8 = r9.f9366
            r11 = r5
            r12 = r6
            r13 = r0
            r14 = r17
            r15 = r3
            r16 = r8
            java.lang.Object r10 = m10094(r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x03a5
            if (r19 == 0) goto L_0x03a5
            int r8 = r19.size()
            if (r8 > 0) goto L_0x0392
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03a5
        L_0x0392:
            o.ɿǃ r1 = new o.ɿǃ
            r1.<init>()
            r9 = r48
            r9.m10112(r4, r1)
            o.Ιɹ$2 r8 = new o.Ιɹ$2
            r8.<init>(r9, r4, r1)
            r5.m10353(r4, r10, r1, r8)
            goto L_0x03a7
        L_0x03a5:
            r9 = r48
        L_0x03a7:
            if (r10 == 0) goto L_0x03e2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11 = r5
            r12 = r10
            r13 = r6
            r14 = r1
            r15 = r0
            r16 = r19
            r18 = r23
            r11.m10357(r12, r13, r14, r15, r16, r17, r18)
            o.Ιɹ$4 r4 = new o.Ιɹ$4
            r8 = r4
            r9 = r6
            r6 = r10
            r10 = r5
            r11 = r7
            r12 = r3
            r13 = r23
            r15 = r19
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            o.C2966.m15241(r2, r4)
            r1 = r23
            r0 = r40
            r5.m10350((android.view.View) r2, (java.util.ArrayList<android.view.View>) r1, (java.util.Map<java.lang.String, java.lang.String>) r0)
            r5.m10368((android.view.ViewGroup) r2, (java.lang.Object) r6)
            r5.m10359(r2, r1, r0)
            goto L_0x03e2
        L_0x03dc:
            r25 = r38
            r28 = r39
            r27 = 0
        L_0x03e2:
            int r13 = r25 + 1
            r0 = r42
            r1 = r43
            r2 = r44
            r3 = r46
            r4 = r47
            r5 = r48
            r15 = r28
            r6 = r37
            goto L_0x004a
        L_0x03f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1827.m10101(o.ɾι, java.util.ArrayList, java.util.ArrayList, int, int, boolean, o.Ιɹ$ǃ):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C0299<String, String> m10092(int i, ArrayList<C1265> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0299<String, String> r0 = new C0299<>();
        while (true) {
            i3--;
            if (i3 < i2) {
                return r0;
            }
            C1265 r1 = arrayList.get(i3);
            if (r1.m8123(i)) {
                boolean booleanValue = arrayList2.get(i3).booleanValue();
                if (r1.f9213 != null) {
                    int size = r1.f9213.size();
                    if (booleanValue) {
                        arrayList3 = r1.f9213;
                        arrayList4 = r1.f9204;
                    } else {
                        ArrayList<String> arrayList5 = r1.f9213;
                        arrayList3 = r1.f9204;
                        arrayList4 = arrayList5;
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = arrayList4.get(i4);
                        String str2 = arrayList3.get(i4);
                        String remove = r0.remove(str2);
                        if (remove != null) {
                            r0.put(str, remove);
                        } else {
                            r0.put(str, str2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C1902 m10100(C1277 r2, C1277 r3) {
        ArrayList arrayList = new ArrayList();
        if (r2 != null) {
            Object exitTransition = r2.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = r2.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = r2.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (r3 != null) {
            Object enterTransition = r3.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = r3.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = r3.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1902 r22 = f9327;
        if (r22 != null && m10110(r22, arrayList)) {
            return f9327;
        }
        C1902 r23 = f9326;
        if (r23 != null && m10110(r23, arrayList)) {
            return f9326;
        }
        if (f9327 == null && f9326 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m10110(C1902 r4, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!r4.m10365(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Object m10107(C1902 r0, C1277 r1, C1277 r2, boolean z) {
        Object obj;
        if (r1 == null || r2 == null) {
            return null;
        }
        if (z) {
            obj = r2.getSharedElementReturnTransition();
        } else {
            obj = r1.getSharedElementEnterTransition();
        }
        return r0.m10366(r0.m10348(obj));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m10104(ArrayList<View> arrayList, C0299<String, View> r4, Collection<String> collection) {
        for (int size = r4.size() - 1; size >= 0; size--) {
            View view = (View) r4.f5784[(size << 1) + 1];
            if (collection.contains(C0293.m4215(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C0299<String, View> m10093(C1902 r3, C0299<String, String> r4, Object obj, Cif ifVar) {
        C0409 r5;
        ArrayList<String> arrayList;
        if (r4.isEmpty() || obj == null) {
            r4.clear();
            return null;
        }
        C1277 r52 = ifVar.f9365;
        C0299<String, View> r0 = new C0299<>();
        r3.m10371((Map<String, View>) r0, r52.requireView());
        C1265 r32 = ifVar.f9367;
        if (ifVar.f9363) {
            r5 = r52.getEnterTransitionCallback();
            arrayList = r32.f9204;
        } else {
            r5 = r52.getExitTransitionCallback();
            arrayList = r32.f9213;
        }
        if (arrayList != null) {
            C0888.m6602(r0, arrayList);
        }
        if (r5 != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = r0.get(str);
                if (view == null) {
                    r4.remove(str);
                } else if (!str.equals(C0293.m4215(view))) {
                    r4.put(C0293.m4215(view), r4.remove(str));
                }
            }
        } else {
            C0888.m6602(r4, r0.keySet());
        }
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C0299<String, View> m10099(C1902 r3, C0299<String, String> r4, Object obj, Cif ifVar) {
        C0409 r6;
        ArrayList<String> arrayList;
        String r0;
        C1277 r02 = ifVar.f9362;
        View view = r02.getView();
        if (r4.isEmpty() || obj == null || view == null) {
            r4.clear();
            return null;
        }
        C0299<String, View> r5 = new C0299<>();
        r3.m10371((Map<String, View>) r5, view);
        C1265 r32 = ifVar.f9364;
        if (ifVar.f9366) {
            r6 = r02.getExitTransitionCallback();
            arrayList = r32.f9213;
        } else {
            r6 = r02.getEnterTransitionCallback();
            arrayList = r32.f9204;
        }
        if (arrayList != null) {
            C0888.m6602(r5, arrayList);
            C0888.m6602(r5, r4.values());
        }
        if (r6 != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = r5.get(str);
                if (view2 == null) {
                    String r03 = m10095(r4, str);
                    if (r03 != null) {
                        r4.remove(r03);
                    }
                } else if (!str.equals(C0293.m4215(view2)) && (r0 = m10095(r4, str)) != null) {
                    r4.put(r0, C0293.m4215(view2));
                }
            }
        } else {
            for (int size2 = r4.size() - 1; size2 >= 0; size2--) {
                if (!r5.containsKey((String) r4.f5784[(size2 << 1) + 1])) {
                    r4.m6721(size2);
                }
            }
        }
        return r5;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m10095(C0299<String, String> r5, String str) {
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            if (str.equals(r5.f5784[i2 + 1])) {
                return (String) r5.f5784[i2];
            }
        }
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static View m10091(C0299<String, View> r0, Cif ifVar, Object obj, boolean z) {
        String str;
        C1265 r1 = ifVar.f9364;
        if (obj == null || r0 == null || r1.f9213 == null || r1.f9213.isEmpty()) {
            return null;
        }
        if (z) {
            str = r1.f9213.get(0);
        } else {
            str = r1.f9204.get(0);
        }
        return r0.get(str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m10102(C1902 r1, Object obj, Object obj2, C0299<String, View> r4, boolean z, C1265 r6) {
        String str;
        if (r6.f9213 != null && !r6.f9213.isEmpty()) {
            if (z) {
                str = r6.f9204.get(0);
            } else {
                str = r6.f9213.get(0);
            }
            View view = r4.get(str);
            r1.m10351(obj, view);
            if (obj2 != null) {
                r1.m10351(obj2, view);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m10106(C1277 r3, C1277 r4, boolean z, C0299<String, View> r6) {
        C0409 r32;
        int i;
        if (z) {
            r32 = r4.getEnterTransitionCallback();
        } else {
            r32 = r3.getEnterTransitionCallback();
        }
        if (r32 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (r6 == null) {
                i = 0;
            } else {
                i = r6.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 << 1;
                arrayList2.add(r6.f5784[i3]);
                arrayList.add(r6.f5784[i3 + 1]);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static ArrayList<View> m10098(C1902 r1, Object obj, C1277 r3, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = r3.getView();
        if (view2 != null) {
            r1.m10360(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        r1.m10363(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m10096(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Object m10094(C1902 r0, Object obj, Object obj2, Object obj3, C1277 r4, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || r4 == null) {
            z2 = true;
        } else {
            z2 = z ? r4.getAllowReturnTransitionOverlap() : r4.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return r0.m10354(obj2, obj, obj3);
        }
        return r0.m10367(obj2, obj, obj3);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m10105(C1265 r4, SparseArray<Cif> sparseArray, boolean z) {
        int size = r4.f9206.size();
        for (int i = 0; i < size; i++) {
            m10097(r4, r4.f9206.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m10108(C1265 r3, SparseArray<Cif> sparseArray, boolean z) {
        if (r3.f7155.f8265.m8523()) {
            for (int size = r3.f9206.size() - 1; size >= 0; size--) {
                m10097(r3, r3.f9206.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m10109() {
        return (f9327 == null && f9326 == null) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0070, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008c, code lost:
        if (r0.mHidden == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00e9 A[ADDED_TO_REGION] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m10097(o.C1265 r8, o.C1795.If r9, android.util.SparseArray<o.C1827.Cif> r10, boolean r11, boolean r12) {
        /*
            o.ɩʟ r0 = r9.f9227
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f9325
            int r9 = r9.f9226
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f9226
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x0081
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x0081
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0094
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0090
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0090
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0090
            goto L_0x008e
        L_0x003c:
            boolean r9 = r0.mHidden
            goto L_0x0091
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0072
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0072
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0072
        L_0x004d:
            goto L_0x0070
        L_0x004e:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0072
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0072
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0074
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0072
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0072
            android.view.View r9 = r0.mView
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0072
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0072
        L_0x0070:
            r9 = 1
            goto L_0x007d
        L_0x0072:
            r9 = 0
            goto L_0x007d
        L_0x0074:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0072
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0072
            goto L_0x0070
        L_0x007d:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0094
        L_0x0081:
            if (r12 == 0) goto L_0x0086
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x0091
        L_0x0086:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0090
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0090
        L_0x008e:
            r9 = 1
            goto L_0x0091
        L_0x0090:
            r9 = 0
        L_0x0091:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0094:
            java.lang.Object r6 = r10.get(r1)
            o.Ιɹ$if r6 = (o.C1827.Cif) r6
            if (r2 == 0) goto L_0x00ad
            if (r6 != 0) goto L_0x00a7
            o.Ιɹ$if r2 = new o.Ιɹ$if
            r2.<init>()
            r10.put(r1, r2)
            r6 = r2
        L_0x00a7:
            r6.f9362 = r0
            r6.f9366 = r11
            r6.f9364 = r8
        L_0x00ad:
            r2 = 0
            if (r12 != 0) goto L_0x00ce
            if (r9 == 0) goto L_0x00ce
            if (r6 == 0) goto L_0x00ba
            o.ɩʟ r9 = r6.f9365
            if (r9 != r0) goto L_0x00ba
            r6.f9365 = r2
        L_0x00ba:
            o.ɾι r9 = r8.f7155
            int r7 = r0.mState
            if (r7 > 0) goto L_0x00ce
            int r7 = r9.f8266
            if (r7 <= 0) goto L_0x00ce
            boolean r7 = r8.f9214
            if (r7 != 0) goto L_0x00ce
            r9.m9127(r0)
            r9.m9135((o.C1277) r0, (int) r3)
        L_0x00ce:
            if (r5 == 0) goto L_0x00e7
            if (r6 == 0) goto L_0x00d6
            o.ɩʟ r9 = r6.f9365
            if (r9 != 0) goto L_0x00e7
        L_0x00d6:
            if (r6 != 0) goto L_0x00e1
            o.Ιɹ$if r9 = new o.Ιɹ$if
            r9.<init>()
            r10.put(r1, r9)
            r6 = r9
        L_0x00e1:
            r6.f9365 = r0
            r6.f9363 = r11
            r6.f9367 = r8
        L_0x00e7:
            if (r12 != 0) goto L_0x00f3
            if (r4 == 0) goto L_0x00f3
            if (r6 == 0) goto L_0x00f3
            o.ɩʟ r8 = r6.f9362
            if (r8 != r0) goto L_0x00f3
            r6.f9362 = r2
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1827.m10097(o.ɩɪ, o.ΙƖ$If, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: o.Ιɹ$if  reason: invalid class name */
    static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public C1277 f9362;

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean f9363;

        /* renamed from: ɩ  reason: contains not printable characters */
        public C1265 f9364;

        /* renamed from: Ι  reason: contains not printable characters */
        public C1277 f9365;

        /* renamed from: ι  reason: contains not printable characters */
        public boolean f9366;

        /* renamed from: І  reason: contains not printable characters */
        public C1265 f9367;

        Cif() {
        }
    }
}
