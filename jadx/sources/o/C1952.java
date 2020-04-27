package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: o.ιł  reason: contains not printable characters */
final class C1952<T> extends Property<T, Float> {

    /* renamed from: ı  reason: contains not printable characters */
    private final PathMeasure f9836;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private float f9837;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final float[] f9838 = new float[2];

    /* renamed from: ɩ  reason: contains not printable characters */
    private final float f9839;

    /* renamed from: Ι  reason: contains not printable characters */
    private final PointF f9840 = new PointF();

    /* renamed from: ι  reason: contains not printable characters */
    private final Property<T, PointF> f9841;

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.f9837 = f.floatValue();
        this.f9836.getPosTan(this.f9839 * f.floatValue(), this.f9838, (float[]) null);
        PointF pointF = this.f9840;
        float[] fArr = this.f9838;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f9841.set(obj, pointF);
    }

    C1952(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f9841 = property;
        this.f9836 = new PathMeasure(path, false);
        this.f9839 = this.f9836.getLength();
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.f9837);
    }
}
