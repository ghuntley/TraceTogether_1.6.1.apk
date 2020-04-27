package o;

import o.C0399;
import o.C3100;

/* renamed from: o.ԼӀ  reason: contains not printable characters */
final class C3036 extends C0399 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f13933;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f13934;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f13935;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final String f13936;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3100.If f13937;

    /* renamed from: ι  reason: contains not printable characters */
    private final long f13938;

    /* renamed from: І  reason: contains not printable characters */
    private final long f13939;

    /* synthetic */ C3036(String str, C3100.If ifR, String str2, String str3, long j, long j2, String str4, byte b) {
        this(str, ifR, str2, str3, j, j2, str4);
    }

    private C3036(String str, C3100.If ifR, String str2, String str3, long j, long j2, String str4) {
        this.f13935 = str;
        this.f13937 = ifR;
        this.f13933 = str2;
        this.f13934 = str3;
        this.f13938 = j;
        this.f13939 = j2;
        this.f13936 = str4;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m15502() {
        return this.f13935;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3100.If m15503() {
        return this.f13937;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m15504() {
        return this.f13933;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m15507() {
        return this.f13934;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m15506() {
        return this.f13938;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final long m15509() {
        return this.f13939;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m15505() {
        return this.f13936;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f13935);
        sb.append(", registrationStatus=");
        sb.append(this.f13937);
        sb.append(", authToken=");
        sb.append(this.f13933);
        sb.append(", refreshToken=");
        sb.append(this.f13934);
        sb.append(", expiresInSecs=");
        sb.append(this.f13938);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f13939);
        sb.append(", fisError=");
        sb.append(this.f13936);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r7.f13933;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r7.f13934;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        r1 = r7.f13936;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof o.C0399
            r2 = 0
            if (r1 == 0) goto L_0x0080
            o.ıϫ r8 = (o.C0399) r8
            java.lang.String r1 = r7.f13935
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r8.m4666()
            if (r1 != 0) goto L_0x0080
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r8.m4666()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0080
        L_0x0020:
            o.լȷ$If r1 = r7.f13937
            o.լȷ$If r3 = r8.m4667()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = r7.f13933
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r8.m4668()
            if (r1 != 0) goto L_0x0080
            goto L_0x0041
        L_0x0037:
            java.lang.String r3 = r8.m4668()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0080
        L_0x0041:
            java.lang.String r1 = r7.f13934
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = r8.m4671()
            if (r1 != 0) goto L_0x0080
            goto L_0x0056
        L_0x004c:
            java.lang.String r3 = r8.m4671()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0080
        L_0x0056:
            long r3 = r7.f13938
            long r5 = r8.m4670()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0080
            long r3 = r7.f13939
            long r5 = r8.m4673()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0080
            java.lang.String r1 = r7.f13936
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = r8.m4669()
            if (r8 != 0) goto L_0x0080
            goto L_0x007f
        L_0x0075:
            java.lang.String r8 = r8.m4669()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0080
        L_0x007f:
            return r0
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3036.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f13935;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f13937.hashCode()) * 1000003;
        String str2 = this.f13933;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f13934;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f13938;
        long j2 = this.f13939;
        int i2 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f13936;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final C0399.If m15508() {
        return new Cif(this, (byte) 0);
    }

    /* renamed from: o.ԼӀ$if  reason: invalid class name */
    static final class Cif extends C0399.If {

        /* renamed from: ı  reason: contains not printable characters */
        Long f13940;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private Long f13941;

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f13942;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C3100.If f13943;

        /* renamed from: Ι  reason: contains not printable characters */
        private String f13944;

        /* renamed from: ι  reason: contains not printable characters */
        private String f13945;

        /* renamed from: і  reason: contains not printable characters */
        private String f13946;

        /* synthetic */ Cif(C0399 r1, byte b) {
            this(r1);
        }

        Cif() {
        }

        private Cif(C0399 r3) {
            this.f13945 = r3.m4666();
            this.f13943 = r3.m4667();
            this.f13942 = r3.m4668();
            this.f13944 = r3.m4671();
            this.f13941 = Long.valueOf(r3.m4670());
            this.f13940 = Long.valueOf(r3.m4673());
            this.f13946 = r3.m4669();
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C0399.If m15511(String str) {
            this.f13945 = str;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C0399.If m15512(C3100.If ifR) {
            if (ifR != null) {
                this.f13943 = ifR;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C0399.If m15514(String str) {
            this.f13942 = str;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C0399.If m15516(String str) {
            this.f13944 = str;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C0399.If m15510(long j) {
            this.f13941 = Long.valueOf(j);
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0399.If m15515(long j) {
            this.f13940 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C0399.If m15513(String str) {
            this.f13946 = str;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C0399 m15517() {
            String str = "";
            if (this.f13943 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" registrationStatus");
                str = sb.toString();
            }
            if (this.f13941 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" expiresInSecs");
                str = sb2.toString();
            }
            if (this.f13940 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" tokenCreationEpochInSecs");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new C3036(this.f13945, this.f13943, this.f13942, this.f13944, this.f13941.longValue(), this.f13940.longValue(), this.f13946, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
