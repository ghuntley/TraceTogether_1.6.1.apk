package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: o.ү  reason: contains not printable characters */
public final class C2719 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final ThreadLocal<RectF> f12576 = new ThreadLocal<>();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final ThreadLocal<Matrix> f12577 = new ThreadLocal<>();

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m14447(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        Matrix matrix = f12577.get();
        if (matrix == null) {
            matrix = new Matrix();
            f12577.set(matrix);
        } else {
            matrix.reset();
        }
        m14448((ViewParent) viewGroup, view, matrix);
        RectF rectF = f12576.get();
        if (rectF == null) {
            rectF = new RectF();
            f12576.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m14448(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m14448(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
