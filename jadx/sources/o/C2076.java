package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.ιә  reason: contains not printable characters */
public final class C2076 extends C1970 {
    public static final Parcelable.Creator<C2076> CREATOR = new C1871();

    /* renamed from: ı  reason: contains not printable characters */
    public boolean f10152;

    /* renamed from: ǃ  reason: contains not printable characters */
    public String f10153;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f10154;

    /* renamed from: Ι  reason: contains not printable characters */
    public String f10155;

    /* renamed from: ι  reason: contains not printable characters */
    public String f10156;

    C2076(String str, String str2, String str3, String str4, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f10155 = str;
            if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                this.f10156 = str2;
                this.f10154 = str3;
                this.f10153 = str4;
                this.f10152 = z;
                return;
            }
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m11008() {
        return "password";
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m11006() {
        return !TextUtils.isEmpty(this.f10156) ? "password" : "emailLink";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1970 m11007() {
        return new C2076(this.f10155, this.f10156, this.f10154, this.f10153, this.f10152);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f10155, false);
        C2745.m14545(parcel, 2, this.f10156, false);
        C2745.m14545(parcel, 3, this.f10154, false);
        C2745.m14545(parcel, 4, this.f10153, false);
        boolean z = this.f10152;
        C2745.m14503(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        C2745.m14531(parcel, dataPosition);
    }
}
