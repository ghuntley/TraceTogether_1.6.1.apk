package o;

import android.os.RemoteException;

/* renamed from: o.ɛɹ  reason: contains not printable characters */
final class C1128 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C1818 f6642;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ C2441 f6643;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6644;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f6645;

    C1128(C0848 r1, C2441 r2, String str, C1818 r4) {
        this.f6644 = r1;
        this.f6643 = r2;
        this.f6645 = str;
        this.f6642 = r4;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C2082 r1 = this.f6644.f5552;
            if (r1 == null) {
                this.f6644.t_().m11714().m11606("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = r1.m11058(this.f6643, this.f6645);
            this.f6644.m6359();
            this.f6644.m15901().m11405(this.f6642, bArr);
        } catch (RemoteException e) {
            this.f6644.t_().m11714().m11603("Failed to send event to the service to bundle", e);
        } finally {
            this.f6644.m15901().m11405(this.f6642, bArr);
        }
    }
}
