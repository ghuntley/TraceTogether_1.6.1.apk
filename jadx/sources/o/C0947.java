package o;

import android.content.Context;
import o.C1298;
import o.C2344;

/* renamed from: o.ȣı  reason: contains not printable characters */
public final class C0947 implements C1298 {

    /* renamed from: ι  reason: contains not printable characters */
    private C1276 f5938;

    private C0947(Context context) {
        this.f5938 = C1276.m8186(context);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1298.C1299 m6846(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean r4 = this.f5938.m8188(str, currentTimeMillis);
        boolean r0 = this.f5938.m8187(currentTimeMillis);
        if (r4 && r0) {
            return C1298.C1299.COMBINED;
        }
        if (r0) {
            return C1298.C1299.GLOBAL;
        }
        if (r4) {
            return C1298.C1299.SDK;
        }
        return C1298.C1299.NONE;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2344<C1298> m6845() {
        C2344.C2345 r0 = new C2344.C2345(C1298.class, new Class[0], (byte) 0).m12230(new C2393(Context.class, 1, 0));
        C2313<T> r1 = C1028.m7269();
        if (r1 != null) {
            r0.f10854 = r1;
            return r0.m12231();
        }
        throw new NullPointerException("Null factory");
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ C1298 m6844(C2298 r2) {
        return new C0947((Context) r2.m11973(Context.class));
    }
}
