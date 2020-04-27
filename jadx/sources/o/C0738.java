package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: o.ƚɪ  reason: contains not printable characters */
public final class C0738 extends BroadcastReceiver {

    /* renamed from: ı  reason: contains not printable characters */
    private final C0694 f4996;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Context f4997;

    public C0738(C0694 r1) {
        this.f4996 = r1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m5916(Context context) {
        this.f4997 = context;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized void m5915() {
        if (this.f4997 != null) {
            this.f4997.unregisterReceiver(this);
        }
        this.f4997 = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f4996.m5741();
            m5915();
        }
    }
}
