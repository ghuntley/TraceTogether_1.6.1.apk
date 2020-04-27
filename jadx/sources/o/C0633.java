package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.ƒЈ  reason: contains not printable characters */
public final class C0633 implements Parcelable.Creator<C0562> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0562[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        ArrayList<C1673> arrayList = null;
        while (parcel.dataPosition() < r0) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C1498.m8910(parcel, readInt);
            } else {
                arrayList = C1498.m8894(parcel, readInt, C1673.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C0562(arrayList);
    }
}
