package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import o.C0742;
import o.C1559;
import o.C1567;
import o.C2771;

/* renamed from: o.Ɩɪ  reason: contains not printable characters */
public final class C0652 implements C0707, C0742.C0744, C1214 {

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean f4679;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C0742<?, Float> f4680;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0379 f4681;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C0742<?, Float> f4682;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f4683;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final C0742<?, Float> f4684;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C0742<?, PointF> f4685;

    /* renamed from: ɾ  reason: contains not printable characters */
    private C2771.C2772 f4686 = new C2771.C2772();

    /* renamed from: Ι  reason: contains not printable characters */
    private final Path f4687 = new Path();

    /* renamed from: ι  reason: contains not printable characters */
    private final C1567.If f4688;

    /* renamed from: І  reason: contains not printable characters */
    private final C0742<?, Float> f4689;

    /* renamed from: і  reason: contains not printable characters */
    private final C0742<?, Float> f4690;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C0742<?, Float> f4691;

    /* renamed from: ӏ  reason: contains not printable characters */
    private boolean f4692;

    public C0652(C0379 r2, C1578 r3, C1567 r4) {
        this.f4681 = r2;
        this.f4683 = r4.f8322;
        this.f4688 = r4.f8320;
        this.f4679 = r4.f8328;
        this.f4680 = new C0965(r4.f8326.f7684);
        this.f4685 = r4.f8323.m8665();
        this.f4689 = new C0965(r4.f8325.f7684);
        this.f4691 = new C0965(r4.f8321.f7684);
        this.f4682 = new C0965(r4.f8324.f7684);
        if (this.f4688 == C1567.If.STAR) {
            this.f4690 = new C0965(r4.f8327.f7684);
            this.f4684 = new C0965(r4.f8329.f7684);
        } else {
            this.f4690 = null;
            this.f4684 = null;
        }
        C0742<?, Float> r22 = this.f4680;
        if (r22 != null) {
            r3.f8389.add(r22);
        }
        C0742<?, PointF> r23 = this.f4685;
        if (r23 != null) {
            r3.f8389.add(r23);
        }
        C0742<?, Float> r24 = this.f4689;
        if (r24 != null) {
            r3.f8389.add(r24);
        }
        C0742<?, Float> r25 = this.f4691;
        if (r25 != null) {
            r3.f8389.add(r25);
        }
        C0742<?, Float> r26 = this.f4682;
        if (r26 != null) {
            r3.f8389.add(r26);
        }
        if (this.f4688 == C1567.If.STAR) {
            C0742<?, Float> r27 = this.f4690;
            if (r27 != null) {
                r3.f8389.add(r27);
            }
            C0742<?, Float> r28 = this.f4684;
            if (r28 != null) {
                r3.f8389.add(r28);
            }
        }
        this.f4680.f5002.add(this);
        this.f4685.f5002.add(this);
        this.f4689.f5002.add(this);
        this.f4691.f5002.add(this);
        this.f4682.f5002.add(this);
        if (this.f4688 == C1567.If.STAR) {
            this.f4690.f5002.add(this);
            this.f4684.f5002.add(this);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5467(List<C0550> list, List<C0550> list2) {
        for (int i = 0; i < list.size(); i++) {
            C0550 r0 = list.get(i);
            if (r0 instanceof C0851) {
                C0851 r02 = (C0851) r0;
                if (r02.f5560 == C1559.If.SIMULTANEOUSLY) {
                    this.f4686.f13126.add(r02);
                    r02.f5561.add(this);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0274  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Path m5463() {
        /*
            r44 = this;
            r0 = r44
            boolean r1 = r0.f4692
            if (r1 == 0) goto L_0x0009
            android.graphics.Path r1 = r0.f4687
            return r1
        L_0x0009:
            android.graphics.Path r1 = r0.f4687
            r1.reset()
            boolean r1 = r0.f4679
            r2 = 1
            if (r1 == 0) goto L_0x0018
            r0.f4692 = r2
            android.graphics.Path r1 = r0.f4687
            return r1
        L_0x0018:
            int[] r1 = o.C0652.AnonymousClass1.f4693
            o.ɿɹ$If r3 = r0.f4688
            int r3 = r3.ordinal()
            r1 = r1[r3]
            r3 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r5 = 4636033603912859648(0x4056800000000000, double:90.0)
            r7 = 0
            r10 = 1120403456(0x42c80000, float:100.0)
            r13 = 0
            if (r1 == r2) goto L_0x0135
            r14 = 2
            if (r1 == r14) goto L_0x0038
            goto L_0x032c
        L_0x0038:
            o.ƚΙ<?, java.lang.Float> r1 = r0.f4680
            java.lang.Object r1 = r1.m5937()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            double r14 = (double) r1
            double r14 = java.lang.Math.floor(r14)
            int r1 = (int) r14
            o.ƚΙ<?, java.lang.Float> r14 = r0.f4689
            if (r14 != 0) goto L_0x004f
            goto L_0x005a
        L_0x004f:
            java.lang.Object r7 = r14.m5937()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            double r7 = (double) r7
        L_0x005a:
            double r7 = r7 - r5
            double r5 = java.lang.Math.toRadians(r7)
            double r7 = (double) r1
            double r3 = r3 / r7
            float r1 = (float) r3
            o.ƚΙ<?, java.lang.Float> r3 = r0.f4682
            java.lang.Object r3 = r3.m5937()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            float r3 = r3 / r10
            o.ƚΙ<?, java.lang.Float> r4 = r0.f4691
            java.lang.Object r4 = r4.m5937()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            double r14 = (double) r4
            double r16 = java.lang.Math.cos(r5)
            double r9 = r14 * r16
            float r9 = (float) r9
            double r16 = java.lang.Math.sin(r5)
            double r11 = r14 * r16
            float r10 = (float) r11
            android.graphics.Path r11 = r0.f4687
            r11.moveTo(r9, r10)
            double r11 = (double) r1
            double r5 = r5 + r11
            double r7 = java.lang.Math.ceil(r7)
            r17 = r3
            r1 = 0
        L_0x0098:
            double r2 = (double) r1
            int r18 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r18 >= 0) goto L_0x011d
            double r2 = java.lang.Math.cos(r5)
            double r2 = r2 * r14
            float r2 = (float) r2
            double r19 = java.lang.Math.sin(r5)
            r26 = r7
            double r7 = r14 * r19
            float r3 = (float) r7
            int r7 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0107
            double r7 = (double) r10
            r28 = r14
            double r13 = (double) r9
            double r7 = java.lang.Math.atan2(r7, r13)
            r13 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r7 = r7 - r13
            float r7 = (float) r7
            double r7 = (double) r7
            double r13 = java.lang.Math.cos(r7)
            float r13 = (float) r13
            double r7 = java.lang.Math.sin(r7)
            float r7 = (float) r7
            double r14 = (double) r3
            r30 = r5
            double r5 = (double) r2
            double r5 = java.lang.Math.atan2(r14, r5)
            r14 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r5 = r5 - r14
            float r5 = (float) r5
            double r5 = (double) r5
            double r14 = java.lang.Math.cos(r5)
            float r8 = (float) r14
            double r5 = java.lang.Math.sin(r5)
            float r5 = (float) r5
            float r6 = r4 * r17
            r14 = 1048576000(0x3e800000, float:0.25)
            float r6 = r6 * r14
            float r13 = r13 * r6
            float r7 = r7 * r6
            float r8 = r8 * r6
            float r6 = r6 * r5
            android.graphics.Path r5 = r0.f4687
            float r20 = r9 - r13
            float r21 = r10 - r7
            float r22 = r2 + r8
            float r23 = r3 + r6
            r19 = r5
            r24 = r2
            r25 = r3
            r19.cubicTo(r20, r21, r22, r23, r24, r25)
            goto L_0x0110
        L_0x0107:
            r30 = r5
            r28 = r14
            android.graphics.Path r5 = r0.f4687
            r5.lineTo(r2, r3)
        L_0x0110:
            double r5 = r30 + r11
            int r1 = r1 + 1
            r9 = r2
            r10 = r3
            r7 = r26
            r14 = r28
            r13 = 0
            goto L_0x0098
        L_0x011d:
            o.ƚΙ<?, android.graphics.PointF> r1 = r0.f4685
            java.lang.Object r1 = r1.m5937()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.Path r2 = r0.f4687
            float r3 = r1.x
            float r1 = r1.y
            r2.offset(r3, r1)
            android.graphics.Path r1 = r0.f4687
            r1.close()
            goto L_0x032c
        L_0x0135:
            o.ƚΙ<?, java.lang.Float> r1 = r0.f4680
            java.lang.Object r1 = r1.m5937()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            o.ƚΙ<?, java.lang.Float> r2 = r0.f4689
            if (r2 != 0) goto L_0x0146
            goto L_0x0151
        L_0x0146:
            java.lang.Object r2 = r2.m5937()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            double r7 = (double) r2
        L_0x0151:
            double r7 = r7 - r5
            double r5 = java.lang.Math.toRadians(r7)
            double r7 = (double) r1
            double r3 = r3 / r7
            float r2 = (float) r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r2 / r3
            int r9 = (int) r1
            float r9 = (float) r9
            float r1 = r1 - r9
            r9 = 0
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x016c
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r1
            float r9 = r9 * r4
            double r12 = (double) r9
            double r5 = r5 + r12
        L_0x016c:
            o.ƚΙ<?, java.lang.Float> r9 = r0.f4691
            java.lang.Object r9 = r9.m5937()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            o.ƚΙ<?, java.lang.Float> r12 = r0.f4690
            java.lang.Object r12 = r12.m5937()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            o.ƚΙ<?, java.lang.Float> r13 = r0.f4684
            if (r13 == 0) goto L_0x0194
            java.lang.Object r13 = r13.m5937()
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            float r13 = r13 / r10
            goto L_0x0195
        L_0x0194:
            r13 = 0
        L_0x0195:
            o.ƚΙ<?, java.lang.Float> r14 = r0.f4682
            if (r14 == 0) goto L_0x01a6
            java.lang.Object r14 = r14.m5937()
            java.lang.Float r14 = (java.lang.Float) r14
            float r14 = r14.floatValue()
            float r10 = r14 / r10
            goto L_0x01a7
        L_0x01a6:
            r10 = 0
        L_0x01a7:
            if (r11 == 0) goto L_0x01d6
            float r14 = r9 - r12
            float r14 = r14 * r1
            float r14 = r14 + r12
            r17 = r4
            double r3 = (double) r14
            double r19 = java.lang.Math.cos(r5)
            r21 = r14
            double r14 = r3 * r19
            float r14 = (float) r14
            double r19 = java.lang.Math.sin(r5)
            double r3 = r3 * r19
            float r3 = (float) r3
            android.graphics.Path r4 = r0.f4687
            r4.moveTo(r14, r3)
            float r4 = r2 * r1
            r15 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r15
            r19 = r3
            double r3 = (double) r4
            double r5 = r5 + r3
            r4 = r17
            r3 = r19
            r17 = r14
            goto L_0x01f4
        L_0x01d6:
            r17 = r4
            double r3 = (double) r9
            double r19 = java.lang.Math.cos(r5)
            double r14 = r3 * r19
            float r14 = (float) r14
            double r19 = java.lang.Math.sin(r5)
            double r3 = r3 * r19
            float r3 = (float) r3
            android.graphics.Path r4 = r0.f4687
            r4.moveTo(r14, r3)
            r4 = r17
            r17 = r14
            double r14 = (double) r4
            double r5 = r5 + r14
            r21 = 0
        L_0x01f4:
            double r7 = java.lang.Math.ceil(r7)
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = r7 * r14
            r19 = r5
            r5 = r17
            r18 = 0
            r6 = r3
            r3 = 0
        L_0x0204:
            double r14 = (double) r3
            int r17 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r17 >= 0) goto L_0x0316
            if (r18 == 0) goto L_0x020e
            r17 = r9
            goto L_0x0210
        L_0x020e:
            r17 = r12
        L_0x0210:
            r25 = 0
            int r26 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r26 == 0) goto L_0x022e
            r23 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r28 = r7 - r23
            int r25 = (r14 > r28 ? 1 : (r14 == r28 ? 0 : -1))
            if (r25 != 0) goto L_0x022b
            float r25 = r2 * r1
            r22 = 1073741824(0x40000000, float:2.0)
            float r25 = r25 / r22
            r43 = r25
            r25 = r2
            r2 = r43
            goto L_0x0235
        L_0x022b:
            r22 = 1073741824(0x40000000, float:2.0)
            goto L_0x0232
        L_0x022e:
            r22 = 1073741824(0x40000000, float:2.0)
            r23 = 4611686018427387904(0x4000000000000000, double:2.0)
        L_0x0232:
            r25 = r2
            r2 = r4
        L_0x0235:
            r28 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r26 == 0) goto L_0x0246
            double r26 = r7 - r28
            int r30 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r30 != 0) goto L_0x0246
            r26 = r4
            r30 = r14
            r4 = r21
            goto L_0x024c
        L_0x0246:
            r26 = r4
            r30 = r14
            r4 = r17
        L_0x024c:
            double r14 = (double) r4
            double r32 = java.lang.Math.cos(r19)
            r34 = r7
            double r7 = r14 * r32
            float r4 = (float) r7
            double r7 = java.lang.Math.sin(r19)
            double r14 = r14 * r7
            float r7 = (float) r14
            r8 = 0
            int r14 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0274
            int r14 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x0274
            android.graphics.Path r5 = r0.f4687
            r5.lineTo(r4, r7)
            r17 = r9
            r15 = r10
            r27 = r12
            r32 = r13
            goto L_0x02fe
        L_0x0274:
            double r14 = (double) r6
            r17 = r9
            double r8 = (double) r5
            double r8 = java.lang.Math.atan2(r14, r8)
            r14 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r8 = r8 - r14
            float r8 = (float) r8
            double r8 = (double) r8
            double r14 = java.lang.Math.cos(r8)
            float r14 = (float) r14
            double r8 = java.lang.Math.sin(r8)
            float r8 = (float) r8
            r15 = r10
            double r9 = (double) r7
            r27 = r12
            r32 = r13
            double r12 = (double) r4
            double r9 = java.lang.Math.atan2(r9, r12)
            r12 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r9 = r9 - r12
            float r9 = (float) r9
            double r9 = (double) r9
            double r12 = java.lang.Math.cos(r9)
            float r12 = (float) r12
            double r9 = java.lang.Math.sin(r9)
            float r9 = (float) r9
            if (r18 == 0) goto L_0x02b0
            r10 = r32
            goto L_0x02b1
        L_0x02b0:
            r10 = r15
        L_0x02b1:
            if (r18 == 0) goto L_0x02b5
            r13 = r15
            goto L_0x02b7
        L_0x02b5:
            r13 = r32
        L_0x02b7:
            if (r18 == 0) goto L_0x02bc
            r33 = r27
            goto L_0x02be
        L_0x02bc:
            r33 = r17
        L_0x02be:
            if (r18 == 0) goto L_0x02c3
            r36 = r17
            goto L_0x02c5
        L_0x02c3:
            r36 = r27
        L_0x02c5:
            float r33 = r33 * r10
            r10 = 1056236141(0x3ef4e26d, float:0.47829)
            float r33 = r33 * r10
            float r14 = r14 * r33
            float r33 = r33 * r8
            float r36 = r36 * r13
            float r36 = r36 * r10
            float r12 = r12 * r36
            float r36 = r36 * r9
            if (r11 == 0) goto L_0x02eb
            if (r3 != 0) goto L_0x02e1
            float r14 = r14 * r1
            float r33 = r33 * r1
            goto L_0x02eb
        L_0x02e1:
            double r8 = r34 - r28
            int r10 = (r30 > r8 ? 1 : (r30 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x02eb
            float r12 = r12 * r1
            float r36 = r36 * r1
        L_0x02eb:
            android.graphics.Path r8 = r0.f4687
            float r37 = r5 - r14
            float r38 = r6 - r33
            float r39 = r4 + r12
            float r40 = r7 + r36
            r36 = r8
            r41 = r4
            r42 = r7
            r36.cubicTo(r37, r38, r39, r40, r41, r42)
        L_0x02fe:
            double r5 = (double) r2
            double r19 = r19 + r5
            r18 = r18 ^ 1
            int r3 = r3 + 1
            r5 = r4
            r6 = r7
            r10 = r15
            r9 = r17
            r2 = r25
            r4 = r26
            r12 = r27
            r13 = r32
            r7 = r34
            goto L_0x0204
        L_0x0316:
            o.ƚΙ<?, android.graphics.PointF> r1 = r0.f4685
            java.lang.Object r1 = r1.m5937()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.Path r2 = r0.f4687
            float r3 = r1.x
            float r1 = r1.y
            r2.offset(r3, r1)
            android.graphics.Path r1 = r0.f4687
            r1.close()
        L_0x032c:
            android.graphics.Path r1 = r0.f4687
            r1.close()
            o.Ӏǃ$ı r1 = r0.f4686
            android.graphics.Path r2 = r0.f4687
            r1.m14662(r2)
            r1 = 1
            r0.f4692 = r1
            android.graphics.Path r1 = r0.f4687
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0652.m5463():android.graphics.Path");
    }

    /* renamed from: o.Ɩɪ$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final /* synthetic */ int[] f4693 = new int[C1567.If.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                o.ɿɹ$If[] r0 = o.C1567.If.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4693 = r0
                int[] r0 = f4693     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ɿɹ$If r1 = o.C1567.If.STAR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4693     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ɿɹ$If r1 = o.C1567.If.POLYGON     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0652.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5465() {
        return this.f4683;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5466(C1695 r1, int i, List<C1695> list, C1695 r4) {
        C2493.m13241(r1, i, list, r4, this);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5464(T t, C2476<T> r3) {
        C0742<?, Float> r0;
        C0742<?, Float> r02;
        if (t == C0349.f3751) {
            this.f4680.m5932(r3);
        } else if (t == C0349.f3775) {
            this.f4689.m5932(r3);
        } else if (t == C0349.f3753) {
            this.f4685.m5932(r3);
        } else if (t == C0349.f3754 && (r02 = this.f4690) != null) {
            r02.m5932(r3);
        } else if (t == C0349.f3755) {
            this.f4691.m5932(r3);
        } else if (t == C0349.f3770 && (r0 = this.f4684) != null) {
            r0.m5932(r3);
        } else if (t == C0349.f3752) {
            this.f4682.m5932(r3);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5462() {
        this.f4692 = false;
        this.f4681.invalidateSelf();
    }
}
