package o;

/* renamed from: o.ιԟ  reason: contains not printable characters */
final class C2084 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Class<?> f10162 = m11074();

    C2084() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Class<?> m11074() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C2269 m11073() {
        Class<?> cls = f10162;
        if (cls != null) {
            try {
                return (C2269) cls.getMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C2269.f10603;
    }
}
