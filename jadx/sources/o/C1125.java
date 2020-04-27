package o;

import java.util.Map;

/* renamed from: o.ɛǃ  reason: contains not printable characters */
final class C1125<K> implements Map.Entry<K, Object> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private Map.Entry<K, C1056> f6640;

    private C1125(Map.Entry<K, C1056> entry) {
        this.f6640 = entry;
    }

    public final K getKey() {
        return this.f6640.getKey();
    }

    public final Object getValue() {
        if (this.f6640.getValue() == null) {
            return null;
        }
        return C1056.m7304();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1056 m7565() {
        return this.f6640.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C1637) {
            return this.f6640.getValue().m8096((C1637) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
