package o;

/* renamed from: o.օı  reason: contains not printable characters */
final class C3219<T> extends C0357<T> {

    /* renamed from: Ι  reason: contains not printable characters */
    static final C3219<Object> f14583 = new C3219<>();

    private C3219() {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m16167() {
        return false;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final T m16166() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
