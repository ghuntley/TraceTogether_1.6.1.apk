package o;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Collections;
import java.util.concurrent.Callable;
import o.C2562;

/* renamed from: o.Ӏπ  reason: contains not printable characters */
final class C2819 implements Callable<C2423<C3167>> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f13240;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3167 f13241;

    public C2819(C3167 r1, Context context) {
        this.f13241 = r1;
        this.f13240 = context;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0339<C3167> m14743(boolean z, Context context) {
        C3167 r0 = (C3167) this.f13241.clone();
        r0.f10754 = z;
        return new C2451(context, C3161.f14383, r0, new C2209());
    }

    public final /* synthetic */ Object call() {
        int i;
        if (C2973.f13738 == -1 || C2973.f13739 == -1) {
            int r0 = DynamiteModule.m798(this.f13240, "com.google.firebase.auth");
            if (r0 == 0) {
                i = 1;
            } else {
                int r2 = C2835.f13281.m14807(this.f13240, C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                if (r2 == 0 || r2 == 2) {
                    i = DynamiteModule.m799(this.f13240, "com.google.android.gms.firebase_auth", false);
                } else {
                    i = 0;
                }
            }
            int unused = C2973.f13738 = i;
            int unused2 = C2973.f13739 = r0;
        }
        C0339<C3167> r22 = null;
        C0339<C3167> r02 = C2973.f13739 != 0 ? m14743(true, this.f13240) : null;
        if (C2973.f13738 != 0) {
            r22 = m14743(false, this.f13240);
        }
        return new C2423(r22, r02, new C2562.C2563(C2973.f13738, C2973.f13739, Collections.emptyMap()));
    }
}
