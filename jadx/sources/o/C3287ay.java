package o;

/* renamed from: o.ay  reason: case insensitive filesystem */
public enum C3287ay {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int f1575;

    private C3287ay(int i) {
        this.f1575 = i;
    }

    public final String toString() {
        return Integer.toString(this.f1575);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C3287ay m1698(String str) {
        if ("io.crash.air".equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }
}
