package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ϳϳ  reason: contains not printable characters */
public final class C2190 implements Parcelable.Creator<C2193> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2193[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r1 = C1498.m8906(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        boolean z = false;
        while (parcel.dataPosition() < r1) {
            int r2 = C1498.m8909(parcel);
            switch (C1498.m8898(r2)) {
                case 1:
                    j = C1498.m8899(parcel2, r2);
                    break;
                case 2:
                    j2 = C1498.m8899(parcel2, r2);
                    break;
                case 3:
                    z = C1498.m8896(parcel2, r2);
                    break;
                case 4:
                    str = C1498.m8904(parcel2, r2);
                    break;
                case 5:
                    str2 = C1498.m8904(parcel2, r2);
                    break;
                case 6:
                    str3 = C1498.m8904(parcel2, r2);
                    break;
                case 7:
                    bundle = C1498.m8916(parcel2, r2);
                    break;
                default:
                    C1498.m8910(parcel2, r2);
                    break;
            }
        }
        C1498.m8901(parcel2, r1);
        return new C2193(j, j2, z, str, str2, str3, bundle);
    }
}
