package o;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: o.ıɨ  reason: contains not printable characters */
public final class C0336 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Context f3700;

    /* renamed from: ɩ  reason: contains not printable characters */
    public static int m4438(int i) {
        if (i >= 200 && i <= 299) {
            return 0;
        }
        if (i >= 300 && i <= 399) {
            return 1;
        }
        if (i >= 400 && i <= 499) {
            return 0;
        }
        if (i >= 500) {
        }
        return 1;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static boolean m4440(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String action = activity.getIntent().getAction();
        return action != null && !action.equals("android.intent.action.MAIN");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static void m4439(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Intent m4436(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String r0 = m4434(activity);
        if (r0 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, r0);
        try {
            if (m4435(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static Intent m4441(Context context, ComponentName componentName) {
        String r0 = m4435(context, componentName);
        if (r0 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), r0);
        if (m4435(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m4434(Activity activity) {
        try {
            return m4435(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m4435(Context context, ComponentName componentName) {
        String string;
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 640);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(string);
        return sb.toString();
    }

    public C0336(Context context) {
        this.f3700 = context.getApplicationContext();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C2311<o.C1738, java.io.InputStream> m4444(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0054 }
            java.io.File r2 = r5.m4442()     // Catch:{ FileNotFoundException -> 0x0054 }
            o.ͻɩ r3 = o.C1738.JSON     // Catch:{ FileNotFoundException -> 0x0054 }
            r4 = 0
            java.lang.String r3 = m4437(r6, r3, r4)     // Catch:{ FileNotFoundException -> 0x0054 }
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x0054 }
            boolean r2 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0054 }
            if (r2 == 0) goto L_0x0018
            goto L_0x002f
        L_0x0018:
            java.io.File r1 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0054 }
            java.io.File r2 = r5.m4442()     // Catch:{ FileNotFoundException -> 0x0054 }
            o.ͻɩ r3 = o.C1738.ZIP     // Catch:{ FileNotFoundException -> 0x0054 }
            java.lang.String r6 = m4437(r6, r3, r4)     // Catch:{ FileNotFoundException -> 0x0054 }
            r1.<init>(r2, r6)     // Catch:{ FileNotFoundException -> 0x0054 }
            boolean r6 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0054 }
            if (r6 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = r0
        L_0x002f:
            if (r1 != 0) goto L_0x0032
            return r0
        L_0x0032:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{  }
            r6.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r2 = ".zip"
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto L_0x0046
            o.ͻɩ r0 = o.C1738.ZIP
            goto L_0x0048
        L_0x0046:
            o.ͻɩ r0 = o.C1738.JSON
        L_0x0048:
            r1.getAbsolutePath()
            o.C2414.m12459()
            o.Іі r1 = new o.Іі
            r1.<init>(r0, r6)
            return r1
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0336.m4444(java.lang.String):o.Іі");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final File m4443(String str, InputStream inputStream, C1738 r6) {
        FileOutputStream fileOutputStream;
        File file = new File(m4442(), m4437(str, r6, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final File m4442() {
        File file = new File(this.f3700.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m4437(String str, C1738 r4, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            StringBuilder sb2 = new StringBuilder(".temp");
            sb2.append(r4.f9032);
            str2 = sb2.toString();
        } else {
            str2 = r4.f9032;
        }
        sb.append(str2);
        return sb.toString();
    }

    public C0336() {
    }
}
