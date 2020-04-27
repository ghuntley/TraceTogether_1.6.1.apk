package o;

import android.os.Parcel;
import java.util.List;

/* renamed from: o.ιл  reason: contains not printable characters */
public abstract class C2052 extends C2537 implements C2082 {
    public C2052() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m10944(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                m11069((C2441) C2165.m11471(parcel, C2441.CREATOR), (C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                m11064((C2113) C2165.m11471(parcel, C2113.CREATOR), (C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                m11071((C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                m11059((C2441) C2165.m11471(parcel, C2441.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                m11068((C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<C2113> r7 = m11062((C2270) C2165.m11471(parcel, C2270.CREATOR), C2165.m11473(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(r7);
                return true;
            case 9:
                byte[] r72 = m11058((C2441) C2165.m11471(parcel, C2441.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(r72);
                return true;
            case 10:
                m11063(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String r73 = m11056((C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(r73);
                return true;
            case 12:
                m11067((C2527) C2165.m11471(parcel, C2527.CREATOR), (C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                m11066((C2527) C2165.m11471(parcel, C2527.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<C2113> r74 = m11061(parcel.readString(), parcel.readString(), C2165.m11473(parcel), (C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(r74);
                return true;
            case 15:
                List<C2113> r75 = m11057(parcel.readString(), parcel.readString(), parcel.readString(), C2165.m11473(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(r75);
                return true;
            case 16:
                List<C2527> r76 = m11060(parcel.readString(), parcel.readString(), (C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(r76);
                return true;
            case 17:
                List<C2527> r77 = m11070(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(r77);
                return true;
            case 18:
                m11065((C2270) C2165.m11471(parcel, C2270.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
