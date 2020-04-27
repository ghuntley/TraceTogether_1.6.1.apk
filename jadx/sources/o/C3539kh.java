package o;

import android.os.Bundle;

/* renamed from: o.kh  reason: case insensitive filesystem */
public final class C3539kh {

    /* renamed from: ı  reason: contains not printable characters */
    public int f2653;

    /* renamed from: ǃ  reason: contains not printable characters */
    int f2654;

    /* renamed from: ɩ  reason: contains not printable characters */
    public String f2655;

    /* renamed from: Ι  reason: contains not printable characters */
    public String f2656;

    /* renamed from: ι  reason: contains not printable characters */
    public String f2657;

    /* renamed from: і  reason: contains not printable characters */
    String[] f2658;

    public C3539kh(String str, String str2, String str3, int i, int i2, String[] strArr) {
        this.f2656 = str;
        this.f2655 = str2;
        this.f2657 = str3;
        this.f2653 = i;
        this.f2654 = i2;
        this.f2658 = strArr;
    }

    public C3539kh(Bundle bundle) {
        this.f2656 = bundle.getString("positiveButton");
        this.f2655 = bundle.getString("negativeButton");
        this.f2657 = bundle.getString("rationaleMsg");
        this.f2653 = bundle.getInt("theme");
        this.f2654 = bundle.getInt("requestCode");
        this.f2658 = bundle.getStringArray("permissions");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Bundle m3273() {
        Bundle bundle = new Bundle();
        bundle.putString("positiveButton", this.f2656);
        bundle.putString("negativeButton", this.f2655);
        bundle.putString("rationaleMsg", this.f2657);
        bundle.putInt("theme", this.f2653);
        bundle.putInt("requestCode", this.f2654);
        bundle.putStringArray("permissions", this.f2658);
        return bundle;
    }
}
