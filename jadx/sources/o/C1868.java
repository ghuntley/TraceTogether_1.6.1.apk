package o;

import java.util.Arrays;
import o.C1914;

/* renamed from: o.ΙЈ  reason: contains not printable characters */
public final class C1868 extends C1914 {

    /* renamed from: ı  reason: contains not printable characters */
    final long f9537;

    /* renamed from: ǃ  reason: contains not printable characters */
    final byte[] f9538;

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f9539;

    /* renamed from: Ι  reason: contains not printable characters */
    final int f9540;

    /* renamed from: ι  reason: contains not printable characters */
    final long f9541;

    /* renamed from: І  reason: contains not printable characters */
    final long f9542;

    /* renamed from: і  reason: contains not printable characters */
    final C1943 f9543;

    /* renamed from: o.ΙЈ$ı  reason: contains not printable characters */
    public static final class C1869 extends C1914.Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private byte[] f9544;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private C1943 f9545;

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f9546;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Long f9547;

        /* renamed from: Ι  reason: contains not printable characters */
        private Long f9548;

        /* renamed from: ι  reason: contains not printable characters */
        public Integer f9549;

        /* renamed from: Ӏ  reason: contains not printable characters */
        private Long f9550;

        /* renamed from: ı  reason: contains not printable characters */
        public final C1914.Cif m10248(long j) {
            this.f9550 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1914.Cif m10249(long j) {
            this.f9547 = Long.valueOf(j);
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1914.Cif m10254(long j) {
            this.f9548 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1914.Cif m10252(int i) {
            this.f9549 = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1914.Cif m10251(byte[] bArr) {
            this.f9544 = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1914.Cif m10250(String str) {
            this.f9546 = str;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C1914.Cif m10253(C1943 r1) {
            this.f9545 = r1;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C1914 m10255() {
            String str = "";
            if (this.f9547 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" eventTimeMs");
                str = sb.toString();
            }
            if (this.f9549 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" eventCode");
                str = sb2.toString();
            }
            if (this.f9548 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventUptimeMs");
                str = sb3.toString();
            }
            if (this.f9550 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" timezoneOffsetSeconds");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new C1868(this.f9547.longValue(), this.f9549.intValue(), this.f9548.longValue(), this.f9544, this.f9546, this.f9550.longValue(), this.f9545);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    /* synthetic */ C1868(long j, int i, long j2, byte[] bArr, String str, long j3, C1943 r10) {
        this.f9541 = j;
        this.f9540 = i;
        this.f9537 = j2;
        this.f9538 = bArr;
        this.f9539 = str;
        this.f9542 = j3;
        this.f9543 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r1 = r8.f9539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r9 = r8.f9543;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r9 instanceof o.C1914
            r2 = 0
            if (r1 == 0) goto L_0x005f
            o.Σ r9 = (o.C1914) r9
            long r3 = r8.f9541
            long r5 = r9.m10394()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x005f
            int r1 = r8.f9540
            r3 = r9
            o.ΙЈ r3 = (o.C1868) r3
            int r4 = r3.f9540
            if (r1 != r4) goto L_0x005f
            long r4 = r8.f9537
            long r6 = r9.m10395()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x005f
            byte[] r1 = r8.f9538
            byte[] r4 = r3.f9538
            boolean r1 = java.util.Arrays.equals(r1, r4)
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r8.f9539
            if (r1 != 0) goto L_0x003b
            java.lang.String r1 = r3.f9539
            if (r1 != 0) goto L_0x005f
            goto L_0x0043
        L_0x003b:
            java.lang.String r4 = r3.f9539
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x005f
        L_0x0043:
            long r4 = r8.f9542
            long r6 = r9.m10396()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x005f
            o.η r9 = r8.f9543
            if (r9 != 0) goto L_0x0056
            o.η r9 = r3.f9543
            if (r9 != 0) goto L_0x005f
            goto L_0x005e
        L_0x0056:
            o.η r1 = r3.f9543
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x005f
        L_0x005e:
            return r0
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1868.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.f9541;
        long j2 = this.f9537;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f9540) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f9538)) * 1000003;
        String str = this.f9539;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.f9542;
        int i2 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C1943 r0 = this.f9543;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEvent{eventTimeMs=");
        sb.append(this.f9541);
        sb.append(", eventCode=");
        sb.append(this.f9540);
        sb.append(", eventUptimeMs=");
        sb.append(this.f9537);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.f9538));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.f9539);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.f9542);
        sb.append(", networkConnectionInfo=");
        sb.append(this.f9543);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m10245() {
        return this.f9541;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m10246() {
        return this.f9537;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final long m10247() {
        return this.f9542;
    }
}
