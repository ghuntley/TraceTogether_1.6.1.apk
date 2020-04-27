package o;

import java.lang.reflect.Type;

/* renamed from: o.ƚј  reason: contains not printable characters */
public enum C0752 {
    DOUBLE(0, C0811.SCALAR, C1104.DOUBLE),
    FLOAT(1, C0811.SCALAR, C1104.FLOAT),
    INT64(2, C0811.SCALAR, C1104.LONG),
    UINT64(3, C0811.SCALAR, C1104.LONG),
    INT32(4, C0811.SCALAR, C1104.INT),
    FIXED64(5, C0811.SCALAR, C1104.LONG),
    FIXED32(6, C0811.SCALAR, C1104.INT),
    BOOL(7, C0811.SCALAR, C1104.BOOLEAN),
    STRING(8, C0811.SCALAR, C1104.STRING),
    MESSAGE(9, C0811.SCALAR, C1104.MESSAGE),
    BYTES(10, C0811.SCALAR, C1104.BYTE_STRING),
    UINT32(11, C0811.SCALAR, C1104.INT),
    ENUM(12, C0811.SCALAR, C1104.ENUM),
    SFIXED32(13, C0811.SCALAR, C1104.INT),
    SFIXED64(14, C0811.SCALAR, C1104.LONG),
    SINT32(15, C0811.SCALAR, C1104.INT),
    SINT64(16, C0811.SCALAR, C1104.LONG),
    GROUP(17, C0811.SCALAR, C1104.MESSAGE),
    DOUBLE_LIST(18, C0811.VECTOR, C1104.DOUBLE),
    FLOAT_LIST(19, C0811.VECTOR, C1104.FLOAT),
    INT64_LIST(20, C0811.VECTOR, C1104.LONG),
    UINT64_LIST(21, C0811.VECTOR, C1104.LONG),
    INT32_LIST(22, C0811.VECTOR, C1104.INT),
    FIXED64_LIST(23, C0811.VECTOR, C1104.LONG),
    FIXED32_LIST(24, C0811.VECTOR, C1104.INT),
    BOOL_LIST(25, C0811.VECTOR, C1104.BOOLEAN),
    STRING_LIST(26, C0811.VECTOR, C1104.STRING),
    MESSAGE_LIST(27, C0811.VECTOR, C1104.MESSAGE),
    BYTES_LIST(28, C0811.VECTOR, C1104.BYTE_STRING),
    UINT32_LIST(29, C0811.VECTOR, C1104.INT),
    ENUM_LIST(30, C0811.VECTOR, C1104.ENUM),
    SFIXED32_LIST(31, C0811.VECTOR, C1104.INT),
    SFIXED64_LIST(32, C0811.VECTOR, C1104.LONG),
    SINT32_LIST(33, C0811.VECTOR, C1104.INT),
    SINT64_LIST(34, C0811.VECTOR, C1104.LONG),
    DOUBLE_LIST_PACKED(35, C0811.PACKED_VECTOR, C1104.DOUBLE),
    FLOAT_LIST_PACKED(36, C0811.PACKED_VECTOR, C1104.FLOAT),
    INT64_LIST_PACKED(37, C0811.PACKED_VECTOR, C1104.LONG),
    UINT64_LIST_PACKED(38, C0811.PACKED_VECTOR, C1104.LONG),
    INT32_LIST_PACKED(39, C0811.PACKED_VECTOR, C1104.INT),
    FIXED64_LIST_PACKED(40, C0811.PACKED_VECTOR, C1104.LONG),
    FIXED32_LIST_PACKED(41, C0811.PACKED_VECTOR, C1104.INT),
    BOOL_LIST_PACKED(42, C0811.PACKED_VECTOR, C1104.BOOLEAN),
    UINT32_LIST_PACKED(43, C0811.PACKED_VECTOR, C1104.INT),
    ENUM_LIST_PACKED(44, C0811.PACKED_VECTOR, C1104.ENUM),
    SFIXED32_LIST_PACKED(45, C0811.PACKED_VECTOR, C1104.INT),
    SFIXED64_LIST_PACKED(46, C0811.PACKED_VECTOR, C1104.LONG),
    SINT32_LIST_PACKED(47, C0811.PACKED_VECTOR, C1104.INT),
    SINT64_LIST_PACKED(48, C0811.PACKED_VECTOR, C1104.LONG),
    GROUP_LIST(49, C0811.VECTOR, C1104.MESSAGE),
    MAP(50, C0811.MAP, C1104.VOID);
    

    /* renamed from: ʃ  reason: contains not printable characters */
    private static final Type[] f5062 = null;

    /* renamed from: ʌ  reason: contains not printable characters */
    private static final C0752[] f5064 = null;

    /* renamed from: ıǃ  reason: contains not printable characters */
    private final int f5091;

    /* renamed from: ǃı  reason: contains not printable characters */
    private final C0811 f5092;

    /* renamed from: ɂ  reason: contains not printable characters */
    private final Class<?> f5093;

    /* renamed from: Ɉ  reason: contains not printable characters */
    private final C1104 f5094;

    /* renamed from: ɉ  reason: contains not printable characters */
    private final boolean f5095;

    private C0752(int i, C0811 r5, C1104 r6) {
        int i2;
        this.f5091 = i;
        this.f5092 = r5;
        this.f5094 = r6;
        int i3 = C0843.f5537[r5.ordinal()];
        if (i3 == 1) {
            this.f5093 = r6.m7495();
        } else if (i3 != 2) {
            this.f5093 = null;
        } else {
            this.f5093 = r6.m7495();
        }
        boolean z = false;
        if (!(r5 != C0811.SCALAR || (i2 = C0843.f5536[r6.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
            z = true;
        }
        this.f5095 = z;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m6002() {
        return this.f5091;
    }

    static {
        int i;
        f5062 = new Type[0];
        C0752[] values = values();
        f5064 = new C0752[values.length];
        for (C0752 r3 : values) {
            f5064[r3.f5091] = r3;
        }
    }
}
