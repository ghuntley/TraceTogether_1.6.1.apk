package o;

/* renamed from: o.ɩϲ  reason: contains not printable characters */
public final class C1291<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    public T f7245;

    /* renamed from: ɩ  reason: contains not printable characters */
    public T f7246;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2311)) {
            return false;
        }
        C2311 r5 = (C2311) obj;
        F f = r5.f10733;
        T t = this.f7245;
        if (f == t || (f != null && f.equals(t))) {
            S s = r5.f10734;
            T t2 = this.f7246;
            if (s == t2 || (s != null && s.equals(t2))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.f7245;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f7246;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f7245));
        sb.append(" ");
        sb.append(String.valueOf(this.f7246));
        sb.append("}");
        return sb.toString();
    }
}
