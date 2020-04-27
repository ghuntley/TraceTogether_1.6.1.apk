package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o.C2745;

/* renamed from: o.Із  reason: contains not printable characters */
class C2301 extends BroadcastReceiver {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String f10701 = C2301.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1924 f10702;

    /* renamed from: Ι  reason: contains not printable characters */
    private boolean f10703;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f10704;

    C2301(C1924 r1) {
        C2745.C2746.m14555(r1);
        this.f10702 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        this.f10702.m10508();
        String action = intent.getAction();
        this.f10702.t_().m11713().m11603("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean r2 = this.f10702.m10511().m11949();
            if (this.f10704 != r2) {
                this.f10704 = r2;
                this.f10702.u_().m13668((Runnable) new C2435(this, r2));
                return;
            }
            return;
        }
        this.f10702.t_().A_().m11603("NetworkBroadcastReceiver received unknown action", action);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11987() {
        this.f10702.m10508();
        this.f10702.u_().y_();
        if (!this.f10703) {
            this.f10702.m10523().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10704 = this.f10702.m10511().m11949();
            this.f10702.t_().m11713().m11603("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10704));
            this.f10703 = true;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11986() {
        this.f10702.m10508();
        this.f10702.u_().y_();
        this.f10702.u_().y_();
        if (this.f10703) {
            this.f10702.t_().m11713().m11606("Unregistering connectivity change receiver");
            this.f10703 = false;
            this.f10704 = false;
            try {
                this.f10702.m10523().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f10702.t_().m11714().m11603("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
