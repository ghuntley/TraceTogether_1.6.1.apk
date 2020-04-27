package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: o.ΣӀ  reason: contains not printable characters */
final class C1919 extends BroadcastReceiver {

    /* renamed from: ı  reason: contains not printable characters */
    C2011 f9679;

    public C1919(C2011 r1) {
        this.f9679 = r1;
    }

    public final void onReceive(Context context, Intent intent) {
        C2011 r3 = this.f9679;
        if (r3 != null && r3.m10819()) {
            FirebaseInstanceId.m1108();
            FirebaseInstanceId.m1105(this.f9679, 0);
            this.f9679.f9966.f983.m1074().unregisterReceiver(this);
            this.f9679 = null;
        }
    }
}
