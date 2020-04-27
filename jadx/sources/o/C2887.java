package o;

import com.google.android.gms.common.api.Status;

/* renamed from: o.ӏɍ  reason: contains not printable characters */
public final class C2887 implements C0539 {

    /* renamed from: o.ӏɍ$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String f13431;

        /* renamed from: ι  reason: contains not printable characters */
        public final String f13432;

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m14963(String str, Object... objArr) {
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Cif(java.lang.String r7, java.lang.String... r8) {
            /*
                r6 = this;
                int r0 = r8.length
                if (r0 != 0) goto L_0x0006
                java.lang.String r8 = ""
                goto L_0x0036
            L_0x0006:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 91
                r0.append(r1)
                int r1 = r8.length
                r2 = 0
            L_0x0012:
                if (r2 >= r1) goto L_0x0028
                r3 = r8[r2]
                int r4 = r0.length()
                r5 = 1
                if (r4 <= r5) goto L_0x0022
                java.lang.String r4 = ","
                r0.append(r4)
            L_0x0022:
                r0.append(r3)
                int r2 = r2 + 1
                goto L_0x0012
            L_0x0028:
                r8 = 93
                r0.append(r8)
                r8 = 32
                r0.append(r8)
                java.lang.String r8 = r0.toString()
            L_0x0036:
                r6.<init>((java.lang.String) r7, (java.lang.String) r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2887.Cif.<init>(java.lang.String, java.lang.String[]):void");
        }

        private Cif(String str, String str2) {
            this.f13432 = str2;
            this.f13431 = str;
            new C1642(str);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Exception m14962(Status status) {
        if (status.f538 != null) {
            return new C0317(status);
        }
        return new C2929(status);
    }
}
