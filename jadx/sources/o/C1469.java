package o;

import java.lang.reflect.InvocationTargetException;
import o.C1277;

/* renamed from: o.ɹΙ  reason: contains not printable characters */
public class C1469 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C0910<String, Class<?>> f7902 = new C0910<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Class<?> m8796(ClassLoader classLoader, String str) {
        Class<?> cls = f7902.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        f7902.put(str, cls2);
        return cls2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static boolean m8795(ClassLoader classLoader, String str) {
        try {
            return C1277.class.isAssignableFrom(m8796(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Class<? extends C1277> m8797(ClassLoader classLoader, String str) {
        try {
            return m8796(classLoader, str);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists");
            throw new C1277.C1279(sb.toString(), e);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class is a valid subclass of Fragment");
            throw new C1277.C1279(sb2.toString(), e2);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public C1277 m8798(ClassLoader classLoader, String str) {
        try {
            return (C1277) m8797(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C1277.C1279(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C1277.C1279(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new C1277.C1279(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new C1277.C1279(sb4.toString(), e4);
        }
    }
}
