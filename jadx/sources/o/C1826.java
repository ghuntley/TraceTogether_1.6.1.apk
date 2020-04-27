package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* renamed from: o.Ιɭ  reason: contains not printable characters */
public final class C1826 {

    /* renamed from: ı  reason: contains not printable characters */
    private static int f9321;

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String f9322;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean f9323;

    /* renamed from: ι  reason: contains not printable characters */
    private static Object f9324 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m10088(Context context) {
        m10090(context);
        return f9322;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m10089(Context context) {
        m10090(context);
        return f9321;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m10090(Context context) {
        synchronized (f9324) {
            if (!f9323) {
                f9323 = true;
                try {
                    Bundle bundle = C2059.m10962(context).m12203(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f9322 = bundle.getString("com.google.app.id");
                        f9321 = C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
