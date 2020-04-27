package o;

import o.C0661;
import o.C0858;

/* renamed from: o.ԐΙ  reason: contains not printable characters */
public final class C2971 extends C3190<C1979, C0631> {

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C1204 f13737;

    public C2971(C2076 r2) {
        super(2);
        if (r2 != null) {
            this.f13737 = new C1204(r2);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m15257() {
        return "sendSignInLinkToEmail";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0661<C2972, C1979> m15255() {
        C0661.Cif r0 = C0661.m5486();
        r0.f4733 = false;
        r0.f4734 = (this.f14525 || this.f14513) ? null : new C2847[]{C1272.f7176};
        r0.f4735 = new C0858.C3633iF(this);
        return r0.m5491();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m15254() {
        C1229 r0 = C2550.m13603(this.f14515, this.f14518);
        ((C0631) this.f14521).m5375(this.f14522, r0);
        m16122(new C0834(r0));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ void m15256(C2972 r2, C3203 r3) {
        this.f14524 = new C0560(this, r3);
        if (this.f14525) {
            r2.H_().m15957(this.f13737.m7824(), (C3117) this.f14512);
        } else {
            r2.H_().m15953(this.f13737, (C3117) this.f14512);
        }
    }
}
