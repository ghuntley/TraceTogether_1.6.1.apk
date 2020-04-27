package o;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C2724;
import sun.misc.Unsafe;

/* renamed from: o.Ιɫ  reason: contains not printable characters */
final class C1824<T> implements C1990<T> {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Unsafe f9302 = C2509.m13289();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final int[] f9303 = new int[0];

    /* renamed from: ŀ  reason: contains not printable characters */
    private final C1532 f9304;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final boolean f9305;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int[] f9306;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final boolean f9307;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final int f9308;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Object[] f9309;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final int[] f9310;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final boolean f9311;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final int f9312;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C1309 f9313;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final C2342<?, ?> f9314;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f9315;

    /* renamed from: І  reason: contains not printable characters */
    private final int f9316;

    /* renamed from: г  reason: contains not printable characters */
    private final C0740<?> f9317;

    /* renamed from: і  reason: contains not printable characters */
    private final C1637 f9318;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final boolean f9319;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C1927 f9320;

    private C1824(int[] iArr, Object[] objArr, int i, int i2, C1637 r5, boolean z, boolean z2, int[] iArr2, int i3, int i4, C1927 r11, C1309 r12, C2342<?, ?> r13, C0740<?> r14, C1532 r15) {
        this.f9306 = iArr;
        this.f9309 = objArr;
        this.f9315 = i;
        this.f9316 = i2;
        this.f9305 = r5 instanceof C0987;
        this.f9311 = z;
        this.f9319 = r14 != null && r14.m5925(r5);
        this.f9307 = false;
        this.f9310 = iArr2;
        this.f9312 = i3;
        this.f9308 = i4;
        this.f9320 = r11;
        this.f9313 = r12;
        this.f9314 = r13;
        this.f9317 = r14;
        this.f9318 = r5;
        this.f9304 = r15;
    }

