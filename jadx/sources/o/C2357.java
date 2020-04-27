package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ГІ  reason: contains not printable characters */
public final class C2357 implements Parcelable.Creator<C2847> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2847[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < r0) {
            int r5 = C1498.m8909(parcel);
            int r6 = C1498.m8898(r5);
            if (r6 == 1) {
                str = C1498.m8904(parcel, r5);
            } else if (r6 == 2) {
                i = C1498.m8907(parcel, r5);
            } else if (r6 != 3) {
                C1498.m8910(parcel, r5);
            } else {
                j = C1498.m8899(parcel, r5);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2847(str, i, j);
    }
}
