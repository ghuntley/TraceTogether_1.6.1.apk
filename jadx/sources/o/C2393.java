package o;

/* renamed from: o.аІ  reason: contains not printable characters */
public final class C2393 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Class<?> f10944;

    /* renamed from: ɩ  reason: contains not printable characters */
    final int f10945;

    /* renamed from: Ι  reason: contains not printable characters */
    final int f10946;

    public C2393(Class<?> cls, int i, int i2) {
        this.f10944 = cls;
        this.f10946 = i;
        this.f10945 = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2393) {
            C2393 r4 = (C2393) obj;
            if (this.f10944 == r4.f10944 && this.f10946 == r4.f10946 && this.f10945 == r4.f10945) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10944.hashCode() ^ 1000003) * 1000003) ^ this.f10946) * 1000003) ^ this.f10945;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f10944);
        sb.append(", type=");
        int i = this.f10946;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.f10945 != 0) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
