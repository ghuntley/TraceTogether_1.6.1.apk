package o;

/* renamed from: o.Іі  reason: contains not printable characters */
public class C2311<F, S> {

    /* renamed from: ı  reason: contains not printable characters */
    public final F f10733;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final S f10734;

    public C2311(F f, S s) {
        this.f10733 = f;
        this.f10734 = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2311)) {
            return false;
        }
        C2311 r4 = (C2311) obj;
        if (!C2408.m12453(r4.f10733, this.f10733) || !C2408.m12453(r4.f10734, this.f10734)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f10733;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f10734;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.f10733));
        sb.append(" ");
        sb.append(String.valueOf(this.f10734));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <A, B> C2311<A, B> m12057(A a, B b) {
        return new C2311<>(a, b);
    }
}
