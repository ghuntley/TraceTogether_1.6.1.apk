package o;

import android.content.Context;
import android.content.pm.PackageInfo;

/* renamed from: o.Ɨӏ  reason: contains not printable characters */
public class C0708 {

    /* renamed from: ı  reason: contains not printable characters */
    public final String f4908;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final String f4909;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f4910;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f4911;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f4912;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f4913;

    /* renamed from: Ι  reason: contains not printable characters */
    public static C0708 m5820(Context context, aD aDVar, String str, String str2) {
        String packageName = context.getPackageName();
        String r3 = aDVar.f1393.m1482(aDVar.f1391);
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        return new C0708(str, str2, r3, packageName, Integer.toString(packageInfo.versionCode), packageInfo.versionName == null ? "0.0" : packageInfo.versionName);
    }

    C0708(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f4908 = str;
        this.f4910 = str2;
        this.f4911 = str3;
        this.f4913 = str4;
        this.f4912 = str5;
        this.f4909 = str6;
    }
}
