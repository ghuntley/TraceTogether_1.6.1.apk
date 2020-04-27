package o;

/* renamed from: o.ŀј  reason: contains not printable characters */
final class C0517 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Class<?> f4281 = m4977("libcore.io.Memory");

    /* renamed from: Ι  reason: contains not printable characters */
    private static final boolean f4282 = (m4977("org.robolectric.Robolectric") != null);

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m4978() {
        return f4281 != null && !f4282;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static Class<?> m4979() {
        return f4281;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static <T> Class<T> m4977(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
