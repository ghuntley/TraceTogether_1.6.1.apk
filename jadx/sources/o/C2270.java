package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import o.C2745;

/* renamed from: o.Іʭ  reason: contains not printable characters */
public final class C2270 extends C1519 {
    public static final Parcelable.Creator<C2270> CREATOR = new C2267();

    /* renamed from: ı  reason: contains not printable characters */
    public final long f10605;

    /* renamed from: ŀ  reason: contains not printable characters */
    public final String f10606;

    /* renamed from: ł  reason: contains not printable characters */
    public final Boolean f10607;

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final long f10608;

    /* renamed from: ƚ  reason: contains not printable characters */
    public final String f10609;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String f10610;

    /* renamed from: ȷ  reason: contains not printable characters */
    public final int f10611;

    /* renamed from: ɨ  reason: contains not printable characters */
    public final String f10612;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f10613;

    /* renamed from: ɪ  reason: contains not printable characters */
    public final boolean f10614;

    /* renamed from: ɹ  reason: contains not printable characters */
    public final boolean f10615;

    /* renamed from: ɾ  reason: contains not printable characters */
    public final long f10616;

    /* renamed from: ɿ  reason: contains not printable characters */
    public final long f10617;

    /* renamed from: ʅ  reason: contains not printable characters */
    public final List<String> f10618;

    /* renamed from: ʟ  reason: contains not printable characters */
    public final boolean f10619;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f10620;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f10621;

    /* renamed from: І  reason: contains not printable characters */
    public final long f10622;

    /* renamed from: г  reason: contains not printable characters */
    public final boolean f10623;

    /* renamed from: і  reason: contains not printable characters */
    public final String f10624;

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean f10625;

    /* renamed from: ӏ  reason: contains not printable characters */
    public final long f10626;

    C2270(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        C2745.C2746.m14562(str);
        this.f10610 = str;
        this.f10620 = TextUtils.isEmpty(str2) ? null : str2;
        this.f10613 = str3;
        this.f10608 = j;
        this.f10621 = str4;
        this.f10605 = j2;
        this.f10622 = j3;
        this.f10624 = str5;
        this.f10625 = z;
        this.f10615 = z2;
        this.f10612 = str6;
        this.f10626 = j4;
        this.f10616 = j5;
        this.f10611 = i;
        this.f10614 = z3;
        this.f10623 = z4;
        this.f10619 = z5;
        this.f10606 = str7;
        this.f10607 = bool;
        this.f10617 = j6;
        this.f10618 = list;
        this.f10609 = str8;
    }

    C2270(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        this.f10610 = str;
        this.f10620 = str2;
        this.f10613 = str3;
        this.f10608 = j3;
        this.f10621 = str4;
        this.f10605 = j;
        this.f10622 = j2;
        this.f10624 = str5;
        this.f10625 = z;
        this.f10615 = z2;
        this.f10612 = str6;
        this.f10626 = j4;
        this.f10616 = j5;
        this.f10611 = i;
        this.f10614 = z3;
        this.f10623 = z4;
        this.f10619 = z5;
        this.f10606 = str7;
        this.f10607 = bool;
        this.f10617 = j6;
        this.f10618 = list;
        this.f10609 = str8;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r6 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f10610, false);
        C2745.m14545(parcel, 3, this.f10620, false);
        C2745.m14545(parcel, 4, this.f10613, false);
        C2745.m14545(parcel, 5, this.f10621, false);
        C2745.m14508(parcel, 6, this.f10605);
        C2745.m14508(parcel, 7, this.f10622);
        C2745.m14545(parcel, 8, this.f10624, false);
        C2745.m14546(parcel, 9, this.f10625);
        C2745.m14546(parcel, 10, this.f10615);
        C2745.m14508(parcel, 11, this.f10608);
        C2745.m14545(parcel, 12, this.f10612, false);
        C2745.m14508(parcel, 13, this.f10626);
        C2745.m14508(parcel, 14, this.f10616);
        C2745.m14532(parcel, 15, this.f10611);
        C2745.m14546(parcel, 16, this.f10614);
        C2745.m14546(parcel, 17, this.f10623);
        C2745.m14546(parcel, 18, this.f10619);
        C2745.m14545(parcel, 19, this.f10606, false);
        C2745.m14543(parcel, 21, this.f10607, false);
        C2745.m14508(parcel, 22, this.f10617);
        C2745.m14521(parcel, 23, this.f10618, false);
        C2745.m14545(parcel, 24, this.f10609, false);
        C2745.m14531(parcel, r6);
    }
}
