package o;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: o.Լı  reason: contains not printable characters */
public abstract class C3031 extends C0498 implements C3117 {
    public C3031() {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthCallbacks");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m15493(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                m15808((C1383) C1064.m7350(parcel, C1383.CREATOR));
                return true;
            case 2:
                m15809((C1383) C1064.m7350(parcel, C1383.CREATOR), (C1314) C1064.m7350(parcel, C1314.CREATOR));
                return true;
            case 3:
                C1064.m7350(parcel, C1341.CREATOR);
                m15803();
                return true;
            case 4:
                C1064.m7350(parcel, C1422.CREATOR);
                m15810();
                return true;
            case 5:
                m15811((Status) C1064.m7350(parcel, Status.CREATOR));
                return true;
            case 6:
                m15800();
                return true;
            case 7:
                m15806();
                return true;
            case 8:
                parcel.readString();
                m15804();
                return true;
            case 9:
                m15813(parcel.readString());
                return true;
            case 10:
                m15805((C2288) C1064.m7350(parcel, C2288.CREATOR));
                return true;
            case 11:
                m15801(parcel.readString());
                return true;
            case 12:
                m15812((Status) C1064.m7350(parcel, Status.CREATOR), (C2288) C1064.m7350(parcel, C2288.CREATOR));
                return true;
            case 13:
                m15802();
                return true;
            case 14:
                m15807((C1222) C1064.m7350(parcel, C1222.CREATOR));
                return true;
            case 15:
                m15814((C1220) C1064.m7350(parcel, C1220.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
