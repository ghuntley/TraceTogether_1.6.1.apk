package o;

import sg.gov.tech.bluetrace.protocol.v2.V2ReadRequestPayload;

public final class lJ extends C3011 implements C0760 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3216 f2747;

    /* renamed from: ι  reason: contains not printable characters */
    private C3057 f2748;

    public lJ(C3057 r1, C3216 r2) {
        this.f2748 = r1;
        this.f2747 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3399(C0815 r3, Object obj) {
        if (obj == null) {
            r3.m6224();
            return;
        }
        V2ReadRequestPayload v2ReadRequestPayload = (V2ReadRequestPayload) obj;
        C3216 r0 = this.f2747;
        r3.m6234();
        if (v2ReadRequestPayload != v2ReadRequestPayload.mp) {
            r0.m16163(r3, 12);
            r3.m6227(v2ReadRequestPayload.mp);
        }
        r0.m16163(r3, 10);
        r3.m6230(Integer.valueOf(v2ReadRequestPayload.v));
        if (v2ReadRequestPayload != v2ReadRequestPayload.id) {
            r0.m16163(r3, 9);
            r3.m6227(v2ReadRequestPayload.id);
        }
        if (v2ReadRequestPayload != v2ReadRequestPayload.f17594o) {
            r0.m16163(r3, 1);
            r3.m6227(v2ReadRequestPayload.f17594o);
        }
        r3.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3398(C0995 r8) {
        boolean z;
        if (r8.m7095() == C0313.NULL) {
            r8.m7097();
            return null;
        }
        V2ReadRequestPayload v2ReadRequestPayload = new V2ReadRequestPayload();
        C3057 r1 = this.f2748;
        r8.m7096();
        while (r8.m7092()) {
            int r3 = r1.m15608(r8);
            while (true) {
                z = r8.m7095() != C0313.NULL;
                if (r3 != 1 && r3 != 2) {
                    break;
                }
            }
            if (r3 != 3) {
                if (r3 != 12) {
                    if (r3 != 13) {
                        if (r3 != 17) {
                            r8.m7097();
                        } else if (z) {
                            v2ReadRequestPayload.id = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
                        } else {
                            v2ReadRequestPayload.id = null;
                        }
                    } else if (z) {
                        try {
                            v2ReadRequestPayload.v = r8.m7102();
                        } catch (NumberFormatException e) {
                            throw new C1701((Throwable) e);
                        }
                    }
                } else if (z) {
                    v2ReadRequestPayload.f17594o = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
                } else {
                    v2ReadRequestPayload.f17594o = null;
                }
            } else if (z) {
                v2ReadRequestPayload.mp = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
            } else {
                v2ReadRequestPayload.mp = null;
            }
            r8.m7105();
        }
        r8.m7103();
        return v2ReadRequestPayload;
    }
}
