package o;

import java.util.HashMap;
import o.C2751;

/* renamed from: o.є  reason: contains not printable characters */
public final class C2536<K, V> extends C2751<K, V> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public HashMap<K, C2751.C2752<K, V>> f11623 = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2751.C2752<K, V> m13551(K k) {
        return this.f11623.get(k);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final V m13552(K k) {
        V r0 = super.m14580(k);
        this.f11623.remove(k);
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final V m13550(K k, V v) {
        C2751.C2752 r0 = this.f11623.get(k);
        if (r0 != null) {
            return r0.f13056;
        }
        this.f11623.put(k, m14581(k, v));
        return null;
    }
}
