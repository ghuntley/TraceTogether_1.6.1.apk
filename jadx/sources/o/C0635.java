package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.List;
import o.C2887;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ƒј  reason: contains not printable characters */
public final class C0635 {

    /* renamed from: ı  reason: contains not printable characters */
    private Context f4620;

    /* renamed from: ǃ  reason: contains not printable characters */
    public SharedPreferences f4621;

    /* renamed from: Ι  reason: contains not printable characters */
    private C2887.Cif f4622;

    /* renamed from: ι  reason: contains not printable characters */
    private String f4623;

    public C0635(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("null reference");
        } else if (!TextUtils.isEmpty(str)) {
            this.f4623 = str;
            this.f4620 = context.getApplicationContext();
            this.f4621 = this.f4620.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", new Object[]{this.f4623}), 0);
            this.f4622 = new C2887.Cif("StorageHelpers", new String[0]);
        } else {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final void m5380(C2164 r3) {
        if (r3 != null) {
            String r32 = m5378(r3);
            if (!TextUtils.isEmpty(r32)) {
                this.f4621.edit().putString("com.google.firebase.auth.FIREBASE_USER", r32).apply();
                return;
            }
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2164 m5382() {
        String string = this.f4621.getString("com.google.firebase.auth.FIREBASE_USER", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m5379(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m5381(C2164 r4, C1383 r5) {
        if (r4 == null) {
            throw new NullPointerException("null reference");
        } else if (r5 != null) {
            this.f4621.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{r4.m11461()}), r5.m8538()).apply();
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String m5378(C2164 r7) {
        JSONObject jSONObject = new JSONObject();
        if (!C1229.class.isAssignableFrom(r7.getClass())) {
            return null;
        }
        C1229 r72 = (C1229) r7;
        try {
            jSONObject.put("cachedTokenState", r72.m11464());
            jSONObject.put("applicationName", r72.m11470().m1076());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (r72.f6980 != null) {
                JSONArray jSONArray = new JSONArray();
                List<C0980> list = r72.f6980;
                for (int i = 0; i < list.size(); i++) {
                    jSONArray.put(list.get(i).m6954());
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", r72.m11466());
            jSONObject.put("version", "2");
            if (r72.m11460() != null) {
                jSONObject.put("userMetadata", ((C1145) r72.m11460()).m7589());
            }
            List<C2062> r73 = r72.m11463().m9728();
            if (r73 != null && !r73.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < r73.size(); i2++) {
                    jSONArray2.put(r73.get(i2).m10966());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            C2887.Cif ifVar = this.f4622;
            Log.wtf(ifVar.f13431, ifVar.f13432.concat("Failed to turn object into JSON"), e);
            throw new C0544(e);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1229 m5379(JSONObject jSONObject) {
        JSONArray jSONArray;
        C1145 r1;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z = jSONObject.getBoolean("anonymous");
            String str = "2";
            String string3 = jSONObject.getString("version");
            if (string3 != null) {
                str = string3;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray2.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(C0980.m6953(jSONArray2.getString(i)));
            }
            C1229 r7 = new C1229(FirebaseApp.m1069(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                r7.m11459(C1383.m8531(string));
            }
            if (!z) {
                r7.m11456();
            }
            r7.f6976 = str;
            if (jSONObject.has("userMetadata") && (r1 = C1145.m7588(jSONObject.getJSONObject("userMetadata"))) != null) {
                r7.f6979 = r1;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray.getString(i2));
                    arrayList2.add("phone".equals(jSONObject2.optString("factorIdKey")) ? C1673.m9551(jSONObject2) : null);
                }
                r7.m11465(arrayList2);
            }
            return r7;
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | C0544 | JSONException e) {
            Log.wtf(this.f4622.f13431, e);
            return null;
        }
    }
}
