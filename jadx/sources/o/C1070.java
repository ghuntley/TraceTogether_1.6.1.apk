package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɍɍ  reason: contains not printable characters */
public final class C1070 extends C1519 {
    public static final Parcelable.Creator<C1070> CREATOR = new C1067();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f6438;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2288 f6439;

    public C1070(String str, C2288 r2) {
        this.f6438 = str;
        this.f6439 = r2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f6438, false);
        C2745.m14542(parcel, 2, this.f6439, i, false);
        C2745.m14531(parcel, r0);
    }
}
