package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: o.Іπ  reason: contains not printable characters */
public final class C2288 extends C1970 implements Cloneable {
    public static final Parcelable.Creator<C2288> CREATOR = new C1599();

    /* renamed from: ı  reason: contains not printable characters */
    private boolean f10674;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f10675;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f10676;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f10677;

    /* renamed from: ι  reason: contains not printable characters */
    public boolean f10678;

    /* renamed from: І  reason: contains not printable characters */
    private String f10679;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f10680;

    C2288(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || (z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)))) {
            this.f10677 = str;
            this.f10676 = str2;
            this.f10674 = z;
            this.f10675 = str3;
            this.f10678 = z2;
            this.f10680 = str4;
            this.f10679 = str5;
            return;
        }
        throw new IllegalArgumentException("Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m11954() {
        return "phone";
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m11956() {
        return "phone";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C1970 m11955() {
        return (C2288) clone();
    }

    public final /* synthetic */ Object clone() {
        return new C2288(this.f10677, this.f10676, this.f10674, this.f10675, this.f10678, this.f10680, this.f10679);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f10677, false);
        C2745.m14545(parcel, 2, this.f10676, false);
        boolean z = this.f10674;
        C2745.m14503(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        C2745.m14545(parcel, 4, this.f10675, false);
        boolean z2 = this.f10678;
        C2745.m14503(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        C2745.m14545(parcel, 6, this.f10680, false);
        C2745.m14545(parcel, 7, this.f10679, false);
        C2745.m14531(parcel, dataPosition);
    }
}
