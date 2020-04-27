package o;

import android.os.IBinder;
import android.os.Parcel;
import o.C2722;

/* renamed from: o.ΓΙ  reason: contains not printable characters */
public final class C1774 extends C0480 implements C1763 {
    C1774(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2722 m9888() {
        Parcel r0 = m4821(1, m4820());
        C2722 r1 = C2722.If.m14456(r0.readStrongBinder());
        r0.recycle();
        return r1;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m9887() {
        Parcel r0 = m4821(2, m4820());
        int readInt = r0.readInt();
        r0.recycle();
        return readInt;
    }
}
