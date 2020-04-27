package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* renamed from: o.ιɈ  reason: contains not printable characters */
public final class C1974 implements Parcelable.Creator<WakeLockEvent> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r1 = C1498.m8906(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < r1) {
            int r2 = C1498.m8909(parcel);
            switch (C1498.m8898(r2)) {
                case 1:
                    i = C1498.m8907(parcel2, r2);
                    break;
                case 2:
                    j = C1498.m8899(parcel2, r2);
                    break;
                case 4:
                    str = C1498.m8904(parcel2, r2);
                    break;
                case 5:
                    i3 = C1498.m8907(parcel2, r2);
                    break;
                case 6:
                    arrayList = C1498.m8905(parcel2, r2);
                    break;
                case 8:
                    j2 = C1498.m8899(parcel2, r2);
                    break;
                case 10:
                    str3 = C1498.m8904(parcel2, r2);
                    break;
                case 11:
                    i2 = C1498.m8907(parcel2, r2);
                    break;
                case 12:
                    str2 = C1498.m8904(parcel2, r2);
                    break;
                case 13:
                    str4 = C1498.m8904(parcel2, r2);
                    break;
                case 14:
                    i4 = C1498.m8907(parcel2, r2);
                    break;
                case 15:
                    f = C1498.m8914(parcel2, r2);
                    break;
                case 16:
                    j3 = C1498.m8899(parcel2, r2);
                    break;
                case 17:
                    str5 = C1498.m8904(parcel2, r2);
                    break;
                case 18:
                    z = C1498.m8896(parcel2, r2);
                    break;
                default:
                    C1498.m8910(parcel2, r2);
                    break;
            }
        }
        C1498.m8901(parcel2, r1);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }
}
