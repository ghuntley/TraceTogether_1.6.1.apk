package o;

import o.C0661;
import o.C0858;

/* renamed from: o.ұ  reason: contains not printable characters */
public final class C2721 extends C3190<C1979, C0631> {

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C2288 f12582;

    public C2721(C2288 r2) {
        super(2);
        if (r2 != null) {
            this.f12582 = r2;
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14455() {
        return "linkPhoneAuthCredential";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0661<C2972, C1979> m14454() {
        C0661.Cif r0 = C0661.m5486();
        r0.f4733 = false;
        r0.f4734 = (this.f14525 || this.f14513) ? null : new C2847[]{C1272.f7176};
        r0.f4735 = new C0858.C0860(this);
        return r0.m5491();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14452() {
        C1229 r0 = C2550.m13603(this.f14515, this.f14518);
        ((C0631) this.f14521).m5375(this.f14522, r0);
        m16122(new C0834(r0));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ void m14453(C2972 r3, C3203 r4) {
        this.f14524 = new C0560(this, r4);
        if (this.f14525) {
            r3.H_().m15955(this.f14520.m11464(), this.f12582, this.f14512);
        } else {
            r3.H_().m15948(new C1070(this.f14520.m11464(), this.f12582), (C3117) this.f14512);
        }
    }
}
