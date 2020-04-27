package o;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: o.ſǃ  reason: contains not printable characters */
public final class C0585 {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static Interpolator m5211(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C0655(f, f2, f3, f4);
    }
}
