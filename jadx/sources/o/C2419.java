package o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: o.гӀ  reason: contains not printable characters */
class C2419 extends C2417 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean f11011 = true;

    C2419() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: ɩ  reason: contains not printable characters */
    public void m12480(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.m12477(view, i);
        } else if (f11011) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f11011 = false;
            }
        }
    }
}
