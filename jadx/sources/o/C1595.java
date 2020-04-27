package o;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: o.ʁǃ  reason: contains not printable characters */
public final class C1595 implements C0631 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ FirebaseAuth f8468;

    public C1595(FirebaseAuth firebaseAuth) {
        this.f8468 = firebaseAuth;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9304(C1383 r3, C2164 r4) {
        this.f8468.m1089(r4, r3, true, true);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9303(Status status) {
        int i = status.f536;
        if (i == 17011 || i == 17021 || i == 17005) {
            FirebaseAuth firebaseAuth = this.f8468;
            firebaseAuth.m1092();
            if (firebaseAuth.f967 != null) {
                C0408 r2 = firebaseAuth.f967.f4869;
                r2.f3969.removeCallbacks(r2.f3972);
            }
        }
    }
}
