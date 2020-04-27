package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: o.Ϝǃ  reason: contains not printable characters */
public final class C2150 extends C1912 implements C2137 {
    C2150(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m11335(String str, String str2, Bundle bundle, long j) {
        Parcel r0 = m10390();
        r0.writeString(str);
        r0.writeString(str2);
        C2165.m11475(r0, bundle);
        r0.writeLong(j);
        m10391(1, r0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final int m11334() {
        Parcel r0 = m10392(2, m10390());
        int readInt = r0.readInt();
        r0.recycle();
        return readInt;
    }
}
