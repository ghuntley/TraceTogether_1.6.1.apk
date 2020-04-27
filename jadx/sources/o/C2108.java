package o;

import java.util.Map;

/* renamed from: o.νı  reason: contains not printable characters */
final class C2108 implements Comparable<C2108>, Map.Entry<K, V> {

    /* renamed from: ı  reason: contains not printable characters */
    private V f10224;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2063 f10225;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final K f10226;

    C2108(C2063 r2, Map.Entry<K, V> entry) {
        this(r2, (Comparable) entry.getKey(), entry.getValue());
    }

    C2108(C2063 r1, K k, V v) {
        this.f10225 = r1;
        this.f10226 = k;
        this.f10224 = v;
    }

    public final V getValue() {
        return this.f10224;
    }

    public final V setValue(V v) {
        this.f10225.m10972();
        V v2 = this.f10224;
        this.f10224 = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m11261(this.f10226, entry.getKey()) && m11261(this.f10224, entry.getValue());
    }

    public final int hashCode() {
        K k = this.f10226;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f10224;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10226);
        String valueOf2 = String.valueOf(this.f10224);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m11261(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.f10226;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C2108) obj).getKey());
    }
}
