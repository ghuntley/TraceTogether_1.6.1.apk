package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ϳЈ  reason: contains not printable characters */
public final class C2193 extends C1519 {
    public static final Parcelable.Creator<C2193> CREATOR = new C2190();

    /* renamed from: ı  reason: contains not printable characters */
    public final String f10429;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long f10430;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean f10431;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f10432;

    /* renamed from: ι  reason: contains not printable characters */
    public final long f10433;

    /* renamed from: і  reason: contains not printable characters */
    public final Bundle f10434;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String f10435;

    public C2193(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f10430 = j;
        this.f10433 = j2;
        this.f10431 = z;
        this.f10429 = str;
        this.f10432 = str2;
        this.f10435 = str3;
        this.f10434 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14508(parcel, 1, this.f10430);
        C2745.m14508(parcel, 2, this.f10433);
        C2745.m14546(parcel, 3, this.f10431);
        C2745.m14545(parcel, 4, this.f10429, false);
        C2745.m14545(parcel, 5, this.f10432, false);
        C2745.m14545(parcel, 6, this.f10435, false);
        C2745.m14541(parcel, 7, this.f10434, false);
        C2745.m14531(parcel, r5);
    }
}
