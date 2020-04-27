package o;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: o.Ɩі  reason: contains not printable characters */
public class C0662 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final AccessibilityRecord f4736;

    /* renamed from: ı  reason: contains not printable characters */
    public static void m5492(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m5493(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m5494(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f4736;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0662 r5 = (C0662) obj;
        AccessibilityRecord accessibilityRecord = this.f4736;
        if (accessibilityRecord == null) {
            if (r5.f4736 != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(r5.f4736)) {
            return false;
        }
        return true;
    }
}
