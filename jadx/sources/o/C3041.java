package o;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o.Ղ  reason: contains not printable characters */
public abstract class C3041 extends C2986 implements C0392 {
    /* renamed from: ǃ  reason: contains not printable characters */
    public static C0392 m15524(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C0392 ? (C0392) queryLocalInterface : new C0335(iBinder);
    }
}
