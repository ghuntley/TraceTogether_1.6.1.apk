package o;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: o.ɂІ  reason: contains not printable characters */
final class C1022 extends C0719<Map.Entry<K, V>> {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C0969 f6223;

    C1022(C0969 r1) {
        this.f6223 = r1;
    }

    public final int size() {
        return this.f6223.f5976;
    }

    public final /* synthetic */ Object get(int i) {
        C0672.m5539(i, this.f6223.f5976);
        Object[] r0 = this.f6223.f5977;
        int i2 = i * 2;
        C0969 r1 = this.f6223;
        Object obj = r0[i2];
        Object[] r12 = r1.f5977;
        C0969 r2 = this.f6223;
        return new AbstractMap.SimpleImmutableEntry(obj, r12[i2 + 1]);
    }
}
