package o;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.Future;
import o.C2322;
import o.C2887;
import o.C3024;

/* renamed from: o.аι  reason: contains not printable characters */
public abstract class C2392<T extends C2322> {

    /* renamed from: ι  reason: contains not printable characters */
    private C2423<T> f10943;

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract Future<C2423<T>> m12407();

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <ResultT, A extends C3024.C3028> C0329<ResultT> m12406(C2507<A, ResultT> r4) {
        C0339<O> r0;
        String r02 = r4.m13260();
        C2423 r1 = m12405();
        if (r1.f11022.m12559(r02)) {
            r0 = r1.f11024;
        } else {
            r0 = r1.f11023;
        }
        if (r0 == null) {
            C1590 r42 = C3032.m15497(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable"));
            C0770 r03 = new C0770();
            r03.m6073((Exception) r42);
            return r03;
        }
        if (((C2322) r0.m4469()).f10754) {
            r4.m13261();
        }
        return r0.m4462(r4.m13259());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <ResultT, A extends C3024.C3028> C0329<ResultT> m12408(C2507<A, ResultT> r4) {
        C0339<O> r0;
        String r02 = r4.m13260();
        C2423 r1 = m12405();
        if (r1.f11022.m12559(r02)) {
            r0 = r1.f11024;
        } else {
            r0 = r1.f11023;
        }
        if (r0 == null) {
            C1590 r42 = C3032.m15497(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable"));
            C0770 r03 = new C0770();
            r03.m6073((Exception) r42);
            return r03;
        }
        if (((C2322) r0.m4469()).f10754) {
            r4.m13261();
        }
        return r0.m4468(r4.m13259());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2423<T> m12405() {
        C2423<T> r0;
        synchronized (this) {
            if (this.f10943 == null) {
                try {
                    this.f10943 = (C2423) m12407().get();
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to Google Play Services: ".concat(valueOf) : new String("There was an error while initializing the connection to Google Play Services: "));
                }
            }
            r0 = this.f10943;
        }
        return r0;
    }

    static {
        new C2887.Cif("BiChannelGoogleApi", "FirebaseAuth: ");
    }
}
