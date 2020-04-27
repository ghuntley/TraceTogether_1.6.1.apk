package o;

/* renamed from: o.ɼі  reason: contains not printable characters */
final class C1506 {

    /* renamed from: ı  reason: contains not printable characters */
    public static final int f8018 = 1;

    /* renamed from: Ɩ  reason: contains not printable characters */
    static final int f8019 = 1;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final int f8020 = 2;

    /* renamed from: ȷ  reason: contains not printable characters */
    static final int f8021 = m8929(1, 4);

    /* renamed from: ɨ  reason: contains not printable characters */
    static final int f8022 = 3;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final int f8023 = 4;

    /* renamed from: ɪ  reason: contains not printable characters */
    static final int f8024 = m8929(3, 2);

    /* renamed from: ɹ  reason: contains not printable characters */
    static final int f8025 = 3;

    /* renamed from: ɾ  reason: contains not printable characters */
    static final int f8026 = m8929(2, 0);

    /* renamed from: Ι  reason: contains not printable characters */
    public static final int f8027 = 3;

    /* renamed from: ι  reason: contains not printable characters */
    public static final int f8028 = 0;

    /* renamed from: І  reason: contains not printable characters */
    public static final int f8029 = 5;

    /* renamed from: і  reason: contains not printable characters */
    static final int f8030 = 7;

    /* renamed from: Ӏ  reason: contains not printable characters */
    static final int f8031 = 2;

    /* renamed from: ӏ  reason: contains not printable characters */
    static final int f8032 = m8929(1, 3);

    /* renamed from: Ι  reason: contains not printable characters */
    static int m8928(int i) {
        return i & 7;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static int m8929(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m8930(int i) {
        return i >>> 3;
    }

    private C1506() {
    }

    /* renamed from: o.ɼі$ı  reason: contains not printable characters */
    enum C1507 {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C0754.f5101),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: ɹ  reason: contains not printable characters */
        private final Object f8043;

        private C1507(Object obj) {
            this.f8043 = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final Object m8931() {
            return this.f8043;
        }
    }

    /* renamed from: o.ɼі$ǃ  reason: contains not printable characters */
    enum C1508 {
        DOUBLE(C1507.DOUBLE, 1),
        FLOAT(C1507.FLOAT, 5),
        INT64(C1507.LONG, 0),
        UINT64(C1507.LONG, 0),
        INT32(C1507.INT, 0),
        FIXED64(C1507.LONG, 1),
        FIXED32(C1507.INT, 5),
        BOOL(C1507.BOOLEAN, 0),
        STRING(C1507.STRING, 2) {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final boolean m8938() {
                return false;
            }
        },
        GROUP(C1507.MESSAGE, 3) {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final boolean m8937() {
                return false;
            }
        },
        MESSAGE(C1507.MESSAGE, 2) {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final boolean m8936() {
                return false;
            }
        },
        BYTES(C1507.BYTE_STRING, 2) {
            /* renamed from: ǃ  reason: contains not printable characters */
            public final boolean m8935() {
                return false;
            }
        },
        UINT32(C1507.INT, 0),
        ENUM(C1507.ENUM, 0),
        SFIXED32(C1507.INT, 5),
        SFIXED64(C1507.LONG, 1),
        SINT32(C1507.INT, 0),
        SINT64(C1507.LONG, 0);
        

        /* renamed from: ł  reason: contains not printable characters */
        private final C1507 f8063;

        /* renamed from: ʟ  reason: contains not printable characters */
        private final int f8064;

        /* renamed from: ǃ  reason: contains not printable characters */
        public boolean m8932() {
            return true;
        }

        private C1508(C1507 r3, int i) {
            this.f8063 = r3;
            this.f8064 = i;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public C1507 m8933() {
            return this.f8063;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public int m8934() {
            return this.f8064;
        }
    }
}
