package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɤǃ  reason: contains not printable characters */
public final class C1178 extends C1519 {
    public static final Parcelable.Creator<C1178> CREATOR = new C1210();

    /* renamed from: ı  reason: contains not printable characters */
    private final C2288 f6783;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f6784;

    public C1178(C2288 r1, String str) {
        this.f6783 = r1;
        this.f6784 = str;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2288 m7702() {
        return this.f6783;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14542(parcel, 1, this.f6783, i, false);
        C2745.m14545(parcel, 2, this.f6784, false);
        C2745.m14531(parcel, r0);
    }
}
