package o;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: o.чΙ  reason: contains not printable characters */
final class C2503 extends ContentObserver {

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ C2525 f11320;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2503(C2525 r1, Handler handler) {
        super((Handler) null);
        this.f11320 = r1;
    }

    public final void onChange(boolean z) {
        this.f11320.m13418();
    }
}
