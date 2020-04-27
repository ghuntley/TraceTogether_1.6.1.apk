package o;

import android.os.RemoteException;

/* renamed from: o.Ɉϳ  reason: contains not printable characters */
final class C1037 implements Runnable {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6288;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6289;

    C1037(C0848 r1, C2270 r2) {
        this.f6288 = r1;
        this.f6289 = r2;
    }

    public final void run() {
        C2082 r0 = this.f6288.f5552;
        if (r0 == null) {
            this.f6288.t_().m11714().m11606("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            r0.m11065(this.f6289);
        } catch (RemoteException e) {
            this.f6288.t_().m11714().m11603("Failed to reset data on the service: remote exception", e);
        }
        this.f6288.m6359();
    }
}
