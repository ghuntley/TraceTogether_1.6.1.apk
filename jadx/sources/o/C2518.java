package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import o.C2745;

/* renamed from: o.ьɹ  reason: contains not printable characters */
public final class C2518 extends C3138 {

    /* renamed from: ı  reason: contains not printable characters */
    private C2447 f11437 = C2330.f10824;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Boolean f11438;

    /* renamed from: ι  reason: contains not printable characters */
    private Boolean f11439;

    C2518(C2658 r1) {
        super(r1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m13371(C2447 r1) {
        this.f11437 = r1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m13381(String str) {
        if (!C3189.m16109() || !m13379((String) null, C2529.f11595)) {
            return 500;
        }
        return m13387(str, C2529.f11581);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m13368(String str) {
        return m13387(str, C2529.f11523);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final int m13391(String str) {
        if (!C3189.m16109() || !m13379((String) null, C2529.f11595)) {
            return 25;
        }
        return m13387(str, C2529.f11580);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m13369() {
        q_();
        return 22048;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m13389() {
        if (this.f11438 == null) {
            synchronized (this) {
                if (this.f11438 == null) {
                    ApplicationInfo applicationInfo = m15904().getApplicationInfo();
                    String r1 = C2197.m11594();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f11438 = Boolean.valueOf(str != null && str.equals(r1));
                    }
                    if (this.f11438 == null) {
                        this.f11438 = Boolean.TRUE;
                        t_().m11714().m11606("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f11438.booleanValue();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final long m13370(String str, C2019<Long> r5) {
        if (str == null) {
            return r5.m10833(null).longValue();
        }
        String r4 = this.f11437.m12570(str, r5.m10832());
        if (TextUtils.isEmpty(r4)) {
            return r5.m10833(null).longValue();
        }
        try {
            return r5.m10833(Long.valueOf(Long.parseLong(r4))).longValue();
        } catch (NumberFormatException unused) {
            return r5.m10833(null).longValue();
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m13387(String str, C2019<Integer> r5) {
        if (str == null) {
            return r5.m10833(null).intValue();
        }
        String r4 = this.f11437.m12570(str, r5.m10832());
        if (TextUtils.isEmpty(r4)) {
            return r5.m10833(null).intValue();
        }
        try {
            return r5.m10833(Integer.valueOf(Integer.parseInt(r4))).intValue();
        } catch (NumberFormatException unused) {
            return r5.m10833(null).intValue();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final double m13390(String str, C2019<Double> r5) {
        if (str == null) {
            return r5.m10833(null).doubleValue();
        }
        String r4 = this.f11437.m12570(str, r5.m10832());
        if (TextUtils.isEmpty(r4)) {
            return r5.m10833(null).doubleValue();
        }
        try {
            return r5.m10833(Double.valueOf(Double.parseDouble(r4))).doubleValue();
        } catch (NumberFormatException unused) {
            return r5.m10833(null).doubleValue();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m13379(String str, C2019<Boolean> r5) {
        if (str == null) {
            return r5.m10833(null).booleanValue();
        }
        String r4 = this.f11437.m12570(str, r5.m10832());
        if (TextUtils.isEmpty(r4)) {
            return r5.m10833(null).booleanValue();
        }
        return r5.m10833(Boolean.valueOf(Boolean.parseBoolean(r4))).booleanValue();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m13384(String str, C2019<Boolean> r2) {
        return m13379(str, r2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m13372(C2019<Boolean> r2) {
        return m13379((String) null, r2);
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    private final Bundle m13367() {
        try {
            if (m15904().getPackageManager() == null) {
                t_().m11714().m11606("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo r1 = C2059.m10962(m15904()).m12203(m15904().getPackageName(), 128);
            if (r1 != null) {
                return r1.metaData;
            }
            t_().m11714().m11606("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            t_().m11714().m11603("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Boolean m13388(String str) {
        C2745.C2746.m14562(str);
        Bundle r0 = m13367();
        if (r0 == null) {
            t_().m11714().m11606("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!r0.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(r0.getBoolean(str));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> m13377(java.lang.String r4) {
        /*
            r3 = this;
            o.C2745.C2746.m14562((java.lang.String) r4)
            android.os.Bundle r0 = r3.m13367()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            o.Іɛ r4 = r3.t_()
            o.ϵı r4 = r4.m11714()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m11606(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.m15904()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            o.Іɛ r0 = r3.t_()
            o.ϵı r0 = r0.m11714()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m11603(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2518.m13377(java.lang.String):java.util.List");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m13378() {
        q_();
        Boolean r0 = m13388("firebase_analytics_collection_deactivated");
        return r0 != null && r0.booleanValue();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Boolean m13382() {
        q_();
        return m13388("firebase_analytics_collection_enabled");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Boolean m13392() {
        m15903();
        Boolean r0 = m13388("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(r0 == null || r0.booleanValue());
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public static long m13366() {
        return C2529.f11513.m10833(null).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m13383(o.C2457 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.m12597()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = o.C1306.m8256()
            if (r1 == 0) goto L_0x002f
            o.ьɹ r1 = r5.r_()
            java.lang.String r2 = r6.m12610()
            o.ιͱ<java.lang.Boolean> r3 = o.C2529.f11605
            boolean r1 = r1.m13379((java.lang.String) r2, (o.C2019<java.lang.Boolean>) r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.m12648()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.m12657()
        L_0x0033:
            o.ιͱ<java.lang.String> r2 = o.C2529.f11563
            r3 = 0
            java.lang.Object r2 = r2.m10833(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            o.ιͱ<java.lang.String> r4 = o.C2529.f11496
            java.lang.Object r3 = r4.m10833(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.m12621()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.m13369()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2518.m13383(o.пı):java.lang.String");
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public static long m13364() {
        return C2529.f11533.m10833(null).longValue();
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    public final String m13380() {
        return m13365("debug.firebase.analytics.app", "");
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public final String m13373() {
        return m13365("debug.deferred.deeplink", "");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String m13365(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, str2});
        } catch (ClassNotFoundException e) {
            t_().m11714().m11603("Could not find SystemProperties class", e);
            return str2;
        } catch (NoSuchMethodException e2) {
            t_().m11714().m11603("Could not find SystemProperties.get() method", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            t_().m11714().m11603("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            t_().m11714().m11603("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m13386(String str) {
        return "1".equals(this.f11437.m12570(str, "gaia_collection_enabled"));
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final boolean m13375(String str) {
        return "1".equals(this.f11437.m12570(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: І  reason: contains not printable characters */
    public final boolean m13393(String str) {
        return m13379(str, C2529.f11585);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String m13395(String str) {
        C2019<String> r0 = C2529.f11541;
        if (str == null) {
            return r0.m10833(null);
        }
        return r0.m10833(this.f11437.m12570(str, r0.m10832()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ƚ  reason: contains not printable characters */
    public final boolean m13376() {
        if (this.f11439 == null) {
            this.f11439 = m13388("app_measurement_lite");
            if (this.f11439 == null) {
                this.f11439 = false;
            }
        }
        if (this.f11439.booleanValue() || !this.f14314.m14087()) {
            return true;
        }
        return false;
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13374() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13396() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13394() {
        super.m15902();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m13397() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m13385() {
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
