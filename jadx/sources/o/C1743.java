package o;

/* renamed from: o.ͻІ  reason: contains not printable characters */
public final class C1743<T> extends C1744<T> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final T f9041;

    /* renamed from: ι  reason: contains not printable characters */
    private final C1766 f9042;

    public C1743(T t, C1766 r2) {
        if (t != null) {
            this.f9041 = t;
            if (r2 != null) {
                this.f9042 = r2;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final T m9811() {
        return this.f9041;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1766 m9810() {
        return this.f9042;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{code=");
        sb.append((Object) null);
        sb.append(", payload=");
        sb.append(this.f9041);
        sb.append(", priority=");
        sb.append(this.f9042);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1744) {
            C1744 r5 = (C1744) obj;
            return this.f9041.equals(r5.m9813()) && this.f9042.equals(r5.m9812());
        }
    }

    public final int hashCode() {
        return ((this.f9041.hashCode() ^ -721379959) * 1000003) ^ this.f9042.hashCode();
    }
}
