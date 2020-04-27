package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C2219;

/* renamed from: o.Ω  reason: contains not printable characters */
public final class C1926 implements Parcelable.Creator<C2219.C2221> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2219.C2221[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        while (parcel.dataPosition() < r0) {
            C1498.m8910(parcel, parcel.readInt());
        }
        C1498.m8901(parcel, r0);
        return new C2219.C2221();
    }
}
