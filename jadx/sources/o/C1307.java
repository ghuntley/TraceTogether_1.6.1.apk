package o;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o.ɩэ  reason: contains not printable characters */
public abstract class C1307 extends C2537 implements C0304 {
    /* renamed from: Ι  reason: contains not printable characters */
    public static C0304 m8258(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C0304) {
            return (C0304) queryLocalInterface;
        }
        return new C0839(iBinder);
    }
}
