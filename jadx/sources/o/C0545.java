package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.C0742;
import o.C1559;

/* renamed from: o.łΙ  reason: contains not printable characters */
public abstract class C0545 implements C0742.C0744, C1214, C0648 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Path f4407 = new Path();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C0742<?, Float> f4408;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Paint f4409 = new C0552(1);

    /* renamed from: ȷ  reason: contains not printable characters */
    private final List<C0742<?, Float>> f4410;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C0742<?, Integer> f4411;

    /* renamed from: ɩ  reason: contains not printable characters */
    protected final C1578 f4412;

    /* renamed from: ɪ  reason: contains not printable characters */
    private C0742<ColorFilter, ColorFilter> f4413;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final RectF f4414 = new RectF();

    /* renamed from: Ι  reason: contains not printable characters */
    private final PathMeasure f4415 = new PathMeasure();

    /* renamed from: ι  reason: contains not printable characters */
    private final Path f4416 = new Path();

    /* renamed from: І  reason: contains not printable characters */
    private final float[] f4417;

    /* renamed from: і  reason: contains not printable characters */
    private final List<If> f4418 = new ArrayList();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C0379 f4419;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C0742<?, Float> f4420;

    C0545(C0379 r3, C1578 r4, Paint.Cap cap, Paint.Join join, float f, C1267 r8, C1282 r9, List<C1282> list, C1282 r11) {
        this.f4419 = r3;
        this.f4412 = r4;
        this.f4409.setStyle(Paint.Style.STROKE);
        this.f4409.setStrokeCap(cap);
        this.f4409.setStrokeJoin(join);
        this.f4409.setStrokeMiter(f);
        this.f4411 = new C0865(r8.f7684);
        this.f4408 = new C0965(r9.f7684);
        if (r11 == null) {
            this.f4420 = null;
        } else {
            this.f4420 = new C0965(r11.f7684);
        }
        this.f4410 = new ArrayList(list.size());
        this.f4417 = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f4410.add(new C0965(list.get(i).f7684));
        }
        C0742<?, Integer> r5 = this.f4411;
        if (r5 != null) {
            r4.f8389.add(r5);
        }
        C0742<?, Float> r52 = this.f4408;
        if (r52 != null) {
            r4.f8389.add(r52);
        }
        for (int i2 = 0; i2 < this.f4410.size(); i2++) {
            C0742 r6 = this.f4410.get(i2);
            if (r6 != null) {
                r4.f8389.add(r6);
            }
        }
        C0742<?, Float> r53 = this.f4420;
        if (!(r53 == null || r53 == null)) {
            r4.f8389.add(r53);
        }
        this.f4411.f5002.add(this);
        this.f4408.f5002.add(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f4410.get(i3).f5002.add(this);
        }
        C0742<?, Float> r32 = this.f4420;
        if (r32 != null) {
            r32.f5002.add(this);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5127() {
        this.f4419.invalidateSelf();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5132(List<C0550> list, List<C0550> list2) {
        If ifR = null;
        C0851 r2 = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C0550 r3 = list.get(size);
            if (r3 instanceof C0851) {
                C0851 r32 = (C0851) r3;
                if (r32.f5560 == C1559.If.INDIVIDUALLY) {
                    r2 = r32;
                }
            }
        }
        if (r2 != null) {
            r2.f5561.add(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C0550 r0 = list2.get(size2);
            if (r0 instanceof C0851) {
                C0851 r33 = (C0851) r0;
                if (r33.f5560 == C1559.If.INDIVIDUALLY) {
                    if (ifR != null) {
                        this.f4418.add(ifR);
                    }
                    If ifR2 = new If(r33, (byte) 0);
                    r33.f5561.add(this);
                    ifR = ifR2;
                }
            }
            if (r0 instanceof C0707) {
                if (ifR == null) {
                    ifR = new If(r2, (byte) 0);
                }
                ifR.f4422.add((C0707) r0);
            }
        }
        if (ifR != null) {
            this.f4418.add(ifR);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m5129(Canvas canvas, Matrix matrix, int i) {
        C2921.m15081();
        if (C2467.m12717(matrix)) {
            C2921.m15080();
            return;
        }
        this.f4409.setAlpha(C2493.m13236((int) ((((((float) i) / 255.0f) * ((float) ((C0865) this.f4411).m6430())) / 100.0f) * 255.0f)));
        this.f4409.setStrokeWidth(((C0965) this.f4408).m6884() * C2467.m12712(matrix));
        float f = 0.0f;
        if (this.f4409.getStrokeWidth() <= 0.0f) {
            C2921.m15080();
            return;
        }
        C2921.m15081();
        if (this.f4410.isEmpty()) {
            C2921.m15080();
        } else {
            float r9 = C2467.m12712(matrix);
            for (int i2 = 0; i2 < this.f4410.size(); i2++) {
                this.f4417[i2] = ((Float) this.f4410.get(i2).m5937()).floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr = this.f4417;
                    if (fArr[i2] < 1.0f) {
                        fArr[i2] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.f4417;
                    if (fArr2[i2] < 0.1f) {
                        fArr2[i2] = 0.1f;
                    }
                }
                float[] fArr3 = this.f4417;
                fArr3[i2] = fArr3[i2] * r9;
            }
            C0742<?, Float> r2 = this.f4420;
            if (r2 != null) {
                f = r2.m5937().floatValue() * r9;
            }
            this.f4409.setPathEffect(new DashPathEffect(this.f4417, f));
            C2921.m15080();
        }
        C0742<ColorFilter, ColorFilter> r92 = this.f4413;
        if (r92 != null) {
            this.f4409.setColorFilter(r92.m5937());
        }
        for (int i3 = 0; i3 < this.f4418.size(); i3++) {
            If ifR = this.f4418.get(i3);
            if (ifR.f4421 != null) {
                m5126(canvas, ifR, matrix);
            } else {
                C2921.m15081();
                this.f4407.reset();
                for (int size = ifR.f4422.size() - 1; size >= 0; size--) {
                    this.f4407.addPath(ifR.f4422.get(size).m5819(), matrix);
                }
                C2921.m15080();
                C2921.m15081();
                canvas.drawPath(this.f4407, this.f4409);
                C2921.m15080();
            }
        }
        C2921.m15080();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m5126(Canvas canvas, If ifR, Matrix matrix) {
        float f;
        C2921.m15081();
        if (ifR.f4421 == null) {
            C2921.m15080();
            return;
        }
        this.f4407.reset();
        for (int size = ifR.f4422.size() - 1; size >= 0; size--) {
            this.f4407.addPath(ifR.f4422.get(size).m5819(), matrix);
        }
        this.f4415.setPath(this.f4407, false);
        float length = this.f4415.getLength();
        while (this.f4415.nextContour()) {
            length += this.f4415.getLength();
        }
        float floatValue = (ifR.f4421.f5566.m5937().floatValue() * length) / 360.0f;
        float floatValue2 = ((ifR.f4421.f5565.m5937().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((ifR.f4421.f5564.m5937().floatValue() * length) / 100.0f) + floatValue;
        float f2 = 0.0f;
        for (int size2 = ifR.f4422.size() - 1; size2 >= 0; size2--) {
            this.f4416.set(ifR.f4422.get(size2).m5819());
            this.f4416.transform(matrix);
            this.f4415.setPath(this.f4416, false);
            float length2 = this.f4415.getLength();
            float f3 = 1.0f;
            if (floatValue3 > length) {
                float f4 = floatValue3 - length;
                if (f4 < f2 + length2 && f2 < f4) {
                    f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                    f3 = Math.min(f4 / length2, 1.0f);
                    C2467.m12715(this.f4416, f, f3, 0.0f);
                    canvas.drawPath(this.f4416, this.f4409);
                    f2 += length2;
                }
            }
            float f5 = f2 + length2;
            if (f5 >= floatValue2 && f2 <= floatValue3) {
                if (f5 > floatValue3 || floatValue2 >= f2) {
                    f = floatValue2 < f2 ? 0.0f : (floatValue2 - f2) / length2;
                    if (floatValue3 <= f5) {
                        f3 = (floatValue3 - f2) / length2;
                    }
                    C2467.m12715(this.f4416, f, f3, 0.0f);
                    canvas.drawPath(this.f4416, this.f4409);
                } else {
                    canvas.drawPath(this.f4416, this.f4409);
                }
            }
            f2 += length2;
        }
        C2921.m15080();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5130(RectF rectF, Matrix matrix, boolean z) {
        C2921.m15081();
        this.f4407.reset();
        for (int i = 0; i < this.f4418.size(); i++) {
            If ifR = this.f4418.get(i);
            for (int i2 = 0; i2 < ifR.f4422.size(); i2++) {
                this.f4407.addPath(ifR.f4422.get(i2).m5819(), matrix);
            }
        }
        this.f4407.computeBounds(this.f4414, false);
        float r7 = ((C0965) this.f4408).m6884();
        RectF rectF2 = this.f4414;
        float f = r7 / 2.0f;
        rectF2.set(rectF2.left - f, this.f4414.top - f, this.f4414.right + f, this.f4414.bottom + f);
        rectF.set(this.f4414);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C2921.m15080();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5131(C1695 r1, int i, List<C1695> list, C1695 r4) {
        C2493.m13241(r1, i, list, r4, this);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public <T> void m5128(T t, C2476<T> r3) {
        if (t == C0349.f3763) {
            this.f4411.m5932(r3);
        } else if (t == C0349.f3768) {
            this.f4408.m5932(r3);
        } else if (t == C0349.f3761) {
            C0742<ColorFilter, ColorFilter> r2 = this.f4413;
            if (r2 != null) {
                this.f4412.f8389.remove(r2);
            }
            if (r3 == null) {
                this.f4413 = null;
                return;
            }
            this.f4413 = new C1120(r3);
            this.f4413.f5002.add(this);
            C1578 r22 = this.f4412;
            C0742<ColorFilter, ColorFilter> r32 = this.f4413;
            if (r32 != null) {
                r22.f8389.add(r32);
            }
        }
    }

    /* renamed from: o.łΙ$If */
    static final class If {

        /* renamed from: ǃ  reason: contains not printable characters */
        final C0851 f4421;

        /* renamed from: ɩ  reason: contains not printable characters */
        final List<C0707> f4422;

        /* synthetic */ If(C0851 r1, byte b) {
            this(r1);
        }

        private If(C0851 r2) {
            this.f4422 = new ArrayList();
            this.f4421 = r2;
        }
    }
}
