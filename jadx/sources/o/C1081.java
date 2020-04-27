package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* renamed from: o.ɍІ  reason: contains not printable characters */
public final class C1081 extends C0975<PointF> {

    /* renamed from: ı  reason: contains not printable characters */
    private final PointF f6464 = new PointF();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private PathMeasure f6465 = new PathMeasure();

    /* renamed from: ɹ  reason: contains not printable characters */
    private C1083 f6466;

    /* renamed from: І  reason: contains not printable characters */
    private final float[] f6467 = new float[2];

    public C1081(List<? extends C2463<PointF>> list) {
        super(list);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m7435(C2463 r4, float f) {
        C1083 r0 = (C1083) r4;
        Path path = r0.f6470;
        if (path == null) {
            return (PointF) r4.f11217;
        }
        if (this.f5006 != null) {
            C2476<A> r42 = this.f5006;
            m5933();
            m5938();
            PointF pointF = (PointF) r42.f11280;
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f6466 != r0) {
            this.f6465.setPath(path, false);
            this.f6466 = r0;
        }
        PathMeasure pathMeasure = this.f6465;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f6467, (float[]) null);
        PointF pointF2 = this.f6464;
        float[] fArr = this.f6467;
        pointF2.set(fArr[0], fArr[1]);
        return this.f6464;
    }
}
