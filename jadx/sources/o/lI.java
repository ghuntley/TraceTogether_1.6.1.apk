package o;

import sg.gov.tech.bluetrace.protocol.v1.V1WriteRequestPayload;

public final class lI extends C3011 implements C0760 {

    /* renamed from: Ι  reason: contains not printable characters */
    private C3057 f2746;

    public lI(C3057 r1) {
        this.f2746 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3397(C0815 r3, Object obj) {
        if (obj == null) {
            r3.m6224();
            return;
        }
        r3.m6234();
        r3.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3396(C0995 r3) {
        if (r3.m7095() == C0313.NULL) {
            r3.m7097();
            return null;
        }
        V1WriteRequestPayload.Companion companion = new V1WriteRequestPayload.Companion();
        V1WriteRequestPayload.Companion.m16297(r3, this.f2746);
        return companion;
    }
}
