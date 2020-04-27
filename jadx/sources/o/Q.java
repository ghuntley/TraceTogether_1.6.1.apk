package o;

public final class Q<T> implements M<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final T f1280;

    /* renamed from: Ι  reason: contains not printable characters */
    public static <T> M<T> m1412(T t) {
        if (t != null) {
            return new Q(t);
        }
        throw new NullPointerException("instance cannot be null");
    }

    static {
        new Q((Object) null);
    }

    private Q(T t) {
        this.f1280 = t;
    }

    public final T get() {
        return this.f1280;
    }
}
