package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.C0742;
import o.C2715;

/* renamed from: o.Ɩɨ  reason: contains not printable characters */
public final class C0650 implements C0648, C0742.C0744, C1214 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f4659;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final int f4660;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Path f4661 = new Path();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1578 f4662;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final C0742<PointF, PointF> f4663;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C0742<Integer, Integer> f4664;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean f4665;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C0742<ColorFilter, ColorFilter> f4666;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C1485 f4667;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final C0742<PointF, PointF> f4668;

    /* renamed from: ʟ  reason: contains not printable characters */
    private C1120 f4669;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0782<RadialGradient> f4670 = new C0782<>();

    /* renamed from: ι  reason: contains not printable characters */
    private final C0782<LinearGradient> f4671 = new C0782<>();

    /* renamed from: І  reason: contains not printable characters */
    private final List<C0707> f4672 = new ArrayList();

    /* renamed from: г  reason: contains not printable characters */
    private final C0379 f4673;

    /* renamed from: і  reason: contains not printable characters */
    private final RectF f4674 = new RectF();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Paint f4675 = new C0552(1);

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C0742<C2715.Cif, C2715.Cif> f4676;

    public C0650(C0379 r3, C1578 r4, C1466 r5) {
        this.f4662 = r4;
        this.f4659 = r5.f7899;
        this.f4665 = r5.f7893;
        this.f4673 = r3;
        this.f4667 = r5.f7897;
        this.f4661.setFillType(r5.f7896);
        C0343 r32 = r3.f3879;
        this.f4660 = (int) (((float) ((long) (((r32.f3730 - r32.f3725) / r32.f3726) * 1000.0f))) / 32.0f);
        this.f4676 = new C0952(r5.f7894.f7684);
        this.f4676.f5002.add(this);
        C0742<C2715.Cif, C2715.Cif> r33 = this.f4676;
        if (r33 != null) {
            r4.f8389.add(r33);
        }
        this.f4664 = new C0865(r5.f7895.f7684);
        this.f4664.f5002.add(this);
        C0742<Integer, Integer> r34 = this.f4664;
        if (r34 != null) {
            r4.f8389.add(r34);
        }
        this.f4668 = new C1090(r5.f7892.f7684);
        this.f4668.f5002.add(this);
        C0742<PointF, PointF> r35 = this.f4668;
        if (r35 != null) {
            r4.f8389.add(r35);
        }
        this.f4663 = new C1090(r5.f7898.f7684);
        this.f4663.f5002.add(this);
        C0742<PointF, PointF> r36 = this.f4663;
        if (r36 != null) {
            r4.f8389.add(r36);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5443() {
        this.f4673.invalidateSelf();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5449(List<C0550> list, List<C0550> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C0550 r0 = list2.get(i);
            if (r0 instanceof C0707) {
                this.f4672.add((C0707) r0);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r2v24, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m5446(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r0.f4665
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            o.C2921.m15081()
            android.graphics.Path r2 = r0.f4661
            r2.reset()
            r2 = 0
            r3 = 0
        L_0x0013:
            java.util.List<o.ƗӀ> r4 = r0.f4672
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002f
            android.graphics.Path r4 = r0.f4661
            java.util.List<o.ƗӀ> r5 = r0.f4672
            java.lang.Object r5 = r5.get(r3)
            o.ƗӀ r5 = (o.C0707) r5
            android.graphics.Path r5 = r5.m5819()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0013
        L_0x002f:
            android.graphics.Path r3 = r0.f4661
            android.graphics.RectF r4 = r0.f4674
            r3.computeBounds(r4, r2)
            o.ɻı r2 = r0.f4667
            o.ɻı r3 = o.C1485.LINEAR
            r4 = 0
            if (r2 != r3) goto L_0x0085
            int r2 = r16.m5442()
            o.Ƭ<android.graphics.LinearGradient> r3 = r0.f4671
            long r5 = (long) r2
            java.lang.Object r2 = r3.m6119(r5, r4)
            android.graphics.LinearGradient r2 = (android.graphics.LinearGradient) r2
            if (r2 == 0) goto L_0x004e
            goto L_0x00e0
        L_0x004e:
            o.ƚΙ<android.graphics.PointF, android.graphics.PointF> r2 = r0.f4668
            java.lang.Object r2 = r2.m5937()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            o.ƚΙ<android.graphics.PointF, android.graphics.PointF> r3 = r0.f4663
            java.lang.Object r3 = r3.m5937()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            o.ƚΙ<o.ҫ$if, o.ҫ$if> r4 = r0.f4676
            java.lang.Object r4 = r4.m5937()
            o.ҫ$if r4 = (o.C2715.Cif) r4
            int[] r7 = r4.f12563
            int[] r13 = r0.m5441(r7)
            float[] r14 = r4.f12564
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            float r9 = r2.x
            float r10 = r2.y
            float r11 = r3.x
            float r12 = r3.y
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            o.Ƭ<android.graphics.LinearGradient> r2 = r0.f4671
            r2.m6116(r5, r4)
            r2 = r4
            goto L_0x00e0
        L_0x0085:
            int r2 = r16.m5442()
            o.Ƭ<android.graphics.RadialGradient> r3 = r0.f4670
            long r5 = (long) r2
            java.lang.Object r2 = r3.m6119(r5, r4)
            android.graphics.RadialGradient r2 = (android.graphics.RadialGradient) r2
            if (r2 == 0) goto L_0x0095
            goto L_0x00e0
        L_0x0095:
            o.ƚΙ<android.graphics.PointF, android.graphics.PointF> r2 = r0.f4668
            java.lang.Object r2 = r2.m5937()
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            o.ƚΙ<android.graphics.PointF, android.graphics.PointF> r3 = r0.f4663
            java.lang.Object r3 = r3.m5937()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            o.ƚΙ<o.ҫ$if, o.ҫ$if> r4 = r0.f4676
            java.lang.Object r4 = r4.m5937()
            o.ҫ$if r4 = (o.C2715.Cif) r4
            int[] r7 = r4.f12563
            int[] r12 = r0.m5441(r7)
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
            float r2 = (float) r2
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x00d2
            r2 = 981668463(0x3a83126f, float:0.001)
            r11 = 981668463(0x3a83126f, float:0.001)
            goto L_0x00d3
        L_0x00d2:
            r11 = r2
        L_0x00d3:
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
            o.Ƭ<android.graphics.RadialGradient> r3 = r0.f4670
            r3.m6116(r5, r2)
        L_0x00e0:
            r2.setLocalMatrix(r1)
            android.graphics.Paint r1 = r0.f4675
            r1.setShader(r2)
            o.ƚΙ<android.graphics.ColorFilter, android.graphics.ColorFilter> r1 = r0.f4666
            if (r1 == 0) goto L_0x00f7
            android.graphics.Paint r2 = r0.f4675
            java.lang.Object r1 = r1.m5937()
            android.graphics.ColorFilter r1 = (android.graphics.ColorFilter) r1
            r2.setColorFilter(r1)
        L_0x00f7:
            r1 = r19
            float r1 = (float) r1
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r2
            o.ƚΙ<java.lang.Integer, java.lang.Integer> r3 = r0.f4664
            java.lang.Object r3 = r3.m5937()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            float r1 = r1 * r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            float r1 = r1 * r2
            int r1 = (int) r1
            android.graphics.Paint r2 = r0.f4675
            int r1 = o.C2493.m13236(r1)
            r2.setAlpha(r1)
            android.graphics.Path r1 = r0.f4661
            android.graphics.Paint r2 = r0.f4675
            r3 = r17
            r3.drawPath(r1, r2)
            o.C2921.m15080()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0650.m5446(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5447(RectF rectF, Matrix matrix, boolean z) {
        this.f4661.reset();
        for (int i = 0; i < this.f4672.size(); i++) {
            this.f4661.addPath(this.f4672.get(i).m5819(), matrix);
        }
        this.f4661.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5445() {
        return this.f4659;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m5442() {
        int round = Math.round(this.f4668.m5938() * ((float) this.f4660));
        int round2 = Math.round(this.f4663.m5938() * ((float) this.f4660));
        int round3 = Math.round(this.f4676.m5938() * ((float) this.f4660));
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private int[] m5441(int[] iArr) {
        C1120 r0 = this.f4669;
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

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5448(C1695 r1, int i, List<C1695> list, C1695 r4) {
        C2493.m13241(r1, i, list, r4, this);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5444(T t, C2476<T> r4) {
        if (t == C0349.f3763) {
            this.f4664.m5932(r4);
        } else if (t == C0349.f3761) {
            C0742<ColorFilter, ColorFilter> r3 = this.f4666;
            if (r3 != null) {
                this.f4662.f8389.remove(r3);
            }
            if (r4 == null) {
                this.f4666 = null;
                return;
            }
            this.f4666 = new C1120(r4);
            this.f4666.f5002.add(this);
            C1578 r32 = this.f4662;
            C0742<ColorFilter, ColorFilter> r42 = this.f4666;
            if (r42 != null) {
                r32.f8389.add(r42);
            }
        } else if (t == C0349.f3760) {
            C1120 r33 = this.f4669;
            if (r33 != null) {
                this.f4662.f8389.remove(r33);
            }
            if (r4 == null) {
                this.f4669 = null;
                return;
            }
            this.f4669 = new C1120(r4);
            this.f4669.f5002.add(this);
            C1578 r34 = this.f4662;
            C1120 r43 = this.f4669;
            if (r43 != null) {
                r34.f8389.add(r43);
            }
        }
    }
}
