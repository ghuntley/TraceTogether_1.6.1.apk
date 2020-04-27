package o;

/* renamed from: o.l  reason: case insensitive filesystem */
public enum C3560l {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f2727;

    /* renamed from: ǃ  reason: contains not printable characters */
    static boolean m3362(int i) {
        return (i & NO_CACHE.f2727) == 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m3363(int i) {
        return (i & NO_STORE.f2727) == 0;
    }

    private C3560l(int i) {
        this.f2727 = i;
    }
}
