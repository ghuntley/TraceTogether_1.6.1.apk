package o;

/* renamed from: o.ıɢ  reason: contains not printable characters */
public final class C0334 implements C0302 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2781<Boolean> f3696;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2781<Long> f3697;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2781<Boolean> f3698;

    /* renamed from: ι  reason: contains not printable characters */
    private static final C2781<Boolean> f3699;

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m4430() {
        return f3699.m14685().booleanValue();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m4429() {
        return f3698.m14685().booleanValue();
    }

    static {
        C2941 r0 = new C2941(C2803.m14714("com.google.android.gms.measurement"));
        f3699 = r0.m15194("measurement.sdk.dynamite.allow_remote_dynamite", false);
        f3696 = r0.m15194("measurement.collection.init_params_control_enabled", true);
        f3698 = r0.m15194("measurement.sdk.dynamite.use_dynamite2", false);
        f3697 = r0.m15193("measurement.id.sdk.dynamite.use_dynamite", 0);
    }
}
