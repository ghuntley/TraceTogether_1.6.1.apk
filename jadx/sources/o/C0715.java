package o;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: o.ƚı  reason: contains not printable characters */
public final class C0715 {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m5832(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
