package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɨɺ  reason: contains not printable characters */
public final class C1215 implements Parcelable.Creator<C1177> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1177[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < r0) {
            int r4 = C1498.m8909(parcel);
            int r5 = C1498.m8898(r4);
            if (r5 == 1) {
                str = C1498.m8904(parcel, r4);
            } else if (r5 == 2) {
                str2 = C1498.m8904(parcel, r4);
            } else if (r5 != 3) {
                C1498.m8910(parcel, r4);
            } else {
                str3 = C1498.m8904(parcel, r4);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1177(str, str2, str3);
    }
}
