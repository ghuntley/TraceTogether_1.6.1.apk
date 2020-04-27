package o;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: o.Ιі  reason: contains not printable characters */
public class C1884 {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m10290(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
