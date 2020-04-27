package o;

import o.C1943;

/* renamed from: o.Ιϳ  reason: contains not printable characters */
public final class C1861 extends C1943 {

    /* renamed from: ɩ  reason: contains not printable characters */
    final C1943.C1945 f9502;

    /* renamed from: Ι  reason: contains not printable characters */
    final C1943.C1944 f9503;

    /* renamed from: o.Ιϳ$if  reason: invalid class name */
    public static final class Cif extends C1943.If {

        /* renamed from: ǃ  reason: contains not printable characters */
        private C1943.C1944 f9504;

        /* renamed from: ι  reason: contains not printable characters */
        private C1943.C1945 f9505;

        /* renamed from: ı  reason: contains not printable characters */
        public final C1943.If m10239(C1943.C1945 r1) {
            this.f9505 = r1;
            return this;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final C1943.If m10238(C1943.C1944 r1) {
            this.f9504 = r1;
            return this;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final C1943 m10240() {
            return new C1861(this.f9505, this.f9504);
        }
    }

    /* synthetic */ C1861(C1943.C1945 r1, C1943.C1944 r2) {
        this.f9502 = r1;
        this.f9503 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = r4.f9503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r1 = r4.f9502;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof o.C1943
            r2 = 0
            if (r1 == 0) goto L_0x0036
            o.η$ǃ r1 = r4.f9502
            if (r1 != 0) goto L_0x0015
            r1 = r5
            o.Ιϳ r1 = (o.C1861) r1
            o.η$ǃ r1 = r1.f9502
            if (r1 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0015:
            r3 = r5
            o.Ιϳ r3 = (o.C1861) r3
            o.η$ǃ r3 = r3.f9502
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0036
        L_0x0020:
            o.η$ı r1 = r4.f9503
            if (r1 != 0) goto L_0x002b
            o.Ιϳ r5 = (o.C1861) r5
            o.η$ı r5 = r5.f9503
            if (r5 != 0) goto L_0x0036
            goto L_0x0035
        L_0x002b:
            o.Ιϳ r5 = (o.C1861) r5
            o.η$ı r5 = r5.f9503
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0036
        L_0x0035:
            return r0
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1861.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C1943.C1945 r0 = this.f9502;
        int i = 0;
        int hashCode = ((r0 == null ? 0 : r0.hashCode()) ^ 1000003) * 1000003;
        C1943.C1944 r2 = this.f9503;
        if (r2 != null) {
            i = r2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConnectionInfo{networkType=");
        sb.append(this.f9502);
        sb.append(", mobileSubtype=");
        sb.append(this.f9503);
        sb.append("}");
        return sb.toString();
    }
}
