package o;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* renamed from: o.Φ  reason: contains not printable characters */
public final class C1922 extends C2042 {

    /* renamed from: ı  reason: contains not printable characters */
    private Integer f9701;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2335 f9702;

    /* renamed from: ι  reason: contains not printable characters */
    private final AlarmManager f9703 = ((AlarmManager) m15904().getSystemService("alarm"));

    protected C1922(C1924 r3) {
        super(r3);
        this.f9702 = new C1844(this, r3.m10495(), r3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m10455() {
        this.f9703.cancel(m10451());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m10452();
        return false;
    }

    @TargetApi(24)
    /* renamed from: ʅ  reason: contains not printable characters */
    private final void m10452() {
        JobScheduler jobScheduler = (JobScheduler) m15904().getSystemService("jobscheduler");
        int r1 = m10449();
        if (!m10450()) {
            t_().m11713().m11603("Cancelling job. JobID", Integer.valueOf(r1));
        }
        jobScheduler.cancel(r1);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m10454(long j) {
        m10931();
        q_();
        Context r0 = m15904();
        if (!C2522.m13401(r0)) {
            t_().m11711().m11606("Receiver not registered/enabled");
        }
        if (!C2151.m11356(r0, false)) {
            t_().m11711().m11606("Service not registered/enabled");
        }
        m10458();
        if (m10450()) {
            t_().m11713().m11603("Scheduling upload, millis", Long.valueOf(j));
        }
        long r4 = w_().m10847() + j;
        if (j < Math.max(0, C2529.f11509.m10833(null).longValue()) && !this.f9702.m12180()) {
            if (!m10450()) {
                t_().m11713().m11606("Scheduling upload with DelayedRunnable");
            }
            this.f9702.m12178(j);
        }
        q_();
        if (Build.VERSION.SDK_INT >= 24) {
            if (!m10450()) {
                t_().m11713().m11606("Scheduling upload with JobScheduler");
            }
            Context r02 = m15904();
            ComponentName componentName = new ComponentName(r02, "com.google.android.gms.measurement.AppMeasurementJobService");
            int r2 = m10449();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new JobInfo.Builder(r2, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            if (!m10450()) {
                t_().m11713().m11603("Scheduling job. JobID", Integer.valueOf(r2));
            }
            C2054.m10947(r02, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        if (!m10450()) {
            t_().m11713().m11606("Scheduling upload with AlarmManager");
        }
        this.f9703.setInexactRepeating(2, r4, Math.max(C2529.f11588.m10833(null).longValue(), j), m10451());
    }

    /* renamed from: ɍ  reason: contains not printable characters */
    private final int m10449() {
        if (this.f9701 == null) {
            String valueOf = String.valueOf(m15904().getPackageName());
            this.f9701 = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f9701.intValue();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m10458() {
        m10931();
        if (m10450()) {
            t_().m11713().m11606("Unscheduling upload");
        }
        this.f9703.cancel(m10451());
        this.f9702.m12177();
        if (Build.VERSION.SDK_INT >= 24) {
            m10452();
        }
    }

    /* renamed from: ɺ  reason: contains not printable characters */
    private final PendingIntent m10451() {
        Context r0 = m15904();
        return PendingIntent.getBroadcast(r0, 0, new Intent().setClassName(r0, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: ɟ  reason: contains not printable characters */
    private final boolean m10450() {
        return C1140.m7582() && r_().m13372(C2529.f11567);
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
    public final /* bridge */ /* synthetic */ C2593 m10457() {
        return super.m10945();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m10453() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m10460() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m10459() {
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
    public final /* bridge */ /* synthetic */ Context m10461() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m10456() {
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
