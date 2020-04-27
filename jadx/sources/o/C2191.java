package o;

import o.C2246;

/* renamed from: o.ϳІ  reason: contains not printable characters */
final class C2191 extends C2246 {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f10419;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1748<?, byte[]> f10420;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1744<?> f10421;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1733 f10422;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2291 f10423;

    /* synthetic */ C2191(C2291 r1, String str, C1744 r3, C1748 r4, C1733 r5, byte b) {
        this(r1, str, r3, r4, r5);
    }

    private C2191(C2291 r1, String str, C1744<?> r3, C1748<?, byte[]> r4, C1733 r5) {
        this.f10423 = r1;
        this.f10419 = str;
        this.f10421 = r3;
        this.f10420 = r4;
        this.f10422 = r5;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2291 m11583() {
        return this.f10423;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m11582() {
        return this.f10419;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C1744<?> m11580() {
        return this.f10421;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final C1748<?, byte[]> m11584() {
        return this.f10420;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1733 m11581() {
        return this.f10422;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendRequest{transportContext=");
        sb.append(this.f10423);
        sb.append(", transportName=");
        sb.append(this.f10419);
        sb.append(", event=");
        sb.append(this.f10421);
        sb.append(", transformer=");
        sb.append(this.f10420);
        sb.append(", encoding=");
        sb.append(this.f10422);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2246) {
            C2246 r5 = (C2246) obj;
            return this.f10423.equals(r5.m11729()) && this.f10419.equals(r5.m11728()) && this.f10421.equals(r5.m11726()) && this.f10420.equals(r5.m11730()) && this.f10422.equals(r5.m11727());
        }
    }

    public final int hashCode() {
        return ((((((((this.f10423.hashCode() ^ 1000003) * 1000003) ^ this.f10419.hashCode()) * 1000003) ^ this.f10421.hashCode()) * 1000003) ^ this.f10420.hashCode()) * 1000003) ^ this.f10422.hashCode();
    }

    /* renamed from: o.ϳІ$ɩ  reason: contains not printable characters */
    static final class C2192 extends C2246.C2247 {

        /* renamed from: ı  reason: contains not printable characters */
        private C2291 f10424;

        /* renamed from: ǃ  reason: contains not printable characters */
        private C1733 f10425;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C1748<?, byte[]> f10426;

        /* renamed from: Ι  reason: contains not printable characters */
        private String f10427;

        /* renamed from: ι  reason: contains not printable characters */
        private C1744<?> f10428;

        C2192() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C2246.C2247 m11589(C2291 r2) {
            if (r2 != null) {
                this.f10424 = r2;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C2246.C2247 m11585(String str) {
            if (str != null) {
                this.f10427 = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ι  reason: contains not printable characters */
        public final C2246.C2247 m11590(C1744<?> r2) {
            if (r2 != null) {
                this.f10428 = r2;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2246.C2247 m11587(C1748<?, byte[]> r2) {
            if (r2 != null) {
                this.f10426 = r2;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Ι  reason: contains not printable characters */
        public final C2246.C2247 m11588(C1733 r2) {
            if (r2 != null) {
                this.f10425 = r2;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C2246 m11586() {
            String str = "";
            if (this.f10424 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" transportContext");
                str = sb.toString();
            }
            if (this.f10427 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" transportName");
                str = sb2.toString();
            }
            if (this.f10428 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" event");
                str = sb3.toString();
            }
            if (this.f10426 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" transformer");
                str = sb4.toString();
            }
            if (this.f10425 == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" encoding");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new C2191(this.f10424, this.f10427, this.f10428, this.f10426, this.f10425, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }
}
