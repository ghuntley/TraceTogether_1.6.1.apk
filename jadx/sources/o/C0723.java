package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ƚƭ  reason: contains not printable characters */
public final class C0723 {
    @Deprecated

    /* renamed from: ı  reason: contains not printable characters */
    public float f4930;

    /* renamed from: Ɩ  reason: contains not printable characters */
    final List<C0727> f4931 = new ArrayList();
    @Deprecated

    /* renamed from: ǃ  reason: contains not printable characters */
    public float f4932;
    @Deprecated

    /* renamed from: ɩ  reason: contains not printable characters */
    public float f4933;
    @Deprecated

    /* renamed from: ɹ  reason: contains not printable characters */
    private float f4934;
    @Deprecated

    /* renamed from: Ι  reason: contains not printable characters */
    public float f4935;
    @Deprecated

    /* renamed from: ι  reason: contains not printable characters */
    public float f4936;

    /* renamed from: і  reason: contains not printable characters */
    private final List<C0726> f4937 = new ArrayList();

    /* renamed from: o.ƚƭ$ɩ  reason: contains not printable characters */
    public static abstract class C0726 {

        /* renamed from: ɹ  reason: contains not printable characters */
        protected final Matrix f4953 = new Matrix();

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract void m5860(Matrix matrix, Path path);
    }

