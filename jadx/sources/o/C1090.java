package o;

import android.graphics.PointF;
import java.util.List;

/* renamed from: o.ɐ  reason: contains not printable characters */
public final class C1090 extends C0975<PointF> {

    /* renamed from: ı  reason: contains not printable characters */
    private final PointF f6497 = new PointF();

    public C1090(List<C2463<PointF>> list) {
        super(list);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m7455(C2463 r6, float f) {
        if (r6.f11217 == null || r6.f11223 == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) r6.f11217;
        PointF pointF2 = (PointF) r6.f11223;
        if (this.f5006 != null) {
            C2476<A> r1 = this.f5006;
            m5933();
            m5938();
            PointF pointF3 = (PointF) r1.f11280;
            if (pointF3 != null) {
                return pointF3;
            }
        }
        this.f6497.set(pointF.x + ((pointF2.x - pointF.x) * f), pointF.y + (f * (pointF2.y - pointF.y)));
        return this.f6497;
    }
}
