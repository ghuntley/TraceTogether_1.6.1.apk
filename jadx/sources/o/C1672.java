package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ʚ  reason: contains not printable characters */
public final class C1672 implements Parcelable.Creator<C1633> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1633[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        Bundle bundle = null;
        C2847[] r2 = null;
        while (parcel.dataPosition() < r0) {
            int r3 = C1498.m8909(parcel);
            int r4 = C1498.m8898(r3);
            if (r4 == 1) {
                bundle = C1498.m8916(parcel, r3);
            } else if (r4 != 2) {
                C1498.m8910(parcel, r3);
            } else {
                r2 = (C2847[]) C1498.m8912(parcel, r3, C2847.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1633(bundle, r2);
    }
}
