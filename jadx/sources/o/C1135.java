package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ɜǃ  reason: contains not printable characters */
final class C1135<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: Ι  reason: contains not printable characters */
    private Iterator<Map.Entry<K, Object>> f6652;

    public C1135(Iterator<Map.Entry<K, Object>> it) {
        this.f6652 = it;
    }

    public final boolean hasNext() {
        return this.f6652.hasNext();
    }

    public final void remove() {
        this.f6652.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f6652.next();
        return next.getValue() instanceof C1056 ? new C1125(next) : next;
    }
}
