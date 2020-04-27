package o;

import o.C0944;

/* renamed from: o.լӏ  reason: contains not printable characters */
final class C3124 extends C0944 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0944.Cif f14255;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f14256;

    /* renamed from: Ι  reason: contains not printable characters */
    private final long f14257;

    /* synthetic */ C3124(String str, long j, C0944.Cif ifVar, byte b) {
        this(str, j, ifVar);
    }

    private C3124(String str, long j, C0944.Cif ifVar) {
        this.f14256 = str;
        this.f14257 = j;
        this.f14255 = ifVar;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m15851() {
        return this.f14256;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m15849() {
        return this.f14257;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0944.Cif m15850() {
        return this.f14255;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f14256);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f14257);
        sb.append(", responseCode=");
        sb.append(this.f14255);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r1 = r7.f14255;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof o.C0944
            r2 = 0
            if (r1 == 0) goto L_0x0040
            o.Ȣ r8 = (o.C0944) r8
            java.lang.String r1 = r7.f14256
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r8.m6835()
            if (r1 != 0) goto L_0x0040
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r8.m6835()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0040
        L_0x0020:
            long r3 = r7.f14257
            long r5 = r8.m6833()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0040
            o.Ȣ$if r1 = r7.f14255
            if (r1 != 0) goto L_0x0035
            o.Ȣ$if r8 = r8.m6834()
            if (r8 != 0) goto L_0x0040
            goto L_0x003f
        L_0x0035:
            o.Ȣ$if r8 = r8.m6834()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0040
        L_0x003f:
            return r0
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3124.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f14256;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f14257;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C0944.Cif ifVar = this.f14255;
        if (ifVar != null) {
            i = ifVar.hashCode();
        }
        return i2 ^ i;
    }

    /* renamed from: o.լӏ$ı  reason: contains not printable characters */
    static final class C3125 extends C0944.C0945 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private String f14258;

        /* renamed from: Ι  reason: contains not printable characters */
        private C0944.Cif f14259;

        /* renamed from: ι  reason: contains not printable characters */
        Long f14260;

        C3125() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0944.C0945 m15854(String str) {
            this.f14258 = str;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0944.C0945 m15853(long j) {
            this.f14260 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C0944.C0945 m15852(C0944.Cif ifVar) {
            this.f14259 = ifVar;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C0944 m15855() {
            String str = "";
            if (this.f14260 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" tokenExpirationTimestamp");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new C3124(this.f14258, this.f14260.longValue(), this.f14259, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
