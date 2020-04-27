package o;

import java.util.List;

/* renamed from: o.ǀι  reason: contains not printable characters */
public final class C0865 extends C0975<Integer> {
    public C0865(List<C2463<Integer>> list) {
        super(list);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private int m6428(C2463<Integer> r4, float f) {
        if (r4.f11217 == null || r4.f11223 == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.f5006 != null) {
            C2476<A> r0 = this.f5006;
            m5933();
            m5938();
            Integer num = (Integer) r0.f11280;
            if (num != null) {
                return num.intValue();
            }
        }
        if (r4.f11225 == 784923401) {
            r4.f11225 = ((Integer) r4.f11217).intValue();
        }
        int i = r4.f11225;
        if (r4.f11227 == 784923401) {
            r4.f11227 = ((Integer) r4.f11223).intValue();
        }
        return C2493.m13239(i, r4.f11227, f);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final int m6430() {
        return m6428(m5935(), m5929());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m6429(C2463 r1, float f) {
        return Integer.valueOf(m6428(r1, f));
    }
}
