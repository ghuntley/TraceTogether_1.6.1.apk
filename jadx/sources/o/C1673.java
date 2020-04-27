package o;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ʚı  reason: contains not printable characters */
public final class C1673 extends C2062 {
    public static final Parcelable.Creator<C1673> CREATOR = new C1601();

    /* renamed from: ı  reason: contains not printable characters */
    private final String f8683;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final String f8684;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f8685;

    /* renamed from: ι  reason: contains not printable characters */
    private final long f8686;

    public C1673(String str, String str2, long j, String str3) {
        if (!TextUtils.isEmpty(str)) {
            this.f8684 = str;
            this.f8685 = str2;
            this.f8686 = j;
            if (!TextUtils.isEmpty(str3)) {
                this.f8683 = str3;
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1673 m9551(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new C1673(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final JSONObject m9552() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f8684);
            jSONObject.putOpt("displayName", this.f8685);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f8686));
            jSONObject.putOpt("phoneNumber", this.f8683);
            return jSONObject;
        } catch (JSONException e) {
            throw new C0544(e);
        }
    }

    @SuppressLint({"id"})
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        C2745.m14545(parcel, 1, this.f8684, false);
        C2745.m14545(parcel, 2, this.f8685, false);
        long j = this.f8686;
        C2745.m14503(parcel, 3, 8);
        parcel.writeLong(j);
        C2745.m14545(parcel, 4, this.f8683, false);
        C2745.m14531(parcel, dataPosition);
    }
}
