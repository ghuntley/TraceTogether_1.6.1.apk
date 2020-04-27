package o;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: o.ɪэ  reason: contains not printable characters */
final class C1397 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C2270 f7651;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C0848 f7652;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ String f7653;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C1818 f7654;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ String f7655;

    C1397(C0848 r1, String str, String str2, C2270 r4, C1818 r5) {
        this.f7652 = r1;
        this.f7653 = str;
        this.f7655 = str2;
        this.f7651 = r4;
        this.f7654 = r5;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            C2082 r1 = this.f7652.f5552;
            if (r1 == null) {
                this.f7652.t_().m11714().m11605("Failed to get conditional properties; not connected to service", this.f7653, this.f7655);
                return;
            }
            arrayList = C2151.m11360(r1.m11060(this.f7653, this.f7655, this.f7651));
            this.f7652.m6359();
            this.f7652.m15901().m11384(this.f7654, arrayList);
        } catch (RemoteException e) {
            this.f7652.t_().m11714().m11604("Failed to get conditional properties; remote exception", this.f7653, this.f7655, e);
        } finally {
            this.f7652.m15901().m11384(this.f7654, arrayList);
        }
    }
}
