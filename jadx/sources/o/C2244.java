package o;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import o.C2745;

/* renamed from: o.Іɛ  reason: contains not printable characters */
public final class C2244 extends C3067 {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public char f10536 = 0;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final C2199 f10537 = new C2199(this, 5, false, false);

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2199 f10538 = new C2199(this, 6, true, false);

    /* renamed from: ȷ  reason: contains not printable characters */
    private final C2199 f10539 = new C2199(this, 3, false, false);

    /* renamed from: ɨ  reason: contains not printable characters */
    private final C2199 f10540 = new C2199(this, 2, false, false);

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2199 f10541 = new C2199(this, 6, false, false);

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C2199 f10542 = new C2199(this, 4, false, false);
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public long f10543 = -1;

    /* renamed from: ι  reason: contains not printable characters */
    private String f10544;

    /* renamed from: І  reason: contains not printable characters */
    private final C2199 f10545 = new C2199(this, 5, true, false);

    /* renamed from: і  reason: contains not printable characters */
    private final C2199 f10546 = new C2199(this, 6, false, true);

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C2199 f10547 = new C2199(this, 5, false, true);

    C2244(C2658 r4) {
        super(r4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11720() {
        return false;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2199 m11714() {
        return this.f10541;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2199 m11718() {
        return this.f10538;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2199 m11712() {
        return this.f10546;
    }

    public final C2199 A_() {
        return this.f10537;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C2199 m11716() {
        return this.f10545;
    }

    /* renamed from: ſ  reason: contains not printable characters */
    public final C2199 m11708() {
        return this.f10547;
    }

    /* renamed from: Ɨ  reason: contains not printable characters */
    public final C2199 m11710() {
        return this.f10542;
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public final C2199 m11711() {
        return this.f10539;
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    public final C2199 m11713() {
        return this.f10540;
    }

    /* renamed from: ı  reason: contains not printable characters */
    protected static Object m11698(String str) {
        if (str == null) {
            return null;
        }
        return new C2245(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11719(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m11721(i)) {
            m11707(i, m11705(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C2745.C2746.m14555(str);
            C2570 r9 = this.f14314.m14086();
            if (r9 == null) {
                m11707(6, "Scheduler not set. Not logging error/warn");
            } else if (!r9.m15646()) {
                m11707(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i < 0) {
                    i = 0;
                }
                r9.m13668((Runnable) new C2262(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m11721(int i) {
        return Log.isLoggable(m11704(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m11707(int i, String str) {
        Log.println(i, m11704(), str);
    }

    /* renamed from: ɺ  reason: contains not printable characters */
    private final String m11704() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f10544 == null) {
                if (this.f14314.m14104() != null) {
                    str2 = this.f14314.m14104();
                } else {
                    r_().q_();
                    str2 = "FA";
                }
                this.f10544 = str2;
            }
            str = this.f10544;
        }
        return str;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static String m11705(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String r4 = m11699(z, obj);
        String r5 = m11699(z, obj2);
        String r2 = m11699(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(r4)) {
            sb.append(str2);
            sb.append(r4);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(r5)) {
            sb.append(str2);
            sb.append(r5);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(r2)) {
            sb.append(str2);
            sb.append(r2);
        }
        return sb.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m11699(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String r8 = m11703(C2658.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && m11703(className).equals(r8)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C2245) {
                return ((C2245) obj).f10548;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String m11703(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: ʅ  reason: contains not printable characters */
    public final String m11717() {
        Pair<String, Long> r0 = s_().f10790.m12535();
        if (r0 == null || r0 == C2327.f10769) {
            return null;
        }
        String valueOf = String.valueOf(r0.second);
        String str = (String) r0.first;
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11709() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11723() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m11722() {
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
    public final /* bridge */ /* synthetic */ Context m11724() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m11715() {
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
