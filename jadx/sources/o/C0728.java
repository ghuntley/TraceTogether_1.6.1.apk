package o;

/* renamed from: o.ƚǀ  reason: contains not printable characters */
final class C0728 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C0740<?> f4955 = new C0748();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C0740<?> f4956 = m5862();

    /* renamed from: ı  reason: contains not printable characters */
    private static C0740<?> m5862() {
        try {
            return (C0740) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static C0740<?> m5864() {
        return f4955;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C0740<?> m5863() {
        C0740<?> r0 = f4956;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
