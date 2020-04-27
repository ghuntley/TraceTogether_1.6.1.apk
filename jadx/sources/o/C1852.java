package o;

import android.os.Looper;
import android.os.Message;

/* renamed from: o.ΙΣ  reason: contains not printable characters */
final class C1852 extends C1782 {

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ C1917 f9473;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1852(C1917 r1, Looper looper) {
        super(looper);
        this.f9473 = r1;
    }

    public final void handleMessage(Message message) {
        C1917.m10410(this.f9473, message);
    }
}
