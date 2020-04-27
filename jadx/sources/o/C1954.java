package o;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: o.ιſ  reason: contains not printable characters */
final class C1954 implements TypeEvaluator<Rect> {
    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        return new Rect(rect.left + ((int) (((float) (rect2.left - rect.left)) * f)), rect.top + ((int) (((float) (rect2.top - rect.top)) * f)), rect.right + ((int) (((float) (rect2.right - rect.right)) * f)), rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f)));
    }

    C1954() {
    }
}
