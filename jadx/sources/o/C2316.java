package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.Іҹ  reason: contains not printable characters */
public class C2316 extends C1970 {
    public static final Parcelable.Creator<C2316> CREATOR = new C1813();

    /* renamed from: ι  reason: contains not printable characters */
    private final String f10743;

    C2316(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f10743 = str;
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m12085() {
        return "playgames.google.com";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m12087() {
        return "playgames.google.com";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1522 m12084(C2316 r11, String str) {
        if (r11 != null) {
            return new C1522((String) null, (String) null, r11.m10704(), (String) null, (String) null, r11.f10743, str, (String) null, (String) null);
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1970 m12086() {
        return new C2316(this.f10743);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f10743, false);
        C2745.m14531(parcel, dataPosition);
    }
}
