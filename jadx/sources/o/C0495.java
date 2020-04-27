package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o.ŀł  reason: contains not printable characters */
public class C0495 extends Binder implements IInterface {

    /* renamed from: ι  reason: contains not printable characters */
    private static C0494 f4160;

    public C0495(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public boolean m4870(int i, Parcel parcel, Parcel parcel2, int i2) {
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
        return m4870(i, parcel, parcel2, i2);
    }
}
