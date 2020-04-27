package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.Ɨƾ  reason: contains not printable characters */
public final class C0677 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f4823;

    /* renamed from: Ι  reason: contains not printable characters */
    public final AtomicBoolean f4824;

    /* renamed from: ι  reason: contains not printable characters */
    private final SharedPreferences f4825;

    public C0677(Context context, String str) {
        Context context2;
        if (Build.VERSION.SDK_INT < 24 || C0651.m5461(context)) {
            context2 = context;
        } else {
            context2 = C0651.m5453(context);
        }
        this.f4823 = context2;
        this.f4825 = context.getSharedPreferences("com.google.firebase.common.prefs:".concat(String.valueOf(str)), 0);
        this.f4824 = new AtomicBoolean(m5549());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m5549() {
        ApplicationInfo applicationInfo;
        if (this.f4825.contains("firebase_data_collection_default_enabled")) {
            return this.f4825.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f4823.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f4823.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }
}
