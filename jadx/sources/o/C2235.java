package o;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: o.Іȷ  reason: contains not printable characters */
final class C2235 {

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean f10518 = true;

    /* renamed from: ǃ  reason: contains not printable characters */
    static C2260 m11685(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C2251(viewGroup);
        }
        return C2253.m11798(viewGroup);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static void m11686(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (Build.VERSION.SDK_INT < 18) {
            C2268.m11831(viewGroup, z);
        } else if (f10518) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f10518 = false;
            }
        }
    }
}
