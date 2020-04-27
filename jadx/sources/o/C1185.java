package o;

/* renamed from: o.ɤӀ  reason: contains not printable characters */
public final class C1185 implements C1162 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2781<Boolean> f6795;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2781<Boolean> f6796;

    /* renamed from: ι  reason: contains not printable characters */
    private static final C2781<Boolean> f6797;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m7722() {
        return true;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m7723() {
        return f6796.m14685().booleanValue();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m7720() {
        return f6795.m14685().booleanValue();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m7721() {
        return f6797.m14685().booleanValue();
    }

    static {
        C2941 r0 = new C2941(C2803.m14714("com.google.android.gms.measurement"));
        f6796 = r0.m15194("measurement.client.sessions.check_on_reset_and_enable", false);
        f6795 = r0.m15194("measurement.client.sessions.check_on_startup", true);
        f6797 = r0.m15194("measurement.client.sessions.start_session_before_view_screen", true);
    }
}
