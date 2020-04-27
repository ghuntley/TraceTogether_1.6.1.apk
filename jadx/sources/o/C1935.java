package o;

/* renamed from: o.εɩ  reason: contains not printable characters */
public final class C1935 implements C1939 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2781<Boolean> f9765;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2781<Boolean> f9766;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2781<Boolean> f9767;

    /* renamed from: ι  reason: contains not printable characters */
    private static final C2781<Boolean> f9768;

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10561() {
        return f9767.m14685().booleanValue();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m10563() {
        return f9766.m14685().booleanValue();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m10562() {
        return f9765.m14685().booleanValue();
    }

    static {
        C2941 r0 = new C2941(C2803.m14714("com.google.android.gms.measurement"));
        f9767 = r0.m15194("measurement.client.sessions.background_sessions_enabled", true);
        f9768 = r0.m15194("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f9766 = r0.m15194("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f9765 = r0.m15194("measurement.client.sessions.session_id_enabled", true);
    }
}
