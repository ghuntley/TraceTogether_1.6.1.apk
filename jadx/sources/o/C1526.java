package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɽι  reason: contains not printable characters */
public final class C1526 implements Parcelable.Creator<C1522> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1522[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r1 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < r1) {
            int r2 = C1498.m8909(parcel);
            switch (C1498.m8898(r2)) {
                case 2:
                    str = C1498.m8904(parcel2, r2);
                    break;
                case 3:
                    str2 = C1498.m8904(parcel2, r2);
                    break;
                case 4:
                    str3 = C1498.m8904(parcel2, r2);
                    break;
                case 5:
                    str4 = C1498.m8904(parcel2, r2);
                    break;
                case 6:
                    str5 = C1498.m8904(parcel2, r2);
                    break;
                case 7:
                    str6 = C1498.m8904(parcel2, r2);
                    break;
                case 8:
                    str7 = C1498.m8904(parcel2, r2);
                    break;
                case 9:
                    str8 = C1498.m8904(parcel2, r2);
                    break;
                case 10:
                    z = C1498.m8896(parcel2, r2);
                    break;
                case 11:
                    z2 = C1498.m8896(parcel2, r2);
                    break;
                case 12:
                    str9 = C1498.m8904(parcel2, r2);
                    break;
                case 13:
                    str10 = C1498.m8904(parcel2, r2);
                    break;
                case 14:
                    str11 = C1498.m8904(parcel2, r2);
                    break;
                case 15:
                    str12 = C1498.m8904(parcel2, r2);
                    break;
                case 16:
                    z3 = C1498.m8896(parcel2, r2);
                    break;
                case 17:
                    str13 = C1498.m8904(parcel2, r2);
                    break;
                default:
                    C1498.m8910(parcel2, r2);
                    break;
            }
        }
        C1498.m8901(parcel2, r1);
        return new C1522(str, str2, str3, str4, str5, str6, str7, str8, z, z2, str9, str10, str11, str12, z3, str13);
    }
}
