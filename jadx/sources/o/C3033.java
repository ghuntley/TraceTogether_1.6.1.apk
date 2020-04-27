package o;

import o.C2816;
import o.C3100;

/* renamed from: o.ԼΙ  reason: contains not printable characters */
final class C3033 implements C3108 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3203<C2942> f13930;

    public C3033(C3203<C2942> r1) {
        this.f13930 = r1;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m15498(C0399 r6) {
        if (!(r6.m4667() == C3100.If.REGISTERED) || C3050.m15562(r6)) {
            return false;
        }
        this.f13930.f14555.m6079(new C2816.Cif().m15200(r6.m4668()).m15201(r6.m4670()).m15198(r6.m4673()).m15199());
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m15499(C0399 r5, Exception exc) {
        if (!(r5.m4667() == C3100.If.REGISTER_ERROR)) {
            if (!(r5.m4667() == C3100.If.NOT_GENERATED || r5.m4667() == C3100.If.ATTEMPT_MIGRATION)) {
                if (!(r5.m4667() == C3100.If.UNREGISTERED)) {
                    return false;
                }
            }
        }
        this.f13930.f14555.m6068(exc);
        return true;
    }
}
