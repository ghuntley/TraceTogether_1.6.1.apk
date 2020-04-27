package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: o.ʍ  reason: contains not printable characters */
public final class C1643 implements Parcelable.Creator<C1446> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1446[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < r0) {
            int r5 = C1498.m8909(parcel);
            int r6 = C1498.m8898(r5);
            if (r6 == 1) {
                i = C1498.m8907(parcel, r5);
            } else if (r6 == 2) {
                i2 = C1498.m8907(parcel, r5);
            } else if (r6 == 3) {
                i3 = C1498.m8907(parcel, r5);
            } else if (r6 != 4) {
                C1498.m8910(parcel, r5);
            } else {
                scopeArr = (Scope[]) C1498.m8912(parcel, r5, Scope.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1446(i, i2, i3, scopeArr);
    }
}
