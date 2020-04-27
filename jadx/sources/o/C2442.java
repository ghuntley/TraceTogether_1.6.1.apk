package o;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import java.util.List;

/* renamed from: o.кɩ  reason: contains not printable characters */
public final class C2442 {

    /* renamed from: ι  reason: contains not printable characters */
    final C2658 f11092;

    C2442(C2658 r1) {
        this.f11092 = r1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m12556() {
        this.f11092.m14111();
        m12557(this.f11092.m14117().getPackageName());
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12557(String str) {
        if (str == null || str.isEmpty()) {
            this.f11092.t_().m11716().m11606("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f11092.u_().y_();
        if (!m12555()) {
            this.f11092.t_().m11710().m11606("Install Referrer Reporter is not available");
            return;
        }
        C2541 r0 = new C2541(this, str);
        this.f11092.u_().y_();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f11092.m14117().getPackageManager();
        if (packageManager == null) {
            this.f11092.t_().m11716().m11606("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f11092.t_().m11710().m11606("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str2 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str2) || !m12555()) {
                this.f11092.t_().A_().m11606("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.f11092.t_().m11713().m11603("Install Referrer Service is", C1345.m8433().m8436(this.f11092.m14117(), new Intent(intent), r0, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.f11092.t_().m11714().m11603("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean m12555() {
        try {
            C2341 r1 = C2059.m10962(this.f11092.m14117());
            if (r1 == null) {
                this.f11092.t_().m11713().m11606("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (r1.m12204("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.f11092.t_().m11713().m11603("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Bundle m12558(String str, C0304 r5) {
        this.f11092.u_().y_();
        if (r5 == null) {
            this.f11092.t_().A_().m11606("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle r4 = r5.m4298(bundle);
            if (r4 != null) {
                return r4;
            }
            this.f11092.t_().m11714().m11606("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f11092.t_().m11714().m11603("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
