package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ιո  reason: contains not printable characters */
public final class C2088 implements Parcelable.Creator<C2113> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2113[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r1 = C1498.m8906(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < r1) {
            int r2 = C1498.m8909(parcel);
            switch (C1498.m8898(r2)) {
                case 1:
                    i = C1498.m8907(parcel2, r2);
                    break;
                case 2:
                    str = C1498.m8904(parcel2, r2);
                    break;
                case 3:
                    j = C1498.m8899(parcel2, r2);
                    break;
                case 4:
                    l = C1498.m8913(parcel2, r2);
                    break;
                case 5:
                    f = C1498.m8915(parcel2, r2);
                    break;
                case 6:
                    str2 = C1498.m8904(parcel2, r2);
                    break;
                case 7:
                    str3 = C1498.m8904(parcel2, r2);
                    break;
                case 8:
                    d = C1498.m8897(parcel2, r2);
                    break;
                default:
                    C1498.m8910(parcel2, r2);
                    break;
            }
        }
        C1498.m8901(parcel2, r1);
        return new C2113(i, str, j, l, f, str2, str3, d);
    }
}
