package o;

import java.util.Map;
import o.C2201;

/* renamed from: o.ϲӀ  reason: contains not printable characters */
final class C2178 extends C2201 {

    /* renamed from: ı  reason: contains not printable characters */
    private final long f10369;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final long f10370;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f10371;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2196 f10372;

    /* renamed from: ι  reason: contains not printable characters */
    private final Integer f10373;

    /* renamed from: і  reason: contains not printable characters */
    private final Map<String, String> f10374;

    /* synthetic */ C2178(String str, Integer num, C2196 r3, long j, long j2, Map map, byte b) {
        this(str, num, r3, j, j2, map);
    }

    private C2178(String str, Integer num, C2196 r3, long j, long j2, Map<String, String> map) {
        this.f10371 = str;
        this.f10373 = num;
        this.f10372 = r3;
        this.f10369 = j;
        this.f10370 = j2;
        this.f10374 = map;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m11547() {
        return this.f10371;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Integer m11546() {
        return this.f10373;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C2196 m11544() {
        return this.f10372;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m11545() {
        return this.f10369;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final long m11548() {
        return this.f10370;
    }

    /* access modifiers changed from: protected */
    /* renamed from: І  reason: contains not printable characters */
    public final Map<String, String> m11549() {
        return this.f10374;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.f10371);
        sb.append(", code=");
        sb.append(this.f10373);
        sb.append(", encodedPayload=");
        sb.append(this.f10372);
        sb.append(", eventMillis=");
        sb.append(this.f10369);
        sb.append(", uptimeMillis=");
        sb.append(this.f10370);
        sb.append(", autoMetadata=");
        sb.append(this.f10374);
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f10373;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof o.C2201
            r2 = 0
            if (r1 == 0) goto L_0x0059
            o.Ϲ r8 = (o.C2201) r8
            java.lang.String r1 = r7.f10371
            java.lang.String r3 = r8.m11614()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f10373
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.m11612()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.m11612()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            o.ϳӀ r1 = r7.f10372
            o.ϳӀ r3 = r8.m11608()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f10369
            long r5 = r8.m11610()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f10370
            long r5 = r8.m11615()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f10374
            java.util.Map r8 = r8.m11617()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            return r0
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2178.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.f10371.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f10373;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.f10369;
        long j2 = this.f10370;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f10372.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f10374.hashCode();
    }

    /* renamed from: o.ϲӀ$If */
    public static final class If extends C2201.C2202 {

        /* renamed from: ı  reason: contains not printable characters */
        private Integer f10375;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Long f10376;

        /* renamed from: ɩ  reason: contains not printable characters */
        String f10377;

        /* renamed from: Ι  reason: contains not printable characters */
        public Map<String, String> f10378;

        /* renamed from: ι  reason: contains not printable characters */
        private C2196 f10379;

        /* renamed from: І  reason: contains not printable characters */
        private Long f10380;

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2201.C2202 m11556(String str) {
            if (str != null) {
                this.f10377 = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2201.C2202 m11553(Integer num) {
            this.f10375 = num;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2201.C2202 m11554(C2196 r2) {
            if (r2 != null) {
                this.f10379 = r2;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C2201.C2202 m11550(long j) {
            this.f10376 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2201.C2202 m11552(long j) {
            this.f10380 = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: ι  reason: contains not printable characters */
        public final C2201.C2202 m11557(Map<String, String> map) {
            this.f10378 = map;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: Ι  reason: contains not printable characters */
        public final Map<String, String> m11555() {
            Map<String, String> map = this.f10378;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C2201 m11551() {
            String str = "";
            if (this.f10377 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" transportName");
                str = sb.toString();
            }
            if (this.f10379 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" encodedPayload");
                str = sb2.toString();
            }
            if (this.f10376 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventMillis");
                str = sb3.toString();
            }
            if (this.f10380 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" uptimeMillis");
                str = sb4.toString();
            }
            if (this.f10378 == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" autoMetadata");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new C2178(this.f10377, this.f10375, this.f10379, this.f10376.longValue(), this.f10380.longValue(), this.f10378, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
