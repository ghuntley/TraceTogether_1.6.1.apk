package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ҝι  reason: contains not printable characters */
public final class C2705 extends C2807 {

    /* renamed from: o.ҝι$ǃ  reason: contains not printable characters */
    static class C2706<K> implements Map.Entry<K, Object> {

        /* renamed from: ι  reason: contains not printable characters */
        private Map.Entry<K, C2705> f12519;

        /* synthetic */ C2706(Map.Entry entry, byte b) {
            this(entry);
        }

        private C2706(Map.Entry<K, C2705> entry) {
            this.f12519 = entry;
        }

        public final K getKey() {
            return this.f12519.getKey();
        }

        public final Object getValue() {
            C2705 value = this.f12519.getValue();
            if (value == null) {
                return null;
            }
            return value.m14720((C2993) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof C2993) {
                C2705 value = this.f12519.getValue();
                C2993 r1 = value.f13222;
                value.f13221 = null;
                value.f13222 = (C2993) obj;
                return r1;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: o.ҝι$if  reason: invalid class name */
    static class Cif<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: ı  reason: contains not printable characters */
        private Iterator<Map.Entry<K, Object>> f12518;

        public Cif(Iterator<Map.Entry<K, Object>> it) {
            this.f12518 = it;
        }

        public final boolean hasNext() {
            return this.f12518.hasNext();
        }

        public final void remove() {
            this.f12518.remove();
        }

        public final /* synthetic */ Object next() {
            Map.Entry next = this.f12518.next();
            return next.getValue() instanceof C2705 ? new C2706(next, (byte) 0) : next;
        }
    }

    public final int hashCode() {
        return m14720((C2993) null).hashCode();
    }

    public final boolean equals(Object obj) {
        return m14720((C2993) null).equals(obj);
    }

    public final String toString() {
        return m14720((C2993) null).toString();
    }
}
