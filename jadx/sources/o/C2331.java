package o;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: o.Јǃ  reason: contains not printable characters */
class C2331 extends C2418 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean f10825 = true;

    /* renamed from: ı  reason: contains not printable characters */
    public void m12165(View view) {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m12168(View view) {
    }

    C2331() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: ı  reason: contains not printable characters */
    public void m12166(View view, float f) {
        if (f10825) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f10825 = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: ǃ  reason: contains not printable characters */
    public float m12167(View view) {
        if (f10825) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f10825 = false;
            }
        }
        return view.getAlpha();
    }
}
