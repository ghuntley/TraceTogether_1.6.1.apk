package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.ɨΙ  reason: contains not printable characters */
public interface C1217 extends IInterface {
    /* renamed from: ι  reason: contains not printable characters */
    void m7891(String[] strArr);

    /* renamed from: o.ɨΙ$ǃ  reason: contains not printable characters */
    public static abstract class C1218 extends Binder implements C1217 {
        public IBinder asBinder() {
            return this;
        }

        public C1218() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public static C1217 m7892(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1217)) {
                return new If(iBinder);
            }
            return (C1217) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                m7891(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }

        /* renamed from: o.ɨΙ$ǃ$If */
        static class If implements C1217 {

            /* renamed from: ι  reason: contains not printable characters */
            private IBinder f6903;

            If(IBinder iBinder) {
                this.f6903 = iBinder;
            }

            public final IBinder asBinder() {
                return this.f6903;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public final void m7893(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f6903.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
