package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɟɪ  reason: contains not printable characters */
public final class C1156 extends C1519 {
    public static final Parcelable.Creator<C1156> CREATOR = new C1110();

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1494 f6700;

    public C1156(C1494 r1) {
        this.f6700 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C1494 m7626() {
        return this.f6700;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14542(parcel, 1, this.f6700, i, false);
        C2745.m14531(parcel, r0);
    }
}
