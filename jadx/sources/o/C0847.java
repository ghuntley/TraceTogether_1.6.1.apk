package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C2745;

/* renamed from: o.ǀɈ  reason: contains not printable characters */
public final class C0847 extends C1698 {

    /* renamed from: ı  reason: contains not printable characters */
    protected C0856 f5544;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f5545;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Map<Activity, C0856> f5546 = new ConcurrentHashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    private volatile C0856 f5547;

    /* renamed from: Ι  reason: contains not printable characters */
    private C0856 f5548;

    /* renamed from: ι  reason: contains not printable characters */
    private C0856 f5549;

    public C0847(C2658 r1) {
        super(r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɟ  reason: contains not printable characters */
    public final boolean m6330() {
        return false;
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    public final C0856 m6337() {
        m9662();
        y_();
        return this.f5544;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6334(Activity activity, String str, String str2) {
        if (this.f5547 == null) {
            t_().m11708().m11606("setCurrentScreen cannot be called while no activity active");
        } else if (this.f5546.get(activity) == null) {
            t_().m11708().m11606("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m6322(activity.getClass().getCanonicalName());
            }
            boolean equals = this.f5547.f5574.equals(str2);
            boolean r1 = C2151.m11340(this.f5547.f5572, str);
            if (equals && r1) {
                t_().m11708().m11606("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                t_().m11708().m11603("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                t_().m11713().m11605("Setting current screen to name, class", str == null ? "null" : str, str2);
                C0856 r0 = new C0856(str, str2, m15901().m11378());
                this.f5546.put(activity, r0);
                m6323(activity, r0, true);
            } else {
                t_().m11708().m11603("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    public final C0856 m6329() {
        m15903();
        return this.f5547;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m6323(Activity activity, C0856 r10, boolean z) {
        C0856 r6 = this.f5547 == null ? this.f5548 : this.f5547;
        C0856 r7 = r10.f5574 == null ? new C0856(r10.f5572, m6322(activity.getClass().getCanonicalName()), r10.f5573) : r10;
        this.f5548 = this.f5547;
        this.f5547 = r7;
        u_().m13668((Runnable) new C0823(this, z, w_().m10847(), r6, r7));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6321(C0856 r4, boolean z, long j) {
        m11082().m13594(w_().m10847());
        if (m11084().m9744(r4.f5571, z, j)) {
            r4.f5571 = false;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m6320(C0856 r4, Bundle bundle, boolean z) {
        if (bundle != null && r4 != null && (!bundle.containsKey("_sc") || z)) {
            if (r4.f5572 != null) {
                bundle.putString("_sn", r4.f5572);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", r4.f5574);
            bundle.putLong("_si", r4.f5573);
        } else if (bundle != null && r4 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6340(String str, C0856 r3) {
        y_();
        synchronized (this) {
            if (this.f5545 == null || this.f5545.equals(str) || r3 != null) {
                this.f5545 = str;
                this.f5549 = r3;
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m6322(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C0856 m6318(Activity activity) {
        C2745.C2746.m14555(activity);
        C0856 r0 = this.f5546.get(activity);
        if (r0 != null) {
            return r0;
        }
        C0856 r1 = new C0856((String) null, m6322(activity.getClass().getCanonicalName()), m15901().m11378());
        this.f5546.put(activity, r1);
        return r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6333(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f5546.put(activity, new C0856(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m6339(Activity activity) {
        m6323(activity, m6318(activity), false);
        C2547 r5 = m11082();
        r5.u_().m13668((Runnable) new C0292(r5, r5.w_().m10847()));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m6342(Activity activity) {
        C0856 r5 = m6318(activity);
        this.f5548 = this.f5547;
        this.f5547 = null;
        u_().m13668((Runnable) new C1039(this, r5, w_().m10847()));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m6328(Activity activity, Bundle bundle) {
        C0856 r5;
        if (bundle != null && (r5 = this.f5546.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", r5.f5573);
            bundle2.putString("name", r5.f5572);
            bundle2.putString("referrer_name", r5.f5574);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m6332(Activity activity) {
        this.f5546.remove(activity);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6325() {
        super.m11083();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6344() {
        super.m11091();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m6343() {
        super.m11090();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2547 m6324() {
        return super.m11082();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0305 m6338() {
        return super.m11088();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2100 m6331() {
        return super.m11086();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0848 m6341() {
        return super.m11089();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0847 m6327() {
        return super.m11085();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2158 m6336() {
        return super.m11087();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1729 m6326() {
        return super.m11084();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m6345() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m6335() {
        return super.m15901();
    }

    public final /* bridge */ /* synthetic */ C2570 u_() {
        return super.u_();
    }

    public final /* bridge */ /* synthetic */ C2244 t_() {
        return super.t_();
    }

    public final /* bridge */ /* synthetic */ C2327 s_() {
        return super.s_();
    }

    public final /* bridge */ /* synthetic */ C2518 r_() {
        return super.r_();
    }

    public final /* bridge */ /* synthetic */ C2448 q_() {
        return super.q_();
    }
}
