package o;

import android.os.RemoteException;

/* renamed from: o.ɉϳ  reason: contains not printable characters */
final class C1050 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0856 f6316;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6317;

    C1050(C0848 r1, C0856 r2) {
        this.f6317 = r1;
        this.f6316 = r2;
    }

    public final void run() {
        C2082 r1 = this.f6317.f5552;
        if (r1 == null) {
            this.f6317.t_().m11714().m11606("Failed to send current screen to service");
            return;
        }
        try {
            if (this.f6316 == null) {
                r1.m11063(0, (String) null, (String) null, this.f6317.m15904().getPackageName());
            } else {
                r1.m11063(this.f6316.f5573, this.f6316.f5572, this.f6316.f5574, this.f6317.m15904().getPackageName());
            }
            this.f6317.m6359();
        } catch (RemoteException e) {
            this.f6317.t_().m11714().m11603("Failed to send current screen to the service", e);
        }
    }
}
