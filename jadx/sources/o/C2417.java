package o;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: o.гІ  reason: contains not printable characters */
class C2417 extends C2329 {

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean f11006 = true;

    C2417() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: ı  reason: contains not printable characters */
    public void m12470(View view, int i, int i2, int i3, int i4) {
        if (f11006) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f11006 = false;
            }
        }
    }
}
