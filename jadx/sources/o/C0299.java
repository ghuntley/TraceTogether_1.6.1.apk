package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o.C0888;

/* renamed from: o.ıƖ  reason: contains not printable characters */
public final class C0299<K, V> extends C0910<K, V> implements Map<K, V> {

    /* renamed from: ı  reason: contains not printable characters */
    private C0888<K, V> f3576;

    public C0299() {
    }

    public C0299(int i) {
        super(i);
    }

    public C0299(C0910 r1) {
        super(r1);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m6722(this.f5783 + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f3576 == null) {
            this.f3576 = new C0888<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: ι  reason: contains not printable characters */
                public final int m4275() {
                    return C0299.this.f5783;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final Object m4272(int i, int i2) {
                    return C0299.this.f5784[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: ı  reason: contains not printable characters */
                public final int m4267(Object obj) {
                    C0299 r0 = C0299.this;
                    return obj == null ? r0.m6719() : r0.m6723(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final int m4271(Object obj) {
                    return C0299.this.m6720(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ǃ  reason: contains not printable characters */
                public final Map<K, V> m4270() {
                    return C0299.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final void m4274(K k, V v) {
                    C0299.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ǃ  reason: contains not printable characters */
                public final V m4269(int i, V v) {
                    C0299 r0 = C0299.this;
                    int i2 = (i << 1) + 1;
                    V v2 = r0.f5784[i2];
                    r0.f5784[i2] = v;
                    return v2;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final void m4273(int i) {
                    C0299.this.m6721(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4268() {
                    C0299.this.clear();
                }
            };
        }
        C0888<K, V> r0 = this.f3576;
        if (r0.f5704 == null) {
            r0.f5704 = new C0888.C0889();
        }
        return r0.f5704;
    }

    public final Set<K> keySet() {
        if (this.f3576 == null) {
            this.f3576 = new C0888<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: ι  reason: contains not printable characters */
                public final int m4275() {
                    return C0299.this.f5783;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final Object m4272(int i, int i2) {
                    return C0299.this.f5784[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: ı  reason: contains not printable characters */
                public final int m4267(Object obj) {
                    C0299 r0 = C0299.this;
                    return obj == null ? r0.m6719() : r0.m6723(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final int m4271(Object obj) {
                    return C0299.this.m6720(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ǃ  reason: contains not printable characters */
                public final Map<K, V> m4270() {
                    return C0299.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final void m4274(K k, V v) {
                    C0299.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ǃ  reason: contains not printable characters */
                public final V m4269(int i, V v) {
                    C0299 r0 = C0299.this;
                    int i2 = (i << 1) + 1;
                    V v2 = r0.f5784[i2];
                    r0.f5784[i2] = v;
                    return v2;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final void m4273(int i) {
                    C0299.this.m6721(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4268() {
                    C0299.this.clear();
                }
            };
        }
        C0888<K, V> r0 = this.f3576;
        if (r0.f5702 == null) {
            r0.f5702 = new C0888.Cif();
        }
        return r0.f5702;
    }

    public final Collection<V> values() {
        if (this.f3576 == null) {
            this.f3576 = new C0888<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: ι  reason: contains not printable characters */
                public final int m4275() {
                    return C0299.this.f5783;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final Object m4272(int i, int i2) {
                    return C0299.this.f5784[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: ı  reason: contains not printable characters */
                public final int m4267(Object obj) {
                    C0299 r0 = C0299.this;
                    return obj == null ? r0.m6719() : r0.m6723(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final int m4271(Object obj) {
                    return C0299.this.m6720(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ǃ  reason: contains not printable characters */
                public final Map<K, V> m4270() {
                    return C0299.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final void m4274(K k, V v) {
                    C0299.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ǃ  reason: contains not printable characters */
                public final V m4269(int i, V v) {
                    C0299 r0 = C0299.this;
                    int i2 = (i << 1) + 1;
                    V v2 = r0.f5784[i2];
                    r0.f5784[i2] = v;
                    return v2;
                }

                /* access modifiers changed from: protected */
                /* renamed from: Ι  reason: contains not printable characters */
                public final void m4273(int i) {
                    C0299.this.m6721(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: ı  reason: contains not printable characters */
                public final void m4268() {
                    C0299.this.clear();
                }
            };
        }
        C0888<K, V> r0 = this.f3576;
        if (r0.f5703 == null) {
            r0.f5703 = new C0888.If();
        }
        return r0.f5703;
    }
}
