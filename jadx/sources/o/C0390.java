package o;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: o.ıκ  reason: contains not printable characters */
final class C0390<T> implements C0388<T>, Serializable {

    /* renamed from: Ι  reason: contains not printable characters */
    private final T f3950;

    C0390(T t) {
        this.f3950 = t;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final T m4651() {
        return this.f3950;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0390)) {
            return false;
        }
        T t = this.f3950;
        T t2 = ((C0390) obj).f3950;
        if (t == t2) {
            return true;
        }
        if (t == null || !t.equals(t2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3950});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3950);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
