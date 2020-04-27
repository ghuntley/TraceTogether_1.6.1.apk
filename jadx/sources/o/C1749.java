package o;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: o.ͼɩ  reason: contains not printable characters */
public final class C1749 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Uri f9059;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Uri f9060;

    /* renamed from: ι  reason: contains not printable characters */
    public static Intent m9822(String str) {
        Uri fromParts = Uri.fromParts("package", str, (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static Intent m9821(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static Intent m9820() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f9059 = parse;
        f9060 = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
