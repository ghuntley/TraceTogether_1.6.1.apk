package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɍƚ  reason: contains not printable characters */
public final class C1067 implements Parcelable.Creator<C1070> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1070[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        C2288 r2 = null;
        while (parcel.dataPosition() < r0) {
            int r3 = C1498.m8909(parcel);
            int r4 = C1498.m8898(r3);
            if (r4 == 1) {
                str = C1498.m8904(parcel, r3);
            } else if (r4 != 2) {
                C1498.m8910(parcel, r3);
            } else {
                r2 = (C2288) C1498.m8902(parcel, r3, C2288.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1070(str, r2);
    }
}
