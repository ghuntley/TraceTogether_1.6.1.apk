package o;

import o.C0661;
import o.C0858;

/* renamed from: o.Ӏҹ  reason: contains not printable characters */
public final class C2849 extends C3190<C1979, C0631> {

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C1178 f13297;

    public C2849(C2288 r2, String str) {
        super(2);
        if (r2 != null) {
            this.f13297 = new C1178(r2, str);
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14826() {
        return "signInWithPhoneNumber";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0661<C2972, C1979> m14825() {
        C0661.Cif r0 = C0661.m5486();
        r0.f4733 = false;
        r0.f4734 = (this.f14525 || this.f14513) ? null : new C2847[]{C1272.f7176};
        r0.f4735 = new C0858.C3632aux(this);
        return r0.m5491();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14824() {
        C1229 r0 = C2550.m13603(this.f14515, this.f14518);
        ((C0631) this.f14521).m5375(this.f14522, r0);
        m16122(new C0834(r0));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ void m14827(C2972 r2, C3203 r3) {
        this.f14524 = new C0560(this, r3);
        if (this.f14525) {
            r2.H_().m15954(this.f13297.m7702(), (C3117) this.f14512);
        } else {
            r2.H_().m15952(this.f13297, (C3117) this.f14512);
        }
    }
}
