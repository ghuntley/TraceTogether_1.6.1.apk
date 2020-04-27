package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ιе  reason: contains not printable characters */
public final class C2048 implements Parcelable.Creator<C2229> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2229[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < r0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C1498.m8904(parcel, readInt);
            } else if (i != 2) {
                C1498.m8910(parcel, readInt);
            } else {
                str2 = C1498.m8904(parcel, readInt);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2229(str, str2);
    }
}
