package com.google.firebase.auth;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseApp;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.C0329;
import o.C0367;
import o.C0408;
import o.C0563;
import o.C0627;
import o.C0631;
import o.C0635;
import o.C0696;
import o.C0718;
import o.C0741;
import o.C0770;
import o.C0858;
import o.C0940;
import o.C1383;
import o.C1494;
import o.C1522;
import o.C1544;
import o.C1590;
import o.C1595;
import o.C1630;
import o.C1663;
import o.C1700;
import o.C1970;
import o.C1979;
import o.C2076;
import o.C2164;
import o.C2219;
import o.C2288;
import o.C2535;
import o.C2550;
import o.C2552;
import o.C2571;
import o.C2650;
import o.C2721;
import o.C2736;
import o.C2740;
import o.C2744;
import o.C2761;
import o.C2768;
import o.C2923;
import o.C2990;
import o.C3032;
import o.C3161;
import o.C3167;
import o.C3190;
import o.C3282auX;

public class FirebaseAuth implements C0367 {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final List<Object> f961;
    /* access modifiers changed from: private */

    /* renamed from: Ɩ  reason: contains not printable characters */
    public List<Object> f962;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final List<C3282auX.Cif> f963;

    /* renamed from: ɨ  reason: contains not printable characters */
    private C0741 f964;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2164 f965;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Object f966;

    /* renamed from: Ι  reason: contains not printable characters */
    public C0696 f967;

    /* renamed from: ι  reason: contains not printable characters */
    public FirebaseApp f968;

    /* renamed from: І  reason: contains not printable characters */
    private final C0635 f969;

