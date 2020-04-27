package o;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Ӏв  reason: contains not printable characters */
public final class C2832 {
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final Date f13255 = new Date(0);

    /* renamed from: ı  reason: contains not printable characters */
    public Date f13256;

    /* renamed from: ǃ  reason: contains not printable characters */
    JSONObject f13257;

    /* renamed from: Ι  reason: contains not printable characters */
    public JSONArray f13258;

    /* renamed from: ι  reason: contains not printable characters */
    private JSONObject f13259;

    public /* synthetic */ C2832(JSONObject jSONObject, Date date, JSONArray jSONArray, byte b) {
        this(jSONObject, date, jSONArray);
    }

    private C2832(JSONObject jSONObject, Date date, JSONArray jSONArray) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.f13257 = jSONObject;
        this.f13256 = date;
        this.f13258 = jSONArray;
        this.f13259 = jSONObject2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static C2832 m14775(JSONObject jSONObject) {
        return new C2832(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
    }

    public final String toString() {
        return this.f13259.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2832)) {
            return false;
        }
        return this.f13259.toString().equals(((C2832) obj).toString());
    }

    public final int hashCode() {
        return this.f13259.hashCode();
    }

    /* renamed from: o.Ӏв$If */
    public static class If {

        /* renamed from: ı  reason: contains not printable characters */
        public JSONObject f13260;

        /* renamed from: Ι  reason: contains not printable characters */
        public Date f13261;

        /* renamed from: ι  reason: contains not printable characters */
        public JSONArray f13262;

        /* synthetic */ If(byte b) {
            this();
        }

        private If() {
            this.f13260 = new JSONObject();
            this.f13261 = C2832.f13255;
            this.f13262 = new JSONArray();
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final If m14777(JSONObject jSONObject) {
            try {
                this.f13260 = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final If m14776(JSONArray jSONArray) {
            try {
                this.f13262 = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static If m14774() {
        return new If((byte) 0);
    }
}
