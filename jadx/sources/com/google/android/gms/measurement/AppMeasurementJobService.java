package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import o.C1437;
import o.C1531;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C1531 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private C1437<AppMeasurementJobService> f597;

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m814(Intent intent) {
    }

    public final void onCreate() {
        super.onCreate();
        if (this.f597 == null) {
            this.f597 = new C1437<>(this);
        }
        this.f597.m8686();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m815(int i) {
        throw new UnsupportedOperationException();
    }

    @TargetApi(24)
    /* renamed from: ı  reason: contains not printable characters */
    public final void m813(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final void onDestroy() {
        if (this.f597 == null) {
            this.f597 = new C1437<>(this);
        }
        this.f597.m8693();
        super.onDestroy();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f597 == null) {
            this.f597 = new C1437<>(this);
        }
        return this.f597.m8690(jobParameters);
    }

    public final boolean onUnbind(Intent intent) {
        if (this.f597 == null) {
            this.f597 = new C1437<>(this);
        }
        return this.f597.m8694(intent);
    }

    public final void onRebind(Intent intent) {
        if (this.f597 == null) {
            this.f597 = new C1437<>(this);
        }
        this.f597.m8687(intent);
    }
}
