package o;

import java.util.Arrays;
import o.C3024;
import o.C3024.Cif;

/* renamed from: o.ĸǃ  reason: contains not printable characters */
public final class C0475<O extends C3024.Cif> {

    /* renamed from: ı  reason: contains not printable characters */
    private final O f4101;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean f4102 = false;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3024<O> f4103;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f4104;

    private C0475(C3024<O> r2, O o2) {
        this.f4103 = r2;
        this.f4101 = o2;
        this.f4104 = Arrays.hashCode(new Object[]{this.f4103, this.f4101});
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <O extends C3024.Cif> C0475<O> m4807(C3024<O> r1, O o2) {
        return new C0475<>(r1, o2);
    }

    public final int hashCode() {
        return this.f4104;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0475)) {
            return false;
        }
        C0475 r5 = (C0475) obj;
        if (!this.f4102 && !r5.f4102) {
            C3024<O> r1 = this.f4103;
            C3024<O> r3 = r5.f4103;
            if (r1 == r3 || (r1 != null && r1.equals(r3))) {
                O o2 = this.f4101;
                O o3 = r5.f4101;
                if (o2 == o3 || (o2 != null && o2.equals(o3))) {
                    return true;
                }
            }
        }
        return false;
    }
}
