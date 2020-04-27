package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.C2047;
import o.C2522;
import o.C2533;

public final class AppMeasurementReceiver extends C2047 implements C2533 {

    /* renamed from: ı  reason: contains not printable characters */
    private C2522 f598;

    public final void onReceive(Context context, Intent intent) {
        if (this.f598 == null) {
            this.f598 = new C2522(this);
        }
        this.f598.m13402(context, intent);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m817(Context context, Intent intent) {
        m10940(context, intent);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final BroadcastReceiver.PendingResult m816() {
        return goAsync();
    }
}
