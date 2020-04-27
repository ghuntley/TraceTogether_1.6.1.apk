package o;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: o.ɩϵ  reason: contains not printable characters */
final class C1293 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C2527 f7247;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2527 f7248;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ boolean f7249;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final /* synthetic */ C0848 f7250;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ boolean f7251;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2270 f7252;

    C1293(C0848 r1, boolean z, boolean z2, C2527 r4, C2270 r5, C2527 r6) {
        this.f7250 = r1;
        this.f7249 = z;
        this.f7251 = z2;
        this.f7247 = r4;
        this.f7252 = r5;
        this.f7248 = r6;
    }

    public final void run() {
        C2082 r0 = this.f7250.f5552;
        if (r0 == null) {
            this.f7250.t_().m11714().m11606("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f7249) {
            this.f7250.m6376(r0, (C1519) this.f7251 ? null : this.f7247, this.f7252);
        } else {
            try {
                if (TextUtils.isEmpty(this.f7248.f11486)) {
                    r0.m11067(this.f7247, this.f7252);
                } else {
                    r0.m11066(this.f7247);
                }
            } catch (RemoteException e) {
                this.f7250.t_().m11714().m11603("Failed to send conditional user property to the service", e);
            }
        }
        this.f7250.m6359();
    }
}
