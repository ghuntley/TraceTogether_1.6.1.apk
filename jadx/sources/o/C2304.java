package o;

import java.util.Arrays;
import o.C2333;

/* renamed from: o.Іх  reason: contains not printable characters */
final class C2304 extends C2333 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Iterable<C2201> f10705;

    /* renamed from: ι  reason: contains not printable characters */
    private final byte[] f10706;

    /* synthetic */ C2304(Iterable iterable, byte[] bArr, byte b) {
        this(iterable, bArr);
    }

    private C2304(Iterable<C2201> iterable, byte[] bArr) {
        this.f10705 = iterable;
        this.f10706 = bArr;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Iterable<C2201> m11992() {
        return this.f10705;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final byte[] m11993() {
        return this.f10706;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendRequest{events=");
        sb.append(this.f10705);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.f10706));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2333) {
            C2333 r5 = (C2333) obj;
            if (this.f10705.equals(r5.m12170())) {
                if (Arrays.equals(this.f10706, r5 instanceof C2304 ? ((C2304) r5).f10706 : r5.m12171())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f10705.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10706);
    }

    /* renamed from: o.Іх$If */
    public static final class If extends C2333.C2334 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private byte[] f10707;

        /* renamed from: Ι  reason: contains not printable characters */
        private Iterable<C2201> f10708;

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2333.C2334 m11995(Iterable<C2201> iterable) {
            this.f10708 = iterable;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2333.C2334 m11994(byte[] bArr) {
            this.f10707 = bArr;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2333 m11996() {
            String str = "";
            if (this.f10708 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" events");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new C2304(this.f10708, this.f10707, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
