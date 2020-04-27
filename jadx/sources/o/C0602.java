package o;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C2887;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: o.Ƃ  reason: contains not printable characters */
final class C0602 {
    /* renamed from: Ι  reason: contains not printable characters */
    public static Map<String, Object> m5313(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m5312(jSONObject);
            }
            return null;
        } catch (Exception e) {
            throw new C0544(e);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Map<String, Object> m5312(JSONObject jSONObject) {
        C0299 r0 = new C0299();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m5310((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m5312((JSONObject) obj);
            }
            r0.put(next, obj);
        }
        return r0;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static List<Object> m5310(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m5310((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m5312((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    static {
        new C2887.Cif("JSONParser", new String[0]);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static Map<String, Object> m5311(String str) {
        if (!TextUtils.isEmpty(str)) {
            List<String> r2 = C0669.m5507('.').m5510((CharSequence) str);
            if (r2.size() < 2) {
                return C0959.m6871();
            }
            String str2 = r2.get(1);
            try {
                Map<String, Object> r22 = m5313(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
                return r22 == null ? C0959.m6871() : r22;
            } catch (UnsupportedEncodingException unused) {
                return C0959.m6871();
            }
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }
}
