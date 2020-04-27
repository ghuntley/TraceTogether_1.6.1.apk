package o;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: o.ΓӀ  reason: contains not printable characters */
public final class C1777 extends C0480 implements C1775 {
    C1777(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m9890(C2587 r2, C2722 r3) {
        Parcel r0 = m4820();
        C0476.m4809(r0, r2);
        C0476.m4812(r0, r3);
        Parcel r22 = m4821(5, r0);
        boolean r32 = C0476.m4813(r22);
        r22.recycle();
        return r32;
    }
}
