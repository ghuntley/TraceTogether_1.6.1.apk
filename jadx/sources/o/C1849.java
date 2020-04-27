package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ΙΓ  reason: contains not printable characters */
public final class C1849 implements Parcelable.Creator<C1776> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1776[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        int i = 0;
        while (parcel.dataPosition() < r0) {
            int r2 = C1498.m8909(parcel);
            if (C1498.m8898(r2) != 1) {
                C1498.m8910(parcel, r2);
            } else {
                i = C1498.m8907(parcel, r2);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1776(i);
    }
}
