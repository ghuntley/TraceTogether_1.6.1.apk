package o;

/* renamed from: o.ɽΙ  reason: contains not printable characters */
final class C1525 implements C1639 {

    /* renamed from: ι  reason: contains not printable characters */
    private C1639[] f8132;

    C1525(C1639... r1) {
        this.f8132 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m8978(Class<?> cls) {
        for (C1639 r4 : this.f8132) {
            if (r4.m9440(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1640 m8979(Class<?> cls) {
        for (C1639 r3 : this.f8132) {
            if (r3.m9440(cls)) {
                return r3.m9441(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
