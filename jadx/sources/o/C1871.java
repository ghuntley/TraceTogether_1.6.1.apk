package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Ιа  reason: contains not printable characters */
public final class C1871 implements Parcelable.Creator<C2076> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2076[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            boolean z = false;
            while (true) {
                if (parcel.dataPosition() < r0) {
                    int readInt = parcel.readInt();
                    int i = 65535 & readInt;
                    if (i == 1) {
                        str = C1498.m8904(parcel, readInt);
                    } else if (i == 2) {
                        str2 = C1498.m8904(parcel, readInt);
                    } else if (i == 3) {
                        str3 = C1498.m8904(parcel, readInt);
                    } else if (i == 4) {
                        str4 = C1498.m8904(parcel, readInt);
                    } else if (i != 5) {
                        C1498.m8910(parcel, readInt);
                    } else {
                        C1498.m8908(parcel, readInt, 4);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                    }
                } else {
                    C1498.m8901(parcel, r0);
                    return new C2076(str, str2, str3, str4, z);
                }
            }
        }
    }
}
