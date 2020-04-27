package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.ͽɩ  reason: contains not printable characters */
public abstract class C1759 extends C0495 implements C1763 {
    public C1759() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1763 m9838(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C1763) {
            return (C1763) queryLocalInterface;
        }
        return new C1774(iBinder);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m9839(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C2722 r1 = m9850();
            parcel2.writeNoException();
            C0476.m4812(parcel2, r1);
        } else if (i != 2) {
            return false;
        } else {
            int r12 = m9849();
            parcel2.writeNoException();
            parcel2.writeInt(r12);
        }
        return true;
    }
}
