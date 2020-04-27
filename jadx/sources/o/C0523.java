package o;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: o.łı  reason: contains not printable characters */
public final class C0523 {
    /* renamed from: ı  reason: contains not printable characters */
    public static void m5079(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static int m5080(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }
}
