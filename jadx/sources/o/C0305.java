package o;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import o.C2745;

/* renamed from: o.ıƶ  reason: contains not printable characters */
public final class C0305 extends C1698 {

    /* renamed from: ı  reason: contains not printable characters */
    protected boolean f3595 = true;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3173 f3596;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f3597;

    /* renamed from: Ι  reason: contains not printable characters */
    public C0620 f3598;

    /* renamed from: ι  reason: contains not printable characters */
    private final Set<C3211> f3599 = new CopyOnWriteArraySet();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final AtomicReference<String> f3600 = new AtomicReference<>();

    protected C0305(C2658 r1) {
        super(r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɟ  reason: contains not printable characters */
    public final boolean m4329() {
        return false;
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    public final void m4337() {
        if (m15904().getApplicationContext() instanceof Application) {
            ((Application) m15904().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f3598);
        }
    }

    /* renamed from: ǀ  reason: contains not printable characters */
    public final Boolean m4319() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) u_().m13666(atomicReference, 15000, "boolean test flag value", new C3214(this, atomicReference));
    }

    /* renamed from: ɔ  reason: contains not printable characters */
    public final String m4328() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) u_().m13666(atomicReference, 15000, "String test flag value", new C0424(this, atomicReference));
    }

    /* renamed from: ϲ  reason: contains not printable characters */
    public final Long m4355() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) u_().m13666(atomicReference, 15000, "long test flag value", new C0456(this, atomicReference));
    }

    /* renamed from: Ј  reason: contains not printable characters */
    public final Integer m4357() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) u_().m13666(atomicReference, 15000, "int test flag value", new C0572(this, atomicReference));
    }

    /* renamed from: ϳ  reason: contains not printable characters */
    public final Double m4356() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) u_().m13666(atomicReference, 15000, "double test flag value", new C0619(this, atomicReference));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4354(boolean z) {
        m9662();
        m15903();
        u_().m13668((Runnable) new C0603(this, z));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4346(boolean z) {
        m9662();
        m15903();
        u_().m13668((Runnable) new C0573(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4306(boolean z) {
        y_();
        m15903();
        m9662();
        t_().m11711().m11603("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        s_().m12118(z);
        m4312();
    }

    /* access modifiers changed from: private */
    /* renamed from: ј  reason: contains not printable characters */
    public final void m4312() {
        if (r_().m13372(C2529.f11560)) {
            y_();
            String r0 = s_().f10781.m12586();
            if (r0 != null) {
                if ("unset".equals(r0)) {
                    m4325("app", "_npa", (Object) null, w_().m10846());
                } else {
                    m4325("app", "_npa", (Object) Long.valueOf("true".equals(r0) ? 1 : 0), w_().m10846());
                }
            }
        }
        if (!this.f14314.m14094() || !this.f3595) {
            t_().m11711().m11606("Updating Scion state (FE)");
            m11089().m6370();
            return;
        }
        t_().m11711().m11606("Recording app launch after enabling measurement for the first time (FE)");
        m4358();
        if (C1174.m7692() && r_().m13372(C2529.f11531)) {
            m11084().f8944.m10377();
        }
        if (C0765.m6049() && r_().m13372(C2529.f11572)) {
            if (!(this.f14314.m14112().f11092.m14107().f10782.m13399() > 0)) {
                this.f14314.m14112().m12556();
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4340(long j) {
        m15903();
        u_().m13668((Runnable) new C0761(this, j));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4349(long j) {
        m15903();
        u_().m13668((Runnable) new C0774(this, j));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4324(String str, String str2, Bundle bundle, boolean z) {
        m4351(str, str2, bundle, false, true, w_().m10846());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4344(String str, String str2, Bundle bundle) {
        m4351(str, str2, bundle, true, true, w_().m10846());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m4350(String str, String str2, Bundle bundle) {
        m15903();
        y_();
        m4316(str, str2, w_().m10846(), bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m4316(String str, String str2, long j, Bundle bundle) {
        m15903();
        y_();
        m4343(str, str2, j, bundle, true, this.f3596 == null || C2151.m11339(str2), false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4343(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String str4;
        String str5;
        String str6;
        ArrayList arrayList;
        String str7;
        String str8;
        String str9;
        C0856 r22;
        int i;
        int i2;
        long j2;
        ArrayList arrayList2;
        Bundle bundle2;
        String str10;
        boolean z4;
        Class<?> cls;
        List<String> r0;
        String str11 = str;
        String str12 = str2;
        long j3 = j;
        Bundle bundle3 = bundle;
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(bundle);
        y_();
        m9662();
        if (!this.f14314.m14094()) {
            t_().m11711().m11606("Event not sent since app measurement is disabled");
        } else if (!r_().m13372(C2529.f11499) || (r0 = m11086().m11206()) == null || r0.contains(str12)) {
            int i3 = 0;
            if (!this.f3597) {
                this.f3597 = true;
                try {
                    if (!this.f14314.m14087()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, m15904().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{m15904()});
                    } catch (Exception e) {
                        t_().A_().m11603("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException unused) {
                    t_().m11710().m11606("Tag Manager is not found and thus will not be used");
                }
            }
            if (r_().m13372(C2529.f11551) && "_cmp".equals(str12) && bundle3.containsKey("gclid")) {
                m4325("auto", "_lgclid", (Object) bundle3.getString("gclid"), w_().m10846());
            }
            if (z3) {
                q_();
                if (!"_iap".equals(str12)) {
                    C2151 r1 = this.f14314.m14116();
                    int i4 = 2;
                    if (r1.m11386("event", str12)) {
                        if (!r1.m11407("event", C2983.f13759, str12)) {
                            i4 = 13;
                        } else if (r1.m11374("event", 40, str12)) {
                            i4 = 0;
                        }
                    }
                    if (i4 != 0) {
                        t_().m11712().m11603("Invalid public event name. Event will not be logged (FE)", v_().m11216(str12));
                        this.f14314.m14116();
                        this.f14314.m14116().m11403(i4, "_ev", C2151.m11338(str12, 40, true), str12 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            q_();
            C0856 r12 = m11085().m6337();
            if (r12 != null && !bundle3.containsKey("_sc")) {
                r12.f5571 = true;
            }
            C0847.m6320(r12, bundle3, z && z3);
            boolean equals = "am".equals(str11);
            boolean r3 = C2151.m11339(str2);
            if (z && this.f3596 != null && !r3 && !equals) {
                t_().m11711().m11605("Passing event to registered event handler (FE)", v_().m11216(str12), v_().m11221(bundle3));
                this.f3596.m16026(str, str2, bundle, j);
            } else if (this.f14314.m14106()) {
                int r32 = m15901().m11387(str12);
                if (r32 != 0) {
                    t_().m11712().m11603("Invalid event name. Event will not be logged (FE)", v_().m11216(str12));
                    m15901();
                    String r02 = C2151.m11338(str12, 40, true);
                    if (str12 != null) {
                        i3 = str2.length();
                    }
                    this.f14314.m14116().m11382(str3, r32, "_ev", r02, i3);
                    return;
                }
                List r18 = C2745.m14539((T[]) new String[]{"_o", "_sn", "_sc", "_si"});
                String str13 = str12;
                Bundle r15 = m15901().m11395(str3, str2, bundle, r18, z3, true);
                C0856 r11 = (r15 == null || !r15.containsKey("_sc") || !r15.containsKey("_si")) ? null : new C0856(r15.getString("_sn"), r15.getString("_sc"), Long.valueOf(r15.getLong("_si")).longValue());
                C0856 r03 = r11 == null ? r12 : r11;
                String str14 = "_ae";
                if (r_().m13372(C2529.f11516)) {
                    q_();
                    if (m11085().m6337() != null && str14.equals(str13)) {
                        long r13 = m11084().f8945.m10230();
                        if (r13 > 0) {
                            m15901().m11380(r15, r13);
                        }
                    }
                }
                if (C0478.m4815() && r_().m13372(C2529.f11520)) {
                    if (!"auto".equals(str11) && "_ssr".equals(str13)) {
                        C2151 r14 = m15901();
                        String string = r15.getString("_ffr");
                        if (C2745.C2746.m14560(string)) {
                            str10 = null;
                        } else {
                            str10 = string.trim();
                        }
                        if (C2151.m11340(str10, r14.s_().f10775.m12586())) {
                            r14.t_().m11711().m11606("Not logging duplicate session_start_with_rollout event");
                            z4 = false;
                        } else {
                            r14.s_().f10775.m12587(str10);
                            z4 = true;
                        }
                        if (!z4) {
                            return;
                        }
                    } else if (str14.equals(str13)) {
                        String r16 = m15901().s_().f10775.m12586();
                        if (!TextUtils.isEmpty(r16)) {
                            r15.putString("_ffr", r16);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(r15);
                long nextLong = m15901().m11390().nextLong();
                if (!r_().m13372(C2529.f11562) || s_().f10772.m13399() <= 0 || !s_().m12123(j) || !s_().f10788.m12524()) {
                    str4 = "_o";
                } else {
                    t_().m11713().m11606("Current session is expired, remove the session number, ID, and engagement time");
                    if (r_().m13372(C2529.f11555)) {
                        str4 = "_o";
                        m4325("auto", "_sid", (Object) null, w_().m10846());
                    } else {
                        str4 = "_o";
                    }
                    if (r_().m13372(C2529.f11554)) {
                        m4325("auto", "_sno", (Object) null, w_().m10846());
                    }
                    if (C1723.m9720() && r_().m13372(C2529.f11501)) {
                        m4325("auto", "_se", (Object) null, w_().m10846());
                    }
                }
                if (!r_().m13372(C2529.f11608) || r15.getLong("extend_session", 0) != 1) {
                    long j4 = j;
                    str5 = str13;
                } else {
                    t_().m11713().m11606("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    str5 = str13;
                    this.f14314.m14096().f8944.m10376(j, true);
                }
                String[] strArr = (String[]) r15.keySet().toArray(new String[r15.size()]);
                Arrays.sort(strArr);
                if (!C0369.m4560() || !r_().m13372(C2529.f11587) || !r_().m13372(C2529.f11577)) {
                    int length = strArr.length;
                    int i5 = 0;
                    int i6 = 0;
                    while (i6 < length) {
                        String str15 = strArr[i6];
                        Object obj = r15.get(str15);
                        m15901();
                        String[] strArr2 = strArr;
                        Bundle[] r17 = C2151.m11348(obj);
                        if (r17 != null) {
                            i2 = length;
                            r15.putInt(str15, r17.length);
                            int i7 = 0;
                            while (i7 < r17.length) {
                                Bundle bundle4 = r17[i7];
                                C0847.m6320(r03, bundle4, true);
                                int i8 = i5;
                                long j5 = nextLong;
                                Bundle bundle5 = bundle4;
                                ArrayList arrayList4 = arrayList3;
                                Bundle r9 = m15901().m11395(str3, "_ep", bundle5, r18, z3, false);
                                r9.putString("_en", str5);
                                r9.putLong("_eid", j5);
                                r9.putString("_gn", str15);
                                r9.putInt("_ll", r17.length);
                                r9.putInt("_i", i7);
                                arrayList4.add(r9);
                                i7++;
                                str14 = str14;
                                r15 = r15;
                                arrayList3 = arrayList4;
                                i5 = i8;
                                nextLong = j5;
                                i6 = i6;
                                r03 = r03;
                                String str16 = str;
                            }
                            r22 = r03;
                            i = i6;
                            j2 = nextLong;
                            arrayList2 = arrayList3;
                            str9 = str14;
                            bundle2 = r15;
                            i5 += r17.length;
                        } else {
                            r22 = r03;
                            i2 = length;
                            int i9 = i5;
                            i = i6;
                            j2 = nextLong;
                            arrayList2 = arrayList3;
                            str9 = str14;
                            bundle2 = r15;
                        }
                        i6 = i + 1;
                        strArr = strArr2;
                        str14 = str9;
                        r15 = bundle2;
                        arrayList3 = arrayList2;
                        nextLong = j2;
                        length = i2;
                        r03 = r22;
                        String str17 = str;
                        long j6 = j;
                    }
                    int i10 = i5;
                    long j7 = nextLong;
                    arrayList = arrayList3;
                    str6 = str14;
                    Bundle bundle6 = r15;
                    if (i10 != 0) {
                        bundle6.putLong("_eid", j7);
                        bundle6.putInt("_epc", i10);
                    }
                } else {
                    for (String str18 : strArr) {
                        m15901();
                        Bundle[] r10 = C2151.m11348(r15.get(str18));
                        if (r10 != null) {
                            r15.putParcelableArray(str18, r10);
                        }
                    }
                    arrayList = arrayList3;
                    str6 = str14;
                }
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    Bundle bundle7 = (Bundle) arrayList.get(i11);
                    if (i11 != 0) {
                        str8 = "_ep";
                        str7 = str;
                    } else {
                        str7 = str;
                        str8 = str5;
                    }
                    String str19 = str4;
                    bundle7.putString(str19, str7);
                    if (z2) {
                        bundle7 = m15901().m11389(bundle7);
                    }
                    Bundle bundle8 = bundle7;
                    if (!C1035.m7279() || !r_().m13372(C2529.f11573)) {
                        t_().m11711().m11605("Logging event (FE)", v_().m11216(str5), v_().m11221(bundle8));
                    }
                    ArrayList arrayList5 = arrayList;
                    String str20 = str5;
                    m11089().m6361(new C2441(str8, new C2433(bundle8), str, j), str3);
                    if (!equals) {
                        for (C3211 onEvent : this.f3599) {
                            onEvent.onEvent(str, str2, new Bundle(bundle8), j);
                        }
                    }
                    i11++;
                    str4 = str19;
                    arrayList = arrayList5;
                    str5 = str20;
                }
                String str21 = str5;
                q_();
                if (m11085().m6337() != null && str6.equals(str21)) {
                    m11084().m9744(true, true, w_().m10847());
                }
            }
        } else {
            t_().m11711().m11605("Dropping non-safelisted event. event name, origin", str12, str11);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4351(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m15903();
        m4300(str == null ? "app" : str, str2, j, bundle == null ? new Bundle() : bundle, z2, !z2 || this.f3596 == null || C2151.m11339(str2), !z, (String) null);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m4300(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        u_().m13668((Runnable) new C0327(this, str, str2, j, C2151.m11342(bundle), z, z2, z3, str3));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4345(String str, String str2, Object obj, boolean z) {
        m4352(str, str2, obj, z, w_().m10846());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4352(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = m15901().m11400(str2);
        } else {
            C2151 r10 = m15901();
            if (r10.m11386("user property", str2)) {
                if (!r10.m11407("user property", C3181.f14446, str2)) {
                    i = 15;
                } else if (r10.m11374("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            m15901();
            String r9 = C2151.m11338(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f14314.m14116().m11403(i, "_ev", r9, i2);
        } else if (obj != null) {
            int r7 = m15901().m11388(str2, obj);
            if (r7 != 0) {
                m15901();
                String r8 = C2151.m11338(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f14314.m14116().m11403(r7, "_ev", r8, i2);
                return;
            }
            Object r5 = m15901().m11371(str2, obj);
            if (r5 != null) {
                m4301(str3, str2, j, r5);
            }
        } else {
            m4301(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m4301(String str, String str2, long j, Object obj) {
        u_().m13668((Runnable) new C3213(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m4325(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            o.C2745.C2746.m14562((java.lang.String) r9)
            o.C2745.C2746.m14562((java.lang.String) r10)
            r8.y_()
            r8.m15903()
            r8.m9662()
            o.ьɹ r0 = r8.r_()
            o.ιͱ<java.lang.Boolean> r1 = o.C2529.f11560
            boolean r0 = r0.m13372((o.C2019<java.lang.Boolean>) r1)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0072
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0062
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0062
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0044
            r4 = r2
            goto L_0x0046
        L_0x0044:
            r4 = 0
        L_0x0046:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            o.Іւ r0 = r8.s_()
            o.нı r0 = r0.f10781
            r4 = r10
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x005d
            java.lang.String r11 = "true"
        L_0x005d:
            r0.m12587(r11)
            r6 = r10
            goto L_0x0070
        L_0x0062:
            if (r11 != 0) goto L_0x0072
            o.Іւ r10 = r8.s_()
            o.нı r10 = r10.f10781
            java.lang.String r0 = "unset"
            r10.m12587(r0)
            r6 = r11
        L_0x0070:
            r3 = r1
            goto L_0x0074
        L_0x0072:
            r3 = r10
            r6 = r11
        L_0x0074:
            o.ѵı r10 = r8.f14314
            boolean r10 = r10.m14094()
            if (r10 != 0) goto L_0x008a
            o.Іɛ r9 = r8.t_()
            o.ϵı r9 = r9.m11713()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m11606(r10)
            return
        L_0x008a:
            o.ѵı r10 = r8.f14314
            boolean r10 = r10.m14106()
            if (r10 != 0) goto L_0x0093
            return
        L_0x0093:
            o.πı r10 = new o.πı
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            o.ǀɉ r9 = r8.m11089()
            r9.m6369((o.C2113) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0305.m4325(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<C2113> m4313(boolean z) {
        m15903();
        m9662();
        t_().m11713().m11606("Getting user properties (FE)");
        if (u_().m13670()) {
            t_().m11714().m11606("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (C2448.m12571()) {
            t_().m11714().m11606("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f14314.u_().m13666(atomicReference, 5000, "get user properties", new C0325(this, atomicReference, z));
            List<C2113> list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            t_().m11714().m11603("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
    }

    /* renamed from: ͻ  reason: contains not printable characters */
    public final String m4338() {
        m15903();
        return this.f3600.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4342(String str) {
        this.f3600.set(str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4332(long j) {
        m4342((String) null);
        u_().m13668((Runnable) new C0324(this, j));
    }

    /* renamed from: с  reason: contains not printable characters */
    public final void m4358() {
        y_();
        m15903();
        m9662();
        if (this.f14314.m14106()) {
            if (r_().m13372(C2529.f11571)) {
                C2518 r_ = r_();
                r_.q_();
                Boolean r0 = r_.m13388("google_analytics_deferred_deep_link_enabled");
                if (r0 != null && r0.booleanValue()) {
                    t_().m11711().m11606("Deferred Deep Link feature enabled.");
                    u_().m13668((Runnable) new C0306(this));
                }
            }
            m11089().m6390();
            this.f3595 = false;
            String r02 = s_().m12112();
            if (!TextUtils.isEmpty(r02)) {
                x_().m15649();
                if (!r02.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", r02);
                    m4344("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4334(C3173 r3) {
        C3173 r0;
        y_();
        m15903();
        m9662();
        if (!(r3 == null || r3 == (r0 = this.f3596))) {
            C2745.C2746.m14558(r0 == null, "EventInterceptor already set.");
        }
        this.f3596 = r3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4353(C3211 r2) {
        m15903();
        m9662();
        C2745.C2746.m14555(r2);
        if (!this.f3599.add(r2)) {
            t_().A_().m11606("OnEventListener already registered");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4327(C3211 r2) {
        m15903();
        m9662();
        C2745.C2746.m14555(r2);
        if (!this.f3599.remove(r2)) {
            t_().A_().m11606("OnEventListener had not been registered");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m4333(Bundle bundle) {
        m4341(bundle, w_().m10846());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4341(Bundle bundle, long j) {
        C2745.C2746.m14555(bundle);
        m15903();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            t_().A_().m11606("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        m4309(bundle2, j);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4322(Bundle bundle) {
        C2745.C2746.m14555(bundle);
        C2745.C2746.m14562(bundle.getString("app_id"));
        m15900();
        m4309(new Bundle(bundle), w_().m10846());
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m4309(Bundle bundle, long j) {
        C2745.C2746.m14555(bundle);
        C3146.m15933(bundle, "app_id", String.class, null);
        C3146.m15933(bundle, "origin", String.class, null);
        C3146.m15933(bundle, "name", String.class, null);
        C3146.m15933(bundle, "value", Object.class, null);
        C3146.m15933(bundle, "trigger_event_name", String.class, null);
        C3146.m15933(bundle, "trigger_timeout", Long.class, 0L);
        C3146.m15933(bundle, "timed_out_event_name", String.class, null);
        C3146.m15933(bundle, "timed_out_event_params", Bundle.class, null);
        C3146.m15933(bundle, "triggered_event_name", String.class, null);
        C3146.m15933(bundle, "triggered_event_params", Bundle.class, null);
        C3146.m15933(bundle, "time_to_live", Long.class, 0L);
        C3146.m15933(bundle, "expired_event_name", String.class, null);
        C3146.m15933(bundle, "expired_event_params", Bundle.class, null);
        C2745.C2746.m14562(bundle.getString("name"));
        C2745.C2746.m14562(bundle.getString("origin"));
        C2745.C2746.m14555(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (m15901().m11400(string) != 0) {
            t_().m11714().m11603("Invalid conditional user property name", v_().m11222(string));
        } else if (m15901().m11388(string, obj) != 0) {
            t_().m11714().m11605("Invalid conditional user property value", v_().m11222(string), obj);
        } else {
            Object r0 = m15901().m11371(string, obj);
            if (r0 == null) {
                t_().m11714().m11605("Unable to normalize conditional user property value", v_().m11222(string), obj);
                return;
            }
            C3146.m15932(bundle, r0);
            long j2 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong("time_to_live");
                if (j3 > 15552000000L || j3 < 1) {
                    t_().m11714().m11605("Invalid conditional user property time to live", v_().m11222(string), Long.valueOf(j3));
                } else {
                    u_().m13668((Runnable) new C0443(this, bundle));
                }
            } else {
                t_().m11714().m11605("Invalid conditional user property timeout", v_().m11222(string), Long.valueOf(j2));
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4323(String str, String str2, Bundle bundle) {
        m15903();
        m4310((String) null, str, str2, bundle);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4326(String str, String str2, String str3, Bundle bundle) {
        C2745.C2746.m14562(str);
        m15900();
        m4310(str, str2, str3, bundle);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m4310(String str, String str2, String str3, Bundle bundle) {
        long r0 = w_().m10846();
        C2745.C2746.m14562(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", r0);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        u_().m13668((Runnable) new C0393(this, bundle2));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m4308(Bundle bundle) {
        Bundle bundle2 = bundle;
        y_();
        m9662();
        C2745.C2746.m14555(bundle);
        C2745.C2746.m14562(bundle2.getString("name"));
        C2745.C2746.m14562(bundle2.getString("origin"));
        C2745.C2746.m14555(bundle2.get("value"));
        if (!this.f14314.m14094()) {
            t_().m11713().m11606("Conditional property not set since app measurement is disabled");
            return;
        }
        C2113 r6 = new C2113(bundle2.getString("name"), bundle2.getLong("triggered_timestamp"), bundle2.get("value"), bundle2.getString("origin"));
        try {
            C2441 r17 = m15901().m11402(bundle2.getString("app_id"), bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), bundle2.getString("origin"), 0, true, false);
            m11089().m6362(new C2527(bundle2.getString("app_id"), bundle2.getString("origin"), r6, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), m15901().m11402(bundle2.getString("app_id"), bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), bundle2.getString("origin"), 0, true, false), bundle2.getLong("trigger_timeout"), r17, bundle2.getLong("time_to_live"), m15901().m11402(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m4299(Bundle bundle) {
        Bundle bundle2 = bundle;
        y_();
        m9662();
        C2745.C2746.m14555(bundle);
        C2745.C2746.m14562(bundle2.getString("name"));
        if (!this.f14314.m14094()) {
            t_().m11713().m11606("Conditional property not cleared since app measurement is disabled");
            return;
        }
        C2113 r6 = new C2113(bundle2.getString("name"), 0, (Object) null, (String) null);
        try {
            C2441 r20 = m15901().m11402(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), bundle2.getString("origin"), bundle2.getLong("creation_timestamp"), true, false);
            C2113 r9 = r6;
            m11089().m6362(new C2527(bundle2.getString("app_id"), bundle2.getString("origin"), r9, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), (C2441) null, bundle2.getLong("trigger_timeout"), (C2441) null, bundle2.getLong("time_to_live"), r20));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final ArrayList<Bundle> m4320(String str, String str2) {
        m15903();
        return m4304((String) null, str, str2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final ArrayList<Bundle> m4347(String str, String str2, String str3) {
        C2745.C2746.m14562(str);
        m15900();
        return m4304(str, str2, str3);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ArrayList<Bundle> m4304(String str, String str2, String str3) {
        if (u_().m13670()) {
            t_().m11714().m11606("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (C2448.m12571()) {
            t_().m11714().m11606("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f14314.u_().m13666(atomicReference, 5000, "get conditional user properties", new C0569(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return C2151.m11360((List<C2527>) list);
            }
            t_().m11714().m11603("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Map<String, Object> m4330(String str, String str2, boolean z) {
        m15903();
        return m4307((String) null, str, str2, z);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Map<String, Object> m4314(String str, String str2, String str3, boolean z) {
        C2745.C2746.m14562(str);
        m15900();
        return m4307(str, str2, str3, z);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final Map<String, Object> m4307(String str, String str2, String str3, boolean z) {
        if (u_().m13670()) {
            t_().m11714().m11606("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C2448.m12571()) {
            t_().m11714().m11606("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.f14314.u_().m13666(atomicReference, 5000, "get user properties", new C0614(this, atomicReference, str, str2, str3, z));
            List<C2113> list = (List) atomicReference.get();
            if (list == null) {
                t_().m11714().m11603("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            C0299 r1 = new C0299(list.size());
            for (C2113 r2 : list) {
                r1.put(r2.f10236, r2.m11268());
            }
            return r1;
        }
    }

    /* renamed from: х  reason: contains not printable characters */
    public final String m4360() {
        C0856 r0 = this.f14314.m14085().m6329();
        if (r0 != null) {
            return r0.f5572;
        }
        return null;
    }

    /* renamed from: ґ  reason: contains not printable characters */
    public final String m4362() {
        C0856 r0 = this.f14314.m14085().m6329();
        if (r0 != null) {
            return r0.f5574;
        }
        return null;
    }

    /* renamed from: т  reason: contains not printable characters */
    public final String m4359() {
        if (this.f14314.m14103() != null) {
            return this.f14314.m14103();
        }
        try {
            return C0503.m4902();
        } catch (IllegalStateException e) {
            this.f14314.t_().m11714().m11603("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m4317() {
        super.m11083();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m4363() {
        super.m11091();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m4361() {
        super.m11090();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2547 m4315() {
        return super.m11082();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0305 m4339() {
        return super.m11088();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2100 m4331() {
        return super.m11086();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0848 m4348() {
        return super.m11089();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0847 m4321() {
        return super.m11085();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2158 m4336() {
        return super.m11087();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1729 m4318() {
        return super.m11084();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m4364() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m4335() {
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
