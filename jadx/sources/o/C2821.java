package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ӀϜ  reason: contains not printable characters */
public final class C2821 extends C1519 {
    public static final Parcelable.Creator<C2821> CREATOR = new C2809();

    /* renamed from: ı  reason: contains not printable characters */
    private final C1415 f13243;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f13244;

    C2821(int i, C1415 r2) {
        this.f13244 = i;
        this.f13243 = r2;
    }

    public C2821(C1415 r2) {
        this(1, r2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14532(parcel, 1, this.f13244);
        C2745.m14542(parcel, 2, this.f13243, i, false);
        C2745.m14531(parcel, r0);
    }
}
