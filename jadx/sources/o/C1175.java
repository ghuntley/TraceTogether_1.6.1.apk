package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɣ  reason: contains not printable characters */
public final class C1175 extends C1519 {
    public static final Parcelable.Creator<C1175> CREATOR = new C1153();

    /* renamed from: Ι  reason: contains not printable characters */
    private final C1522 f6772;

    public C1175(C1522 r1) {
        this.f6772 = r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C1522 m7696() {
        return this.f6772;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14542(parcel, 1, this.f6772, i, false);
        C2745.m14531(parcel, r0);
    }
}
