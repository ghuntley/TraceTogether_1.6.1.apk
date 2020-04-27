package o;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: o.υӀ  reason: contains not printable characters */
public abstract class C2132 extends C2537 implements C2137 {
    public C2132() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m11304(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            m11311(parcel.readString(), parcel.readString(), (Bundle) C2165.m11471(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int r7 = m11310();
            parcel2.writeNoException();
            parcel2.writeInt(r7);
        }
        return true;
    }
}
