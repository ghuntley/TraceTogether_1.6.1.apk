package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.чɪ  reason: contains not printable characters */
public final class C2501 implements Parcelable.Creator<C2433> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2433[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < r0) {
            int r2 = C1498.m8909(parcel);
            if (C1498.m8898(r2) != 2) {
                C1498.m8910(parcel, r2);
            } else {
                bundle = C1498.m8916(parcel, r2);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2433(bundle);
    }
}
