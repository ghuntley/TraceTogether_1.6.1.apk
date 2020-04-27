package o;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: o.ɫǃ  reason: contains not printable characters */
public final class C1415 extends C1519 {
    public static final Parcelable.Creator<C1415> CREATOR = new C1661();

    /* renamed from: ı  reason: contains not printable characters */
    private final Account f7730;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f7731;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final GoogleSignInAccount f7732;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f7733;

    C1415(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f7731 = i;
        this.f7730 = account;
        this.f7733 = i2;
        this.f7732 = googleSignInAccount;
    }

    public C1415(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f7731;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        C2745.m14542(parcel, 2, this.f7730, i, false);
        int i3 = this.f7733;
        C2745.m14503(parcel, 3, 4);
        parcel.writeInt(i3);
        C2745.m14542(parcel, 4, this.f7732, i, false);
        C2745.m14531(parcel, dataPosition);
    }
}
