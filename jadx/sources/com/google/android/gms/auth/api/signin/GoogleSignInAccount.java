package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.C1519;
import o.C2022;
import o.C2023;
import o.C2745;
import o.C2823;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends C1519 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C2823();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C2023 f512 = C2022.f9992;

    /* renamed from: ı  reason: contains not printable characters */
    private String f513;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f514;

    /* renamed from: ǃ  reason: contains not printable characters */
    private String f515;

    /* renamed from: ɨ  reason: contains not printable characters */
    private String f516;

    /* renamed from: ɪ  reason: contains not printable characters */
    private Set<Scope> f517 = new HashSet();

    /* renamed from: ɹ  reason: contains not printable characters */
    private Uri f518;

    /* renamed from: ɾ  reason: contains not printable characters */
    private List<Scope> f519;

    /* renamed from: Ι  reason: contains not printable characters */
    private final int f520;

    /* renamed from: ι  reason: contains not printable characters */
    private String f521;

    /* renamed from: І  reason: contains not printable characters */
    private long f522;

    /* renamed from: і  reason: contains not printable characters */
    private String f523;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private String f524;

    /* renamed from: ӏ  reason: contains not printable characters */
    private String f525;

    /* renamed from: ι  reason: contains not printable characters */
    public static GoogleSignInAccount m742(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("tokenId", (String) null);
        String optString4 = jSONObject.optString("email", (String) null);
        String optString5 = jSONObject.optString("displayName", (String) null);
        String optString6 = jSONObject.optString("givenName", (String) null);
        String optString7 = jSONObject.optString("familyName", (String) null);
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            valueOf = Long.valueOf(f512.m10846() / 1000);
        }
        long longValue = valueOf.longValue();
        if (!TextUtils.isEmpty(string)) {
            GoogleSignInAccount googleSignInAccount = r3;
            GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, longValue, string, new ArrayList(hashSet), optString6, optString7);
            GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
            googleSignInAccount3.f524 = jSONObject.optString("serverAuthCode", (String) null);
            return googleSignInAccount3;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f520 = i;
        this.f513 = str;
        this.f515 = str2;
        this.f521 = str3;
        this.f523 = str4;
        this.f518 = uri;
        this.f524 = str5;
        this.f522 = j;
        this.f514 = str6;
        this.f519 = list;
        this.f525 = str7;
        this.f516 = str8;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Account m744() {
        String str = this.f521;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Set<Scope> m743() {
        HashSet hashSet = new HashSet(this.f519);
        hashSet.addAll(this.f517);
        return hashSet;
    }

    public int hashCode() {
        HashSet hashSet = new HashSet(this.f519);
        hashSet.addAll(this.f517);
        return ((this.f514.hashCode() + 527) * 31) + hashSet.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f514.equals(this.f514)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f519);
            hashSet.addAll(googleSignInAccount.f517);
            HashSet hashSet2 = new HashSet(this.f519);
            hashSet2.addAll(this.f517);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i2 = this.f520;
        C2745.m14503(parcel, 1, 4);
        parcel.writeInt(i2);
        C2745.m14545(parcel, 2, this.f513, false);
        C2745.m14545(parcel, 3, this.f515, false);
        C2745.m14545(parcel, 4, this.f521, false);
        C2745.m14545(parcel, 5, this.f523, false);
        C2745.m14542(parcel, 6, this.f518, i, false);
        C2745.m14545(parcel, 7, this.f524, false);
        long j = this.f522;
        C2745.m14503(parcel, 8, 8);
        parcel.writeLong(j);
        C2745.m14545(parcel, 9, this.f514, false);
        C2745.m14511(parcel, 10, this.f519, false);
        C2745.m14545(parcel, 11, this.f525, false);
        C2745.m14545(parcel, 12, this.f516, false);
        C2745.m14531(parcel, dataPosition);
    }
}
