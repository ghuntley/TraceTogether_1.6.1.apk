package o;

import android.content.Context;
import android.text.TextUtils;

public final class aA {
    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m1450(Context context) {
        boolean z;
        if (C3285aw.m1692(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        int r1 = C3285aw.m1672(context, "google_app_id", "string");
        if (r1 != 0 && !TextUtils.isEmpty(context.getResources().getString(r1))) {
            if (TextUtils.isEmpty(C3276ap.m1617(context)) && TextUtils.isEmpty(C3276ap.m1616(context))) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }
}
