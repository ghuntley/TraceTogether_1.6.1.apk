package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.іʝ  reason: contains not printable characters */
public final class C2594 implements Parcelable.Creator<C2698> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2698[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < r0) {
            int r4 = C1498.m8909(parcel);
            int r5 = C1498.m8898(r4);
            if (r5 == 1) {
                i = C1498.m8907(parcel, r4);
            } else if (r5 == 2) {
                i2 = C1498.m8907(parcel, r4);
            } else if (r5 != 3) {
                C1498.m8910(parcel, r4);
            } else {
                intent = (Intent) C1498.m8902(parcel, r4, Intent.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2698(i, i2, intent);
    }
}
