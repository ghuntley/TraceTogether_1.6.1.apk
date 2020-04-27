package o;

import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: o.ιʬ  reason: contains not printable characters */
public final class C2016 implements C2638 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C3062 f9977;

    public C2016(C3062 r1) {
        this.f9977 = r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> C3011<T> m10828(C3122 r4, C3101<T> r5) {
        Type type = r5.getType();
        Class<? super T> rawType = r5.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type r0 = C3068.m15662(type, rawType);
        return new C2017(r4, r0, r4.m15830(C3101.get(r0)), this.f9977.m15617(r5));
    }

    /* renamed from: o.ιʬ$ɩ  reason: contains not printable characters */
    static final class C2017<E> extends C3011<Collection<E>> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C1535<? extends Collection<E>> f9978;

        /* renamed from: ι  reason: contains not printable characters */
        private final C3011<E> f9979;

        /* renamed from: ɩ  reason: contains not printable characters */
        public final /* synthetic */ void m10830(C0815 r3, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                r3.m6224();
                return;
            }
            r3.m6232();
            for (Object r0 : collection) {
                this.f9979.m15435(r3, r0);
            }
            r3.m6225(1, 2, "]");
        }

        public C2017(C3122 r2, Type type, C3011<E> r4, C1535<? extends Collection<E>> r5) {
            this.f9979 = new C2989(r2, r4, type);
            this.f9978 = r5;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final /* synthetic */ Object m10829(C0995 r3) {
            if (r3.m7095() == C0313.NULL) {
                r3.m7105();
                return null;
            }
            Collection collection = (Collection) this.f9978.m8998();
            r3.m7099();
            while (r3.m7092()) {
                collection.add(this.f9979.m15434(r3));
            }
            r3.m7104();
            return collection;
        }
    }
}
