package o;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: o.ɐǃ  reason: contains not printable characters */
public final class C1092 extends Property<ImageView, Matrix> {

    /* renamed from: ı  reason: contains not printable characters */
    private final Matrix f6500 = new Matrix();

    public final /* synthetic */ Object get(Object obj) {
        this.f6500.set(((ImageView) obj).getImageMatrix());
        return this.f6500;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }

    public C1092() {
        super(Matrix.class, "imageMatrixProperty");
    }
}
