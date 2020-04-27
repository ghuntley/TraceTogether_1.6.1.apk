package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C2745;

/* renamed from: o.эɪ  reason: contains not printable characters */
public final class C2527 extends C1519 {
    public static final Parcelable.Creator<C2527> CREATOR = new C2540();

    /* renamed from: ı  reason: contains not printable characters */
    public long f11479;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public long f11480;

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean f11481;

    /* renamed from: ɩ  reason: contains not printable characters */
    public C2113 f11482;

    /* renamed from: ɪ  reason: contains not printable characters */
    public C2441 f11483;

    /* renamed from: ɹ  reason: contains not printable characters */
    public String f11484;

    /* renamed from: Ι  reason: contains not printable characters */
    public String f11485;

    /* renamed from: ι  reason: contains not printable characters */
    public String f11486;

    /* renamed from: І  reason: contains not printable characters */
    public C2441 f11487;

    /* renamed from: і  reason: contains not printable characters */
    public long f11488;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public C2441 f11489;

    C2527(C2527 r3) {
        C2745.C2746.m14555(r3);
        this.f11486 = r3.f11486;
        this.f11485 = r3.f11485;
        this.f11482 = r3.f11482;
        this.f11479 = r3.f11479;
        this.f11481 = r3.f11481;
        this.f11484 = r3.f11484;
        this.f11489 = r3.f11489;
        this.f11488 = r3.f11488;
        this.f11487 = r3.f11487;
        this.f11480 = r3.f11480;
        this.f11483 = r3.f11483;
    }

    C2527(String str, String str2, C2113 r3, long j, boolean z, String str3, C2441 r8, long j2, C2441 r11, long j3, C2441 r14) {
        this.f11486 = str;
        this.f11485 = str2;
        this.f11482 = r3;
        this.f11479 = j;
        this.f11481 = z;
        this.f11484 = str3;
        this.f11489 = r8;
        this.f11488 = j2;
        this.f11487 = r11;
        this.f11480 = j3;
        this.f11483 = r14;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f11486, false);
        C2745.m14545(parcel, 3, this.f11485, false);
        C2745.m14542(parcel, 4, this.f11482, i, false);
        C2745.m14508(parcel, 5, this.f11479);
        C2745.m14546(parcel, 6, this.f11481);
        C2745.m14545(parcel, 7, this.f11484, false);
        C2745.m14542(parcel, 8, this.f11489, i, false);
        C2745.m14508(parcel, 9, this.f11488);
        C2745.m14542(parcel, 10, this.f11487, i, false);
        C2745.m14508(parcel, 11, this.f11480);
        C2745.m14542(parcel, 12, this.f11483, i, false);
        C2745.m14531(parcel, r0);
    }
}
