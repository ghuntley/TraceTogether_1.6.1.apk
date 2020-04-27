package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: o.էІ  reason: contains not printable characters */
final class C3073 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Unsafe f14024 = m15667();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final boolean f14025 = m15676();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final boolean f14026;

    /* renamed from: ι  reason: contains not printable characters */
    private static final long f14027;

    static {
        Unsafe unsafe;
        boolean r0 = m15670();
        f14026 = r0;
        f14027 = (long) (r0 ? f14024.arrayBaseOffset(byte[].class) : -1);
        Field r02 = m15674((Class<?>) Buffer.class, "address");
        if (r02 != null && (unsafe = f14024) != null) {
            unsafe.objectFieldOffset(r02);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m15669() {
        return f14026;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m15671() {
        return f14025;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static long m15673() {
        return f14027;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static byte m15672(byte[] bArr, long j) {
        return f14024.getByte(bArr, j);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m15675(byte[] bArr, long j, byte b) {
        f14024.putByte(bArr, j, b);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static long m15668(byte[] bArr, long j) {
        return f14024.getLong(bArr, j);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Unsafe m15667() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() {
                public final /* synthetic */ Object run() {
                    Class<Unsafe> cls = Unsafe.class;
                    for (Field field : cls.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get((Object) null);
                        if (cls.isInstance(obj)) {
                            return cls.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m15670() {
        Unsafe unsafe = f14024;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static boolean m15676() {
        Unsafe unsafe = f14024;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getByte", new Class[]{Long.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
                cls.getMethod("getLong", new Class[]{Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Field m15674(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }
}
