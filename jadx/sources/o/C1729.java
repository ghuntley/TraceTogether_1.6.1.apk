package o;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: o.ͱІ  reason: contains not printable characters */
public final class C1729 extends C1698 {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public Handler f8942;

    /* renamed from: ǃ  reason: contains not printable characters */
    private C1730 f8943 = new C1730(this);

    /* renamed from: Ι  reason: contains not printable characters */
    protected C1904 f8944 = new C1904(this);

    /* renamed from: ι  reason: contains not printable characters */
    protected C1858 f8945 = new C1858(this);

    C1729(C2658 r1) {
        super(r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɟ  reason: contains not printable characters */
    public final boolean m9742() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɔ  reason: contains not printable characters */
    public final void m9741() {
        u_().m13668((Runnable) new C1718(this, w_().m10847()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ɼ  reason: contains not printable characters */
    public final void m9733() {
        y_();
        if (this.f8942 == null) {
            this.f8942 = new C2937(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m9736(long j) {
        y_();
        m9733();
        t_().m11713().m11603("Activity resumed, time", Long.valueOf(j));
        this.f8943.m9752();
        this.f8945.m10231(j);
        C1904 r4 = this.f8944;
        r4.f9639.y_();
        if (r4.f9639.f14314.m14094()) {
            if (r4.f9639.r_().m13372(C2529.f11562)) {
                r4.f9639.s_().f10788.m12525(false);
            }
            r4.m10376(r4.f9639.w_().m10846(), false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m9730(long j) {
        y_();
        m9733();
        t_().m11713().m11603("Activity paused, time", Long.valueOf(j));
        this.f8943.m9753();
        this.f8945.m10234(j);
        C1904 r4 = this.f8944;
        if (r4.f9639.r_().m13372(C2529.f11562)) {
            r4.f9639.s_().f10788.m12525(true);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m9744(boolean z, boolean z2, long j) {
        return this.f8945.m10232(z, z2, j);
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m9738() {
        super.m11083();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m9750() {
        super.m11091();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m9749() {
        super.m11090();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2547 m9737() {
        return super.m11082();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0305 m9747() {
        return super.m11088();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2100 m9743() {
        return super.m11086();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0848 m9748() {
        return super.m11089();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C0847 m9740() {
        return super.m11085();
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2158 m9746() {
        return super.m11087();
    }

    /* renamed from: ƚ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C1729 m9739() {
        return super.m11084();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m9751() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m9745() {
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
