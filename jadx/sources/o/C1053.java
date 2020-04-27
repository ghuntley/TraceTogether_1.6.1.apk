package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɉі  reason: contains not printable characters */
public final class C1053 extends C1519 {
    public static final Parcelable.Creator<C1053> CREATOR = new C1055();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1522 f6322;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f6323;

    public C1053(String str, C1522 r2) {
        this.f6323 = str;
        this.f6322 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f6323, false);
        C2745.m14542(parcel, 2, this.f6322, i, false);
        C2745.m14531(parcel, r0);
    }
}
