package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.ɬǃ  reason: contains not printable characters */
public final class C1423 implements Parcelable.Creator<C1393> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1393[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        ArrayList<C1436> arrayList = null;
        while (parcel.dataPosition() < r0) {
            int r2 = C1498.m8909(parcel);
            if (C1498.m8898(r2) != 2) {
                C1498.m8910(parcel, r2);
            } else {
                arrayList = C1498.m8894(parcel, r2, C1436.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1393(arrayList);
    }
}
