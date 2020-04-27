package o;

import android.os.IBinder;
import android.os.Parcel;
import o.C2722;

/* renamed from: o.ԉ  reason: contains not printable characters */
public final class C2960 extends C0480 implements C3002 {
    public C2960(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C2722 m15222(C2722 r2, String str, int i, C2722 r5) {
        Parcel r0 = m4820();
        C0476.m4812(r0, r2);
        r0.writeString(str);
        r0.writeInt(i);
        C0476.m4812(r0, r5);
        Parcel r22 = m4821(2, r0);
        C2722 r3 = C2722.If.m14456(r22.readStrongBinder());
        r22.recycle();
        return r3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2722 m15223(C2722 r2, String str, int i, C2722 r5) {
        Parcel r0 = m4820();
        C0476.m4812(r0, r2);
        r0.writeString(str);
        r0.writeInt(i);
        C0476.m4812(r0, r5);
        Parcel r22 = m4821(3, r0);
        C2722 r3 = C2722.If.m14456(r22.readStrongBinder());
        r22.recycle();
        return r3;
    }
}
