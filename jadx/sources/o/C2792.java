package o;

/* renamed from: o.Ӏɫ  reason: contains not printable characters */
public enum C2792 {
    DOUBLE(C2743.DOUBLE, 1),
    FLOAT(C2743.FLOAT, 5),
    INT64(C2743.LONG, 0),
    UINT64(C2743.LONG, 0),
    INT32(C2743.INT, 0),
    FIXED64(C2743.LONG, 1),
    FIXED32(C2743.INT, 5),
    BOOL(C2743.BOOLEAN, 0),
    STRING(C2743.STRING, 2),
    GROUP(C2743.MESSAGE, 3),
    MESSAGE(C2743.MESSAGE, 2),
    BYTES(C2743.BYTE_STRING, 2),
    UINT32(C2743.INT, 0),
    ENUM(C2743.ENUM, 0),
    SFIXED32(C2743.INT, 5),
    SFIXED64(C2743.LONG, 1),
    SINT32(C2743.INT, 0),
    SINT64(C2743.LONG, 0);
    

    /* renamed from: ɿ  reason: contains not printable characters */
    private final int f13210;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final C2743 f13211;

    private C2792(C2743 r3, int i) {
        this.f13211 = r3;
        this.f13210 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2743 m14708() {
        return this.f13211;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m14707() {
        return this.f13210;
    }
}
