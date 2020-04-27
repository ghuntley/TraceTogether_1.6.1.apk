package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.ŀƗ  reason: contains not printable characters */
public class C0498 extends Binder implements IInterface {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C1051 f4190;

    public C0498(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m4883(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return m4883(i, parcel, parcel2, i2);
    }
}
