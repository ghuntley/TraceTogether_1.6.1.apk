package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.Π  reason: contains not printable characters */
public class C1912 implements IInterface {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final IBinder f9657;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f9658;

    public C1912(IBinder iBinder, String str) {
        this.f9657 = iBinder;
        this.f9658 = str;
    }

    public IBinder asBinder() {
        return this.f9657;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final Parcel m10390() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9658);
        return obtain;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Parcel m10392(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f9657.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m10391(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9657.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
