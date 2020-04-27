package o;

import com.google.android.gms.common.api.Status;
import o.C0661;
import o.C0858;

/* renamed from: o.ҿ  reason: contains not printable characters */
public final class C2744 extends C3190<C1979, C0631> {

    /* renamed from: ŀ  reason: contains not printable characters */
    private final C1175 f12768;

    public C2744(C1970 r2, String str) {
        super(2);
        if (r2 != null) {
            this.f12768 = new C1175(C2745.m14529(r2, str).m8973(false));
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14499() {
        return "reauthenticateWithCredentialWithData";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0661<C2972, C1979> m14498() {
        C0661.Cif r0 = C0661.m5486();
        r0.f4733 = false;
        r0.f4734 = (this.f14525 || this.f14513) ? null : new C2847[]{C1272.f7176};
        r0.f4735 = new C0858.C0861(this);
        return r0.m5491();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14497() {
        C1229 r0 = C2550.m13603(this.f14515, this.f14518);
        if (this.f14520.m11461().equalsIgnoreCase(r0.m11461())) {
            ((C0631) this.f14521).m5375(this.f14522, r0);
            m16122(new C0834(r0));
            return;
        }
        m16115(new Status(17024));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ void m14496(C2972 r2, C3203 r3) {
        this.f14524 = new C0560(this, r3);
        if (this.f14525) {
            r2.H_().m15950(this.f12768.m7696(), (C3117) this.f14512);
        } else {
            r2.H_().m15961(this.f12768, (C3117) this.f14512);
        }
    }
}
