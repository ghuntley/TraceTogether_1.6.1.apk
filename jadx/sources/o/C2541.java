package o;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: o.єɹ  reason: contains not printable characters */
public final class C2541 implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f11625;

    /* renamed from: ι  reason: contains not printable characters */
    final /* synthetic */ C2442 f11626;

    C2541(C2442 r1, String str) {
        this.f11626 = r1;
        this.f11625 = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f11626.f11092.t_().A_().m11606("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C0304 r2 = C1307.m8258(iBinder);
            if (r2 == null) {
                this.f11626.f11092.t_().A_().m11606("Install Referrer Service implementation was not found");
                return;
            }
            this.f11626.f11092.t_().m11713().m11606("Install Referrer Service connected");
            this.f11626.f11092.u_().m13668((Runnable) new C2446(this, r2, this));
        } catch (Exception e) {
            this.f11626.f11092.t_().A_().m11603("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11626.f11092.t_().m11713().m11606("Install Referrer Service disconnected");
    }
}
