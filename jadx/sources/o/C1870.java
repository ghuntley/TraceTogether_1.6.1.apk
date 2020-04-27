package o;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: o.ΙГ  reason: contains not printable characters */
public abstract class C1870 extends C0495 implements C1775 {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1775 m10256(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C1775) {
            return (C1775) queryLocalInterface;
        }
        return new C1777(iBinder);
    }
}
