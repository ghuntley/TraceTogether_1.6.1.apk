package o;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o.C2745;

/* renamed from: o.κІ  reason: contains not printable characters */
public final class C2102 extends C3067 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final AtomicReference<String[]> f10197 = new AtomicReference<>();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final AtomicReference<String[]> f10198 = new AtomicReference<>();

    /* renamed from: Ι  reason: contains not printable characters */
    private static final AtomicReference<String[]> f10199 = new AtomicReference<>();

    C2102(C2658 r1) {
        super(r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11223() {
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m11213() {
        q_();
        return this.f14314.m14092() && this.f14314.t_().m11721(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m11216(String str) {
        if (str == null) {
            return null;
        }
        if (!m11213()) {
            return str;
        }
        return m11212(str, C2983.f13760, C2983.f13759, f10197);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final String m11219(String str) {
        if (str == null) {
            return null;
        }
        if (!m11213()) {
            return str;
        }
        return m11212(str, C3209.f14569, C3209.f14568, f10198);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m11222(String str) {
        if (str == null) {
            return null;
        }
        if (!m11213()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m11212(str, C3181.f14447, C3181.f14446, f10199);
        }
        return "experiment_id" + "(" + str + ")";
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m11212(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C2745.C2746.m14555(strArr);
        C2745.C2746.m14555(strArr2);
        C2745.C2746.m14555(atomicReference);
        C2745.C2746.m14563(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C2151.m11340(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m11217(C2441 r3) {
        if (r3 == null) {
            return null;
        }
        if (!m11213()) {
            return r3.toString();
        }
        return "origin=" + r3.f11088 + ",name=" + m11216(r3.f11089) + ",params=" + m11211(r3.f11090);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final String m11220(C2381 r3) {
        if (r3 == null) {
            return null;
        }
        if (!m11213()) {
            return r3.toString();
        }
        return "Event{appId='" + r3.f10915 + "', name='" + m11216(r3.f10912) + "', params=" + m11211(r3.f10913) + "}";
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final String m11211(C2433 r2) {
        if (r2 == null) {
            return null;
        }
        if (!m11213()) {
            return r2.toString();
        }
        return m11221(r2.m12527());
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final String m11221(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!m11213()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(m11219(str2));
            sb.append("=");
            if (!C0369.m4560() || !r_().m13372(C2529.f11565)) {
                sb.append(bundle.get(str2));
            } else {
                Object obj = bundle.get(str2);
                if (obj instanceof Bundle) {
                    str = m11214(new Object[]{obj});
                } else if (obj instanceof Object[]) {
                    str = m11214((Object[]) obj);
                } else if (obj instanceof ArrayList) {
                    str = m11214(((ArrayList) obj).toArray());
                } else {
                    str = String.valueOf(obj);
                }
                sb.append(str);
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final String m11214(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = m11221(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11215() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11225() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11224() {
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
    public final /* bridge */ /* synthetic */ Context m11226() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m11218() {
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
