package o;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import o.C2745;

/* renamed from: o.ѕı  reason: contains not printable characters */
public final class C2547 extends C2089 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Map<String, Integer> f11632 = new C0299();

    /* renamed from: ɩ  reason: contains not printable characters */
    private long f11633;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Map<String, Long> f11634 = new C0299();

    public C2547(C2658 r1) {
        super(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m13585(String str, long j) {
        if (str == null || str.length() == 0) {
            t_().m11714().m11606("Ad unit id must be a non-empty string");
        } else {
            u_().m13668((Runnable) new C2255(this, str, j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m13583(String str, long j) {
        m15903();
        y_();
        C2745.C2746.m14562(str);
        if (this.f11632.isEmpty()) {
            this.f11633 = j;
        }
        Integer num = this.f11632.get(str);
        if (num != null) {
            this.f11632.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.f11632.size() >= 100) {
            t_().A_().m11606("Too many ads visible");
        } else {
            this.f11632.put(str, 1);
            this.f11634.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m13589(String str, long j) {
        if (str == null || str.length() == 0) {
            t_().m11714().m11606("Ad unit id must be a non-empty string");
        } else {
            u_().m13668((Runnable) new C0817(this, str, j));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13581(String str, long j) {
        m15903();
        y_();
        C2745.C2746.m14562(str);
        Integer num = this.f11632.get(str);
        if (num != null) {
            C0856 r1 = m11085().m6337();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f11632.remove(str);
                Long l = this.f11634.get(str);
                if (l == null) {
                    t_().m11714().m11606("First ad unit exposure time was never set");
                } else {
                    this.f11634.remove(str);
                    m13576(str, j - l.longValue(), r1);
                }
                if (this.f11632.isEmpty()) {
                    long j2 = this.f11633;
                    if (j2 == 0) {
                        t_().m11714().m11606("First ad exposure time was never set");
                        return;
                    }
                    m13577(j - j2, r1);
                    this.f11633 = 0;
                    return;
                }
                return;
            }
            this.f11632.put(str, Integer.valueOf(intValue));
            return;
        }
        t_().m11714().m11603("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m13577(long j, C0856 r6) {
        if (r6 == null) {
            t_().m11713().m11606("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            t_().m11713().m11603("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C0847.m6320(r6, bundle, true);
            m11088().m4344("am", "_xa", bundle);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final void m13576(String str, long j, C0856 r7) {
        if (r7 == null) {
            t_().m11713().m11606("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            t_().m11713().m11603("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C0847.m6320(r7, bundle, true);
            m11088().m4344("am", "_xu", bundle);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m13594(long j) {
        C0856 r0 = m11085().m6337();
        for (String next : this.f11634.keySet()) {
            m13576(next, j - this.f11634.get(next).longValue(), r0);
        }
        if (!this.f11634.isEmpty()) {
            m13577(j - this.f11633, r0);
        }
        m13580(j);
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m13580(long j) {
        for (String put : this.f11634.keySet()) {
            this.f11634.put(put, Long.valueOf(j));
        }
        if (!this.f11634.isEmpty()) {
            this.f11633 = j;
        }
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13586() {
        super.m11083();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13597() {
        super.m11091();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m13596() {
        super.m11090();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2547 m13584() {
        return super.m11082();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0305 m13593() {
        return super.m11088();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2100 m13590() {
        return super.m11086();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0848 m13595() {
        return super.m11089();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0847 m13588() {
        return super.m11085();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2158 m13592() {
        return super.m11087();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1729 m13587() {
        return super.m11084();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m13598() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m13591() {
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
