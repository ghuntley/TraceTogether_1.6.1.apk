package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Іʝ  reason: contains not printable characters */
public final class C2267 implements Parcelable.Creator<C2270> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2270[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r1 = C1498.m8906(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        long j6 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
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
                    j = C1498.m8899(parcel2, r2);
                    break;
                case 7:
                    j2 = C1498.m8899(parcel2, r2);
                    break;
                case 8:
                    str5 = C1498.m8904(parcel2, r2);
                    break;
                case 9:
                    z = C1498.m8896(parcel2, r2);
                    break;
                case 10:
                    z2 = C1498.m8896(parcel2, r2);
                    break;
                case 11:
                    j6 = C1498.m8899(parcel2, r2);
                    break;
                case 12:
                    str6 = C1498.m8904(parcel2, r2);
                    break;
                case 13:
                    j3 = C1498.m8899(parcel2, r2);
                    break;
                case 14:
                    j4 = C1498.m8899(parcel2, r2);
                    break;
                case 15:
                    i = C1498.m8907(parcel2, r2);
                    break;
                case 16:
                    z3 = C1498.m8896(parcel2, r2);
                    break;
                case 17:
                    z4 = C1498.m8896(parcel2, r2);
                    break;
                case 18:
                    z5 = C1498.m8896(parcel2, r2);
                    break;
                case 19:
                    str7 = C1498.m8904(parcel2, r2);
                    break;
                case 21:
                    bool = C1498.m8903(parcel2, r2);
                    break;
                case 22:
                    j5 = C1498.m8899(parcel2, r2);
                    break;
                case 23:
                    arrayList = C1498.m8905(parcel2, r2);
                    break;
                case 24:
                    str8 = C1498.m8904(parcel2, r2);
                    break;
                default:
                    C1498.m8910(parcel2, r2);
                    break;
            }
        }
        C1498.m8901(parcel2, r1);
        return new C2270(str, str2, str3, str4, j, j2, str5, z, z2, j6, str6, j3, j4, i, z3, z4, z5, str7, bool, j5, (List<String>) arrayList, str8);
    }
}
