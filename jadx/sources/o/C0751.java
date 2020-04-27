package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import o.C0742;

/* renamed from: o.ƚі  reason: contains not printable characters */
public final class C0751 implements C0648, C0707, C0701, C0742.C0744, C1214 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C1578 f5027;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C1109 f5028;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0379 f5029;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Path f5030 = new Path();

    /* renamed from: ɹ  reason: contains not printable characters */
    private C0592 f5031;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f5032;

    /* renamed from: ι  reason: contains not printable characters */
    private final Matrix f5033 = new Matrix();

    /* renamed from: І  reason: contains not printable characters */
    private final C0742<Float, Float> f5034;

    /* renamed from: і  reason: contains not printable characters */
    private final boolean f5035;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C0742<Float, Float> f5036;

    public C0751(C0379 r2, C1578 r3, C2864 r4) {
        this.f5029 = r2;
        this.f5027 = r3;
        this.f5032 = r4.f13331;
        this.f5035 = r4.f13329;
        this.f5034 = new C0965(r4.f13333.f7684);
        C0742<Float, Float> r22 = this.f5034;
        if (r22 != null) {
            r3.f8389.add(r22);
        }
        this.f5034.f5002.add(this);
        this.f5036 = new C0965(r4.f13332.f7684);
        C0742<Float, Float> r23 = this.f5036;
        if (r23 != null) {
            r3.f8389.add(r23);
        }
        this.f5036.f5002.add(this);
        this.f5028 = new C1109(r4.f13330);
        this.f5028.m7510(r3);
        this.f5028.m7511(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m5999(java.util.ListIterator<o.C0550> r9) {
        /*
            r8 = this;
            o.ſΙ r0 = r8.f5031
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r9.previous()
            if (r0 != r8) goto L_0x0005
        L_0x0011:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0016:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r6)
            o.ſΙ r9 = new o.ſΙ
            o.ıΓ r2 = r8.f5029
            o.ʀ r3 = r8.f5027
            boolean r5 = r8.f5035
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f5031 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0751.m5999(java.util.ListIterator):void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5996() {
        return this.f5032;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6001(List<C0550> list, List<C0550> list2) {
        this.f5031.m5239(list, list2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Path m5994() {
        Path r0 = this.f5031.m5232();
        this.f5030.reset();
        float floatValue = this.f5034.m5937().floatValue();
        float floatValue2 = this.f5036.m5937().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f5033.set(this.f5028.m7512(((float) i) + floatValue2));
            this.f5030.addPath(r0, this.f5033);
        }
        return this.f5030;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5997(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f5034.m5937().floatValue();
        float floatValue2 = this.f5036.m5937().floatValue();
        float floatValue3 = this.f5028.f6585.m5937().floatValue() / 100.0f;
        float floatValue4 = this.f5028.f6583.m5937().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f5033.set(matrix);
            float f = (float) i2;
            this.f5033.preConcat(this.f5028.m7512(f + floatValue2));
            this.f5031.m5235(canvas, this.f5033, (int) (((float) i) * C2493.m13237(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5998(RectF rectF, Matrix matrix, boolean z) {
        this.f5031.m5236(rectF, matrix, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5993() {
        this.f5029.invalidateSelf();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6000(C1695 r1, int i, List<C1695> list, C1695 r4) {
        C2493.m13241(r1, i, list, r4, this);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5995(T t, C2476<T> r3) {
        if (!this.f5028.m7508(t, r3)) {
            if (t == C0349.f3771) {
                this.f5034.m5932(r3);
            } else if (t == C0349.f3750) {
                this.f5036.m5932(r3);
            }
        }
    }
}
