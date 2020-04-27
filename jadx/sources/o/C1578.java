package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C0742;
import o.C1463;
import o.C1685;
import o.C2771;
import o.C2864;

/* renamed from: o.ʀ  reason: contains not printable characters */
public abstract class C1578 implements C0648, C0742.C0744, C1214 {

    /* renamed from: ı  reason: contains not printable characters */
    final C0379 f8384;

    /* renamed from: ŀ  reason: contains not printable characters */
    private C2771.C2774 f8385;

    /* renamed from: ł  reason: contains not printable characters */
    private final RectF f8386;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final C1109 f8387;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private List<C1578> f8388;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<C0742<?, ?>> f8389;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final RectF f8390;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final Paint f8391;

    /* renamed from: ɩ  reason: contains not printable characters */
    C0965 f8392;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final Paint f8393;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Path f8394 = new Path();

    /* renamed from: ɾ  reason: contains not printable characters */
    private final Paint f8395;

    /* renamed from: ɿ  reason: contains not printable characters */
    private C1578 f8396;

    /* renamed from: ʅ  reason: contains not printable characters */
    private C1578 f8397;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final RectF f8398;

    /* renamed from: Ι  reason: contains not printable characters */
    final Matrix f8399;

    /* renamed from: ι  reason: contains not printable characters */
    final C1685 f8400;

    /* renamed from: І  reason: contains not printable characters */
    private final Paint f8401;

    /* renamed from: г  reason: contains not printable characters */
    private final RectF f8402;

    /* renamed from: і  reason: contains not printable characters */
    boolean f8403;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Matrix f8404 = new Matrix();

