package o;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: o.ѕɪ  reason: contains not printable characters */
public final class C2550 extends C2392<C3167> {

    /* renamed from: ı  reason: contains not printable characters */
    private final Future<C2423<C3167>> f11640 = m12407();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C3167 f11641;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f11642;

    C2550(Context context, C3167 r2) {
        this.f11642 = context;
        this.f11641 = r2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Future<C2423<C3167>> m13607() {
        Future<C2423<C3167>> future = this.f11640;
        if (future != null) {
            return future;
        }
        return C1348.m8446().m9360(C1638.f8597).submit(new C2819(this.f11641, this.f11642));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0329<C2552> m13604(FirebaseApp firebaseApp, C2164 r3, String str, C0631 r5) {
        C2739 r2 = (C2739) new C2739(str).m16116(firebaseApp).m16118(r3).m16117(r5).m16114(r5);
        return m12406(r2).m4419(new C2535(this, r2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0329<C1979> m13609(FirebaseApp firebaseApp, C1970 r3, String str, C0631 r5) {
        C2769 r2 = (C2769) new C2769(r3, str).m16116(firebaseApp).m16117(r5);
        return m12408(r2).m4419(new C2535(this, r2));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0329<C1979> m13605(FirebaseApp firebaseApp, String str, String str2, String str3, C0631 r6) {
        C2853 r2 = (C2853) new C2853(str, str2, str3).m16116(firebaseApp).m16117(r6);
        return m12408(r2).m4419(new C2535(this, r2));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0329<C1979> m13606(FirebaseApp firebaseApp, C2076 r3, C0631 r4) {
        C2971 r2 = (C2971) new C2971(r3).m16116(firebaseApp).m16117(r4);
        return m12408(r2).m4419(new C2535(this, r2));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C1979> m13608(FirebaseApp firebaseApp, C2288 r3, String str, C0631 r5) {
        C2849 r2 = (C2849) new C2849(r3, str).m16116(firebaseApp).m16117(r5);
        return m12408(r2).m4419(new C2535(this, r2));
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C1229 m13603(FirebaseApp firebaseApp, C1314 r7) {
        if (firebaseApp == null) {
            throw new NullPointerException("null reference");
        } else if (r7 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C0980(r7, "firebase"));
            List<C1436> r1 = r7.m8283();
            if (r1 != null && !r1.isEmpty()) {
                for (int i = 0; i < r1.size(); i++) {
                    arrayList.add(new C0980(r1.get(i)));
                }
            }
            C1229 r12 = new C1229(firebaseApp, arrayList);
            r12.f6979 = new C1145(r7.m8275(), r7.m8284());
            r12.f6974 = r7.m8279();
            r12.f6972 = r7.m8285();
            r12.m11465(C2745.m14520(r7.m8278()));
            return r12;
        } else {
            throw new NullPointerException("null reference");
        }
    }
}
