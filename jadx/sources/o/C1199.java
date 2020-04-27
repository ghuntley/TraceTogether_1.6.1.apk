package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: o.ɨſ  reason: contains not printable characters */
public final class C1199 implements Parcelable.Creator<Scope> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < r0) {
            int r3 = C1498.m8909(parcel);
            int r4 = C1498.m8898(r3);
            if (r4 == 1) {
                i = C1498.m8907(parcel, r3);
            } else if (r4 != 2) {
                C1498.m8910(parcel, r3);
            } else {
                str = C1498.m8904(parcel, r3);
            }
        }
        C1498.m8901(parcel, r0);
        return new Scope(i, str);
    }
}
