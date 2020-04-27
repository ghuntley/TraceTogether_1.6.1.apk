package o;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: o.ıɤ  reason: contains not printable characters */
public final class C0335 extends C3001 implements C0392 {
    C0335(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m4431(boolean z) {
        Parcel f_ = f_();
        C3039.m15521(f_, true);
        Parcel r2 = m15388(2, f_);
        boolean r0 = C3039.m15522(r2);
        r2.recycle();
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m4432() {
        Parcel r0 = m15388(6, f_());
        boolean r1 = C3039.m15522(r0);
        r0.recycle();
        return r1;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m4433() {
        Parcel r0 = m15388(1, f_());
        String readString = r0.readString();
        r0.recycle();
        return readString;
    }
}
