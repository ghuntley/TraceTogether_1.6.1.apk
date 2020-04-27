package o;

/* renamed from: o.ɭј  reason: contains not printable characters */
public final class C1447 implements C1433 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2781<Boolean> f7792;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2781<Boolean> f7793;

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m8709() {
        return f7793.m14685().booleanValue();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m8710() {
        return f7792.m14685().booleanValue();
    }

    static {
        C2941 r0 = new C2941(C2803.m14714("com.google.android.gms.measurement"));
        f7793 = r0.m15194("measurement.personalized_ads_signals_collection_enabled", true);
        f7792 = r0.m15194("measurement.personalized_ads_property_translation_enabled", true);
    }
}
