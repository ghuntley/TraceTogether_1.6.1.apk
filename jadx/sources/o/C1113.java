package o;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: o.ɔι  reason: contains not printable characters */
public final class C1113 extends C0742<PointF, PointF> {

    /* renamed from: ı  reason: contains not printable characters */
    private final PointF f6591 = new PointF();

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C0742<Float, Float> f6592;

    /* renamed from: І  reason: contains not printable characters */
    private final C0742<Float, Float> f6593;

    public C1113(C0742<Float, Float> r2, C0742<Float, Float> r3) {
        super(Collections.emptyList());
        this.f6592 = r2;
        this.f6593 = r3;
        m5934(m5938());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m7517(float f) {
        this.f6592.m5934(f);
        this.f6593.m5934(f);
        this.f6591.set(this.f6592.m5937().floatValue(), this.f6593.m5937().floatValue());
        for (int i = 0; i < this.f5002.size(); i++) {
            this.f5002.get(i).m5958();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Object m7516(C2463 r1, float f) {
        return this.f6591;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Object m7518() {
        return this.f6591;
    }
}
