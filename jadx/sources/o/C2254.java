package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.Іɫ  reason: contains not printable characters */
final class C2254 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: ı  reason: contains not printable characters */
    private int f10575;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Iterator<Map.Entry<K, V>> f10576;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f10577;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C2063 f10578;

    private C2254(C2063 r1) {
        this.f10578 = r1;
        this.f10575 = -1;
    }

    public final boolean hasNext() {
        if (this.f10575 + 1 < this.f10578.f10128.size() || (!this.f10578.f10124.isEmpty() && m11801().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.f10577) {
            this.f10577 = false;
            this.f10578.m10972();
            if (this.f10575 < this.f10578.f10128.size()) {
                C2063 r0 = this.f10578;
                int i = this.f10575;
                this.f10575 = i - 1;
                Object unused = r0.m10967(i);
                return;
            }
            m11801().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final Iterator<Map.Entry<K, V>> m11801() {
        if (this.f10576 == null) {
            this.f10576 = this.f10578.f10124.entrySet().iterator();
        }
        return this.f10576;
    }

    public final /* synthetic */ Object next() {
        this.f10577 = true;
        int i = this.f10575 + 1;
        this.f10575 = i;
        if (i < this.f10578.f10128.size()) {
            return (Map.Entry) this.f10578.f10128.get(this.f10575);
        }
        return (Map.Entry) m11801().next();
    }

    /* synthetic */ C2254(C2063 r1, C2096 r2) {
        this(r1);
    }
}
