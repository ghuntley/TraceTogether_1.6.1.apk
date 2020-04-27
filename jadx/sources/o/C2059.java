package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: o.ιч  reason: contains not printable characters */
public final class C2059 {

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2059 f10120 = new C2059();

    /* renamed from: Ι  reason: contains not printable characters */
    private C2341 f10121 = null;

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m10960(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((f10120.m10963(context).f10837.getPackageManager().getApplicationInfo(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static PackageInfo m10961(Context context, String str) {
        try {
            return f10120.m10963(context).f10837.getPackageManager().getPackageInfo(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized C2341 m10963(Context context) {
        if (this.f10121 == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f10121 = new C2341(context);
        }
        return this.f10121;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C2341 m10962(Context context) {
        return f10120.m10963(context);
    }
}
