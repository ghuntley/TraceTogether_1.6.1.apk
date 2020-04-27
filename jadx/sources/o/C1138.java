package o;

import android.os.RemoteException;

/* renamed from: o.ɜɹ  reason: contains not printable characters */
final class C1138 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6663;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6664;

    C1138(C0848 r1, C2270 r2) {
        this.f6663 = r1;
        this.f6664 = r2;
    }

    public final void run() {
        C2082 r0 = this.f6663.f5552;
        if (r0 == null) {
            this.f6663.t_().m11714().m11606("Failed to send measurementEnabled to service");
            return;
        }
        try {
            r0.m11068(this.f6664);
            this.f6663.m6359();
        } catch (RemoteException e) {
            this.f6663.t_().m11714().m11603("Failed to send measurementEnabled to the service", e);
        }
    }
}
