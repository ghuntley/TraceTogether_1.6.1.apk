package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.ιʑ  reason: contains not printable characters */
public class C2010 extends C1970 {
    public static final Parcelable.Creator<C2010> CREATOR = new C1898();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f9963;

    C2010(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f9963 = str;
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m10815() {
        return "facebook.com";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m10817() {
        return "facebook.com";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static C1522 m10814(C2010 r11, String str) {
        if (r11 != null) {
            return new C1522((String) null, r11.f9963, r11.m10704(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1970 m10816() {
        return new C2010(this.f9963);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f9963, false);
        C2745.m14531(parcel, dataPosition);
    }
}
