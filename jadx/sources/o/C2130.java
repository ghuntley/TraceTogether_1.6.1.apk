package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.υι  reason: contains not printable characters */
final class C2130 extends C2263 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2063 f10277;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C2130(C2063 r2) {
        super(r2, (C2096) null);
        this.f10277 = r2;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new C2136(this.f10277, (C2096) null);
    }

    /* synthetic */ C2130(C2063 r1, C2096 r2) {
        this(r1);
    }
}
