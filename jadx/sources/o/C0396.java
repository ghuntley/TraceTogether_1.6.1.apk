package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.ıυ  reason: contains not printable characters */
public class C0396 implements IInterface {

    /* renamed from: Ι  reason: contains not printable characters */
    private final IBinder f3955;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f3956;

    public C0396(IBinder iBinder, String str) {
        this.f3955 = iBinder;
        this.f3956 = str;
    }

    public IBinder asBinder() {
        return this.f3955;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Parcel m4662() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f3956);
        return obtain;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Parcel m4661(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f3955.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4660(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f3955.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
