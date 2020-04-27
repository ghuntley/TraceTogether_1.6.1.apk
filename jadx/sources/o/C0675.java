package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.Ɨƚ  reason: contains not printable characters */
public class C0675 implements IInterface {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f4819;

    /* renamed from: ι  reason: contains not printable characters */
    private final IBinder f4820;

    public C0675(IBinder iBinder, String str) {
        this.f4820 = iBinder;
        this.f4819 = str;
    }

    public IBinder asBinder() {
        return this.f4820;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Parcel m5546() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4819);
        return obtain;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m5545(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f4820.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
