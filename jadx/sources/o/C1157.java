package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: o.ɟɹ  reason: contains not printable characters */
public final class C1157 implements Parcelable.Creator<Status> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < r0) {
            int r5 = C1498.m8909(parcel);
            int r6 = C1498.m8898(r5);
            if (r6 == 1) {
                i2 = C1498.m8907(parcel, r5);
            } else if (r6 == 2) {
                str = C1498.m8904(parcel, r5);
            } else if (r6 == 3) {
                pendingIntent = (PendingIntent) C1498.m8902(parcel, r5, PendingIntent.CREATOR);
            } else if (r6 != 1000) {
                C1498.m8910(parcel, r5);
            } else {
                i = C1498.m8907(parcel, r5);
            }
        }
        C1498.m8901(parcel, r0);
        return new Status(i, i2, str, pendingIntent);
    }
}
