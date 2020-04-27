package o;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: o.ιѫ  reason: contains not printable characters */
public final class C2067<E> extends C3011<Object> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final C2638 f10139 = new C2638() {
        /* renamed from: ı  reason: contains not printable characters */
        public final <T> C3011<T> m10995(C3122 r3, C3101<T> r4) {
            Type type = r4.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type r42 = C3068.m15655(type);
            return new C2067(r3, r3.m15830(C3101.get(r42)), C3068.m15656(r42));
        }
    };

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Class<E> f10140;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3011<E> f10141;

    public C2067(C3122 r2, C3011<E> r3, Class<E> cls) {
        this.f10141 = new C2989(r2, r3, cls);
        this.f10140 = cls;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m10993(C0995 r5) {
        if (r5.m7095() == C0313.NULL) {
            r5.m7105();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        r5.m7099();
        while (r5.m7092()) {
            arrayList.add(this.f10141.m15434(r5));
        }
        r5.m7104();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f10140, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10994(C0815 r5, Object obj) {
        if (obj == null) {
            r5.m6224();
            return;
        }
        r5.m6232();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f10141.m15435(r5, Array.get(obj, i));
        }
        r5.m6225(1, 2, "]");
    }
}
