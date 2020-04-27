package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɪЈ  reason: contains not printable characters */
public final class C1387 implements Parcelable.Creator<C1383> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1383[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < r0) {
            int r1 = C1498.m8909(parcel);
            int r2 = C1498.m8898(r1);
            if (r2 == 2) {
                str = C1498.m8904(parcel, r1);
            } else if (r2 == 3) {
                str2 = C1498.m8904(parcel, r1);
            } else if (r2 == 4) {
                l = C1498.m8913(parcel, r1);
            } else if (r2 == 5) {
                str3 = C1498.m8904(parcel, r1);
            } else if (r2 != 6) {
                C1498.m8910(parcel, r1);
            } else {
                l2 = C1498.m8913(parcel, r1);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1383(str, str2, l, str3, l2);
    }
}
