package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import o.C0742;
import o.C1559;
import o.C2771;

/* renamed from: o.ſІ  reason: contains not printable characters */
public final class C0595 implements C0707, C0742.C0744, C1214 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Path f4530 = new Path();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C2771.C2772 f4531 = new C2771.C2772();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f4532;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0742<?, PointF> f4533;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0742<?, PointF> f4534;

    /* renamed from: ι  reason: contains not printable characters */
    private final C0379 f4535;

    /* renamed from: І  reason: contains not printable characters */
    private boolean f4536;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C2715 f4537;

    public C0595(C0379 r2, C1578 r3, C2715 r4) {
        this.f4532 = r4.f12553;
        this.f4535 = r2;
        this.f4534 = new C1090(r4.f12554.f7684);
        this.f4533 = r4.f12556.m8665();
        this.f4537 = r4;
        C0742<?, PointF> r22 = this.f4534;
        if (r22 != null) {
            r3.f8389.add(r22);
        }
        C0742<?, PointF> r23 = this.f4533;
        if (r23 != null) {
            r3.f8389.add(r23);
        }
        this.f4534.f5002.add(this);
        this.f4533.f5002.add(this);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5263(List<C0550> list, List<C0550> list2) {
        for (int i = 0; i < list.size(); i++) {
            C0550 r0 = list.get(i);
            if (r0 instanceof C0851) {
                C0851 r02 = (C0851) r0;
                if (r02.f5560 == C1559.If.SIMULTANEOUSLY) {
                    this.f4531.f13126.add(r02);
                    r02.f5561.add(this);
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m5261() {
        return this.f4532;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Path m5259() {
        if (this.f4536) {
            return this.f4530;
        }
        this.f4530.reset();
        if (this.f4537.f12555) {
            this.f4536 = true;
            return this.f4530;
        }
        PointF r1 = this.f4534.m5937();
        float f = r1.x / 2.0f;
        float f2 = r1.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f4530.reset();
        if (this.f4537.f12557) {
            float f5 = -f2;
            this.f4530.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f4530.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f4530.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f4530.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f4530.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f4530.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f4530.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f4530.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f4530.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f4530.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF r12 = this.f4533.m5937();
        this.f4530.offset(r12.x, r12.y);
        this.f4530.close();
        this.f4531.m14662(this.f4530);
        this.f4536 = true;
        return this.f4530;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5262(C1695 r1, int i, List<C1695> list, C1695 r4) {
        C2493.m13241(r1, i, list, r4, this);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m5260(T t, C2476<T> r3) {
        if (t == C0349.f3765) {
            this.f4534.m5932(r3);
        } else if (t == C0349.f3753) {
            this.f4533.m5932(r3);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5258() {
        this.f4536 = false;
        this.f4535.invalidateSelf();
    }
}
