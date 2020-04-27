package o;

import java.util.List;
import o.C2033;

/* renamed from: o.Ιс  reason: contains not printable characters */
public final class C1875 extends C2033 {

    /* renamed from: ı  reason: contains not printable characters */
    final long f9552;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C1817 f9553;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C1885 f9554;

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f9555;

    /* renamed from: Ι  reason: contains not printable characters */
    final long f9556;

    /* renamed from: ι  reason: contains not printable characters */
    final int f9557;

    /* renamed from: Ӏ  reason: contains not printable characters */
    final List<C1914> f9558;

    /* renamed from: o.Ιс$ɩ  reason: contains not printable characters */
    public static final class C1876 extends C2033.C2034 {

        /* renamed from: ı  reason: contains not printable characters */
        private Long f9559;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private List<C1914> f9560;

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f9561;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Long f9562;

        /* renamed from: Ι  reason: contains not printable characters */
        public Integer f9563;

        /* renamed from: ι  reason: contains not printable characters */
        private C1885 f9564;

        /* renamed from: І  reason: contains not printable characters */
        private C1817 f9565;

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2033.C2034 m10266(long j) {
            this.f9559 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2033.C2034 m10267(long j) {
            this.f9562 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2033.C2034 m10264(C1885 r1) {
            this.f9564 = r1;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final C2033.C2034 m10265(int i) {
            this.f9563 = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2033.C2034 m10262(String str) {
            this.f9561 = str;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2033.C2034 m10268(List<C1914> list) {
            this.f9560 = list;
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2033.C2034 m10263(C1817 r1) {
            this.f9565 = r1;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2033 m10269() {
            String str = "";
            if (this.f9562 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" requestTimeMs");
                str = sb.toString();
            }
            if (this.f9559 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" requestUptimeMs");
                str = sb2.toString();
            }
            if (this.f9563 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" logSource");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new C1875(this.f9562.longValue(), this.f9559.longValue(), this.f9564, this.f9563.intValue(), this.f9561, this.f9560, this.f9565);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    /* synthetic */ C1875(long j, long j2, C1885 r5, int i, String str, List list, C1817 r9) {
        this.f9556 = j;
        this.f9552 = j2;
        this.f9554 = r5;
        this.f9557 = i;
        this.f9555 = str;
        this.f9558 = list;
        this.f9553 = r9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r1 = r7.f9555;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r1 = r7.f9558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        r1 = r7.f9553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r1 = r7.f9554;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof o.C2033
            r2 = 0
            if (r1 == 0) goto L_0x0068
            o.ιτ r8 = (o.C2033) r8
            long r3 = r7.f9556
            o.Ιс r8 = (o.C1875) r8
            long r5 = r8.f9556
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0068
            long r3 = r7.f9552
            long r5 = r8.f9552
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0068
            o.Ιј r1 = r7.f9554
            if (r1 != 0) goto L_0x0026
            o.Ιј r1 = r8.f9554
            if (r1 != 0) goto L_0x0068
            goto L_0x002e
        L_0x0026:
            o.Ιј r3 = r8.f9554
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
        L_0x002e:
            int r1 = r7.f9557
            int r3 = r8.f9557
            if (r1 != r3) goto L_0x0068
            java.lang.String r1 = r7.f9555
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = r8.f9555
            if (r1 != 0) goto L_0x0068
            goto L_0x0045
        L_0x003d:
            java.lang.String r3 = r8.f9555
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
        L_0x0045:
            java.util.List<o.Σ> r1 = r7.f9558
            if (r1 != 0) goto L_0x004e
            java.util.List<o.Σ> r1 = r8.f9558
            if (r1 != 0) goto L_0x0068
            goto L_0x0056
        L_0x004e:
            java.util.List<o.Σ> r3 = r8.f9558
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0068
        L_0x0056:
            o.Ιɟ r1 = r7.f9553
            if (r1 != 0) goto L_0x005f
            o.Ιɟ r8 = r8.f9553
            if (r8 != 0) goto L_0x0068
            goto L_0x0067
        L_0x005f:
            o.Ιɟ r8 = r8.f9553
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0068
        L_0x0067:
            return r0
        L_0x0068:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1875.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.f9556;
        long j2 = this.f9552;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C1885 r2 = this.f9554;
        int i2 = 0;
        int hashCode = (((i ^ (r2 == null ? 0 : r2.hashCode())) * 1000003) ^ this.f9557) * 1000003;
        String str = this.f9555;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C1914> list = this.f9558;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C1817 r0 = this.f9553;
        if (r0 != null) {
            i2 = r0.hashCode();
        }
        return hashCode3 ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRequest{requestTimeMs=");
        sb.append(this.f9556);
        sb.append(", requestUptimeMs=");
        sb.append(this.f9552);
        sb.append(", clientInfo=");
        sb.append(this.f9554);
        sb.append(", logSource=");
        sb.append(this.f9557);
        sb.append(", logSourceName=");
        sb.append(this.f9555);
        sb.append(", logEvents=");
        sb.append(this.f9558);
        sb.append(", qosTier=");
        sb.append(this.f9553);
        sb.append("}");
        return sb.toString();
    }
}
