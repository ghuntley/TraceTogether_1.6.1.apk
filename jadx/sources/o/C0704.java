package o;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import o.C0742;
import o.C1559;
import o.C2715;
import o.C2771;

/* renamed from: o.Ɨі  reason: contains not printable characters */
public final class C0704 implements C0742.C0744, C1214, C0707 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0379 f4890;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C0742<?, Float> f4891;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final RectF f4892 = new RectF();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean f4893;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C0742<?, PointF> f4894;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f4895;

    /* renamed from: ι  reason: contains not printable characters */
    private final Path f4896 = new Path();

    /* renamed from: І  reason: contains not printable characters */
    private boolean f4897;

    /* renamed from: і  reason: contains not printable characters */
    private final C0742<?, PointF> f4898;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C2771.C2772 f4899 = new C2771.C2772();

    public C0704(C0379 r2, C1578 r3, C2715.If ifR) {
        this.f4895 = ifR.f12562;
        this.f4893 = ifR.f12561;
        this.f4890 = r2;
        this.f4894 = ifR.f12558.m8665();
        this.f4898 = new C1090(ifR.f12559.f7684);
        this.f4891 = new C0965(ifR.f12560.f7684);
        C0742<?, PointF> r22 = this.f4894;
        if (r22 != null) {
            r3.f8389.add(r22);
        }
        C0742<?, PointF> r23 = this.f4898;
        if (r23 != null) {
            r3.f8389.add(r23);
        }
        C0742<?, Float> r24 = this.f4891;
        if (r24 != null) {
            r3.f8389.add(r24);
        }
        this.f4894.f5002.add(this);
        this.f4898.f5002.add(this);
        this.f4891.f5002.add(this);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5813() {
        return this.f4895;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5815(List<C0550> list, List<C0550> list2) {
        for (int i = 0; i < list.size(); i++) {
            C0550 r0 = list.get(i);
            if (r0 instanceof C0851) {
                C0851 r02 = (C0851) r0;
                if (r02.f5560 == C1559.If.SIMULTANEOUSLY) {
                    this.f4899.f13126.add(r02);
                    r02.f5561.add(this);
                }
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Path m5811() {
        float f;
        if (this.f4897) {
            return this.f4896;
        }
        this.f4896.reset();
        if (this.f4893) {
            this.f4897 = true;
            return this.f4896;
        }
        PointF r0 = this.f4898.m5937();
        float f2 = r0.x / 2.0f;
        float f3 = r0.y / 2.0f;
        C0742<?, Float> r4 = this.f4891;
        if (r4 == null) {
            f = 0.0f;
        } else {
            f = ((C0965) r4).m6884();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF r6 = this.f4894.m5937();
        this.f4896.moveTo(r6.x + f2, (r6.y - f3) + f);
        this.f4896.lineTo(r6.x + f2, (r6.y + f3) - f);
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            float f4 = f * 2.0f;
            this.f4892.set((r6.x + f2) - f4, (r6.y + f3) - f4, r6.x + f2, r6.y + f3);
            this.f4896.arcTo(this.f4892, 0.0f, 90.0f, false);
        }
        this.f4896.lineTo((r6.x - f2) + f, r6.y + f3);
        if (i > 0) {
            float f5 = f * 2.0f;
            this.f4892.set(r6.x - f2, (r6.y + f3) - f5, (r6.x - f2) + f5, r6.y + f3);
            this.f4896.arcTo(this.f4892, 90.0f, 90.0f, false);
        }
        this.f4896.lineTo(r6.x - f2, (r6.y - f3) + f);
        if (i > 0) {
            float f6 = f * 2.0f;
            this.f4892.set(r6.x - f2, r6.y - f3, (r6.x - f2) + f6, (r6.y - f3) + f6);
            this.f4896.arcTo(this.f4892, 180.0f, 90.0f, false);
        }
        this.f4896.lineTo((r6.x + f2) - f, r6.y - f3);
        if (i > 0) {
            float f7 = f * 2.0f;
            this.f4892.set((r6.x + f2) - f7, r6.y - f3, r6.x + f2, (r6.y - f3) + f7);
            this.f4896.arcTo(this.f4892, 270.0f, 90.0f, false);
        }
        this.f4896.close();
        this.f4899.m14662(this.f4896);
        this.f4897 = true;
        return this.f4896;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5814(C1695 r1, int i, List<C1695> list, C1695 r4) {
        C2493.m13241(r1, i, list, r4, this);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5812(T t, C2476<T> r3) {
        if (t == C0349.f3776) {
            this.f4898.m5932(r3);
        } else if (t == C0349.f3753) {
            this.f4894.m5932(r3);
        } else if (t == C0349.f3774) {
            this.f4891.m5932(r3);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5810() {
        this.f4897 = false;
        this.f4890.invalidateSelf();
    }
}
