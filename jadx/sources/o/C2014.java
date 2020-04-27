package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C2319;

/* renamed from: o.ιʟ  reason: contains not printable characters */
public final class C2014 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2014 f9970 = new C2014();

    /* renamed from: ı  reason: contains not printable characters */
    private final Map<Class<?>, C2015> f9971 = new HashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<Class<?>, Boolean> f9972 = new HashMap();

    C2014() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m10826(Class<?> cls) {
        Boolean bool = this.f9972.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] r0 = m10823(cls);
        for (Method annotation : r0) {
            if (((C2912) annotation.getAnnotation(C2912.class)) != null) {
                m10822(cls, r0);
                return true;
            }
        }
        this.f9972.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Method[] m10823(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2015 m10825(Class<?> cls) {
        C2015 r0 = this.f9971.get(cls);
        if (r0 != null) {
            return r0;
        }
        return m10822(cls, (Method[]) null);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static void m10824(Map<If, C2319.C2320> map, If ifR, C2319.C2320 r5, Class<?> cls) {
        C2319.C2320 r0 = map.get(ifR);
        if (r0 != null && r5 != r0) {
            Method method = ifR.f9973;
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(r0);
            sb.append(", new value ");
            sb.append(r5);
            throw new IllegalArgumentException(sb.toString());
        } else if (r0 == null) {
            map.put(ifR, r5);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private C2015 m10822(Class<?> cls, Method[] methodArr) {
        int i;
        C2015 r0;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (r0 = m10825(superclass)) == null)) {
            hashMap.putAll(r0.f9976);
        }
        for (Class r5 : cls.getInterfaces()) {
            for (Map.Entry next : m10825(r5).f9976.entrySet()) {
                m10824(hashMap, (If) next.getKey(), (C2319.C2320) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m10823(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C2912 r6 = (C2912) method.getAnnotation(C2912.class);
            if (r6 != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C2851.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C2319.C2320 r62 = r6.m15070();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C2319.C2320.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (r62 == C2319.C2320.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m10824(hashMap, new If(i, method), r62, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C2015 r13 = new C2015(hashMap);
        this.f9971.put(cls, r13);
        this.f9972.put(cls, Boolean.valueOf(z));
        return r13;
    }

    /* renamed from: o.ιʟ$ǃ  reason: contains not printable characters */
    public static class C2015 {

        /* renamed from: ı  reason: contains not printable characters */
        public final Map<C2319.C2320, List<If>> f9975 = new HashMap();

        /* renamed from: ι  reason: contains not printable characters */
        final Map<If, C2319.C2320> f9976;

        C2015(Map<If, C2319.C2320> map) {
            this.f9976 = map;
            for (Map.Entry next : map.entrySet()) {
                C2319.C2320 r1 = (C2319.C2320) next.getValue();
                List list = this.f9975.get(r1);
                if (list == null) {
                    list = new ArrayList();
                    this.f9975.put(r1, list);
                }
                list.add(next.getKey());
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static void m10827(List<If> list, C2851 r7, C2319.C2320 r8, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    If ifR = list.get(size);
                    try {
                        int i = ifR.f9974;
                        if (i == 0) {
                            ifR.f9973.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            ifR.f9973.invoke(obj, new Object[]{r7});
                        } else if (i == 2) {
                            ifR.f9973.invoke(obj, new Object[]{r7, r8});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    /* renamed from: o.ιʟ$If */
    static class If {

        /* renamed from: ı  reason: contains not printable characters */
        final Method f9973;

        /* renamed from: ǃ  reason: contains not printable characters */
        final int f9974;

        If(int i, Method method) {
            this.f9974 = i;
            this.f9973 = method;
            this.f9973.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                If ifR = (If) obj;
                return this.f9974 == ifR.f9974 && this.f9973.getName().equals(ifR.f9973.getName());
            }
        }

        public final int hashCode() {
            return (this.f9974 * 31) + this.f9973.getName().hashCode();
        }
    }
}
