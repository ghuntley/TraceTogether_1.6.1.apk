package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.ɭյ  reason: contains not printable characters */
public final class C1450 {

    /* renamed from: ı  reason: contains not printable characters */
    C0950 f7796;

    /* renamed from: ŀ  reason: contains not printable characters */
    private C0949 f7797;

    /* renamed from: Ɩ  reason: contains not printable characters */
    String f7798;

    /* renamed from: ǃ  reason: contains not printable characters */
    String f7799;

    /* renamed from: ȷ  reason: contains not printable characters */
    Cif<Map<String, String>> f7800;

    /* renamed from: ɨ  reason: contains not printable characters */
    Cif<String> f7801;

    /* renamed from: ɩ  reason: contains not printable characters */
    String f7802;

    /* renamed from: ɪ  reason: contains not printable characters */
    Cif<String> f7803;

    /* renamed from: ɹ  reason: contains not printable characters */
    long f7804;

    /* renamed from: ɾ  reason: contains not printable characters */
    Cif<String> f7805;

    /* renamed from: Ι  reason: contains not printable characters */
    Cif<String> f7806;

    /* renamed from: ι  reason: contains not printable characters */
    String f7807;

    /* renamed from: І  reason: contains not printable characters */
    String f7808;

    /* renamed from: і  reason: contains not printable characters */
    String f7809;

    /* renamed from: Ӏ  reason: contains not printable characters */
    String f7810;

    /* renamed from: ӏ  reason: contains not printable characters */
    Cif<String> f7811;

    /* synthetic */ C1450(C1450 r1, boolean z, byte b) {
        this(r1, z);
    }

    /* renamed from: o.ɭյ$if  reason: invalid class name */
    static class Cif<T> {

        /* renamed from: ı  reason: contains not printable characters */
        final T f7812;

        /* renamed from: ɩ  reason: contains not printable characters */
        final boolean f7813;

        Cif(T t, boolean z) {
            this.f7813 = z;
            this.f7812 = t;
        }
    }

    public C1450() {
        this.f7802 = null;
        this.f7797 = null;
        this.f7796 = null;
        this.f7807 = null;
        this.f7799 = null;
        this.f7806 = new Cif<>("", false);
        this.f7809 = null;
        this.f7810 = null;
        this.f7798 = null;
        this.f7808 = null;
        this.f7805 = new Cif<>("", false);
        this.f7801 = new Cif<>("", false);
        this.f7811 = new Cif<>("", false);
        this.f7803 = new Cif<>("", false);
        this.f7800 = new Cif<>(Collections.emptyMap(), false);
    }

    private C1450(C1450 r5, boolean z) {
        this.f7802 = null;
        this.f7797 = null;
        this.f7796 = null;
        this.f7807 = null;
        this.f7799 = null;
        this.f7806 = new Cif<>("", false);
        this.f7809 = null;
        this.f7810 = null;
        this.f7798 = null;
        this.f7808 = null;
        this.f7805 = new Cif<>("", false);
        this.f7801 = new Cif<>("", false);
        this.f7811 = new Cif<>("", false);
        this.f7803 = new Cif<>("", false);
        this.f7800 = new Cif<>(Collections.emptyMap(), false);
        if (r5 != null) {
            this.f7802 = r5.f7802;
            this.f7797 = r5.f7797;
            this.f7796 = r5.f7796;
            this.f7807 = r5.f7807;
            this.f7806 = r5.f7806;
            this.f7805 = r5.f7805;
            this.f7801 = r5.f7801;
            this.f7811 = r5.f7811;
            this.f7803 = r5.f7803;
            this.f7800 = r5.f7800;
            if (z) {
                this.f7808 = r5.f7808;
                this.f7804 = r5.f7804;
                this.f7798 = r5.f7798;
                this.f7810 = r5.f7810;
                this.f7809 = r5.f7809;
                this.f7799 = r5.f7799;
                return;
            }
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: o.ɭյ$ǃ  reason: contains not printable characters */
    public static class C1451 {

        /* renamed from: ɩ  reason: contains not printable characters */
        C1450 f7814;

        /* renamed from: ι  reason: contains not printable characters */
        boolean f7815;

        public C1451() {
            this.f7814 = new C1450();
        }

        C1451(JSONObject jSONObject, C0950 r2) {
            this(jSONObject);
            this.f7814.f7796 = r2;
        }

        private C1451(JSONObject jSONObject) {
            this.f7814 = new C1450();
            if (jSONObject != null) {
                m8714(jSONObject);
                this.f7815 = true;
            }
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        private void m8714(JSONObject jSONObject) {
            String str;
            String str2;
            String str3;
            String str4;
            this.f7814.f7799 = jSONObject.optString("generation");
            this.f7814.f7802 = jSONObject.optString("name");
            this.f7814.f7807 = jSONObject.optString("bucket");
            this.f7814.f7809 = jSONObject.optString("metageneration");
            this.f7814.f7810 = jSONObject.optString("timeCreated");
            this.f7814.f7798 = jSONObject.optString("updated");
            this.f7814.f7804 = jSONObject.optLong("size");
            this.f7814.f7808 = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject2.getString(next);
                    if (!this.f7814.f7800.f7813) {
                        this.f7814.f7800 = new Cif<>(new HashMap(), true);
                    }
                    ((Map) this.f7814.f7800.f7812).put(next, string);
                }
            }
            String str5 = null;
            if (!jSONObject.has("contentType") || jSONObject.isNull("contentType")) {
                str = null;
            } else {
                str = jSONObject.getString("contentType");
            }
            if (str != null) {
                this.f7814.f7806 = new Cif<>(str, true);
            }
            if (!jSONObject.has("cacheControl") || jSONObject.isNull("cacheControl")) {
                str2 = null;
            } else {
                str2 = jSONObject.getString("cacheControl");
            }
            if (str2 != null) {
                this.f7814.f7805 = new Cif<>(str2, true);
            }
            if (!jSONObject.has("contentDisposition") || jSONObject.isNull("contentDisposition")) {
                str3 = null;
            } else {
                str3 = jSONObject.getString("contentDisposition");
            }
            if (str3 != null) {
                this.f7814.f7801 = new Cif<>(str3, true);
            }
            if (!jSONObject.has("contentEncoding") || jSONObject.isNull("contentEncoding")) {
                str4 = null;
            } else {
                str4 = jSONObject.getString("contentEncoding");
            }
            if (str4 != null) {
                this.f7814.f7811 = new Cif<>(str4, true);
            }
            if (jSONObject.has("contentLanguage") && !jSONObject.isNull("contentLanguage")) {
                str5 = jSONObject.getString("contentLanguage");
            }
            if (str5 != null) {
                this.f7814.f7803 = new Cif<>(str5, true);
            }
        }
    }
}
