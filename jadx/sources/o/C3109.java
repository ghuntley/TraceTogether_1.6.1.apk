package o;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.լɼ  reason: contains not printable characters */
public final class C3109 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Map<Class<?>, Class<?>> f14210;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        Class cls = Boolean.TYPE;
        Class<Boolean> cls2 = Boolean.class;
        hashMap.put(cls, cls2);
        hashMap2.put(cls2, cls);
        Class cls3 = Byte.TYPE;
        Class<Byte> cls4 = Byte.class;
        hashMap.put(cls3, cls4);
        hashMap2.put(cls4, cls3);
        Class cls5 = Character.TYPE;
        Class<Character> cls6 = Character.class;
        hashMap.put(cls5, cls6);
        hashMap2.put(cls6, cls5);
        Class cls7 = Double.TYPE;
        Class<Double> cls8 = Double.class;
        hashMap.put(cls7, cls8);
        hashMap2.put(cls8, cls7);
        Class cls9 = Float.TYPE;
        Class<Float> cls10 = Float.class;
        hashMap.put(cls9, cls10);
        hashMap2.put(cls10, cls9);
        Class cls11 = Integer.TYPE;
        Class<Integer> cls12 = Integer.class;
        hashMap.put(cls11, cls12);
        hashMap2.put(cls12, cls11);
        Class cls13 = Long.TYPE;
        Class<Long> cls14 = Long.class;
        hashMap.put(cls13, cls14);
        hashMap2.put(cls14, cls13);
        Class cls15 = Short.TYPE;
        Class<Short> cls16 = Short.class;
        hashMap.put(cls15, cls16);
        hashMap2.put(cls16, cls15);
        Class cls17 = Void.TYPE;
        Class<Void> cls18 = Void.class;
        hashMap.put(cls17, cls18);
        hashMap2.put(cls18, cls17);
        f14210 = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m15769(Type type) {
        return f14210.containsKey(type);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <T> Class<T> m15768(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f14210;
        if (cls != null) {
            Class<T> cls2 = map.get(cls);
            return cls2 == null ? cls : cls2;
        }
        throw new NullPointerException();
    }
}
