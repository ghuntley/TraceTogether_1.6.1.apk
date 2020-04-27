package o;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: o.ɍі  reason: contains not printable characters */
public final class C1083 extends C2463<PointF> {

    /* renamed from: ı  reason: contains not printable characters */
    Path f6470;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C2463<PointF> f6471;

    public C1083(C0343 r8, C2463<PointF> r9) {
        super(r8, r9.f11217, r9.f11223, r9.f11219, r9.f11224, r9.f11221);
        this.f6471 = r9;
        m7442();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m7442() {
        boolean z = (this.f11223 == null || this.f11217 == null || !((PointF) this.f11217).equals(((PointF) this.f11223).x, ((PointF) this.f11223).y)) ? false : true;
        if (this.f11223 != null && !z) {
            this.f6470 = C2467.m12707((PointF) this.f11217, (PointF) this.f11223, this.f6471.f11218, this.f6471.f11220);
        }
    }
}
