package o;

import java.util.Set;
import o.C2572;

/* renamed from: o.хΙ  reason: contains not printable characters */
final class C2492 extends C2572.If {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Set<C2572.Cif> f11287;

    /* renamed from: Ι  reason: contains not printable characters */
    private final long f11288;

    /* renamed from: ι  reason: contains not printable characters */
    private final long f11289;

    /* synthetic */ C2492(long j, long j2, Set set, byte b) {
        this(j, j2, set);
    }

    private C2492(long j, long j2, Set<C2572.Cif> set) {
        this.f11288 = j;
        this.f11289 = j2;
        this.f11287 = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final long m13229() {
        return this.f11288;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final long m13230() {
        return this.f11289;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final Set<C2572.Cif> m13231() {
        return this.f11287;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigValue{delta=");
        sb.append(this.f11288);
        sb.append(", maxAllowedDelay=");
        sb.append(this.f11289);
        sb.append(", flags=");
        sb.append(this.f11287);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2572.If) {
            C2572.If ifR = (C2572.If) obj;
            return this.f11288 == ifR.m13684() && this.f11289 == ifR.m13685() && this.f11287.equals(ifR.m13686());
        }
    }

    public final int hashCode() {
        long j = this.f11288;
        long j2 = this.f11289;
        return this.f11287.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    /* renamed from: o.хΙ$If */
    public static final class If extends C2572.If.C2573 {

        /* renamed from: ı  reason: contains not printable characters */
        private Long f11290;

        /* renamed from: ɩ  reason: contains not printable characters */
        public Set<C2572.Cif> f11291;

        /* renamed from: Ι  reason: contains not printable characters */
        private Long f11292;

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2572.If.C2573 m13235(long j) {
            this.f11290 = Long.valueOf(j);
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2572.If.C2573 m13234() {
            this.f11292 = 86400000L;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2572.If.C2573 m13232(Set<C2572.Cif> set) {
            if (set != null) {
                this.f11291 = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2572.If m13233() {
            String str = "";
            if (this.f11290 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" delta");
                str = sb.toString();
            }
            if (this.f11292 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" maxAllowedDelay");
                str = sb2.toString();
            }
            if (this.f11291 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" flags");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new C2492(this.f11290.longValue(), this.f11292.longValue(), this.f11291, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
