package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.ɭʝ  reason: contains not printable characters */
public final class C1441 implements Parcelable.Creator<C1592> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1592[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        ArrayList<C1673> arrayList = null;
        while (parcel.dataPosition() < r0) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                str = C1498.m8904(parcel, readInt);
            } else if (i == 2) {
                str2 = C1498.m8904(parcel, readInt);
            } else if (i != 3) {
                C1498.m8910(parcel, readInt);
            } else {
                arrayList = C1498.m8894(parcel, readInt, C1673.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1592(str, str2, arrayList);
    }
}
