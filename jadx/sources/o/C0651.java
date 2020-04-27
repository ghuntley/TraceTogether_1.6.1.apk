package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: o.Ɩɩ  reason: contains not printable characters */
public class C0651 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static TypedValue f4677;

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f4678 = new Object();

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m5456(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m5455(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static File[] m5457(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static File[] m5459(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static Drawable m5458(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f4678) {
            if (f4677 == null) {
                f4677 = new TypedValue();
            }
            context.getResources().getValue(i, f4677, true);
            i2 = f4677.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static ColorStateList m5454(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static int m5450(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static int m5452(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static File m5451(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return m5460(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001e, code lost:
        return r2;
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m5460(java.io.File r2) {
        /*
            java.lang.Class<o.Ɩɩ> r0 = o.C0651.class
            monitor-enter(r0)
            boolean r1 = r2.exists()     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x001d
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x001d
            boolean r1 = r2.exists()     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r2
        L_0x0017:
            r2.getPath()     // Catch:{ all -> 0x001f }
            r2 = 0
            monitor-exit(r0)
            return r2
        L_0x001d:
            monitor-exit(r0)
            return r2
        L_0x001f:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0651.m5460(java.io.File):java.io.File");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Context m5453(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static boolean m5461(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }
}
