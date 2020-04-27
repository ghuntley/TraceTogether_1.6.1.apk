package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ʙı  reason: contains not printable characters */
public final class C1662 implements Parcelable.Creator<C2388> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2388[i];
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
        return new C2388(str, str2);
    }
}
