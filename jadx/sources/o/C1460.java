package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.C1625;
import o.C1696;
import o.C2864;

/* renamed from: o.ɹı  reason: contains not printable characters */
public final class C1460 {

    /* renamed from: ı  reason: contains not printable characters */
    public final List<C2864.If> f7859;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f7860;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final char f7861;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f7862;

    /* renamed from: ι  reason: contains not printable characters */
    public final double f7863;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static boolean m8729(C1696 r8, C2043 r9, List<C2043> list, boolean z) {
        if (r8 == null) {
            return true;
        }
        r8.f8824 = false;
        C1821 r2 = (C1821) r8.f8828;
        if (r8.f8859 == null) {
            r8.f8811 = true;
            r9.f10093.add(r8);
            r8.f8859 = r9;
            if (r8.f8813.f8549 == null && r8.f8816.f8549 == null && r8.f8812.f8549 == null && r8.f8840.f8549 == null && r8.f8814.f8549 == null && r8.f8817.f8549 == null) {
                r9.f10090 = false;
                r2.f9290 = false;
                r8.f8811 = false;
                if (z) {
                    return false;
                }
            }
            if (!(r8.f8812.f8549 == null || r8.f8840.f8549 == null)) {
                r2.m9643();
                C1696.C1697 r3 = C1696.C1697.WRAP_CONTENT;
                if (z) {
                    r9.f10090 = false;
                    r2.f9290 = false;
                    r8.f8811 = false;
                    return false;
                } else if (!(r8.f8812.f8549.f8546 == r8.f8828 && r8.f8840.f8549.f8546 == r8.f8828)) {
                    r9.f10090 = false;
                    r2.f9290 = false;
                    r8.f8811 = false;
                }
            }
            if (!(r8.f8813.f8549 == null || r8.f8816.f8549 == null)) {
                r2.m9625();
                C1696.C1697 r32 = C1696.C1697.WRAP_CONTENT;
                if (z) {
                    r9.f10090 = false;
                    r2.f9290 = false;
                    r8.f8811 = false;
                    return false;
                } else if (!(r8.f8813.f8549.f8546 == r8.f8828 && r8.f8816.f8549.f8546 == r8.f8828)) {
                    r9.f10090 = false;
                    r2.f9290 = false;
                    r8.f8811 = false;
                }
            }
            if (((r8.m9625() == C1696.C1697.MATCH_CONSTRAINT) ^ (r8.m9643() == C1696.C1697.MATCH_CONSTRAINT)) && r8.f8854 != 0.0f) {
                m8730(r8);
            } else if (r8.m9625() == C1696.C1697.MATCH_CONSTRAINT || r8.m9643() == C1696.C1697.MATCH_CONSTRAINT) {
                r9.f10090 = false;
                r2.f9290 = false;
                r8.f8811 = false;
                if (z) {
                    return false;
                }
            }
            if (((r8.f8813.f8549 == null && r8.f8816.f8549 == null) || ((r8.f8813.f8549 != null && r8.f8813.f8549.f8546 == r8.f8828 && r8.f8816.f8549 == null) || ((r8.f8816.f8549 != null && r8.f8816.f8549.f8546 == r8.f8828 && r8.f8813.f8549 == null) || (r8.f8813.f8549 != null && r8.f8813.f8549.f8546 == r8.f8828 && r8.f8816.f8549 != null && r8.f8816.f8549.f8546 == r8.f8828)))) && r8.f8817.f8549 == null && !(r8 instanceof C2065) && !(r8 instanceof C1932)) {
                r9.f10092.add(r8);
            }
            if (((r8.f8812.f8549 == null && r8.f8840.f8549 == null) || ((r8.f8812.f8549 != null && r8.f8812.f8549.f8546 == r8.f8828 && r8.f8840.f8549 == null) || ((r8.f8840.f8549 != null && r8.f8840.f8549.f8546 == r8.f8828 && r8.f8812.f8549 == null) || (r8.f8812.f8549 != null && r8.f8812.f8549.f8546 == r8.f8828 && r8.f8840.f8549 != null && r8.f8840.f8549.f8546 == r8.f8828)))) && r8.f8817.f8549 == null && r8.f8814.f8549 == null && !(r8 instanceof C2065) && !(r8 instanceof C1932)) {
                r9.f10089.add(r8);
            }
            if (r8 instanceof C1932) {
                r9.f10090 = false;
                r2.f9290 = false;
                r8.f8811 = false;
                if (z) {
                    return false;
                }
                C1932 r33 = (C1932) r8;
                for (int i = 0; i < r33.f9761; i++) {
                    if (!m8729(r33.f9760[i], r9, list, z)) {
                        return false;
                    }
                }
            }
            for (C1625 r5 : r8.f8826) {
                if (!(r5.f8549 == null || r5.f8549.f8546 == r8.f8828)) {
                    if (r5.f8548 == C1625.C1626.CENTER) {
                        r9.f10090 = false;
                        r2.f9290 = false;
                        r8.f8811 = false;
                        if (z) {
                            return false;
                        }
                    } else {
                        C2024 r6 = r5.f8547;
                        if (!(r5.f8549 == null || r5.f8549.f8549 == r5)) {
                            r5.f8549.f8547.f13031.add(r6);
                        }
                    }
                    if (!m8729(r5.f8549.f8546, r9, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (r8.f8859 != r9) {
            r9.f10093.addAll(r8.f8859.f10093);
            r9.f10092.addAll(r8.f8859.f10092);
            r9.f10089.addAll(r8.f8859.f10089);
            if (!r8.f8859.f10090) {
                r9.f10090 = false;
            }
            list.remove(r8.f8859);
            for (C1696 r10 : r8.f8859.f10093) {
                r10.f8859 = r9;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[LOOP:0: B:39:0x008d->B:41:0x0093, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be A[LOOP:1: B:43:0x00b8->B:45:0x00be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01b9  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m8732(o.C1696 r20, int r21, boolean r22, int r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r0.f8811
            r4 = 0
            if (r3 != 0) goto L_0x000c
            return r4
        L_0x000c:
            o.ʈ r3 = r0.f8814
            o.ʈ r3 = r3.f8549
            r5 = 1
            if (r3 == 0) goto L_0x0017
            if (r1 != r5) goto L_0x0017
            r3 = 1
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            r6 = 8
            if (r2 == 0) goto L_0x002e
            int r7 = r0.f8835
            int r8 = r0.f8850
            if (r8 != r6) goto L_0x0024
            r8 = 0
            goto L_0x0026
        L_0x0024:
            int r8 = r0.f8836
        L_0x0026:
            int r9 = r0.f8835
            int r8 = r8 - r9
            int r9 = r1 << 1
            int r10 = r9 + 1
            goto L_0x003f
        L_0x002e:
            int r7 = r0.f8850
            if (r7 != r6) goto L_0x0034
            r7 = 0
            goto L_0x0036
        L_0x0034:
            int r7 = r0.f8836
        L_0x0036:
            int r8 = r0.f8835
            int r7 = r7 - r8
            int r8 = r0.f8835
            int r10 = r1 << 1
            int r9 = r10 + 1
        L_0x003f:
            o.ʈ[] r11 = r0.f8826
            r11 = r11[r10]
            o.ʈ r11 = r11.f8549
            if (r11 == 0) goto L_0x0053
            o.ʈ[] r11 = r0.f8826
            r11 = r11[r9]
            o.ʈ r11 = r11.f8549
            if (r11 != 0) goto L_0x0053
            r11 = r9
            r9 = r10
            r10 = -1
            goto L_0x0055
        L_0x0053:
            r11 = r10
            r10 = 1
        L_0x0055:
            if (r3 == 0) goto L_0x005a
            int r13 = r23 - r7
            goto L_0x005c
        L_0x005a:
            r13 = r23
        L_0x005c:
            o.ʈ[] r14 = r0.f8826
            r14 = r14[r9]
            int r14 = r14.m9386()
            int r14 = r14 * r10
            int r15 = m8725((o.C1696) r20, (int) r21)
            int r14 = r14 + r15
            int r13 = r13 + r14
            if (r1 != 0) goto L_0x0076
            int r15 = r0.f8850
            if (r15 != r6) goto L_0x0073
            goto L_0x007a
        L_0x0073:
            int r15 = r0.f8827
            goto L_0x007e
        L_0x0076:
            int r15 = r0.f8850
            if (r15 != r6) goto L_0x007c
        L_0x007a:
            r15 = 0
            goto L_0x007e
        L_0x007c:
            int r15 = r0.f8836
        L_0x007e:
            int r15 = r15 * r10
            o.ʈ[] r4 = r0.f8826
            r4 = r4[r9]
            o.ιΙ r4 = r4.f8547
            java.util.HashSet<o.Ӏ$if> r4 = r4.f13031
            java.util.Iterator r4 = r4.iterator()
            r12 = 0
        L_0x008d:
            boolean r17 = r4.hasNext()
            if (r17 == 0) goto L_0x00ab
            java.lang.Object r17 = r4.next()
            o.Ӏ$if r17 = (o.C2745.Cif) r17
            r5 = r17
            o.ιΙ r5 = (o.C2024) r5
            o.ʈ r5 = r5.f9993
            o.ʢ r5 = r5.f8546
            int r5 = m8732(r5, r1, r2, r13)
            int r12 = java.lang.Math.max(r12, r5)
            r5 = 1
            goto L_0x008d
        L_0x00ab:
            o.ʈ[] r4 = r0.f8826
            r4 = r4[r11]
            o.ιΙ r4 = r4.f8547
            java.util.HashSet<o.Ӏ$if> r4 = r4.f13031
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x00b8:
            boolean r17 = r4.hasNext()
            if (r17 == 0) goto L_0x00dd
            java.lang.Object r17 = r4.next()
            o.Ӏ$if r17 = (o.C2745.Cif) r17
            r6 = r17
            o.ιΙ r6 = (o.C2024) r6
            o.ʈ r6 = r6.f9993
            o.ʢ r6 = r6.f8546
            r23 = r4
            int r4 = r15 + r13
            int r4 = m8732(r6, r1, r2, r4)
            int r5 = java.lang.Math.max(r5, r4)
            r4 = r23
            r6 = 8
            goto L_0x00b8
        L_0x00dd:
            if (r3 == 0) goto L_0x00e3
            int r12 = r12 - r7
            int r5 = r5 + r8
        L_0x00e1:
            r4 = 1
            goto L_0x00fd
        L_0x00e3:
            if (r1 != 0) goto L_0x00ef
            int r4 = r0.f8850
            r6 = 8
            if (r4 != r6) goto L_0x00ec
            goto L_0x00f5
        L_0x00ec:
            int r4 = r0.f8827
            goto L_0x00f9
        L_0x00ef:
            r6 = 8
            int r4 = r0.f8850
            if (r4 != r6) goto L_0x00f7
        L_0x00f5:
            r4 = 0
            goto L_0x00f9
        L_0x00f7:
            int r4 = r0.f8836
        L_0x00f9:
            int r4 = r4 * r10
            int r5 = r5 + r4
            goto L_0x00e1
        L_0x00fd:
            if (r1 != r4) goto L_0x0165
            o.ʈ r6 = r0.f8814
            o.ιΙ r6 = r6.f8547
            java.util.HashSet<o.Ӏ$if> r6 = r6.f13031
            java.util.Iterator r6 = r6.iterator()
            r18 = 0
        L_0x010b:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x014c
            java.lang.Object r16 = r6.next()
            o.Ӏ$if r16 = (o.C2745.Cif) r16
            r23 = r6
            r6 = r16
            o.ιΙ r6 = (o.C2024) r6
            if (r10 != r4) goto L_0x0132
            o.ʈ r4 = r6.f9993
            o.ʢ r4 = r4.f8546
            int r6 = r7 + r13
            int r4 = m8732(r4, r1, r2, r6)
            r6 = r18
            int r18 = java.lang.Math.max(r6, r4)
            r6 = r23
            goto L_0x014a
        L_0x0132:
            r4 = r18
            o.ʈ r6 = r6.f9993
            o.ʢ r6 = r6.f8546
            int r16 = r8 * r10
            r17 = r11
            int r11 = r16 + r13
            int r6 = m8732(r6, r1, r2, r11)
            int r18 = java.lang.Math.max(r4, r6)
            r6 = r23
            r11 = r17
        L_0x014a:
            r4 = 1
            goto L_0x010b
        L_0x014c:
            r17 = r11
            r4 = r18
            o.ʈ r6 = r0.f8814
            o.ιΙ r6 = r6.f8547
            java.util.HashSet<o.Ӏ$if> r6 = r6.f13031
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0168
            if (r3 != 0) goto L_0x0168
            r3 = 1
            if (r10 != r3) goto L_0x0163
            int r4 = r4 + r7
            goto L_0x0168
        L_0x0163:
            int r4 = r4 - r8
            goto L_0x0168
        L_0x0165:
            r17 = r11
            r4 = 0
        L_0x0168:
            int r3 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r12, r3)
            int r14 = r14 + r3
            int r3 = r13 + r15
            r4 = -1
            if (r10 != r4) goto L_0x017b
            r19 = r13
            r13 = r3
            r3 = r19
        L_0x017b:
            if (r2 == 0) goto L_0x0184
            o.C1854.m10215(r0, r1, r13)
            r0.m9646(r13, r3, r1)
            goto L_0x01a0
        L_0x0184:
            o.ιІ r2 = r0.f8859
            if (r1 != 0) goto L_0x018f
            java.util.HashSet<o.ʢ> r2 = r2.f10091
            r2.add(r0)
            r3 = 1
            goto L_0x0197
        L_0x018f:
            r3 = 1
            if (r1 != r3) goto L_0x0197
            java.util.HashSet<o.ʢ> r2 = r2.f10095
            r2.add(r0)
        L_0x0197:
            if (r1 != 0) goto L_0x019c
            r0.f8847 = r13
            goto L_0x01a0
        L_0x019c:
            if (r1 != r3) goto L_0x01a0
            r0.f8865 = r13
        L_0x01a0:
            o.ʢ$ɩ r2 = r20.m9628(r21)
            o.ʢ$ɩ r3 = o.C1696.C1697.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x01c1
            float r2 = r0.f8854
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x01c1
            o.ιІ r2 = r0.f8859
            if (r1 != 0) goto L_0x01b9
            java.util.HashSet<o.ʢ> r2 = r2.f10091
            r2.add(r0)
            goto L_0x01c1
        L_0x01b9:
            r3 = 1
            if (r1 != r3) goto L_0x01c1
            java.util.HashSet<o.ʢ> r2 = r2.f10095
            r2.add(r0)
        L_0x01c1:
            o.ʈ[] r2 = r0.f8826
            r2 = r2[r9]
            o.ʈ r2 = r2.f8549
            if (r2 == 0) goto L_0x01f9
            o.ʈ[] r2 = r0.f8826
            r2 = r2[r17]
            o.ʈ r2 = r2.f8549
            if (r2 == 0) goto L_0x01f9
            o.ʢ r2 = r0.f8828
            o.ʈ[] r3 = r0.f8826
            r3 = r3[r9]
            o.ʈ r3 = r3.f8549
            o.ʢ r3 = r3.f8546
            if (r3 != r2) goto L_0x01f9
            o.ʈ[] r3 = r0.f8826
            r3 = r3[r17]
            o.ʈ r3 = r3.f8549
            o.ʢ r3 = r3.f8546
            if (r3 != r2) goto L_0x01f9
            o.ιІ r2 = r0.f8859
            if (r1 != 0) goto L_0x01f1
            java.util.HashSet<o.ʢ> r1 = r2.f10091
            r1.add(r0)
            goto L_0x01f9
        L_0x01f1:
            r3 = 1
            if (r1 != r3) goto L_0x01f9
            java.util.HashSet<o.ʢ> r1 = r2.f10095
            r1.add(r0)
        L_0x01f9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1460.m8732(o.ʢ, int, boolean, int):int");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m8727(List<C2043> list, int i, int i2) {
        HashSet<C1696> hashSet;
        int i3;
        int i4;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            C2043 r3 = list.get(i5);
            if (i == 0) {
                hashSet = r3.f10091;
            } else if (i == 1) {
                hashSet = r3.f10095;
            } else {
                hashSet = null;
            }
            for (C1696 next : hashSet) {
                if (next.f8811) {
                    int i6 = i << 1;
                    C1625 r7 = next.f8826[i6];
                    C1625 r8 = next.f8826[i6 + 1];
                    if ((r7.f8549 == null || r8.f8549 == null) ? false : true) {
                        C1854.m10215(next, i, m8725(next, i) + r7.m9386());
                    } else if (next.f8854 == 0.0f || next.m9628(i) != C1696.C1697.MATCH_CONSTRAINT) {
                        if (i == 0) {
                            i3 = next.f8847;
                        } else if (i == 1) {
                            i3 = next.f8865;
                        } else {
                            i3 = 0;
                        }
                        int i7 = i2 - i3;
                        if (i == 0) {
                            if (next.f8850 != 8) {
                                i4 = next.f8827;
                                int i8 = i7 - i4;
                                next.m9646(i8, i7, i);
                                C1854.m10215(next, i, i8);
                            }
                        } else if (i == 1 && next.f8850 != 8) {
                            i4 = next.f8836;
                            int i82 = i7 - i4;
                            next.m9646(i82, i7, i);
                            C1854.m10215(next, i, i82);
                        }
                        i4 = 0;
                        int i822 = i7 - i4;
                        next.m9646(i822, i7, i);
                        C1854.m10215(next, i, i822);
                    } else {
                        int r9 = m8730(next);
                        int i9 = (int) next.f8826[i6].f8547.f10002;
                        r8.f8547.f10000 = r7.f8547;
                        r8.f8547.f10002 = (float) r9;
                        r8.f8547.f13030 = 1;
                        next.m9646(i9, i9 + r9, i);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[ADDED_TO_REGION] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m8725(o.C1696 r7, int r8) {
        /*
            int r0 = r8 << 1
            o.ʈ[] r1 = r7.f8826
            r1 = r1[r0]
            o.ʈ[] r2 = r7.f8826
            r3 = 1
            int r0 = r0 + r3
            r0 = r2[r0]
            o.ʈ r2 = r1.f8549
            r4 = 0
            if (r2 == 0) goto L_0x0064
            o.ʈ r2 = r1.f8549
            o.ʢ r2 = r2.f8546
            o.ʢ r5 = r7.f8828
            if (r2 != r5) goto L_0x0064
            o.ʈ r2 = r0.f8549
            if (r2 == 0) goto L_0x0064
            o.ʈ r2 = r0.f8549
            o.ʢ r2 = r2.f8546
            o.ʢ r5 = r7.f8828
            if (r2 != r5) goto L_0x0064
            o.ʢ r2 = r7.f8828
            r5 = 8
            if (r8 != 0) goto L_0x0032
            int r6 = r2.f8850
            if (r6 == r5) goto L_0x003b
            int r2 = r2.f8827
            goto L_0x003c
        L_0x0032:
            if (r8 != r3) goto L_0x003b
            int r6 = r2.f8850
            if (r6 == r5) goto L_0x003b
            int r2 = r2.f8836
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r8 != 0) goto L_0x0041
            float r6 = r7.f8853
            goto L_0x0043
        L_0x0041:
            float r6 = r7.f8868
        L_0x0043:
            if (r8 != 0) goto L_0x004c
            int r8 = r7.f8850
            if (r8 == r5) goto L_0x0054
            int r4 = r7.f8827
            goto L_0x0054
        L_0x004c:
            if (r8 != r3) goto L_0x0054
            int r8 = r7.f8850
            if (r8 == r5) goto L_0x0054
            int r4 = r7.f8836
        L_0x0054:
            int r7 = r1.m9386()
            int r2 = r2 - r7
            int r7 = r0.m9386()
            int r2 = r2 - r7
            int r2 = r2 - r4
            float r7 = (float) r2
            float r7 = r7 * r6
            int r7 = (int) r7
            return r7
        L_0x0064:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1460.m8725(o.ʢ, int):int");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m8730(C1696 r4) {
        float f;
        float f2;
        int i = 0;
        if (r4.m9625() == C1696.C1697.MATCH_CONSTRAINT) {
            if (r4.f8860 == 0) {
                if (r4.f8850 != 8) {
                    i = r4.f8836;
                }
                f2 = ((float) i) * r4.f8854;
            } else {
                if (r4.f8850 != 8) {
                    i = r4.f8836;
                }
                f2 = ((float) i) / r4.f8854;
            }
            int i2 = (int) f2;
            r4.m9645(i2);
            return i2;
        } else if (r4.m9643() != C1696.C1697.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (r4.f8860 == 1) {
                if (r4.f8850 != 8) {
                    i = r4.f8827;
                }
                f = ((float) i) * r4.f8854;
            } else {
                if (r4.f8850 != 8) {
                    i = r4.f8827;
                }
                f = ((float) i) / r4.f8854;
            }
            int i3 = (int) f;
            r4.m9651(i3);
            return i3;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m8728(C1821 r10) {
        int i;
        int i2 = 0;
        if ((r10.f9286 & 32) != 32) {
            r10.f9297.clear();
            r10.f9297.add(0, new C2043(r10.f10574));
            return;
        }
        r10.f9290 = true;
        r10.f9284 = false;
        r10.f9296 = false;
        r10.f9299 = false;
        ArrayList<C1696> arrayList = r10.f10574;
        List<C2043> list = r10.f9297;
        boolean z = r10.m9625() == C1696.C1697.WRAP_CONTENT;
        boolean z2 = r10.m9643() == C1696.C1697.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C1696 next : arrayList) {
            next.f8859 = null;
            next.f8820 = false;
            next.m9650();
        }
        for (C1696 next2 : arrayList) {
            if (next2.f8859 == null) {
                C2043 r8 = new C2043(new ArrayList(), (byte) 0);
                list.add(r8);
                if (!m8729(next2, r8, list, z3)) {
                    r10.f9297.clear();
                    r10.f9297.add(0, new C2043(r10.f10574));
                    r10.f9290 = false;
                    return;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        for (C2043 next3 : list) {
            i3 = Math.max(i3, m8731(next3, 0));
            i4 = Math.max(i4, m8731(next3, 1));
        }
        if (z) {
            r10.m9623(C1696.C1697.FIXED);
            r10.m9645(i3);
            r10.f9284 = true;
            r10.f9296 = true;
            r10.f9285 = i3;
        }
        if (z2) {
            r10.m9648(C1696.C1697.FIXED);
            r10.m9651(i4);
            r10.f9284 = true;
            r10.f9299 = true;
            r10.f9289 = i4;
        }
        if (r10.f8850 == 8) {
            i = 0;
        } else {
            i = r10.f8827;
        }
        m8727(list, 0, i);
        if (r10.f8850 != 8) {
            i2 = r10.f8836;
        }
        m8727(list, 1, i2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m8731(C2043 r10, int i) {
        List<C1696> list;
        int i2 = i << 1;
        if (i == 0) {
            list = r10.f10092;
        } else if (i == 1) {
            list = r10.f10089;
        } else {
            list = null;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C1696 r7 = list.get(i4);
            int i5 = i2 + 1;
            i3 = Math.max(i3, m8732(r7, i, r7.f8826[i5].f8549 == null || !(r7.f8826[i2].f8549 == null || r7.f8826[i5].f8549 == null), 0));
        }
        r10.f10087[i] = i3;
        return i3;
    }

    public C1460(List<C2864.If> list, char c, double d, String str, String str2) {
        this.f7859 = list;
        this.f7861 = c;
        this.f7863 = d;
        this.f7860 = str;
        this.f7862 = str2;
    }

    public final int hashCode() {
        return (((this.f7861 * 31) + this.f7862.hashCode()) * 31) + this.f7860.hashCode();
    }

    public C1460() {
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m8726(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
