package o;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: o.Ν  reason: contains not printable characters */
final class C1904 {

    /* renamed from: Ι  reason: contains not printable characters */
    final /* synthetic */ C1729 f9639;

    C1904(C1729 r1) {
        this.f9639 = r1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10377() {
        if (C1174.m7692() && this.f9639.r_().m13372(C2529.f11515)) {
            this.f9639.y_();
            if (this.f9639.s_().m12123(this.f9639.w_().m10846())) {
                this.f9639.s_().f10785.m12525(true);
                if (Build.VERSION.SDK_INT >= 16) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                    if (runningAppProcessInfo.importance == 100) {
                        this.f9639.t_().m11713().m11606("Detected application was in foreground");
                        m10375(this.f9639.w_().m10846(), false);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m10376(long j, boolean z) {
        this.f9639.y_();
        this.f9639.m9733();
        if (this.f9639.s_().m12123(j)) {
            this.f9639.s_().f10785.m12525(true);
            this.f9639.s_().f10786.m13398(0);
        }
        if (z && this.f9639.r_().m13372(C2529.f11608)) {
            this.f9639.s_().f10772.m13398(j);
        }
        if (this.f9639.s_().f10785.m12524()) {
            m10375(j, z);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final void m10375(long j, boolean z) {
        this.f9639.y_();
        if (C1174.m7692() && this.f9639.r_().m13372(C2529.f11515)) {
            if (this.f9639.f14314.m14094()) {
                this.f9639.s_().f10772.m13398(j);
            } else {
                return;
            }
        }
        this.f9639.t_().m11713().m11603("Session started, time", Long.valueOf(this.f9639.w_().m10847()));
        Long l = null;
        if (this.f9639.r_().m13372(C2529.f11555)) {
            l = Long.valueOf(j / 1000);
        }
        this.f9639.m11088().m4325("auto", "_sid", (Object) l, j);
        this.f9639.s_().f10785.m12525(false);
        Bundle bundle = new Bundle();
        if (this.f9639.r_().m13372(C2529.f11555)) {
            bundle.putLong("_sid", l.longValue());
        }
        if (this.f9639.r_().m13372(C2529.f11500) && z) {
            bundle.putLong("_aib", 1);
        }
        this.f9639.m11088().m4316("auto", "_s", j, bundle);
        if (C0478.m4815() && this.f9639.r_().m13372(C2529.f11520)) {
            String r12 = this.f9639.s_().f10775.m12586();
            if (!TextUtils.isEmpty(r12)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", r12);
                this.f9639.m11088().m4316("auto", "_ssr", j, bundle2);
            }
        }
        if (!C1174.m7692() || !this.f9639.r_().m13372(C2529.f11515)) {
            this.f9639.s_().f10772.m13398(j);
        }
    }
}
