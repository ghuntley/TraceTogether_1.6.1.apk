package o;

import android.os.Bundle;

/* renamed from: o.ɪƶ  reason: contains not printable characters */
public final class C1340 extends C1404<Void> {
    public C1340(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m8421() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m8420(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            this.f7668.f14555.m6079(null);
            return;
        }
        this.f7668.f14555.m6073((Exception) new C1669(4, "Invalid response to one way request"));
    }
}