    /* renamed from: і  reason: contains not printable characters */
    private String f970;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C2550 f971;

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.getInstance().m1077(FirebaseAuth.class);
    }

    class If implements C0631 {
        If() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1096(C1383 r4, C2164 r5) {
            if (r4 == null) {
                throw new NullPointerException("null reference");
            } else if (r5 != null) {
                r5.m11459(r4);
                FirebaseAuth.this.m1089(r5, r4, true, false);
            } else {
                throw new NullPointerException("null reference");
            }
        }
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$if  reason: invalid class name */
    class Cif implements C0631 {
        Cif() {
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m1098(C1383 r3, C2164 r4) {
            if (r3 == null) {
                throw new NullPointerException("null reference");
            } else if (r4 != null) {
                r4.m11459(r3);
                FirebaseAuth.this.m1089(r4, r3, true, true);
            } else {
                throw new NullPointerException("null reference");
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m1097(Status status) {
            if (status.f536 == 17011 || status.f536 == 17021 || status.f536 == 17005 || status.f536 == 17091) {
                FirebaseAuth firebaseAuth = FirebaseAuth.this;
                firebaseAuth.m1092();
                if (firebaseAuth.f967 != null) {
                    C0408 r3 = firebaseAuth.f967.f4869;
                    r3.f3969.removeCallbacks(r3.f3972);
                }
            }
        }
    }

    @Keep
    public static FirebaseAuth getInstance(FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.m1077(FirebaseAuth.class);
    }

    public FirebaseAuth(FirebaseApp firebaseApp) {
        this(firebaseApp, C3161.m15981(firebaseApp.m1074(), new C3167(new C0858.Aux(firebaseApp.m1075().f8953).f5618, (byte) 0)), new C0635(firebaseApp.m1074(), firebaseApp.m1078()), C0563.m5176());
    }

    private FirebaseAuth(FirebaseApp firebaseApp, C2550 r8, C0635 r9, C0563 r10) {
        C1383 r7;
        this.f966 = new Object();
        if (firebaseApp != null) {
            this.f968 = firebaseApp;
            if (r8 != null) {
                this.f971 = r8;
                this.f969 = r9;
                if (r10 != null) {
                    this.f961 = new CopyOnWriteArrayList();
                    this.f963 = new CopyOnWriteArrayList();
                    this.f962 = new CopyOnWriteArrayList();
                    this.f964 = C0741.m5928();
                    this.f965 = this.f969.m5382();
                    C2164 r72 = this.f965;
                    boolean z = true;
                    if (r72 != null) {
                        C0635 r0 = this.f969;
                        if (r72 != null) {
                            String string = r0.f4621.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{r72.m11461()}), (String) null);
                            if (string != null) {
                                r7 = C1383.m8531(string);
                            } else {
                                r7 = null;
                            }
                            if (r7 != null) {
                                m1089(this.f965, r7, false, false);
                            }
                        } else {
                            throw new NullPointerException("null reference");
                        }
                    }
                    SharedPreferences sharedPreferences = this.f968.m1074().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
                    if (!this.f968.m1076().equals(sharedPreferences.getString("firebaseAppName", ""))) {
                        return;
                    }
                    if (sharedPreferences.contains("verifyAssertionRequest")) {
                        String string2 = sharedPreferences.getString("verifyAssertionRequest", "");
                        C1522 r02 = (C1522) C1544.m9040(string2 == null ? null : Base64.decode(string2, 10), C1522.CREATOR);
                        String string3 = sharedPreferences.getString("operation", "");
                        String string4 = sharedPreferences.getString("tenantId", (String) null);
                        String string5 = sharedPreferences.getString("firebaseUserUid", "");
                        sharedPreferences.getLong("timestamp", 0);
                        if (string4 != null) {
                            if (!TextUtils.isEmpty(string4)) {
                                synchronized (this.f966) {
                                    this.f970 = string4;
                                }
                                r02.m8974(string4);
                            } else {
                                throw new IllegalArgumentException("Given String is empty or null");
                            }
                        }
                        char c = 65535;
                        int hashCode = string3.hashCode();
                        if (hashCode != -1843829902) {
                            if (hashCode != -286760092) {
                                if (hashCode == 1731327805 && string3.equals("com.google.firebase.auth.internal.SIGN_IN")) {
                                    c = 0;
                                }
                            } else if (string3.equals("com.google.firebase.auth.internal.LINK")) {
                                c = 1;
                            }
                        } else if (string3.equals("com.google.firebase.auth.internal.REAUTHENTICATE")) {
                            c = 2;
                        }
                        if (c == 0) {
                            m1094((C1970) C1630.m9394(r02));
                        } else if (c != 1) {
                            if (c == 2 && this.f965.m11461().equals(string5)) {
                                C2164 r82 = this.f965;
                                C1630 r03 = C1630.m9394(r02);
                                FirebaseAuth instance = getInstance(r82.m11470());
                                C1970 r04 = r03.m10703();
                                if (r04 instanceof C2076) {
                                    C2076 r05 = (C2076) r04;
                                    if ("password".equals(r05.m10702())) {
                                        C2550 r92 = instance.f971;
                                        FirebaseApp firebaseApp2 = instance.f968;
                                        String str = r05.f10155;
                                        String str2 = r05.f10156;
                                        String r3 = r82.m11457();
                                        Cif ifVar = new Cif();
                                        C2740 r83 = (C2740) new C2740(str, str2, r3).m16116(firebaseApp2).m16118(r82).m16117(ifVar).m16114((C0631) ifVar);
                                        r92.m12408(r83).m4419(new C2535(r92, r83));
                                    } else {
                                        C1663 r2 = C1663.m9522(r05.f10154);
                                        if ((r2 == null || TextUtils.equals(instance.f970, r2.f8665)) ? false : z) {
                                            new C0770().m6073((Exception) C3032.m15497(new Status(17072)));
                                        } else {
                                            C2550 r93 = instance.f971;
                                            FirebaseApp firebaseApp3 = instance.f968;
                                            Cif ifVar2 = new Cif();
                                            C2768 r84 = (C2768) new C2768(r05).m16116(firebaseApp3).m16118(r82).m16117(ifVar2).m16114((C0631) ifVar2);
                                            r93.m12408(r84).m4419(new C2535(r93, r84));
                                        }
                                    }
                                } else if (r04 instanceof C2288) {
                                    C2550 r94 = instance.f971;
                                    FirebaseApp firebaseApp4 = instance.f968;
                                    String str3 = instance.f970;
                                    Cif ifVar3 = new Cif();
                                    C2761 r85 = (C2761) new C2761((C2288) r04, str3).m16116(firebaseApp4).m16118(r82).m16117(ifVar3).m16114((C0631) ifVar3);
                                    r94.m12408(r85).m4419(new C2535(r94, r85));
                                } else {
                                    C2550 r95 = instance.f971;
                                    FirebaseApp firebaseApp5 = instance.f968;
                                    String r22 = r82.m11457();
                                    Cif ifVar4 = new Cif();
                                    C2744 r86 = (C2744) new C2744(r04, r22).m16116(firebaseApp5).m16118(r82).m16117(ifVar4).m16114((C0631) ifVar4);
                                    r95.m12408(r86).m4419(new C2535(r95, r86));
                                }
                            }
                        } else if (this.f965.m11461().equals(string5)) {
                            C2164 r87 = this.f965;
                            C1630 r102 = C1630.m9394(r02);
                            FirebaseAuth instance2 = getInstance(r87.m11470());
                            C2550 r1 = instance2.f971;
                            FirebaseApp firebaseApp6 = instance2.f968;
                            C1970 r103 = r102.m10703();
                            Cif ifVar5 = new Cif();
                            if (firebaseApp6 == null) {
                                throw new NullPointerException("null reference");
                            } else if (r103 != null) {
                                List<String> r06 = r87.m11458();
                                if (r06 != null && r06.contains(r103.m10704())) {
                                    new C0770().m6073((Exception) C3032.m15497(new Status(17015)));
                                } else if (r103 instanceof C2076) {
                                    C2076 r104 = (C2076) r103;
                                    if (!(true ^ TextUtils.isEmpty(r104.f10154))) {
                                        C2736 r88 = (C2736) new C2736(r104).m16116(firebaseApp6).m16118(r87).m16117(ifVar5).m16114((C0631) ifVar5);
                                        r1.m12408(r88).m4419(new C2535(r1, r88));
                                    } else {
                                        C2650 r89 = (C2650) new C2650(r104).m16116(firebaseApp6).m16118(r87).m16117(ifVar5).m16114((C0631) ifVar5);
                                        r1.m12408(r89).m4419(new C2535(r1, r89));
                                    }
                                } else if (r103 instanceof C2288) {
                                    C2721 r810 = (C2721) new C2721((C2288) r103).m16116(firebaseApp6).m16118(r87).m16117(ifVar5).m16114((C0631) ifVar5);
                                    r1.m12408(r810).m4419(new C2535(r1, r810));
                                } else {
                                    C2571 r811 = (C2571) new C2571(r103).m16116(firebaseApp6).m16118(r87).m16117(ifVar5).m16114((C0631) ifVar5);
                                    r1.m12408(r811).m4419(new C2535(r1, r811));
                                }
                            } else {
                                throw new NullPointerException("null reference");
                            }
                        }
                        C0718.m5837(sharedPreferences);
                    } else if (sharedPreferences.contains("statusCode")) {
                        Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""));
                        sharedPreferences.getLong("timestamp", 0);
                        C0718.m5837(sharedPreferences);
                        new C0770().m6073((Exception) C3032.m15497(status));
                    }
                } else {
                    throw new NullPointerException("null reference");
                }
            } else {
                throw new NullPointerException("null reference");
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C2164 m1090() {
        return this.f965;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m1089(C2164 r5, C1383 r6, boolean z, boolean z2) {
        boolean z3;
        if (r5 == null) {
            throw new NullPointerException("null reference");
        } else if (r6 != null) {
            boolean z4 = true;
            boolean z5 = this.f965 != null && r5.m11461().equals(this.f965.m11461());
            if (z5 || !z2) {
                C2164 r8 = this.f965;
                if (r8 == null) {
                    z3 = true;
                } else {
                    z3 = !z5 || (r8.m11468().m8536().equals(r6.m8536()) ^ true);
                    if (z5) {
                        z4 = false;
                    }
                }
                C2164 r0 = this.f965;
                if (r0 == null) {
                    this.f965 = r5;
                } else {
                    r0.m11462(r5.m11467());
                    if (!r5.m11466()) {
                        this.f965.m11456();
                    }
                    this.f965.m11465(r5.m11463().m9728());
                }
                if (z) {
                    this.f969.m5380(this.f965);
                }
                if (z3) {
                    C2164 r82 = this.f965;
                    if (r82 != null) {
                        r82.m11459(r6);
                    }
                    m1087(this.f965);
                }
                if (z4) {
                    C2164 r83 = this.f965;
                    if (r83 != null) {
                        r83.m11461();
                    }
                    this.f964.execute(new C2990.If(this));
                }
                if (z) {
                    this.f969.m5381(r5, r6);
                }
                m1088().m5743(this.f965.m11468());
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1092() {
        C2164 r0 = this.f965;
        if (r0 != null) {
            C0635 r2 = this.f969;
            if (r0 != null) {
                r2.f4621.edit().remove(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{r0.m11461()})).apply();
                this.f965 = null;
            } else {
                throw new NullPointerException("null reference");
            }
        }
        this.f969.f4621.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        m1087((C2164) null);
        this.f964.execute(new C2990.If(this));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final synchronized void m1084(C0696 r1) {
        this.f967 = r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final synchronized C0696 m1088() {
        if (this.f967 == null) {
            m1084(new C0696(this.f968));
        }
        return this.f967;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final void m1087(C2164 r2) {
        if (r2 != null) {
            r2.m11461();
        }
        new C0940(r2 != null ? r2.m11469() : null);
        this.f964.execute(new C1700(this));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C2552> m1093() {
        return m1095(this.f965, false);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C2552> m1095(C2164 r4, boolean z) {
        if (r4 == null) {
            C1590 r42 = C3032.m15497(new Status(17495));
            C0770 r5 = new C0770();
            r5.m6073((Exception) r42);
            return r5;
        }
        C1383 r0 = r4.m11468();
        if (!r0.m8534() || z) {
            return this.f971.m13604(this.f968, r4, r0.m8532(), new C1595(this));
        }
        C2552 r43 = C0627.m5339(r0.m8536());
        C0770 r52 = new C0770();
        r52.m6079(r43);
        return r52;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C1979> m1094(C1970 r9) {
        if (r9 != null) {
            C1970 r92 = r9.m10703();
            if (r92 instanceof C2076) {
                C2076 r93 = (C2076) r92;
                boolean z = true;
                if (!(!TextUtils.isEmpty(r93.f10154))) {
                    return this.f971.m13605(this.f968, r93.f10155, r93.f10156, this.f970, new If());
                }
                C1663 r0 = C1663.m9522(r93.f10154);
                if (r0 == null || TextUtils.equals(this.f970, r0.f8665)) {
                    z = false;
                }
                if (!z) {
                    return this.f971.m13606(this.f968, r93, new If());
                }
                C1590 r94 = C3032.m15497(new Status(17072));
                C0770 r02 = new C0770();
                r02.m6073((Exception) r94);
                return r02;
            } else if (!(r92 instanceof C2288)) {
                return this.f971.m13609(this.f968, r92, this.f970, new If());
            } else {
                return this.f971.m13608(this.f968, (C2288) r92, this.f970, new If());
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m1091(String str, TimeUnit timeUnit, C2219.C2220 r15, Activity activity, Executor executor, boolean z) {
        TimeUnit timeUnit2 = timeUnit;
        long convert = TimeUnit.SECONDS.convert(60, timeUnit);
        if (convert < 0 || convert > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        C1494 r4 = new C1494(str, convert, z, (String) null, this.f970, (String) null);
        C2550 r2 = this.f971;
        C3190 r1 = new C2923(r4).m16116(this.f968);
        C2219.C2220 r3 = r15;
        C2923 r12 = (C2923) r1.m16120(r15, activity, executor);
        r2.m12408(r12).m4419(new C2535(r2, r12));
    }
}
