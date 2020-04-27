package o;

/* renamed from: o.ɪч  reason: contains not printable characters */
public final class C1394 implements C1374 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2781<Boolean> f7640;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2781<Long> f7641;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2781<Long> f7642;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2781<Boolean> f7643;

    /* renamed from: ι  reason: contains not printable characters */
    private static final C2781<Boolean> f7644;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m8561() {
        return f7643.m14685().booleanValue();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m8560() {
        return f7644.m14685().booleanValue();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m8562() {
        return f7640.m14685().booleanValue();
    }

    static {
        C2941 r0 = new C2941(C2803.m14714("com.google.android.gms.measurement"));
        f7642 = r0.m15193("measurement.id.lifecycle.app_in_background_parameter", 0);
        f7643 = r0.m15194("measurement.lifecycle.app_backgrounded_engagement", false);
        f7644 = r0.m15194("measurement.lifecycle.app_backgrounded_tracking", true);
        f7640 = r0.m15194("measurement.lifecycle.app_in_background_parameter", false);
        f7641 = r0.m15193("measurement.id.lifecycle.app_backgrounded_tracking", 0);
    }
}
