package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɔɪ  reason: contains not printable characters */
public final class C1110 implements Parcelable.Creator<C1156> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1156[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        C1494 r1 = null;
        while (parcel.dataPosition() < r0) {
            int r2 = C1498.m8909(parcel);
            if (C1498.m8898(r2) != 1) {
                C1498.m8910(parcel, r2);
            } else {
                r1 = (C1494) C1498.m8902(parcel, r2, C1494.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1156(r1);
    }
}
