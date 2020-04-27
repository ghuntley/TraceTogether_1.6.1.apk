package o;

final class jV {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static long f2458;

    /* renamed from: ι  reason: contains not printable characters */
    private static jS f2459;

    private jV() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static jS m3017() {
        synchronized (jV.class) {
            if (f2459 == null) {
                return new jS();
            }
            jS jSVar = f2459;
            f2459 = jSVar.f2450;
            jSVar.f2450 = null;
            f2458 -= 8192;
            return jSVar;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static void m3018(jS jSVar) {
        if (jSVar.f2450 != null || jSVar.f2451 != null) {
            throw new IllegalArgumentException();
        } else if (!jSVar.f2445) {
            synchronized (jV.class) {
                if (f2458 + 8192 <= 65536) {
                    f2458 += 8192;
                    jSVar.f2450 = f2459;
                    jSVar.f2447 = 0;
                    jSVar.f2449 = 0;
                    f2459 = jSVar;
                }
            }
        }
    }
}
