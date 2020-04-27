package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɻȷ  reason: contains not printable characters */
public final class C1486 implements Parcelable.Creator<C1494> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1494[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < r0) {
            int r1 = C1498.m8909(parcel);
            switch (C1498.m8898(r1)) {
                case 1:
                    str = C1498.m8904(parcel, r1);
                    break;
                case 2:
                    j = C1498.m8899(parcel, r1);
                    break;
                case 3:
                    z = C1498.m8896(parcel, r1);
                    break;
                case 4:
                    str2 = C1498.m8904(parcel, r1);
                    break;
                case 5:
                    str3 = C1498.m8904(parcel, r1);
                    break;
                case 6:
                    str4 = C1498.m8904(parcel, r1);
                    break;
                default:
                    C1498.m8910(parcel, r1);
                    break;
            }
        }
        C1498.m8901(parcel, r0);
        return new C1494(str, j, z, str2, str3, str4);
    }
}
