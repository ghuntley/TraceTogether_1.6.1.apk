package o;

import android.app.Dialog;

/* renamed from: o.ɍɨ  reason: contains not printable characters */
final class C1072 extends C0694 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ C1076 f6440;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final /* synthetic */ Dialog f6441;

    C1072(C1076 r1, Dialog dialog) {
        this.f6440 = r1;
        this.f6441 = dialog;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m7400() {
        this.f6440.f6452.m7420();
        if (this.f6441.isShowing()) {
            this.f6441.dismiss();
        }
    }
}
