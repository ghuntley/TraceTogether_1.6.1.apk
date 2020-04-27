package o;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import o.C2715;

/* renamed from: o.ſі  reason: contains not printable characters */
public final class C0597 extends C0545 {

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean f4538;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C1485 f4539;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C0742<PointF, PointF> f4540;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final int f4541;

    /* renamed from: ɾ  reason: contains not printable characters */
    private C1120 f4542;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f4543;

    /* renamed from: ι  reason: contains not printable characters */
    private final C0782<LinearGradient> f4544 = new C0782<>();

    /* renamed from: І  reason: contains not printable characters */
    private final C0742<C2715.Cif, C2715.Cif> f4545;

    /* renamed from: і  reason: contains not printable characters */
    private final RectF f4546 = new RectF();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C0782<RadialGradient> f4547 = new C0782<>();

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C0742<PointF, PointF> f4548;

    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r8v3, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m5269(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f4538
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            android.graphics.RectF r2 = r0.f4546
            r3 = 0
            r0.m5130((android.graphics.RectF) r2, (android.graphics.Matrix) r1, (boolean) r3)
            o.ɻı r2 = r0.f4539
            o.ɻı r3 = o.C1485.LINEAR
            r4 = 0
            if (r2 != r3) goto L_0x005d
            int r2 = r16.m5265()
            o.Ƭ<android.graphics.LinearGradient> r3 = r0.f4544
            long r5 = (long) r2
            java.lang.Object r2 = r3.m6119(r5, r4)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x0027
            goto L_0x00ab
        L_0x0027:
            o.ƚΙ<android.graphics.PointF, android.graphics.PointF> r2 = r0.f4540
            java.lang.Object r2 = r2.m5937()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            o.ƚΙ<android.graphics.PointF, android.graphics.PointF> r3 = r0.f4548
            java.lang.Object r3 = r3.m5937()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            o.ƚΙ<o.ҫ$if, o.ҫ$if> r4 = r0.f4545
            java.lang.Object r4 = r4.m5937()
            o.ҫ$if r4 = (o.C2715.Cif) r4
            int[] r7 = r4.f12563
            int[] r13 = r0.m5266(r7)
            float[] r14 = r4.f12564
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            o.Ƭ<android.graphics.LinearGradient> r3 = r0.f4544
            r3.m6116(r5, r2)
            goto L_0x00ab
        L_0x005d:
            int r2 = r16.m5265()
            o.Ƭ<android.graphics.RadialGradient> r3 = r0.f4547
            long r5 = (long) r2
            java.lang.Object r2 = r3.m6119(r5, r4)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x006d
            goto L_0x00ab
        L_0x006d:
            o.ƚΙ<android.graphics.PointF, android.graphics.PointF> r2 = r0.f4540
            java.lang.Object r2 = r2.m5937()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            o.ƚΙ<android.graphics.PointF, android.graphics.PointF> r3 = r0.f4548
            java.lang.Object r3 = r3.m5937()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            o.ƚΙ<o.ҫ$if, o.ҫ$if> r4 = r0.f4545
            java.lang.Object r4 = r4.m5937()
            o.ҫ$if r4 = (o.C2715.Cif) r4
            int[] r7 = r4.f12563
            int[] r12 = r0.m5266(r7)
            float[] r13 = r4.f12564
            float r9 = r2.x
            float r10 = r2.y
            float r2 = r3.x
            float r3 = r3.y
            float r2 = r2 - r9
            double r7 = (double) r2
            float r3 = r3 - r10
            double r2 = (double) r3
            double r2 = java.lang.Math.hypot(r7, r2)
            float r11 = (float) r2
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            o.Ƭ<android.graphics.RadialGradient> r3 = r0.f4547
            r3.m6116(r5, r2)
        L_0x00ab:
            r2.setLocalMatrix(r1)
            android.graphics.Paint r3 = r0.f4409
            r3.setShader(r2)
            super.m5129((android.graphics.Canvas) r17, (android.graphics.Matrix) r18, (int) r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0597.m5269(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5268() {
        return this.f4543;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m5265() {
        int round = Math.round(this.f4540.m5938() * ((float) this.f4541));
        int round2 = Math.round(this.f4548.m5938() * ((float) this.f4541));
        int round3 = Math.round(this.f4545.m5938() * ((float) this.f4541));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int[] m5266(int[] iArr) {
        C1120 r0 = this.f4542;
        if (r0 != null) {
            Integer[] numArr = (Integer[]) r0.m5937();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5267(T t, C2476<T> r3) {
        super.m5128(t, r3);
        if (t == C0349.f3760) {
            if (this.f4542 != null) {
                C1578 r2 = this.f4412;
                r2.f8389.remove(this.f4542);
            }
            if (r3 == null) {
                this.f4542 = null;
                return;
            }
            this.f4542 = new C1120(r3);
            this.f4542.f5002.add(this);
            C1578 r22 = this.f4412;
            C1120 r32 = this.f4542;
            if (r32 != null) {
                r22.f8389.add(r32);
            }
        }
    }

    public C0597(C0379 r12, C1578 r13, C1496 r14) {
        super(r12, r13, r14.f7997.m9057(), r14.f7996.m9058(), r14.f7987, r14.f7986, r14.f7998, r14.f7989, r14.f7990);
        this.f4543 = r14.f7988;
        this.f4539 = r14.f7994;
        this.f4538 = r14.f7992;
        C0343 r122 = r12.f3879;
        this.f4541 = (int) (((float) ((long) (((r122.f3730 - r122.f3725) / r122.f3726) * 1000.0f))) / 32.0f);
        this.f4545 = new C0952(r14.f7995.f7684);
        this.f4545.f5002.add(this);
        C0742<C2715.Cif, C2715.Cif> r123 = this.f4545;
        if (r123 != null) {
            r13.f8389.add(r123);
        }
        this.f4540 = new C1090(r14.f7991.f7684);
        this.f4540.f5002.add(this);
        C0742<PointF, PointF> r124 = this.f4540;
        if (r124 != null) {
            r13.f8389.add(r124);
        }
        this.f4548 = new C1090(r14.f7993.f7684);
        this.f4548.f5002.add(this);
        C0742<PointF, PointF> r125 = this.f4548;
        if (r125 != null) {
            r13.f8389.add(r125);
        }
    }
}
