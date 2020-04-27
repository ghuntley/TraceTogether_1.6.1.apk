package o;

import o.C2599;

/* renamed from: o.іј  reason: contains not printable characters */
final class C2605 extends C2599 {

    /* renamed from: ı  reason: contains not printable characters */
    private final long f11858;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final long f11859;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f11860;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f11861;

    /* synthetic */ C2605(long j, int i, int i2, long j2, byte b) {
        this(j, i, i2, j2);
    }

    private C2605(long j, int i, int i2, long j2) {
        this.f11859 = j;
        this.f11861 = i;
        this.f11860 = i2;
        this.f11858 = j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final long m13823() {
        return this.f11859;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m13824() {
        return this.f11861;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m13825() {
        return this.f11860;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final long m13826() {
        return this.f11858;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f11859);
        sb.append(", loadBatchSize=");
        sb.append(this.f11861);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f11860);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f11858);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2599) {
            C2599 r8 = (C2599) obj;
            return this.f11859 == r8.m13776() && this.f11861 == r8.m13777() && this.f11860 == r8.m13778() && this.f11858 == r8.m13779();
        }
    }

    public final int hashCode() {
        long j = this.f11859;
        long j2 = this.f11858;
        return ((int) ((j2 >>> 32) ^ j2)) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f11861) * 1000003) ^ this.f11860) * 1000003);
    }

    /* renamed from: o.іј$if  reason: invalid class name */
    static final class Cif extends C2599.C2600 {

        /* renamed from: ı  reason: contains not printable characters */
        private Long f11862;

        /* renamed from: ǃ  reason: contains not printable characters */
        private Long f11863;

        /* renamed from: ɩ  reason: contains not printable characters */
        private Integer f11864;

        /* renamed from: Ι  reason: contains not printable characters */
        private Integer f11865;

        Cif() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2599.C2600 m13829() {
            this.f11862 = 10485760L;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final C2599.C2600 m13831() {
            this.f11865 = 200;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ı  reason: contains not printable characters */
        public final C2599.C2600 m13827() {
            this.f11864 = Integer.valueOf(C3273am.f1527);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final C2599.C2600 m13830() {
            this.f11863 = 604800000L;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2599 m13828() {
            String str = "";
            if (this.f11862 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" maxStorageSizeInBytes");
                str = sb.toString();
            }
            if (this.f11865 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loadBatchSize");
                str = sb2.toString();
            }
            if (this.f11864 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" criticalSectionEnterTimeoutMs");
                str = sb3.toString();
            }
            if (this.f11863 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" eventCleanUpAge");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new C2605(this.f11862.longValue(), this.f11865.intValue(), this.f11864.intValue(), this.f11863.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
