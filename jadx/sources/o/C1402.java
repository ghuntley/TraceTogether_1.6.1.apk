package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɪј  reason: contains not printable characters */
public final class C1402 implements Parcelable.Creator<C1422> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1422[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C1384 r4 = null;
        while (parcel.dataPosition() < r0) {
            int r5 = C1498.m8909(parcel);
            int r6 = C1498.m8898(r5);
            if (r6 == 2) {
                str = C1498.m8904(parcel, r5);
            } else if (r6 == 3) {
                str2 = C1498.m8904(parcel, r5);
            } else if (r6 == 4) {
                str3 = C1498.m8904(parcel, r5);
            } else if (r6 != 5) {
                C1498.m8910(parcel, r5);
            } else {
                r4 = (C1384) C1498.m8902(parcel, r5, C1384.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1422(str, str2, str3, r4);
    }
}
