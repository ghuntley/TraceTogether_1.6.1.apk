package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.ĸι  reason: contains not printable characters */
public class C0480 implements IInterface {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f4109;

    /* renamed from: ι  reason: contains not printable characters */
    private final IBinder f4110;

    public C0480(IBinder iBinder, String str) {
        this.f4110 = iBinder;
        this.f4109 = str;
    }

    public IBinder asBinder() {
        return this.f4110;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Parcel m4820() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4109);
        return obtain;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Parcel m4821(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f4110.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m4819(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4110.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
