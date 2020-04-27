package o;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: o.ϳǀ  reason: contains not printable characters */
public abstract class C2185 extends C2537 implements C1818 {
    public C2185() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m11572(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        m10015((Bundle) C2165.m11471(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
