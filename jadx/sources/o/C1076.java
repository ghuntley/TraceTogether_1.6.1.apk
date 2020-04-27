package o;

import android.content.DialogInterface;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: o.ɍɾ  reason: contains not printable characters */
final class C1076 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    final /* synthetic */ C1074 f6452;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1069 f6453;

    C1076(C1074 r1, C1069 r2) {
        this.f6452 = r1;
        this.f6453 = r2;
    }

    public final void run() {
        if (this.f6452.f6450) {
            C2822 r0 = this.f6453.m7399();
            if (r0.m14749()) {
                this.f6452.f555.startActivityForResult(GoogleApiActivity.m748(this.f6452.m768(), r0.m14748(), this.f6453.m7398(), false), 1);
            } else if (this.f6452.f6448.m14800(r0.m14747())) {
                this.f6452.f6448.m14797(this.f6452.m768(), this.f6452.f555, r0.m14747(), 2, this.f6452);
            } else if (r0.m14747() == 18) {
                this.f6452.f6448.m14796(this.f6452.m768().getApplicationContext(), new C1072(this, C2835.m14785(this.f6452.m768(), (DialogInterface.OnCancelListener) this.f6452)));
            } else {
                this.f6452.m7418(r0, this.f6453.m7398());
            }
        }
    }
}
