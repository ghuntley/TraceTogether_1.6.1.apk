package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.εǃ  reason: contains not printable characters */
final class C1934 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final C1934 f9762 = new C1934();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final ConcurrentMap<Class<?>, C1990<?>> f9763 = new ConcurrentHashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2095 f9764 = new C1419();

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1934 m10558() {
        return f9762;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T> C1990<T> m10559(Class<T> cls) {
        C0936.m6813(cls, "messageType");
        C1990<T> r1 = (C1990) this.f9763.get(cls);
        if (r1 != null) {
            return r1;
        }
        C1990<T> r12 = this.f9764.m11184(cls);
        C0936.m6813(cls, "messageType");
        C0936.m6813(r12, "schema");
        C1990<T> putIfAbsent = this.f9763.putIfAbsent(cls, r12);
        return putIfAbsent != null ? putIfAbsent : r12;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T> C1990<T> m10560(T t) {
        return m10559(t.getClass());
    }

    private C1934() {
    }
}
