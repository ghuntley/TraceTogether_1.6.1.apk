package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.аɩ  reason: contains not printable characters */
public class C2388 extends C1970 {
    public static final Parcelable.Creator<C2388> CREATOR = new C1662();

    /* renamed from: ı  reason: contains not printable characters */
    private String f10939;

    /* renamed from: ι  reason: contains not printable characters */
    private String f10940;

    C2388(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f10939 = str;
            if (!TextUtils.isEmpty(str2)) {
                this.f10940 = str2;
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m12400() {
        return "twitter.com";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m12402() {
        return "twitter.com";
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1522 m12399(C2388 r11, String str) {
        if (r11 != null) {
            return new C1522((String) null, r11.f10939, r11.m10704(), (String) null, r11.f10940, (String) null, str, (String) null, (String) null);
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1970 m12401() {
        return new C2388(this.f10939, this.f10940);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f10939, false);
        C2745.m14545(parcel, 2, this.f10940, false);
        C2745.m14531(parcel, dataPosition);
    }
}
