package o;

import o.C2314;

/* renamed from: o.ІЈ  reason: contains not printable characters */
public final class C2296 extends C2314 {

    /* renamed from: ı  reason: contains not printable characters */
    private final long f10694;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2314.If f10695;

    public C2296(C2314.If ifR, long j) {
        if (ifR != null) {
            this.f10695 = ifR;
            this.f10694 = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2314.If m11969() {
        return this.f10695;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final long m11968() {
        return this.f10694;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(this.f10695);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f10694);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2314) {
            C2314 r8 = (C2314) obj;
            return this.f10695.equals(r8.m12064()) && this.f10694 == r8.m12063();
        }
    }

    public final int hashCode() {
        long j = this.f10694;
        return ((this.f10695.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }
}
