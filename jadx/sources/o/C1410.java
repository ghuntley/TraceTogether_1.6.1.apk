package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɪյ  reason: contains not printable characters */
public final class C1410 implements Parcelable.Creator<C1145> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1145[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < r0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                C1498.m8908(parcel, readInt, 8);
                j = parcel.readLong();
            } else if (i != 2) {
                C1498.m8910(parcel, readInt);
            } else {
                C1498.m8908(parcel, readInt, 8);
                j2 = parcel.readLong();
            }
        }
        C1498.m8901(parcel, r0);
        return new C1145(j, j2);
    }
}
