package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɪс  reason: contains not printable characters */
public final class C1392 implements Parcelable.Creator<C1384> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1384[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < r0) {
            int r1 = C1498.m8909(parcel);
            int r2 = C1498.m8898(r1);
            if (r2 == 1) {
                str = C1498.m8904(parcel, r1);
            } else if (r2 == 2) {
                str2 = C1498.m8904(parcel, r1);
            } else if (r2 == 3) {
                str3 = C1498.m8904(parcel, r1);
            } else if (r2 != 4) {
                C1498.m8910(parcel, r1);
            } else {
                j = C1498.m8899(parcel, r1);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1384(str, str2, str3, j);
    }
}
