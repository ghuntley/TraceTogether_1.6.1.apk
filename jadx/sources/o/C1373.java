package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɪͻ  reason: contains not printable characters */
public final class C1373 implements Parcelable.Creator<C1436> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1436[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < r0) {
            int r1 = C1498.m8909(parcel);
            switch (C1498.m8898(r1)) {
                case 2:
                    str = C1498.m8904(parcel, r1);
                    break;
                case 3:
                    str2 = C1498.m8904(parcel, r1);
                    break;
                case 4:
                    str3 = C1498.m8904(parcel, r1);
                    break;
                case 5:
                    str4 = C1498.m8904(parcel, r1);
                    break;
                case 6:
                    str5 = C1498.m8904(parcel, r1);
                    break;
                case 7:
                    str6 = C1498.m8904(parcel, r1);
                    break;
                case 8:
                    str7 = C1498.m8904(parcel, r1);
                    break;
                default:
                    C1498.m8910(parcel, r1);
                    break;
            }
        }
        C1498.m8901(parcel, r0);
        return new C1436(str, str2, str3, str4, str5, str6, str7);
    }
}
