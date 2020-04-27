package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: o.ǀŀ  reason: contains not printable characters */
public final class C0839 extends C1912 implements C0304 {
    C0839(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final Bundle m6308(Bundle bundle) {
        Parcel r0 = m10390();
        C2165.m11475(r0, bundle);
        Parcel r2 = m10392(1, r0);
        Bundle bundle2 = (Bundle) C2165.m11471(r2, Bundle.CREATOR);
        r2.recycle();
        return bundle2;
    }
}
