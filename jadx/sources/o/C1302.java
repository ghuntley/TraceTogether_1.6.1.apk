package o;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: o.ɩс  reason: contains not printable characters */
public final class C1302 implements C1431<PointF, PointF> {

    /* renamed from: ı  reason: contains not printable characters */
    private final List<C2463<PointF>> f7282;

    public C1302() {
        this.f7282 = Collections.singletonList(new C2463(new PointF(0.0f, 0.0f)));
    }

    public C1302(List<C2463<PointF>> list) {
        this.f7282 = list;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2463<PointF>> m8246() {
        return this.f7282;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m8247() {
        if (this.f7282.size() == 1) {
            if (this.f7282.get(0).f11219 == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0742<PointF, PointF> m8245() {
        boolean z = false;
        if (this.f7282.get(0).f11219 == null) {
            z = true;
        }
        if (z) {
            return new C1090(this.f7282);
        }
        return new C1081(this.f7282);
    }
}
