package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.ɨј  reason: contains not printable characters */
public final class C1224 implements Parcelable.Creator<C1220> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1220[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        ArrayList<C1384> arrayList = null;
        C1630 r3 = null;
        while (parcel.dataPosition() < r0) {
            int r4 = C1498.m8909(parcel);
            int r5 = C1498.m8898(r4);
            if (r5 == 1) {
                str = C1498.m8904(parcel, r4);
            } else if (r5 == 2) {
                arrayList = C1498.m8894(parcel, r4, C1384.CREATOR);
            } else if (r5 != 3) {
                C1498.m8910(parcel, r4);
            } else {
                r3 = (C1630) C1498.m8902(parcel, r4, C1630.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1220(str, arrayList, r3);
    }
}
