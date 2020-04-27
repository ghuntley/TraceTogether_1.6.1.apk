package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.ȷǀ  reason: contains not printable characters */
public abstract class C0959<K, V> implements Serializable, Map<K, V> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Map.Entry<?, ?>[] f5960 = new Map.Entry[0];

    /* renamed from: ı  reason: contains not printable characters */
    private transient C0962<Map.Entry<K, V>> f5961;

    /* renamed from: ɩ  reason: contains not printable characters */
    private transient C0852<V> f5962;

    /* renamed from: ι  reason: contains not printable characters */
    private transient C0962<K> f5963;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <K, V> C0959<K, V> m6871() {
        return C0971.f5980;
    }

    public abstract V get(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract C0962<Map.Entry<K, V>> m6872();

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract C0852<V> m6873();

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract C0962<K> m6874();

    C0959() {
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return ((C0852) values()).contains(obj);
    }

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public int hashCode() {
        return C1023.m7261((C0962) entrySet());
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                z = false;
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("size".length() + 40);
        sb2.append("size");
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public /* synthetic */ Set entrySet() {
        C0962<Map.Entry<K, V>> r0 = this.f5961;
        if (r0 != null) {
            return r0;
        }
        C0962<Map.Entry<K, V>> r02 = m6872();
        this.f5961 = r02;
        return r02;
    }

    public /* synthetic */ Collection values() {
        C0852<V> r0 = this.f5962;
        if (r0 != null) {
            return r0;
        }
        C0852<V> r02 = m6873();
        this.f5962 = r02;
        return r02;
    }

    public /* synthetic */ Set keySet() {
        C0962<K> r0 = this.f5963;
        if (r0 != null) {
            return r0;
        }
        C0962<K> r02 = m6874();
        this.f5963 = r02;
        return r02;
    }
}
