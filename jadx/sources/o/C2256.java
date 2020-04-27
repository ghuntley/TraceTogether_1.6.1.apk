package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* renamed from: o.Іɭ  reason: contains not printable characters */
public final class C2256 implements C0801 {

    /* renamed from: ı  reason: contains not printable characters */
    private final /* synthetic */ C2248 f10582;

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m11802(Context context, int i) {
        if (!C2059.f10120.m10963(context).m12201(i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C2875 r3 = C2875.m14937(context);
            if (packageInfo != null) {
                if (C2875.m14936(packageInfo, false)) {
                    return true;
                }
                if (!C2875.m14936(packageInfo, true) || !C2877.honorsDebugCertificates(r3.f13404)) {
                    return false;
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    C2256() {
    }

    public C2256(C2248 r1) {
        this.f10582 = r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11818(String str, String str2, Bundle bundle) {
        this.f10582.m11782(str, str2, bundle);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11816(String str, String str2, Object obj) {
        this.f10582.m11774(str, str2, obj);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m11806(boolean z) {
        this.f10582.m11775(z);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Map<String, Object> m11814(String str, String str2, boolean z) {
        return this.f10582.m11779(str, str2, z);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11810(C3211 r2) {
        this.f10582.m11783(r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m11807() {
        return this.f10582.m11776();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m11812() {
        return this.f10582.m11764();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m11817() {
        return this.f10582.m11770();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m11803() {
        return this.f10582.m11778();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m11805() {
        return this.f10582.m11767();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11809(String str) {
        this.f10582.m11766(str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m11804(String str) {
        this.f10582.m11773(str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m11808(Bundle bundle) {
        this.f10582.m11772(bundle);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m11815(String str, String str2, Bundle bundle) {
        this.f10582.m11769(str, str2, bundle);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<Bundle> m11813(String str, String str2) {
        return this.f10582.m11771(str, str2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m11811(String str) {
        return this.f10582.m11777(str);
    }
}