    /* renamed from: І  reason: contains not printable characters */
    private static boolean m10065(int i) {
        return (i & 536870912) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03c9  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> o.C1824<T> m10050(java.lang.Class<T> r35, o.C1640 r36, o.C1927 r37, o.C1309 r38, o.C2342<?, ?> r39, o.C0740<?> r40, o.C1532 r41) {
        /*
            r0 = r36
            boolean r1 = r0 instanceof o.C2035
            if (r1 == 0) goto L_0x0444
            o.ιυ r0 = (o.C2035) r0
            int r1 = r0.m10902()
            int r2 = o.C0987.If.f6021
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = 1
            goto L_0x0015
        L_0x0014:
            r11 = 0
        L_0x0015:
            java.lang.String r1 = r0.m10903()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L_0x003f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r8 = r5
            r5 = 1
            r9 = 13
        L_0x002c:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r7) goto L_0x003c
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r8 = r8 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x002c
        L_0x003c:
            int r5 = r5 << r9
            r5 = r5 | r8
            goto L_0x0040
        L_0x003f:
            r10 = 1
        L_0x0040:
            int r8 = r10 + 1
            char r9 = r1.charAt(r10)
            if (r9 < r7) goto L_0x005f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x004c:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x005c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x004c
        L_0x005c:
            int r8 = r8 << r10
            r9 = r9 | r8
            goto L_0x0060
        L_0x005f:
            r12 = r8
        L_0x0060:
            if (r9 != 0) goto L_0x006e
            int[] r8 = f9303
            r15 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            goto L_0x01a0
        L_0x006e:
            int r8 = r12 + 1
            char r9 = r1.charAt(r12)
            if (r9 < r7) goto L_0x008e
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x007a:
            int r12 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x008a
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r9 = r9 | r8
            int r10 = r10 + 13
            r8 = r12
            goto L_0x007a
        L_0x008a:
            int r8 = r8 << r10
            r8 = r8 | r9
            r9 = r8
            goto L_0x008f
        L_0x008e:
            r12 = r8
        L_0x008f:
            int r8 = r12 + 1
            char r10 = r1.charAt(r12)
            if (r10 < r7) goto L_0x00ae
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x009b:
            int r13 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00ab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r12
            r10 = r10 | r8
            int r12 = r12 + 13
            r8 = r13
            goto L_0x009b
        L_0x00ab:
            int r8 = r8 << r12
            r10 = r10 | r8
            goto L_0x00af
        L_0x00ae:
            r13 = r8
        L_0x00af:
            int r8 = r13 + 1
            char r12 = r1.charAt(r13)
            if (r12 < r7) goto L_0x00cf
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00bb:
            int r14 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00cb
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r13
            r12 = r12 | r8
            int r13 = r13 + 13
            r8 = r14
            goto L_0x00bb
        L_0x00cb:
            int r8 = r8 << r13
            r8 = r8 | r12
            r12 = r8
            goto L_0x00d0
        L_0x00cf:
            r14 = r8
        L_0x00d0:
            int r8 = r14 + 1
            char r13 = r1.charAt(r14)
            if (r13 < r7) goto L_0x00f0
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00dc:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x00ec
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r14
            r13 = r13 | r8
            int r14 = r14 + 13
            r8 = r15
            goto L_0x00dc
        L_0x00ec:
            int r8 = r8 << r14
            r8 = r8 | r13
            r13 = r8
            goto L_0x00f1
        L_0x00f0:
            r15 = r8
        L_0x00f1:
            int r8 = r15 + 1
            char r14 = r1.charAt(r15)
            if (r14 < r7) goto L_0x0113
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fd:
            int r16 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x010e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r15
            r14 = r14 | r8
            int r15 = r15 + 13
            r8 = r16
            goto L_0x00fd
        L_0x010e:
            int r8 = r8 << r15
            r8 = r8 | r14
            r14 = r8
            r8 = r16
        L_0x0113:
            int r15 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r7) goto L_0x0136
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011f:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0131
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r8 = r8 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011f
        L_0x0131:
            int r15 = r15 << r16
            r8 = r8 | r15
            r15 = r17
        L_0x0136:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r34 = r16
            r16 = r15
            r15 = r34
        L_0x0148:
            int r18 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r7) goto L_0x015b
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r17
            r16 = r16 | r15
            int r17 = r17 + 13
            r15 = r18
            goto L_0x0148
        L_0x015b:
            int r15 = r15 << r17
            r15 = r16 | r15
            r3 = r18
            goto L_0x0164
        L_0x0162:
            r3 = r16
        L_0x0164:
            int r16 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x018f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
            r34 = r16
            r16 = r3
            r3 = r34
        L_0x0176:
            int r18 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r7) goto L_0x0189
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r17
            r16 = r16 | r3
            int r17 = r17 + 13
            r3 = r18
            goto L_0x0176
        L_0x0189:
            int r3 = r3 << r17
            r3 = r16 | r3
            r16 = r18
        L_0x018f:
            int r17 = r3 + r8
            int r15 = r17 + r15
            int[] r15 = new int[r15]
            int r17 = r9 << 1
            int r10 = r17 + r10
            r34 = r16
            r16 = r9
            r9 = r12
            r12 = r34
        L_0x01a0:
            sun.misc.Unsafe r6 = f9302
            java.lang.Object[] r17 = r0.m10905()
            o.ʋΙ r18 = r0.m10906()
            java.lang.Class r7 = r18.getClass()
            r18 = r10
            int r10 = r14 * 3
            int[] r10 = new int[r10]
            int r14 = r14 << r4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r20 = r3 + r8
            r22 = r3
            r23 = r20
            r8 = 0
            r21 = 0
        L_0x01c0:
            if (r12 >= r2) goto L_0x041a
            int r24 = r12 + 1
            char r12 = r1.charAt(r12)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r4) goto L_0x01f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
            r34 = r24
            r24 = r12
            r12 = r34
        L_0x01d7:
            int r27 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r4) goto L_0x01ed
            r4 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r26
            r24 = r24 | r4
            int r26 = r26 + 13
            r12 = r27
            r4 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01d7
        L_0x01ed:
            int r4 = r12 << r26
            r12 = r24 | r4
            r4 = r27
            goto L_0x01f6
        L_0x01f4:
            r4 = r24
        L_0x01f6:
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x022a
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r27 = 13
            r34 = r24
            r24 = r4
            r4 = r34
        L_0x020d:
            int r28 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r2) goto L_0x0223
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r27
            r24 = r24 | r2
            int r27 = r27 + 13
            r4 = r28
            r2 = 55296(0xd800, float:7.7486E-41)
            goto L_0x020d
        L_0x0223:
            int r2 = r4 << r27
            r4 = r24 | r2
            r2 = r28
            goto L_0x022c
        L_0x022a:
            r2 = r24
        L_0x022c:
            r24 = r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            r27 = r11
            r11 = r4 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x023b
            int r11 = r8 + 1
            r15[r8] = r21
            r8 = r11
        L_0x023b:
            r11 = 51
            r30 = r8
            if (r3 < r11) goto L_0x02e1
            int r11 = r2 + 1
            char r2 = r1.charAt(r2)
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r8) goto L_0x026a
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x0250:
            int r33 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r8) goto L_0x0265
            r8 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r32
            r2 = r2 | r8
            int r32 = r32 + 13
            r11 = r33
            r8 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0250
        L_0x0265:
            int r8 = r11 << r32
            r2 = r2 | r8
            r11 = r33
        L_0x026a:
            int r8 = r3 + -51
            r32 = r11
            r11 = 9
            if (r8 == r11) goto L_0x028e
            r11 = 17
            if (r8 != r11) goto L_0x0277
            goto L_0x028e
        L_0x0277:
            r11 = 12
            if (r8 != r11) goto L_0x028c
            r8 = r5 & 1
            r11 = 1
            if (r8 != r11) goto L_0x028c
            int r8 = r21 / 3
            int r8 = r8 << r11
            int r8 = r8 + r11
            int r11 = r18 + 1
            r18 = r17[r18]
            r14[r8] = r18
            r18 = r11
        L_0x028c:
            r11 = 1
            goto L_0x029b
        L_0x028e:
            int r8 = r21 / 3
            r11 = 1
            int r8 = r8 << r11
            int r8 = r8 + r11
            int r25 = r18 + 1
            r18 = r17[r18]
            r14[r8] = r18
            r18 = r25
        L_0x029b:
            int r2 = r2 << r11
            r8 = r17[r2]
            boolean r11 = r8 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x02a5
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x02ad
        L_0x02a5:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m10057((java.lang.Class<?>) r7, (java.lang.String) r8)
            r17[r2] = r8
        L_0x02ad:
            r11 = r9
            long r8 = r6.objectFieldOffset(r8)
            int r9 = (int) r8
            int r2 = r2 + 1
            r8 = r17[r2]
            r28 = r9
            boolean r9 = r8 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x02c0
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x02c8
        L_0x02c0:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m10057((java.lang.Class<?>) r7, (java.lang.String) r8)
            r17[r2] = r8
        L_0x02c8:
            long r8 = r6.objectFieldOffset(r8)
            int r2 = (int) r8
            r31 = r1
            r8 = r2
            r1 = r7
            r25 = r18
            r9 = r28
            r2 = 0
            r19 = 1
            r28 = r11
            r18 = r13
            r13 = r12
            r12 = r32
            goto L_0x03e2
        L_0x02e1:
            r11 = r9
            int r8 = r18 + 1
            r9 = r17[r18]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m10057((java.lang.Class<?>) r7, (java.lang.String) r9)
            r18 = r13
            r13 = 9
            if (r3 == r13) goto L_0x0361
            r13 = 17
            if (r3 != r13) goto L_0x02f8
            goto L_0x0361
        L_0x02f8:
            r13 = 27
            if (r3 == r13) goto L_0x0350
            r13 = 49
            if (r3 != r13) goto L_0x0301
            goto L_0x0350
        L_0x0301:
            r13 = 12
            if (r3 == r13) goto L_0x033e
            r13 = 30
            if (r3 == r13) goto L_0x033e
            r13 = 44
            if (r3 != r13) goto L_0x030e
            goto L_0x033e
        L_0x030e:
            r13 = 50
            if (r3 != r13) goto L_0x033a
            int r13 = r22 + 1
            r15[r22] = r21
            int r22 = r21 / 3
            r25 = 1
            int r22 = r22 << 1
            int r28 = r8 + 1
            r8 = r17[r8]
            r14[r22] = r8
            r8 = r4 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0333
            int r22 = r22 + 1
            int r8 = r28 + 1
            r28 = r17[r28]
            r14[r22] = r28
            r28 = r11
            r22 = r13
            goto L_0x036e
        L_0x0333:
            r22 = r13
            r8 = r28
            r28 = r11
            goto L_0x036e
        L_0x033a:
            r28 = r11
            r11 = 1
            goto L_0x036e
        L_0x033e:
            r13 = r5 & 1
            r28 = r11
            r11 = 1
            if (r13 != r11) goto L_0x036e
            int r13 = r21 / 3
            int r13 = r13 << r11
            int r13 = r13 + r11
            int r25 = r8 + 1
            r8 = r17[r8]
            r14[r13] = r8
            goto L_0x035d
        L_0x0350:
            r28 = r11
            r11 = 1
            int r13 = r21 / 3
            int r13 = r13 << r11
            int r13 = r13 + r11
            int r25 = r8 + 1
            r8 = r17[r8]
            r14[r13] = r8
        L_0x035d:
            r13 = r12
            r8 = r25
            goto L_0x036f
        L_0x0361:
            r28 = r11
            r11 = 1
            int r13 = r21 / 3
            int r13 = r13 << r11
            int r13 = r13 + r11
            java.lang.Class r25 = r9.getType()
            r14[r13] = r25
        L_0x036e:
            r13 = r12
        L_0x036f:
            long r11 = r6.objectFieldOffset(r9)
            int r9 = (int) r11
            r11 = r5 & 1
            r12 = 1
            if (r11 != r12) goto L_0x03c9
            r11 = 17
            if (r3 > r11) goto L_0x03c9
            int r11 = r2 + 1
            char r2 = r1.charAt(r2)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r12) goto L_0x03a3
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x038c:
            int r29 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r12) goto L_0x039e
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r19
            r2 = r2 | r11
            int r19 = r19 + 13
            r11 = r29
            goto L_0x038c
        L_0x039e:
            int r11 = r11 << r19
            r2 = r2 | r11
            r11 = r29
        L_0x03a3:
            r19 = 1
            int r25 = r16 << 1
            int r29 = r2 / 32
            int r25 = r25 + r29
            r12 = r17[r25]
            r31 = r1
            boolean r1 = r12 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x03b6
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x03be
        L_0x03b6:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m10057((java.lang.Class<?>) r7, (java.lang.String) r12)
            r17[r25] = r12
        L_0x03be:
            r1 = r7
            r25 = r8
            long r7 = r6.objectFieldOffset(r12)
            int r8 = (int) r7
            int r2 = r2 % 32
            goto L_0x03d3
        L_0x03c9:
            r31 = r1
            r1 = r7
            r25 = r8
            r19 = 1
            r11 = r2
            r2 = 0
            r8 = 0
        L_0x03d3:
            r7 = 18
            if (r3 < r7) goto L_0x03e1
            r7 = 49
            if (r3 > r7) goto L_0x03e1
            int r7 = r23 + 1
            r15[r23] = r9
            r23 = r7
        L_0x03e1:
            r12 = r11
        L_0x03e2:
            int r7 = r21 + 1
            r10[r21] = r13
            int r11 = r7 + 1
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x03ef
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03f0
        L_0x03ef:
            r13 = 0
        L_0x03f0:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x03f7
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03f8
        L_0x03f7:
            r4 = 0
        L_0x03f8:
            r4 = r4 | r13
            int r3 = r3 << 20
            r3 = r3 | r4
            r3 = r3 | r9
            r10[r7] = r3
            int r21 = r11 + 1
            int r2 = r2 << 20
            r2 = r2 | r8
            r10[r11] = r2
            r7 = r1
            r13 = r18
            r3 = r24
            r18 = r25
            r2 = r26
            r11 = r27
            r9 = r28
            r8 = r30
            r1 = r31
            r4 = 1
            goto L_0x01c0
        L_0x041a:
            r24 = r3
            r28 = r9
            r27 = r11
            r18 = r13
            o.Ιɫ r1 = new o.Ιɫ
            o.ʋΙ r0 = r0.m10906()
            r12 = 0
            r5 = r1
            r6 = r10
            r7 = r14
            r8 = r28
            r9 = r18
            r10 = r0
            r13 = r15
            r14 = r24
            r15 = r20
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r20 = r41
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        L_0x0444:
            o.ІĿ r0 = (o.C2213) r0
            int r0 = r0.m11651()
            int r1 = o.C0987.If.f6021
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10050(java.lang.Class, o.ʋӀ, o.α, o.ɩє, o.Џ, o.ƚɺ, o.ɽӀ):o.Ιɫ");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Field m10057(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final T m10075() {
        return this.f9320.m10527(this.f9318);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (o.C2092.m11167(o.C2509.m13271(r10, r6), o.C2509.m13271(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (o.C2509.m13280(r10, r6) == o.C2509.m13280(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (o.C2509.m13273((java.lang.Object) r10, r6) == o.C2509.m13273((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (o.C2509.m13280(r10, r6) == o.C2509.m13280(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (o.C2509.m13273((java.lang.Object) r10, r6) == o.C2509.m13273((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (o.C2509.m13273((java.lang.Object) r10, r6) == o.C2509.m13273((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (o.C2509.m13273((java.lang.Object) r10, r6) == o.C2509.m13273((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (o.C2092.m11167(o.C2509.m13271(r10, r6), o.C2509.m13271(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (o.C2092.m11167(o.C2509.m13271(r10, r6), o.C2509.m13271(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (o.C2092.m11167(o.C2509.m13271(r10, r6), o.C2509.m13271(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (o.C2509.m13270((java.lang.Object) r10, r6) == o.C2509.m13270((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (o.C2509.m13273((java.lang.Object) r10, r6) == o.C2509.m13273((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (o.C2509.m13280(r10, r6) == o.C2509.m13280(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (o.C2509.m13273((java.lang.Object) r10, r6) == o.C2509.m13273((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (o.C2509.m13280(r10, r6) == o.C2509.m13280(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (o.C2509.m13280(r10, r6) == o.C2509.m13280(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(o.C2509.m13293(r10, r6)) == java.lang.Float.floatToIntBits(o.C2509.m13293(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(o.C2509.m13287(r10, r6)) == java.lang.Double.doubleToLongBits(o.C2509.m13287(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (o.C2092.m11167(o.C2509.m13271(r10, r6), o.C2509.m13271(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m10074(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f9306
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m10047((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m10030((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = o.C2509.m13273((java.lang.Object) r10, (long) r4)
            int r4 = o.C2509.m13273((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = o.C2509.m13271(r10, r6)
            java.lang.Object r5 = o.C2509.m13271(r11, r6)
            boolean r4 = o.C2092.m11167((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = o.C2509.m13271(r10, r6)
            java.lang.Object r4 = o.C2509.m13271(r11, r6)
            boolean r3 = o.C2092.m11167((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = o.C2509.m13271(r10, r6)
            java.lang.Object r4 = o.C2509.m13271(r11, r6)
            boolean r3 = o.C2092.m11167((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = o.C2509.m13271(r10, r6)
            java.lang.Object r5 = o.C2509.m13271(r11, r6)
            boolean r4 = o.C2092.m11167((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = o.C2509.m13280(r10, r6)
            long r6 = o.C2509.m13280(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = o.C2509.m13273((java.lang.Object) r10, (long) r6)
            int r5 = o.C2509.m13273((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = o.C2509.m13280(r10, r6)
            long r6 = o.C2509.m13280(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = o.C2509.m13273((java.lang.Object) r10, (long) r6)
            int r5 = o.C2509.m13273((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = o.C2509.m13273((java.lang.Object) r10, (long) r6)
            int r5 = o.C2509.m13273((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = o.C2509.m13273((java.lang.Object) r10, (long) r6)
            int r5 = o.C2509.m13273((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = o.C2509.m13271(r10, r6)
            java.lang.Object r5 = o.C2509.m13271(r11, r6)
            boolean r4 = o.C2092.m11167((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = o.C2509.m13271(r10, r6)
            java.lang.Object r5 = o.C2509.m13271(r11, r6)
            boolean r4 = o.C2092.m11167((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = o.C2509.m13271(r10, r6)
            java.lang.Object r5 = o.C2509.m13271(r11, r6)
            boolean r4 = o.C2092.m11167((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = o.C2509.m13270((java.lang.Object) r10, (long) r6)
            boolean r5 = o.C2509.m13270((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = o.C2509.m13273((java.lang.Object) r10, (long) r6)
            int r5 = o.C2509.m13273((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = o.C2509.m13280(r10, r6)
            long r6 = o.C2509.m13280(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = o.C2509.m13273((java.lang.Object) r10, (long) r6)
            int r5 = o.C2509.m13273((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = o.C2509.m13280(r10, r6)
            long r6 = o.C2509.m13280(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = o.C2509.m13280(r10, r6)
            long r6 = o.C2509.m13280(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = o.C2509.m13293(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = o.C2509.m13293(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m10064(r10, r11, (int) r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = o.C2509.m13287(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = o.C2509.m13287(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            o.Џ<?, ?> r0 = r9.f9314
            java.lang.Object r0 = r0.m12218(r10)
            o.Џ<?, ?> r2 = r9.f9314
            java.lang.Object r2 = r2.m12218(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f9319
            if (r0 == 0) goto L_0x01f1
            o.ƚɺ<?> r0 = r9.f9317
            o.ƭǃ r10 = r0.m5922(r10)
            o.ƚɺ<?> r0 = r9.f9317
            o.ƭǃ r11 = r0.m5922(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10074(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m10068(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f9306
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.m10047((int) r1)
            int[] r4 = r8.f9306
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m10044(r9, (long) r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m10054(r9, (long) r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m10044(r9, (long) r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m10054(r9, (long) r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m10054(r9, (long) r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m10054(r9, (long) r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = m10066(r9, r5)
            int r3 = o.C0936.m6812((boolean) r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m10054(r9, (long) r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m10044(r9, (long) r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m10054(r9, (long) r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m10044(r9, (long) r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m10044(r9, (long) r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = m10033(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.m10040(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = m10029(r9, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = o.C2509.m13280(r9, r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = o.C2509.m13273((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = o.C2509.m13280(r9, r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = o.C2509.m13273((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = o.C2509.m13273((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = o.C2509.m13273((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = o.C2509.m13271(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = o.C2509.m13270((java.lang.Object) r9, (long) r5)
            int r3 = o.C0936.m6812((boolean) r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = o.C2509.m13273((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = o.C2509.m13280(r9, r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = o.C2509.m13273((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = o.C2509.m13280(r9, r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = o.C2509.m13280(r9, r5)
            int r3 = o.C0936.m6805(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = o.C2509.m13293(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = o.C2509.m13287(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = o.C0936.m6805(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            o.Џ<?, ?> r0 = r8.f9314
            java.lang.Object r0 = r0.m12218(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f9319
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            o.ƚɺ<?> r0 = r8.f9317
            o.ƭǃ r9 = r0.m5922(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10068(java.lang.Object):int");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10078(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f9306.length; i += 3) {
                int r1 = m10047(i);
                long j = (long) (1048575 & r1);
                int i2 = this.f9306[i];
                switch ((r1 & 267386880) >>> 20) {
                    case 0:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13264((Object) t, j, C2509.m13287(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 1:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13282((Object) t, j, C2509.m13293(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 2:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13275((Object) t, j, C2509.m13280(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 3:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13275((Object) t, j, C2509.m13280(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 4:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13265((Object) t, j, C2509.m13273((Object) t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 5:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13275((Object) t, j, C2509.m13280(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 6:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13265((Object) t, j, C2509.m13273((Object) t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 7:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13296((Object) t, j, C2509.m13270((Object) t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 8:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13291((Object) t, j, C2509.m13271(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 9:
                        m10031(t, t2, i);
                        break;
                    case 10:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13291((Object) t, j, C2509.m13271(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 11:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13265((Object) t, j, C2509.m13273((Object) t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 12:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13265((Object) t, j, C2509.m13273((Object) t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 13:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13265((Object) t, j, C2509.m13273((Object) t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 14:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13275((Object) t, j, C2509.m13280(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 15:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13265((Object) t, j, C2509.m13273((Object) t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 16:
                        if (!m10052(t2, i)) {
                            break;
                        } else {
                            C2509.m13275((Object) t, j, C2509.m13280(t2, j));
                            m10060(t, i);
                            break;
                        }
                    case 17:
                        m10031(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f9313.m8261(t, t2, j);
                        break;
                    case 50:
                        C2092.m11136(this.f9304, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m10040(t2, i2, i)) {
                            break;
                        } else {
                            C2509.m13291((Object) t, j, C2509.m13271(t2, j));
                            m10061(t, i2, i);
                            break;
                        }
                    case C2724.C2725.f12707 /*60*/:
                        m10039(t, t2, i);
                        break;
                    case C2724.C2725.f12719 /*61*/:
                    case C2724.C2725.f12604 /*62*/:
                    case C2724.C2725.f12598 /*63*/:
                    case C2724.C2725.f12589 /*64*/:
                    case C2724.C2725.f12592 /*65*/:
                    case C2724.C2725.f12724 /*66*/:
                    case C2724.C2725.f12607 /*67*/:
                        if (!m10040(t2, i2, i)) {
                            break;
                        } else {
                            C2509.m13291((Object) t, j, C2509.m13271(t2, j));
                            m10061(t, i2, i);
                            break;
                        }
                    case C2724.C2725.f12610 /*68*/:
                        m10039(t, t2, i);
                        break;
                }
            }
            C2092.m11166(this.f9314, t, t2);
            if (this.f9319) {
                C2092.m11147(this.f9317, t, t2);
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m10031(T t, T t2, int i) {
        long r0 = (long) (m10047(i) & 1048575);
        if (m10052(t2, i)) {
            Object r2 = C2509.m13271(t, r0);
            Object r5 = C2509.m13271(t2, r0);
            if (r2 != null && r5 != null) {
                C2509.m13291((Object) t, r0, C0936.m6806(r2, r5));
                m10060(t, i);
            } else if (r5 != null) {
                C2509.m13291((Object) t, r0, r5);
                m10060(t, i);
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m10039(T t, T t2, int i) {
        int r0 = m10047(i);
        int i2 = this.f9306[i];
        long j = (long) (r0 & 1048575);
        if (m10040(t2, i2, i)) {
            Object r02 = C2509.m13271(t, j);
            Object r6 = C2509.m13271(t2, j);
            if (r02 != null && r6 != null) {
                C2509.m13291((Object) t, j, C0936.m6806(r02, r6));
                m10061(t, i2, i);
            } else if (r6 != null) {
                C2509.m13291((Object) t, j, r6);
                m10061(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0834, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0900, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0915, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x095a, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a0b, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a2e, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m10073(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f9311
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = f9302
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f9306
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.m10047((int) r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f9306
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            o.ƚј r14 = o.C0752.DOUBLE_LIST_PACKED
            int r14 = r14.m6002()
            if (r15 < r14) goto L_0x0041
            o.ƚј r14 = o.C0752.SINT64_LIST_PACKED
            int r14 = r14.m6002()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f9306
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r7
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0482;
                case 7: goto L_0x0476;
                case 8: goto L_0x0458;
                case 9: goto L_0x0444;
                case 10: goto L_0x0433;
                case 11: goto L_0x0424;
                case 12: goto L_0x0415;
                case 13: goto L_0x040a;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03f0;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a6;
                case 22: goto L_0x039d;
                case 23: goto L_0x0394;
                case 24: goto L_0x038b;
                case 25: goto L_0x0382;
                case 26: goto L_0x0379;
                case 27: goto L_0x036c;
                case 28: goto L_0x0363;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04e4
        L_0x0047:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            o.ʋΙ r5 = (o.C1637) r5
            o.ιɤ r6 = r0.m10045((int) r12)
            int r3 = o.C0692.m5650(r3, r5, r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m10044(r1, (long) r5)
            int r3 = o.C0692.m5680((int) r3, (long) r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m10054(r1, (long) r5)
            int r3 = o.C0692.m5655(r3, r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.m10040(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5676((int) r3, (long) r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.m10040(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5640(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m10054(r1, (long) r5)
            int r3 = o.C0692.m5653(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m10054(r1, (long) r5)
            int r3 = o.C0692.m5675((int) r3, (int) r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            o.ŀɺ r5 = (o.C0510) r5
            int r3 = o.C0692.m5648((int) r3, (o.C0510) r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            o.ιɤ r6 = r0.m10045((int) r12)
            int r3 = o.C2092.m11128((int) r3, (java.lang.Object) r5, (o.C1990) r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            boolean r6 = r5 instanceof o.C0510
            if (r6 == 0) goto L_0x00f1
            o.ŀɺ r5 = (o.C0510) r5
            int r3 = o.C0692.m5648((int) r3, (o.C0510) r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = o.C0692.m5663((int) r3, (java.lang.String) r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.m10040(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5666((int) r3, (boolean) r8)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.m10040(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5679((int) r3, (int) r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.m10040(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5672((int) r3, (long) r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m10054(r1, (long) r5)
            int r3 = o.C0692.m5671((int) r3, (int) r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m10044(r1, (long) r5)
            int r3 = o.C0692.m5658((int) r3, (long) r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.m10040(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m10044(r1, (long) r5)
            int r3 = o.C0692.m5634((int) r3, (long) r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.m10040(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5662((int) r3, (float) r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.m10040(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = o.C0692.m5661((int) r3, (double) r5)
            goto L_0x03c9
        L_0x0167:
            o.ɽӀ r14 = r0.f9304
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            java.lang.Object r6 = r0.m10036((int) r12)
            int r3 = r14.m8990(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            o.ιɤ r6 = r0.m10045((int) r12)
            int r3 = o.C2092.m11160((int) r3, (java.util.List<o.C1637>) r5, (o.C1990) r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11169((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11181(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11138(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11178(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11162(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11175(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11157(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11178(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11138(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11151(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11130((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11143(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11178(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = o.C2092.m11138(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f9307
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = o.C0692.m5647((int) r3)
            int r6 = o.C0692.m5639((int) r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11161((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11137(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11156(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11177(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11168(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11180(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11140(r3, r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            o.ιɤ r6 = r0.m10045((int) r12)
            int r3 = o.C2092.m11141((int) r3, (java.util.List<?>) r5, (o.C1990) r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11159((int) r3, (java.util.List<?>) r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11174(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11177(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11156(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11129((int) r3, (java.util.List<java.lang.Integer>) r5, (boolean) r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11142((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11150(r3, r5, r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11177(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = m10049((java.lang.Object) r1, (long) r5)
            int r3 = o.C2092.m11156(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            o.ʋΙ r5 = (o.C1637) r5
            o.ιɤ r6 = r0.m10045((int) r12)
            int r3 = o.C0692.m5650(r3, r5, r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = o.C2509.m13280(r1, r5)
            int r3 = o.C0692.m5680((int) r3, (long) r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = o.C2509.m13273((java.lang.Object) r1, (long) r5)
            int r3 = o.C0692.m5655(r3, r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.m10052(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5676((int) r3, (long) r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.m10052(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5640(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = o.C2509.m13273((java.lang.Object) r1, (long) r5)
            int r3 = o.C0692.m5653(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = o.C2509.m13273((java.lang.Object) r1, (long) r5)
            int r3 = o.C0692.m5675((int) r3, (int) r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            o.ŀɺ r5 = (o.C0510) r5
            int r3 = o.C0692.m5648((int) r3, (o.C0510) r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            o.ιɤ r6 = r0.m10045((int) r12)
            int r3 = o.C2092.m11128((int) r3, (java.lang.Object) r5, (o.C1990) r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = o.C2509.m13271(r1, r5)
            boolean r6 = r5 instanceof o.C0510
            if (r6 == 0) goto L_0x046e
            o.ŀɺ r5 = (o.C0510) r5
            int r3 = o.C0692.m5648((int) r3, (o.C0510) r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = o.C0692.m5663((int) r3, (java.lang.String) r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.m10052(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5666((int) r3, (boolean) r8)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.m10052(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5679((int) r3, (int) r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.m10052(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5672((int) r3, (long) r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = o.C2509.m13273((java.lang.Object) r1, (long) r5)
            int r3 = o.C0692.m5671((int) r3, (int) r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = o.C2509.m13280(r1, r5)
            int r3 = o.C0692.m5658((int) r3, (long) r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.m10052(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = o.C2509.m13280(r1, r5)
            int r3 = o.C0692.m5634((int) r3, (long) r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.m10052(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = o.C0692.m5662((int) r3, (float) r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.m10052(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = o.C0692.m5661((int) r3, (double) r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            o.Џ<?, ?> r2 = r0.f9314
            int r1 = m10043(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = f9302
            r3 = -1
            r3 = 0
            r5 = 0
            r6 = -1
            r12 = 0
        L_0x04f9:
            int[] r13 = r0.f9306
            int r13 = r13.length
            if (r3 >= r13) goto L_0x0a39
            int r13 = r0.m10047((int) r3)
            int[] r14 = r0.f9306
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x0525
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r18 = r11 >>> 20
            int r18 = r8 << r18
            if (r14 == r6) goto L_0x0522
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            goto L_0x0523
        L_0x0522:
            r14 = r6
        L_0x0523:
            r6 = r14
            goto L_0x0545
        L_0x0525:
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x0542
            o.ƚј r8 = o.C0752.DOUBLE_LIST_PACKED
            int r8 = r8.m6002()
            if (r4 < r8) goto L_0x0542
            o.ƚј r8 = o.C0752.SINT64_LIST_PACKED
            int r8 = r8.m6002()
            if (r4 > r8) goto L_0x0542
            int[] r8 = r0.f9306
            int r9 = r3 + 2
            r8 = r8[r9]
            r11 = r8 & r7
            goto L_0x0543
        L_0x0542:
            r11 = 0
        L_0x0543:
            r18 = 0
        L_0x0545:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r4) {
                case 0: goto L_0x0a1e;
                case 1: goto L_0x0a0d;
                case 2: goto L_0x09fb;
                case 3: goto L_0x09ea;
                case 4: goto L_0x09d9;
                case 5: goto L_0x09cc;
                case 6: goto L_0x09bf;
                case 7: goto L_0x09b3;
                case 8: goto L_0x0997;
                case 9: goto L_0x0985;
                case 10: goto L_0x0976;
                case 11: goto L_0x0969;
                case 12: goto L_0x095c;
                case 13: goto L_0x0951;
                case 14: goto L_0x0946;
                case 15: goto L_0x0939;
                case 16: goto L_0x092c;
                case 17: goto L_0x0919;
                case 18: goto L_0x0905;
                case 19: goto L_0x08f5;
                case 20: goto L_0x08e9;
                case 21: goto L_0x08dd;
                case 22: goto L_0x08d1;
                case 23: goto L_0x08c5;
                case 24: goto L_0x08b9;
                case 25: goto L_0x08ad;
                case 26: goto L_0x08a2;
                case 27: goto L_0x0892;
                case 28: goto L_0x0886;
                case 29: goto L_0x0879;
                case 30: goto L_0x086c;
                case 31: goto L_0x085f;
                case 32: goto L_0x0852;
                case 33: goto L_0x0845;
                case 34: goto L_0x0838;
                case 35: goto L_0x0818;
                case 36: goto L_0x07fb;
                case 37: goto L_0x07de;
                case 38: goto L_0x07c1;
                case 39: goto L_0x07a3;
                case 40: goto L_0x0785;
                case 41: goto L_0x0767;
                case 42: goto L_0x0749;
                case 43: goto L_0x072b;
                case 44: goto L_0x070d;
                case 45: goto L_0x06ef;
                case 46: goto L_0x06d1;
                case 47: goto L_0x06b3;
                case 48: goto L_0x0695;
                case 49: goto L_0x0685;
                case 50: goto L_0x0675;
                case 51: goto L_0x0667;
                case 52: goto L_0x065a;
                case 53: goto L_0x064a;
                case 54: goto L_0x063a;
                case 55: goto L_0x062a;
                case 56: goto L_0x061c;
                case 57: goto L_0x060f;
                case 58: goto L_0x0602;
                case 59: goto L_0x05e4;
                case 60: goto L_0x05d0;
                case 61: goto L_0x05be;
                case 62: goto L_0x05ae;
                case 63: goto L_0x059e;
                case 64: goto L_0x0591;
                case 65: goto L_0x0583;
                case 66: goto L_0x0573;
                case 67: goto L_0x0563;
                case 68: goto L_0x054d;
                default: goto L_0x054b;
            }
        L_0x054b:
            goto L_0x0911
        L_0x054d:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            o.ʋΙ r4 = (o.C1637) r4
            o.ιɤ r8 = r0.m10045((int) r3)
            int r4 = o.C0692.m5650(r15, r4, r8)
            goto L_0x0910
        L_0x0563:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m10044(r1, (long) r8)
            int r4 = o.C0692.m5680((int) r15, (long) r8)
            goto L_0x0910
        L_0x0573:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m10054(r1, (long) r8)
            int r4 = o.C0692.m5655(r15, r4)
            goto L_0x0910
        L_0x0583:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = o.C0692.m5676((int) r15, (long) r8)
            goto L_0x0910
        L_0x0591:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = o.C0692.m5640(r15, r4)
            goto L_0x095a
        L_0x059e:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m10054(r1, (long) r8)
            int r4 = o.C0692.m5653(r15, r4)
            goto L_0x0910
        L_0x05ae:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m10054(r1, (long) r8)
            int r4 = o.C0692.m5675((int) r15, (int) r4)
            goto L_0x0910
        L_0x05be:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            o.ŀɺ r4 = (o.C0510) r4
            int r4 = o.C0692.m5648((int) r15, (o.C0510) r4)
            goto L_0x0910
        L_0x05d0:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            o.ιɤ r8 = r0.m10045((int) r3)
            int r4 = o.C2092.m11128((int) r15, (java.lang.Object) r4, (o.C1990) r8)
            goto L_0x0910
        L_0x05e4:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof o.C0510
            if (r8 == 0) goto L_0x05fa
            o.ŀɺ r4 = (o.C0510) r4
            int r4 = o.C0692.m5648((int) r15, (o.C0510) r4)
            goto L_0x0910
        L_0x05fa:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = o.C0692.m5663((int) r15, (java.lang.String) r4)
            goto L_0x0910
        L_0x0602:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            r4 = 1
            int r8 = o.C0692.m5666((int) r15, (boolean) r4)
            goto L_0x095a
        L_0x060f:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = o.C0692.m5679((int) r15, (int) r4)
            goto L_0x095a
        L_0x061c:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = o.C0692.m5672((int) r15, (long) r8)
            goto L_0x0910
        L_0x062a:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            int r4 = m10054(r1, (long) r8)
            int r4 = o.C0692.m5671((int) r15, (int) r4)
            goto L_0x0910
        L_0x063a:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m10044(r1, (long) r8)
            int r4 = o.C0692.m5658((int) r15, (long) r8)
            goto L_0x0910
        L_0x064a:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            long r8 = m10044(r1, (long) r8)
            int r4 = o.C0692.m5634((int) r15, (long) r8)
            goto L_0x0910
        L_0x065a:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = o.C0692.m5662((int) r15, (float) r4)
            goto L_0x095a
        L_0x0667:
            boolean r4 = r0.m10040(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = o.C0692.m5661((int) r15, (double) r8)
            goto L_0x0910
        L_0x0675:
            o.ɽӀ r4 = r0.f9304
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.m10036((int) r3)
            int r4 = r4.m8990(r15, r8, r9)
            goto L_0x0910
        L_0x0685:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            o.ιɤ r8 = r0.m10045((int) r3)
            int r4 = o.C2092.m11160((int) r15, (java.util.List<o.C1637>) r4, (o.C1990) r8)
            goto L_0x0910
        L_0x0695:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11169((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x06a9
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06a9:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x06b3:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11181(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x06c7
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06c7:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x06d1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11138(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x06e5
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x06e5:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x06ef:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11178(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x0703
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0703:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x070d:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11162(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x0721
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0721:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x072b:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11175(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x073f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x073f:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x0749:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11157(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x075d
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x075d:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x0767:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11178(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x077b
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x077b:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x0785:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11138(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x0799
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x0799:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x07a3:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11151(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x07b7
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07b7:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x07c1:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11130((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x07d5
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07d5:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x07de:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11143(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x07f2
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x07f2:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x07fb:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11178(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x080f
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x080f:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
            goto L_0x0834
        L_0x0818:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11138(r4)
            if (r4 <= 0) goto L_0x0911
            boolean r8 = r0.f9307
            if (r8 == 0) goto L_0x082c
            long r8 = (long) r11
            r2.putInt(r1, r8, r4)
        L_0x082c:
            int r8 = o.C0692.m5647((int) r15)
            int r9 = o.C0692.m5639((int) r4)
        L_0x0834:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x095a
        L_0x0838:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = o.C2092.m11161((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r10)
            goto L_0x0900
        L_0x0845:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11137(r15, r4, r10)
            goto L_0x0900
        L_0x0852:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11156(r15, r4, r10)
            goto L_0x0900
        L_0x085f:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11177(r15, r4, r10)
            goto L_0x0900
        L_0x086c:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11168(r15, r4, r10)
            goto L_0x0900
        L_0x0879:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11180(r15, r4, r10)
            goto L_0x0910
        L_0x0886:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11140(r15, r4)
            goto L_0x0910
        L_0x0892:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            o.ιɤ r8 = r0.m10045((int) r3)
            int r4 = o.C2092.m11141((int) r15, (java.util.List<?>) r4, (o.C1990) r8)
            goto L_0x0910
        L_0x08a2:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11159((int) r15, (java.util.List<?>) r4)
            goto L_0x0910
        L_0x08ad:
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            r10 = 0
            int r4 = o.C2092.m11174(r15, r4, r10)
            goto L_0x0900
        L_0x08b9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11177(r15, r4, r10)
            goto L_0x0900
        L_0x08c5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11156(r15, r4, r10)
            goto L_0x0900
        L_0x08d1:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11129((int) r15, (java.util.List<java.lang.Integer>) r4, (boolean) r10)
            goto L_0x0900
        L_0x08dd:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11142((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r10)
            goto L_0x0900
        L_0x08e9:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11150(r15, r4, r10)
            goto L_0x0900
        L_0x08f5:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11177(r15, r4, r10)
        L_0x0900:
            int r5 = r5 + r4
            r4 = 1
        L_0x0902:
            r7 = 0
            goto L_0x0915
        L_0x0905:
            r10 = 0
            java.lang.Object r4 = r2.getObject(r1, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = o.C2092.m11156(r15, r4, r10)
        L_0x0910:
            int r5 = r5 + r4
        L_0x0911:
            r4 = 1
        L_0x0912:
            r7 = 0
            r10 = 0
        L_0x0915:
            r13 = 0
            goto L_0x0a2e
        L_0x0919:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            o.ʋΙ r4 = (o.C1637) r4
            o.ιɤ r8 = r0.m10045((int) r3)
            int r4 = o.C0692.m5650(r15, r4, r8)
            goto L_0x0910
        L_0x092c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            long r8 = r2.getLong(r1, r8)
            int r4 = o.C0692.m5680((int) r15, (long) r8)
            goto L_0x0910
        L_0x0939:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = o.C0692.m5655(r15, r4)
            goto L_0x0910
        L_0x0946:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r8 = 0
            int r4 = o.C0692.m5676((int) r15, (long) r8)
            goto L_0x0910
        L_0x0951:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r4 = 0
            int r8 = o.C0692.m5640(r15, r4)
        L_0x095a:
            int r5 = r5 + r8
            goto L_0x0911
        L_0x095c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = o.C0692.m5653(r15, r4)
            goto L_0x0910
        L_0x0969:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            int r4 = r2.getInt(r1, r8)
            int r4 = o.C0692.m5675((int) r15, (int) r4)
            goto L_0x0910
        L_0x0976:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            o.ŀɺ r4 = (o.C0510) r4
            int r4 = o.C0692.m5648((int) r15, (o.C0510) r4)
            goto L_0x0910
        L_0x0985:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            o.ιɤ r8 = r0.m10045((int) r3)
            int r4 = o.C2092.m11128((int) r15, (java.lang.Object) r4, (o.C1990) r8)
            goto L_0x0910
        L_0x0997:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            java.lang.Object r4 = r2.getObject(r1, r8)
            boolean r8 = r4 instanceof o.C0510
            if (r8 == 0) goto L_0x09ab
            o.ŀɺ r4 = (o.C0510) r4
            int r4 = o.C0692.m5648((int) r15, (o.C0510) r4)
            goto L_0x0910
        L_0x09ab:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = o.C0692.m5663((int) r15, (java.lang.String) r4)
            goto L_0x0910
        L_0x09b3:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0911
            r4 = 1
            int r8 = o.C0692.m5666((int) r15, (boolean) r4)
            int r5 = r5 + r8
            goto L_0x0912
        L_0x09bf:
            r4 = 1
            r8 = r12 & r18
            r10 = 0
            if (r8 == 0) goto L_0x0902
            int r8 = o.C0692.m5679((int) r15, (int) r10)
            int r5 = r5 + r8
            goto L_0x0902
        L_0x09cc:
            r4 = 1
            r10 = 0
            r8 = r12 & r18
            r13 = 0
            if (r8 == 0) goto L_0x0a1b
            int r8 = o.C0692.m5672((int) r15, (long) r13)
            goto L_0x0a0b
        L_0x09d9:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            int r8 = r2.getInt(r1, r8)
            int r8 = o.C0692.m5671((int) r15, (int) r8)
            goto L_0x0a0b
        L_0x09ea:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            long r8 = r2.getLong(r1, r8)
            int r8 = o.C0692.m5658((int) r15, (long) r8)
            goto L_0x0a0b
        L_0x09fb:
            r4 = 1
            r10 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a1b
            long r8 = r2.getLong(r1, r8)
            int r8 = o.C0692.m5634((int) r15, (long) r8)
        L_0x0a0b:
            int r5 = r5 + r8
            goto L_0x0a1b
        L_0x0a0d:
            r4 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r18
            if (r8 == 0) goto L_0x0a1b
            r8 = 0
            int r9 = o.C0692.m5662((int) r15, (float) r8)
            int r5 = r5 + r9
        L_0x0a1b:
            r7 = 0
            goto L_0x0a2e
        L_0x0a1e:
            r4 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0a1b
            r7 = 0
            int r11 = o.C0692.m5661((int) r15, (double) r7)
            int r5 = r5 + r11
        L_0x0a2e:
            int r3 = r3 + 3
            r9 = r13
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r11 = 0
            goto L_0x04f9
        L_0x0a39:
            r10 = 0
            o.Џ<?, ?> r2 = r0.f9314
            int r2 = m10043(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f9319
            if (r2 == 0) goto L_0x0a93
            o.ƚɺ<?> r2 = r0.f9317
            o.ƭǃ r1 = r2.m5922(r1)
            r2 = 0
        L_0x0a4c:
            o.ιє<T, java.lang.Object> r3 = r1.f5255
            int r3 = r3.m10979()
            if (r10 >= r3) goto L_0x0a6c
            o.ιє<T, java.lang.Object> r3 = r1.f5255
            java.util.Map$Entry r3 = r3.m10980((int) r10)
            java.lang.Object r4 = r3.getKey()
            o.ƚЈ r4 = (o.C0750) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = o.C0790.m6148(r4, r3)
            int r2 = r2 + r3
            int r10 = r10 + 1
            goto L_0x0a4c
        L_0x0a6c:
            o.ιє<T, java.lang.Object> r1 = r1.f5255
            java.lang.Iterable r1 = r1.m10982()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a76:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0a92
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            o.ƚЈ r4 = (o.C0750) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = o.C0790.m6148(r4, r3)
            int r2 = r2 + r3
            goto L_0x0a76
        L_0x0a92:
            int r5 = r5 + r2
        L_0x0a93:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10073(java.lang.Object):int");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static <UT, UB> int m10043(C2342<UT, UB> r0, T t) {
        return r0.m12225(r0.m12218(t));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static List<?> m10049(Object obj, long j) {
        return (List) C2509.m13271(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2b  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10069(T r14, o.C2867 r15) {
        /*
            r13 = this;
            int r0 = r15.m14895()
            int r1 = o.C0987.If.f6018
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            o.Џ<?, ?> r0 = r13.f9314
            m10051(r0, r14, r15)
            boolean r0 = r13.f9319
            if (r0 == 0) goto L_0x0032
            o.ƚɺ<?> r0 = r13.f9317
            o.ƭǃ r0 = r0.m5922(r14)
            o.ιє<T, java.lang.Object> r1 = r0.f5255
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.m6162()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.f9306
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.m10047((int) r7)
            int[] r9 = r13.f9306
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            o.ƚɺ<?> r10 = r13.f9317
            int r10 = r10.m5918((java.util.Map.Entry<?, ?>) r1)
            if (r10 <= r9) goto L_0x0061
            o.ƚɺ<?> r10 = r13.f9317
            r10.m5927(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            o.ιɤ r10 = r13.m10045((int) r7)
            r15.m14883((int) r9, (java.lang.Object) r8, (o.C1990) r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m10044(r14, (long) r10)
            r15.m14882((int) r9, (long) r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m10054(r14, (long) r10)
            r15.m14905(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m10044(r14, (long) r10)
            r15.m14898((int) r9, (long) r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m10054(r14, (long) r10)
            r15.m14881((int) r9, (int) r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m10054(r14, (long) r10)
            r15.m14868((int) r9, (int) r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m10054(r14, (long) r10)
            r15.m14873((int) r9, (int) r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            o.ŀɺ r8 = (o.C0510) r8
            r15.m14902((int) r9, (o.C0510) r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            o.ιɤ r10 = r13.m10045((int) r7)
            r15.m14899((int) r9, (java.lang.Object) r8, (o.C1990) r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            m10038((int) r9, (java.lang.Object) r8, (o.C2867) r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m10066(r14, r10)
            r15.m14903((int) r9, (boolean) r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m10054(r14, (long) r10)
            r15.m14889((int) r9, (int) r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m10044(r14, (long) r10)
            r15.m14874((int) r9, (long) r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m10054(r14, (long) r10)
            r15.m14897((int) r9, (int) r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m10044(r14, (long) r10)
            r15.m14869((int) r9, (long) r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m10044(r14, (long) r10)
            r15.m14890((int) r9, (long) r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m10033(r14, r10)
            r15.m14896((int) r9, (float) r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.m10040(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m10029(r14, (long) r10)
            r15.m14880((int) r9, (double) r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            r13.m10032(r15, r9, r8, r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.ιɤ r10 = r13.m10045((int) r7)
            o.C2092.m11134((int) r9, (java.util.List<?>) r8, (o.C2867) r15, (o.C1990) r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11165(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11179(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11182(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11149(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11155(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11176(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11183(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11148(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11158(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11139(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11172((int) r9, (java.util.List<java.lang.Long>) r8, (o.C2867) r15, (boolean) r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11154((int) r9, (java.util.List<java.lang.Long>) r8, (o.C2867) r15, (boolean) r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11146(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11135((int) r9, (java.util.List<java.lang.Double>) r8, (o.C2867) r15, (boolean) r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11165(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11179(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11182(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11149(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11155(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11176(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11164((int) r9, (java.util.List<o.C0510>) r8, (o.C2867) r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.ιɤ r10 = r13.m10045((int) r7)
            o.C2092.m11171((int) r9, (java.util.List<?>) r8, (o.C2867) r15, (o.C1990) r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11145((int) r9, (java.util.List<java.lang.String>) r8, (o.C2867) r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11183(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11148(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11158(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11139(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11172((int) r9, (java.util.List<java.lang.Long>) r8, (o.C2867) r15, (boolean) r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11154((int) r9, (java.util.List<java.lang.Long>) r8, (o.C2867) r15, (boolean) r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11146(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.f9306
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            java.util.List r8 = (java.util.List) r8
            o.C2092.m11135((int) r9, (java.util.List<java.lang.Double>) r8, (o.C2867) r15, (boolean) r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            o.ιɤ r10 = r13.m10045((int) r7)
            r15.m14883((int) r9, (java.lang.Object) r8, (o.C1990) r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = o.C2509.m13280(r14, r10)
            r15.m14882((int) r9, (long) r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = o.C2509.m13273((java.lang.Object) r14, (long) r10)
            r15.m14905(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = o.C2509.m13280(r14, r10)
            r15.m14898((int) r9, (long) r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = o.C2509.m13273((java.lang.Object) r14, (long) r10)
            r15.m14881((int) r9, (int) r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = o.C2509.m13273((java.lang.Object) r14, (long) r10)
            r15.m14868((int) r9, (int) r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = o.C2509.m13273((java.lang.Object) r14, (long) r10)
            r15.m14873((int) r9, (int) r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            o.ŀɺ r8 = (o.C0510) r8
            r15.m14902((int) r9, (o.C0510) r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            o.ιɤ r10 = r13.m10045((int) r7)
            r15.m14899((int) r9, (java.lang.Object) r8, (o.C1990) r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = o.C2509.m13271(r14, r10)
            m10038((int) r9, (java.lang.Object) r8, (o.C2867) r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = o.C2509.m13270((java.lang.Object) r14, (long) r10)
            r15.m14903((int) r9, (boolean) r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = o.C2509.m13273((java.lang.Object) r14, (long) r10)
            r15.m14889((int) r9, (int) r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = o.C2509.m13280(r14, r10)
            r15.m14874((int) r9, (long) r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = o.C2509.m13273((java.lang.Object) r14, (long) r10)
            r15.m14897((int) r9, (int) r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = o.C2509.m13280(r14, r10)
            r15.m14869((int) r9, (long) r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = o.C2509.m13280(r14, r10)
            r15.m14890((int) r9, (long) r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = o.C2509.m13293(r14, r10)
            r15.m14896((int) r9, (float) r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.m10052(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = o.C2509.m13287(r14, r10)
            r15.m14880((int) r9, (double) r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            o.ƚɺ<?> r14 = r13.f9317
            r14.m5927(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.f9311
            if (r0 == 0) goto L_0x0a46
            boolean r0 = r13.f9319
            if (r0 == 0) goto L_0x054a
            o.ƚɺ<?> r0 = r13.f9317
            o.ƭǃ r0 = r0.m5922(r14)
            o.ιє<T, java.lang.Object> r1 = r0.f5255
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.m6164()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.f9306
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x0551:
            if (r1 >= r7) goto L_0x0a29
            int r9 = r13.m10047((int) r1)
            int[] r10 = r13.f9306
            r10 = r10[r1]
        L_0x055b:
            if (r8 == 0) goto L_0x0579
            o.ƚɺ<?> r11 = r13.f9317
            int r11 = r11.m5918((java.util.Map.Entry<?, ?>) r8)
            if (r11 > r10) goto L_0x0579
            o.ƚɺ<?> r11 = r13.f9317
            r11.m5927(r15, r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0577
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x055b
        L_0x0577:
            r8 = r3
            goto L_0x055b
        L_0x0579:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a16;
                case 1: goto L_0x0a06;
                case 2: goto L_0x09f6;
                case 3: goto L_0x09e6;
                case 4: goto L_0x09d6;
                case 5: goto L_0x09c6;
                case 6: goto L_0x09b6;
                case 7: goto L_0x09a5;
                case 8: goto L_0x0994;
                case 9: goto L_0x097f;
                case 10: goto L_0x096c;
                case 11: goto L_0x095b;
                case 12: goto L_0x094a;
                case 13: goto L_0x0939;
                case 14: goto L_0x0928;
                case 15: goto L_0x0917;
                case 16: goto L_0x0906;
                case 17: goto L_0x08f1;
                case 18: goto L_0x08e0;
                case 19: goto L_0x08cf;
                case 20: goto L_0x08be;
                case 21: goto L_0x08ad;
                case 22: goto L_0x089c;
                case 23: goto L_0x088b;
                case 24: goto L_0x087a;
                case 25: goto L_0x0869;
                case 26: goto L_0x0858;
                case 27: goto L_0x0843;
                case 28: goto L_0x0832;
                case 29: goto L_0x0821;
                case 30: goto L_0x0810;
                case 31: goto L_0x07ff;
                case 32: goto L_0x07ee;
                case 33: goto L_0x07dd;
                case 34: goto L_0x07cc;
                case 35: goto L_0x07bb;
                case 36: goto L_0x07aa;
                case 37: goto L_0x0799;
                case 38: goto L_0x0788;
                case 39: goto L_0x0777;
                case 40: goto L_0x0766;
                case 41: goto L_0x0755;
                case 42: goto L_0x0744;
                case 43: goto L_0x0733;
                case 44: goto L_0x0722;
                case 45: goto L_0x0711;
                case 46: goto L_0x0700;
                case 47: goto L_0x06ef;
                case 48: goto L_0x06de;
                case 49: goto L_0x06c9;
                case 50: goto L_0x06be;
                case 51: goto L_0x06ad;
                case 52: goto L_0x069c;
                case 53: goto L_0x068b;
                case 54: goto L_0x067a;
                case 55: goto L_0x0669;
                case 56: goto L_0x0658;
                case 57: goto L_0x0647;
                case 58: goto L_0x0636;
                case 59: goto L_0x0625;
                case 60: goto L_0x0610;
                case 61: goto L_0x05fd;
                case 62: goto L_0x05ec;
                case 63: goto L_0x05db;
                case 64: goto L_0x05ca;
                case 65: goto L_0x05b9;
                case 66: goto L_0x05a8;
                case 67: goto L_0x0597;
                case 68: goto L_0x0582;
                default: goto L_0x0580;
            }
        L_0x0580:
            goto L_0x0a25
        L_0x0582:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            o.ιɤ r11 = r13.m10045((int) r1)
            r15.m14883((int) r10, (java.lang.Object) r9, (o.C1990) r11)
            goto L_0x0a25
        L_0x0597:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m10044(r14, (long) r11)
            r15.m14882((int) r10, (long) r11)
            goto L_0x0a25
        L_0x05a8:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m10054(r14, (long) r11)
            r15.m14905(r10, r9)
            goto L_0x0a25
        L_0x05b9:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m10044(r14, (long) r11)
            r15.m14898((int) r10, (long) r11)
            goto L_0x0a25
        L_0x05ca:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m10054(r14, (long) r11)
            r15.m14881((int) r10, (int) r9)
            goto L_0x0a25
        L_0x05db:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m10054(r14, (long) r11)
            r15.m14868((int) r10, (int) r9)
            goto L_0x0a25
        L_0x05ec:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m10054(r14, (long) r11)
            r15.m14873((int) r10, (int) r9)
            goto L_0x0a25
        L_0x05fd:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            o.ŀɺ r9 = (o.C0510) r9
            r15.m14902((int) r10, (o.C0510) r9)
            goto L_0x0a25
        L_0x0610:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            o.ιɤ r11 = r13.m10045((int) r1)
            r15.m14899((int) r10, (java.lang.Object) r9, (o.C1990) r11)
            goto L_0x0a25
        L_0x0625:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            m10038((int) r10, (java.lang.Object) r9, (o.C2867) r15)
            goto L_0x0a25
        L_0x0636:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m10066(r14, r11)
            r15.m14903((int) r10, (boolean) r9)
            goto L_0x0a25
        L_0x0647:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m10054(r14, (long) r11)
            r15.m14889((int) r10, (int) r9)
            goto L_0x0a25
        L_0x0658:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m10044(r14, (long) r11)
            r15.m14874((int) r10, (long) r11)
            goto L_0x0a25
        L_0x0669:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m10054(r14, (long) r11)
            r15.m14897((int) r10, (int) r9)
            goto L_0x0a25
        L_0x067a:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m10044(r14, (long) r11)
            r15.m14869((int) r10, (long) r11)
            goto L_0x0a25
        L_0x068b:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m10044(r14, (long) r11)
            r15.m14890((int) r10, (long) r11)
            goto L_0x0a25
        L_0x069c:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m10033(r14, r11)
            r15.m14896((int) r10, (float) r9)
            goto L_0x0a25
        L_0x06ad:
            boolean r11 = r13.m10040(r14, (int) r10, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m10029(r14, (long) r11)
            r15.m14880((int) r10, (double) r11)
            goto L_0x0a25
        L_0x06be:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            r13.m10032(r15, r10, r9, r1)
            goto L_0x0a25
        L_0x06c9:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.ιɤ r11 = r13.m10045((int) r1)
            o.C2092.m11134((int) r10, (java.util.List<?>) r9, (o.C2867) r15, (o.C1990) r11)
            goto L_0x0a25
        L_0x06de:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11165(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x06ef:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11179(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0700:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11182(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0711:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11149(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0722:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11155(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0733:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11176(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0744:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11183(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0755:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11148(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0766:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11158(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0777:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11139(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x0788:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11172((int) r10, (java.util.List<java.lang.Long>) r9, (o.C2867) r15, (boolean) r4)
            goto L_0x0a25
        L_0x0799:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11154((int) r10, (java.util.List<java.lang.Long>) r9, (o.C2867) r15, (boolean) r4)
            goto L_0x0a25
        L_0x07aa:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11146(r10, r9, r15, r4)
            goto L_0x0a25
        L_0x07bb:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11135((int) r10, (java.util.List<java.lang.Double>) r9, (o.C2867) r15, (boolean) r4)
            goto L_0x0a25
        L_0x07cc:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11165(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07dd:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11179(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07ee:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11182(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x07ff:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11149(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0810:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11155(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0821:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11176(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x0832:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11164((int) r10, (java.util.List<o.C0510>) r9, (o.C2867) r15)
            goto L_0x0a25
        L_0x0843:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.ιɤ r11 = r13.m10045((int) r1)
            o.C2092.m11171((int) r10, (java.util.List<?>) r9, (o.C2867) r15, (o.C1990) r11)
            goto L_0x0a25
        L_0x0858:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11145((int) r10, (java.util.List<java.lang.String>) r9, (o.C2867) r15)
            goto L_0x0a25
        L_0x0869:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11183(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x087a:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11148(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x088b:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11158(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x089c:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11139(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08ad:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11172((int) r10, (java.util.List<java.lang.Long>) r9, (o.C2867) r15, (boolean) r5)
            goto L_0x0a25
        L_0x08be:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11154((int) r10, (java.util.List<java.lang.Long>) r9, (o.C2867) r15, (boolean) r5)
            goto L_0x0a25
        L_0x08cf:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11146(r10, r9, r15, r5)
            goto L_0x0a25
        L_0x08e0:
            int[] r10 = r13.f9306
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11135((int) r10, (java.util.List<java.lang.Double>) r9, (o.C2867) r15, (boolean) r5)
            goto L_0x0a25
        L_0x08f1:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            o.ιɤ r11 = r13.m10045((int) r1)
            r15.m14883((int) r10, (java.lang.Object) r9, (o.C1990) r11)
            goto L_0x0a25
        L_0x0906:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = o.C2509.m13280(r14, r11)
            r15.m14882((int) r10, (long) r11)
            goto L_0x0a25
        L_0x0917:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = o.C2509.m13273((java.lang.Object) r14, (long) r11)
            r15.m14905(r10, r9)
            goto L_0x0a25
        L_0x0928:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = o.C2509.m13280(r14, r11)
            r15.m14898((int) r10, (long) r11)
            goto L_0x0a25
        L_0x0939:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = o.C2509.m13273((java.lang.Object) r14, (long) r11)
            r15.m14881((int) r10, (int) r9)
            goto L_0x0a25
        L_0x094a:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = o.C2509.m13273((java.lang.Object) r14, (long) r11)
            r15.m14868((int) r10, (int) r9)
            goto L_0x0a25
        L_0x095b:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = o.C2509.m13273((java.lang.Object) r14, (long) r11)
            r15.m14873((int) r10, (int) r9)
            goto L_0x0a25
        L_0x096c:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            o.ŀɺ r9 = (o.C0510) r9
            r15.m14902((int) r10, (o.C0510) r9)
            goto L_0x0a25
        L_0x097f:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            o.ιɤ r11 = r13.m10045((int) r1)
            r15.m14899((int) r10, (java.lang.Object) r9, (o.C1990) r11)
            goto L_0x0a25
        L_0x0994:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = o.C2509.m13271(r14, r11)
            m10038((int) r10, (java.lang.Object) r9, (o.C2867) r15)
            goto L_0x0a25
        L_0x09a5:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = o.C2509.m13270((java.lang.Object) r14, (long) r11)
            r15.m14903((int) r10, (boolean) r9)
            goto L_0x0a25
        L_0x09b6:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = o.C2509.m13273((java.lang.Object) r14, (long) r11)
            r15.m14889((int) r10, (int) r9)
            goto L_0x0a25
        L_0x09c6:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = o.C2509.m13280(r14, r11)
            r15.m14874((int) r10, (long) r11)
            goto L_0x0a25
        L_0x09d6:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = o.C2509.m13273((java.lang.Object) r14, (long) r11)
            r15.m14897((int) r10, (int) r9)
            goto L_0x0a25
        L_0x09e6:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = o.C2509.m13280(r14, r11)
            r15.m14869((int) r10, (long) r11)
            goto L_0x0a25
        L_0x09f6:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = o.C2509.m13280(r14, r11)
            r15.m14890((int) r10, (long) r11)
            goto L_0x0a25
        L_0x0a06:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = o.C2509.m13293(r14, r11)
            r15.m14896((int) r10, (float) r9)
            goto L_0x0a25
        L_0x0a16:
            boolean r11 = r13.m10052(r14, (int) r1)
            if (r11 == 0) goto L_0x0a25
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = o.C2509.m13287(r14, r11)
            r15.m14880((int) r10, (double) r11)
        L_0x0a25:
            int r1 = r1 + 3
            goto L_0x0551
        L_0x0a29:
            if (r8 == 0) goto L_0x0a40
            o.ƚɺ<?> r1 = r13.f9317
            r1.m5927(r15, r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0a29
        L_0x0a3e:
            r8 = r3
            goto L_0x0a29
        L_0x0a40:
            o.Џ<?, ?> r0 = r13.f9314
            m10051(r0, r14, r15)
            return
        L_0x0a46:
            r13.m10063(r14, (o.C2867) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10069(java.lang.Object, o.ӌı):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10063(T r19, o.C2867 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f9319
            if (r3 == 0) goto L_0x0023
            o.ƚɺ<?> r3 = r0.f9317
            o.ƭǃ r3 = r3.m5922(r1)
            o.ιє<T, java.lang.Object> r5 = r3.f5255
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.m6164()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            r6 = -1
            int[] r7 = r0.f9306
            int r7 = r7.length
            sun.misc.Unsafe r8 = f9302
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002e:
            if (r5 >= r7) goto L_0x04ad
            int r12 = r0.m10047((int) r5)
            int[] r13 = r0.f9306
            r14 = r13[r5]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f9311
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x0062
            r4 = 17
            if (r15 > r4) goto L_0x0062
            int r4 = r5 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0058
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            goto L_0x0059
        L_0x0058:
            r13 = r6
        L_0x0059:
            int r4 = r4 >>> 20
            r6 = 1
            int r9 = r6 << r4
            r6 = r13
            r10 = r17
            goto L_0x0067
        L_0x0062:
            r17 = r10
            r10 = r17
            r9 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x0086
            o.ƚɺ<?> r4 = r0.f9317
            int r4 = r4.m5918((java.util.Map.Entry<?, ?>) r10)
            if (r4 > r14) goto L_0x0086
            o.ƚɺ<?> r4 = r0.f9317
            r4.m5927(r2, r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0067
        L_0x0084:
            r10 = 0
            goto L_0x0067
        L_0x0086:
            r4 = r12 & r16
            long r12 = (long) r4
            switch(r15) {
                case 0: goto L_0x049d;
                case 1: goto L_0x0490;
                case 2: goto L_0x0483;
                case 3: goto L_0x0476;
                case 4: goto L_0x0469;
                case 5: goto L_0x045c;
                case 6: goto L_0x044f;
                case 7: goto L_0x0442;
                case 8: goto L_0x0434;
                case 9: goto L_0x0422;
                case 10: goto L_0x0412;
                case 11: goto L_0x0404;
                case 12: goto L_0x03f6;
                case 13: goto L_0x03e8;
                case 14: goto L_0x03da;
                case 15: goto L_0x03cc;
                case 16: goto L_0x03be;
                case 17: goto L_0x03ac;
                case 18: goto L_0x039c;
                case 19: goto L_0x038c;
                case 20: goto L_0x037c;
                case 21: goto L_0x036c;
                case 22: goto L_0x035c;
                case 23: goto L_0x034c;
                case 24: goto L_0x033c;
                case 25: goto L_0x032c;
                case 26: goto L_0x031d;
                case 27: goto L_0x030a;
                case 28: goto L_0x02fb;
                case 29: goto L_0x02eb;
                case 30: goto L_0x02db;
                case 31: goto L_0x02cb;
                case 32: goto L_0x02bb;
                case 33: goto L_0x02ab;
                case 34: goto L_0x029b;
                case 35: goto L_0x028b;
                case 36: goto L_0x027b;
                case 37: goto L_0x026b;
                case 38: goto L_0x025b;
                case 39: goto L_0x024b;
                case 40: goto L_0x023b;
                case 41: goto L_0x022b;
                case 42: goto L_0x021b;
                case 43: goto L_0x020b;
                case 44: goto L_0x01fb;
                case 45: goto L_0x01eb;
                case 46: goto L_0x01db;
                case 47: goto L_0x01cb;
                case 48: goto L_0x01bb;
                case 49: goto L_0x01a8;
                case 50: goto L_0x019f;
                case 51: goto L_0x0190;
                case 52: goto L_0x0181;
                case 53: goto L_0x0172;
                case 54: goto L_0x0163;
                case 55: goto L_0x0154;
                case 56: goto L_0x0145;
                case 57: goto L_0x0136;
                case 58: goto L_0x0127;
                case 59: goto L_0x0118;
                case 60: goto L_0x0105;
                case 61: goto L_0x00f5;
                case 62: goto L_0x00e7;
                case 63: goto L_0x00d9;
                case 64: goto L_0x00cb;
                case 65: goto L_0x00bd;
                case 66: goto L_0x00af;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r15 = 0
            goto L_0x04a9
        L_0x008f:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            o.ιɤ r9 = r0.m10045((int) r5)
            r2.m14883((int) r14, (java.lang.Object) r4, (o.C1990) r9)
            goto L_0x008c
        L_0x00a1:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m10044(r1, (long) r12)
            r2.m14882((int) r14, (long) r12)
            goto L_0x008c
        L_0x00af:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m10054(r1, (long) r12)
            r2.m14905(r14, r4)
            goto L_0x008c
        L_0x00bd:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m10044(r1, (long) r12)
            r2.m14898((int) r14, (long) r12)
            goto L_0x008c
        L_0x00cb:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m10054(r1, (long) r12)
            r2.m14881((int) r14, (int) r4)
            goto L_0x008c
        L_0x00d9:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m10054(r1, (long) r12)
            r2.m14868((int) r14, (int) r4)
            goto L_0x008c
        L_0x00e7:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m10054(r1, (long) r12)
            r2.m14873((int) r14, (int) r4)
            goto L_0x008c
        L_0x00f5:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            o.ŀɺ r4 = (o.C0510) r4
            r2.m14902((int) r14, (o.C0510) r4)
            goto L_0x008c
        L_0x0105:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            o.ιɤ r9 = r0.m10045((int) r5)
            r2.m14899((int) r14, (java.lang.Object) r4, (o.C1990) r9)
            goto L_0x008c
        L_0x0118:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            m10038((int) r14, (java.lang.Object) r4, (o.C2867) r2)
            goto L_0x008c
        L_0x0127:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            boolean r4 = m10066(r1, r12)
            r2.m14903((int) r14, (boolean) r4)
            goto L_0x008c
        L_0x0136:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m10054(r1, (long) r12)
            r2.m14889((int) r14, (int) r4)
            goto L_0x008c
        L_0x0145:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m10044(r1, (long) r12)
            r2.m14874((int) r14, (long) r12)
            goto L_0x008c
        L_0x0154:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            int r4 = m10054(r1, (long) r12)
            r2.m14897((int) r14, (int) r4)
            goto L_0x008c
        L_0x0163:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m10044(r1, (long) r12)
            r2.m14869((int) r14, (long) r12)
            goto L_0x008c
        L_0x0172:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            long r12 = m10044(r1, (long) r12)
            r2.m14890((int) r14, (long) r12)
            goto L_0x008c
        L_0x0181:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            float r4 = m10033(r1, r12)
            r2.m14896((int) r14, (float) r4)
            goto L_0x008c
        L_0x0190:
            boolean r4 = r0.m10040(r1, (int) r14, (int) r5)
            if (r4 == 0) goto L_0x008c
            double r12 = m10029(r1, (long) r12)
            r2.m14880((int) r14, (double) r12)
            goto L_0x008c
        L_0x019f:
            java.lang.Object r4 = r8.getObject(r1, r12)
            r0.m10032(r2, r14, r4, r5)
            goto L_0x008c
        L_0x01a8:
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.ιɤ r12 = r0.m10045((int) r5)
            o.C2092.m11134((int) r4, (java.util.List<?>) r9, (o.C2867) r2, (o.C1990) r12)
            goto L_0x008c
        L_0x01bb:
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 1
            o.C2092.m11165(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01cb:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11179(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01db:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11182(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01eb:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11149(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01fb:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11155(r4, r9, r2, r14)
            goto L_0x008c
        L_0x020b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11176(r4, r9, r2, r14)
            goto L_0x008c
        L_0x021b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11183(r4, r9, r2, r14)
            goto L_0x008c
        L_0x022b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11148(r4, r9, r2, r14)
            goto L_0x008c
        L_0x023b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11158(r4, r9, r2, r14)
            goto L_0x008c
        L_0x024b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11139(r4, r9, r2, r14)
            goto L_0x008c
        L_0x025b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11172((int) r4, (java.util.List<java.lang.Long>) r9, (o.C2867) r2, (boolean) r14)
            goto L_0x008c
        L_0x026b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11154((int) r4, (java.util.List<java.lang.Long>) r9, (o.C2867) r2, (boolean) r14)
            goto L_0x008c
        L_0x027b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11146(r4, r9, r2, r14)
            goto L_0x008c
        L_0x028b:
            r14 = 1
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11135((int) r4, (java.util.List<java.lang.Double>) r9, (o.C2867) r2, (boolean) r14)
            goto L_0x008c
        L_0x029b:
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 0
            o.C2092.m11165(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02ab:
            r14 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11179(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02bb:
            r14 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11182(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02cb:
            r14 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11149(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02db:
            r14 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11155(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02eb:
            r14 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11176(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02fb:
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11164((int) r4, (java.util.List<o.C0510>) r9, (o.C2867) r2)
            goto L_0x008c
        L_0x030a:
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.ιɤ r12 = r0.m10045((int) r5)
            o.C2092.m11171((int) r4, (java.util.List<?>) r9, (o.C2867) r2, (o.C1990) r12)
            goto L_0x008c
        L_0x031d:
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11145((int) r4, (java.util.List<java.lang.String>) r9, (o.C2867) r2)
            goto L_0x008c
        L_0x032c:
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r15 = 0
            o.C2092.m11183(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x033c:
            r15 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11148(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x034c:
            r15 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11158(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x035c:
            r15 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11139(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x036c:
            r15 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11172((int) r4, (java.util.List<java.lang.Long>) r9, (o.C2867) r2, (boolean) r15)
            goto L_0x04a9
        L_0x037c:
            r15 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11154((int) r4, (java.util.List<java.lang.Long>) r9, (o.C2867) r2, (boolean) r15)
            goto L_0x04a9
        L_0x038c:
            r15 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11146(r4, r9, r2, r15)
            goto L_0x04a9
        L_0x039c:
            r15 = 0
            int[] r4 = r0.f9306
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            o.C2092.m11135((int) r4, (java.util.List<java.lang.Double>) r9, (o.C2867) r2, (boolean) r15)
            goto L_0x04a9
        L_0x03ac:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            o.ιɤ r9 = r0.m10045((int) r5)
            r2.m14883((int) r14, (java.lang.Object) r4, (o.C1990) r9)
            goto L_0x04a9
        L_0x03be:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.m14882((int) r14, (long) r12)
            goto L_0x04a9
        L_0x03cc:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.m14905(r14, r4)
            goto L_0x04a9
        L_0x03da:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.m14898((int) r14, (long) r12)
            goto L_0x04a9
        L_0x03e8:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.m14881((int) r14, (int) r4)
            goto L_0x04a9
        L_0x03f6:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.m14868((int) r14, (int) r4)
            goto L_0x04a9
        L_0x0404:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.m14873((int) r14, (int) r4)
            goto L_0x04a9
        L_0x0412:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            o.ŀɺ r4 = (o.C0510) r4
            r2.m14902((int) r14, (o.C0510) r4)
            goto L_0x04a9
        L_0x0422:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            o.ιɤ r9 = r0.m10045((int) r5)
            r2.m14899((int) r14, (java.lang.Object) r4, (o.C1990) r9)
            goto L_0x04a9
        L_0x0434:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r8.getObject(r1, r12)
            m10038((int) r14, (java.lang.Object) r4, (o.C2867) r2)
            goto L_0x04a9
        L_0x0442:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            boolean r4 = o.C2509.m13270((java.lang.Object) r1, (long) r12)
            r2.m14903((int) r14, (boolean) r4)
            goto L_0x04a9
        L_0x044f:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.m14889((int) r14, (int) r4)
            goto L_0x04a9
        L_0x045c:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.m14874((int) r14, (long) r12)
            goto L_0x04a9
        L_0x0469:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            int r4 = r8.getInt(r1, r12)
            r2.m14897((int) r14, (int) r4)
            goto L_0x04a9
        L_0x0476:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.m14869((int) r14, (long) r12)
            goto L_0x04a9
        L_0x0483:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            long r12 = r8.getLong(r1, r12)
            r2.m14890((int) r14, (long) r12)
            goto L_0x04a9
        L_0x0490:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            float r4 = o.C2509.m13293(r1, r12)
            r2.m14896((int) r14, (float) r4)
            goto L_0x04a9
        L_0x049d:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x04a9
            double r12 = o.C2509.m13287(r1, r12)
            r2.m14880((int) r14, (double) r12)
        L_0x04a9:
            int r5 = r5 + 3
            goto L_0x002e
        L_0x04ad:
            r17 = r10
            r4 = r17
        L_0x04b1:
            if (r4 == 0) goto L_0x04c7
            o.ƚɺ<?> r5 = r0.f9317
            r5.m5927(r2, r4)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04c5
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x04b1
        L_0x04c5:
            r4 = 0
            goto L_0x04b1
        L_0x04c7:
            o.Џ<?, ?> r3 = r0.f9314
            m10051(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10063(java.lang.Object, o.ӌı):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final <K, V> void m10032(C2867 r2, int i, Object obj, int i2) {
        if (obj != null) {
            r2.m14894(i, this.f9304.m8988(m10036(i2)), this.f9304.m8991(obj));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static <UT, UB> void m10051(C2342<UT, UB> r0, T t, C2867 r2) {
        r0.m12210(r0.m12218(t), r2);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10072(T r13, o.C2081 r14, o.C0705 r15) {
        /*
            r12 = this;
            if (r15 == 0) goto L_0x05de
            o.Џ<?, ?> r7 = r12.f9314
            o.ƚɺ<?> r8 = r12.f9317
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x0009:
            int r1 = r14.m11043()     // Catch:{ all -> 0x05c6 }
            int r2 = r12.m10067(r1)     // Catch:{ all -> 0x05c6 }
            if (r2 >= 0) goto L_0x0078
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.f9312
        L_0x001a:
            int r15 = r12.f9308
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.f9310
            r15 = r15[r14]
            java.lang.Object r10 = r12.m10056(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r7.m12223((java.lang.Object) r13, r10)
        L_0x002e:
            return
        L_0x002f:
            boolean r2 = r12.f9319     // Catch:{ all -> 0x05c6 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            o.ʋΙ r2 = r12.f9318     // Catch:{ all -> 0x05c6 }
            java.lang.Object r1 = r8.m5919(r15, r2, r1)     // Catch:{ all -> 0x05c6 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0044
            o.ƭǃ r0 = r8.m5921((java.lang.Object) r13)     // Catch:{ all -> 0x05c6 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.m5920(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x05c6 }
            r0 = r11
            goto L_0x0009
        L_0x0051:
            r7.m12211((o.C2081) r14)     // Catch:{ all -> 0x05c6 }
            if (r10 != 0) goto L_0x005b
            java.lang.Object r1 = r7.m12212(r13)     // Catch:{ all -> 0x05c6 }
            r10 = r1
        L_0x005b:
            boolean r1 = r7.m12224(r10, (o.C2081) r14)     // Catch:{ all -> 0x05c6 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f9312
        L_0x0063:
            int r15 = r12.f9308
            if (r14 >= r15) goto L_0x0072
            int[] r15 = r12.f9310
            r15 = r15[r14]
            java.lang.Object r10 = r12.m10056(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0063
        L_0x0072:
            if (r10 == 0) goto L_0x0077
            r7.m12223((java.lang.Object) r13, r10)
        L_0x0077:
            return
        L_0x0078:
            int r3 = r12.m10047((int) r2)     // Catch:{ all -> 0x05c6 }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0572;
                case 1: goto L_0x0563;
                case 2: goto L_0x0554;
                case 3: goto L_0x0545;
                case 4: goto L_0x0536;
                case 5: goto L_0x0527;
                case 6: goto L_0x0518;
                case 7: goto L_0x0509;
                case 8: goto L_0x0501;
                case 9: goto L_0x04d0;
                case 10: goto L_0x04c1;
                case 11: goto L_0x04b2;
                case 12: goto L_0x0490;
                case 13: goto L_0x0481;
                case 14: goto L_0x0472;
                case 15: goto L_0x0463;
                case 16: goto L_0x0454;
                case 17: goto L_0x0423;
                case 18: goto L_0x0415;
                case 19: goto L_0x0407;
                case 20: goto L_0x03f9;
                case 21: goto L_0x03eb;
                case 22: goto L_0x03dd;
                case 23: goto L_0x03cf;
                case 24: goto L_0x03c1;
                case 25: goto L_0x03b3;
                case 26: goto L_0x0391;
                case 27: goto L_0x037f;
                case 28: goto L_0x0371;
                case 29: goto L_0x0363;
                case 30: goto L_0x034e;
                case 31: goto L_0x0340;
                case 32: goto L_0x0332;
                case 33: goto L_0x0324;
                case 34: goto L_0x0316;
                case 35: goto L_0x0308;
                case 36: goto L_0x02fa;
                case 37: goto L_0x02ec;
                case 38: goto L_0x02de;
                case 39: goto L_0x02d0;
                case 40: goto L_0x02c2;
                case 41: goto L_0x02b4;
                case 42: goto L_0x02a6;
                case 43: goto L_0x0298;
                case 44: goto L_0x0283;
                case 45: goto L_0x0275;
                case 46: goto L_0x0267;
                case 47: goto L_0x0259;
                case 48: goto L_0x024b;
                case 49: goto L_0x0239;
                case 50: goto L_0x01f7;
                case 51: goto L_0x01e5;
                case 52: goto L_0x01d3;
                case 53: goto L_0x01c1;
                case 54: goto L_0x01af;
                case 55: goto L_0x019d;
                case 56: goto L_0x018b;
                case 57: goto L_0x0179;
                case 58: goto L_0x0167;
                case 59: goto L_0x015f;
                case 60: goto L_0x012e;
                case 61: goto L_0x0120;
                case 62: goto L_0x010e;
                case 63: goto L_0x00e9;
                case 64: goto L_0x00d7;
                case 65: goto L_0x00c5;
                case 66: goto L_0x00b3;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x0087;
            }
        L_0x0087:
            if (r10 != 0) goto L_0x0582
            java.lang.Object r1 = r7.m12214()     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0581
        L_0x008f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            o.ιɤ r5 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r5 = r14.m11015(r5, r15)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x00a1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11039()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x00b3:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            int r5 = r14.m11038()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x00c5:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11048()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x00d7:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            int r5 = r14.m11018()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x00e9:
            int r4 = r14.m11020()     // Catch:{ ɍɟ -> 0x059f }
            o.ɂӏ r6 = r12.m10058((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            if (r6 == 0) goto L_0x0100
            boolean r6 = r6.m7263(r4)     // Catch:{ ɍɟ -> 0x059f }
            if (r6 == 0) goto L_0x00fa
            goto L_0x0100
        L_0x00fa:
            java.lang.Object r10 = o.C2092.m11152((int) r1, (int) r4, r10, r7)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0100:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r5, (java.lang.Object) r3)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x010e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            int r5 = r14.m11028()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0120:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            o.ŀɺ r5 = r14.m11054()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x012e:
            boolean r4 = r12.m10040(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            if (r4 == 0) goto L_0x014a
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r5 = o.C2509.m13271(r13, r3)     // Catch:{ ɍɟ -> 0x059f }
            o.ιɤ r6 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r6 = r14.m11044(r6, r15)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r5 = o.C0936.m6806(r5, r6)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x015a
        L_0x014a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            o.ιɤ r5 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r5 = r14.m11044(r5, r15)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
        L_0x015a:
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x015f:
            r12.m10062((java.lang.Object) r13, (int) r3, (o.C2081) r14)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0167:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            boolean r5 = r14.m11033()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0179:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            int r5 = r14.m11052()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x018b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11050()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x019d:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            int r5 = r14.m11046()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x01af:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11021()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x01c1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11034()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x01d3:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            float r5 = r14.m11040()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x01e5:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            double r5 = r14.m11030()     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10061(r13, (int) r1, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x01f7:
            java.lang.Object r1 = r12.m10036((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            int r2 = r12.m10047((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r4 = o.C2509.m13271(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            if (r4 != 0) goto L_0x0211
            o.ɽӀ r4 = r12.f9304     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r4 = r4.m8989(r1)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r2, (java.lang.Object) r4)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0228
        L_0x0211:
            o.ɽӀ r5 = r12.f9304     // Catch:{ ɍɟ -> 0x059f }
            boolean r5 = r5.m8993(r4)     // Catch:{ ɍɟ -> 0x059f }
            if (r5 == 0) goto L_0x0228
            o.ɽӀ r5 = r12.f9304     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r5 = r5.m8989(r1)     // Catch:{ ɍɟ -> 0x059f }
            o.ɽӀ r6 = r12.f9304     // Catch:{ ɍɟ -> 0x059f }
            r6.m8987(r5, r4)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r2, (java.lang.Object) r5)     // Catch:{ ɍɟ -> 0x059f }
            r4 = r5
        L_0x0228:
            o.ɽӀ r2 = r12.f9304     // Catch:{ ɍɟ -> 0x059f }
            java.util.Map r2 = r2.m8992(r4)     // Catch:{ ɍɟ -> 0x059f }
            o.ɽӀ r3 = r12.f9304     // Catch:{ ɍɟ -> 0x059f }
            o.ɽІ r1 = r3.m8988(r1)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11017(r2, r1, r15)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0239:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            o.ιɤ r1 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            o.ɩє r2 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r2 = r2.m8263(r13, r3)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11024(r2, r1, r15)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x024b:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11019(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0259:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11049(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0267:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11027(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0275:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11037(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0283:
            o.ɩє r4 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r3 = r4.m8263(r13, r5)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11055(r3)     // Catch:{ ɍɟ -> 0x059f }
            o.ɂӏ r2 = r12.m10058((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r10 = o.C2092.m11132(r1, r3, r2, r10, r7)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0298:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11029(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x02a6:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11035(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x02b4:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11047(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x02c2:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11022(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x02d0:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11023(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x02de:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11041(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x02ec:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11016(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x02fa:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11045(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0308:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11031(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0316:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11019(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0324:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11049(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0332:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11027(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0340:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11037(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x034e:
            o.ɩє r4 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r3 = r4.m8263(r13, r5)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11055(r3)     // Catch:{ ɍɟ -> 0x059f }
            o.ɂӏ r2 = r12.m10058((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r10 = o.C2092.m11132(r1, r3, r2, r10, r7)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0363:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11029(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0371:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11032(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x037f:
            o.ιɤ r1 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            o.ɩє r4 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r2 = r4.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11042(r2, r1, r15)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0391:
            boolean r1 = m10065(r3)     // Catch:{ ɍɟ -> 0x059f }
            if (r1 == 0) goto L_0x03a5
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11051(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x03a5:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11053(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x03b3:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11035(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x03c1:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11047(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x03cf:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11022(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x03dd:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11023(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x03eb:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11041(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x03f9:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11016(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0407:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11045(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0415:
            o.ɩє r1 = r12.f9313     // Catch:{ ɍɟ -> 0x059f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ ɍɟ -> 0x059f }
            java.util.List r1 = r1.m8263(r13, r2)     // Catch:{ ɍɟ -> 0x059f }
            r14.m11031(r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0423:
            boolean r1 = r12.m10052(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            if (r1 == 0) goto L_0x0441
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r1 = o.C2509.m13271(r13, r3)     // Catch:{ ɍɟ -> 0x059f }
            o.ιɤ r2 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r2 = r14.m11015(r2, r15)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r1 = o.C0936.m6806(r1, r2)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0441:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            o.ιɤ r1 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r1 = r14.m11015(r1, r15)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0454:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11039()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13275((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0463:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            int r1 = r14.m11038()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13265((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0472:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11048()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13275((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0481:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            int r1 = r14.m11018()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13265((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0490:
            int r4 = r14.m11020()     // Catch:{ ɍɟ -> 0x059f }
            o.ɂӏ r6 = r12.m10058((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            if (r6 == 0) goto L_0x04a7
            boolean r6 = r6.m7263(r4)     // Catch:{ ɍɟ -> 0x059f }
            if (r6 == 0) goto L_0x04a1
            goto L_0x04a7
        L_0x04a1:
            java.lang.Object r10 = o.C2092.m11152((int) r1, (int) r4, r10, r7)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x04a7:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13265((java.lang.Object) r13, (long) r5, (int) r4)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x04b2:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            int r1 = r14.m11028()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13265((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x04c1:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            o.ŀɺ r1 = r14.m11054()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x04d0:
            boolean r1 = r12.m10052(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            if (r1 == 0) goto L_0x04ee
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r1 = o.C2509.m13271(r13, r3)     // Catch:{ ɍɟ -> 0x059f }
            o.ιɤ r2 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r2 = r14.m11044(r2, r15)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r1 = o.C0936.m6806(r1, r2)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x04ee:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            o.ιɤ r1 = r12.m10045((int) r2)     // Catch:{ ɍɟ -> 0x059f }
            java.lang.Object r1 = r14.m11044(r1, r15)     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13291((java.lang.Object) r13, (long) r3, (java.lang.Object) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0501:
            r12.m10062((java.lang.Object) r13, (int) r3, (o.C2081) r14)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0509:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            boolean r1 = r14.m11033()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13296((java.lang.Object) r13, (long) r3, (boolean) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0518:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            int r1 = r14.m11052()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13265((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0527:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11050()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13275((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0536:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            int r1 = r14.m11046()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13265((java.lang.Object) r13, (long) r3, (int) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0545:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11021()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13275((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0554:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            long r5 = r14.m11034()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13275((java.lang.Object) r13, (long) r3, (long) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0563:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            float r1 = r14.m11040()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13282((java.lang.Object) r13, (long) r3, (float) r1)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0572:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ ɍɟ -> 0x059f }
            double r5 = r14.m11030()     // Catch:{ ɍɟ -> 0x059f }
            o.C2509.m13264((java.lang.Object) r13, (long) r3, (double) r5)     // Catch:{ ɍɟ -> 0x059f }
            r12.m10060(r13, (int) r2)     // Catch:{ ɍɟ -> 0x059f }
            goto L_0x0009
        L_0x0581:
            r10 = r1
        L_0x0582:
            boolean r1 = r7.m12224(r10, (o.C2081) r14)     // Catch:{ ɍɟ -> 0x059f }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f9312
        L_0x058a:
            int r15 = r12.f9308
            if (r14 >= r15) goto L_0x0599
            int[] r15 = r12.f9310
            r15 = r15[r14]
            java.lang.Object r10 = r12.m10056(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x058a
        L_0x0599:
            if (r10 == 0) goto L_0x059e
            r7.m12223((java.lang.Object) r13, r10)
        L_0x059e:
            return
        L_0x059f:
            r7.m12211((o.C2081) r14)     // Catch:{ all -> 0x05c6 }
            if (r10 != 0) goto L_0x05a9
            java.lang.Object r1 = r7.m12212(r13)     // Catch:{ all -> 0x05c6 }
            r10 = r1
        L_0x05a9:
            boolean r1 = r7.m12224(r10, (o.C2081) r14)     // Catch:{ all -> 0x05c6 }
            if (r1 != 0) goto L_0x0009
            int r14 = r12.f9312
        L_0x05b1:
            int r15 = r12.f9308
            if (r14 >= r15) goto L_0x05c0
            int[] r15 = r12.f9310
            r15 = r15[r14]
            java.lang.Object r10 = r12.m10056(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05b1
        L_0x05c0:
            if (r10 == 0) goto L_0x05c5
            r7.m12223((java.lang.Object) r13, r10)
        L_0x05c5:
            return
        L_0x05c6:
            r14 = move-exception
            int r15 = r12.f9312
        L_0x05c9:
            int r0 = r12.f9308
            if (r15 >= r0) goto L_0x05d8
            int[] r0 = r12.f9310
            r0 = r0[r15]
            java.lang.Object r10 = r12.m10056(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05c9
        L_0x05d8:
            if (r10 == 0) goto L_0x05dd
            r7.m12223((java.lang.Object) r13, r10)
        L_0x05dd:
            throw r14
        L_0x05de:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10072(java.lang.Object, o.ιԍ, o.Ɨј):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static C2515 m10059(Object obj) {
        C0987 r2 = (C0987) obj;
        C2515 r0 = r2.zzb;
        if (r0 != C2515.m13355()) {
            return r0;
        }
        C2515 r02 = C2515.m13352();
        r2.zzb = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m10035(byte[] r1, int r2, int r3, o.C2792 r4, java.lang.Class<?> r5, o.C0515 r6) {
        /*
            int[] r0 = o.C1787.f9118
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = o.C0482.m4829(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = o.C0482.m4839(r1, r2, r6)
            long r2 = r6.f4279
            long r2 = o.C0598.m5271((long) r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f4278 = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = o.C0482.m4835(r1, r2, r6)
            int r2 = r6.f4280
            int r2 = o.C0598.m5270((int) r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f4278 = r2
            goto L_0x00ae
        L_0x003d:
            o.εǃ r4 = o.C1934.m10558()
            o.ιɤ r4 = r4.m10559(r5)
            int r1 = o.C0482.m4838(r4, r1, r2, r3, r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = o.C0482.m4839(r1, r2, r6)
            long r2 = r6.f4279
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f4278 = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = o.C0482.m4835(r1, r2, r6)
            int r2 = r6.f4280
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f4278 = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = o.C0482.m4831(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f4278 = r1
            goto L_0x0084
        L_0x006f:
            long r3 = o.C0482.m4825(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f4278 = r1
            goto L_0x0091
        L_0x007a:
            int r1 = o.C0482.m4834(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f4278 = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = o.C0482.m4836(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f4278 = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = o.C0482.m4824(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = o.C0482.m4839(r1, r2, r6)
            long r2 = r6.f4279
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f4278 = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10035(byte[], int, int, o.Ӏɫ, java.lang.Class, o.ŀЈ):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    /* renamed from: ɩ  reason: contains not printable characters */
    private final int m10042(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, o.C0515 r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f9302
            java.lang.Object r11 = r11.getObject(r1, r9)
            o.Ɂǃ r11 = (o.C1001) r11
            boolean r12 = r11.m7115()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            o.Ɂǃ r11 = r11.m7113(r12)
            sun.misc.Unsafe r12 = f9302
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            o.ιɤ r1 = r0.m10045((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = o.C0482.m4837(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f4278
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = o.C0482.m4835(r3, r4, r7)
            int r9 = r7.f4280
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = o.C0482.m4837(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f4278
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            o.ɭɨ r11 = (o.C1440) r11
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r2 = r7.f4280
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = o.C0482.m4839(r3, r1, r7)
            long r4 = r7.f4279
            long r4 = o.C0598.m5271((long) r4)
            r11.m8702((long) r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            o.ɭɨ r11 = (o.C1440) r11
            int r1 = o.C0482.m4839(r3, r4, r7)
            long r8 = r7.f4279
            long r8 = o.C0598.m5271((long) r8)
            r11.m8702((long) r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = o.C0482.m4835(r3, r1, r7)
            int r6 = r7.f4280
            if (r2 != r6) goto L_0x0423
            int r1 = o.C0482.m4839(r3, r4, r7)
            long r8 = r7.f4279
            long r8 = o.C0598.m5271((long) r8)
            r11.m8702((long) r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            o.ȽΙ r11 = (o.C0986) r11
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r2 = r7.f4280
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = o.C0482.m4835(r3, r1, r7)
            int r4 = r7.f4280
            int r4 = o.C0598.m5270((int) r4)
            r11.m6972(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            o.ȽΙ r11 = (o.C0986) r11
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r4 = r7.f4280
            int r4 = o.C0598.m5270((int) r4)
            r11.m6972(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = o.C0482.m4835(r3, r1, r7)
            int r6 = r7.f4280
            if (r2 != r6) goto L_0x0423
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r4 = r7.f4280
            int r4 = o.C0598.m5270((int) r4)
            r11.m6972(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = o.C0482.m4830(r3, r4, r11, r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = o.C0482.m4827((int) r2, (byte[]) r3, (int) r4, (int) r5, (o.C1001<?>) r6, (o.C0515) r7)
        L_0x0131:
            o.ȽІ r1 = (o.C0987) r1
            o.ьǃ r3 = r1.zzb
            o.ьǃ r4 = o.C2515.m13355()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            o.ɂӏ r4 = r0.m10058((int) r8)
            o.Џ<?, ?> r5 = r0.f9314
            r6 = r22
            java.lang.Object r3 = o.C2092.m11132(r6, r11, r4, r3, r5)
            o.ьǃ r3 = (o.C2515) r3
            if (r3 == 0) goto L_0x014e
            r1.zzb = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r4 = r7.f4280
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            o.ŀɺ r4 = o.C0510.f4250
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            o.ŀɺ r6 = o.C0510.m4957(r3, r1, r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = o.C0482.m4835(r3, r1, r7)
            int r6 = r7.f4280
            if (r2 != r6) goto L_0x0423
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r4 = r7.f4280
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            o.ŀɺ r4 = o.C0510.f4250
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            o.ŀɺ r6 = o.C0510.m4957(r3, r1, r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x019a:
            o.ɛı r1 = o.C1124.m7559()
            throw r1
        L_0x019f:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x01a4:
            o.ɛı r1 = o.C1124.m7559()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            o.ιɤ r1 = r0.m10045((int) r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = o.C0482.m4823(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = o.C0482.m4835(r3, r4, r7)
            int r6 = r7.f4280
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = o.C0936.f5914
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = o.C0482.m4835(r3, r4, r7)
            int r8 = r7.f4280
            if (r2 != r8) goto L_0x0422
            int r4 = o.C0482.m4835(r3, r6, r7)
            int r6 = r7.f4280
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = o.C0936.f5914
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            o.ɛı r1 = o.C1124.m7559()
            throw r1
        L_0x0211:
            o.ɛı r1 = o.C1124.m7559()
            throw r1
        L_0x0216:
            int r4 = o.C0482.m4835(r3, r4, r7)
            int r6 = r7.f4280
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = o.C2530.m13535((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = o.C0936.f5914
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = o.C0482.m4835(r3, r4, r7)
            int r8 = r7.f4280
            if (r2 != r8) goto L_0x0422
            int r4 = o.C0482.m4835(r3, r6, r7)
            int r6 = r7.f4280
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = o.C2530.m13535((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = o.C0936.f5914
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            o.ɛı r1 = o.C1124.m7564()
            throw r1
        L_0x0267:
            o.ɛı r1 = o.C1124.m7559()
            throw r1
        L_0x026c:
            o.ɛı r1 = o.C1124.m7564()
            throw r1
        L_0x0271:
            o.ɛı r1 = o.C1124.m7559()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            o.ŀǀ r11 = (o.C0500) r11
            int r2 = o.C0482.m4835(r3, r4, r7)
            int r4 = r7.f4280
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = o.C0482.m4839(r3, r2, r7)
            long r5 = r7.f4279
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0290
            r5 = 1
            goto L_0x0291
        L_0x0290:
            r5 = 0
        L_0x0291:
            r11.m4887((boolean) r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            o.ŀǀ r11 = (o.C0500) r11
            int r4 = o.C0482.m4839(r3, r4, r7)
            long r8 = r7.f4279
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r11.m4887((boolean) r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = o.C0482.m4835(r3, r4, r7)
            int r8 = r7.f4280
            if (r2 != r8) goto L_0x0422
            int r4 = o.C0482.m4839(r3, r6, r7)
            long r8 = r7.f4279
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = 1
            goto L_0x02c9
        L_0x02c8:
            r6 = 0
        L_0x02c9:
            r11.m4887((boolean) r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            o.ȽΙ r11 = (o.C0986) r11
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r2 = r7.f4280
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = o.C0482.m4834(r3, r1)
            r11.m6972(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            o.ȽΙ r11 = (o.C0986) r11
            int r1 = o.C0482.m4834(r18, r19)
            r11.m6972(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = o.C0482.m4835(r3, r1, r7)
            int r6 = r7.f4280
            if (r2 != r6) goto L_0x0423
            int r1 = o.C0482.m4834(r3, r4)
            r11.m6972(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            o.ɭɨ r11 = (o.C1440) r11
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r2 = r7.f4280
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = o.C0482.m4825(r3, r1)
            r11.m8702((long) r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            o.ɭɨ r11 = (o.C1440) r11
            long r8 = o.C0482.m4825(r18, r19)
            r11.m8702((long) r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = o.C0482.m4835(r3, r1, r7)
            int r6 = r7.f4280
            if (r2 != r6) goto L_0x0423
            long r8 = o.C0482.m4825(r3, r4)
            r11.m8702((long) r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = o.C0482.m4830(r3, r4, r11, r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = o.C0482.m4827((int) r21, (byte[]) r22, (int) r23, (int) r24, (o.C1001<?>) r25, (o.C0515) r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            o.ɭɨ r11 = (o.C1440) r11
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r2 = r7.f4280
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = o.C0482.m4839(r3, r1, r7)
            long r4 = r7.f4279
            r11.m8702((long) r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            o.ɭɨ r11 = (o.C1440) r11
            int r1 = o.C0482.m4839(r3, r4, r7)
            long r8 = r7.f4279
            r11.m8702((long) r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = o.C0482.m4835(r3, r1, r7)
            int r6 = r7.f4280
            if (r2 != r6) goto L_0x0423
            int r1 = o.C0482.m4839(r3, r4, r7)
            long r8 = r7.f4279
            r11.m8702((long) r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            o.ǀł r11 = (o.C0840) r11
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r2 = r7.f4280
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = o.C0482.m4831(r3, r1)
            r11.m6312((float) r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            o.ǀł r11 = (o.C0840) r11
            float r1 = o.C0482.m4831(r18, r19)
            r11.m6312((float) r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = o.C0482.m4835(r3, r1, r7)
            int r6 = r7.f4280
            if (r2 != r6) goto L_0x0423
            float r1 = o.C0482.m4831(r3, r4)
            r11.m6312((float) r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            o.ƗЈ r11 = (o.C0702) r11
            int r1 = o.C0482.m4835(r3, r4, r7)
            int r2 = r7.f4280
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = o.C0482.m4836(r3, r1)
            r11.m5809((double) r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            o.ɛı r1 = o.C1124.m7558()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            o.ƗЈ r11 = (o.C0702) r11
            double r8 = o.C0482.m4836(r18, r19)
            r11.m5809((double) r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = o.C0482.m4835(r3, r1, r7)
            int r6 = r7.f4280
            if (r2 != r6) goto L_0x0423
            double r8 = o.C0482.m4836(r3, r4)
            r11.m5809((double) r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10042(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, o.ŀЈ):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m10055(T r8, byte[] r9, int r10, int r11, int r12, long r13, o.C0515 r15) {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f9302
            java.lang.Object r12 = r7.m10036((int) r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            o.ɽӀ r2 = r7.f9304
            boolean r2 = r2.m8993(r1)
            if (r2 == 0) goto L_0x0021
            o.ɽӀ r2 = r7.f9304
            java.lang.Object r2 = r2.m8989(r12)
            o.ɽӀ r3 = r7.f9304
            r3.m8987(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            o.ɽӀ r8 = r7.f9304
            o.ɽІ r8 = r8.m8988(r12)
            o.ɽӀ r12 = r7.f9304
            java.util.Map r12 = r12.m8992(r1)
            int r10 = o.C0482.m4835(r9, r10, r15)
            int r13 = r15.f4280
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f8140
            V r0 = r8.f8138
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = o.C0482.m4832(r10, r9, r1, r15)
            int r10 = r15.f4280
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            o.Ӏɫ r1 = r8.f8137
            int r1 = r1.m14707()
            if (r3 != r1) goto L_0x0087
            o.Ӏɫ r4 = r8.f8137
            V r10 = r8.f8138
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m10035((byte[]) r1, (int) r2, (int) r3, (o.C2792) r4, (java.lang.Class<?>) r5, (o.C0515) r6)
            java.lang.Object r0 = r15.f4278
            goto L_0x003e
        L_0x0072:
            o.Ӏɫ r1 = r8.f8139
            int r1 = r1.m14707()
            if (r3 != r1) goto L_0x0087
            o.Ӏɫ r4 = r8.f8139
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m10035((byte[]) r1, (int) r2, (int) r3, (o.C2792) r4, (java.lang.Class<?>) r5, (o.C0515) r6)
            java.lang.Object r14 = r15.f4278
            goto L_0x003e
        L_0x0087:
            int r10 = o.C0482.m4826(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            o.ɛı r8 = o.C1124.m7563()
            throw r8
        L_0x0097:
            o.ɛı r8 = o.C1124.m7558()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10055(java.lang.Object, byte[], int, int, int, long, o.ŀЈ):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m10034(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, o.C0515 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f9302
            int[] r7 = r0.f9306
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            o.ιɤ r2 = r0.m10045((int) r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = o.C0482.m4837(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f4278
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.f4278
            java.lang.Object r3 = o.C0936.m6806(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = o.C0482.m4839(r3, r4, r11)
            long r3 = r11.f4279
            long r3 = o.C0598.m5271((long) r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = o.C0482.m4835(r3, r4, r11)
            int r3 = r11.f4280
            int r3 = o.C0598.m5270((int) r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = o.C0482.m4835(r3, r4, r11)
            int r4 = r11.f4280
            o.ɂӏ r5 = r0.m10058((int) r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.m7263(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            o.ьǃ r1 = m10059((java.lang.Object) r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.m13360(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = o.C0482.m4824(r3, r4, r11)
            java.lang.Object r3 = r11.f4278
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            o.ιɤ r2 = r0.m10045((int) r6)
            r5 = r20
            int r2 = o.C0482.m4838(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f4278
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f4278
            java.lang.Object r3 = o.C0936.m6806(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = o.C0482.m4835(r3, r4, r11)
            int r4 = r11.f4280
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = o.C2530.m13535((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            o.ɛı r1 = o.C1124.m7564()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = o.C0936.f5914
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = o.C0482.m4839(r3, r4, r11)
            long r3 = r11.f4279
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = o.C0482.m4834(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = o.C0482.m4825(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = o.C0482.m4835(r3, r4, r11)
            int r3 = r11.f4280
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = o.C0482.m4839(r3, r4, r11)
            long r3 = r11.f4279
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = o.C0482.m4831(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = o.C0482.m4836(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10034(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, o.ŀЈ):int");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1990 m10045(int i) {
        int i2 = (i / 3) << 1;
        C1990 r0 = (C1990) this.f9309[i2];
        if (r0 != null) {
            return r0;
        }
        C1990 r02 = C1934.m10558().m10559((Class) this.f9309[i2 + 1]);
        this.f9309[i2] = r02;
        return r02;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object m10036(int i) {
        return this.f9309[(i / 3) << 1];
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final C1025 m10058(int i) {
        return (C1025) this.f9309[((i / 3) << 1) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0370, code lost:
        if (r0 == r15) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03b9, code lost:
        if (r0 == r15) goto L_0x03df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0178, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0217, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0219, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r11 = r34;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0243, code lost:
        r32 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ba, code lost:
        r0 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02bc, code lost:
        r6 = r6 | r22;
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02c0, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c4, code lost:
        r13 = r33;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ca, code lost:
        r17 = r32;
        r19 = r6;
        r2 = r7;
        r7 = r8;
        r18 = r9;
        r26 = r10;
        r24 = r11;
        r6 = r34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x043c  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m10070(T r30, byte[] r31, int r32, int r33, int r34, o.C0515 r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = f9302
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x047e
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = o.C0482.m4832(r0, r12, r3, r9)
            int r3 = r9.f4280
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0037
            int r2 = r2 / r8
            int r1 = r15.m10048((int) r3, (int) r2)
            goto L_0x003b
        L_0x0037:
            int r1 = r15.m10067(r3)
        L_0x003b:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004e
            r24 = r3
            r2 = r4
            r19 = r6
            r17 = r7
            r26 = r10
            r6 = r11
            r18 = 0
            r7 = r5
            goto L_0x03e3
        L_0x004e:
            int[] r1 = r15.f9306
            int r18 = r2 + 1
            r8 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r8 & r18
            int r11 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r5
            r5 = r8 & r18
            long r12 = (long) r5
            r5 = 17
            r20 = r8
            if (r11 > r5) goto L_0x02da
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r5
            r1 = r1 & r18
            r5 = -1
            if (r1 == r7) goto L_0x0082
            if (r7 == r5) goto L_0x007c
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x007c:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
        L_0x0082:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02a2;
                case 1: goto L_0x0288;
                case 2: goto L_0x0262;
                case 3: goto L_0x0262;
                case 4: goto L_0x0247;
                case 5: goto L_0x0222;
                case 6: goto L_0x01ff;
                case 7: goto L_0x01d7;
                case 8: goto L_0x01b2;
                case 9: goto L_0x017c;
                case 10: goto L_0x0161;
                case 11: goto L_0x0247;
                case 12: goto L_0x012f;
                case 13: goto L_0x01ff;
                case 14: goto L_0x0222;
                case 15: goto L_0x0114;
                case 16: goto L_0x00e7;
                case 17: goto L_0x0095;
                default: goto L_0x0086;
            }
        L_0x0086:
            r12 = r31
            r13 = r35
            r9 = r2
            r11 = r3
            r32 = r7
            r8 = r19
            r18 = -1
        L_0x0092:
            r7 = r4
            goto L_0x02ca
        L_0x0095:
            r8 = 3
            if (r0 != r8) goto L_0x00db
            int r0 = r3 << 3
            r8 = r0 | 4
            o.ιɤ r0 = r15.m10045((int) r2)
            r1 = r31
            r9 = r2
            r2 = r4
            r11 = r3
            r3 = r33
            r4 = r8
            r8 = r19
            r18 = -1
            r5 = r35
            int r0 = o.C0482.m4837(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00be
            r5 = r35
            java.lang.Object r1 = r5.f4278
            r10.putObject(r14, r12, r1)
            goto L_0x00cd
        L_0x00be:
            r5 = r35
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r5.f4278
            java.lang.Object r1 = o.C0936.m6806(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00cd:
            r6 = r6 | r22
            r12 = r31
            r13 = r33
            r3 = r8
            r2 = r9
            r1 = r11
            r11 = r34
            r9 = r5
            goto L_0x0017
        L_0x00db:
            r9 = r2
            r11 = r3
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            goto L_0x0243
        L_0x00e7:
            r5 = r35
            r9 = r2
            r11 = r3
            r8 = r19
            r18 = -1
            if (r0 != 0) goto L_0x010f
            r2 = r12
            r12 = r31
            int r13 = o.C0482.m4839(r12, r4, r5)
            long r0 = r5.f4279
            long r19 = o.C0598.m5271((long) r0)
            r0 = r10
            r1 = r30
            r32 = r13
            r13 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r32
            goto L_0x02c0
        L_0x010f:
            r12 = r31
            r13 = r5
            goto L_0x0243
        L_0x0114:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x0243
            int r0 = o.C0482.m4835(r12, r4, r13)
            int r1 = r13.f4280
            int r1 = o.C0598.m5270((int) r1)
            r10.putInt(r14, r2, r1)
            goto L_0x0178
        L_0x012f:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x0243
            int r0 = o.C0482.m4835(r12, r4, r13)
            int r1 = r13.f4280
            o.ɂӏ r4 = r15.m10058((int) r9)
            if (r4 == 0) goto L_0x015d
            boolean r4 = r4.m7263(r1)
            if (r4 == 0) goto L_0x014f
            goto L_0x015d
        L_0x014f:
            o.ьǃ r2 = m10059((java.lang.Object) r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.m13360(r8, r1)
            goto L_0x02c0
        L_0x015d:
            r10.putInt(r14, r2, r1)
            goto L_0x0178
        L_0x0161:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x0243
            int r0 = o.C0482.m4824(r12, r4, r13)
            java.lang.Object r1 = r13.f4278
            r10.putObject(r14, r2, r1)
        L_0x0178:
            r6 = r6 | r22
            goto L_0x02c0
        L_0x017c:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x01ae
            o.ιɤ r0 = r15.m10045((int) r9)
            r5 = r33
            int r0 = o.C0482.m4838(r0, r12, r4, r5, r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x019f
            java.lang.Object r1 = r13.f4278
            r10.putObject(r14, r2, r1)
            goto L_0x0217
        L_0x019f:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r13.f4278
            java.lang.Object r1 = o.C0936.m6806(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0217
        L_0x01ae:
            r5 = r33
            goto L_0x0243
        L_0x01b2:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x0243
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01cd
            int r0 = o.C0482.m4833(r12, r4, r13)
            goto L_0x01d1
        L_0x01cd:
            int r0 = o.C0482.m4829(r12, r4, r13)
        L_0x01d1:
            java.lang.Object r1 = r13.f4278
            r10.putObject(r14, r2, r1)
            goto L_0x0217
        L_0x01d7:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x0243
            int r0 = o.C0482.m4839(r12, r4, r13)
            r32 = r0
            long r0 = r13.f4279
            r19 = 0
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x01f6
            r0 = 1
            goto L_0x01f7
        L_0x01f6:
            r0 = 0
        L_0x01f7:
            o.C2509.m13296((java.lang.Object) r14, (long) r2, (boolean) r0)
            r6 = r6 | r22
            r0 = r32
            goto L_0x0219
        L_0x01ff:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x0243
            int r0 = o.C0482.m4834(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0217:
            r6 = r6 | r22
        L_0x0219:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r11 = r34
            r13 = r5
            goto L_0x0017
        L_0x0222:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 1
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x0243
            long r19 = o.C0482.m4825(r12, r4)
            r0 = r10
            r1 = r30
            r32 = r7
            r7 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x02ba
        L_0x0243:
            r32 = r7
            goto L_0x0092
        L_0x0247:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02ca
            int r0 = o.C0482.m4835(r12, r7, r13)
            int r1 = r13.f4280
            r10.putInt(r14, r2, r1)
            goto L_0x02bc
        L_0x0262:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02ca
            int r7 = o.C0482.m4839(r12, r7, r13)
            long r4 = r13.f4279
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r7
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r7 = r32
            goto L_0x02c4
        L_0x0288:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02ca
            float r0 = o.C0482.m4831(r12, r7)
            o.C2509.m13282((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r7 + 4
            goto L_0x02bc
        L_0x02a2:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r1 = 1
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02ca
            double r0 = o.C0482.m4836(r12, r7)
            o.C2509.m13264((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x02ba:
            int r0 = r7 + 8
        L_0x02bc:
            r6 = r6 | r22
            r7 = r32
        L_0x02c0:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
        L_0x02c4:
            r13 = r33
            r11 = r34
            goto L_0x0017
        L_0x02ca:
            r17 = r32
            r19 = r6
            r2 = r7
            r7 = r8
            r18 = r9
            r26 = r10
            r24 = r11
            r6 = r34
            goto L_0x03e3
        L_0x02da:
            r5 = r3
            r17 = r7
            r8 = r19
            r18 = -1
            r7 = r4
            r27 = r12
            r12 = r31
            r13 = r9
            r9 = r2
            r2 = r27
            r1 = 27
            if (r11 != r1) goto L_0x033f
            r1 = 2
            if (r0 != r1) goto L_0x0332
            java.lang.Object r0 = r10.getObject(r14, r2)
            o.Ɂǃ r0 = (o.C1001) r0
            boolean r1 = r0.m7115()
            if (r1 != 0) goto L_0x030f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0306
            r1 = 10
            goto L_0x0308
        L_0x0306:
            int r1 = r1 << 1
        L_0x0308:
            o.Ɂǃ r0 = r0.m7113(r1)
            r10.putObject(r14, r2, r0)
        L_0x030f:
            r11 = r0
            o.ιɤ r0 = r15.m10045((int) r9)
            r1 = r8
            r2 = r31
            r3 = r7
            r4 = r33
            r7 = r5
            r5 = r11
            r19 = r6
            r6 = r35
            int r0 = o.C0482.m4823(r0, r1, r2, r3, r4, r5, r6)
            r11 = r34
            r1 = r7
            r3 = r8
            r2 = r9
            r9 = r13
            r7 = r17
            r6 = r19
            r13 = r33
            goto L_0x0017
        L_0x0332:
            r19 = r6
            r24 = r5
            r15 = r7
            r25 = r8
            r18 = r9
            r26 = r10
            goto L_0x03bc
        L_0x033f:
            r19 = r6
            r6 = r5
            r1 = 49
            if (r11 > r1) goto L_0x038e
            r5 = r20
            long r4 = (long) r5
            r1 = r0
            r0 = r29
            r32 = r1
            r1 = r30
            r22 = r2
            r2 = r31
            r3 = r7
            r20 = r4
            r4 = r33
            r5 = r8
            r24 = r6
            r15 = r7
            r7 = r32
            r25 = r8
            r8 = r9
            r18 = r9
            r26 = r10
            r9 = r20
            r12 = r22
            r14 = r35
            int r0 = r0.m10042(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0374
            goto L_0x03df
        L_0x0374:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r7 = r17
            r2 = r18
            r6 = r19
            r1 = r24
            r3 = r25
        L_0x038a:
            r10 = r26
            goto L_0x0017
        L_0x038e:
            r32 = r0
            r22 = r2
            r24 = r6
            r15 = r7
            r25 = r8
            r18 = r9
            r26 = r10
            r5 = r20
            r0 = 50
            if (r11 != r0) goto L_0x03c2
            r7 = r32
            r0 = 2
            if (r7 != r0) goto L_0x03bc
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r22
            r8 = r35
            int r0 = r0.m10055(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x0374
            goto L_0x03df
        L_0x03bc:
            r6 = r34
            r2 = r15
        L_0x03bf:
            r7 = r25
            goto L_0x03e3
        L_0x03c2:
            r7 = r32
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r8 = r5
            r5 = r25
            r6 = r24
            r9 = r11
            r10 = r22
            r12 = r18
            r13 = r35
            int r0 = r0.m10034(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0464
        L_0x03df:
            r6 = r34
            r2 = r0
            goto L_0x03bf
        L_0x03e3:
            if (r7 != r6) goto L_0x03f4
            if (r6 != 0) goto L_0x03e8
            goto L_0x03f4
        L_0x03e8:
            r4 = -1
            r8 = r29
            r11 = r30
            r3 = r7
            r0 = r17
            r1 = r19
            goto L_0x048d
        L_0x03f4:
            r8 = r29
            boolean r0 = r8.f9319
            if (r0 == 0) goto L_0x043c
            r9 = r35
            o.Ɨј r0 = r9.f4277
            o.Ɨј r1 = o.C0705.m5817()
            if (r0 == r1) goto L_0x0439
            o.ʋΙ r0 = r8.f9318
            o.Ɨј r1 = r9.f4277
            r10 = r24
            o.ȽІ$iF r0 = r1.m5818(r0, r10)
            if (r0 != 0) goto L_0x0429
            o.ьǃ r4 = m10059((java.lang.Object) r30)
            r0 = r7
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = o.C0482.m4828((int) r0, (byte[]) r1, (int) r2, (int) r3, (o.C2515) r4, (o.C0515) r5)
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r6
            r3 = r7
            r15 = r8
            goto L_0x0475
        L_0x0429:
            r11 = r30
            r0 = r11
            o.ȽІ$if r0 = (o.C0987.Cif) r0
            r0.m6998()
            o.ƭǃ<o.ȽІ$ı> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0439:
            r11 = r30
            goto L_0x0440
        L_0x043c:
            r11 = r30
            r9 = r35
        L_0x0440:
            r10 = r24
            o.ьǃ r4 = m10059((java.lang.Object) r30)
            r0 = r7
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = o.C0482.m4828((int) r0, (byte[]) r1, (int) r2, (int) r3, (o.C2515) r4, (o.C0515) r5)
            r12 = r31
            r13 = r33
            r3 = r7
            r15 = r8
            r1 = r10
            r14 = r11
            r7 = r17
            r2 = r18
            r10 = r26
            r11 = r6
            r6 = r19
            goto L_0x0017
        L_0x0464:
            r10 = r24
            r7 = r25
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r3 = r7
        L_0x0475:
            r1 = r10
            r7 = r17
            r2 = r18
            r6 = r19
            goto L_0x038a
        L_0x047e:
            r19 = r6
            r17 = r7
            r26 = r10
            r6 = r11
            r11 = r14
            r8 = r15
            r2 = r0
            r0 = r17
            r1 = r19
            r4 = -1
        L_0x048d:
            if (r0 == r4) goto L_0x0495
            long r4 = (long) r0
            r0 = r26
            r0.putInt(r11, r4, r1)
        L_0x0495:
            r0 = 0
            int r1 = r8.f9312
        L_0x0498:
            int r4 = r8.f9308
            if (r1 >= r4) goto L_0x04ab
            int[] r4 = r8.f9310
            r4 = r4[r1]
            o.Џ<?, ?> r5 = r8.f9314
            java.lang.Object r0 = r8.m10056(r11, r4, r0, r5)
            o.ьǃ r0 = (o.C2515) r0
            int r1 = r1 + 1
            goto L_0x0498
        L_0x04ab:
            if (r0 == 0) goto L_0x04b2
            o.Џ<?, ?> r1 = r8.f9314
            r1.m12223((java.lang.Object) r11, r0)
        L_0x04b2:
            if (r6 != 0) goto L_0x04be
            r0 = r33
            if (r2 != r0) goto L_0x04b9
            goto L_0x04c4
        L_0x04b9:
            o.ɛı r0 = o.C1124.m7563()
            throw r0
        L_0x04be:
            r0 = r33
            if (r2 > r0) goto L_0x04c5
            if (r3 != r6) goto L_0x04c5
        L_0x04c4:
            return r2
        L_0x04c5:
            o.ɛı r0 = o.C1124.m7563()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10070(java.lang.Object, byte[], int, int, int, o.ŀЈ):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022e, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10076(T r28, byte[] r29, int r30, int r31, o.C0515 r32) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.f9311
            if (r0 == 0) goto L_0x025d
            sun.misc.Unsafe r9 = f9302
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0254
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = o.C0482.m4832(r0, r12, r3, r11)
            int r3 = r11.f4280
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.m10048((int) r7, (int) r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.m10067(r7)
        L_0x003d:
            r4 = r0
            if (r4 != r10) goto L_0x004b
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0231
        L_0x004b:
            int[] r0 = r15.f9306
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0167
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014e;
                case 1: goto L_0x013f;
                case 2: goto L_0x012d;
                case 3: goto L_0x012d;
                case 4: goto L_0x011f;
                case 5: goto L_0x010f;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00a3;
                case 11: goto L_0x011f;
                case 12: goto L_0x0094;
                case 13: goto L_0x00fe;
                case 14: goto L_0x010f;
                case 15: goto L_0x0081;
                case 16: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x01a4
        L_0x0066:
            if (r6 != 0) goto L_0x01a4
            int r6 = o.C0482.m4839(r12, r8, r11)
            r19 = r1
            long r0 = r11.f4279
            long r21 = o.C0598.m5271((long) r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x013d
        L_0x0081:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = o.C0482.m4835(r12, r8, r11)
            int r1 = r11.f4280
            int r1 = o.C0598.m5270((int) r1)
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x0094:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = o.C0482.m4835(r12, r8, r11)
            int r1 = r11.f4280
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x00a3:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            int r0 = o.C0482.m4824(r12, r8, r11)
            java.lang.Object r1 = r11.f4278
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00b0:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            o.ιɤ r0 = r15.m10045((int) r4)
            int r0 = o.C0482.m4838(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c7
            java.lang.Object r1 = r11.f4278
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00c7:
            java.lang.Object r5 = r11.f4278
            java.lang.Object r1 = o.C0936.m6806(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00d1:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00de
            int r0 = o.C0482.m4833(r12, r8, r11)
            goto L_0x00e2
        L_0x00de:
            int r0 = o.C0482.m4829(r12, r8, r11)
        L_0x00e2:
            java.lang.Object r1 = r11.f4278
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00e8:
            r2 = r1
            if (r6 != 0) goto L_0x01a4
            int r1 = o.C0482.m4839(r12, r8, r11)
            long r5 = r11.f4279
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            o.C2509.m13296((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            goto L_0x010b
        L_0x00fe:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a4
            int r0 = o.C0482.m4834(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x010b:
            r2 = r4
            r1 = r7
            goto L_0x0251
        L_0x010f:
            r2 = r1
            if (r6 != r0) goto L_0x01a4
            long r5 = o.C0482.m4825(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0159
        L_0x011f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = o.C0482.m4835(r12, r8, r11)
            int r1 = r11.f4280
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x012d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r6 = o.C0482.m4839(r12, r8, r11)
            long r4 = r11.f4279
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x013d:
            r0 = r6
            goto L_0x015b
        L_0x013f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015f
            float r0 = o.C0482.m4831(r12, r8)
            o.C2509.m13282((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r8 + 4
            goto L_0x015b
        L_0x014e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015f
            double r0 = o.C0482.m4836(r12, r8)
            o.C2509.m13264((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x0159:
            int r0 = r8 + 8
        L_0x015b:
            r1 = r7
            r2 = r10
            goto L_0x0251
        L_0x015f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01ab
        L_0x0167:
            r0 = 27
            if (r3 != r0) goto L_0x01af
            if (r6 != r10) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r1)
            o.Ɂǃ r0 = (o.C1001) r0
            boolean r3 = r0.m7115()
            if (r3 != 0) goto L_0x018b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0182
            r3 = 10
            goto L_0x0184
        L_0x0182:
            int r3 = r3 << 1
        L_0x0184:
            o.Ɂǃ r0 = r0.m7113(r3)
            r9.putObject(r14, r1, r0)
        L_0x018b:
            r5 = r0
            o.ιɤ r0 = r15.m10045((int) r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = o.C0482.m4823(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0251
        L_0x01a4:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01ab:
            r26 = -1
            goto L_0x0212
        L_0x01af:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e5
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.m10042(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x01e5:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0214
            r7 = r30
            if (r7 != r10) goto L_0x0212
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.m10055(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x0212:
            r2 = r15
            goto L_0x0231
        L_0x0214:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.m10034(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0241
        L_0x0230:
            r2 = r0
        L_0x0231:
            o.ьǃ r4 = m10059((java.lang.Object) r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = o.C0482.m4828((int) r0, (byte[]) r1, (int) r2, (int) r3, (o.C2515) r4, (o.C0515) r5)
        L_0x0241:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x0251:
            r10 = -1
            goto L_0x0017
        L_0x0254:
            r4 = r13
            if (r0 != r4) goto L_0x0258
            return
        L_0x0258:
            o.ɛı r0 = o.C1124.m7563()
            throw r0
        L_0x025d:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.m10070(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (o.C0515) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1824.m10076(java.lang.Object, byte[], int, int, o.ŀЈ):void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10071(T t) {
        int i;
        int i2 = this.f9312;
        while (true) {
            i = this.f9308;
            if (i2 >= i) {
                break;
            }
            long r1 = (long) (m10047(this.f9310[i2]) & 1048575);
            Object r3 = C2509.m13271(t, r1);
            if (r3 != null) {
                C2509.m13291((Object) t, r1, this.f9304.m8986(r3));
            }
            i2++;
        }
        int length = this.f9310.length;
        while (i < length) {
            this.f9313.m8262(t, (long) this.f9310[i]);
            i++;
        }
        this.f9314.m12208((Object) t);
        if (this.f9319) {
            this.f9317.m5924(t);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final <UT, UB> UB m10056(Object obj, int i, UB ub, C2342<UT, UB> r12) {
        C1025 r5;
        int i2 = this.f9306[i];
        Object r9 = C2509.m13271(obj, (long) (m10047(i) & 1048575));
        if (r9 == null || (r5 = m10058(i)) == null) {
            return ub;
        }
        return m10037(i, i2, this.f9304.m8992(r9), r5, ub, r12);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final <K, V, UT, UB> UB m10037(int i, int i2, Map<K, V> map, C1025 r8, UB ub, C2342<UT, UB> r10) {
        C1528<?, ?> r5 = this.f9304.m8988(m10036(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!r8.m7263(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = r10.m12214();
                }
                C0551 r1 = C0510.m4960(C1620.m9364(r5, next.getKey(), next.getValue()));
                try {
                    C1620.m9365(r1.m5137(), r5, next.getKey(), next.getValue());
                    r10.m12222(ub, i2, r1.m5138());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m10077(T t) {
        int i;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.f9312) {
                return !this.f9319 || this.f9317.m5922(t).m6161();
            }
            int i5 = this.f9310[i2];
            int i6 = this.f9306[i5];
            int r7 = m10047(i5);
            if (!this.f9311) {
                int i7 = this.f9306[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = f9302.getInt(t, (long) i8);
                    i3 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & r7) != 0) && !m10053(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & r7) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (m10040(t, i6, i5) && !m10046(t, r7, m10045(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> r6 = this.f9304.m8991(C2509.m13271(t, (long) (r7 & 1048575)));
                            if (!r6.isEmpty()) {
                                if (this.f9304.m8988(m10036(i5)).f8137.m14708() == C2743.MESSAGE) {
                                    C1990<?> r4 = null;
                                    Iterator<?> it = r6.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (r4 == null) {
                                            r4 = C1934.m10558().m10559(next.getClass());
                                        }
                                        if (!r4.m10790(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) C2509.m13271(t, (long) (r7 & 1048575));
                if (!list.isEmpty()) {
                    C1990 r42 = m10045(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!r42.m10790(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m10053(t, i5, i4, i) && !m10046(t, r7, m10045(i5))) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m10046(Object obj, int i, C1990 r4) {
        return r4.m10790(C2509.m13271(obj, (long) (i & 1048575)));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m10038(int i, Object obj, C2867 r3) {
        if (obj instanceof String) {
            r3.m14884(i, (String) obj);
        } else {
            r3.m14902(i, (C0510) obj);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m10062(Object obj, int i, C2081 r5) {
        if (m10065(i)) {
            C2509.m13291(obj, (long) (i & 1048575), (Object) r5.m11026());
        } else if (this.f9305) {
            C2509.m13291(obj, (long) (i & 1048575), (Object) r5.m11036());
        } else {
            C2509.m13291(obj, (long) (i & 1048575), (Object) r5.m11054());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final int m10047(int i) {
        return this.f9306[i + 1];
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final int m10030(int i) {
        return this.f9306[i + 2];
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static <T> double m10029(T t, long j) {
        return ((Double) C2509.m13271(t, j)).doubleValue();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static <T> float m10033(T t, long j) {
        return ((Float) C2509.m13271(t, j)).floatValue();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static <T> int m10054(T t, long j) {
        return ((Integer) C2509.m13271(t, j)).intValue();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static <T> long m10044(T t, long j) {
        return ((Long) C2509.m13271(t, j)).longValue();
    }

    /* renamed from: І  reason: contains not printable characters */
    private static <T> boolean m10066(T t, long j) {
        return ((Boolean) C2509.m13271(t, j)).booleanValue();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean m10064(T t, T t2, int i) {
        return m10052(t, i) == m10052(t2, i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m10053(T t, int i, int i2, int i3) {
        if (this.f9311) {
            return m10052(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m10052(T t, int i) {
        if (this.f9311) {
            int r8 = m10047(i);
            long j = (long) (r8 & 1048575);
            switch ((r8 & 267386880) >>> 20) {
                case 0:
                    return C2509.m13287(t, j) != 0.0d;
                case 1:
                    return C2509.m13293(t, j) != 0.0f;
                case 2:
                    return C2509.m13280(t, j) != 0;
                case 3:
                    return C2509.m13280(t, j) != 0;
                case 4:
                    return C2509.m13273((Object) t, j) != 0;
                case 5:
                    return C2509.m13280(t, j) != 0;
                case 6:
                    return C2509.m13273((Object) t, j) != 0;
                case 7:
                    return C2509.m13270((Object) t, j);
                case 8:
                    Object r7 = C2509.m13271(t, j);
                    if (r7 instanceof String) {
                        return !((String) r7).isEmpty();
                    }
                    if (r7 instanceof C0510) {
                        return !C0510.f4250.equals(r7);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C2509.m13271(t, j) != null;
                case 10:
                    return !C0510.f4250.equals(C2509.m13271(t, j));
                case 11:
                    return C2509.m13273((Object) t, j) != 0;
                case 12:
                    return C2509.m13273((Object) t, j) != 0;
                case 13:
                    return C2509.m13273((Object) t, j) != 0;
                case 14:
                    return C2509.m13280(t, j) != 0;
                case 15:
                    return C2509.m13273((Object) t, j) != 0;
                case 16:
                    return C2509.m13280(t, j) != 0;
                case 17:
                    return C2509.m13271(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int r82 = m10030(i);
            return (C2509.m13273((Object) t, (long) (r82 & 1048575)) & (1 << (r82 >>> 20))) != 0;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m10060(T t, int i) {
        if (!this.f9311) {
            int r5 = m10030(i);
            long j = (long) (r5 & 1048575);
            C2509.m13265((Object) t, j, C2509.m13273((Object) t, j) | (1 << (r5 >>> 20)));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean m10040(T t, int i, int i2) {
        return C2509.m13273((Object) t, (long) (m10030(i2) & 1048575)) == i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m10061(T t, int i, int i2) {
        C2509.m13265((Object) t, (long) (m10030(i2) & 1048575), i);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final int m10067(int i) {
        if (i < this.f9315 || i > this.f9316) {
            return -1;
        }
        return m10041(i, 0);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final int m10048(int i, int i2) {
        if (i < this.f9315 || i > this.f9316) {
            return -1;
        }
        return m10041(i, i2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int m10041(int i, int i2) {
        int length = (this.f9306.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f9306[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
