package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ɐІ  reason: contains not printable characters */
public final class C1098 implements Parcelable.Creator<C0980> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C0980[i];
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
        while (true) {
            boolean z = false;
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
                            str5 = C1498.m8904(parcel, readInt);
                            break;
                        case 4:
                            str4 = C1498.m8904(parcel, readInt);
                            break;
                        case 5:
                            str3 = C1498.m8904(parcel, readInt);
                            break;
                        case 6:
                            str6 = C1498.m8904(parcel, readInt);
                            break;
                        case 7:
                            C1498.m8908(parcel, readInt, 4);
                            if (parcel.readInt() != 0) {
                                z = true;
                                break;
                            }
                        case 8:
                            str7 = C1498.m8904(parcel, readInt);
                            break;
                        default:
                            C1498.m8910(parcel, readInt);
                            break;
                    }
                } else {
                    C1498.m8901(parcel, r0);
                    return new C0980(str, str2, str3, str4, str5, str6, z, str7);
                }
            }
        }
    }
}
