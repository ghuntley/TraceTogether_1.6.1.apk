package o;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: o.ŧł  reason: contains not printable characters */
public final class C0560<ResultT, CallbackT> implements C3176<ResultT> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C3203<ResultT> f4459;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C3190<ResultT, CallbackT> f4460;

    public C0560(C3190<ResultT, CallbackT> r1, C3203<ResultT> r2) {
        this.f4460 = r1;
        this.f4459 = r2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m5170(ResultT resultt, Status status) {
        C2164 r1;
        C3203<ResultT> r0 = this.f4459;
        if (r0 == null) {
            throw new NullPointerException("completion source cannot be null");
        } else if (status == null) {
            r0.f14555.m6079(resultt);
        } else if (this.f4460.f14514 != null) {
            C3203<ResultT> r4 = this.f4459;
            FirebaseAuth instance = FirebaseAuth.getInstance(this.f4460.f14515);
            C1220 r02 = this.f4460.f14514;
            if ("reauthenticateWithCredential".equals(this.f4460.m13260()) || "reauthenticateWithCredentialWithData".equals(this.f4460.m13260())) {
                r1 = this.f4460.f14520;
            } else {
                r1 = null;
            }
            r4.f14555.m6073((Exception) C3032.m15494(instance, r02, r1));
        } else if (this.f4460.f14516 != null) {
            C3203<ResultT> r42 = this.f4459;
            r42.f14555.m6073((Exception) C3032.m15496(status));
        } else {
            C3203<ResultT> r43 = this.f4459;
            r43.f14555.m6073((Exception) C3032.m15497(status));
        }
    }
}
