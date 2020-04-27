package o;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.C2745;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ѵı  reason: contains not printable characters */
public class C2658 implements C3005 {

    /* renamed from: ı  reason: contains not printable characters */
    private static volatile C2658 f12212;

    /* renamed from: ŀ  reason: contains not printable characters */
    private final C2547 f12213;

    /* renamed from: ł  reason: contains not printable characters */
    private final C0847 f12214;

    /* renamed from: ſ  reason: contains not printable characters */
    private C2100 f12215;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C2244 f12216;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private C0848 f12217;

    /* renamed from: ƚ  reason: contains not printable characters */
    private C2337 f12218;

    /* renamed from: ǀ  reason: contains not printable characters */
    private long f12219;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f12220;

    /* renamed from: ȷ  reason: contains not printable characters */
    private final C2151 f12221;

    /* renamed from: ɍ  reason: contains not printable characters */
    private boolean f12222 = false;

    /* renamed from: ɔ  reason: contains not printable characters */
    private volatile Boolean f12223;

    /* renamed from: ɟ  reason: contains not printable characters */
    private Boolean f12224;

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C2570 f12225;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f12226;

    /* renamed from: ɪ  reason: contains not printable characters */
    private final C2102 f12227;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C2327 f12228;

    /* renamed from: ɺ  reason: contains not printable characters */
    private Boolean f12229;

    /* renamed from: ɼ  reason: contains not printable characters */
    private Boolean f12230;

    /* renamed from: ɾ  reason: contains not printable characters */
    private final C1729 f12231;

    /* renamed from: ɿ  reason: contains not printable characters */
    private final C0637 f12232;

    /* renamed from: ʅ  reason: contains not printable characters */
    private C2442 f12233;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final C0305 f12234;

    /* renamed from: ͻ  reason: contains not printable characters */
    private final long f12235;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f12236;

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f12237;

    /* renamed from: ϲ  reason: contains not printable characters */
    private int f12238;

    /* renamed from: І  reason: contains not printable characters */
    private final C2448 f12239;

    /* renamed from: Ј  reason: contains not printable characters */
    private AtomicInteger f12240 = new AtomicInteger(0);

    /* renamed from: г  reason: contains not printable characters */
    private C2158 f12241;

    /* renamed from: і  reason: contains not printable characters */
    private final boolean f12242;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C2518 f12243;

    /* renamed from: ӏ  reason: contains not printable characters */
    private final C2023 f12244;

