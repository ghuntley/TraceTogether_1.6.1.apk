package o;

import android.text.TextUtils;
import o.C0661;

/* renamed from: o.ҹΙ  reason: contains not printable characters */
public final class C2736 extends C3190<C1979, C0631> {

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C2076 f12733;

    public C2736(C2076 r2) {
        super(2);
        if (r2 != null) {
            this.f12733 = r2;
            if (TextUtils.isEmpty(r2.f10155)) {
                throw new IllegalArgumentException("email cannot be null");
            } else if (TextUtils.isEmpty(r2.f10156)) {
                throw new IllegalArgumentException("password cannot be null");
            }
        } else {
            throw new NullPointerException("credential cannot be null");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14481() {
        return "linkEmailAuthCredential";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0661<C2972, C1979> m14480() {
        C0661.Cif r0 = C0661.m5486();
        r0.f4733 = false;
        r0.f4734 = (this.f14525 || this.f14513) ? null : new C2847[]{C1272.f7176};
        r0.f4735 = new C0309(this);
        return r0.m5491();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14479() {
        C1229 r0 = C2550.m13603(this.f14515, this.f14518);
        ((C0631) this.f14521).m5375(this.f14522, r0);
        m16122(new C0834(r0));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ void m14482(C2972 r4, C3203 r5) {
        this.f14524 = new C0560(this, r5);
        if (this.f14525) {
            r4.H_().m15944(this.f12733.f10155, this.f12733.f10156, this.f14520.m11464(), this.f14512);
        } else {
            r4.H_().m15958(new C1042(this.f12733.f10155, this.f12733.f10156, this.f14520.m11464()), this.f14512);
        }
    }
}
