package o;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import o.C0661;
import o.C0858;

/* renamed from: o.ҹӀ  reason: contains not printable characters */
public final class C2740 extends C3190<C1979, C0631> {

    /* renamed from: ŀ  reason: contains not printable characters */
    private final C1177 f12752;

    public C2740(String str, String str2, String str3) {
        super(2);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("email cannot be null or empty");
        } else if (!TextUtils.isEmpty(str2)) {
            this.f12752 = new C1177(str, str2, str3);
        } else {
            throw new IllegalArgumentException("password cannot be null or empty");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m14490() {
        return "reauthenticateWithEmailPasswordWithData";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0661<C2972, C1979> m14489() {
        C0661.Cif r0 = C0661.m5486();
        r0.f4733 = false;
        r0.f4734 = (this.f14525 || this.f14513) ? null : new C2847[]{C1272.f7176};
        r0.f4735 = new C0858.Cif(this);
        return r0.m5491();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14488() {
        C1229 r0 = C2550.m13603(this.f14515, this.f14518);
        if (this.f14520.m11461().equalsIgnoreCase(r0.m11461())) {
            ((C0631) this.f14521).m5375(this.f14522, r0);
            m16122(new C0834(r0));
            return;
        }
        m16115(new Status(17024));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ void m14491(C2972 r3, C3203 r4) {
        this.f14524 = new C0560(this, r4);
        if (this.f14525) {
            r3.H_().m15959(this.f12752.m7701(), this.f12752.m7700(), this.f14512);
        } else {
            r3.H_().m15951(this.f12752, (C3117) this.f14512);
        }
    }
}
