package o;

import com.google.firebase.FirebaseApp;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.յЈ  reason: contains not printable characters */
public class C3157 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final FirebaseApp f14374;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, C0949> f14375 = new HashMap();

    /* renamed from: ι  reason: contains not printable characters */
    private final C2841<C0367> f14376;

    public C3157(FirebaseApp firebaseApp, C2841<C0367> r3) {
        this.f14374 = firebaseApp;
        this.f14376 = r3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized C0949 m15968(String str) {
        C0949 r0;
        r0 = this.f14375.get(str);
        if (r0 == null) {
            r0 = new C0949(str, this.f14374, this.f14376);
            this.f14375.put(str, r0);
        }
        return r0;
    }
}
