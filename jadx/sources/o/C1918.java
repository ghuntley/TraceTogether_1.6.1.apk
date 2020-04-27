package o;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ΣІ  reason: contains not printable characters */
public final class C1918 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final long f9675 = TimeUnit.DAYS.toMillis(7);

    /* renamed from: ı  reason: contains not printable characters */
    public final long f9676;

    /* renamed from: Ι  reason: contains not printable characters */
    public final String f9677;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f9678;

    private C1918(String str, String str2, long j) {
        this.f9678 = str;
        this.f9677 = str2;
        this.f9676 = j;
    }

    /* renamed from: ı  reason: contains not printable characters */
    static C1918 m10415(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C1918(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C1918(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static String m10416(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m10417(C1918 r0) {
        if (r0 == null) {
            return null;
        }
        return r0.f9678;
    }
}
