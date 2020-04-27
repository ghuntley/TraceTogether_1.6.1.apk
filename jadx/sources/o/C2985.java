package o;

import android.os.IBinder;
import android.os.Parcel;
import o.C2722;

/* renamed from: o.ԛ  reason: contains not printable characters */
public final class C2985 extends C0480 implements C2956 {
    public C2985(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2722 m15312(C2722 r2, String str, int i) {
        Parcel r0 = m4820();
        C0476.m4812(r0, r2);
        r0.writeString(str);
        r0.writeInt(i);
        Parcel r22 = m4821(2, r0);
        C2722 r3 = C2722.If.m14456(r22.readStrongBinder());
        r22.recycle();
        return r3;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final int m15311(C2722 r2, String str, boolean z) {
        Parcel r0 = m4820();
        C0476.m4812(r0, r2);
        r0.writeString(str);
        C0476.m4808(r0, z);
        Parcel r22 = m4821(3, r0);
        int readInt = r22.readInt();
        r22.recycle();
        return readInt;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C2722 m15309(C2722 r2, String str, int i) {
        Parcel r0 = m4820();
        C0476.m4812(r0, r2);
        r0.writeString(str);
        r0.writeInt(i);
        Parcel r22 = m4821(4, r0);
        C2722 r3 = C2722.If.m14456(r22.readStrongBinder());
        r22.recycle();
        return r3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final int m15308(C2722 r2, String str, boolean z) {
        Parcel r0 = m4820();
        C0476.m4812(r0, r2);
        r0.writeString(str);
        C0476.m4808(r0, z);
        Parcel r22 = m4821(5, r0);
        int readInt = r22.readInt();
        r22.recycle();
        return readInt;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m15310() {
        Parcel r0 = m4821(6, m4820());
        int readInt = r0.readInt();
        r0.recycle();
        return readInt;
    }
}
