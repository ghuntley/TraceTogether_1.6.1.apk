package o;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.C2274;
import o.C2363;
import o.C2745;

/* renamed from: o.іʄ  reason: contains not printable characters */
public final class C2593 extends C2042 implements C2447 {

    /* renamed from: ı  reason: contains not printable characters */
    private static int f11755 = 65535;

    /* renamed from: ι  reason: contains not printable characters */
    private static int f11756 = 2;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Map<String, Map<String, Boolean>> f11757 = new C0299();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Map<String, Map<String, Boolean>> f11758 = new C0299();

    /* renamed from: Ι  reason: contains not printable characters */
    private final Map<String, Map<String, String>> f11759 = new C0299();

    /* renamed from: І  reason: contains not printable characters */
    private final Map<String, Map<String, Integer>> f11760 = new C0299();

    /* renamed from: і  reason: contains not printable characters */
    private final Map<String, C2363.C2365> f11761 = new C0299();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Map<String, String> f11762 = new C0299();

    C2593(C1924 r1) {
        super(r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m13750() {
        return false;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final void m13743(String str) {
        m10931();
        y_();
        C2745.C2746.m14562(str);
        if (this.f11761.get(str) == null) {
            byte[] r0 = n_().m12053(str);
            if (r0 == null) {
                this.f11759.put(str, (Object) null);
                this.f11758.put(str, (Object) null);
                this.f11757.put(str, (Object) null);
                this.f11761.put(str, (Object) null);
                this.f11762.put(str, (Object) null);
                this.f11760.put(str, (Object) null);
                return;
            }
            C2363.C2365.C2366 r02 = (C2363.C2365.C2366) m13742(str, r0).m6992();
            m13740(str, r02);
            this.f11759.put(str, m13741((C2363.C2365) ((C0987) r02.m7011())));
            this.f11761.put(str, (C2363.C2365) ((C0987) r02.m7011()));
            this.f11762.put(str, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final C2363.C2365 m13758(String str) {
        m10931();
        y_();
        C2745.C2746.m14562(str);
        m13743(str);
        return this.f11761.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final String m13756(String str) {
        y_();
        return this.f11762.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m13745(String str) {
        y_();
        this.f11762.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13749(String str) {
        y_();
        this.f11761.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m13748(String str) {
        y_();
        C2363.C2365 r1 = m13758(str);
        if (r1 == null) {
            return false;
        }
        return r1.m12336();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m13744(String str, String str2) {
        y_();
        m13743(str);
        Map map = this.f11759.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Map<String, String> m13741(C2363.C2365 r3) {
        C0299 r0 = new C0299();
        if (r3 != null) {
            for (C2363.If next : r3.m12333()) {
                r0.put(next.m12321(), next.m12319());
            }
        }
        return r0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m13740(String str, C2363.C2365.C2366 r10) {
        C0299 r0 = new C0299();
        C0299 r1 = new C0299();
        C0299 r2 = new C0299();
        if (r10 != null) {
            for (int i = 0; i < r10.m12340(); i++) {
                C2363.C2367.If ifR = (C2363.C2367.If) r10.m12342(i).m6992();
                if (TextUtils.isEmpty(ifR.m12357())) {
                    t_().A_().m11606("EventConfig contained null event name");
                } else {
                    String r5 = C2983.m15307(ifR.m12357());
                    if (!TextUtils.isEmpty(r5)) {
                        ifR = ifR.m12358(r5);
                        r10.m12341(i, ifR);
                    }
                    r0.put(ifR.m12357(), Boolean.valueOf(ifR.m12356()));
                    r1.put(ifR.m12357(), Boolean.valueOf(ifR.m12354()));
                    if (ifR.m12353()) {
                        if (ifR.m12355() < f11756 || ifR.m12355() > f11755) {
                            t_().A_().m11605("Invalid sampling rate. Event name, sample rate", ifR.m12357(), Integer.valueOf(ifR.m12355()));
                        } else {
                            r2.put(ifR.m12357(), Integer.valueOf(ifR.m12355()));
                        }
                    }
                }
            }
        }
        this.f11758.put(str, r0);
        this.f11757.put(str, r1);
        this.f11760.put(str, r2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m13757(String str, byte[] bArr, String str2) {
        m10931();
        y_();
        C2745.C2746.m14562(str);
        C2363.C2365.C2366 r0 = (C2363.C2365.C2366) m13742(str, bArr).m6992();
        if (r0 == null) {
            return false;
        }
        m13740(str, r0);
        this.f11761.put(str, (C2363.C2365) ((C0987) r0.m7011()));
        this.f11762.put(str, str2);
        this.f11759.put(str, m13741((C2363.C2365) ((C0987) r0.m7011())));
        n_().m12031(str, (List<C2274.Cif>) new ArrayList(r0.m12343()));
        try {
            r0.m12339();
            bArr = ((C2363.C2365) ((C0987) r0.m7011())).m4781();
        } catch (RuntimeException e) {
            t_().A_().m11605("Unable to serialize reduced-size config. Storing full config instead. appId", C2244.m11698(str), e);
        }
        C2309 n_ = n_();
        C2745.C2746.m14562(str);
        n_.y_();
        n_.m10931();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) n_.m12047().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                n_.t_().m11714().m11603("Failed to update remote config (got 0). appId", C2244.m11698(str));
            }
        } catch (SQLiteException e2) {
            n_.t_().m11714().m11605("Error storing remote config. appId", C2244.m11698(str), e2);
        }
        this.f11761.put(str, (C2363.C2365) ((C0987) r0.m7011()));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m13751(String str, String str2) {
        Boolean bool;
        y_();
        m13743(str);
        if (m13761(str) && C2151.m11339(str2)) {
            return true;
        }
        if (m13754(str) && C2151.m11345(str2)) {
            return true;
        }
        Map map = this.f11758.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m13759(String str, String str2) {
        Boolean bool;
        y_();
        m13743(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (C0369.m4560() && r_().m13372(C2529.f11584) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = this.f11757.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final int m13755(String str, String str2) {
        Integer num;
        y_();
        m13743(str);
        Map map = this.f11760.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long m13746(String str) {
        String r0 = m13744(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(r0)) {
            return 0;
        }
        try {
            return Long.parseLong(r0);
        } catch (NumberFormatException e) {
            t_().A_().m11605("Unable to parse timezone offset. appId", C2244.m11698(str), e);
            return 0;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2363.C2365 m13742(String str, byte[] bArr) {
        if (bArr == null) {
            return C2363.C2365.m12322();
        }
        try {
            C2363.C2365 r9 = (C2363.C2365) ((C0987) ((C2363.C2365.C2366) C2090.m11100(C2363.C2365.m12325(), bArr)).m7011());
            C2199 r1 = t_().m11713();
            String str2 = null;
            Long valueOf = r9.m12334() ? Long.valueOf(r9.m12329()) : null;
            if (r9.m12332()) {
                str2 = r9.m12335();
            }
            r1.m11605("Parsed config. version, gmp_app_id", valueOf, str2);
            return r9;
        } catch (C1124 e) {
            t_().A_().m11605("Unable to merge remote config. appId", C2244.m11698(str), e);
            return C2363.C2365.m12322();
        } catch (RuntimeException e2) {
            t_().A_().m11605("Unable to merge remote config. appId", C2244.m11698(str), e2);
            return C2363.C2365.m12322();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public final boolean m13761(String str) {
        return "1".equals(m13744(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean m13754(String str) {
        return "1".equals(m13744(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ C2090 p_() {
        return super.p_();
    }

    public final /* bridge */ /* synthetic */ C2217 o_() {
        return super.o_();
    }

    public final /* bridge */ /* synthetic */ C2309 n_() {
        return super.n_();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2593 m13753() {
        return super.m10945();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13747() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13762() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13760() {
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
    public final /* bridge */ /* synthetic */ Context m13763() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m13752() {
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
