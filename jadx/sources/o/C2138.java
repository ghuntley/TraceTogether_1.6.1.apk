package o;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import o.C1190;

/* renamed from: o.ϑ  reason: contains not printable characters */
public final class C2138 extends C1190<C2082> {
    public C2138(Context context, Looper looper, C1190.C1191 r10, C1190.C1193 r11) {
        super(context, looper, 93, r10, r11, (String) null);
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final String m11312() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final int m11314() {
        return C2877.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final String m11315() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ IInterface m11313(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C2082) {
            return (C2082) queryLocalInterface;
        }
        return new C2103(iBinder);
    }
}
