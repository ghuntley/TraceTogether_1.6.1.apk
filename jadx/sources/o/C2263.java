package o;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.Іʇ  reason: contains not printable characters */
class C2263 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2063 f10593;

    private C2263(C2063 r1) {
        this.f10593 = r1;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new C2254(this.f10593, (C2096) null);
    }

    public int size() {
        return this.f10593.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f10593.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f10593.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f10593.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f10593.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ C2263(C2063 r1, C2096 r2) {
        this(r1);
    }
}
