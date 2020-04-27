package o;

import java.util.Arrays;
import o.C1345;

/* renamed from: o.ǥ  reason: contains not printable characters */
public final class C0940 {

    /* renamed from: ı  reason: contains not printable characters */
    private String f5920;

    public C0940(String str) {
        this.f5920 = str;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5920});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0940)) {
            return false;
        }
        String str = this.f5920;
        String str2 = ((C0940) obj).f5920;
        if (str == str2) {
            return true;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return new C1345.C1346(this, (byte) 0).m8437("token", this.f5920).toString();
    }
}
