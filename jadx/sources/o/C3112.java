package o;

import o.C3594mg;
import sg.gov.tech.bluetrace.protocol.v1.V1ReadRequestPayload;
import sg.gov.tech.bluetrace.protocol.v1.V1WriteRequestPayload;
import sg.gov.tech.bluetrace.protocol.v2.V2ReadRequestPayload;
import sg.gov.tech.bluetrace.protocol.v2.V2WriteRequestPayload;

/* renamed from: o.լʇ  reason: contains not printable characters */
public final class C3112 implements C2638 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C3058 f14226 = new C3058();

    /* renamed from: ι  reason: contains not printable characters */
    private static final C3179 f14227 = new C3179();

    /* renamed from: ı  reason: contains not printable characters */
    public final <T> C3011<T> m15775(C3122 r3, C3101<T> r4) {
        if (r3.f14245 != C3118.f14241 || r3.f14248.f13955 != 136) {
            return null;
        }
        if (r4.getRawType() == V1ReadRequestPayload.class) {
            return new lH(f14226, f14227);
        }
        if (r4.getRawType() == V2WriteRequestPayload.Companion.class) {
            return new lK(f14226);
        }
        if (r4.getRawType() == V2ReadRequestPayload.class) {
            return new lJ(f14226, f14227);
        }
        if (r4.getRawType() == V1WriteRequestPayload.class) {
            return new lG(r3, f14226, f14227);
        }
        if (r4.getRawType() == V1WriteRequestPayload.Companion.class) {
            return new lI(f14226);
        }
        if (r4.getRawType() == V1ReadRequestPayload.Companion.class) {
            return new lF(f14226);
        }
        if (r4.getRawType() == V2ReadRequestPayload.Companion.class) {
            return new lE(f14226);
        }
        if (r4.getRawType() == V2WriteRequestPayload.class) {
            return new lM(f14226, f14227);
        }
        if (r4.getRawType() == C3594mg.C0252.class) {
            return new C3589mb(r3, f14226, f14227);
        }
        if (r4.getRawType() == C3594mg.If.class) {
            return new lY(r3, f14226, f14227);
        }
        return null;
    }
}
