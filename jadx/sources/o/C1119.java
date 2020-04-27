package o;

import android.widget.AutoCompleteTextView;

/* renamed from: o.ɘı  reason: contains not printable characters */
final class C1119 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private /* synthetic */ C1216 f6628;

    /* renamed from: ι  reason: contains not printable characters */
    private /* synthetic */ AutoCompleteTextView f6629;

    C1119(C1216 r1, AutoCompleteTextView autoCompleteTextView) {
        this.f6628 = r1;
        this.f6629 = autoCompleteTextView;
    }

    public final void run() {
        boolean isPopupShowing = this.f6629.isPopupShowing();
        C1216 r1 = this.f6628;
        if (r1.f6896 != isPopupShowing) {
            r1.f6896 = isPopupShowing;
            r1.f6897.cancel();
            r1.f6889.start();
        }
        this.f6628.f6892 = isPopupShowing;
    }
}
