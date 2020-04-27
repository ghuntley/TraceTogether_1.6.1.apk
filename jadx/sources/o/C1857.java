package o;

/* renamed from: o.Ιυ  reason: contains not printable characters */
public final class C1857 implements C1779 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2781<Boolean> f9491;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2781<Boolean> f9492;

    /* renamed from: ι  reason: contains not printable characters */
    private static final C2781<Boolean> f9493;

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m10227() {
        return f9492.m14685().booleanValue();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10226() {
        return f9491.m14685().booleanValue();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10225() {
        return f9493.m14685().booleanValue();
    }

    static {
        C2941 r0 = new C2941(C2803.m14714("com.google.android.gms.measurement"));
        f9492 = r0.m15194("measurement.service.sessions.remove_disabled_session_number", true);
        f9491 = r0.m15194("measurement.service.sessions.session_number_enabled", true);
        f9493 = r0.m15194("measurement.service.sessions.session_number_backfill_enabled", true);
    }
}
