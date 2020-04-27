package o;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: o.ϲɹ  reason: contains not printable characters */
public final class C2173 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Boolean f10347;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static Boolean f10348;

    /* renamed from: ι  reason: contains not printable characters */
    private static Boolean f10349;

    /* renamed from: ı  reason: contains not printable characters */
    public final C3215 f10350 = new C3215();

    @TargetApi(20)
    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m11531(Context context) {
        if (f10348 == null) {
            boolean z = true;
            if (!(Build.VERSION.SDK_INT >= 20) || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                z = false;
            }
            f10348 = Boolean.valueOf(z);
        }
        return f10348.booleanValue();
    }

    @TargetApi(21)
    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m11530(Context context) {
        if (f10349 == null) {
            boolean z = true;
            if (!(Build.VERSION.SDK_INT >= 21) || !context.getPackageManager().hasSystemFeature("cn.google")) {
                z = false;
            }
            f10349 = Boolean.valueOf(z);
        }
        return f10349.booleanValue();
    }
}
