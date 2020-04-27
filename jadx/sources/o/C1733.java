package o;

/* renamed from: o.ͷ  reason: contains not printable characters */
public final class C1733 {

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f8957;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1733 m9755(String str) {
        return new C1733(str);
    }

    public C1733(String str) {
        if (str != null) {
            this.f8957 = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1733)) {
            return false;
        }
        return this.f8957.equals(((C1733) obj).f8957);
    }

    public final int hashCode() {
        return this.f8957.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Encoding{name=\"");
        sb.append(this.f8957);
        sb.append("\"}");
        return sb.toString();
    }
}
