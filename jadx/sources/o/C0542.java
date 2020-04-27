package o;

import android.annotation.TargetApi;
import android.os.Build;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.łɹ  reason: contains not printable characters */
class C0542 implements aY<C0496> {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f4390 = "betaDeviceToken";

    /* renamed from: ŀ  reason: contains not printable characters */
    static final String f4391 = "predefinedType";

    /* renamed from: Ɩ  reason: contains not printable characters */
    static final String f4392 = "deviceModel";

    /* renamed from: ǃ  reason: contains not printable characters */
    static final String f4393 = "executionId";

    /* renamed from: ȷ  reason: contains not printable characters */
    static final String f4394 = "customAttributes";

    /* renamed from: ɨ  reason: contains not printable characters */
    static final String f4395 = "timestamp";

    /* renamed from: ɩ  reason: contains not printable characters */
    static final String f4396 = "limitAdTrackingEnabled";

    /* renamed from: ɪ  reason: contains not printable characters */
    static final String f4397 = "type";

    /* renamed from: ɹ  reason: contains not printable characters */
    static final String f4398 = "appVersionCode";

    /* renamed from: ɾ  reason: contains not printable characters */
    static final String f4399 = "details";

    /* renamed from: ɿ  reason: contains not printable characters */
    static final String f4400 = "predefinedAttributes";

    /* renamed from: Ι  reason: contains not printable characters */
    static final String f4401 = "appBundleId";

    /* renamed from: ι  reason: contains not printable characters */
    static final String f4402 = "installationId";

    /* renamed from: І  reason: contains not printable characters */
    static final String f4403 = "buildId";

    /* renamed from: і  reason: contains not printable characters */
    static final String f4404 = "osVersion";

    /* renamed from: Ӏ  reason: contains not printable characters */
    static final String f4405 = "appVersionName";

    /* renamed from: ӏ  reason: contains not printable characters */
    static final String f4406 = "customType";

    C0542() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public byte[] m5124(C0496 r2) {
        return m5123(r2).toString().getBytes("UTF-8");
    }

    @TargetApi(9)
    /* renamed from: ı  reason: contains not printable characters */
    public JSONObject m5123(C0496 r5) {
        try {
            JSONObject jSONObject = new JSONObject();
            C0519 r1 = r5.f4166;
            jSONObject.put(f4401, r1.f4292);
            jSONObject.put(f4393, r1.f4293);
            jSONObject.put(f4402, r1.f4290);
            jSONObject.put(f4396, r1.f4297);
            jSONObject.put(f4390, r1.f4296);
            jSONObject.put(f4403, r1.f4291);
            jSONObject.put(f4404, r1.f4300);
            jSONObject.put(f4392, r1.f4299);
            jSONObject.put(f4398, r1.f4298);
            jSONObject.put(f4405, r1.f4294);
            jSONObject.put(f4395, r5.f4165);
            jSONObject.put(f4397, r5.f4169.toString());
            if (r5.f4173 != null) {
                jSONObject.put(f4399, new JSONObject(r5.f4173));
            }
            jSONObject.put(f4406, r5.f4171);
            if (r5.f4172 != null) {
                jSONObject.put(f4394, new JSONObject(r5.f4172));
            }
            jSONObject.put(f4391, r5.f4170);
            if (r5.f4167 != null) {
                jSONObject.put(f4400, new JSONObject(r5.f4167));
            }
            return jSONObject;
        } catch (JSONException e) {
            if (Build.VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }
}
