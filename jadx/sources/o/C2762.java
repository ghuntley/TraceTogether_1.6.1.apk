package o;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.ӀƖ  reason: contains not printable characters */
public final class C2762 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Map<Class<?>, List<Constructor<? extends C2257>>> f13089 = new HashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Map<Class<?>, Integer> f13090 = new HashMap();

    /* renamed from: ι  reason: contains not printable characters */
    static C2456 m14614(Object obj) {
        boolean z = obj instanceof C2456;
        boolean z2 = obj instanceof C2412;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C2412) obj, (C2456) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C2412) obj, (C2456) null);
        }
        if (z) {
            return (C2456) obj;
        }
        Class<?> cls = obj.getClass();
        if (m14612(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f13089.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m14611((Constructor) list.get(0), obj));
        }
        C2257[] r1 = new C2257[list.size()];
        for (int i = 0; i < list.size(); i++) {
            r1[i] = m14611((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C2257 m14611(Constructor<? extends C2257> constructor, Object obj) {
        try {
            return (C2257) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Constructor<? extends C2257> m14613(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName.replace(".", C3292bc.f1729));
            sb.append("_LifecycleAdapter");
            String obj = sb.toString();
            if (!name.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj);
                obj = sb2.toString();
            }
            Constructor<?> declaredConstructor = Class.forName(obj).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m14612(Class<?> cls) {
        Integer num = f13090.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int r0 = m14610(cls);
        f13090.put(cls, Integer.valueOf(r0));
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static int m14610(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C2257> r0 = m14613(cls);
        if (r0 != null) {
            f13089.put(cls, Collections.singletonList(r0));
            return 2;
        } else if (C2014.f9970.m10826(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (superclass != null && C2608.class.isAssignableFrom(superclass)) {
                if (m14612(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f13089.get(superclass));
            }
            Class[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            ArrayList arrayList2 = arrayList;
            for (int i = 0; i < length; i++) {
                Class cls2 = interfaces[i];
                if (cls2 != null && C2608.class.isAssignableFrom(cls2)) {
                    if (m14612(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.addAll(f13089.get(cls2));
                }
            }
            if (arrayList2 == null) {
                return 1;
            }
            f13089.put(cls, arrayList2);
            return 2;
        }
    }
}
