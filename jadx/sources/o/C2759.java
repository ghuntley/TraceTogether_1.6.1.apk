package o;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: o.Ӏŧ  reason: contains not printable characters */
public abstract class C2759 extends C0418 implements C2731 {
    public C2759() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m14602(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 3) {
            m14473((C2822) C0454.m4777(parcel, C2822.CREATOR), (C2698) C0454.m4777(parcel, C2698.CREATOR));
        } else if (i == 4) {
            m14471((Status) C0454.m4777(parcel, Status.CREATOR));
        } else if (i == 6) {
            m14469((Status) C0454.m4777(parcel, Status.CREATOR));
        } else if (i == 7) {
            m14470((Status) C0454.m4777(parcel, Status.CREATOR), (GoogleSignInAccount) C0454.m4777(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            m14472((C2765) C0454.m4777(parcel, C2765.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
