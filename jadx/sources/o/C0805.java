package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ƶɹ  reason: contains not printable characters */
public final class C0805 implements Parcelable.Creator<C1096> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1096[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        String str = null;
        String str2 = null;
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
                    } else if (i != 3) {
                        C1498.m8910(parcel, readInt);
                    } else {
                        C1498.m8908(parcel, readInt, 4);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                    }
                } else {
                    C1498.m8901(parcel, r0);
                    return new C1096(str, str2, z);
                }
            }
        }
    }
}
