package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.ʡ  reason: contains not printable characters */
public final class C1695 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<String> f8806;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C1214 f8807;

    C1695() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:205:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0487  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m9614(o.C1821 r38, o.C1461 r39, int r40) {
        /*
            r0 = r38
            r10 = r39
            r11 = r40
            if (r11 != 0) goto L_0x0010
            int r1 = r0.f9288
            o.ʄ[] r2 = r0.f9298
            r9 = r1
            r14 = r2
            r15 = 0
            goto L_0x0017
        L_0x0010:
            int r1 = r0.f9294
            o.ʄ[] r2 = r0.f9295
            r9 = r1
            r14 = r2
            r15 = 2
        L_0x0017:
            r8 = 0
        L_0x0018:
            if (r8 >= r9) goto L_0x062f
            r1 = r14[r8]
            boolean r2 = r1.f8503
            if (r2 != 0) goto L_0x0023
            r1.m9330()
        L_0x0023:
            r2 = 1
            r1.f8503 = r2
            int r3 = r0.f9286
            r7 = 4
            r3 = r3 & r7
            if (r3 != r7) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0041
            boolean r3 = o.C1854.m10217(r10, r11, r15, r1)
            if (r3 != 0) goto L_0x0038
            goto L_0x0041
        L_0x0038:
            r12 = r8
            r16 = r9
            r26 = r14
            r25 = 0
            goto L_0x0623
        L_0x0041:
            o.ʢ r6 = r1.f8497
            o.ʢ r5 = r1.f8489
            o.ʢ r4 = r1.f8492
            o.ʢ r3 = r1.f8487
            o.ʢ r7 = r1.f8498
            float r13 = r1.f8499
            o.ʢ$ɩ[] r12 = r0.f8818
            r12 = r12[r11]
            o.ʢ$ɩ r2 = o.C1696.C1697.WRAP_CONTENT
            if (r12 != r2) goto L_0x0057
            r2 = 1
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            if (r11 != 0) goto L_0x0080
            int r12 = r7.f8821
            r20 = r8
            if (r12 != 0) goto L_0x0062
            r12 = 1
            goto L_0x0063
        L_0x0062:
            r12 = 0
        L_0x0063:
            int r8 = r7.f8821
            r21 = r9
            r9 = 1
            if (r8 != r9) goto L_0x006c
            r8 = 1
            goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            int r9 = r7.f8821
            r22 = r8
            r8 = 2
            if (r9 != r8) goto L_0x0076
            r8 = 1
            goto L_0x0077
        L_0x0076:
            r8 = 0
        L_0x0077:
            r9 = r6
            r18 = r8
            r23 = r22
            r8 = 0
            r22 = r12
            goto L_0x00a3
        L_0x0080:
            r20 = r8
            r21 = r9
            int r8 = r7.f8823
            if (r8 != 0) goto L_0x008a
            r12 = 1
            goto L_0x008b
        L_0x008a:
            r12 = 0
        L_0x008b:
            int r8 = r7.f8823
            r9 = 1
            if (r8 != r9) goto L_0x0092
            r8 = 1
            goto L_0x0093
        L_0x0092:
            r8 = 0
        L_0x0093:
            int r9 = r7.f8823
            r22 = r12
            r12 = 2
            if (r9 != r12) goto L_0x009c
            r9 = 1
            goto L_0x009d
        L_0x009c:
            r9 = 0
        L_0x009d:
            r23 = r8
            r18 = r9
            r8 = 0
            r9 = r6
        L_0x00a3:
            r24 = 0
            if (r8 != 0) goto L_0x0189
            o.ʈ[] r12 = r9.f8826
            r12 = r12[r15]
            if (r2 != 0) goto L_0x00b3
            if (r18 == 0) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            r26 = 4
            goto L_0x00b5
        L_0x00b3:
            r26 = 1
        L_0x00b5:
            int r27 = r12.m9386()
            r28 = r8
            o.ʈ r8 = r12.f8549
            if (r8 == 0) goto L_0x00c9
            if (r9 == r6) goto L_0x00c9
            o.ʈ r8 = r12.f8549
            int r8 = r8.m9386()
            int r27 = r27 + r8
        L_0x00c9:
            r8 = r27
            if (r18 == 0) goto L_0x00d7
            if (r9 == r6) goto L_0x00d7
            if (r9 == r4) goto L_0x00d7
            r27 = r13
            r26 = r14
            r13 = 6
            goto L_0x00e7
        L_0x00d7:
            if (r22 == 0) goto L_0x00e1
            if (r2 == 0) goto L_0x00e1
            r27 = r13
            r26 = r14
            r13 = 4
            goto L_0x00e7
        L_0x00e1:
            r27 = r13
            r13 = r26
            r26 = r14
        L_0x00e7:
            o.ʈ r14 = r12.f8549
            if (r14 == 0) goto L_0x0114
            if (r9 != r4) goto L_0x00fc
            o.ɩІ r14 = r12.f8550
            r29 = r7
            o.ʈ r7 = r12.f8549
            o.ɩІ r7 = r7.f8550
            r30 = r6
            r6 = 5
            r10.m8754(r14, r7, r8, r6)
            goto L_0x010a
        L_0x00fc:
            r30 = r6
            r29 = r7
            o.ɩІ r6 = r12.f8550
            o.ʈ r7 = r12.f8549
            o.ɩІ r7 = r7.f8550
            r14 = 6
            r10.m8754(r6, r7, r8, r14)
        L_0x010a:
            o.ɩІ r6 = r12.f8550
            o.ʈ r7 = r12.f8549
            o.ɩІ r7 = r7.f8550
            r10.m8746(r6, r7, r8, r13)
            goto L_0x0118
        L_0x0114:
            r30 = r6
            r29 = r7
        L_0x0118:
            if (r2 == 0) goto L_0x014d
            int r6 = r9.f8850
            r7 = 8
            if (r6 == r7) goto L_0x013c
            o.ʢ$ɩ[] r6 = r9.f8818
            r6 = r6[r11]
            o.ʢ$ɩ r7 = o.C1696.C1697.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x013c
            o.ʈ[] r6 = r9.f8826
            int r7 = r15 + 1
            r6 = r6[r7]
            o.ɩІ r6 = r6.f8550
            o.ʈ[] r7 = r9.f8826
            r7 = r7[r15]
            o.ɩІ r7 = r7.f8550
            r8 = 5
            r12 = 0
            r10.m8754(r6, r7, r12, r8)
            goto L_0x013d
        L_0x013c:
            r12 = 0
        L_0x013d:
            o.ʈ[] r6 = r9.f8826
            r6 = r6[r15]
            o.ɩІ r6 = r6.f8550
            o.ʈ[] r7 = r0.f8826
            r7 = r7[r15]
            o.ɩІ r7 = r7.f8550
            r8 = 6
            r10.m8754(r6, r7, r12, r8)
        L_0x014d:
            o.ʈ[] r6 = r9.f8826
            int r7 = r15 + 1
            r6 = r6[r7]
            o.ʈ r6 = r6.f8549
            if (r6 == 0) goto L_0x016e
            o.ʢ r6 = r6.f8546
            o.ʈ[] r7 = r6.f8826
            r7 = r7[r15]
            o.ʈ r7 = r7.f8549
            if (r7 == 0) goto L_0x016e
            o.ʈ[] r7 = r6.f8826
            r7 = r7[r15]
            o.ʈ r7 = r7.f8549
            o.ʢ r7 = r7.f8546
            if (r7 == r9) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            r24 = r6
        L_0x016e:
            if (r24 == 0) goto L_0x017e
            r9 = r24
            r14 = r26
            r13 = r27
            r8 = r28
            r7 = r29
            r6 = r30
            goto L_0x00a3
        L_0x017e:
            r14 = r26
            r13 = r27
            r7 = r29
            r6 = r30
            r8 = 1
            goto L_0x00a3
        L_0x0189:
            r30 = r6
            r29 = r7
            r27 = r13
            r26 = r14
            if (r3 == 0) goto L_0x01b4
            o.ʈ[] r6 = r5.f8826
            int r7 = r15 + 1
            r6 = r6[r7]
            o.ʈ r6 = r6.f8549
            if (r6 == 0) goto L_0x01b4
            o.ʈ[] r6 = r3.f8826
            r6 = r6[r7]
            o.ɩІ r8 = r6.f8550
            o.ʈ[] r9 = r5.f8826
            r7 = r9[r7]
            o.ʈ r7 = r7.f8549
            o.ɩІ r7 = r7.f8550
            int r6 = r6.m9386()
            int r6 = -r6
            r9 = 5
            r10.m8745(r8, r7, r6, r9)
        L_0x01b4:
            if (r2 == 0) goto L_0x01d0
            o.ʈ[] r2 = r0.f8826
            int r6 = r15 + 1
            r2 = r2[r6]
            o.ɩІ r2 = r2.f8550
            o.ʈ[] r7 = r5.f8826
            r7 = r7[r6]
            o.ɩІ r7 = r7.f8550
            o.ʈ[] r8 = r5.f8826
            r6 = r8[r6]
            int r6 = r6.m9386()
            r8 = 6
            r10.m8754(r2, r7, r6, r8)
        L_0x01d0:
            java.util.ArrayList<o.ʢ> r2 = r1.f8501
            if (r2 == 0) goto L_0x02f4
            int r6 = r2.size()
            r9 = 1
            if (r6 <= r9) goto L_0x02f4
            boolean r7 = r1.f8502
            if (r7 == 0) goto L_0x01e7
            boolean r7 = r1.f8493
            if (r7 != 0) goto L_0x01e7
            int r7 = r1.f8488
            float r13 = (float) r7
            goto L_0x01e9
        L_0x01e7:
            r13 = r27
        L_0x01e9:
            r12 = r24
            r8 = 0
            r14 = 0
        L_0x01ed:
            if (r8 >= r6) goto L_0x02f4
            java.lang.Object r19 = r2.get(r8)
            r9 = r19
            o.ʢ r9 = (o.C1696) r9
            float[] r7 = r9.f8825
            r7 = r7[r11]
            r19 = 0
            int r28 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r28 >= 0) goto L_0x0227
            boolean r7 = r1.f8493
            if (r7 == 0) goto L_0x021f
            o.ʈ[] r0 = r9.f8826
            int r7 = r15 + 1
            r0 = r0[r7]
            o.ɩІ r0 = r0.f8550
            o.ʈ[] r7 = r9.f8826
            r7 = r7[r15]
            o.ɩІ r7 = r7.f8550
            r16 = r2
            r2 = 0
            r9 = 4
            r10.m8746(r0, r7, r2, r9)
            r7 = 6
            r9 = 0
            r28 = 4
            goto L_0x0243
        L_0x021f:
            r16 = r2
            r28 = 4
            r2 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x022c
        L_0x0227:
            r16 = r2
            r28 = 4
            r2 = 0
        L_0x022c:
            int r31 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r31 != 0) goto L_0x024d
            o.ʈ[] r0 = r9.f8826
            int r2 = r15 + 1
            r0 = r0[r2]
            o.ɩІ r0 = r0.f8550
            o.ʈ[] r2 = r9.f8826
            r2 = r2[r15]
            o.ɩІ r2 = r2.f8550
            r7 = 6
            r9 = 0
            r10.m8746(r0, r2, r9, r7)
        L_0x0243:
            r34 = r1
            r33 = r6
            r17 = 6
            r25 = 0
            goto L_0x02e5
        L_0x024d:
            r17 = 6
            r25 = 0
            if (r12 == 0) goto L_0x02dc
            o.ʈ[] r2 = r12.f8826
            r2 = r2[r15]
            o.ɩІ r2 = r2.f8550
            o.ʈ[] r12 = r12.f8826
            int r32 = r15 + 1
            r12 = r12[r32]
            o.ɩІ r12 = r12.f8550
            o.ʈ[] r0 = r9.f8826
            r0 = r0[r15]
            o.ɩІ r0 = r0.f8550
            r33 = r6
            o.ʈ[] r6 = r9.f8826
            r6 = r6[r32]
            o.ɩІ r6 = r6.f8550
            r32 = r9
            o.ɛ r9 = r39.m8752()
            r34 = r1
            r1 = 0
            r9.f6637 = r1
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r19 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r19 == 0) goto L_0x02c2
            int r19 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r19 != 0) goto L_0x0285
            goto L_0x02c2
        L_0x0285:
            int r19 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r19 != 0) goto L_0x0296
            o.ǃӏ r0 = r9.f6636
            r6 = 1065353216(0x3f800000, float:1.0)
            r0.m6802((o.C1294) r2, (float) r6)
            o.ǃӏ r0 = r9.f6636
            r0.m6802((o.C1294) r12, (float) r11)
            goto L_0x02d8
        L_0x0296:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r31 != 0) goto L_0x02a5
            o.ǃӏ r2 = r9.f6636
            r2.m6802((o.C1294) r0, (float) r1)
            o.ǃӏ r0 = r9.f6636
            r0.m6802((o.C1294) r6, (float) r11)
            goto L_0x02d8
        L_0x02a5:
            float r14 = r14 / r13
            float r31 = r7 / r13
            float r14 = r14 / r31
            o.ǃӏ r11 = r9.f6636
            r11.m6802((o.C1294) r2, (float) r1)
            o.ǃӏ r1 = r9.f6636
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.m6802((o.C1294) r12, (float) r11)
            o.ǃӏ r1 = r9.f6636
            r1.m6802((o.C1294) r6, (float) r14)
            o.ǃӏ r1 = r9.f6636
            float r2 = -r14
            r1.m6802((o.C1294) r0, (float) r2)
            goto L_0x02d8
        L_0x02c2:
            r1 = 1065353216(0x3f800000, float:1.0)
            o.ǃӏ r14 = r9.f6636
            r14.m6802((o.C1294) r2, (float) r1)
            o.ǃӏ r2 = r9.f6636
            r2.m6802((o.C1294) r12, (float) r11)
            o.ǃӏ r2 = r9.f6636
            r2.m6802((o.C1294) r6, (float) r1)
            o.ǃӏ r1 = r9.f6636
            r1.m6802((o.C1294) r0, (float) r11)
        L_0x02d8:
            r10.m8751((o.C1123) r9)
            goto L_0x02e2
        L_0x02dc:
            r34 = r1
            r33 = r6
            r32 = r9
        L_0x02e2:
            r14 = r7
            r12 = r32
        L_0x02e5:
            int r8 = r8 + 1
            r0 = r38
            r11 = r40
            r2 = r16
            r6 = r33
            r1 = r34
            r9 = 1
            goto L_0x01ed
        L_0x02f4:
            r34 = r1
            r17 = 6
            r25 = 0
            r28 = 4
            if (r4 == 0) goto L_0x0379
            if (r4 == r3) goto L_0x0302
            if (r18 == 0) goto L_0x0379
        L_0x0302:
            r0 = r30
            o.ʈ[] r1 = r0.f8826
            r1 = r1[r15]
            o.ʈ[] r2 = r5.f8826
            int r6 = r15 + 1
            r2 = r2[r6]
            o.ʈ[] r7 = r0.f8826
            r7 = r7[r15]
            o.ʈ r7 = r7.f8549
            if (r7 == 0) goto L_0x031f
            o.ʈ[] r0 = r0.f8826
            r0 = r0[r15]
            o.ʈ r0 = r0.f8549
            o.ɩІ r0 = r0.f8550
            goto L_0x0321
        L_0x031f:
            r0 = r24
        L_0x0321:
            o.ʈ[] r7 = r5.f8826
            r7 = r7[r6]
            o.ʈ r7 = r7.f8549
            if (r7 == 0) goto L_0x0332
            o.ʈ[] r7 = r5.f8826
            r7 = r7[r6]
            o.ʈ r7 = r7.f8549
            o.ɩІ r7 = r7.f8550
            goto L_0x0334
        L_0x0332:
            r7 = r24
        L_0x0334:
            if (r4 != r3) goto L_0x033e
            o.ʈ[] r1 = r4.f8826
            r1 = r1[r15]
            o.ʈ[] r2 = r4.f8826
            r2 = r2[r6]
        L_0x033e:
            if (r0 == 0) goto L_0x036f
            if (r7 == 0) goto L_0x036f
            if (r40 != 0) goto L_0x0349
            r6 = r29
            float r6 = r6.f8853
            goto L_0x034d
        L_0x0349:
            r6 = r29
            float r6 = r6.f8868
        L_0x034d:
            int r8 = r1.m9386()
            int r9 = r2.m9386()
            o.ɩІ r11 = r1.f8550
            o.ɩІ r12 = r2.f8550
            r13 = 5
            r1 = r39
            r2 = r11
            r11 = r3
            r3 = r0
            r14 = r4
            r4 = r8
            r0 = r5
            r5 = r6
            r6 = r7
            r7 = r12
            r12 = r20
            r8 = r9
            r16 = r21
            r9 = r13
            r1.m8753(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0376
        L_0x036f:
            r11 = r3
            r14 = r4
            r0 = r5
            r12 = r20
            r16 = r21
        L_0x0376:
            r13 = r0
            goto L_0x05c5
        L_0x0379:
            r11 = r3
            r14 = r4
            r13 = r5
            r12 = r20
            r16 = r21
            r0 = r30
            if (r22 == 0) goto L_0x0491
            if (r14 == 0) goto L_0x0491
            r1 = r34
            int r2 = r1.f8488
            if (r2 <= 0) goto L_0x0395
            int r2 = r1.f8494
            int r1 = r1.f8488
            if (r2 != r1) goto L_0x0395
            r27 = 1
            goto L_0x0397
        L_0x0395:
            r27 = 0
        L_0x0397:
            r8 = r14
            r9 = r8
        L_0x0399:
            if (r9 == 0) goto L_0x05c5
            o.ʢ[] r1 = r9.f8841
            r1 = r1[r40]
            r7 = r1
        L_0x03a0:
            if (r7 == 0) goto L_0x03ad
            int r1 = r7.f8850
            r2 = 8
            if (r1 != r2) goto L_0x03ad
            o.ʢ[] r1 = r7.f8841
            r7 = r1[r40]
            goto L_0x03a0
        L_0x03ad:
            if (r7 != 0) goto L_0x03bd
            if (r9 != r11) goto L_0x03b2
            goto L_0x03bd
        L_0x03b2:
            r35 = r0
            r19 = r7
            r21 = r8
            r0 = r9
        L_0x03b9:
            r18 = 4
            goto L_0x047f
        L_0x03bd:
            o.ʈ[] r1 = r9.f8826
            r1 = r1[r15]
            o.ɩІ r2 = r1.f8550
            o.ʈ r3 = r1.f8549
            if (r3 == 0) goto L_0x03cc
            o.ʈ r3 = r1.f8549
            o.ɩІ r3 = r3.f8550
            goto L_0x03ce
        L_0x03cc:
            r3 = r24
        L_0x03ce:
            if (r8 == r9) goto L_0x03d9
            o.ʈ[] r3 = r8.f8826
            int r4 = r15 + 1
            r3 = r3[r4]
            o.ɩІ r3 = r3.f8550
            goto L_0x03f0
        L_0x03d9:
            if (r9 != r14) goto L_0x03f0
            if (r8 != r9) goto L_0x03f0
            o.ʈ[] r3 = r0.f8826
            r3 = r3[r15]
            o.ʈ r3 = r3.f8549
            if (r3 == 0) goto L_0x03ee
            o.ʈ[] r3 = r0.f8826
            r3 = r3[r15]
            o.ʈ r3 = r3.f8549
            o.ɩІ r3 = r3.f8550
            goto L_0x03f0
        L_0x03ee:
            r3 = r24
        L_0x03f0:
            int r1 = r1.m9386()
            o.ʈ[] r4 = r9.f8826
            int r5 = r15 + 1
            r4 = r4[r5]
            int r4 = r4.m9386()
            if (r7 == 0) goto L_0x040b
            o.ʈ[] r6 = r7.f8826
            r6 = r6[r15]
            r30 = r0
            o.ɩІ r0 = r6.f8550
        L_0x0408:
            r18 = r7
            goto L_0x041c
        L_0x040b:
            r30 = r0
            o.ʈ[] r0 = r13.f8826
            r0 = r0[r5]
            o.ʈ r6 = r0.f8549
            if (r6 == 0) goto L_0x0418
            o.ɩІ r0 = r6.f8550
            goto L_0x0408
        L_0x0418:
            r18 = r7
            r0 = r24
        L_0x041c:
            o.ʈ[] r7 = r9.f8826
            r7 = r7[r5]
            o.ɩІ r7 = r7.f8550
            if (r6 == 0) goto L_0x0429
            int r6 = r6.m9386()
            int r4 = r4 + r6
        L_0x0429:
            if (r8 == 0) goto L_0x0434
            o.ʈ[] r6 = r8.f8826
            r6 = r6[r5]
            int r6 = r6.m9386()
            int r1 = r1 + r6
        L_0x0434:
            if (r2 == 0) goto L_0x0476
            if (r3 == 0) goto L_0x0476
            if (r0 == 0) goto L_0x0476
            if (r7 == 0) goto L_0x0476
            if (r9 != r14) goto L_0x0446
            o.ʈ[] r1 = r14.f8826
            r1 = r1[r15]
            int r1 = r1.m9386()
        L_0x0446:
            r6 = r1
            if (r9 != r11) goto L_0x0454
            o.ʈ[] r1 = r11.f8826
            r1 = r1[r5]
            int r1 = r1.m9386()
            r19 = r1
            goto L_0x0456
        L_0x0454:
            r19 = r4
        L_0x0456:
            if (r27 == 0) goto L_0x045b
            r20 = 6
            goto L_0x045d
        L_0x045b:
            r20 = 4
        L_0x045d:
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r39
            r4 = r6
            r35 = r30
            r6 = r0
            r0 = r18
            r18 = 4
            r21 = r8
            r8 = r19
            r19 = r0
            r0 = r9
            r9 = r20
            r1.m8753(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x047f
        L_0x0476:
            r21 = r8
            r0 = r9
            r19 = r18
            r35 = r30
            goto L_0x03b9
        L_0x047f:
            int r1 = r0.f8850
            r2 = 8
            if (r1 == r2) goto L_0x0487
            r8 = r0
            goto L_0x0489
        L_0x0487:
            r8 = r21
        L_0x0489:
            r9 = r19
            r0 = r35
            r28 = 4
            goto L_0x0399
        L_0x0491:
            r35 = r0
            r1 = r34
            r18 = 4
            if (r23 == 0) goto L_0x05c5
            if (r14 == 0) goto L_0x05c5
            int r0 = r1.f8488
            if (r0 <= 0) goto L_0x04a8
            int r0 = r1.f8494
            int r1 = r1.f8488
            if (r0 != r1) goto L_0x04a8
            r27 = 1
            goto L_0x04aa
        L_0x04a8:
            r27 = 0
        L_0x04aa:
            r0 = r14
            r9 = r0
        L_0x04ac:
            if (r0 == 0) goto L_0x0563
            o.ʢ[] r1 = r0.f8841
            r1 = r1[r40]
        L_0x04b2:
            if (r1 == 0) goto L_0x04bf
            int r2 = r1.f8850
            r3 = 8
            if (r2 != r3) goto L_0x04bf
            o.ʢ[] r1 = r1.f8841
            r1 = r1[r40]
            goto L_0x04b2
        L_0x04bf:
            if (r0 == r14) goto L_0x0554
            if (r0 == r11) goto L_0x0554
            if (r1 == 0) goto L_0x0554
            if (r1 != r11) goto L_0x04ca
            r8 = r24
            goto L_0x04cb
        L_0x04ca:
            r8 = r1
        L_0x04cb:
            o.ʈ[] r1 = r0.f8826
            r1 = r1[r15]
            o.ɩІ r2 = r1.f8550
            o.ʈ[] r3 = r9.f8826
            int r4 = r15 + 1
            r3 = r3[r4]
            o.ɩІ r3 = r3.f8550
            int r1 = r1.m9386()
            o.ʈ[] r5 = r0.f8826
            r5 = r5[r4]
            int r5 = r5.m9386()
            if (r8 == 0) goto L_0x04ff
            o.ʈ[] r6 = r8.f8826
            r6 = r6[r15]
            o.ɩІ r7 = r6.f8550
            r19 = r7
            o.ʈ r7 = r6.f8549
            if (r7 == 0) goto L_0x04f8
            o.ʈ r7 = r6.f8549
            o.ɩІ r7 = r7.f8550
            goto L_0x04fa
        L_0x04f8:
            r7 = r24
        L_0x04fa:
            r37 = r19
            r19 = r6
            goto L_0x0519
        L_0x04ff:
            o.ʈ[] r6 = r0.f8826
            r6 = r6[r4]
            o.ʈ r6 = r6.f8549
            if (r6 == 0) goto L_0x050c
            o.ɩІ r7 = r6.f8550
            r19 = r6
            goto L_0x0510
        L_0x050c:
            r19 = r6
            r7 = r24
        L_0x0510:
            o.ʈ[] r6 = r0.f8826
            r6 = r6[r4]
            o.ɩІ r6 = r6.f8550
            r37 = r7
            r7 = r6
        L_0x0519:
            r6 = r37
            if (r19 == 0) goto L_0x0523
            int r19 = r19.m9386()
            int r5 = r5 + r19
        L_0x0523:
            r19 = r5
            o.ʈ[] r5 = r9.f8826
            r4 = r5[r4]
            int r4 = r4.m9386()
            int r4 = r4 + r1
            if (r27 == 0) goto L_0x0533
            r20 = 6
            goto L_0x0535
        L_0x0533:
            r20 = 4
        L_0x0535:
            if (r2 == 0) goto L_0x054d
            if (r3 == 0) goto L_0x054d
            if (r6 == 0) goto L_0x054d
            if (r7 == 0) goto L_0x054d
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r39
            r21 = r8
            r8 = r19
            r19 = r9
            r9 = r20
            r1.m8753(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0551
        L_0x054d:
            r21 = r8
            r19 = r9
        L_0x0551:
            r1 = r21
            goto L_0x0556
        L_0x0554:
            r19 = r9
        L_0x0556:
            int r2 = r0.f8850
            r3 = 8
            if (r2 == r3) goto L_0x055e
            r9 = r0
            goto L_0x0560
        L_0x055e:
            r9 = r19
        L_0x0560:
            r0 = r1
            goto L_0x04ac
        L_0x0563:
            o.ʈ[] r0 = r14.f8826
            r0 = r0[r15]
            r1 = r35
            o.ʈ[] r1 = r1.f8826
            r1 = r1[r15]
            o.ʈ r1 = r1.f8549
            o.ʈ[] r2 = r11.f8826
            int r3 = r15 + 1
            r9 = r2[r3]
            o.ʈ[] r2 = r13.f8826
            r2 = r2[r3]
            o.ʈ r8 = r2.f8549
            if (r1 == 0) goto L_0x05b2
            if (r14 == r11) goto L_0x058e
            o.ɩІ r2 = r0.f8550
            o.ɩІ r1 = r1.f8550
            int r0 = r0.m9386()
            r3 = 5
            r10.m8746(r2, r1, r0, r3)
            r1 = r8
            r0 = r9
            goto L_0x05b4
        L_0x058e:
            if (r8 == 0) goto L_0x05b2
            o.ɩІ r2 = r0.f8550
            o.ɩІ r3 = r1.f8550
            int r4 = r0.m9386()
            r5 = 1056964608(0x3f000000, float:0.5)
            o.ɩІ r6 = r9.f8550
            o.ɩІ r7 = r8.f8550
            int r0 = r9.m9386()
            r17 = 5
            r1 = r39
            r36 = r8
            r8 = r0
            r0 = r9
            r9 = r17
            r1.m8753(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r36
            goto L_0x05b4
        L_0x05b2:
            r0 = r9
            r1 = r8
        L_0x05b4:
            if (r1 == 0) goto L_0x05c5
            if (r14 == r11) goto L_0x05c5
            o.ɩІ r2 = r0.f8550
            o.ɩІ r1 = r1.f8550
            int r0 = r0.m9386()
            int r0 = -r0
            r3 = 5
            r10.m8746(r2, r1, r0, r3)
        L_0x05c5:
            if (r22 != 0) goto L_0x05c9
            if (r23 == 0) goto L_0x0623
        L_0x05c9:
            if (r14 == 0) goto L_0x0623
            o.ʈ[] r0 = r14.f8826
            r0 = r0[r15]
            o.ʈ[] r1 = r11.f8826
            int r2 = r15 + 1
            r1 = r1[r2]
            o.ʈ r3 = r0.f8549
            if (r3 == 0) goto L_0x05de
            o.ʈ r3 = r0.f8549
            o.ɩІ r3 = r3.f8550
            goto L_0x05e0
        L_0x05de:
            r3 = r24
        L_0x05e0:
            o.ʈ r4 = r1.f8549
            if (r4 == 0) goto L_0x05e9
            o.ʈ r4 = r1.f8549
            o.ɩІ r4 = r4.f8550
            goto L_0x05eb
        L_0x05e9:
            r4 = r24
        L_0x05eb:
            if (r13 == r11) goto L_0x05fc
            o.ʈ[] r4 = r13.f8826
            r4 = r4[r2]
            o.ʈ r5 = r4.f8549
            if (r5 == 0) goto L_0x05fa
            o.ʈ r4 = r4.f8549
            o.ɩІ r4 = r4.f8550
            goto L_0x05fc
        L_0x05fa:
            r4 = r24
        L_0x05fc:
            r6 = r4
            if (r14 != r11) goto L_0x0607
            o.ʈ[] r0 = r14.f8826
            r0 = r0[r15]
            o.ʈ[] r1 = r14.f8826
            r1 = r1[r2]
        L_0x0607:
            if (r3 == 0) goto L_0x0623
            if (r6 == 0) goto L_0x0623
            int r4 = r0.m9386()
            o.ʈ[] r5 = r11.f8826
            r2 = r5[r2]
            int r8 = r2.m9386()
            o.ɩІ r2 = r0.f8550
            r5 = 1056964608(0x3f000000, float:0.5)
            o.ɩІ r7 = r1.f8550
            r9 = 5
            r1 = r39
            r1.m8753(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0623:
            int r8 = r12 + 1
            r0 = r38
            r11 = r40
            r9 = r16
            r14 = r26
            goto L_0x0018
        L_0x062f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1695.m9614(o.Ιɩ, o.ɹǃ, int):void");
    }

    public C1695(String... strArr) {
        this.f8806 = Arrays.asList(strArr);
    }

    public C1695(C1695 r3) {
        this.f8806 = new ArrayList(r3.f8806);
        this.f8807 = r3.f8807;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m9617(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f8806.size()) {
            return false;
        }
        return this.f8806.get(i).equals(str) || this.f8806.get(i).equals("**") || this.f8806.get(i).equals("*");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m9616(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.f8806.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f8806.size() - 1 && this.f8806.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r8.get(r8.size() - 1).equals("**") != false) goto L_0x0058;
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m9618(java.lang.String r7, int r8) {
        /*
            r6 = this;
            java.util.List<java.lang.String> r0 = r6.f8806
            int r0 = r0.size()
            r1 = 0
            if (r8 < r0) goto L_0x000a
            return r1
        L_0x000a:
            java.util.List<java.lang.String> r0 = r6.f8806
            int r0 = r0.size()
            r2 = 1
            int r0 = r0 - r2
            if (r8 != r0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.util.List<java.lang.String> r3 = r6.f8806
            java.lang.Object r3 = r3.get(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "**"
            boolean r5 = r3.equals(r4)
            if (r5 != 0) goto L_0x005c
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "*"
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = 0
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            if (r0 != 0) goto L_0x0058
            java.util.List<java.lang.String> r0 = r6.f8806
            int r0 = r0.size()
            int r0 = r0 + -2
            if (r8 != r0) goto L_0x005b
            java.util.List<java.lang.String> r8 = r6.f8806
            int r0 = r8.size()
            int r0 = r0 - r2
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x005b
        L_0x0058:
            if (r7 == 0) goto L_0x005b
            return r2
        L_0x005b:
            return r1
        L_0x005c:
            if (r0 != 0) goto L_0x0070
            java.util.List<java.lang.String> r3 = r6.f8806
            int r5 = r8 + 1
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0070
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            if (r3 == 0) goto L_0x009d
            java.util.List<java.lang.String> r7 = r6.f8806
            int r7 = r7.size()
            int r7 = r7 + -2
            if (r8 == r7) goto L_0x009c
            java.util.List<java.lang.String> r7 = r6.f8806
            int r7 = r7.size()
            int r7 = r7 + -3
            if (r8 != r7) goto L_0x009b
            java.util.List<java.lang.String> r7 = r6.f8806
            int r8 = r7.size()
            int r8 = r8 - r2
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            return r1
        L_0x009c:
            return r2
        L_0x009d:
            if (r0 == 0) goto L_0x00a0
            return r2
        L_0x00a0:
            int r8 = r8 + r2
            java.util.List<java.lang.String> r0 = r6.f8806
            int r0 = r0.size()
            int r0 = r0 - r2
            if (r8 >= r0) goto L_0x00ab
            return r1
        L_0x00ab:
            java.util.List<java.lang.String> r0 = r6.f8806
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r7 = r8.equals(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1695.m9618(java.lang.String, int):boolean");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m9615(String str, int i) {
        if (!"__container".equals(str) && i >= this.f8806.size() - 1 && !this.f8806.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f8806);
        sb.append(",resolved=");
        sb.append(this.f8807 != null);
        sb.append('}');
        return sb.toString();
    }
}
