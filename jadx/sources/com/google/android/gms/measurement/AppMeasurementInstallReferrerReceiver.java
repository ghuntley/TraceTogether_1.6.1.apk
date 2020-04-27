package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o.C2522;
import o.C2533;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C2533 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private C2522 f596;

    /* renamed from: ι  reason: contains not printable characters */
    public final void m812(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f596 == null) {
            this.f596 = new C2522(this);
        }
        this.f596.m13402(context, intent);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final BroadcastReceiver.PendingResult m811() {
        return goAsync();
    }
}
