package o;

import sg.gov.tech.bluetrace.protocol.v2.V2WriteRequestPayload;

public final class lK extends C3011 implements C0760 {

    /* renamed from: ι  reason: contains not printable characters */
    private C3057 f2749;

    public lK(C3057 r1) {
        this.f2749 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3401(C0815 r3, Object obj) {
        if (obj == null) {
            r3.m6224();
            return;
        }
        r3.m6234();
        r3.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3400(C0995 r3) {
        if (r3.m7095() == C0313.NULL) {
            r3.m7097();
            return null;
        }
        V2WriteRequestPayload.Companion companion = new V2WriteRequestPayload.Companion();
        V2WriteRequestPayload.Companion.m16299(r3, this.f2749);
        return companion;
    }
}
