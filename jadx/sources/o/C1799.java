package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import java.util.List;

/* renamed from: o.ΙƩ  reason: contains not printable characters */
public final class C1799 {

    /* renamed from: ı  reason: contains not printable characters */
    private String f9233;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f9234;

    /* renamed from: ɩ  reason: contains not printable characters */
    private int f9235 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    private int f9236;

    /* renamed from: ι  reason: contains not printable characters */
    private final Context f9237;

    public C1799(Context context) {
        this.f9237 = context;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final synchronized int m9979() {
        if (this.f9235 != 0) {
            return this.f9235;
        }
        PackageManager packageManager = this.f9237.getPackageManager();
        boolean z = false;
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!(Build.VERSION.SDK_INT >= 26)) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f9235 = 1;
                return this.f9235;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (Build.VERSION.SDK_INT >= 26) {
                z = true;
            }
            if (z) {
                this.f9235 = 2;
            } else {
                this.f9235 = 1;
            }
            return this.f9235;
        }
        this.f9235 = 2;
        return this.f9235;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m9976(FirebaseApp firebaseApp) {
        String str = firebaseApp.m1075().f8950;
        if (str != null) {
            return str;
        }
        String str2 = firebaseApp.m1075().f8951;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized String m9978() {
        if (this.f9234 == null) {
            m9977();
        }
        return this.f9234;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized String m9981() {
        if (this.f9233 == null) {
            m9977();
        }
        return this.f9233;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final synchronized int m9980() {
        PackageInfo r0;
        if (this.f9236 == 0 && (r0 = m9975("com.google.android.gms")) != null) {
            this.f9236 = r0.versionCode;
        }
        return this.f9236;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final synchronized void m9977() {
        PackageInfo r0 = m9975(this.f9237.getPackageName());
        if (r0 != null) {
            this.f9234 = Integer.toString(r0.versionCode);
            this.f9233 = r0.versionName;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final PackageInfo m9975(String str) {
        try {
            return this.f9237.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
