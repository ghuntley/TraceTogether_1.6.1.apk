package o;

import o.C3575lq;

/* renamed from: o.mp  reason: case insensitive filesystem */
public final class C3603mp implements C2979 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0329 f3293;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0329 f3294;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2039 f3295;

    public C3603mp() {
    }

    public C3603mp(C2039 r1, C0329 r2, C0329 r3) {
        this.f3295 = r1;
        this.f3294 = r2;
        this.f3293 = r3;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m3913(C0329 r4) {
        C2039 r42 = this.f3295;
        C0329 r0 = this.f3294;
        C0329 r1 = this.f3293;
        if (!r0.m4421() || r0.m4401() == null) {
            Boolean bool = Boolean.FALSE;
            C0770 r02 = new C0770();
            r02.m6079(bool);
            return r02;
        }
        C2832 r03 = (C2832) r0.m4401();
        if (r1.m4421()) {
            C2832 r12 = (C2832) r1.m4401();
            if (!(r12 == null || !r03.f13256.equals(r12.f13256))) {
                Boolean bool2 = Boolean.FALSE;
                C0770 r04 = new C0770();
                r04.m6079(bool2);
                return r04;
            }
        }
        return r42.f10080.m15463(r03).m4418(r42.f10075, new C3575lq.C0226(r42));
    }
}