    public C0723() {
        m5851(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5849(float f, float f2) {
        C0725 r0 = new C0725();
        r0.f4952 = f;
        r0.f4951 = f2;
        this.f4937.add(r0);
        If ifR = new If(r0, this.f4936, this.f4932);
        m5853(ifR.m5855() + 270.0f);
        this.f4931.add(ifR);
        this.f4934 = ifR.m5855() + 270.0f;
        this.f4936 = f;
        this.f4932 = f2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5852(float f, float f2, float f3, float f4, float f5, float f6) {
        C0724 r0 = new C0724(f, f2, f3, f4);
        r0.f4949 = f5;
        r0.f4950 = f6;
        this.f4937.add(r0);
        Cif ifVar = new Cif(r0);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        m5853(f5);
        this.f4931.add(ifVar);
        this.f4934 = f8;
        double d = (double) f7;
        this.f4936 = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.f4932 = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5850(Matrix matrix, Path path) {
        int size = this.f4937.size();
        for (int i = 0; i < size; i++) {
            this.f4937.get(i).m5860(matrix, path);
        }
    }

    /* renamed from: o.ƚƭ$Ι  reason: contains not printable characters */
    static abstract class C0727 {

        /* renamed from: ı  reason: contains not printable characters */
        static final Matrix f4954 = new Matrix();

        /* renamed from: ι  reason: contains not printable characters */
        public abstract void m5861(Matrix matrix, C0374 r2, int i, Canvas canvas);

        C0727() {
        }
    }

    /* renamed from: o.ƚƭ$If */
    static class If extends C0727 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C0725 f4940;

        /* renamed from: Ι  reason: contains not printable characters */
        private final float f4941;

        /* renamed from: ι  reason: contains not printable characters */
        private final float f4942;

        public If(C0725 r1, float f, float f2) {
            this.f4940 = r1;
            this.f4941 = f;
            this.f4942 = f2;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m5856(Matrix matrix, C0374 r13, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f4940.f4951 - this.f4942), (double) (this.f4940.f4952 - this.f4941)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4941, this.f4942);
            matrix2.preRotate(m5855());
            rectF.bottom += (float) i;
            rectF.offset(0.0f, (float) (-i));
            C0374.f3843[0] = r13.f3851;
            C0374.f3843[1] = r13.f3848;
            C0374.f3843[2] = r13.f3852;
            r13.f3850.setShader(new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, C0374.f3843, C0374.f3846, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, r13.f3850);
            canvas.restore();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final float m5855() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f4940.f4951 - this.f4942) / (this.f4940.f4952 - this.f4941))));
        }
    }

    /* renamed from: o.ƚƭ$if  reason: invalid class name */
    static class Cif extends C0727 {

        /* renamed from: ι  reason: contains not printable characters */
        private final C0724 f4943;

        public Cif(C0724 r1) {
            this.f4943 = r1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m5857(Matrix matrix, C0374 r21, int i, Canvas canvas) {
            C0374 r1 = r21;
            int i2 = i;
            Canvas canvas2 = canvas;
            float f = this.f4943.f4949;
            float f2 = this.f4943.f4950;
            RectF rectF = new RectF(this.f4943.f4946, this.f4943.f4947, this.f4943.f4945, this.f4943.f4948);
            boolean z = f2 < 0.0f;
            Path path = r1.f3854;
            if (z) {
                C0374.f3844[0] = 0;
                C0374.f3844[1] = r1.f3851;
                C0374.f3844[2] = r1.f3848;
                C0374.f3844[3] = r1.f3852;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = (float) (-i2);
                rectF.inset(f3, f3);
                C0374.f3844[0] = 0;
                C0374.f3844[1] = r1.f3852;
                C0374.f3844[2] = r1.f3848;
                C0374.f3844[3] = r1.f3851;
            }
            float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
            C0374.f3845[1] = width;
            C0374.f3845[2] = ((1.0f - width) / 2.0f) + width;
            r1.f3853.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, C0374.f3844, C0374.f3845, Shader.TileMode.CLAMP));
            canvas.save();
            canvas2.concat(matrix);
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, r1.f3849);
            }
            canvas.drawArc(rectF, f, f2, true, r1.f3853);
            canvas.restore();
        }
    }

    /* renamed from: o.ƚƭ$ǃ  reason: contains not printable characters */
    public static class C0725 extends C0726 {

        /* renamed from: ı  reason: contains not printable characters */
        float f4951;

        /* renamed from: ǃ  reason: contains not printable characters */
        float f4952;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m5859(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4953;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4952, this.f4951);
            path.transform(matrix);
        }
    }

    /* renamed from: o.ƚƭ$ı  reason: contains not printable characters */
    public static class C0724 extends C0726 {

        /* renamed from: Ɩ  reason: contains not printable characters */
        private static final RectF f4944 = new RectF();
        @Deprecated

        /* renamed from: ı  reason: contains not printable characters */
        public float f4945;
        @Deprecated

        /* renamed from: ǃ  reason: contains not printable characters */
        public float f4946;
        @Deprecated

        /* renamed from: ɩ  reason: contains not printable characters */
        public float f4947;
        @Deprecated

        /* renamed from: Ι  reason: contains not printable characters */
        public float f4948;
        @Deprecated

        /* renamed from: ι  reason: contains not printable characters */
        public float f4949;
        @Deprecated

        /* renamed from: Ӏ  reason: contains not printable characters */
        public float f4950;

        public C0724(float f, float f2, float f3, float f4) {
            this.f4946 = f;
            this.f4947 = f2;
            this.f4945 = f3;
            this.f4948 = f4;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m5858(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4953;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f4944.set(this.f4946, this.f4947, this.f4945, this.f4948);
            path.arcTo(f4944, this.f4949, this.f4950, false);
            path.transform(matrix);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5851(float f, float f2, float f3, float f4) {
        this.f4930 = f;
        this.f4935 = f2;
        this.f4936 = f;
        this.f4932 = f2;
        this.f4934 = f3;
        this.f4933 = (f3 + f4) % 360.0f;
        this.f4937.clear();
        this.f4931.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m5853(float f) {
        float f2 = this.f4934;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.f4936;
                float f5 = this.f4932;
                C0724 r1 = new C0724(f4, f5, f4, f5);
                r1.f4949 = this.f4934;
                r1.f4950 = f3;
                this.f4931.add(new Cif(r1));
                this.f4934 = f;
            }
        }
    }
}
