package o;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.ω  reason: contains not printable characters */
final class C2136 implements Iterator<Map.Entry<K, V>> {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C2063 f10286;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Iterator<Map.Entry<K, V>> f10287;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f10288;

    private C2136(C2063 r1) {
        this.f10286 = r1;
        this.f10288 = this.f10286.f10128.size();
    }

    public final boolean hasNext() {
        int i = this.f10288;
        return (i > 0 && i <= this.f10286.f10128.size()) || m11309().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final Iterator<Map.Entry<K, V>> m11309() {
        if (this.f10287 == null) {
            this.f10287 = this.f10286.f10127.entrySet().iterator();
        }
        return this.f10287;
    }

    public final /* synthetic */ Object next() {
        if (m11309().hasNext()) {
            return (Map.Entry) m11309().next();
        }
        List r0 = this.f10286.f10128;
        int i = this.f10288 - 1;
        this.f10288 = i;
        return (Map.Entry) r0.get(i);
    }

    /* synthetic */ C2136(C2063 r1, C2096 r2) {
        this(r1);
    }
}
