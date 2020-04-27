package o;

/* renamed from: o.ƨı  reason: contains not printable characters */
public final class C0764 implements C0616 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final C2781<Boolean> f5122;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final C2781<Boolean> f5123;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final C2781<Boolean> f5124;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final C2781<Boolean> f5125;

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m6047() {
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m6046() {
        return f5123.m14685().booleanValue();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m6044() {
        return f5124.m14685().booleanValue();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m6043() {
        return f5125.m14685().booleanValue();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m6045() {
        return f5122.m14685().booleanValue();
    }

    static {
        C2941 r0 = new C2941(C2803.m14714("com.google.android.gms.measurement"));
        f5123 = r0.m15194("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f5124 = r0.m15194("measurement.audience.refresh_event_count_filters_timestamp", false);
        f5125 = r0.m15194("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f5122 = r0.m15194("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
