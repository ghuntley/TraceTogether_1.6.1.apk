package o;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: o.ʂȷ  reason: contains not printable characters */
public abstract class C1605 {
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract <T> T m9318(Class<T> cls);

    /* renamed from: Ι  reason: contains not printable characters */
    public static C1605 m9316() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get((Object) null);
            final Method method = cls.getMethod("allocateInstance", new Class[]{Class.class});
            return new C1605() {
                /* renamed from: ɩ  reason: contains not printable characters */
                public final <T> T m9319(Class<T> cls) {
                    m9317(cls);
                    return method.invoke(obj, new Object[]{cls});
                }
            };
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C1605() {
                    /* renamed from: ɩ  reason: contains not printable characters */
                    public final <T> T m9322(Class<T> cls) {
                        m9317(cls);
                        return declaredMethod2.invoke((Object) null, new Object[]{cls, Integer.valueOf(intValue)});
                    }
                };
            } catch (Exception unused2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C1605() {
                        /* renamed from: ɩ  reason: contains not printable characters */
                        public final <T> T m9321(Class<T> cls) {
                            m9317(cls);
                            return declaredMethod3.invoke((Object) null, new Object[]{cls, Object.class});
                        }
                    };
                } catch (Exception unused3) {
                    return new C1605() {
                        /* renamed from: ɩ  reason: contains not printable characters */
                        public final <T> T m9320(Class<T> cls) {
                            throw new UnsupportedOperationException("Cannot allocate ".concat(String.valueOf(cls)));
                        }
                    };
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m9317(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }
}
