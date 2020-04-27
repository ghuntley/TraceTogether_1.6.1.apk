package o;

import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: o.ɩյ  reason: contains not printable characters */
final class C1322 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ String f7328;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ boolean f7329;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ String f7330;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C1818 f7331;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2270 f7332;

    /* renamed from: І  reason: contains not printable characters */
    private final /* synthetic */ C0848 f7333;

    C1322(C0848 r1, String str, String str2, boolean z, C2270 r5, C1818 r6) {
        this.f7333 = r1;
        this.f7328 = str;
        this.f7330 = str2;
        this.f7329 = z;
        this.f7332 = r5;
        this.f7331 = r6;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            C2082 r1 = this.f7333.f5552;
            if (r1 == null) {
                this.f7333.t_().m11714().m11605("Failed to get user properties; not connected to service", this.f7328, this.f7330);
                return;
            }
            bundle = C2151.m11354(r1.m11061(this.f7328, this.f7330, this.f7329, this.f7332));
            this.f7333.m6359();
            this.f7333.m15901().m11396(this.f7331, bundle);
        } catch (RemoteException e) {
            this.f7333.t_().m11714().m11605("Failed to get user properties; remote exception", this.f7328, e);
        } finally {
            this.f7333.m15901().m11396(this.f7331, bundle);
        }
    }
}
