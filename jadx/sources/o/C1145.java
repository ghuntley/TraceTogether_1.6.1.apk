package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.C0712;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ɞı  reason: contains not printable characters */
public final class C1145 implements C0712.C0713 {
    public static final Parcelable.Creator<C1145> CREATOR = new C1410();

    /* renamed from: ǃ  reason: contains not printable characters */
    private long f6671;

    /* renamed from: ɩ  reason: contains not printable characters */
    private long f6672;

    public C1145(long j, long j2) {
        this.f6672 = j;
        this.f6671 = j2;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final JSONObject m7589() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f6672);
            jSONObject.put("creationTimestamp", this.f6671);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static C1145 m7588(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C1145(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        long j = this.f6672;
        C2745.m14503(parcel, 1, 8);
        parcel.writeLong(j);
        long j2 = this.f6671;
        C2745.m14503(parcel, 2, 8);
        parcel.writeLong(j2);
        C2745.m14531(parcel, dataPosition);
    }
}
