package o;

import o.C0661;
import o.C0858;

/* renamed from: o.ѯ  reason: contains not printable characters */
public final class C2650 extends C3190<C1979, C0631> {

    /* renamed from: ŀ  reason: contains not printable characters */
    private final C2076 f12143;

    public C2650(C2076 r2) {
        super(2);
        if (r2 != null) {
            this.f12143 = r2;
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14015() {
        return "linkEmailAuthCredential";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0661<C2972, C1979> m14014() {
        C0661.Cif r0 = C0661.m5486();
        r0.f4733 = false;
        r0.f4734 = (this.f14525 || this.f14513) ? null : new C2847[]{C1272.f7176};
        r0.f4735 = new C0858.C0859(this);
        return r0.m5491();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14013() {
        C1229 r0 = C2550.m13603(this.f14515, this.f14518);
        ((C0631) this.f14521).m5375(this.f14522, r0);
        m16122(new C0834(r0));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ void m14012(C2972 r3, C3203 r4) {
        this.f14524 = new C0560(this, r4);
        C2076 r0 = this.f12143;
        r0.f10153 = this.f14520.m11464();
        r0.f10152 = true;
        C1204 r42 = new C1204(r0);
        if (this.f14525) {
            r3.H_().m15957(r42.m7824(), (C3117) this.f14512);
        } else {
            r3.H_().m15953(r42, (C3117) this.f14512);
        }
    }
}
