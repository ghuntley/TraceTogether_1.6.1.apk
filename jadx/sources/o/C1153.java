package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɟȷ  reason: contains not printable characters */
public final class C1153 implements Parcelable.Creator<C1175> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1175[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        C1522 r1 = null;
        while (parcel.dataPosition() < r0) {
            int r2 = C1498.m8909(parcel);
            if (C1498.m8898(r2) != 1) {
                C1498.m8910(parcel, r2);
            } else {
                r1 = (C1522) C1498.m8902(parcel, r2, C1522.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1175(r1);
    }
}
