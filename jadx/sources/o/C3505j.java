package o;

/* renamed from: o.j  reason: case insensitive filesystem */
public enum C3505j {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: ı  reason: contains not printable characters */
    final int f2392;

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m2819(int i) {
        return (i & NO_CACHE.f2392) == 0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m2817(int i) {
        return (i & NO_STORE.f2392) == 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m2818(int i) {
        return (i & OFFLINE.f2392) != 0;
    }

    private C3505j(int i) {
        this.f2392 = i;
    }
}
