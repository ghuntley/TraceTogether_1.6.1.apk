package o;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: o.ԁ  reason: contains not printable characters */
public class C2944 extends C0651 {

    /* renamed from: ı  reason: contains not printable characters */
    private static C2945 f13668;

    /* renamed from: o.ԁ$if  reason: invalid class name */
    public interface Cif {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: o.ԁ$ı  reason: contains not printable characters */
    public interface C2945 {
        /* renamed from: ι  reason: contains not printable characters */
        boolean m15209(Activity activity, int i, int i2, Intent intent);

        /* renamed from: ι  reason: contains not printable characters */
        boolean m15210(Activity activity, String[] strArr, int i);
    }

    /* renamed from: o.ԁ$ǃ  reason: contains not printable characters */
    public interface C2946 {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    protected C2944() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C2945 m15205() {
        return f13668;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static void m15203(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m15206(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static void m15207(final Activity activity, final String[] strArr, final int i) {
        C2945 r0 = f13668;
        if (r0 != null && r0.m15210(activity, strArr, i)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof Cif) {
                ((Cif) activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C2946) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C2946) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m15208(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static void m15204(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!C2882.m14953(activity)) {
            activity.recreate();
        }
    }
}
