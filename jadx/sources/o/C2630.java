package o;

/* renamed from: o.јӀ  reason: contains not printable characters */
public final class C2630 {

    /* renamed from: ı  reason: contains not printable characters */
    final C2291 f11970;

    /* renamed from: ɩ  reason: contains not printable characters */
    final long f11971;

    /* renamed from: ι  reason: contains not printable characters */
    public final C2201 f11972;

    public C2630() {
    }

    public C2630(long j, C2291 r3, C2201 r4) {
        this();
        this.f11971 = j;
        if (r3 != null) {
            this.f11970 = r3;
            if (r4 != null) {
                this.f11972 = r4;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedEvent{id=");
        sb.append(this.f11971);
        sb.append(", transportContext=");
        sb.append(this.f11970);
        sb.append(", event=");
        sb.append(this.f11972);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2630) {
            C2630 r8 = (C2630) obj;
            return this.f11971 == r8.f11971 && this.f11970.equals(r8.f11970) && this.f11972.equals(r8.f11972);
        }
    }

    public final int hashCode() {
        long j = this.f11971;
        return this.f11972.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11970.hashCode()) * 1000003);
    }
}
