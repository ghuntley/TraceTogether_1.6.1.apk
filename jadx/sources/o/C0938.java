package o;

import java.util.List;
import o.C2745;

/* renamed from: o.ǝ  reason: contains not printable characters */
public final class C0938 extends C0975<Integer> {
    public C0938(List<C2463<Integer>> list) {
        super(list);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private int m6821(C2463<Integer> r4, float f) {
        if (r4.f11217 == null || r4.f11223 == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) r4.f11217).intValue();
        int intValue2 = ((Integer) r4.f11223).intValue();
        if (this.f5006 != null) {
            C2476<A> r1 = this.f5006;
            m5933();
            m5938();
            Integer num = (Integer) r1.f11280;
            if (num != null) {
                return num.intValue();
            }
        }
        return C2745.C2748.m14567(C2493.m13245(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final int m6823() {
        return m6821(m5935(), m5929());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m6822(C2463 r1, float f) {
        return Integer.valueOf(m6821(r1, f));
    }
}