    private C2658(C0298 r8) {
        boolean z = false;
        C2745.C2746.m14555(r8);
        this.f12239 = new C2448(r8.f3570);
        C2064.f10131 = this.f12239;
        this.f12237 = r8.f3570;
        this.f12236 = r8.f3571;
        this.f12220 = r8.f3572;
        this.f12226 = r8.f3569;
        this.f12242 = r8.f3575;
        this.f12223 = r8.f3568;
        C2193 r1 = r8.f3574;
        if (!(r1 == null || r1.f10434 == null)) {
            Object obj = r1.f10434.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f12224 = (Boolean) obj;
            }
            Object obj2 = r1.f10434.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f12229 = (Boolean) obj2;
            }
        }
        C2781.m14676(this.f12237);
        this.f12244 = C2022.m10841();
        this.f12235 = this.f12244.m10846();
        this.f12243 = new C2518(this);
        C2327 r12 = new C2327(this);
        r12.m15648();
        this.f12228 = r12;
        C2244 r13 = new C2244(this);
        r13.m15648();
        this.f12216 = r13;
        C2151 r14 = new C2151(this);
        r14.m15648();
        this.f12221 = r14;
        C2102 r15 = new C2102(this);
        r15.m15648();
        this.f12227 = r15;
        this.f12213 = new C2547(this);
        C0847 r16 = new C0847(this);
        r16.m9661();
        this.f12214 = r16;
        C0305 r17 = new C0305(this);
        r17.m9661();
        this.f12234 = r17;
        C1729 r18 = new C1729(this);
        r18.m9661();
        this.f12231 = r18;
        C0637 r19 = new C0637(this);
        r19.m15648();
        this.f12232 = r19;
        C2570 r110 = new C2570(this);
        r110.m15648();
        this.f12225 = r110;
        if (!(r8.f3574 == null || r8.f3574.f10433 == 0)) {
            z = true;
        }
        boolean z2 = !z;
        C2448 r111 = this.f12239;
        if (this.f12237.getApplicationContext() instanceof Application) {
            C0305 r112 = m14100();
            if (r112.m15904().getApplicationContext() instanceof Application) {
                Application application = (Application) r112.m15904().getApplicationContext();
                if (r112.f3598 == null) {
                    r112.f3598 = new C0620(r112, (C3214) null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(r112.f3598);
                    application.registerActivityLifecycleCallbacks(r112.f3598);
                    r112.t_().m11713().m11606("Registered activity lifecycle callback");
                }
            }
        } else {
            t_().A_().m11606("Application context is not an Application");
        }
        this.f12225.m13668((Runnable) new C2633(this, r8));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14079(C0298 r5) {
        String str;
        C2199 r0;
        u_().y_();
        C2337 r02 = new C2337(this);
        r02.m15648();
        this.f12218 = r02;
        C2100 r03 = new C2100(this, r5.f3573);
        r03.m9661();
        this.f12215 = r03;
        C2158 r52 = new C2158(this);
        r52.m9661();
        this.f12241 = r52;
        C0848 r53 = new C0848(this);
        r53.m9661();
        this.f12217 = r53;
        this.f12221.m15647();
        this.f12228.m15647();
        this.f12233 = new C2442(this);
        this.f12215.m9663();
        t_().m11710().m11603("App measurement initialized, version", Long.valueOf(this.f12243.m13369()));
        C2448 r54 = this.f12239;
        t_().m11710().m11606("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        C2448 r55 = this.f12239;
        String r56 = r03.m11201();
        if (TextUtils.isEmpty(this.f12236)) {
            if (m14116().m11410(r56)) {
                r0 = t_().m11710();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                r0 = t_().m11710();
                String valueOf = String.valueOf(r56);
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
            }
            r0.m11606(str);
        }
        t_().m11711().m11606("Debug-level message logging enabled");
        if (this.f12238 != this.f12240.get()) {
            t_().m11714().m11605("Not all components initialized", Integer.valueOf(this.f12238), Integer.valueOf(this.f12240.get()));
        }
        this.f12222 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m14108() {
        u_().y_();
        if (m14107().f10789.m13399() == 0) {
            m14107().f10789.m13398(this.f12244.m10846());
        }
        if (Long.valueOf(m14107().f10793.m13399()).longValue() == 0) {
            t_().m11713().m11603("Persisting first open", Long.valueOf(this.f12235));
            m14107().f10793.m13398(this.f12235);
        }
        if (m14106()) {
            C2448 r0 = this.f12239;
            if (!TextUtils.isEmpty(m14105().m11195()) || !TextUtils.isEmpty(m14105().m11193())) {
                m14116();
                if (C2151.m11358(m14105().m11195(), m14107().m12113(), m14105().m11193(), m14107().m12116())) {
                    t_().m11710().m11606("Rechecking which service to use due to a GMP App Id change");
                    m14107().m12115();
                    m14099().m11434();
                    this.f12217.m6389();
                    this.f12217.m6388();
                    m14107().f10793.m13398(this.f12235);
                    m14107().f10791.m12587((String) null);
                }
                m14107().m12110(m14105().m11195());
                m14107().m12117(m14105().m11193());
            }
            m14100().m4342(m14107().f10791.m12586());
            C2448 r02 = this.f12239;
            if (C0478.m4815() && this.f12243.m13372(C2529.f11520) && !m14116().m11376() && !TextUtils.isEmpty(m14107().f10775.m12586())) {
                t_().A_().m11606("Remote config removed with active feature rollouts");
                m14107().f10775.m12587((String) null);
            }
            if (!TextUtils.isEmpty(m14105().m11195()) || !TextUtils.isEmpty(m14105().m11193())) {
                boolean r03 = m14094();
                if (!m14107().m12111() && !this.f12243.m13378()) {
                    m14107().m12125(!r03);
                }
                if (r03) {
                    m14100().m4358();
                }
                m14096().f8944.m10377();
                m14093().m6382((AtomicReference<String>) new AtomicReference());
            }
        } else if (m14094()) {
            if (!m14116().m11398("android.permission.INTERNET")) {
                t_().m11714().m11606("App is missing INTERNET permission");
            }
            if (!m14116().m11398("android.permission.ACCESS_NETWORK_STATE")) {
                t_().m11714().m11606("App is missing ACCESS_NETWORK_STATE permission");
            }
            C2448 r04 = this.f12239;
            if (!C2059.m10962(this.f12237).m12205() && !this.f12243.m13376()) {
                if (!C2522.m13401(this.f12237)) {
                    t_().m11714().m11606("AppMeasurementReceiver not registered/enabled");
                }
                if (!C2151.m11356(this.f12237, false)) {
                    t_().m11714().m11606("AppMeasurementService not registered/enabled");
                }
            }
            t_().m11714().m11606("Uploading is not possible. App measurement disabled");
        }
        m14107().f10777.m12525(this.f12243.m13372(C2529.f11575));
        m14107().f10771.m12525(this.f12243.m13372(C2529.f11578));
    }

    public final C2448 q_() {
        return this.f12239;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2518 m14090() {
        return this.f12243;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2327 m14107() {
        m14080((C3138) this.f12228);
        return this.f12228;
    }

    public final C2244 t_() {
        m14076((C3067) this.f12216);
        return this.f12216;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C2244 m14083() {
        C2244 r0 = this.f12216;
        if (r0 == null || !r0.m15646()) {
            return null;
        }
        return this.f12216;
    }

    public final C2570 u_() {
        m14076((C3067) this.f12225);
        return this.f12225;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1729 m14096() {
        m14074((C1698) this.f12231);
        return this.f12231;
    }

    /* renamed from: І  reason: contains not printable characters */
    public final C2442 m14112() {
        return this.f12233;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final C2570 m14086() {
        return this.f12225;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C0305 m14100() {
        m14074((C1698) this.f12234);
        return this.f12234;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final C2151 m14116() {
        m14080((C3138) this.f12221);
        return this.f12221;
    }

    /* renamed from: і  reason: contains not printable characters */
    public final C2102 m14115() {
        m14080((C3138) this.f12227);
        return this.f12227;
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final C2158 m14099() {
        m14074((C1698) this.f12241);
        return this.f12241;
    }

    /* renamed from: т  reason: contains not printable characters */
    private final C0637 m14081() {
        m14076((C3067) this.f12232);
        return this.f12232;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final Context m14117() {
        return this.f12237;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final boolean m14092() {
        return TextUtils.isEmpty(this.f12236);
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    public final String m14103() {
        return this.f12236;
    }

    /* renamed from: ł  reason: contains not printable characters */
    public final String m14084() {
        return this.f12220;
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    public final String m14104() {
        return this.f12226;
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public final boolean m14087() {
        return this.f12242;
    }

    public final C2023 w_() {
        return this.f12244;
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public final C0847 m14085() {
        m14074((C1698) this.f12214);
        return this.f12214;
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    public final C0848 m14093() {
        m14074((C1698) this.f12217);
        return this.f12217;
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public final C2337 m14088() {
        m14076((C3067) this.f12218);
        return this.f12218;
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    public final C2100 m14105() {
        m14074((C1698) this.f12215);
        return this.f12215;
    }

    /* renamed from: ɟ  reason: contains not printable characters */
    public final C2547 m14095() {
        C2547 r0 = this.f12213;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2658 m14077(Context context, String str, String str2, Bundle bundle) {
        return m14078(context, new C2193(0, 0, true, (String) null, (String) null, (String) null, bundle));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C2658 m14078(Context context, C2193 r12) {
        if (r12 != null && (r12.f10432 == null || r12.f10435 == null)) {
            r12 = new C2193(r12.f10430, r12.f10433, r12.f10431, r12.f10429, (String) null, (String) null, r12.f10434);
        }
        C2745.C2746.m14555(context);
        C2745.C2746.m14555(context.getApplicationContext());
        if (f12212 == null) {
            synchronized (C2658.class) {
                if (f12212 == null) {
                    f12212 = new C2658(new C0298(context, r12));
                }
            }
        } else if (!(r12 == null || r12.f10434 == null || !r12.f10434.containsKey("dataCollectionDefaultEnabled"))) {
            f12212.m14109(r12.f10434.getBoolean("dataCollectionDefaultEnabled"));
        }
        return f12212;
    }

    /* renamed from: ґ  reason: contains not printable characters */
    private final void m14082() {
        if (!this.f12222) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m14076(C3067 r3) {
        if (r3 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!r3.m15646()) {
            String valueOf = String.valueOf(r3.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m14074(C1698 r3) {
        if (r3 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!r3.m9666()) {
            String valueOf = String.valueOf(r3.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m14080(C3138 r1) {
        if (r1 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m14109(boolean z) {
        this.f12223 = Boolean.valueOf(z);
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    public final boolean m14102() {
        return this.f12223 != null && this.f12223.booleanValue();
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    public final boolean m14094() {
        if (C1035.m7279() && this.f12243.m13372(C2529.f11573)) {
            return m14101() == 0;
        }
        u_().y_();
        m14082();
        if (this.f12243.m13378()) {
            return false;
        }
        Boolean bool = this.f12229;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        Boolean r0 = m14107().m12120();
        if (r0 != null) {
            return r0.booleanValue();
        }
        Boolean r02 = this.f12243.m13382();
        if (r02 != null) {
            return r02.booleanValue();
        }
        Boolean bool2 = this.f12224;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (C0503.m4904()) {
            return false;
        }
        if (!this.f12243.m13372(C2529.f11498) || this.f12223 == null) {
            return true;
        }
        return this.f12223.booleanValue();
    }

    /* renamed from: ɺ  reason: contains not printable characters */
    public final int m14101() {
        u_().y_();
        if (this.f12243.m13378()) {
            return 1;
        }
        Boolean bool = this.f12229;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean r0 = m14107().m12120();
        if (r0 == null) {
            Boolean r02 = this.f12243.m13382();
            if (r02 == null) {
                Boolean bool2 = this.f12224;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (C0503.m4904()) {
                    return 6;
                } else {
                    if (!this.f12243.m13372(C2529.f11498) || this.f12223 == null || this.f12223.booleanValue()) {
                        return 0;
                    }
                    return 7;
                }
            } else if (r02.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (r0.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǀ  reason: contains not printable characters */
    public final long m14089() {
        Long valueOf = Long.valueOf(m14107().f10793.m13399());
        if (valueOf.longValue() == 0) {
            return this.f12235;
        }
        return Math.min(this.f12235, valueOf.longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ϳ  reason: contains not printable characters */
    public final void m14111() {
        C2448 r0 = this.f12239;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ј  reason: contains not printable characters */
    public final void m14113() {
        C2448 r0 = this.f12239;
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14098(C3067 r1) {
        this.f12238++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14097(C1698 r1) {
        this.f12238++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: с  reason: contains not printable characters */
    public final void m14114() {
        this.f12240.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ͻ  reason: contains not printable characters */
    public final boolean m14106() {
        m14082();
        u_().y_();
        Boolean bool = this.f12230;
        if (bool == null || this.f12219 == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f12244.m10847() - this.f12219) > 1000)) {
            this.f12219 = this.f12244.m10847();
            C2448 r0 = this.f12239;
            boolean z = true;
            this.f12230 = Boolean.valueOf(m14116().m11398("android.permission.INTERNET") && m14116().m11398("android.permission.ACCESS_NETWORK_STATE") && (C2059.m10962(this.f12237).m12205() || this.f12243.m13376() || (C2522.m13401(this.f12237) && C2151.m11356(this.f12237, false))));
            if (this.f12230.booleanValue()) {
                if (!m14116().m11399(m14105().m11195(), m14105().m11193(), m14105().m11202()) && TextUtils.isEmpty(m14105().m11193())) {
                    z = false;
                }
                this.f12230 = Boolean.valueOf(z);
            }
        }
        return this.f12230.booleanValue();
    }

    /* renamed from: ϲ  reason: contains not printable characters */
    public final void m14110() {
        u_().y_();
        m14076((C3067) m14081());
        String r0 = m14105().m11201();
        Pair<String, Boolean> r1 = m14107().m12122(r0);
        if (!this.f12243.m13392().booleanValue() || ((Boolean) r1.second).booleanValue() || TextUtils.isEmpty((CharSequence) r1.first)) {
            t_().m11711().m11606("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!m14081().m5389()) {
            t_().A_().m11606("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            C2151 r2 = m14116();
            URL r4 = r2.m11372(m14105().r_().m13369(), r0, (String) r1.first, m14107().f10787.m13399() - 1);
            C0637 r22 = m14081();
            C2632 r7 = new C2632(this);
            r22.y_();
            r22.m15649();
            C2745.C2746.m14555(r4);
            C2745.C2746.m14555(r7);
            r22.u_().m13672((Runnable) new C0796(r22, r0, r4, (byte[]) null, (Map<String, String>) null, r7));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ void m14091(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            t_().A_().m11605("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        m14107().f10773.m12525(true);
        if (bArr.length == 0) {
            t_().m11711().m11606("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                t_().m11711().m11606("Deferred Deep Link is empty.");
                return;
            }
            C2151 r9 = m14116();
            r9.m15903();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = r9.m15904().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                t_().A_().m11605("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f12234.m4344("auto", "_cmp", bundle);
            C2151 r7 = m14116();
            if (!TextUtils.isEmpty(optString) && r7.m11391(optString, optDouble)) {
                r7.m15904().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e) {
            t_().m11714().m11603("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }
}
