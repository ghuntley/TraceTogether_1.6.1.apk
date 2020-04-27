package o;

import android.os.Build;
import android.os.Trace;

/* renamed from: o.ʟı  reason: contains not printable characters */
public final class C1679 {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m9555(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m9554() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
