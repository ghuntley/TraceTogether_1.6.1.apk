package o;

import java.util.Arrays;

/* renamed from: o.ϳӀ  reason: contains not printable characters */
public final class C2196 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public final byte[] f10436;

    /* renamed from: ι  reason: contains not printable characters */
    public final C1733 f10437;

    public C2196(C1733 r1, byte[] bArr) {
        if (r1 == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f10437 = r1;
            this.f10436 = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2196)) {
            return false;
        }
        C2196 r4 = (C2196) obj;
        if (!this.f10437.equals(r4.f10437)) {
            return false;
        }
        return Arrays.equals(this.f10436, r4.f10436);
    }

    public final int hashCode() {
        return ((this.f10437.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10436);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EncodedPayload{encoding=");
        sb.append(this.f10437);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
