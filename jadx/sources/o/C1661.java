package o;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: o.ʙ  reason: contains not printable characters */
public final class C1661 implements Parcelable.Creator<C1415> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C1415[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int r0 = C1498.m8906(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < r0) {
            int r5 = C1498.m8909(parcel);
            int r6 = C1498.m8898(r5);
            if (r6 == 1) {
                i = C1498.m8907(parcel, r5);
            } else if (r6 == 2) {
                account = (Account) C1498.m8902(parcel, r5, Account.CREATOR);
            } else if (r6 == 3) {
                i2 = C1498.m8907(parcel, r5);
            } else if (r6 != 4) {
                C1498.m8910(parcel, r5);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C1498.m8902(parcel, r5, GoogleSignInAccount.CREATOR);
            }
        }
        C1498.m8901(parcel, r0);
        return new C1415(i, account, i2, googleSignInAccount);
    }
}
