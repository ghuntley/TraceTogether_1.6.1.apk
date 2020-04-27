package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* renamed from: o.ƭƚ  reason: contains not printable characters */
public final class C0787 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Matrix[] f5238 = new Matrix[4];

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C0723 f5239 = new C0723();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final PointF f5240 = new PointF();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Matrix[] f5241 = new Matrix[4];

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Path f5242 = new Path();

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0723[] f5243 = new C0723[4];

    /* renamed from: ι  reason: contains not printable characters */
    private final Path f5244 = new Path();

    /* renamed from: І  reason: contains not printable characters */
    private final float[] f5245 = new float[2];

    /* renamed from: і  reason: contains not printable characters */
    private boolean f5246 = true;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final float[] f5247 = new float[2];

    /* renamed from: o.ƭƚ$ı  reason: contains not printable characters */
    public interface C0788 {
        /* renamed from: ı  reason: contains not printable characters */
        void m6146(C0723 r1, Matrix matrix, int i);

        /* renamed from: ɩ  reason: contains not printable characters */
        void m6147(C0723 r1, Matrix matrix, int i);
    }

    public C0787() {
        for (int i = 0; i < 4; i++) {
            this.f5243[i] = new C0723();
            this.f5238[i] = new Matrix();
            this.f5241[i] = new Matrix();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m6145(C0785 r9, float f, RectF rectF, C0788 r12, Path path) {
        path.rewind();
        this.f5244.rewind();
        this.f5242.rewind();
        this.f5242.addRect(rectF, Path.Direction.CW);
        C0789 r2 = new C0789(r9, f, rectF, r12, path);
        for (int i = 0; i < 4; i++) {
            m6136(r2, i);
            m6143(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m6139(r2, i2);
            m6142(r2, i2);
        }
        path.close();
        this.f5244.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.f5244.isEmpty()) {
            path.op(this.f5244, Path.Op.UNION);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m6136(C0789 r6, int i) {
        m6135(i, r6.f5249).m11597(this.f5243[i], r6.f5251, m6141(i, r6.f5249).m4787(r6.f5250));
        this.f5238[i].reset();
        m6144(i, r6.f5250, this.f5240);
        this.f5238[i].setTranslate(this.f5240.x, this.f5240.y);
        this.f5238[i].preRotate((float) ((i + 1) * 90));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m6143(int i) {
        this.f5247[0] = this.f5243[i].f4936;
        this.f5247[1] = this.f5243[i].f4932;
        this.f5238[i].mapPoints(this.f5247);
        this.f5241[i].reset();
        Matrix matrix = this.f5241[i];
        float[] fArr = this.f5247;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f5241[i].preRotate((float) ((i + 1) * 90));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m6139(C0789 r5, int i) {
        this.f5247[0] = this.f5243[i].f4930;
        this.f5247[1] = this.f5243[i].f4935;
        this.f5238[i].mapPoints(this.f5247);
        if (i == 0) {
            Path path = r5.f5252;
            float[] fArr = this.f5247;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = r5.f5252;
            float[] fArr2 = this.f5247;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f5243[i].m5850(this.f5238[i], r5.f5252);
        if (r5.f5248 != null) {
            r5.f5248.m6146(this.f5243[i], this.f5238[i], i);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m6142(C0789 r9, int i) {
        int i2 = (i + 1) % 4;
        this.f5247[0] = this.f5243[i].f4936;
        this.f5247[1] = this.f5243[i].f4932;
        this.f5238[i].mapPoints(this.f5247);
        this.f5245[0] = this.f5243[i2].f4930;
        this.f5245[1] = this.f5243[i2].f4935;
        this.f5238[i2].mapPoints(this.f5245);
        float[] fArr = this.f5247;
        float f = fArr[0];
        float[] fArr2 = this.f5245;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float r5 = m6140(r9.f5250, i);
        this.f5239.m5851(0.0f, 0.0f, 270.0f, 0.0f);
        C0565 r2 = m6138(i, r9.f5249);
        r2.m5183(max, r5, r9.f5251, this.f5239);
        Path path = new Path();
        this.f5239.m5850(this.f5241[i], path);
        if (!this.f5246 || Build.VERSION.SDK_INT < 19 || (!r2.m5184() && !m6137(path, i) && !m6137(path, i2))) {
            this.f5239.m5850(this.f5241[i], r9.f5252);
        } else {
            path.op(path, this.f5242, Path.Op.DIFFERENCE);
            this.f5247[0] = this.f5239.f4930;
            this.f5247[1] = this.f5239.f4935;
            this.f5241[i].mapPoints(this.f5247);
            Path path2 = this.f5244;
            float[] fArr3 = this.f5247;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f5239.m5850(this.f5241[i], this.f5244);
        }
        if (r9.f5248 != null) {
            r9.f5248.m6147(this.f5239, this.f5241[i], i);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m6137(Path path, int i) {
        Path path2 = new Path();
        this.f5243[i].m5850(this.f5238[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private float m6140(RectF rectF, int i) {
        this.f5247[0] = this.f5243[i].f4936;
        this.f5247[1] = this.f5243[i].f4932;
        this.f5238[i].mapPoints(this.f5247);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f5247[0]);
        }
        return Math.abs(rectF.centerY() - this.f5247[1]);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m6144(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: o.ƭƚ$ǃ  reason: contains not printable characters */
    static final class C0789 {

        /* renamed from: ı  reason: contains not printable characters */
        public final C0788 f5248;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0785 f5249;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final RectF f5250;

        /* renamed from: Ι  reason: contains not printable characters */
        public final float f5251;

        /* renamed from: ι  reason: contains not printable characters */
        public final Path f5252;

        C0789(C0785 r1, float f, RectF rectF, C0788 r4, Path path) {
            this.f5248 = r4;
            this.f5249 = r1;
            this.f5251 = f;
            this.f5250 = rectF;
            this.f5252 = path;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C2197 m6135(int i, C0785 r2) {
        if (i == 1) {
            return r2.f5214;
        }
        if (i == 2) {
            return r2.f5216;
        }
        if (i != 3) {
            return r2.f5220;
        }
        return r2.f5221;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C0460 m6141(int i, C0785 r2) {
        if (i == 1) {
            return r2.f5224;
        }
        if (i == 2) {
            return r2.f5222;
        }
        if (i != 3) {
            return r2.f5219;
        }
        return r2.f5215;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C0565 m6138(int i, C0785 r2) {
        if (i == 1) {
            return r2.f5218;
        }
        if (i == 2) {
            return r2.f5217;
        }
        if (i != 3) {
            return r2.f5225;
        }
        return r2.f5223;
    }
}
