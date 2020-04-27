package o;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: o.ы  reason: contains not printable characters */
final class C2509 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Class<?> f11325 = C0517.m4979();

    /* renamed from: ŀ  reason: contains not printable characters */
    private static final long f11326;

    /* renamed from: ł  reason: contains not printable characters */
    private static final long f11327;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final boolean f11328 = m13268();

    /* renamed from: Ɨ  reason: contains not printable characters */
    private static final long f11329 = ((long) m13294(Object[].class));

    /* renamed from: ƚ  reason: contains not printable characters */
    private static final long f11330 = ((long) m13288(Object[].class));

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final boolean f11331 = m13269(Long.TYPE);

    /* renamed from: ȷ  reason: contains not printable characters */
    private static final long f11332;

    /* renamed from: ɍ  reason: contains not printable characters */
    private static final long f11333;

    /* renamed from: ɨ  reason: contains not printable characters */
    private static final long f11334;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Logger f11335 = Logger.getLogger(C2509.class.getName());

    /* renamed from: ɪ  reason: contains not printable characters */
    private static final long f11336;

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final boolean f11337 = m13284();

    /* renamed from: ɾ  reason: contains not printable characters */
    private static final long f11338;

    /* renamed from: ɿ  reason: contains not printable characters */
    private static final long f11339;

    /* renamed from: ʅ  reason: contains not printable characters */
    private static final int f11340 = ((int) (f11344 & 7));

    /* renamed from: ʟ  reason: contains not printable characters */
    private static final long f11341;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Unsafe f11342 = m13289();

    /* renamed from: ι  reason: contains not printable characters */
    static final boolean f11343 = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: І  reason: contains not printable characters */
    private static final long f11344 = ((long) m13294(byte[].class));

    /* renamed from: г  reason: contains not printable characters */
    private static final long f11345;

    /* renamed from: і  reason: contains not printable characters */
    private static final boolean f11346 = m13269(Integer.TYPE);

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final Cif f11347;

    /* renamed from: ӏ  reason: contains not printable characters */
    private static final long f11348;

    private C2509() {
    }

    /* renamed from: o.ы$If */
    static final class If extends Cif {
        If(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final byte m13308(Object obj, long j) {
            if (C2509.f11343) {
                return C2509.m13285(obj, j);
            }
            return C2509.m13279(obj, j);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m13310(Object obj, long j, byte b) {
            if (C2509.f11343) {
                C2509.m13263(obj, j, b);
            } else {
                C2509.m13281(obj, j, b);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m13306(Object obj, long j) {
            if (C2509.f11343) {
                return C2509.m13302(obj, j);
            }
            return C2509.m13278(obj, j);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13309(Object obj, long j, boolean z) {
            if (C2509.f11343) {
                C2509.m13266(obj, j, z);
            } else {
                C2509.m13283(obj, j, z);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final float m13307(Object obj, long j) {
            return Float.intBitsToFloat(m13321(obj, j));
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13305(Object obj, long j, float f) {
            m13319(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final double m13303(Object obj, long j) {
            return Double.longBitsToDouble(m13317(obj, j));
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m13304(Object obj, long j, double d) {
            m13316(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: o.ы$ǃ  reason: contains not printable characters */
    static final class C2510 extends Cif {
        C2510(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final byte m13328(Object obj, long j) {
            if (C2509.f11343) {
                return C2509.m13285(obj, j);
            }
            return C2509.m13279(obj, j);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m13330(Object obj, long j, byte b) {
            if (C2509.f11343) {
                C2509.m13263(obj, j, b);
            } else {
                C2509.m13281(obj, j, b);
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m13326(Object obj, long j) {
            if (C2509.f11343) {
                return C2509.m13302(obj, j);
            }
            return C2509.m13278(obj, j);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13329(Object obj, long j, boolean z) {
            if (C2509.f11343) {
                C2509.m13266(obj, j, z);
            } else {
                C2509.m13283(obj, j, z);
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final float m13327(Object obj, long j) {
            return Float.intBitsToFloat(m13321(obj, j));
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13325(Object obj, long j, float f) {
            m13319(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final double m13323(Object obj, long j) {
            return Double.longBitsToDouble(m13317(obj, j));
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m13324(Object obj, long j, double d) {
            m13316(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: o.ы$ɩ  reason: contains not printable characters */
    static final class C2511 extends Cif {
        C2511(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final byte m13336(Object obj, long j) {
            return this.f11349.getByte(obj, j);
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final void m13338(Object obj, long j, byte b) {
            this.f11349.putByte(obj, j, b);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m13334(Object obj, long j) {
            return this.f11349.getBoolean(obj, j);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13337(Object obj, long j, boolean z) {
            this.f11349.putBoolean(obj, j, z);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final float m13335(Object obj, long j) {
            return this.f11349.getFloat(obj, j);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m13333(Object obj, long j, float f) {
            this.f11349.putFloat(obj, j, f);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final double m13331(Object obj, long j) {
            return this.f11349.getDouble(obj, j);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m13332(Object obj, long j, double d) {
            this.f11349.putDouble(obj, j, d);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    static boolean m13297() {
        return f11337;
    }

    /* renamed from: o.ы$if  reason: invalid class name */
    static abstract class Cif {

        /* renamed from: ι  reason: contains not printable characters */
        Unsafe f11349;

        Cif(Unsafe unsafe) {
            this.f11349 = unsafe;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public abstract double m13311(Object obj, long j);

        /* renamed from: ı  reason: contains not printable characters */
        public abstract void m13312(Object obj, long j, double d);

        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract void m13313(Object obj, long j, float f);

        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract boolean m13314(Object obj, long j);

        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract float m13315(Object obj, long j);

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract byte m13318(Object obj, long j);

        /* renamed from: Ι  reason: contains not printable characters */
        public abstract void m13320(Object obj, long j, boolean z);

        /* renamed from: ι  reason: contains not printable characters */
        public abstract void m13322(Object obj, long j, byte b);

        /* renamed from: ι  reason: contains not printable characters */
        public final int m13321(Object obj, long j) {
            return this.f11349.getInt(obj, j);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m13319(Object obj, long j, int i) {
            this.f11349.putInt(obj, j, i);
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final long m13317(Object obj, long j) {
            return this.f11349.getLong(obj, j);
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m13316(Object obj, long j, long j2) {
            this.f11349.putLong(obj, j, j2);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m13277() {
        return f11328;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static <T> T m13274(Class<T> cls) {
        try {
            return f11342.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static int m13294(Class<?> cls) {
        if (f11337) {
            return f11347.f11349.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static int m13288(Class<?> cls) {
        if (f11337) {
            return f11347.f11349.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static int m13273(Object obj, long j) {
        return f11347.m13321(obj, j);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static void m13265(Object obj, long j, int i) {
        f11347.m13319(obj, j, i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static long m13280(Object obj, long j) {
        return f11347.m13317(obj, j);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static void m13275(Object obj, long j, long j2) {
        f11347.m13316(obj, j, j2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static boolean m13270(Object obj, long j) {
        return f11347.m13314(obj, j);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m13296(Object obj, long j, boolean z) {
        f11347.m13320(obj, j, z);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static float m13293(Object obj, long j) {
        return f11347.m13315(obj, j);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m13282(Object obj, long j, float f) {
        f11347.m13313(obj, j, f);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static double m13287(Object obj, long j) {
        return f11347.m13311(obj, j);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static void m13264(Object obj, long j, double d) {
        f11347.m13312(obj, j, d);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    static Object m13271(Object obj, long j) {
        return f11347.f11349.getObject(obj, j);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m13291(Object obj, long j, Object obj2) {
        f11347.f11349.putObject(obj, j, obj2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static byte m13272(byte[] bArr, long j) {
        return f11347.m13318(bArr, f11344 + j);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static void m13267(byte[] bArr, long j, byte b) {
        f11347.m13322(bArr, f11344 + j, b);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static Unsafe m13289() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2543());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m13284() {
        Unsafe unsafe = f11342;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C0517.m4978()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f11335;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m13268() {
        Unsafe unsafe = f11342;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m13299() == null) {
                return false;
            }
            if (C0517.m4978()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f11335;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean m13269(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C0517.m4978()) {
            return false;
        }
        try {
            Class<?> cls3 = f11325;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    private static Field m13299() {
        Field r0;
        if (C0517.m4978() && (r0 = m13262((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return r0;
        }
        Field r02 = m13262((Class<?>) Buffer.class, "address");
        if (r02 == null || r02.getType() != Long.TYPE) {
            return null;
        }
        return r02;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Field m13262(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɪ  reason: contains not printable characters */
    public static byte m13285(Object obj, long j) {
        return (byte) (m13273(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: ɨ  reason: contains not printable characters */
    public static byte m13279(Object obj, long j) {
        return (byte) (m13273(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static void m13263(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int r2 = m13273(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m13265(obj, j2, ((255 & b) << i) | (r2 & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m13281(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m13265(obj, j2, ((255 & b) << i) | (m13273(obj, j2) & (~(255 << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: ӏ  reason: contains not printable characters */
    public static boolean m13302(Object obj, long j) {
        return m13285(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: ȷ  reason: contains not printable characters */
    public static boolean m13278(Object obj, long j) {
        return m13279(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static void m13266(Object obj, long j, boolean z) {
        m13263(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m13283(Object obj, long j, boolean z) {
        m13281(obj, j, z ? (byte) 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00d2, code lost:
        r1 = f11347;
     */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            java.lang.Class<o.ы> r5 = o.C2509.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            f11335 = r5
            sun.misc.Unsafe r5 = m13289()
            f11342 = r5
            java.lang.Class r5 = o.C0517.m4979()
            f11325 = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = m13269(r5)
            f11331 = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = m13269(r5)
            f11346 = r5
            sun.misc.Unsafe r5 = f11342
            r6 = 0
            if (r5 != 0) goto L_0x0038
            goto L_0x005d
        L_0x0038:
            boolean r5 = o.C0517.m4978()
            if (r5 == 0) goto L_0x0056
            boolean r5 = f11331
            if (r5 == 0) goto L_0x004a
            o.ы$If r6 = new o.ы$If
            sun.misc.Unsafe r5 = f11342
            r6.<init>(r5)
            goto L_0x005d
        L_0x004a:
            boolean r5 = f11346
            if (r5 == 0) goto L_0x005d
            o.ы$ǃ r6 = new o.ы$ǃ
            sun.misc.Unsafe r5 = f11342
            r6.<init>(r5)
            goto L_0x005d
        L_0x0056:
            o.ы$ɩ r6 = new o.ы$ɩ
            sun.misc.Unsafe r5 = f11342
            r6.<init>(r5)
        L_0x005d:
            f11347 = r6
            boolean r5 = m13268()
            f11328 = r5
            boolean r5 = m13284()
            f11337 = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = m13294(r5)
            long r5 = (long) r5
            f11344 = r5
            int r5 = m13294(r4)
            long r5 = (long) r5
            f11348 = r5
            int r4 = m13288(r4)
            long r4 = (long) r4
            f11334 = r4
            int r4 = m13294(r3)
            long r4 = (long) r4
            f11338 = r4
            int r3 = m13288(r3)
            long r3 = (long) r3
            f11332 = r3
            int r3 = m13294(r2)
            long r3 = (long) r3
            f11336 = r3
            int r2 = m13288(r2)
            long r2 = (long) r2
            f11326 = r2
            int r2 = m13294(r1)
            long r2 = (long) r2
            f11345 = r2
            int r1 = m13288(r1)
            long r1 = (long) r1
            f11327 = r1
            int r1 = m13294(r0)
            long r1 = (long) r1
            f11339 = r1
            int r0 = m13288(r0)
            long r0 = (long) r0
            f11341 = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = m13294(r0)
            long r0 = (long) r0
            f11329 = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = m13288(r0)
            long r0 = (long) r0
            f11330 = r0
            java.lang.reflect.Field r0 = m13299()
            if (r0 == 0) goto L_0x00de
            o.ы$if r1 = f11347
            if (r1 != 0) goto L_0x00d7
            goto L_0x00de
        L_0x00d7:
            sun.misc.Unsafe r1 = r1.f11349
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00e0
        L_0x00de:
            r0 = -1
        L_0x00e0:
            f11333 = r0
            long r0 = f11344
            r2 = 7
            long r0 = r0 & r2
            int r1 = (int) r0
            f11340 = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00f4
            r0 = 1
            goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            f11343 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2509.<clinit>():void");
    }
}
