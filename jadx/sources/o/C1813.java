package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Ιɐ  reason: contains not printable characters */
public final class C1813 implements Parcelable.Creator<C2316> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2316[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        while (parcel.dataPosition() < r0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C1498.m8910(parcel, readInt);
            } else {
                str = C1498.m8904(parcel, readInt);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2316(str);
    }
}
