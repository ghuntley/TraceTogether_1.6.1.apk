package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.ιլ  reason: contains not printable characters */
public class C2086 extends C1970 {
    public static final Parcelable.Creator<C2086> CREATOR = new C1994();

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f10165;

    C2086(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f10165 = str;
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m11078() {
        return "github.com";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m11080() {
        return "github.com";
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1522 m11077(C2086 r11, String str) {
        if (r11 != null) {
            return new C1522((String) null, r11.f10165, r11.m10704(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1970 m11079() {
        return new C2086(this.f10165);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f10165, false);
        C2745.m14531(parcel, dataPosition);
    }
}
