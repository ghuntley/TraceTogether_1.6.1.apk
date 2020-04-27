package o;

import o.C1829;

/* renamed from: o.Ιͻ  reason: contains not printable characters */
public final class C1845 extends C1829 {

    /* renamed from: ı  reason: contains not printable characters */
    final String f9451;

    /* renamed from: ǃ  reason: contains not printable characters */
    final int f9452;

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f9453;

    /* renamed from: ɹ  reason: contains not printable characters */
    final String f9454;

    /* renamed from: Ι  reason: contains not printable characters */
    final String f9455;

    /* renamed from: ι  reason: contains not printable characters */
    final String f9456;

    /* renamed from: і  reason: contains not printable characters */
    final String f9457;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final String f9458;

    /* renamed from: o.Ιͻ$ǃ  reason: contains not printable characters */
    public static final class C1846 extends C1829.Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private String f9459;

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f9460;

        /* renamed from: ɩ  reason: contains not printable characters */
        private String f9461;

        /* renamed from: ɹ  reason: contains not printable characters */
        private String f9462;

        /* renamed from: Ι  reason: contains not printable characters */
        public Integer f9463;

        /* renamed from: ι  reason: contains not printable characters */
        private String f9464;

        /* renamed from: І  reason: contains not printable characters */
        private String f9465;

        /* renamed from: і  reason: contains not printable characters */
        private String f9466;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1829.Cif m10198(String str) {
            this.f9465 = str;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1829.Cif m10199(String str) {
            this.f9460 = str;
            return this;
        }

        /* renamed from: ɹ  reason: contains not printable characters */
        public final C1829.Cif m10200(String str) {
            this.f9462 = str;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1829.Cif m10201(String str) {
            this.f9461 = str;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C1829.Cif m10202(int i) {
            this.f9463 = Integer.valueOf(i);
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C1829.Cif m10203(String str) {
            this.f9459 = str;
            return this;
        }

        /* renamed from: І  reason: contains not printable characters */
        public final C1829.Cif m10205(String str) {
            this.f9466 = str;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C1829.Cif m10197(String str) {
            this.f9464 = str;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C1829 m10204() {
            String str = "";
            if (this.f9463 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" sdkVersion");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new C1845(this.f9463.intValue(), this.f9459, this.f9460, this.f9464, this.f9461, this.f9465, this.f9466, this.f9462);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    /* synthetic */ C1845(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f9452 = i;
        this.f9455 = str;
        this.f9451 = str2;
        this.f9453 = str3;
        this.f9456 = str4;
        this.f9457 = str5;
        this.f9458 = str6;
        this.f9454 = str7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r1 = r4.f9451;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r1 = r4.f9453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r1 = r4.f9456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        r1 = r4.f9457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0068, code lost:
        r1 = r4.f9458;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0079, code lost:
        r1 = r4.f9454;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f9455;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof o.C1829
            r2 = 0
            if (r1 == 0) goto L_0x008b
            o.Ιɺ r5 = (o.C1829) r5
            int r1 = r4.f9452
            o.Ιͻ r5 = (o.C1845) r5
            int r3 = r5.f9452
            if (r1 != r3) goto L_0x008b
            java.lang.String r1 = r4.f9455
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = r5.f9455
            if (r1 != 0) goto L_0x008b
            goto L_0x0024
        L_0x001c:
            java.lang.String r3 = r5.f9455
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008b
        L_0x0024:
            java.lang.String r1 = r4.f9451
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r5.f9451
            if (r1 != 0) goto L_0x008b
            goto L_0x0035
        L_0x002d:
            java.lang.String r3 = r5.f9451
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008b
        L_0x0035:
            java.lang.String r1 = r4.f9453
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = r5.f9453
            if (r1 != 0) goto L_0x008b
            goto L_0x0046
        L_0x003e:
            java.lang.String r3 = r5.f9453
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008b
        L_0x0046:
            java.lang.String r1 = r4.f9456
            if (r1 != 0) goto L_0x004f
            java.lang.String r1 = r5.f9456
            if (r1 != 0) goto L_0x008b
            goto L_0x0057
        L_0x004f:
            java.lang.String r3 = r5.f9456
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008b
        L_0x0057:
            java.lang.String r1 = r4.f9457
            if (r1 != 0) goto L_0x0060
            java.lang.String r1 = r5.f9457
            if (r1 != 0) goto L_0x008b
            goto L_0x0068
        L_0x0060:
            java.lang.String r3 = r5.f9457
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008b
        L_0x0068:
            java.lang.String r1 = r4.f9458
            if (r1 != 0) goto L_0x0071
            java.lang.String r1 = r5.f9458
            if (r1 != 0) goto L_0x008b
            goto L_0x0079
        L_0x0071:
            java.lang.String r3 = r5.f9458
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x008b
        L_0x0079:
            java.lang.String r1 = r4.f9454
            if (r1 != 0) goto L_0x0082
            java.lang.String r5 = r5.f9454
            if (r5 != 0) goto L_0x008b
            goto L_0x008a
        L_0x0082:
            java.lang.String r5 = r5.f9454
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x008b
        L_0x008a:
            return r0
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1845.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = (this.f9452 ^ 1000003) * 1000003;
        String str = this.f9455;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9451;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9453;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f9456;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f9457;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f9458;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f9454;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode6 ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f9452);
        sb.append(", model=");
        sb.append(this.f9455);
        sb.append(", hardware=");
        sb.append(this.f9451);
        sb.append(", device=");
        sb.append(this.f9453);
        sb.append(", product=");
        sb.append(this.f9456);
        sb.append(", osBuild=");
        sb.append(this.f9457);
        sb.append(", manufacturer=");
        sb.append(this.f9458);
        sb.append(", fingerprint=");
        sb.append(this.f9454);
        sb.append("}");
        return sb.toString();
    }
}
