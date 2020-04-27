package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: o.ͼι  reason: contains not printable characters */
public final class C1753 extends C0480 implements C1329 {
    C1753(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m9831(int i, IBinder iBinder, Bundle bundle) {
        Parcel r0 = m4820();
        r0.writeInt(i);
        r0.writeStrongBinder(iBinder);
        C0476.m4809(r0, bundle);
        m4819(1, r0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9829(int i, Bundle bundle) {
        Parcel r0 = m4820();
        r0.writeInt(i);
        C0476.m4809(r0, bundle);
        m4819(2, r0);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m9830(int i, IBinder iBinder, C1633 r4) {
        Parcel r0 = m4820();
        r0.writeInt(i);
        r0.writeStrongBinder(iBinder);
        C0476.m4809(r0, r4);
        m4819(3, r0);
    }
}
