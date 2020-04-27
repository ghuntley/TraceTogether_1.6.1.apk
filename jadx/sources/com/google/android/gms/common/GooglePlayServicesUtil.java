package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import o.C1201;
import o.C1277;
import o.C2835;
import o.C2877;

public final class GooglePlayServicesUtil extends C2877 {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (C2877.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return C2835.f13281.m14794(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, (C1277) null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, C1277 r4, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (C2877.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        C2835 r0 = C2835.f13281;
        if (r4 == null) {
            return r0.m14791(activity, i, i2, onCancelListener);
        }
        Dialog r2 = C2835.m14784((Context) activity, i, C1201.m7812(r4, C2835.f13281.m14808(activity, i, "d"), i2), onCancelListener);
        if (r2 == null) {
            return false;
        }
        C2835.m14788(activity, r2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return C2877.getErrorString(i);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return C2877.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return C2877.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return C2877.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return C2877.isUserRecoverableError(i);
    }

    public static Resources getRemoteResource(Context context) {
        return C2877.getRemoteResource(context);
    }

    public static Context getRemoteContext(Context context) {
        return C2877.getRemoteContext(context);
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        C2835 r0 = C2835.f13281;
        if (C2877.isPlayServicesPossiblyUpdating(context, i) || C2877.isPlayStorePossiblyUpdating(context, i)) {
            new C2835.C2836(context).sendEmptyMessageDelayed(1, 120000);
        } else {
            r0.m14795(context, i);
        }
    }
}
