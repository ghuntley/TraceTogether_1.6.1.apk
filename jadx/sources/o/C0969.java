package o;

import java.util.Iterator;
import java.util.Map;

/* renamed from: o.ȷϳ  reason: contains not printable characters */
final class C0969<K, V> extends C0962<Map.Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final transient int f5976;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final transient Object[] f5977;

    /* renamed from: Ι  reason: contains not printable characters */
    private final transient C0959<K, V> f5978;

    /* renamed from: ι  reason: contains not printable characters */
    private final transient int f5979 = 0;

    C0969(C0959<K, V> r1, Object[] objArr, int i, int i2) {
        this.f5978 = r1;
        this.f5977 = objArr;
        this.f5976 = i2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1036<Map.Entry<K, V>> m6934() {
        return (C1036) m6405().iterator();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m6936(Object[] objArr, int i) {
        return m6405().m6403(objArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0719<Map.Entry<K, V>> m6935() {
        return new C1022(this);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f5978.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f5976;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
