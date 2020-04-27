package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C2745;

/* renamed from: o.ɪϳ  reason: contains not printable characters */
public final class C1384 extends C1519 {
    public static final Parcelable.Creator<C1384> CREATOR = new C1392();

    /* renamed from: ı  reason: contains not printable characters */
    private final String f7618;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f7619;

    /* renamed from: Ι  reason: contains not printable characters */
    private final long f7620;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f7621;

    public C1384(String str, String str2, String str3, long j) {
        this.f7618 = str;
        this.f7619 = C2745.C2746.m14562(str2);
        this.f7621 = str3;
        this.f7620 = j;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m8541() {
        return this.f7618;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m8540() {
        return this.f7619;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m8539() {
        return this.f7621;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m8542() {
        return this.f7620;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f7618, false);
        C2745.m14545(parcel, 2, this.f7619, false);
        C2745.m14545(parcel, 3, this.f7621, false);
        C2745.m14508(parcel, 4, this.f7620);
        C2745.m14531(parcel, r5);
    }
}
