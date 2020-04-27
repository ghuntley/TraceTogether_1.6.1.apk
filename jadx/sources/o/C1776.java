package o;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* renamed from: o.Γі  reason: contains not printable characters */
public final class C1776 extends C1519 {
    public static final Parcelable.Creator<C1776> CREATOR = new C1849();

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f9107;

    C1776(int i) {
        this.f9107 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r4 = C2745.m14517(parcel);
        C2745.m14532(parcel, 1, this.f9107);
        C2745.m14531(parcel, r4);
    }
}
