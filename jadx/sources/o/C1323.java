package o;

/* renamed from: o.ɩւ  reason: contains not printable characters */
public final class C1323 implements C1256 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2781<Long> f7334;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2781<Boolean> f7335;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m8325() {
        return f7335.m14685().booleanValue();
    }

    static {
        C2941 r0 = new C2941(C2803.m14714("com.google.android.gms.measurement"));
        f7335 = r0.m15194("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false);
        f7334 = r0.m15193("measurement.id.referrer.enable_logging_install_referrer_cmp_from_apk", 0);
    }
}
