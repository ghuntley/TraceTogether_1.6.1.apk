package o;

/* renamed from: o.ıϰ  reason: contains not printable characters */
public final class C0400 implements C0554 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2841<C0367> f3957;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2841<C1095> f3958;

    public C0400(C2841<C0367> r1, C2841<C1095> r2) {
        this.f3957 = r1;
        this.f3958 = r2;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C2398> m4683() {
        C2841<C0367> r0 = this.f3957;
        if (r0 != null) {
            return r0.m14812().m4556().m4412(new C0328(this));
        }
        C3203 r02 = new C3203();
        r02.f14555.m6079(new C2398((String) null, this.f3958.m14812().m7475()));
        return r02.f14555;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static /* synthetic */ C2398 m4682(C0400 r1, C0329 r2) {
        String str;
        if (!r2.m4421()) {
            Exception r22 = r2.m4406();
            if (r22 instanceof C0444) {
                str = null;
            } else {
                throw r22;
            }
        } else {
            str = ((C2552) r2.m4401()).f11653;
        }
        return new C2398(str, r1.f3958.m14812().m7475());
    }
}
