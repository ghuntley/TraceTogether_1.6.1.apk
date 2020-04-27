package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ʋǃ  reason: contains not printable characters */
public final class C1633 extends C1519 {
    public static final Parcelable.Creator<C1633> CREATOR = new C1672();

    /* renamed from: ɩ  reason: contains not printable characters */
    Bundle f8593;

    /* renamed from: Ι  reason: contains not printable characters */
    C2847[] f8594;

    C1633(Bundle bundle, C2847[] r2) {
        this.f8593 = bundle;
        this.f8594 = r2;
    }

    public C1633() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r0 = C2745.m14517(parcel);
        C2745.m14541(parcel, 1, this.f8593, false);
        C2745.m14534(parcel, 2, this.f8594, i, false);
        C2745.m14531(parcel, r0);
    }
}
