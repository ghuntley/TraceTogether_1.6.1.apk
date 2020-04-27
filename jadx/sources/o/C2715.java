package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: o.ҫ  reason: contains not printable characters */
public final class C2715 implements C1455 {

    /* renamed from: І  reason: contains not printable characters */
    private static final ThreadLocal<RectF> f12551 = new ThreadLocal<>();

    /* renamed from: і  reason: contains not printable characters */
    private static final ThreadLocal<Matrix> f12552 = new ThreadLocal<>();

    /* renamed from: ı  reason: contains not printable characters */
    public final String f12553;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1333 f12554;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean f12555;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1431<PointF, PointF> f12556;

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean f12557;

    /* renamed from: o.ҫ$ı  reason: contains not printable characters */
    public static final class C2716 {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f12565 = 0;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f12566 = 5;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int[] f12567 = {R.attr.f152272130969021, R.attr.f154452130969264};

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f12568 = 1;

        /* renamed from: ɹ  reason: contains not printable characters */
        public static final int f12569 = 1;

        /* renamed from: ɾ  reason: contains not printable characters */
        public static final int f12570 = 6;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int f12571 = 0;

        /* renamed from: ι  reason: contains not printable characters */
        public static final int[] f12572 = {16842931, R.attr.f152352130969029, R.attr.f152362130969030, R.attr.f152372130969031, R.attr.f152812130969075, R.attr.f152902130969084, R.attr.f152912130969085};

        /* renamed from: І  reason: contains not printable characters */
        public static final int f12573 = 4;

        /* renamed from: і  reason: contains not printable characters */
        public static final int f12574 = 2;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int f12575 = 3;
    }

    /* renamed from: o.ҫ$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ɩ  reason: contains not printable characters */
        public final int[] f12563;

        /* renamed from: Ι  reason: contains not printable characters */
        public final float[] f12564;

        public Cif(float[] fArr, int[] iArr) {
            this.f12564 = fArr;
            this.f12563 = iArr;
        }

        public Cif() {
        }
    }

    /* renamed from: o.ҫ$If */
    public static final class If implements C1455 {

        /* renamed from: ı  reason: contains not printable characters */
        public final C1431<PointF, PointF> f12558;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1333 f12559;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1282 f12560;

        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean f12561;

        /* renamed from: ι  reason: contains not printable characters */
        public final String f12562;

        public If(String str, C1431<PointF, PointF> r2, C1333 r3, C1282 r4, boolean z) {
            this.f12562 = str;
            this.f12558 = r2;
            this.f12559 = r3;
            this.f12560 = r4;
            this.f12561 = z;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C0550 m14421(C0379 r2, C1578 r3) {
            return new C0704(r2, r3, this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RectangleShape{position=");
            sb.append(this.f12558);
            sb.append(", size=");
            sb.append(this.f12559);
            sb.append('}');
            return sb.toString();
        }

        public If() {
        }
    }

    public C2715(String str, C1431<PointF, PointF> r2, C1333 r3, boolean z, boolean z2) {
        this.f12553 = str;
        this.f12556 = r2;
        this.f12554 = r3;
        this.f12557 = z;
        this.f12555 = z2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0550 m14420(C0379 r2, C1578 r3) {
        return new C0595(r2, r3, this);
    }

    public C2715() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m14418(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f12552.get();
        if (matrix == null) {
            matrix = new Matrix();
            f12552.set(matrix);
        } else {
            matrix.reset();
        }
        m14419(viewGroup, view, matrix);
        RectF rectF = f12551.get();
        if (rectF == null) {
            rectF = new RectF();
            f12551.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static void m14419(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m14419(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
