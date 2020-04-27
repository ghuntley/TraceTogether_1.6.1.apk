package o;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.ӏƗ  reason: contains not printable characters */
public class C2877 {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static boolean zzah = false;
    private static boolean zzai = false;
    private static boolean zzaj = false;
    private static boolean zzak = false;
    private static final AtomicBoolean zzal = new AtomicBoolean();

    public static void enableUsingApkIndependentContext() {
        zzal.set(true);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static String getErrorString(int i) {
        return C2822.m14745(i);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if ((android.os.Build.VERSION.SDK_INT >= 26) == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        if (o.C2173.f10347.booleanValue() == false) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int isGooglePlayServicesAvailable(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ all -> 0x000b }
            r1 = 2131886159(0x7f12004f, float:1.9406889E38)
            r0.getString(r1)     // Catch:{ all -> 0x000b }
            goto L_0x000c
        L_0x000b:
        L_0x000c:
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicBoolean r0 = zzal
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0059
            int r0 = o.C1826.m10089(r4)
            if (r0 == 0) goto L_0x0051
            int r1 = GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r0 != r1) goto L_0x002b
            goto L_0x0059
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r5 = 320(0x140, float:4.48E-43)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.String r5 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = " but found "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L_0x0051:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
            r4.<init>(r5)
            throw r4
        L_0x0059:
            boolean r0 = o.C2173.m11531(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007f
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L_0x0069
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = 0
        L_0x006a:
            if (r0 == 0) goto L_0x007d
            boolean r0 = o.C2173.m11530(r4)
            if (r0 == 0) goto L_0x007f
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r0 < r3) goto L_0x007a
            r0 = 1
            goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            if (r0 != 0) goto L_0x007f
        L_0x007d:
            r0 = 1
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            if (r0 != 0) goto L_0x00b1
            java.lang.Boolean r0 = o.C2173.f10347
            if (r0 != 0) goto L_0x00a8
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x00a1
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r0 = 0
            goto L_0x00a2
        L_0x00a1:
            r0 = 1
        L_0x00a2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            o.C2173.f10347 = r0
        L_0x00a8:
            java.lang.Boolean r0 = o.C2173.f10347
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            int r4 = zza(r4, r1, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2877.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }

    private static int zza(Context context, boolean z, int i) {
        if (i >= 0) {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = null;
            if (z) {
                try {
                    packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                } catch (PackageManager.NameNotFoundException unused) {
                    return 9;
                }
            }
            try {
                PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                C2875.m14937(context);
                if (!C2875.m14936(packageInfo2, true)) {
                    return 9;
                }
                if (z && (!C2875.m14936(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                    return 9;
                }
                if (C2356.m12310(packageInfo2.versionCode) < C2356.m12310(i)) {
                    int i2 = packageInfo2.versionCode;
                    return 2;
                }
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e);
                        return 1;
                    }
                }
                if (!applicationInfo.enabled) {
                    return 3;
                }
                return 0;
            } catch (PackageManager.NameNotFoundException unused2) {
                return 1;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return C2256.m11802(context, i);
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zzak) {
            try {
                PackageInfo packageInfo = C2059.f10120.m10963(context).f10837.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C2875.m14937(context);
                if (packageInfo == null || C2875.m14936(packageInfo, false) || !C2875.m14936(packageInfo, true)) {
                    zzaj = false;
                } else {
                    zzaj = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                zzak = true;
            }
        }
        return zzaj || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (!sCanceledAvailabilityNotification.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        Bundle bundle;
        PackageInfo r2 = C2059.m10961(context, context.getPackageName());
        if (r2 == null || r2.applicationInfo == null || (bundle = r2.applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return C2173.m11530(context);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return isUninstalledAppPossiblyUpdating(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return isUninstalledAppPossiblyUpdating(context, "com.android.vending");
        }
        return false;
    }

    @TargetApi(21)
    static boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) {
        int r3 = C2837.f13284.m14807(context, i);
        if (r3 == 0) {
            return;
        }
        if (C2837.f13284.m14808(context, r3, "e") == null) {
            throw new C2845(r3);
        }
        throw new C2878(r3, "Google Play Services not available");
    }

    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return C2059.f10120.m10963(context).m12201(i, str);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return C2837.f13284.m14808((Context) null, i, (String) null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C2837.f13284.m14804(context, i, i2);
    }

    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        Bundle applicationRestrictions;
        return (Build.VERSION.SDK_INT >= 18) && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }
}
