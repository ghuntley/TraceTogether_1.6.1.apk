package o;

import android.os.Bundle;
import o.C0712;

@C0712.Cif(m5830 = "navigation")
/* renamed from: o.Ɛ  reason: contains not printable characters */
public final class C0618 extends C0712<C0643> {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0699 f4583;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m5326() {
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ C0593 m5325(C0593 r3, Bundle bundle, C0665 r5, C0712.C0713 r6) {
        C0643 r32 = (C0643) r3;
        int i = r32.f4640;
        if (i != 0) {
            C0593 r0 = r32.m5423(i, false);
            if (r0 != null) {
                return this.f4583.m5753(r0.f4518).m5826(r0, r0.m5244(bundle), r5, r6);
            }
            if (r32.f4641 == null) {
                r32.f4641 = Integer.toString(r32.f4640);
            }
            String str = r32.f4641;
            StringBuilder sb = new StringBuilder("navigation destination ");
            sb.append(str);
            sb.append(" is not a direct child of this NavGraph");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
        sb2.append(r32.m5424());
        throw new IllegalStateException(sb2.toString());
    }

    public C0618(C0699 r1) {
        this.f4583 = r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* synthetic */ C0593 m5324() {
        return new C0643(this);
    }
}
