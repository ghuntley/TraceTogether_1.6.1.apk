package o;

import android.os.Binder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import o.C2745;

/* renamed from: o.Ӏƭ  reason: contains not printable characters */
public final class C2767 extends C2052 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private Boolean f13106;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1924 f13107;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f13108;

    public C2767(C1924 r2) {
        this(r2, (String) null);
    }

    private C2767(C1924 r1, String str) {
        C2745.C2746.m14555(r1);
        this.f13107 = r1;
        this.f13108 = null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14648(C2270 r2) {
        m14631(r2, false);
        m14634((Runnable) new C2834(this, r2));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m14649(C2441 r2, C2270 r3) {
        C2745.C2746.m14555(r2);
        m14631(r3, false);
        m14634((Runnable) new C2893(this, r2, r3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final C2441 m14637(C2441 r9, C2270 r10) {
        boolean z = false;
        if (!(!"_cmp".equals(r9.f11089) || r9.f11090 == null || r9.f11090.m12531() == 0)) {
            String r0 = r9.f11090.m12528("_cis");
            if (!TextUtils.isEmpty(r0) && (("referrer broadcast".equals(r0) || "referrer API".equals(r0)) && this.f13107.m10497().m13384(r10.f10610, C2529.f11556))) {
                z = true;
            }
        }
        if (!z) {
            return r9;
        }
        this.f13107.t_().m11710().m11603("Event has been filtered ", r9.toString());
        return new C2441("_cmpx", r9.f11090, r9.f11088, r9.f11091);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m14639(C2441 r1, String str, String str2) {
        C2745.C2746.m14555(r1);
        C2745.C2746.m14562(str);
        m14633(str, true);
        m14634((Runnable) new C2982(this, r1, str));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final byte[] m14638(C2441 r10, String str) {
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(r10);
        m14633(str, true);
        this.f13107.t_().m11711().m11603("Log and bundle. event", this.f13107.m10522().m11216(r10.f11089));
        long r0 = this.f13107.w_().m10848() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f13107.u_().m13669(new C2858(this, r10, str)).get();
            if (bArr == null) {
                this.f13107.t_().m11714().m11603("Log and bundle returned null. appId", C2244.m11698(str));
                bArr = new byte[0];
            }
            this.f13107.t_().m11711().m11604("Log and bundle processed. event, size, time_ms", this.f13107.m10522().m11216(r10.f11089), Integer.valueOf(bArr.length), Long.valueOf((this.f13107.w_().m10848() / 1000000) - r0));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f13107.t_().m11714().m11604("Failed to log and bundle. appId, event, error", C2244.m11698(str), this.f13107.m10522().m11216(r10.f11089), e);
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14644(C2113 r2, C2270 r3) {
        C2745.C2746.m14555(r2);
        m14631(r3, false);
        m14634((Runnable) new C2952(this, r2, r3));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2113> m14642(C2270 r5, boolean z) {
        m14631(r5, false);
        try {
            List<C2152> list = (List) this.f13107.u_().m13667(new C2955(this, r5)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2152 r2 : list) {
                if (z || !C2151.m11339(r2.f10313)) {
                    arrayList.add(new C2113(r2));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (!C1140.m7582() || !this.f13107.m10497().m13384(r5.f10610, C2529.f11567)) {
                this.f13107.t_().m11714().m11605("Failed to get user attributes. appId", C2244.m11698(r5.f10610), e);
                return null;
            }
            this.f13107.t_().m11714().m11605("Failed to get user properties. appId", C2244.m11698(r5.f10610), e);
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m14651(C2270 r2) {
        m14631(r2, false);
        m14634((Runnable) new C2954(this, r2));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m14631(C2270 r3, boolean z) {
        C2745.C2746.m14555(r3);
        m14633(r3.f10610, false);
        this.f13107.m10507().m11399(r3.f10620, r3.f10606, r3.f10609);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m14633(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f13106 == null) {
                        if (!"com.google.android.gms".equals(this.f13108) && !C2256.m11802(this.f13107.m10523(), Binder.getCallingUid())) {
                            if (!C2875.m14937(this.f13107.m10523()).m14938(Binder.getCallingUid())) {
                                z2 = false;
                                this.f13106 = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f13106 = Boolean.valueOf(z2);
                    }
                    if (this.f13106.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f13107.t_().m11714().m11603("Measurement Service called with invalid calling package. appId", C2244.m11698(str));
                    throw e;
                }
            }
            if (this.f13108 == null && C2877.uidHasPackageName(this.f13107.m10523(), Binder.getCallingUid(), str)) {
                this.f13108 = str;
            }
            if (!str.equals(this.f13108)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f13107.t_().m11714().m11606("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14643(long j, String str, String str2, String str3) {
        m14634((Runnable) new C2980(this, str2, str3, str, j));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m14635(C2270 r2) {
        m14631(r2, false);
        return this.f13107.m10510(r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14647(C2527 r2, C2270 r3) {
        C2745.C2746.m14555(r2);
        C2745.C2746.m14555(r2.f11482);
        m14631(r3, false);
        C2527 r0 = new C2527(r2);
        r0.f11486 = r3.f10610;
        m14634((Runnable) new C3003(this, r0, r3));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14646(C2527 r3) {
        C2745.C2746.m14555(r3);
        C2745.C2746.m14555(r3.f11482);
        m14633(r3.f11486, true);
        m14634((Runnable) new C2785(this, new C2527(r3)));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2113> m14641(String str, String str2, boolean z, C2270 r6) {
        m14631(r6, false);
        try {
            List<C2152> list = (List) this.f13107.u_().m13667(new C2786(this, r6, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2152 r0 : list) {
                if (z || !C2151.m11339(r0.f10313)) {
                    arrayList.add(new C2113(r0));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (!C1140.m7582() || !this.f13107.m10497().m13384(r6.f10610, C2529.f11567)) {
                this.f13107.t_().m11714().m11605("Failed to get user attributes. appId", C2244.m11698(r6.f10610), e);
            } else {
                this.f13107.t_().m11714().m11605("Failed to query user properties. appId", C2244.m11698(r6.f10610), e);
            }
            return Collections.emptyList();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final List<C2113> m14636(String str, String str2, String str3, boolean z) {
        m14633(str, true);
        try {
            List<C2152> list = (List) this.f13107.u_().m13667(new C2817(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C2152 r0 : list) {
                if (z || !C2151.m11339(r0.f10313)) {
                    arrayList.add(new C2113(r0));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (!C1140.m7582() || !this.f13107.m10497().m13384(str, C2529.f11567)) {
                this.f13107.t_().m11714().m11605("Failed to get user attributes. appId", C2244.m11698(str), e);
            } else {
                this.f13107.t_().m11714().m11605("Failed to get user properties as. appId", C2244.m11698(str), e);
            }
            return Collections.emptyList();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final List<C2527> m14640(String str, String str2, C2270 r5) {
        m14631(r5, false);
        try {
            return (List) this.f13107.u_().m13667(new C2854(this, r5, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f13107.t_().m11714().m11603("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<C2527> m14650(String str, String str2, String str3) {
        m14633(str, true);
        try {
            return (List) this.f13107.u_().m13667(new C2800(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            if (!C1140.m7582() || !this.f13107.m10497().m13384(str, C2529.f11567)) {
                this.f13107.t_().m11714().m11603("Failed to get conditional user properties", e);
            } else {
                this.f13107.t_().m11714().m11603("Failed to get conditional user properties as", e);
            }
            return Collections.emptyList();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14645(C2270 r3) {
        m14633(r3.f10610, false);
        m14634((Runnable) new C2839(this, r3));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m14634(Runnable runnable) {
        C2745.C2746.m14555(runnable);
        if (this.f13107.u_().m13670()) {
            runnable.run();
        } else {
            this.f13107.u_().m13668(runnable);
        }
    }
}
