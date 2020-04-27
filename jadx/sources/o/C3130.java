package o;

import o.C0425;

/* renamed from: o.ծ  reason: contains not printable characters */
final class C3130 extends C0425 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0944 f14281;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0425.C0426 f14282;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f14283;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f14284;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f14285;

    /* synthetic */ C3130(String str, String str2, String str3, C0944 r4, C0425.C0426 r5, byte b) {
        this(str, str2, str3, r4, r5);
    }

    private C3130(String str, String str2, String str3, C0944 r4, C0425.C0426 r5) {
        this.f14283 = str;
        this.f14285 = str2;
        this.f14284 = str3;
        this.f14281 = r4;
        this.f14282 = r5;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m15866() {
        return this.f14283;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m15868() {
        return this.f14285;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m15864() {
        return this.f14284;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0944 m15867() {
        return this.f14281;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0425.C0426 m15865() {
        return this.f14282;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f14283);
        sb.append(", fid=");
        sb.append(this.f14285);
        sb.append(", refreshToken=");
        sb.append(this.f14284);
        sb.append(", authToken=");
        sb.append(this.f14281);
        sb.append(", responseCode=");
        sb.append(this.f14282);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0425) {
            C0425 r5 = (C0425) obj;
            String str = this.f14283;
            if (str != null ? str.equals(r5.m4717()) : r5.m4717() == null) {
                String str2 = this.f14285;
                if (str2 != null ? str2.equals(r5.m4719()) : r5.m4719() == null) {
                    String str3 = this.f14284;
                    if (str3 != null ? str3.equals(r5.m4715()) : r5.m4715() == null) {
                        C0944 r1 = this.f14281;
                        if (r1 != null ? r1.equals(r5.m4718()) : r5.m4718() == null) {
                            C0425.C0426 r12 = this.f14282;
                            return r12 != null ? r12.equals(r5.m4716()) : r5.m4716() == null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.f14283;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f14285;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f14284;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C0944 r3 = this.f14281;
        int hashCode4 = (hashCode3 ^ (r3 == null ? 0 : r3.hashCode())) * 1000003;
        C0425.C0426 r2 = this.f14282;
        if (r2 != null) {
            i = r2.hashCode();
        }
        return hashCode4 ^ i;
    }

    /* renamed from: o.ծ$ǃ  reason: contains not printable characters */
    static final class C3131 extends C0425.Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private String f14286;

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f14287;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C0944 f14288;

        /* renamed from: Ι  reason: contains not printable characters */
        private C0425.C0426 f14289;

        /* renamed from: ι  reason: contains not printable characters */
        private String f14290;

        C3131() {
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C0425.Cif m15869(String str) {
            this.f14290 = str;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0425.Cif m15870(String str) {
            this.f14287 = str;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0425.Cif m15872(String str) {
            this.f14286 = str;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0425.Cif m15873(C0944 r1) {
            this.f14288 = r1;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0425.Cif m15871(C0425.C0426 r1) {
            this.f14289 = r1;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0425 m15874() {
            return new C3130(this.f14290, this.f14287, this.f14286, this.f14288, this.f14289, (byte) 0);
        }
    }
}
