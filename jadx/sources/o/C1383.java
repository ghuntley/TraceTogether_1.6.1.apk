package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import o.C2745;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ɪϲ  reason: contains not printable characters */
public final class C1383 extends C1519 {
    public static final Parcelable.Creator<C1383> CREATOR = new C1387();

    /* renamed from: ı  reason: contains not printable characters */
    private Long f7613;

    /* renamed from: ǃ  reason: contains not printable characters */
    private Long f7614;

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f7615;

    /* renamed from: Ι  reason: contains not printable characters */
    private String f7616;

    /* renamed from: ι  reason: contains not printable characters */
    private String f7617;

    public C1383() {
        this.f7613 = Long.valueOf(System.currentTimeMillis());
    }

    C1383(String str, String str2, Long l, String str3, Long l2) {
        this.f7616 = str;
        this.f7617 = str2;
        this.f7614 = l;
        this.f7615 = str3;
        this.f7613 = l2;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m8534() {
        return C2022.m10841().m10846() + 300000 < this.f7613.longValue() + (this.f7614.longValue() * 1000);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m8537(String str) {
        this.f7616 = C2745.C2746.m14562(str);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m8532() {
        return this.f7616;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m8536() {
        return this.f7617;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final long m8535() {
        Long l = this.f7614;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final long m8533() {
        return this.f7613.longValue();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int r6 = C2745.m14517(parcel);
        C2745.m14545(parcel, 2, this.f7616, false);
        C2745.m14545(parcel, 3, this.f7617, false);
        C2745.m14533(parcel, 4, Long.valueOf(m8535()), false);
        C2745.m14545(parcel, 5, this.f7615, false);
        C2745.m14533(parcel, 6, Long.valueOf(this.f7613.longValue()), false);
        C2745.m14531(parcel, r6);
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final String m8538() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f7616);
            jSONObject.put("access_token", this.f7617);
            jSONObject.put("expires_in", this.f7614);
            jSONObject.put("token_type", this.f7615);
            jSONObject.put("issued_at", this.f7613);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("GetTokenResponse", "Failed to convert GetTokenResponse to JSON");
            throw new C0544(e);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static C1383 m8531(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1383 r5 = new C1383();
            r5.f7616 = jSONObject.optString("refresh_token", (String) null);
            r5.f7617 = jSONObject.optString("access_token", (String) null);
            r5.f7614 = Long.valueOf(jSONObject.optLong("expires_in"));
            r5.f7615 = jSONObject.optString("token_type", (String) null);
            r5.f7613 = Long.valueOf(jSONObject.optLong("issued_at"));
            return r5;
        } catch (JSONException e) {
            Log.d("GetTokenResponse", "Failed to read GetTokenResponse from JSONObject");
            throw new C0544(e);
        }
    }
}
