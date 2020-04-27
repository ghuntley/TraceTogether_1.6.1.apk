package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import o.C2745;

/* renamed from: o.ɽɩ  reason: contains not printable characters */
public final class C1522 extends C1519 {
    public static final Parcelable.Creator<C1522> CREATOR = new C1526();

    /* renamed from: ı  reason: contains not printable characters */
    private String f8113;

    /* renamed from: ŀ  reason: contains not printable characters */
    private String f8114;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private boolean f8115;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f8116;

    /* renamed from: ȷ  reason: contains not printable characters */
    private String f8117;

    /* renamed from: ɨ  reason: contains not printable characters */
    private boolean f8118;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f8119;

    /* renamed from: ɪ  reason: contains not printable characters */
    private String f8120;

    /* renamed from: ɹ  reason: contains not printable characters */
    private String f8121;

    /* renamed from: ɾ  reason: contains not printable characters */
    private String f8122;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f8123;

    /* renamed from: ι  reason: contains not printable characters */
    private String f8124;

    /* renamed from: І  reason: contains not printable characters */
    private String f8125;

    /* renamed from: і  reason: contains not printable characters */
    private String f8126;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private boolean f8127;

    /* renamed from: ӏ  reason: contains not printable characters */
    private String f8128;

    public C1522() {
        this.f8127 = true;
        this.f8115 = true;
    }

    C1522(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f8119 = str;
        this.f8123 = str2;
        this.f8124 = str3;
        this.f8113 = str4;
        this.f8116 = str5;
        this.f8126 = str6;
        this.f8125 = str7;
        this.f8121 = str8;
        this.f8127 = z;
        this.f8115 = z2;
        this.f8117 = str9;
        this.f8120 = str10;
        this.f8128 = str11;
        this.f8122 = str12;
        this.f8118 = z3;
        this.f8114 = str13;
    }

    public C1522(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f8119 = "http://localhost";
        this.f8124 = str;
        this.f8113 = str2;
        this.f8121 = str5;
        this.f8117 = str6;
        this.f8122 = str7;
        this.f8114 = str8;
        this.f8127 = true;
        if (!TextUtils.isEmpty(this.f8124) || !TextUtils.isEmpty(this.f8113) || !TextUtils.isEmpty(this.f8117)) {
            this.f8116 = C2745.C2746.m14562(str3);
            this.f8126 = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f8124)) {
                sb.append("id_token=");
                sb.append(this.f8124);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f8113)) {
                sb.append("access_token=");
                sb.append(this.f8113);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f8126)) {
                sb.append("identifier=");
                sb.append(this.f8126);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f8121)) {
                sb.append("oauth_token_secret=");
                sb.append(this.f8121);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f8117)) {
                sb.append("code=");
                sb.append(this.f8117);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb.append("nonce=");
                sb.append(str9);
                sb.append("&");
            }
            sb.append("providerId=");
            sb.append(this.f8116);
            this.f8125 = sb.toString();
            this.f8115 = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C1522 m8973(boolean z) {
        this.f8115 = false;
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1522 m8974(String str) {
        this.f8122 = str;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r5 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f8119, false);
        C2745.m14545(parcel, 3, this.f8123, false);
        C2745.m14545(parcel, 4, this.f8124, false);
        C2745.m14545(parcel, 5, this.f8113, false);
        C2745.m14545(parcel, 6, this.f8116, false);
        C2745.m14545(parcel, 7, this.f8126, false);
        C2745.m14545(parcel, 8, this.f8125, false);
        C2745.m14545(parcel, 9, this.f8121, false);
        C2745.m14546(parcel, 10, this.f8127);
        C2745.m14546(parcel, 11, this.f8115);
        C2745.m14545(parcel, 12, this.f8117, false);
        C2745.m14545(parcel, 13, this.f8120, false);
        C2745.m14545(parcel, 14, this.f8128, false);
        C2745.m14545(parcel, 15, this.f8122, false);
        C2745.m14546(parcel, 16, this.f8118);
        C2745.m14545(parcel, 17, this.f8114, false);
        C2745.m14531(parcel, r5);
    }
}
