package o;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

/* renamed from: o.гǃ  reason: contains not printable characters */
public final class C2409 {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m12456(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        } else {
            Gravity.apply(i, i2, i3, rect, rect2);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m12455(int i, int i2) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i, i2) : i & -8388609;
    }
}
