package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C2745;

/* renamed from: o.кǃ  reason: contains not printable characters */
public final class C2441 extends C1519 {
    public static final Parcelable.Creator<C2441> CREATOR = new C2516();

    /* renamed from: ı  reason: contains not printable characters */
    public final String f11088;

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f11089;

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2433 f11090;

    /* renamed from: ι  reason: contains not printable characters */
    public final long f11091;

    public C2441(String str, C2433 r2, String str2, long j) {
        this.f11089 = str;
        this.f11090 = r2;
        this.f11088 = str2;
        this.f11091 = j;
    }

    C2441(C2441 r2, long j) {
        C2745.C2746.m14555(r2);
        this.f11089 = r2.f11089;
        this.f11090 = r2.f11090;
        this.f11088 = r2.f11088;
        this.f11091 = j;
    }

    public final String toString() {
        String str = this.f11088;
        String str2 = this.f11089;
        String valueOf = String.valueOf(this.f11090);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f11089, false);
        C2745.m14542(parcel, 3, this.f11090, i, false);
        C2745.m14545(parcel, 4, this.f11088, false);
        C2745.m14508(parcel, 5, this.f11091);
        C2745.m14531(parcel, r0);
    }
}
