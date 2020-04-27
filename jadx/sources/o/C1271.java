package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: o.ɩʇ  reason: contains not printable characters */
public final class C1271 implements Parcelable.Creator<C1222> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1222[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        Status status = null;
        C1630 r2 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < r0) {
            int r5 = C1498.m8909(parcel);
            int r6 = C1498.m8898(r5);
            if (r6 == 1) {
                status = (Status) C1498.m8902(parcel, r5, Status.CREATOR);
            } else if (r6 == 2) {
                r2 = (C1630) C1498.m8902(parcel, r5, C1630.CREATOR);
            } else if (r6 == 3) {
                str = C1498.m8904(parcel, r5);
            } else if (r6 != 4) {
                C1498.m8910(parcel, r5);
            } else {
                str2 = C1498.m8904(parcel, r5);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1222(status, r2, str, str2);
    }
}
