package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ʁІ  reason: contains not printable characters */
public final class C1601 implements Parcelable.Creator<C1673> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1673[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < r0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C1498.m8904(parcel, readInt);
            } else if (i == 2) {
                str2 = C1498.m8904(parcel, readInt);
            } else if (i == 3) {
                C1498.m8908(parcel, readInt, 8);
                j = parcel.readLong();
            } else if (i != 4) {
                C1498.m8910(parcel, readInt);
            } else {
                str3 = C1498.m8904(parcel, readInt);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1673(str, str2, j, str3);
    }
}
