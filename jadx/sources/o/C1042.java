package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɈӀ  reason: contains not printable characters */
public final class C1042 extends C1519 {
    public static final Parcelable.Creator<C1042> CREATOR = new C1066();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f6298;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f6299;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f6300;

    public C1042(String str, String str2, String str3) {
        this.f6298 = str;
        this.f6300 = str2;
        this.f6299 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f6298, false);
        C2745.m14545(parcel, 2, this.f6300, false);
        C2745.m14545(parcel, 3, this.f6299, false);
        C2745.m14531(parcel, r5);
    }
}
