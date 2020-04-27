package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.ɪŀ  reason: contains not printable characters */
public interface C1329 extends IInterface {
    /* renamed from: ı  reason: contains not printable characters */
    void m8361(int i, Bundle bundle);

    /* renamed from: ı  reason: contains not printable characters */
    void m8362(int i, IBinder iBinder, C1633 r3);

    /* renamed from: ι  reason: contains not printable characters */
    void m8363(int i, IBinder iBinder, Bundle bundle);

    /* renamed from: o.ɪŀ$ǃ  reason: contains not printable characters */
    public static abstract class C1330 extends C0495 implements C1329 {
        public C1330() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final boolean m8364(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                m8363(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C0476.m4810(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                m8361(parcel.readInt(), (Bundle) C0476.m4810(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                m8362(parcel.readInt(), parcel.readStrongBinder(), (C1633) C0476.m4810(parcel, C1633.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
