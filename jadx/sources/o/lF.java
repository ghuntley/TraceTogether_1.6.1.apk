package o;

import sg.gov.tech.bluetrace.protocol.v1.V1ReadRequestPayload;

public final class lF extends C3011 implements C0760 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3057 f2740;

    public lF(C3057 r1) {
        this.f2740 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3391(C0815 r3, Object obj) {
        if (obj == null) {
            r3.m6224();
            return;
        }
        r3.m6234();
        r3.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3390(C0995 r3) {
        if (r3.m7095() == C0313.NULL) {
            r3.m7097();
            return null;
        }
        V1ReadRequestPayload.Companion companion = new V1ReadRequestPayload.Companion();
        V1ReadRequestPayload.Companion.m16296(r3, this.f2740);
        return companion;
    }
}
