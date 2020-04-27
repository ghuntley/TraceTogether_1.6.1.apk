package o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.ԧı  reason: contains not printable characters */
public class C3001 implements IInterface {

    /* renamed from: ı  reason: contains not printable characters */
    private final String f13851;

    /* renamed from: Ι  reason: contains not printable characters */
    private final IBinder f13852;

    protected C3001(IBinder iBinder, String str) {
        this.f13852 = iBinder;
        this.f13851 = str;
    }

    public IBinder asBinder() {
        return this.f13852;
    }

    /* access modifiers changed from: protected */
    public final Parcel f_() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13851);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final Parcel m15388(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f13852.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
