package o;

/* renamed from: o.ɓ  reason: contains not printable characters */
public enum C1104 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C0510.class, C0510.class, C0510.f4250),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: ȷ  reason: contains not printable characters */
    private final Object f6561;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final Class<?> f6562;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final Class<?> f6563;

    private C1104(Class<?> cls, Class<?> cls2, Object obj) {
        this.f6563 = cls;
        this.f6562 = cls2;
        this.f6561 = obj;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Class<?> m7495() {
        return this.f6562;
    }
}
