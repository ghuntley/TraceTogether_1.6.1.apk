package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: o.ӏſ  reason: contains not printable characters */
public class C2875 {

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2875 f13403;

    /* renamed from: ι  reason: contains not printable characters */
    public final Context f13404;

    private C2875(Context context) {
        this.f13404 = context.getApplicationContext();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2875 m14937(Context context) {
        if (context != null) {
            synchronized (C2875.class) {
                if (f13403 == null) {
                    C2458.m12665(context);
                    f13403 = new C2875(context);
                }
            }
            return f13403;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m14938(int i) {
        C2712 r0;
        String[] packagesForUid = C2059.f10120.m10963(this.f13404).f10837.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length != 0) {
            r0 = null;
            for (String r02 : packagesForUid) {
                r0 = m14934(r02);
                if (r0.f12541) {
                    break;
                }
            }
        } else {
            r0 = C2712.m14410("no pkgs");
        }
        r0.m14413();
        return r0.f12541;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m14936(PackageInfo packageInfo, boolean z) {
        C2500 r3;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                r3 = m14935(packageInfo, C2686.f12411);
            } else {
                r3 = m14935(packageInfo, C2686.f12411[0]);
            }
            if (r3 != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final C2712 m14934(String str) {
        try {
            PackageInfo packageInfo = C2059.f10120.m10963(this.f13404).f10837.getPackageManager().getPackageInfo(str, 64);
            boolean honorsDebugCertificates = C2877.honorsDebugCertificates(this.f13404);
            if (packageInfo == null) {
                return C2712.m14410("null pkg");
            }
            if (packageInfo.signatures.length != 1) {
                return C2712.m14410("single cert required");
            }
            C2491 r2 = new C2491(packageInfo.signatures[0].toByteArray());
            String str2 = packageInfo.packageName;
            C2712 r1 = C2458.m12662(str2, r2, honorsDebugCertificates, false);
            return (!r1.f12541 || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !C2458.m12662(str2, r2, false, true).f12541) ? r1 : C2712.m14410("debuggable release cert app rejected");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return C2712.m14410(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C2500 m14935(PackageInfo packageInfo, C2500... r4) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        C2491 r0 = new C2491(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < r4.length; i++) {
            if (r4[i].equals(r0)) {
                return r4[i];
            }
        }
        return null;
    }
}
