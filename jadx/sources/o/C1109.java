package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import o.C0742;

/* renamed from: o.ɔɩ  reason: contains not printable characters */
public final class C1109 {

    /* renamed from: ı  reason: contains not printable characters */
    public C0742<PointF, PointF> f6573;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Matrix f6574 = new Matrix();

    /* renamed from: ǃ  reason: contains not printable characters */
    public C0742<?, PointF> f6575;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final float[] f6576;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0742<Integer, Integer> f6577;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final Matrix f6578;

    /* renamed from: ɹ  reason: contains not printable characters */
    public C0965 f6579;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final Matrix f6580;

    /* renamed from: Ι  reason: contains not printable characters */
    public C0742<Float, Float> f6581;

    /* renamed from: ι  reason: contains not printable characters */
    public C0742<C0957, C0957> f6582;

    /* renamed from: І  reason: contains not printable characters */
    public C0742<?, Float> f6583;

    /* renamed from: і  reason: contains not printable characters */
    public C0965 f6584;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public C0742<?, Float> f6585;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final Matrix f6586;

    public C1109(C1360 r4) {
        C0742<PointF, PointF> r0;
        C0742<PointF, PointF> r02;
        C1079 r2;
        C0965 r22;
        C0965 r03;
        C0965 r04;
        if (r4.f7539 == null) {
            r0 = null;
        } else {
            r0 = r4.f7539.m8245();
        }
        this.f6573 = r0;
        if (r4.f7537 == null) {
            r02 = null;
        } else {
            r02 = r4.f7537.m8665();
        }
        this.f6575 = r02;
        if (r4.f7542 == null) {
            r2 = null;
        } else {
            r2 = new C1079(r4.f7542.f7684);
        }
        this.f6582 = r2;
        if (r4.f7543 == null) {
            r22 = null;
        } else {
            r22 = new C0965(r4.f7543.f7684);
        }
        this.f6581 = r22;
        if (r4.f7541 == null) {
            r03 = null;
        } else {
            r03 = new C0965(r4.f7541.f7684);
        }
        this.f6584 = r03;
        if (this.f6584 != null) {
            this.f6586 = new Matrix();
            this.f6578 = new Matrix();
            this.f6580 = new Matrix();
            this.f6576 = new float[9];
        } else {
            this.f6586 = null;
            this.f6578 = null;
            this.f6580 = null;
            this.f6576 = null;
        }
        if (r4.f7538 == null) {
            r04 = null;
        } else {
            r04 = new C0965(r4.f7538.f7684);
        }
        this.f6579 = r04;
        if (r4.f7540 != null) {
            this.f6577 = new C0865(r4.f7540.f7684);
        }
        if (r4.f7545 != null) {
            this.f6585 = new C0965(r4.f7545.f7684);
        } else {
            this.f6585 = null;
        }
        if (r4.f7544 != null) {
            this.f6583 = new C0965(r4.f7544.f7684);
        } else {
            this.f6583 = null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m7510(C1578 r3) {
        C0742<Integer, Integer> r0 = this.f6577;
        if (r0 != null) {
            r3.f8389.add(r0);
        }
        C0742<?, Float> r02 = this.f6585;
        if (r02 != null) {
            r3.f8389.add(r02);
        }
        C0742<?, Float> r03 = this.f6583;
        if (r03 != null) {
            r3.f8389.add(r03);
        }
        C0742<PointF, PointF> r04 = this.f6573;
        if (r04 != null) {
            r3.f8389.add(r04);
        }
        C0742<?, PointF> r05 = this.f6575;
        if (r05 != null) {
            r3.f8389.add(r05);
        }
        C0742<C0957, C0957> r06 = this.f6582;
        if (r06 != null) {
            r3.f8389.add(r06);
        }
        C0742<Float, Float> r07 = this.f6581;
        if (r07 != null) {
            r3.f8389.add(r07);
        }
        C0965 r08 = this.f6584;
        if (r08 != null) {
            r3.f8389.add(r08);
        }
        C0965 r09 = this.f6579;
        if (r09 != null) {
            r3.f8389.add(r09);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7511(C0742.C0744 r2) {
        C0742<Integer, Integer> r0 = this.f6577;
        if (r0 != null) {
            r0.f5002.add(r2);
        }
        C0742<?, Float> r02 = this.f6585;
        if (r02 != null) {
            r02.f5002.add(r2);
        }
        C0742<?, Float> r03 = this.f6583;
        if (r03 != null) {
            r03.f5002.add(r2);
        }
        C0742<PointF, PointF> r04 = this.f6573;
        if (r04 != null) {
            r04.f5002.add(r2);
        }
        C0742<?, PointF> r05 = this.f6575;
        if (r05 != null) {
            r05.f5002.add(r2);
        }
        C0742<C0957, C0957> r06 = this.f6582;
        if (r06 != null) {
            r06.f5002.add(r2);
        }
        C0742<Float, Float> r07 = this.f6581;
        if (r07 != null) {
            r07.f5002.add(r2);
        }
        C0965 r08 = this.f6584;
        if (r08 != null) {
            r08.f5002.add(r2);
        }
        C0965 r09 = this.f6579;
        if (r09 != null) {
            r09.f5002.add(r2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Matrix m7509() {
        float f;
        this.f6574.reset();
        C0742<?, PointF> r0 = this.f6575;
        if (r0 != null) {
            PointF r02 = r0.m5937();
            if (!(r02.x == 0.0f && r02.y == 0.0f)) {
                this.f6574.preTranslate(r02.x, r02.y);
            }
        }
        C0742<Float, Float> r03 = this.f6581;
        if (r03 != null) {
            if (r03 instanceof C1120) {
                f = r03.m5937().floatValue();
            } else {
                f = ((C0965) r03).m6884();
            }
            if (f != 0.0f) {
                this.f6574.preRotate(f);
            }
        }
        if (this.f6584 != null) {
            C0965 r04 = this.f6579;
            float cos = r04 == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-r04.m6884()) + 90.0f)));
            C0965 r4 = this.f6579;
            float sin = r4 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-r4.m6884()) + 90.0f)));
            float tan = (float) Math.tan(Math.toRadians((double) this.f6584.m6884()));
            for (int i = 0; i < 9; i++) {
                this.f6576[i] = 0.0f;
            }
            float[] fArr = this.f6576;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f6586.setValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                this.f6576[i2] = 0.0f;
            }
            float[] fArr2 = this.f6576;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f6578.setValues(fArr2);
            for (int i3 = 0; i3 < 9; i3++) {
                this.f6576[i3] = 0.0f;
            }
            float[] fArr3 = this.f6576;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f6580.setValues(fArr3);
            this.f6578.preConcat(this.f6586);
            this.f6580.preConcat(this.f6578);
            this.f6574.preConcat(this.f6580);
        }
        C0742<C0957, C0957> r05 = this.f6582;
        if (r05 != null) {
            C0957 r06 = r05.m5937();
            if (!(r06.f5954 == 1.0f && r06.f5955 == 1.0f)) {
                this.f6574.preScale(r06.f5954, r06.f5955);
            }
        }
        C0742<PointF, PointF> r07 = this.f6573;
        if (r07 != null) {
            PointF r08 = r07.m5937();
            if (!(r08.x == 0.0f && r08.y == 0.0f)) {
                this.f6574.preTranslate(-r08.x, -r08.y);
            }
        }
        return this.f6574;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Matrix m7512(float f) {
        C0742<?, PointF> r0 = this.f6575;
        PointF pointF = null;
        PointF r02 = r0 == null ? null : r0.m5937();
        C0742<C0957, C0957> r2 = this.f6582;
        C0957 r22 = r2 == null ? null : r2.m5937();
        this.f6574.reset();
        if (r02 != null) {
            this.f6574.preTranslate(r02.x * f, r02.y * f);
        }
        if (r22 != null) {
            double d = (double) f;
            this.f6574.preScale((float) Math.pow((double) r22.f5954, d), (float) Math.pow((double) r22.f5955, d));
        }
        C0742<Float, Float> r03 = this.f6581;
        if (r03 != null) {
            float floatValue = r03.m5937().floatValue();
            C0742<PointF, PointF> r23 = this.f6573;
            if (r23 != null) {
                pointF = r23.m5937();
            }
            Matrix matrix = this.f6574;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f6574;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> boolean m7508(T t, C2476<T> r5) {
        C0965 r4;
        C0965 r0;
        C0742<?, Float> r02;
        C0742<?, Float> r03;
        if (t == C0349.f3757) {
            C0742<PointF, PointF> r42 = this.f6573;
            if (r42 == null) {
                new PointF();
                this.f6573 = new C1120(r5, (byte) 0);
                return true;
            }
            r42.m5932(r5);
            return true;
        } else if (t == C0349.f3777) {
            C0742<?, PointF> r43 = this.f6575;
            if (r43 == null) {
                new PointF();
                this.f6575 = new C1120(r5, (byte) 0);
                return true;
            }
            r43.m5932(r5);
            return true;
        } else if (t == C0349.f3764) {
            C0742<C0957, C0957> r44 = this.f6582;
            if (r44 == null) {
                this.f6582 = new C1120(r5, (byte) 0);
                return true;
            }
            r44.m5932(r5);
            return true;
        } else if (t == C0349.f3778) {
            C0742<Float, Float> r45 = this.f6581;
            if (r45 == null) {
                this.f6581 = new C1120(r5, (byte) 0);
                return true;
            }
            r45.m5932(r5);
            return true;
        } else if (t == C0349.f3772) {
            C0742<Integer, Integer> r46 = this.f6577;
            if (r46 == null) {
                this.f6577 = new C1120(r5, (byte) 0);
                return true;
            }
            r46.m5932(r5);
            return true;
        } else if (t != C0349.f3759 || (r03 = this.f6585) == null) {
            if (t != C0349.f3766 || (r02 = this.f6583) == null) {
                if (t == C0349.f3758 && (r0 = this.f6584) != null) {
                    if (r0 == null) {
                        this.f6584 = new C0965(Collections.singletonList(new C2463(Float.valueOf(0.0f))));
                    }
                    this.f6584.m5932(r5);
                    return true;
                } else if (t != C0349.f3762 || (r4 = this.f6579) == null) {
                    return false;
                } else {
                    if (r4 == null) {
                        this.f6579 = new C0965(Collections.singletonList(new C2463(Float.valueOf(0.0f))));
                    }
                    this.f6579.m5932(r5);
                    return true;
                }
            } else if (r02 == null) {
                this.f6583 = new C1120(r5, (byte) 0);
                return true;
            } else {
                r02.m5932(r5);
                return true;
            }
        } else if (r03 == null) {
            this.f6585 = new C1120(r5, (byte) 0);
            return true;
        } else {
            r03.m5932(r5);
            return true;
        }
    }
}
