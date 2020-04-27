package o;

import android.os.IBinder;
import android.os.Parcel;
import o.C2722;

/* renamed from: o.ʊ  reason: contains not printable characters */
public final class C1629 extends C0396 implements C1414 {
    C1629(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2722 m9392(C2722 r2, C1446 r3) {
        Parcel r0 = m4662();
        C0454.m4778(r0, r2);
        C0454.m4776(r0, r3);
        Parcel r22 = m4661(2, r0);
        C2722 r32 = C2722.If.m14456(r22.readStrongBinder());
        r22.recycle();
        return r32;
    }
}
