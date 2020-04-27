package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɩя  reason: contains not printable characters */
public final class C1308 implements Parcelable.Creator<C0834> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0834[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        C1229 r1 = null;
        C1096 r2 = null;
        C1630 r3 = null;
        while (parcel.dataPosition() < r0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                r1 = (C1229) C1498.m8902(parcel, readInt, C1229.CREATOR);
            } else if (i == 2) {
                r2 = (C1096) C1498.m8902(parcel, readInt, C1096.CREATOR);
            } else if (i != 3) {
                C1498.m8910(parcel, readInt);
            } else {
                r3 = (C1630) C1498.m8902(parcel, readInt, C1630.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C0834(r1, r2, r3);
    }
}
