package o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.Ӏʝ  reason: contains not printable characters */
public final class C2805 implements Parcelable.Creator<C2765> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2765[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        C2822 r1 = null;
        int i = 0;
        C1334 r3 = null;
        while (parcel.dataPosition() < r0) {
            int r4 = C1498.m8909(parcel);
            int r5 = C1498.m8898(r4);
            if (r5 == 1) {
                i = C1498.m8907(parcel, r4);
            } else if (r5 == 2) {
                r1 = (C2822) C1498.m8902(parcel, r4, C2822.CREATOR);
            } else if (r5 != 3) {
                C1498.m8910(parcel, r4);
            } else {
                r3 = (C1334) C1498.m8902(parcel, r4, C1334.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2765(i, r1, r3);
    }
}
