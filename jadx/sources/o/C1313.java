package o;

import android.graphics.PointF;
import java.util.List;

/* renamed from: o.ɩј  reason: contains not printable characters */
public final class C1313 implements C1431<PointF, PointF> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1282 f7298;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1282 f7299;

    public C1313(C1282 r1, C1282 r2) {
        this.f7299 = r1;
        this.f7298 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2463<PointF>> m8272() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m8273() {
        return this.f7299.m8588() && this.f7298.m8588();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0742<PointF, PointF> m8271() {
        return new C1113(new C0965(this.f7299.f7684), new C0965(this.f7298.f7684));
    }
}
