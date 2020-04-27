package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import o.C1437;
import o.C1531;

public final class AppMeasurementService extends Service implements C1531 {

    /* renamed from: ι  reason: contains not printable characters */
    private C1437<AppMeasurementService> f599;

    public final void onCreate() {
        super.onCreate();
        if (this.f599 == null) {
            this.f599 = new C1437<>(this);
        }
        this.f599.m8686();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m820(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m818(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m819(Intent intent) {
        AppMeasurementReceiver.m10939(intent);
    }

    public final void onDestroy() {
        if (this.f599 == null) {
            this.f599 = new C1437<>(this);
        }
        this.f599.m8693();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.f599 == null) {
            this.f599 = new C1437<>(this);
        }
        return this.f599.m8688(intent, i, i2);
    }

    public final IBinder onBind(Intent intent) {
        if (this.f599 == null) {
            this.f599 = new C1437<>(this);
        }
        return this.f599.m8691(intent);
    }

    public final boolean onUnbind(Intent intent) {
        if (this.f599 == null) {
            this.f599 = new C1437<>(this);
        }
        return this.f599.m8694(intent);
    }

    public final void onRebind(Intent intent) {
        if (this.f599 == null) {
            this.f599 = new C1437<>(this);
        }
        this.f599.m8687(intent);
    }
}
