package o;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.ιօ  reason: contains not printable characters */
final class C2092 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2342<?, ?> f10169 = m11133(false);

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2342<?, ?> f10170 = m11133(true);

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2342<?, ?> f10171 = new C2315();

    /* renamed from: ι  reason: contains not printable characters */
    private static final Class<?> f10172 = m11163();

    /* renamed from: ι  reason: contains not printable characters */
    public static void m11173(Class<?> cls) {
        Class<?> cls2;
        if (!C0987.class.isAssignableFrom(cls) && (cls2 = f10172) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m11135(int i, List<Double> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14904(i, list, z);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m11146(int i, List<Float> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14906(i, list, z);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m11154(int i, List<Long> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14901(i, list, z);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m11172(int i, List<Long> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14871(i, list, z);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m11165(int i, List<Long> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14878(i, list, z);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static void m11158(int i, List<Long> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14876(i, list, z);
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public static void m11182(int i, List<Long> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14886(i, list, z);
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public static void m11139(int i, List<Integer> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14893(i, list, z);
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    public static void m11176(int i, List<Integer> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14907(i, list, z);
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    public static void m11179(int i, List<Integer> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14908(i, list, z);
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public static void m11148(int i, List<Integer> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14885(i, list, z);
        }
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public static void m11149(int i, List<Integer> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14877(i, list, z);
        }
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public static void m11155(int i, List<Integer> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14887(i, list, z);
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public static void m11183(int i, List<Boolean> list, C2867 r3, boolean z) {
        if (list != null && !list.isEmpty()) {
            r3.m14872(i, list, z);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m11145(int i, List<String> list, C2867 r3) {
        if (list != null && !list.isEmpty()) {
            r3.m14891(i, list);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m11164(int i, List<C0510> list, C2867 r3) {
        if (list != null && !list.isEmpty()) {
            r3.m14900(i, list);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m11171(int i, List<?> list, C2867 r3, C1990 r4) {
        if (list != null && !list.isEmpty()) {
            r3.m14892(i, list, r4);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m11134(int i, List<?> list, C2867 r3, C1990 r4) {
        if (list != null && !list.isEmpty()) {
            r3.m14875(i, list, r4);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m11143(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1440) {
            C1440 r5 = (C1440) list;
            i = 0;
            while (i2 < size) {
                i += C0692.m5636(r5.m8703(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0692.m5636(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m11150(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m11143(list) + (list.size() * C0692.m5647(i));
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m11130(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1440) {
            C1440 r5 = (C1440) list;
            i = 0;
            while (i2 < size) {
                i += C0692.m5642(r5.m8703(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0692.m5642(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m11142(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m11130(list) + (size * C0692.m5647(i));
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m11169(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1440) {
            C1440 r5 = (C1440) list;
            i = 0;
            while (i2 < size) {
                i += C0692.m5641(r5.m8703(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0692.m5641(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m11161(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m11169(list) + (size * C0692.m5647(i));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m11162(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0986) {
            C0986 r4 = (C0986) list;
            i = 0;
            while (i2 < size) {
                i += C0692.m5681(r4.m6975(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0692.m5681(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static int m11168(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m11162(list) + (size * C0692.m5647(i));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static int m11151(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0986) {
            C0986 r4 = (C0986) list;
            i = 0;
            while (i2 < size) {
                i += C0692.m5654(r4.m6975(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0692.m5654(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m11129(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m11151(list) + (size * C0692.m5647(i));
    }

    /* renamed from: І  reason: contains not printable characters */
    static int m11175(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0986) {
            C0986 r4 = (C0986) list;
            i = 0;
            while (i2 < size) {
                i += C0692.m5639(r4.m6975(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0692.m5639(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    static int m11180(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m11175(list) + (size * C0692.m5647(i));
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    static int m11181(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0986) {
            C0986 r4 = (C0986) list;
            i = 0;
            while (i2 < size) {
                i += C0692.m5678(r4.m6975(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0692.m5678(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    static int m11137(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m11181(list) + (size * C0692.m5647(i));
    }

    /* renamed from: і  reason: contains not printable characters */
    static int m11178(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: і  reason: contains not printable characters */
    static int m11177(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0692.m5679(i, 0);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    static int m11138(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    static int m11156(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0692.m5672(i, 0);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    static int m11157(List<?> list) {
        return list.size();
    }

    /* renamed from: І  reason: contains not printable characters */
    static int m11174(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0692.m5666(i, true);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m11159(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int r4 = C0692.m5647(i) * size;
        if (list instanceof C1183) {
            C1183 r5 = (C1183) list;
            while (i4 < size) {
                Object r2 = r5.m7714(i4);
                if (r2 instanceof C0510) {
                    i3 = C0692.m5651((C0510) r2);
                } else {
                    i3 = C0692.m5643((String) r2);
                }
                r4 += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C0510) {
                    i2 = C0692.m5651((C0510) obj);
                } else {
                    i2 = C0692.m5643((String) obj);
                }
                r4 += i2;
                i4++;
            }
        }
        return r4;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static int m11128(int i, Object obj, C1990 r3) {
        if (obj instanceof C1259) {
            return C0692.m5649(i, (C1259) obj);
        }
        return C0692.m5635(i, (C1637) obj, r3);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m11141(int i, List<?> list, C1990 r6) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r4 = C0692.m5647(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C1259) {
                i2 = C0692.m5667((C1259) obj);
            } else {
                i2 = C0692.m5644((C1637) obj, r6);
            }
            r4 += i2;
        }
        return r4;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m11140(int i, List<C0510> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r0 = size * C0692.m5647(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            r0 += C0692.m5651(list.get(i2));
        }
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m11160(int i, List<C1637> list, C1990 r6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0692.m5650(i, list.get(i3), r6);
        }
        return i2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C2342<?, ?> m11170() {
        return f10169;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2342<?, ?> m11153() {
        return f10170;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2342<?, ?> m11144() {
        return f10171;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static C2342<?, ?> m11133(boolean z) {
        try {
            Class<?> r1 = m11131();
            if (r1 == null) {
                return null;
            }
            return (C2342) r1.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static Class<?> m11163() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Class<?> m11131() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m11167(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static <T> void m11136(C1532 r1, T t, T t2, long j) {
        C2509.m13291((Object) t, j, r1.m8987(C2509.m13271(t, j), C2509.m13271(t2, j)));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static <T, FT extends C0750<FT>> void m11147(C0740<FT> r1, T t, T t2) {
        C0790<FT> r3 = r1.m5922(t2);
        if (!r3.f5255.isEmpty()) {
            r1.m5921((Object) t).m6163(r3);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static <T, UT, UB> void m11166(C2342<UT, UB> r1, T t, T t2) {
        r1.m12216((Object) t, r1.m12207(r1.m12218(t), r1.m12218(t2)));
    }

    /* renamed from: ı  reason: contains not printable characters */
    static <UT, UB> UB m11132(int i, List<Integer> list, C1025 r7, UB ub, C2342<UT, UB> r9) {
        UB ub2;
        if (r7 == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (!r7.m7263(intValue)) {
                        ub = m11152(i, intValue, ub2, r9);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = list.get(i3).intValue();
                if (r7.m7263(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m11152(i, intValue2, ub2, r9);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static <UT, UB> UB m11152(int i, int i2, UB ub, C2342<UT, UB> r5) {
        if (ub == null) {
            ub = r5.m12214();
        }
        r5.m12213(ub, i, (long) i2);
        return ub;
    }
}
