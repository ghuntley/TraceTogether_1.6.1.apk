package o;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: o.ӀІ  reason: contains not printable characters */
public final class C2826 {
    /* renamed from: ı  reason: contains not printable characters */
    public static int m14763(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m14766(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m14765(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i);
        } else {
            marginLayoutParams.leftMargin = i;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static void m14764(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginEnd(i);
        } else {
            marginLayoutParams.rightMargin = i;
        }
    }
}
