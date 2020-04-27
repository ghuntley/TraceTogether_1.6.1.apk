package o;

import android.app.Activity;
import android.content.Intent;

/* renamed from: o.ʅȷ  reason: contains not printable characters */
final class C1610 extends C1201 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ int f8519;

    /* renamed from: Ι  reason: contains not printable characters */
    private final /* synthetic */ Activity f8520;

    /* renamed from: ι  reason: contains not printable characters */
    private final /* synthetic */ Intent f8521;

    C1610(Intent intent, Activity activity, int i) {
        this.f8521 = intent;
        this.f8520 = activity;
        this.f8519 = i;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9346() {
        Intent intent = this.f8521;
        if (intent != null) {
            this.f8520.startActivityForResult(intent, this.f8519);
        }
    }
}
