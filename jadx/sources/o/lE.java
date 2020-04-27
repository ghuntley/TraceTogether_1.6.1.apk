package o;

import sg.gov.tech.bluetrace.protocol.v2.V2ReadRequestPayload;

public final class lE extends C3011 implements C0760 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private C3057 f2739;

    public lE(C3057 r1) {
        this.f2739 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3389(C0815 r3, Object obj) {
        if (obj == null) {
            r3.m6224();
            return;
        }
        r3.m6234();
        r3.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3388(C0995 r3) {
        if (r3.m7095() == C0313.NULL) {
            r3.m7097();
            return null;
        }
        V2ReadRequestPayload.Companion companion = new V2ReadRequestPayload.Companion();
        V2ReadRequestPayload.Companion.m16298(r3, this.f2739);
        return companion;
    }
}
