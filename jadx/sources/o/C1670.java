package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ʙІ  reason: contains not printable characters */
public final class C1670 implements Parcelable.Creator<C1170> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1170[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < r0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                C1498.m8910(parcel, readInt);
            } else {
                bundle = C1498.m8916(parcel, readInt);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1170(bundle);
    }
}
