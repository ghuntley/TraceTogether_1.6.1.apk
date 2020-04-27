package o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: o.ap  reason: case insensitive filesystem */
public final class C3276ap {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m1615(Context context) {
        String r0 = m1617(context);
        if (TextUtils.isEmpty(r0)) {
            r0 = m1616(context);
        }
        if (TextUtils.isEmpty(r0)) {
            int r02 = C3285aw.m1672(context, "google_app_id", "string");
            if (r02 != 0) {
                C3263ac.m1563();
                r0 = C3285aw.m1689(context.getResources().getString(r02)).substring(0, 40);
            } else {
                r0 = null;
            }
        }
        if (TextUtils.isEmpty(r0)) {
            C3263ac.m1558();
            if (!C3285aw.m1679(context)) {
                C3263ac.m1563();
            } else {
                throw new IllegalArgumentException("Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>");
            }
        }
        return r0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    protected static String m1617(Context context) {
        String str = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    C3263ac.m1563();
                } else {
                    str = string;
                }
                if (str != null) {
                    return str;
                }
                C3263ac.m1563();
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception unused) {
                str = string;
                C3263ac.m1563();
                return str;
            }
        } catch (Exception unused2) {
            C3263ac.m1563();
            return str;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    protected static String m1616(Context context) {
        int r1 = C3285aw.m1672(context, "io.fabric.ApiKey", "string");
        if (r1 == 0) {
            C3263ac.m1563();
            r1 = C3285aw.m1672(context, "com.crashlytics.ApiKey", "string");
        }
        if (r1 != 0) {
            return context.getResources().getString(r1);
        }
        return null;
    }
}
