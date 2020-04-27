package o;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import o.C2771;

/* renamed from: o.Јӏ  reason: contains not printable characters */
public final class C2341 {

    /* renamed from: Ι  reason: contains not printable characters */
    public final Context f10837;

    public C2341(Context context) {
        this.f10837 = context;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final ApplicationInfo m12203(String str, int i) {
        return this.f10837.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final PackageInfo m12204(String str, int i) {
        return this.f10837.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m12202(String str) {
        return this.f10837.checkCallingOrSelfPermission(str);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final CharSequence m12206(String str) {
        return this.f10837.getPackageManager().getApplicationLabel(this.f10837.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m12205() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C2771.C2774.m14663(this.f10837);
        }
        if (!(Build.VERSION.SDK_INT >= 26) || (nameForUid = this.f10837.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f10837.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m12201(int i, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                ((AppOpsManager) this.f10837.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f10837.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
