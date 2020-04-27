package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Ӏͱ  reason: contains not printable characters */
public final class C2809 implements Parcelable.Creator<C2821> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2821[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        int i = 0;
        C1415 r2 = null;
        while (parcel.dataPosition() < r0) {
            int r3 = C1498.m8909(parcel);
            int r4 = C1498.m8898(r3);
            if (r4 == 1) {
                i = C1498.m8907(parcel, r3);
            } else if (r4 != 2) {
                C1498.m8910(parcel, r3);
            } else {
                r2 = (C1415) C1498.m8902(parcel, r3, C1415.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2821(i, r2);
    }
}
