package o;

import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: o.ϖ  reason: contains not printable characters */
public final class C2143 implements C2638 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3062 f10301;

    public C2143(C3062 r1) {
        this.f10301 = r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> C3011<T> m11326(C3122 r12, C3101<T> r13) {
        C3011<Boolean> r2;
        Type type = r13.getType();
        if (!Map.class.isAssignableFrom(r13.getRawType())) {
            return null;
        }
        Type[] r0 = C3068.m15660(type, C3068.m15656(type));
        Type type2 = r0[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            r2 = C2700.f12448;
        } else {
            r2 = r12.m15830(C3101.get(type2));
        }
        C3011<?> r9 = r12.m15830(C3101.get(r0[1]));
        C1535<T> r10 = this.f10301.m15617(r13);
        return new C2144(this, r12, r0[0], r2, r0[1], r9, r10);
    }

    /* renamed from: o.ϖ$ı  reason: contains not printable characters */
    final class C2144<K, V> extends C3011<Map<K, V>> {

        /* renamed from: ı  reason: contains not printable characters */
        private final C1535<? extends Map<K, V>> f10302;

        /* renamed from: Ι  reason: contains not printable characters */
        private final C3011<K> f10303;

        /* renamed from: ι  reason: contains not printable characters */
        private final C3011<V> f10304;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m11328(C0815 r3, Object obj) {
            Map map = (Map) obj;
            if (map == null) {
                r3.m6224();
                return;
            }
            r3.m6234();
            for (Map.Entry entry : map.entrySet()) {
                r3.m6233(String.valueOf(entry.getKey()));
                this.f10304.m15435(r3, entry.getValue());
            }
            r3.m6225(3, 5, "}");
        }

        public C2144(C2143 r1, C3122 r2, Type type, C3011<K> r4, Type type2, C3011<V> r6, C1535<? extends Map<K, V>> r7) {
            this.f10303 = new C2989(r2, r4, type);
            this.f10304 = new C2989(r2, r6, type2);
            this.f10302 = r7;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m11327(C0995 r5) {
            C0313 r0 = r5.m7095();
            if (r0 == C0313.NULL) {
                r5.m7105();
                return null;
            }
            Map map = (Map) this.f10302.m8998();
            if (r0 == C0313.BEGIN_ARRAY) {
                r5.m7099();
                while (r5.m7092()) {
                    r5.m7099();
                    K r02 = this.f10303.m15434(r5);
                    if (map.put(r02, this.f10304.m15434(r5)) == null) {
                        r5.m7104();
                    } else {
                        throw new C1701("duplicate key: ".concat(String.valueOf(r02)));
                    }
                }
                r5.m7104();
            } else {
                r5.m7096();
                while (r5.m7092()) {
                    C0458.f4075.m4785(r5);
                    K r03 = this.f10303.m15434(r5);
                    if (map.put(r03, this.f10304.m15434(r5)) != null) {
                        throw new C1701("duplicate key: ".concat(String.valueOf(r03)));
                    }
                }
                r5.m7103();
            }
            return map;
        }
    }
}
