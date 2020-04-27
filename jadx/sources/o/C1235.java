package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o.C1217;

/* renamed from: o.ɩŀ  reason: contains not printable characters */
public interface C1235 extends IInterface {
    /* renamed from: ι  reason: contains not printable characters */
    int m7984(C1217 r1, String str);

    /* renamed from: ι  reason: contains not printable characters */
    void m7985(int i, String[] strArr);

    /* renamed from: ι  reason: contains not printable characters */
    void m7986(C1217 r1, int i);

    /* renamed from: o.ɩŀ$ɩ  reason: contains not printable characters */
    public static abstract class C1236 extends Binder implements C1235 {
        public IBinder asBinder() {
            return this;
        }

        public C1236() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int r4 = m7984(C1217.C1218.m7892(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(r4);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                m7986(C1217.C1218.m7892(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                m7985(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }

        /* renamed from: o.ɩŀ$ɩ$ɩ  reason: contains not printable characters */
        static class C1237 implements C1235 {

            /* renamed from: ǃ  reason: contains not printable characters */
            private IBinder f7013;

            C1237(IBinder iBinder) {
                this.f7013 = iBinder;
            }

            public final IBinder asBinder() {
                return this.f7013;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final int m7987(C1217 r4, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(r4 != null ? r4.asBinder() : null);
                    obtain.writeString(str);
                    this.f7013.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m7989(C1217 r4, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(r4 != null ? r4.asBinder() : null);
                    obtain.writeInt(i);
                    this.f7013.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m7988(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f7013.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
