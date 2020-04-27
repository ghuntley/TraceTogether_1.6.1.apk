package o;

import android.os.RemoteException;

/* renamed from: o.ɑı  reason: contains not printable characters */
final class C1101 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6537;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6538;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ boolean f6539;

    C1101(C0848 r1, C2270 r2, boolean z) {
        this.f6537 = r1;
        this.f6538 = r2;
        this.f6539 = z;
    }

    public final void run() {
        C2082 r0 = this.f6537.f5552;
        if (r0 == null) {
            this.f6537.t_().m11714().m11606("Discarding data. Failed to send app launch");
            return;
        }
        try {
            r0.m11071(this.f6538);
            if (this.f6539) {
                this.f6537.m11087().m11432();
            }
            this.f6537.m6376(r0, (C1519) null, this.f6538);
            this.f6537.m6359();
        } catch (RemoteException e) {
            this.f6537.t_().m11714().m11603("Failed to send app launch to the service", e);
        }
    }
}
