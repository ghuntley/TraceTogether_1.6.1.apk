package o;

import java.util.Arrays;
import o.C2291;

/* renamed from: o.ϲΙ  reason: contains not printable characters */
final class C2174 extends C2291 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f10351;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1766 f10352;

    /* renamed from: Ι  reason: contains not printable characters */
    private final byte[] f10353;

    /* synthetic */ C2174(String str, byte[] bArr, C1766 r3, byte b) {
        this(str, bArr, r3);
    }

    private C2174(String str, byte[] bArr, C1766 r3) {
        this.f10351 = str;
        this.f10353 = bArr;
        this.f10352 = r3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m11532() {
        return this.f10351;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final byte[] m11533() {
        return this.f10353;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1766 m11534() {
        return this.f10352;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2291) {
            C2291 r5 = (C2291) obj;
            if (this.f10351.equals(r5.m11959())) {
                return Arrays.equals(this.f10353, r5 instanceof C2174 ? ((C2174) r5).f10353 : r5.m11960()) && this.f10352.equals(r5.m11961());
            }
        }
    }

    public final int hashCode() {
        return ((((this.f10351.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10353)) * 1000003) ^ this.f10352.hashCode();
    }

    /* renamed from: o.ϲΙ$ı  reason: contains not printable characters */
    public static final class C2175 extends C2291.C2292 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f10354;

        /* renamed from: Ι  reason: contains not printable characters */
        private byte[] f10355;

        /* renamed from: ι  reason: contains not printable characters */
        public C1766 f10356;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2291.C2292 m11536(String str) {
            if (str != null) {
                this.f10354 = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2291.C2292 m11538(byte[] bArr) {
            this.f10355 = bArr;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2291.C2292 m11537(C1766 r2) {
            if (r2 != null) {
                this.f10356 = r2;
                return this;
            }
            throw new NullPointerException("Null priority");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C2291 m11535() {
            String str = "";
            if (this.f10354 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" backendName");
                str = sb.toString();
            }
            if (this.f10356 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" priority");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new C2174(this.f10354, this.f10355, this.f10356, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
