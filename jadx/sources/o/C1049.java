package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɉΙ  reason: contains not printable characters */
public final class C1049 implements Parcelable.Creator<C1040> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1040[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        while (parcel.dataPosition() < r0) {
            int r2 = C1498.m8909(parcel);
            if (C1498.m8898(r2) != 1) {
                C1498.m8910(parcel, r2);
            } else {
                str = C1498.m8904(parcel, r2);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1040(str);
    }
}
