package o;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: o.ӏı  reason: contains not printable characters */
public final class C2871 {
    /* renamed from: Ι  reason: contains not printable characters */
    public static String m14932(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static int m14931(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }
}
