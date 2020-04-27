package o;

import o.C1885;

/* renamed from: o.Ιϲ  reason: contains not printable characters */
public final class C1859 extends C1885 {

    /* renamed from: ɩ  reason: contains not printable characters */
    final C1885.C1886 f9498;

    /* renamed from: Ι  reason: contains not printable characters */
    final C1829 f9499;

    /* renamed from: o.Ιϲ$ı  reason: contains not printable characters */
    public static final class C1860 extends C1885.Cif {

        /* renamed from: ǃ  reason: contains not printable characters */
        private C1885.C1886 f9500;

        /* renamed from: Ι  reason: contains not printable characters */
        private C1829 f9501;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C1885.Cif m10236(C1885.C1886 r1) {
            this.f9500 = r1;
            return this;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1885.Cif m10237(C1829 r1) {
            this.f9501 = r1;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C1885 m10235() {
            return new C1859(this.f9500, this.f9501);
        }
    }

    /* synthetic */ C1859(C1885.C1886 r1, C1829 r2) {
        this.f9498 = r1;
        this.f9499 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = r4.f9499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r1 = r4.f9498;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof o.C1885
            r2 = 0
            if (r1 == 0) goto L_0x0036
            o.Ιј$ɩ r1 = r4.f9498
            if (r1 != 0) goto L_0x0015
            r1 = r5
            o.Ιϲ r1 = (o.C1859) r1
            o.Ιј$ɩ r1 = r1.f9498
            if (r1 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0015:
            r3 = r5
            o.Ιϲ r3 = (o.C1859) r3
            o.Ιј$ɩ r3 = r3.f9498
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0036
        L_0x0020:
            o.Ιɺ r1 = r4.f9499
            if (r1 != 0) goto L_0x002b
            o.Ιϲ r5 = (o.C1859) r5
            o.Ιɺ r5 = r5.f9499
            if (r5 != 0) goto L_0x0036
            goto L_0x0035
        L_0x002b:
            o.Ιϲ r5 = (o.C1859) r5
            o.Ιɺ r5 = r5.f9499
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0036
        L_0x0035:
            return r0
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1859.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C1885.C1886 r0 = this.f9498;
        int i = 0;
        int hashCode = ((r0 == null ? 0 : r0.hashCode()) ^ 1000003) * 1000003;
        C1829 r2 = this.f9499;
        if (r2 != null) {
            i = r2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientInfo{clientType=");
        sb.append(this.f9498);
        sb.append(", androidClientInfo=");
        sb.append(this.f9499);
        sb.append("}");
        return sb.toString();
    }
}
