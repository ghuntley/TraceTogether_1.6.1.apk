package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: o.Ӏх  reason: contains not printable characters */
public class C2837 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C2837 f13284 = new C2837();

    /* renamed from: Ι  reason: contains not printable characters */
    public static final int f13285 = C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* renamed from: ι  reason: contains not printable characters */
    public static C2837 m14802() {
        return f13284;
    }

    C2837() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public int m14806(Context context) {
        return m14807(context, f13285);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public int m14807(Context context, int i) {
        int isGooglePlayServicesAvailable = C2877.isGooglePlayServicesAvailable(context, i);
        if (C2877.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m14809(int i) {
        return C2877.isUserRecoverableError(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 26) == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent m14808(android.content.Context r5, int r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms"
            r1 = 1
            if (r6 == r1) goto L_0x0012
            r2 = 2
            if (r6 == r2) goto L_0x0012
            r5 = 3
            if (r6 == r5) goto L_0x000d
            r5 = 0
            return r5
        L_0x000d:
            android.content.Intent r5 = o.C1749.m9822(r0)
            return r5
        L_0x0012:
            if (r5 == 0) goto L_0x0040
            boolean r6 = o.C2173.m11531(r5)
            r2 = 0
            if (r6 == 0) goto L_0x0038
            int r6 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r6 < r3) goto L_0x0023
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            if (r6 == 0) goto L_0x0039
            boolean r6 = o.C2173.m11530(r5)
            if (r6 == 0) goto L_0x0038
            int r6 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r6 < r3) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            if (r6 != 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            android.content.Intent r5 = o.C1749.m9820()
            return r5
        L_0x0040:
            java.lang.String r5 = m14801(r5, r7)
            android.content.Intent r5 = o.C1749.m9821(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2837.m14808(android.content.Context, int, java.lang.String):android.content.Intent");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m14803(Context context) {
        return C2877.getApkVersion(context);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public String m14805(int i) {
        return C2877.getErrorString(i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m14801(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f13285);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                C2341 r4 = C2059.f10120.m10963(context);
                sb.append(r4.f10837.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public PendingIntent m14804(Context context, int i, int i2) {
        Intent r3 = m14808(context, i, (String) null);
        if (r3 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, r3, 134217728);
    }
}
