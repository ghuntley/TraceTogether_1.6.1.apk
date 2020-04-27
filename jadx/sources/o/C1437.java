package o;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import o.C1531;
import o.C2745;

/* renamed from: o.ɭɈ  reason: contains not printable characters */
public final class C1437<T extends Context & C1531> {

    /* renamed from: ı  reason: contains not printable characters */
    private final T f7776;

    public C1437(T t) {
        C2745.C2746.m14555(t);
        this.f7776 = t;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8686() {
        C2658 r0 = C2658.m14078(this.f7776, (C2193) null);
        C2244 t_ = r0.t_();
        r0.q_();
        t_.m11713().m11606("Local AppMeasurementService is starting up");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8693() {
        C2658 r0 = C2658.m14078(this.f7776, (C2193) null);
        C2244 t_ = r0.t_();
        r0.q_();
        t_.m11713().m11606("Local AppMeasurementService is shutting down");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m8688(Intent intent, int i, int i2) {
        C2658 r7 = C2658.m14078(this.f7776, (C2193) null);
        C2244 t_ = r7.t_();
        if (intent == null) {
            t_.A_().m11606("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        r7.q_();
        t_.m11713().m11605("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m8685((Runnable) new C1527(this, i2, t_, intent));
        }
        return 2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m8685(Runnable runnable) {
        C1924 r0 = C1924.m10484((Context) this.f7776);
        r0.u_().m13668((Runnable) new C1717(this, r0, runnable));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final IBinder m8691(Intent intent) {
        if (intent == null) {
            m8684().m11714().m11606("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C2767(C1924.m10484((Context) this.f7776));
        }
        m8684().A_().m11603("onBind received unknown action", action);
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m8694(Intent intent) {
        if (intent == null) {
            m8684().m11714().m11606("onUnbind called with null intent");
            return true;
        }
        m8684().m11713().m11603("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m8690(JobParameters jobParameters) {
        C2658 r0 = C2658.m14078(this.f7776, (C2193) null);
        C2244 t_ = r0.t_();
        String string = jobParameters.getExtras().getString("action");
        r0.q_();
        t_.m11713().m11603("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m8685((Runnable) new C1714(this, t_, jobParameters));
        return true;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m8687(Intent intent) {
        if (intent == null) {
            m8684().m11714().m11606("onRebind called with null intent");
            return;
        }
        m8684().m11713().m11603("onRebind called. action", intent.getAction());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2244 m8684() {
        return C2658.m14078(this.f7776, (C2193) null).t_();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ void m8692(C2244 r2, JobParameters jobParameters) {
        r2.m11713().m11606("AppMeasurementJobService processed last upload request.");
        ((C1531) this.f7776).m8983(jobParameters, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* synthetic */ void m8689(int i, C2244 r3, Intent intent) {
        if (((C1531) this.f7776).m8985(i)) {
            r3.m11713().m11603("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m8684().m11713().m11606("Completed wakeful intent.");
            ((C1531) this.f7776).m8984(intent);
        }
    }
}
