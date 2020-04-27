package o;

import java.util.List;

/* renamed from: o.ȷɹ  reason: contains not printable characters */
public final class C0965 extends C0975<Float> {
    public C0965(List<C2463<Float>> list) {
        super(list);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private float m6882(C2463<Float> r4, float f) {
        if (r4.f11217 == null || r4.f11223 == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.f5006 != null) {
            C2476<A> r0 = this.f5006;
            m5933();
            m5938();
            Float f2 = (Float) r0.f11280;
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        if (r4.f11216 == -3987645.8f) {
            r4.f11216 = ((Float) r4.f11217).floatValue();
        }
        float f3 = r4.f11216;
        if (r4.f11226 == -3987645.8f) {
            r4.f11226 = ((Float) r4.f11223).floatValue();
        }
        return C2493.m13237(f3, r4.f11226, f);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final float m6884() {
        return m6882(m5935(), m5929());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m6883(C2463 r1, float f) {
        return Float.valueOf(m6882(r1, f));
    }
}