    /* renamed from: ӏ  reason: contains not printable characters */
    private final Paint f8405;

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m9250(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m9252(C1695 r1, int i, List<C1695> list, C1695 r4) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9260(List<C0550> list, List<C0550> list2) {
    }

    C1578(C0379 r5, C1685 r6) {
        boolean z = true;
        this.f8401 = new C0552(1);
        this.f8391 = new C0552(PorterDuff.Mode.DST_IN, (byte) 0);
        this.f8393 = new C0552(PorterDuff.Mode.DST_OUT, (byte) 0);
        this.f8405 = new C0552(1);
        this.f8395 = new C0552(PorterDuff.Mode.CLEAR);
        this.f8390 = new RectF();
        this.f8398 = new RectF();
        this.f8386 = new RectF();
        this.f8402 = new RectF();
        this.f8399 = new Matrix();
        this.f8389 = new ArrayList();
        this.f8403 = true;
        this.f8384 = r5;
        this.f8400 = r6;
        if (r6.f8733 == C1685.C1686.INVERT) {
            this.f8405.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.f8405.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.f8387 = new C1109(r6.f8723);
        this.f8387.m7511(this);
        if (r6.f8740 != null && !r6.f8740.isEmpty()) {
            this.f8385 = new C2771.C2774(r6.f8740);
            for (C0742<C2864.Cif, Path> r62 : this.f8385.f13143) {
                r62.f5002.add(this);
            }
            for (C0742 next : this.f8385.f13144) {
                if (next != null) {
                    this.f8389.add(next);
                }
                next.f5002.add(this);
            }
        }
        if (!this.f8400.f8732.isEmpty()) {
            this.f8392 = new C0965(this.f8400.f8732);
            C0965 r52 = this.f8392;
            r52.f5005 = true;
            r52.f5002.add(new C0742.C0744() {
                /* renamed from: ı  reason: contains not printable characters */
                public final void m9261() {
                    C1578 r0 = C1578.this;
                    boolean z = r0.f8392.m6884() == 1.0f;
                    if (z != r0.f8403) {
                        r0.f8403 = z;
                        r0.f8384.invalidateSelf();
                    }
                }
            });
            z = ((Float) this.f8392.m5937()).floatValue() != 1.0f ? false : z;
            if (z != this.f8403) {
                this.f8403 = z;
                this.f8384.invalidateSelf();
            }
            C0965 r53 = this.f8392;
            if (r53 != null) {
                this.f8389.add(r53);
            }
        } else if (true != this.f8403) {
            this.f8403 = true;
            this.f8384.invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9258(C1578 r1) {
        this.f8396 = r1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9251(C1578 r1) {
        this.f8397 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m9256(RectF rectF, Matrix matrix, boolean z) {
        this.f8390.set(0.0f, 0.0f, 0.0f, 0.0f);
        m9248();
        this.f8399.set(matrix);
        if (z) {
            List<C1578> list = this.f8388;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f8399.preConcat(this.f8388.get(size).f8387.m7509());
                }
            } else {
                C1578 r2 = this.f8397;
                if (r2 != null) {
                    this.f8399.preConcat(r2.f8387.m7509());
                }
            }
        }
        this.f8399.preConcat(this.f8387.m7509());
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d4  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m9255(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            o.C2921.m15081()
            boolean r3 = r0.f8403
            if (r3 == 0) goto L_0x0449
            o.ʟɹ r3 = r0.f8400
            boolean r3 = r3.f8724
            if (r3 == 0) goto L_0x0015
            goto L_0x0449
        L_0x0015:
            r17.m9248()
            o.C2921.m15081()
            android.graphics.Matrix r3 = r0.f8404
            r3.reset()
            android.graphics.Matrix r3 = r0.f8404
            r3.set(r2)
            java.util.List<o.ʀ> r3 = r0.f8388
            int r3 = r3.size()
            r4 = 1
            int r3 = r3 - r4
        L_0x002d:
            if (r3 < 0) goto L_0x0045
            android.graphics.Matrix r5 = r0.f8404
            java.util.List<o.ʀ> r6 = r0.f8388
            java.lang.Object r6 = r6.get(r3)
            o.ʀ r6 = (o.C1578) r6
            o.ɔɩ r6 = r6.f8387
            android.graphics.Matrix r6 = r6.m7509()
            r5.preConcat(r6)
            int r3 = r3 + -1
            goto L_0x002d
        L_0x0045:
            o.C2921.m15080()
            o.ɔɩ r3 = r0.f8387
            o.ƚΙ<java.lang.Integer, java.lang.Integer> r3 = r3.f6577
            if (r3 != 0) goto L_0x0055
            r3 = 100
            r3 = r20
            r5 = 100
            goto L_0x0066
        L_0x0055:
            o.ɔɩ r3 = r0.f8387
            o.ƚΙ<java.lang.Integer, java.lang.Integer> r3 = r3.f6577
            java.lang.Object r3 = r3.m5937()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5 = r3
            r3 = r20
        L_0x0066:
            float r3 = (float) r3
            r6 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 / r6
            float r5 = (float) r5
            float r3 = r3 * r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r5
            float r3 = r3 * r6
            int r3 = (int) r3
            o.ʀ r5 = r0.f8396
            r6 = 0
            if (r5 == 0) goto L_0x007a
            r5 = 1
            goto L_0x007b
        L_0x007a:
            r5 = 0
        L_0x007b:
            if (r5 != 0) goto L_0x00b5
            o.Ӏǃ$ɩ r5 = r0.f8385
            if (r5 == 0) goto L_0x008b
            java.util.List<o.ƚΙ<o.ӌ$if, android.graphics.Path>> r5 = r5.f13143
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x008b
            r5 = 1
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            if (r5 != 0) goto L_0x00b5
            android.graphics.Matrix r2 = r0.f8404
            o.ɔɩ r4 = r0.f8387
            android.graphics.Matrix r4 = r4.m7509()
            r2.preConcat(r4)
            o.C2921.m15081()
            android.graphics.Matrix r2 = r0.f8404
            r0.m9250(r1, r2, r3)
            o.C2921.m15080()
            o.C2921.m15080()
            o.ıΓ r1 = r0.f8384
            o.ıɭ r1 = r1.f3879
            o.ıӷ r1 = r1.f3731
            o.ʟɹ r2 = r0.f8400
            java.lang.String r2 = r2.f8735
            r1.m4764(r2)
            return
        L_0x00b5:
            o.C2921.m15081()
            android.graphics.RectF r5 = r0.f8390
            android.graphics.Matrix r7 = r0.f8404
            r0.m9256((android.graphics.RectF) r5, (android.graphics.Matrix) r7, (boolean) r6)
            android.graphics.RectF r5 = r0.f8390
            o.ʀ r7 = r0.f8396
            if (r7 == 0) goto L_0x00c7
            r7 = 1
            goto L_0x00c8
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            r8 = 0
            if (r7 == 0) goto L_0x00ea
            o.ʟɹ r7 = r0.f8400
            o.ʟɹ$ǃ r7 = r7.f8733
            o.ʟɹ$ǃ r9 = o.C1685.C1686.INVERT
            if (r7 == r9) goto L_0x00ea
            android.graphics.RectF r7 = r0.f8386
            r7.set(r8, r8, r8, r8)
            o.ʀ r7 = r0.f8396
            android.graphics.RectF r9 = r0.f8386
            r7.m9256((android.graphics.RectF) r9, (android.graphics.Matrix) r2, (boolean) r4)
            android.graphics.RectF r7 = r0.f8386
            boolean r7 = r5.intersect(r7)
            if (r7 != 0) goto L_0x00ea
            r5.set(r8, r8, r8, r8)
        L_0x00ea:
            android.graphics.Matrix r5 = r0.f8404
            o.ɔɩ r7 = r0.f8387
            android.graphics.Matrix r7 = r7.m7509()
            r5.preConcat(r7)
            android.graphics.RectF r5 = r0.f8390
            android.graphics.Matrix r7 = r0.f8404
            android.graphics.RectF r9 = r0.f8398
            r9.set(r8, r8, r8, r8)
            o.Ӏǃ$ɩ r9 = r0.f8385
            if (r9 == 0) goto L_0x010c
            java.util.List<o.ƚΙ<o.ӌ$if, android.graphics.Path>> r9 = r9.f13143
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x010c
            r9 = 1
            goto L_0x010d
        L_0x010c:
            r9 = 0
        L_0x010d:
            r10 = 4
            r11 = 3
            r12 = 2
            if (r9 == 0) goto L_0x01b1
            o.Ӏǃ$ɩ r9 = r0.f8385
            java.util.List<o.ɹȷ> r9 = r9.f13145
            int r9 = r9.size()
            r13 = 0
        L_0x011b:
            if (r13 >= r9) goto L_0x01a4
            o.Ӏǃ$ɩ r14 = r0.f8385
            java.util.List<o.ɹȷ> r14 = r14.f13145
            java.lang.Object r14 = r14.get(r13)
            o.ɹȷ r14 = (o.C1463) r14
            o.Ӏǃ$ɩ r15 = r0.f8385
            java.util.List<o.ƚΙ<o.ӌ$if, android.graphics.Path>> r15 = r15.f13143
            java.lang.Object r15 = r15.get(r13)
            o.ƚΙ r15 = (o.C0742) r15
            java.lang.Object r15 = r15.m5937()
            android.graphics.Path r15 = (android.graphics.Path) r15
            android.graphics.Path r8 = r0.f8394
            r8.set(r15)
            android.graphics.Path r8 = r0.f8394
            r8.transform(r7)
            int[] r8 = o.C1578.AnonymousClass5.f8407
            o.ɹȷ$If r15 = r14.f7881
            int r15 = r15.ordinal()
            r8 = r8[r15]
            if (r8 == r4) goto L_0x01b1
            if (r8 == r12) goto L_0x01b1
            if (r8 == r11) goto L_0x0154
            if (r8 == r10) goto L_0x0154
            goto L_0x0158
        L_0x0154:
            boolean r8 = r14.f7882
            if (r8 != 0) goto L_0x01b1
        L_0x0158:
            android.graphics.Path r8 = r0.f8394
            android.graphics.RectF r14 = r0.f8402
            r8.computeBounds(r14, r6)
            if (r13 != 0) goto L_0x0169
            android.graphics.RectF r8 = r0.f8398
            android.graphics.RectF r14 = r0.f8402
            r8.set(r14)
            goto L_0x019c
        L_0x0169:
            android.graphics.RectF r8 = r0.f8398
            float r14 = r8.left
            android.graphics.RectF r15 = r0.f8402
            float r15 = r15.left
            float r14 = java.lang.Math.min(r14, r15)
            android.graphics.RectF r15 = r0.f8398
            float r15 = r15.top
            android.graphics.RectF r6 = r0.f8402
            float r6 = r6.top
            float r6 = java.lang.Math.min(r15, r6)
            android.graphics.RectF r15 = r0.f8398
            float r15 = r15.right
            android.graphics.RectF r10 = r0.f8402
            float r10 = r10.right
            float r10 = java.lang.Math.max(r15, r10)
            android.graphics.RectF r15 = r0.f8398
            float r15 = r15.bottom
            android.graphics.RectF r11 = r0.f8402
            float r11 = r11.bottom
            float r11 = java.lang.Math.max(r15, r11)
            r8.set(r14, r6, r10, r11)
        L_0x019c:
            int r13 = r13 + 1
            r6 = 0
            r8 = 0
            r10 = 4
            r11 = 3
            goto L_0x011b
        L_0x01a4:
            android.graphics.RectF r6 = r0.f8398
            boolean r6 = r5.intersect(r6)
            if (r6 != 0) goto L_0x01b1
            r6 = 0
            r5.set(r6, r6, r6, r6)
            goto L_0x01b2
        L_0x01b1:
            r6 = 0
        L_0x01b2:
            android.graphics.RectF r5 = r0.f8390
            int r7 = r18.getWidth()
            float r7 = (float) r7
            int r8 = r18.getHeight()
            float r8 = (float) r8
            boolean r5 = r5.intersect(r6, r6, r7, r8)
            if (r5 != 0) goto L_0x01c9
            android.graphics.RectF r5 = r0.f8390
            r5.set(r6, r6, r6, r6)
        L_0x01c9:
            o.C2921.m15080()
            android.graphics.RectF r5 = r0.f8390
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0438
            o.C2921.m15081()
            android.graphics.Paint r5 = r0.f8401
            r6 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r6)
            android.graphics.RectF r5 = r0.f8390
            android.graphics.Paint r7 = r0.f8401
            o.C2467.m12714(r1, r5, r7)
            o.C2921.m15080()
            r17.m9247((android.graphics.Canvas) r18)
            o.C2921.m15081()
            android.graphics.Matrix r5 = r0.f8404
            r0.m9250(r1, r5, r3)
            o.C2921.m15080()
            o.Ӏǃ$ɩ r5 = r0.f8385
            if (r5 == 0) goto L_0x0204
            java.util.List<o.ƚΙ<o.ӌ$if, android.graphics.Path>> r5 = r5.f13143
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0204
            r5 = 1
            goto L_0x0205
        L_0x0204:
            r5 = 0
        L_0x0205:
            r7 = 19
            if (r5 == 0) goto L_0x0400
            android.graphics.Matrix r5 = r0.f8404
            o.C2921.m15081()
            android.graphics.RectF r8 = r0.f8390
            android.graphics.Paint r9 = r0.f8391
            o.C2467.m12710(r1, r8, r9, r7)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 >= r9) goto L_0x021e
            r17.m9247((android.graphics.Canvas) r18)
        L_0x021e:
            o.C2921.m15080()
            r8 = 0
        L_0x0222:
            o.Ӏǃ$ɩ r9 = r0.f8385
            java.util.List<o.ɹȷ> r9 = r9.f13145
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x03f7
            o.Ӏǃ$ɩ r9 = r0.f8385
            java.util.List<o.ɹȷ> r9 = r9.f13145
            java.lang.Object r9 = r9.get(r8)
            o.ɹȷ r9 = (o.C1463) r9
            o.Ӏǃ$ɩ r10 = r0.f8385
            java.util.List<o.ƚΙ<o.ӌ$if, android.graphics.Path>> r10 = r10.f13143
            java.lang.Object r10 = r10.get(r8)
            o.ƚΙ r10 = (o.C0742) r10
            o.Ӏǃ$ɩ r11 = r0.f8385
            java.util.List<o.ƚΙ<java.lang.Integer, java.lang.Integer>> r11 = r11.f13144
            java.lang.Object r11 = r11.get(r8)
            o.ƚΙ r11 = (o.C0742) r11
            int[] r13 = o.C1578.AnonymousClass5.f8407
            o.ɹȷ$If r14 = r9.f7881
            int r14 = r14.ordinal()
            r13 = r13[r14]
            if (r13 == r4) goto L_0x03b7
            r14 = 1076048691(0x40233333, float:2.55)
            if (r13 == r12) goto L_0x0348
            r15 = 3
            if (r13 == r15) goto L_0x02d0
            r4 = 4
            if (r13 == r4) goto L_0x0263
            goto L_0x03f2
        L_0x0263:
            boolean r9 = r9.f7882
            if (r9 == 0) goto L_0x02a4
            android.graphics.RectF r9 = r0.f8390
            android.graphics.Paint r13 = r0.f8401
            o.C2467.m12714(r1, r9, r13)
            android.graphics.RectF r9 = r0.f8390
            android.graphics.Paint r13 = r0.f8401
            r1.drawRect(r9, r13)
            java.lang.Object r9 = r10.m5937()
            android.graphics.Path r9 = (android.graphics.Path) r9
            android.graphics.Path r10 = r0.f8394
            r10.set(r9)
            android.graphics.Path r9 = r0.f8394
            r9.transform(r5)
            android.graphics.Paint r9 = r0.f8401
            java.lang.Object r10 = r11.m5937()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            float r10 = r10 * r14
            int r10 = (int) r10
            r9.setAlpha(r10)
            android.graphics.Path r9 = r0.f8394
            android.graphics.Paint r10 = r0.f8393
            r1.drawPath(r9, r10)
            r18.restore()
            goto L_0x03f2
        L_0x02a4:
            java.lang.Object r9 = r10.m5937()
            android.graphics.Path r9 = (android.graphics.Path) r9
            android.graphics.Path r10 = r0.f8394
            r10.set(r9)
            android.graphics.Path r9 = r0.f8394
            r9.transform(r5)
            android.graphics.Paint r9 = r0.f8401
            java.lang.Object r10 = r11.m5937()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            float r10 = r10 * r14
            int r10 = (int) r10
            r9.setAlpha(r10)
            android.graphics.Path r9 = r0.f8394
            android.graphics.Paint r10 = r0.f8401
            r1.drawPath(r9, r10)
            goto L_0x03f2
        L_0x02d0:
            r4 = 4
            boolean r9 = r9.f7882
            if (r9 == 0) goto L_0x0312
            android.graphics.RectF r9 = r0.f8390
            android.graphics.Paint r13 = r0.f8391
            o.C2467.m12714(r1, r9, r13)
            android.graphics.RectF r9 = r0.f8390
            android.graphics.Paint r13 = r0.f8401
            r1.drawRect(r9, r13)
            android.graphics.Paint r9 = r0.f8393
            java.lang.Object r11 = r11.m5937()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            float r11 = r11 * r14
            int r11 = (int) r11
            r9.setAlpha(r11)
            java.lang.Object r9 = r10.m5937()
            android.graphics.Path r9 = (android.graphics.Path) r9
            android.graphics.Path r10 = r0.f8394
            r10.set(r9)
            android.graphics.Path r9 = r0.f8394
            r9.transform(r5)
            android.graphics.Path r9 = r0.f8394
            android.graphics.Paint r10 = r0.f8393
            r1.drawPath(r9, r10)
            r18.restore()
            goto L_0x03f2
        L_0x0312:
            android.graphics.RectF r9 = r0.f8390
            android.graphics.Paint r13 = r0.f8391
            o.C2467.m12714(r1, r9, r13)
            java.lang.Object r9 = r10.m5937()
            android.graphics.Path r9 = (android.graphics.Path) r9
            android.graphics.Path r10 = r0.f8394
            r10.set(r9)
            android.graphics.Path r9 = r0.f8394
            r9.transform(r5)
            android.graphics.Paint r9 = r0.f8401
            java.lang.Object r10 = r11.m5937()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            float r10 = (float) r10
            float r10 = r10 * r14
            int r10 = (int) r10
            r9.setAlpha(r10)
            android.graphics.Path r9 = r0.f8394
            android.graphics.Paint r10 = r0.f8401
            r1.drawPath(r9, r10)
            r18.restore()
            goto L_0x03f2
        L_0x0348:
            r4 = 4
            r15 = 3
            if (r8 != 0) goto L_0x035f
            android.graphics.Paint r13 = r0.f8401
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r13.setColor(r4)
            android.graphics.Paint r4 = r0.f8401
            r4.setAlpha(r6)
            android.graphics.RectF r4 = r0.f8390
            android.graphics.Paint r13 = r0.f8401
            r1.drawRect(r4, r13)
        L_0x035f:
            boolean r4 = r9.f7882
            if (r4 == 0) goto L_0x039f
            android.graphics.RectF r4 = r0.f8390
            android.graphics.Paint r9 = r0.f8393
            o.C2467.m12714(r1, r4, r9)
            android.graphics.RectF r4 = r0.f8390
            android.graphics.Paint r9 = r0.f8401
            r1.drawRect(r4, r9)
            android.graphics.Paint r4 = r0.f8393
            java.lang.Object r9 = r11.m5937()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r9 = r9 * r14
            int r9 = (int) r9
            r4.setAlpha(r9)
            java.lang.Object r4 = r10.m5937()
            android.graphics.Path r4 = (android.graphics.Path) r4
            android.graphics.Path r9 = r0.f8394
            r9.set(r4)
            android.graphics.Path r4 = r0.f8394
            r4.transform(r5)
            android.graphics.Path r4 = r0.f8394
            android.graphics.Paint r9 = r0.f8393
            r1.drawPath(r4, r9)
            r18.restore()
            goto L_0x03f2
        L_0x039f:
            java.lang.Object r4 = r10.m5937()
            android.graphics.Path r4 = (android.graphics.Path) r4
            android.graphics.Path r9 = r0.f8394
            r9.set(r4)
            android.graphics.Path r4 = r0.f8394
            r4.transform(r5)
            android.graphics.Path r4 = r0.f8394
            android.graphics.Paint r9 = r0.f8393
            r1.drawPath(r4, r9)
            goto L_0x03f2
        L_0x03b7:
            r15 = 3
            o.Ӏǃ$ɩ r4 = r0.f8385
            java.util.List<o.ƚΙ<o.ӌ$if, android.graphics.Path>> r4 = r4.f13143
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x03c4
        L_0x03c2:
            r4 = 0
            goto L_0x03e4
        L_0x03c4:
            r4 = 0
        L_0x03c5:
            o.Ӏǃ$ɩ r9 = r0.f8385
            java.util.List<o.ɹȷ> r9 = r9.f13145
            int r9 = r9.size()
            if (r4 >= r9) goto L_0x03e3
            o.Ӏǃ$ɩ r9 = r0.f8385
            java.util.List<o.ɹȷ> r9 = r9.f13145
            java.lang.Object r9 = r9.get(r4)
            o.ɹȷ r9 = (o.C1463) r9
            o.ɹȷ$If r9 = r9.f7881
            o.ɹȷ$If r10 = o.C1463.If.MASK_MODE_NONE
            if (r9 == r10) goto L_0x03e0
            goto L_0x03c2
        L_0x03e0:
            int r4 = r4 + 1
            goto L_0x03c5
        L_0x03e3:
            r4 = 1
        L_0x03e4:
            if (r4 == 0) goto L_0x03f2
            android.graphics.Paint r4 = r0.f8401
            r4.setAlpha(r6)
            android.graphics.RectF r4 = r0.f8390
            android.graphics.Paint r9 = r0.f8401
            r1.drawRect(r4, r9)
        L_0x03f2:
            int r8 = r8 + 1
            r4 = 1
            goto L_0x0222
        L_0x03f7:
            o.C2921.m15081()
            r18.restore()
            o.C2921.m15080()
        L_0x0400:
            o.ʀ r4 = r0.f8396
            if (r4 == 0) goto L_0x0407
            r16 = 1
            goto L_0x0409
        L_0x0407:
            r16 = 0
        L_0x0409:
            if (r16 == 0) goto L_0x042f
            o.C2921.m15081()
            o.C2921.m15081()
            android.graphics.RectF r4 = r0.f8390
            android.graphics.Paint r5 = r0.f8405
            o.C2467.m12710(r1, r4, r5, r7)
            o.C2921.m15080()
            r17.m9247((android.graphics.Canvas) r18)
            o.ʀ r4 = r0.f8396
            r4.m9255((android.graphics.Canvas) r1, (android.graphics.Matrix) r2, (int) r3)
            o.C2921.m15081()
            r18.restore()
            o.C2921.m15080()
            o.C2921.m15080()
        L_0x042f:
            o.C2921.m15081()
            r18.restore()
            o.C2921.m15080()
        L_0x0438:
            o.C2921.m15080()
            o.ıΓ r1 = r0.f8384
            o.ıɭ r1 = r1.f3879
            o.ıӷ r1 = r1.f3731
            o.ʟɹ r2 = r0.f8400
            java.lang.String r2 = r2.f8735
            r1.m4764(r2)
            return
        L_0x0449:
            o.C2921.m15080()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1578.m9255(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m9247(Canvas canvas) {
        C2921.m15081();
        canvas.drawRect(this.f8390.left - 1.0f, this.f8390.top - 1.0f, this.f8390.right + 1.0f, this.f8390.bottom + 1.0f, this.f8395);
        C2921.m15080();
    }

    /* renamed from: o.ʀ$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ı  reason: contains not printable characters */
        static final /* synthetic */ int[] f8407 = new int[C1463.If.values().length];

        /* renamed from: ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f8408 = new int[C1685.If.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0048 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007c */
        static {
            /*
                o.ɹȷ$If[] r0 = o.C1463.If.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8407 = r0
                r0 = 1
                int[] r1 = f8407     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.ɹȷ$If r2 = o.C1463.If.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f8407     // Catch:{ NoSuchFieldError -> 0x001f }
                o.ɹȷ$If r3 = o.C1463.If.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f8407     // Catch:{ NoSuchFieldError -> 0x002a }
                o.ɹȷ$If r4 = o.C1463.If.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f8407     // Catch:{ NoSuchFieldError -> 0x0035 }
                o.ɹȷ$If r5 = o.C1463.If.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                o.ʟɹ$If[] r4 = o.C1685.If.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f8408 = r4
                int[] r4 = f8408     // Catch:{ NoSuchFieldError -> 0x0048 }
                o.ʟɹ$If r5 = o.C1685.If.SHAPE     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                int[] r0 = f8408     // Catch:{ NoSuchFieldError -> 0x0052 }
                o.ʟɹ$If r4 = o.C1685.If.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = f8408     // Catch:{ NoSuchFieldError -> 0x005c }
                o.ʟɹ$If r1 = o.C1685.If.SOLID     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f8408     // Catch:{ NoSuchFieldError -> 0x0066 }
                o.ʟɹ$If r1 = o.C1685.If.IMAGE     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                int[] r0 = f8408     // Catch:{ NoSuchFieldError -> 0x0071 }
                o.ʟɹ$If r1 = o.C1685.If.NULL     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f8408     // Catch:{ NoSuchFieldError -> 0x007c }
                o.ʟɹ$If r1 = o.C1685.If.TEXT     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                int[] r0 = f8408     // Catch:{ NoSuchFieldError -> 0x0087 }
                o.ʟɹ$If r1 = o.C1685.If.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C1578.AnonymousClass5.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public void m9259(float f) {
        C1109 r0 = this.f8387;
        if (r0.f6577 != null) {
            r0.f6577.m5934(f);
        }
        if (r0.f6585 != null) {
            r0.f6585.m5934(f);
        }
        if (r0.f6583 != null) {
            r0.f6583.m5934(f);
        }
        if (r0.f6573 != null) {
            r0.f6573.m5934(f);
        }
        if (r0.f6575 != null) {
            r0.f6575.m5934(f);
        }
        if (r0.f6582 != null) {
            r0.f6582.m5934(f);
        }
        if (r0.f6581 != null) {
            r0.f6581.m5934(f);
        }
        if (r0.f6584 != null) {
            r0.f6584.m5934(f);
        }
        if (r0.f6579 != null) {
            r0.f6579.m5934(f);
        }
        if (this.f8385 != null) {
            for (int i = 0; i < this.f8385.f13143.size(); i++) {
                this.f8385.f13143.get(i).m5934(f);
            }
        }
        if (this.f8400.f8731 != 0.0f) {
            f /= this.f8400.f8731;
        }
        C0965 r02 = this.f8392;
        if (r02 != null) {
            r02.m5934(f / this.f8400.f8731);
        }
        C1578 r03 = this.f8396;
        if (r03 != null) {
            this.f8396.m9259(r03.f8400.f8731 * f);
        }
        for (int i2 = 0; i2 < this.f8389.size(); i2++) {
            this.f8389.get(i2).m5934(f);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m9248() {
        if (this.f8388 == null) {
            if (this.f8397 == null) {
                this.f8388 = Collections.emptyList();
                return;
            }
            this.f8388 = new ArrayList();
            for (C1578 r0 = this.f8397; r0 != null; r0 = r0.f8397) {
                this.f8388.add(r0);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m9254() {
        return this.f8400.f8735;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public <T> void m9253(T t, C2476<T> r3) {
        this.f8387.m7508(t, r3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9249() {
        this.f8384.invalidateSelf();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9257(C1695 r3, int i, List<C1695> list, C1695 r6) {
        if (r3.m9617(this.f8400.f8735, i)) {
            if (!"__container".equals(this.f8400.f8735)) {
                String str = this.f8400.f8735;
                C1695 r1 = new C1695(r6);
                r1.f8806.add(str);
                if (r3.m9618(this.f8400.f8735, i)) {
                    C1695 r62 = new C1695(r1);
                    r62.f8807 = this;
                    list.add(r62);
                }
                r6 = r1;
            }
            if (r3.m9615(this.f8400.f8735, i)) {
                m9252(r3, i + r3.m9616(this.f8400.f8735, i), list, r6);
            }
        }
    }
}
