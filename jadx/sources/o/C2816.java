package o;

import o.C2942;

/* renamed from: o.ӀΣ  reason: contains not printable characters */
final class C2816 extends C2942 {

    /* renamed from: ı  reason: contains not printable characters */
    private final long f13230;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f13231;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final long f13232;

    /* synthetic */ C2816(String str, long j, long j2, byte b) {
        this(str, j, j2);
    }

    private C2816(String str, long j, long j2) {
        this.f13231 = str;
        this.f13230 = j;
        this.f13232 = j2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m14737() {
        return this.f13231;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m14736() {
        return this.f13230;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m14735() {
        return this.f13232;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f13231);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f13230);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.f13232);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2942) {
            C2942 r8 = (C2942) obj;
            return this.f13231.equals(r8.m15197()) && this.f13230 == r8.m15196() && this.f13232 == r8.m15195();
        }
    }

    public final int hashCode() {
        long j = this.f13230;
        long j2 = this.f13232;
        return ((((this.f13231.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    /* renamed from: o.ӀΣ$if  reason: invalid class name */
    static final class Cif extends C2942.Cif {

        /* renamed from: ǃ  reason: contains not printable characters */
        private String f13233;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Long f13234;

        /* renamed from: ι  reason: contains not printable characters */
        private Long f13235;

        Cif() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2942.Cif m14740(String str) {
            if (str != null) {
                this.f13233 = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C2942.Cif m14741(long j) {
            this.f13234 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2942.Cif m14738(long j) {
            this.f13235 = Long.valueOf(j);
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2942 m14739() {
            String str = "";
            if (this.f13233 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" token");
                str = sb.toString();
            }
            if (this.f13234 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" tokenExpirationTimestamp");
                str = sb2.toString();
            }
            if (this.f13235 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" tokenCreationTimestamp");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new C2816(this.f13233, this.f13234.longValue(), this.f13235.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
