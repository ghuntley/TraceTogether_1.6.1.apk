package o;

import android.os.Build;
import android.view.View;

/* renamed from: o.ο  reason: contains not printable characters */
public class C2110 {
    /* renamed from: ı  reason: contains not printable characters */
    public static void m11263(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C2454.m12590(view, charSequence);
        }
    }
}
