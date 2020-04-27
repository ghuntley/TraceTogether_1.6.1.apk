package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.јӏ  reason: contains not printable characters */
public final class C2631 implements Parcelable.Creator<C2587> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2587[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < r0) {
            int r5 = C1498.m8909(parcel);
            int r6 = C1498.m8898(r5);
            if (r6 == 1) {
                str = C1498.m8904(parcel, r5);
            } else if (r6 == 2) {
                iBinder = C1498.m8900(parcel, r5);
            } else if (r6 == 3) {
                z = C1498.m8896(parcel, r5);
            } else if (r6 != 4) {
                C1498.m8910(parcel, r5);
            } else {
                z2 = C1498.m8896(parcel, r5);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2587(str, iBinder, z, z2);
    }
}
