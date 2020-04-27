package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C2745;

/* renamed from: o.ɼȷ  reason: contains not printable characters */
public final class C1494 extends C1519 {
    public static final Parcelable.Creator<C1494> CREATOR = new C1486();

    /* renamed from: ı  reason: contains not printable characters */
    private final String f7975;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final long f7976;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f7977;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final String f7978;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f7979;

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean f7980;

    public C1494(String str, long j, boolean z, String str2, String str3, String str4) {
        this.f7979 = C2745.C2746.m14562(str);
        this.f7976 = j;
        this.f7980 = z;
        this.f7977 = str2;
        this.f7975 = str3;
        this.f7978 = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r6 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f7979, false);
        C2745.m14508(parcel, 2, this.f7976);
        C2745.m14546(parcel, 3, this.f7980);
        C2745.m14545(parcel, 4, this.f7977, false);
        C2745.m14545(parcel, 5, this.f7975, false);
        C2745.m14545(parcel, 6, this.f7978, false);
        C2745.m14531(parcel, r6);
    }
}
