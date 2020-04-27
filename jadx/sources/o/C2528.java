package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;

/* renamed from: o.эɹ  reason: contains not printable characters */
final class C2528 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C2244 f11490;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ Context f11491;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ long f11492;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C2658 f11493;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ Bundle f11494;

    /* renamed from: І  reason: contains not printable characters */
    private final /* synthetic */ BroadcastReceiver.PendingResult f11495;

    C2528(C2522 r1, C2658 r2, long j, Bundle bundle, Context context, C2244 r7, BroadcastReceiver.PendingResult pendingResult) {
        this.f11493 = r2;
        this.f11492 = j;
        this.f11494 = bundle;
        this.f11491 = context;
        this.f11490 = r7;
        this.f11495 = pendingResult;
    }

    public final void run() {
        long r0 = this.f11493.m14107().f10793.m13399();
        long j = this.f11492;
        if (r0 > 0 && (j >= r0 || j <= 0)) {
            j = r0 - 1;
        }
        if (j > 0) {
            this.f11494.putLong("click_timestamp", j);
        }
        this.f11494.putString("_cis", "referrer broadcast");
        C2658.m14078(this.f11491, (C2193) null).m14100().m4344("auto", "_cmp", this.f11494);
        this.f11490.m11713().m11606("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f11495;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
