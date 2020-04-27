package o;

import sg.gov.tech.bluetrace.protocol.v1.V1ReadRequestPayload;

public final class lH extends C3011 implements C0760 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3057 f2744;

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3216 f2745;

    public lH(C3057 r1, C3216 r2) {
        this.f2744 = r1;
        this.f2745 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3395(C0815 r3, Object obj) {
        if (obj == null) {
            r3.m6224();
            return;
        }
        V1ReadRequestPayload v1ReadRequestPayload = (V1ReadRequestPayload) obj;
        C3216 r0 = this.f2745;
        r3.m6234();
        if (v1ReadRequestPayload != v1ReadRequestPayload.modelP) {
            r0.m16163(r3, 16);
            r3.m6227(v1ReadRequestPayload.modelP);
        }
        r0.m16163(r3, 10);
        r3.m6230(Integer.valueOf(v1ReadRequestPayload.v));
        if (v1ReadRequestPayload != v1ReadRequestPayload.msg) {
            r0.m16163(r3, 19);
            r3.m6227(v1ReadRequestPayload.msg);
        }
        if (v1ReadRequestPayload != v1ReadRequestPayload.org) {
            r0.m16163(r3, 0);
            r3.m6227(v1ReadRequestPayload.org);
        }
        r3.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3394(C0995 r8) {
        boolean z;
        if (r8.m7095() == C0313.NULL) {
            r8.m7097();
            return null;
        }
        V1ReadRequestPayload v1ReadRequestPayload = new V1ReadRequestPayload();
        C3057 r1 = this.f2744;
        r8.m7096();
        while (r8.m7092()) {
            int r3 = r1.m15608(r8);
            while (true) {
                z = r8.m7095() != C0313.NULL;
                if (r3 != 1 && r3 != 2) {
                    break;
                }
            }
            if (r3 != 10) {
                if (r3 != 13) {
                    if (r3 != 15) {
                        if (r3 != 22) {
                            r8.m7097();
                        } else if (z) {
                            v1ReadRequestPayload.org = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
                        } else {
                            v1ReadRequestPayload.org = null;
                        }
                    } else if (z) {
                        v1ReadRequestPayload.msg = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
                    } else {
                        v1ReadRequestPayload.msg = null;
                    }
                } else if (z) {
                    try {
                        v1ReadRequestPayload.v = r8.m7102();
                    } catch (NumberFormatException e) {
                        throw new C1701((Throwable) e);
                    }
                }
            } else if (z) {
                v1ReadRequestPayload.modelP = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
            } else {
                v1ReadRequestPayload.modelP = null;
            }
            r8.m7105();
        }
        r8.m7103();
        return v1ReadRequestPayload;
    }
}
