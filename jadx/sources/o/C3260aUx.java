package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.aUx  reason: case insensitive filesystem */
public interface C3260aUx extends IInterface {
    /* renamed from: ι  reason: contains not printable characters */
    void m1541(int i, Bundle bundle);

    /* renamed from: o.aUx$ɩ  reason: contains not printable characters */
    public static abstract class C0115 extends Binder implements C3260aUx {
        public IBinder asBinder() {
            return this;
        }

        public C0115() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                m1541(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }

        /* renamed from: o.aUx$ɩ$ɩ  reason: contains not printable characters */
        static class C0116 implements C3260aUx {

            /* renamed from: Ι  reason: contains not printable characters */
            private IBinder f1476;

            C0116(IBinder iBinder) {
                this.f1476 = iBinder;
            }

            public final IBinder asBinder() {
                return this.f1476;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m1542(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1476.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
