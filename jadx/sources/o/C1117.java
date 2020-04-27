package o;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: o.ɕı  reason: contains not printable characters */
final class C1117 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ boolean f6619;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C2270 f6620;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ boolean f6621;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C2441 f6622;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f6623;

    /* renamed from: і  reason: contains not printable characters */
    private final /* synthetic */ C0848 f6624;

    C1117(C0848 r1, boolean z, boolean z2, C2441 r4, C2270 r5, String str) {
        this.f6624 = r1;
        this.f6619 = z;
        this.f6621 = z2;
        this.f6622 = r4;
        this.f6620 = r5;
        this.f6623 = str;
    }

    public final void run() {
        C2082 r0 = this.f6624.f5552;
        if (r0 == null) {
            this.f6624.t_().m11714().m11606("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f6619) {
            this.f6624.m6376(r0, (C1519) this.f6621 ? null : this.f6622, this.f6620);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6623)) {
                    r0.m11069(this.f6622, this.f6620);
                } else {
                    r0.m11059(this.f6622, this.f6623, this.f6624.t_().m11717());
                }
            } catch (RemoteException e) {
                this.f6624.t_().m11714().m11603("Failed to send event to the service", e);
            }
        }
        this.f6624.m6359();
    }
}
