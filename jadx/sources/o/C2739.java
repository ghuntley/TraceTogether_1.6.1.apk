package o;

import android.text.TextUtils;
import o.C0661;

/* renamed from: o.ҹІ  reason: contains not printable characters */
public final class C2739 extends C3190<C2552, C0631> {

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C1040 f12751;

    public C2739(String str) {
        super(1);
        if (!TextUtils.isEmpty(str)) {
            this.f12751 = new C1040(str);
            return;
        }
        throw new IllegalArgumentException("refresh token cannot be null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14486() {
        return "getAccessToken";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0661<C2972, C2552> m14485() {
        C0661.Cif r0 = C0661.m5486();
        r0.f4733 = false;
        r0.f4734 = (this.f14525 || this.f14513) ? null : new C2847[]{C1272.f7176};
        r0.f4735 = new C0322(this);
        return r0.m5491();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14484() {
        if (TextUtils.isEmpty(this.f14522.m8532())) {
            this.f14522.m8537(this.f12751.m7282());
        }
        ((C0631) this.f14521).m5375(this.f14522, this.f14520);
        m16122(C0627.m5339(this.f14522.m8536()));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ void m14487(C2972 r2, C3203 r3) {
        this.f14524 = new C0560(this, r3);
        if (this.f14525) {
            r2.H_().m15946(this.f12751.m7282(), (C3117) this.f14512);
        } else {
            r2.H_().m15947(this.f12751, (C3117) this.f14512);
        }
    }
}
