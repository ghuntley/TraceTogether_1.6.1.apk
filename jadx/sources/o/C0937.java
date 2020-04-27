package o;

import com.google.android.gms.common.api.Status;
import o.C0506;
import o.C0587;

/* renamed from: o.ǉ  reason: contains not printable characters */
public final class C0937 extends C1017<Boolean> {

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0587.Cif<?> f5918;

    public C0937(C0587.Cif<?> ifVar, C3203<Boolean> r3) {
        super(4, r3);
        this.f5918 = ifVar;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6819(C1082 r1, boolean z) {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6817(C0506.C0507<?> r4) {
        C0730 remove = r4.m4946().remove(this.f5918);
        if (remove != null) {
            remove.f4960.m5468(r4.m4941(), this.f6217);
            remove.f4959.m5099();
            return;
        }
        this.f6217.m16149(false);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2847[] m6820(C0506.C0507<?> r2) {
        C0730 r22 = r2.m4946().get(this.f5918);
        if (r22 == null) {
            return null;
        }
        return r22.f4959.m5101();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m6816(C0506.C0507<?> r2) {
        C0730 r22 = r2.m4946().get(this.f5918);
        return r22 != null && r22.f4959.m5098();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6815(RuntimeException runtimeException) {
        super.m7249(runtimeException);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6818(Status status) {
        super.m7252(status);
    }
}
