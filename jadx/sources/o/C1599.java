package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ʁΙ  reason: contains not printable characters */
public final class C1599 implements Parcelable.Creator<C2288> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2288[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        while (true) {
            boolean z2 = false;
            while (true) {
                if (parcel.dataPosition() < r0) {
                    int readInt = parcel.readInt();
                    switch (65535 & readInt) {
                        case 1:
                            str = C1498.m8904(parcel, readInt);
                            break;
                        case 2:
                            str2 = C1498.m8904(parcel, readInt);
                            break;
                        case 3:
                            C1498.m8908(parcel, readInt, 4);
                            if (parcel.readInt() == 0) {
                                z = false;
                                break;
                            } else {
                                z = true;
                                break;
                            }
                        case 4:
                            str3 = C1498.m8904(parcel, readInt);
                            break;
                        case 5:
                            C1498.m8908(parcel, readInt, 4);
                            if (parcel.readInt() != 0) {
                                z2 = true;
                                break;
                            }
                        case 6:
                            str4 = C1498.m8904(parcel, readInt);
                            break;
                        case 7:
                            str5 = C1498.m8904(parcel, readInt);
                            break;
                        default:
                            C1498.m8910(parcel, readInt);
                            break;
                    }
                } else {
                    C1498.m8901(parcel, r0);
                    return new C2288(str, str2, z, str3, z2, str4, str5);
                }
            }
        }
    }
}
