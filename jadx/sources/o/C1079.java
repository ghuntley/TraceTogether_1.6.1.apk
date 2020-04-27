package o;

import java.util.List;

/* renamed from: o.ɍΙ  reason: contains not printable characters */
public final class C1079 extends C0975<C0957> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0957 f6463 = new C0957();

    public C1079(List<C2463<C0957>> list) {
        super(list);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m7434(C2463 r5, float f) {
        if (r5.f11217 == null || r5.f11223 == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C0957 r0 = (C0957) r5.f11217;
        C0957 r52 = (C0957) r5.f11223;
        if (this.f5006 != null) {
            C2476<A> r1 = this.f5006;
            m5933();
            m5938();
            C0957 r12 = (C0957) r1.f11280;
            if (r12 != null) {
                return r12;
            }
        }
        C0957 r13 = this.f6463;
        float r2 = C2493.m13237(r0.f5954, r52.f5954, f);
        float r53 = C2493.m13237(r0.f5955, r52.f5955, f);
        r13.f5954 = r2;
        r13.f5955 = r53;
        return this.f6463;
    }
}
