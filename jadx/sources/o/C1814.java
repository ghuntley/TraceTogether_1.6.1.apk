package o;

import java.util.List;

/* renamed from: o.Ιɔ  reason: contains not printable characters */
public final class C1814 extends C1877 {

    /* renamed from: ǃ  reason: contains not printable characters */
    final List<C2033> f9269;

    public C1814(List<C2033> list) {
        this.f9269 = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1877) {
            return this.f9269.equals(((C1877) obj).m10270());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9269.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatchedLogRequest{logRequests=");
        sb.append(this.f9269);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<C2033> m10012() {
        return this.f9269;
    }
}
