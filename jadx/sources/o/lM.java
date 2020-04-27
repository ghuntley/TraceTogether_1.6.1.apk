package o;

import sg.gov.tech.bluetrace.protocol.v2.V2WriteRequestPayload;

public final class lM extends C3011 implements C0760 {

    /* renamed from: Ι  reason: contains not printable characters */
    private C3216 f2753;

    /* renamed from: ι  reason: contains not printable characters */
    private C3057 f2754;

    public lM(C3057 r1, C3216 r2) {
        this.f2754 = r1;
        this.f2753 = r2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m3404(C0815 r3, Object obj) {
        if (obj == null) {
            r3.m6224();
            return;
        }
        V2WriteRequestPayload v2WriteRequestPayload = (V2WriteRequestPayload) obj;
        C3216 r0 = this.f2753;
        r3.m6234();
        if (v2WriteRequestPayload != v2WriteRequestPayload.mc) {
            r0.m16163(r3, 15);
            r3.m6227(v2WriteRequestPayload.mc);
        }
        r0.m16163(r3, 10);
        r3.m6230(Integer.valueOf(v2WriteRequestPayload.v));
        if (v2WriteRequestPayload != v2WriteRequestPayload.id) {
            r0.m16163(r3, 9);
            r3.m6227(v2WriteRequestPayload.id);
        }
        if (v2WriteRequestPayload != v2WriteRequestPayload.f17595o) {
            r0.m16163(r3, 1);
            r3.m6227(v2WriteRequestPayload.f17595o);
        }
        r0.m16163(r3, 3);
        r3.m6230(Integer.valueOf(v2WriteRequestPayload.rs));
        r3.m6225(3, 5, "}");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Object m3403(C0995 r8) {
        boolean z;
        if (r8.m7095() == C0313.NULL) {
            r8.m7097();
            return null;
        }
        V2WriteRequestPayload v2WriteRequestPayload = new V2WriteRequestPayload();
        C3057 r1 = this.f2754;
        r8.m7096();
        while (r8.m7092()) {
            int r3 = r1.m15608(r8);
            while (true) {
                z = r8.m7095() != C0313.NULL;
                if (r3 != 1 && r3 != 2) {
                    break;
                }
            }
            if (r3 != 4) {
                if (r3 != 6) {
                    if (r3 != 17) {
                        if (r3 != 12) {
                            if (r3 != 13) {
                                r8.m7097();
                            } else if (z) {
                                try {
                                    v2WriteRequestPayload.v = r8.m7102();
                                } catch (NumberFormatException e) {
                                    throw new C1701((Throwable) e);
                                }
                            }
                        } else if (z) {
                            v2WriteRequestPayload.f17595o = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
                        } else {
                            v2WriteRequestPayload.f17595o = null;
                        }
                    } else if (z) {
                        v2WriteRequestPayload.id = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
                    } else {
                        v2WriteRequestPayload.id = null;
                    }
                } else if (z) {
                    try {
                        v2WriteRequestPayload.rs = r8.m7102();
                    } catch (NumberFormatException e2) {
                        throw new C1701((Throwable) e2);
                    }
                }
            } else if (z) {
                v2WriteRequestPayload.mc = r8.m7095() != C0313.BOOLEAN ? r8.m7101() : Boolean.toString(r8.m7106());
            } else {
                v2WriteRequestPayload.mc = null;
            }
            r8.m7105();
        }
        r8.m7103();
        return v2WriteRequestPayload;
    }
}
