package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ȷյ  reason: contains not printable characters */
public final class C0980 extends C1519 implements C2437 {
    public static final Parcelable.Creator<C0980> CREATOR = new C1098();

    /* renamed from: ı  reason: contains not printable characters */
    String f5991;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private String f5992;

    /* renamed from: ǃ  reason: contains not printable characters */
    String f5993;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f5994;

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f5995;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f5996;

    /* renamed from: ι  reason: contains not printable characters */
    String f5997;

    /* renamed from: і  reason: contains not printable characters */
    private String f5998;

    public C0980(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f5993 = str;
        this.f5991 = str2;
        this.f5998 = str3;
        this.f5992 = str4;
        this.f5994 = str5;
        this.f5996 = str6;
        if (!TextUtils.isEmpty(this.f5996)) {
            Uri.parse(this.f5996);
        }
        this.f5995 = z;
        this.f5997 = str7;
    }

    public C0980(C1314 r4, String str) {
        if (r4 == null) {
            throw new NullPointerException("null reference");
        } else if (!TextUtils.isEmpty(str)) {
            String r0 = r4.m8274();
            if (!TextUtils.isEmpty(r0)) {
                this.f5993 = r0;
                this.f5991 = str;
                this.f5998 = r4.m8280();
                this.f5994 = r4.m8277();
                Uri r5 = r4.m8276();
                if (r5 != null) {
                    this.f5996 = r5.toString();
                }
                this.f5995 = r4.m8281();
                this.f5997 = null;
                this.f5992 = r4.m8282();
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public C0980(C1436 r3) {
        if (r3 != null) {
            this.f5993 = r3.m8677();
            String r0 = r3.m8682();
            if (!TextUtils.isEmpty(r0)) {
                this.f5991 = r0;
                this.f5994 = r3.m8679();
                Uri r02 = r3.m8678();
                if (r02 != null) {
                    this.f5996 = r02.toString();
                }
                this.f5998 = r3.m8683();
                this.f5992 = r3.m8681();
                this.f5995 = false;
                this.f5997 = r3.m8680();
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final String m6955() {
        return this.f5991;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final String m6954() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f5993);
            jSONObject.putOpt("providerId", this.f5991);
            jSONObject.putOpt("displayName", this.f5994);
            jSONObject.putOpt("photoUrl", this.f5996);
            jSONObject.putOpt("email", this.f5998);
            jSONObject.putOpt("phoneNumber", this.f5992);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f5995));
            jSONObject.putOpt("rawUserInfo", this.f5997);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new C0544(e);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C0980 m6953(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C0980(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            throw new C0544(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f5993, false);
        C2745.m14545(parcel, 2, this.f5991, false);
        C2745.m14545(parcel, 3, this.f5994, false);
        C2745.m14545(parcel, 4, this.f5996, false);
        C2745.m14545(parcel, 5, this.f5998, false);
        C2745.m14545(parcel, 6, this.f5992, false);
        boolean z = this.f5995;
        C2745.m14503(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        C2745.m14545(parcel, 8, this.f5997, false);
        C2745.m14531(parcel, dataPosition);
    }
}
