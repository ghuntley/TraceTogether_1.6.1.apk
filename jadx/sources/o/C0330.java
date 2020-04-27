package o;

/* renamed from: o.ıɛ  reason: contains not printable characters */
final class C0330<T> extends C0357<T> {

    /* renamed from: Ι  reason: contains not printable characters */
    private final T f3683;

    C0330(T t) {
        this.f3683 = t;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m4423() {
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final T m4422() {
        return this.f3683;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0330) {
            return this.f3683.equals(((C0330) obj).f3683);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3683.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3683);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
