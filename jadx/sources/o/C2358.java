package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ГӀ  reason: contains not printable characters */
public final class C2358 implements Parcelable.Creator<C2822> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C2822[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < r0) {
            int r5 = C1498.m8909(parcel);
            int r6 = C1498.m8898(r5);
            if (r6 == 1) {
                i = C1498.m8907(parcel, r5);
            } else if (r6 == 2) {
                i2 = C1498.m8907(parcel, r5);
            } else if (r6 == 3) {
                pendingIntent = (PendingIntent) C1498.m8902(parcel, r5, PendingIntent.CREATOR);
            } else if (r6 != 4) {
                C1498.m8910(parcel, r5);
            } else {
                str = C1498.m8904(parcel, r5);
            }
        }
        C1498.m8901(parcel, r0);
        return new C2822(i, i2, pendingIntent, str);
    }
}
