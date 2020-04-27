package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɨǀ  reason: contains not printable characters */
public final class C1204 extends C1519 {
    public static final Parcelable.Creator<C1204> CREATOR = new C1187();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2076 f6860;

    public C1204(C2076 r1) {
        this.f6860 = r1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2076 m7824() {
        return this.f6860;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14542(parcel, 1, this.f6860, i, false);
        C2745.m14531(parcel, r0);
    }
}
