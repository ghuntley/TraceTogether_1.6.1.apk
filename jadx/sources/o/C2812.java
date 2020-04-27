package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* renamed from: o.Ӏͽ  reason: contains not printable characters */
public final class C2812 {

    /* renamed from: ı  reason: contains not printable characters */
    private static volatile C0357<Boolean> f13227 = C0357.m4522();

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f13228 = new Object();

    /* renamed from: Ι  reason: contains not printable characters */
    private static boolean m14729(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static boolean m14728(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        } else if (f13227.m4524()) {
            return f13227.m4523().booleanValue();
        } else {
            synchronized (f13228) {
                if (f13227.m4524()) {
                    boolean booleanValue = f13227.m4523().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && m14729(context)) {
                            z2 = true;
                        }
                        f13227 = C0357.m4521(Boolean.valueOf(z2));
                        return f13227.m4523().booleanValue();
                    }
                }
                z = true;
                z2 = true;
                f13227 = C0357.m4521(Boolean.valueOf(z2));
                return f13227.m4523().booleanValue();
            }
        }
    }
}
