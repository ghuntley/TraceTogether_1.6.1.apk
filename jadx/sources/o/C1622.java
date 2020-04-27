package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.ʇІ  reason: contains not printable characters */
public final class C1622<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C1622 f8540;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f8541 = true;

    private C1622() {
    }

    private C1622(Map<K, V> map) {
        super(map);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <K, V> C1622<K, V> m9368() {
        return f8540;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9369(C1622<K, V> r2) {
        m9366();
        if (!r2.isEmpty()) {
            putAll(r2);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        m9366();
        super.clear();
    }

    public final V put(K k, V v) {
        m9366();
        C0936.m6809(k);
        C0936.m6809(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m9366();
        for (Object next : map.keySet()) {
            C0936.m6809(next);
            C0936.m6809(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m9366();
        return super.remove(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1622.equals(java.lang.Object):boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m9367(Object obj) {
        if (obj instanceof byte[]) {
            return C0936.m6808((byte[]) obj);
        }
        if (!(obj instanceof C1000)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m9367(entry.getValue()) ^ m9367(entry.getKey());
        }
        return i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1622<K, V> m9371() {
        return isEmpty() ? new C1622<>() : new C1622<>(this);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9372() {
        this.f8541 = false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m9370() {
        return this.f8541;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m9366() {
        if (!this.f8541) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C1622 r0 = new C1622();
        f8540 = r0;
        r0.f8541 = false;
    }
}
