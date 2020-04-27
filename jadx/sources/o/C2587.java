package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: o.іɭ  reason: contains not printable characters */
public final class C2587 extends C1519 {
    public static final Parcelable.Creator<C2587> CREATOR = new C2631();

    /* renamed from: ı  reason: contains not printable characters */
    private final C2500 f11740;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean f11741;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f11742;

    /* renamed from: ι  reason: contains not printable characters */
    private final boolean f11743;

    C2587(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f11742 = str;
        this.f11740 = m13730(iBinder);
        this.f11743 = z;
        this.f11741 = z2;
    }

    C2587(String str, C2500 r2, boolean z, boolean z2) {
        this.f11742 = str;
        this.f11740 = r2;
        this.f11743 = z;
        this.f11741 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int r5 = C2745.m14517(parcel);
        C2745.m14545(parcel, 1, this.f11742, false);
        C2500 r0 = this.f11740;
        if (r0 == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = r0.asBinder();
        }
        C2745.m14509(parcel, 2, iBinder, false);
        C2745.m14546(parcel, 3, this.f11743);
        C2745.m14546(parcel, 4, this.f11741);
        C2745.m14531(parcel, r5);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C2500 m13730(IBinder iBinder) {
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            C2722 r3 = C1759.m9838(iBinder).m9850();
            if (r3 == null) {
                bArr = null;
            } else {
                bArr = (byte[]) C2813.m14731(r3);
            }
            if (bArr != null) {
                return new C2491(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
