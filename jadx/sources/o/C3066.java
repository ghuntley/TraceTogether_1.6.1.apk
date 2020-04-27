package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: o.զ  reason: contains not printable characters */
final class C3066 extends C3063 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Class f14011;

    /* renamed from: ı  reason: contains not printable characters */
    private final Field f14012 = m15641();

    /* renamed from: ι  reason: contains not printable characters */
    private final Object f14013 = m15642();

    C3066() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15644(AccessibleObject accessibleObject) {
        if (!m15643(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder("Gson couldn't modify fields for ");
                sb.append(accessibleObject);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new C1169(sb.toString(), e);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean m15643(AccessibleObject accessibleObject) {
        if (!(this.f14013 == null || this.f14012 == null)) {
            try {
                long longValue = ((Long) f14011.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f14013, new Object[]{this.f14012})).longValue();
                f14011.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f14013, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Object m15642() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f14011 = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Field m15641() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
