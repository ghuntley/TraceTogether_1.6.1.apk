package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.Іƶ  reason: contains not printable characters */
public class C2229 extends C1970 {
    public static final Parcelable.Creator<C2229> CREATOR = new C2048();

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f10511;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f10512;

    C2229(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str == null || !TextUtils.isEmpty(str)) {
            this.f10511 = str;
            if (str2 == null || !TextUtils.isEmpty(str2)) {
                this.f10512 = str2;
                return;
            }
            throw new IllegalArgumentException("accessToken".concat(" must not be empty"));
        } else {
            throw new IllegalArgumentException("idToken".concat(" must not be empty"));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m11675() {
        return "google.com";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m11677() {
        return "google.com";
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static C1522 m11674(C2229 r11, String str) {
        if (r11 != null) {
            return new C1522(r11.f10511, r11.f10512, r11.m10704(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1970 m11676() {
        return new C2229(this.f10511, this.f10512);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f10511, false);
        C2745.m14545(parcel, 2, this.f10512, false);
        C2745.m14531(parcel, dataPosition);
    }
}
