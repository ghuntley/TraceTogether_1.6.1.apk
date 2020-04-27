package o;

import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C2832;
import o.mQ;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ιϰ  reason: contains not printable characters */
public final class C2039 {

    /* renamed from: ı  reason: contains not printable characters */
    public final Executor f10075;

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3018 f10076;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C1802 f10077;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final C3083 f10078;

    /* renamed from: Ι  reason: contains not printable characters */
    final C3018 f10079;

    /* renamed from: ι  reason: contains not printable characters */
    public final C3018 f10080;

    /* renamed from: І  reason: contains not printable characters */
    private final C3037 f10081;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C3107 f10082;

    /* renamed from: ı  reason: contains not printable characters */
    public static C2039 m10915() {
        return ((C2405) FirebaseApp.getInstance().m1077(C2405.class)).m12432("firebase");
    }

    C2039(C1802 r1, Executor executor, C3018 r3, C3018 r4, C3018 r5, C3083 r6, C3037 r7, C3107 r8) {
        this.f10077 = r1;
        this.f10075 = executor;
        this.f10076 = r3;
        this.f10080 = r4;
        this.f10079 = r5;
        this.f10078 = r6;
        this.f10081 = r7;
        this.f10082 = r8;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m10918(String str) {
        C3037 r0 = this.f10081;
        String r1 = C3037.m15518(r0.f13948, str);
        if (r1 != null) {
            return r1;
        }
        String r02 = C3037.m15518(r0.f13947, str);
        if (r02 != null) {
            return r02;
        }
        C3037.m15519(str, "String");
        return "";
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0329<Void> m10917(C2713 r3) {
        return C0309.m4375(this.f10075, new mJ(this, r3));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static /* synthetic */ Void m10913(C2039 r4, C2713 r5) {
        C3107 r42 = r4.f10082;
        synchronized (r42.f14205) {
            r42.f14207.edit().putBoolean("is_developer_mode_enabled", false).putLong("fetch_timeout_in_seconds", r5.f12543).putLong("minimum_fetch_interval_in_seconds", r5.f12544).commit();
        }
        return null;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0329<Void> m10919(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (value instanceof byte[]) {
                hashMap.put((String) next.getKey(), new String((byte[]) value));
            } else {
                hashMap.put((String) next.getKey(), value.toString());
            }
        }
        return m10914((Map<String, String>) hashMap);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10916(C0329<C2832> r8) {
        if (!r8.m4421()) {
            return false;
        }
        C3018 r0 = this.f10076;
        synchronized (r0) {
            C0770 r2 = new C0770();
            r2.m6079(null);
            r0.f13923 = r2;
        }
        r0.f13922.m15893();
        if (r8.m4401() == null) {
            return true;
        }
        JSONArray jSONArray = r8.m4401().f13258;
        if (this.f10077 == null) {
            return true;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
                arrayList.add(hashMap);
            }
            C1802 r82 = this.f10077;
            if (r82.f9240 != null) {
                r82.m9988(C1802.m9984((List<Map<String, String>>) arrayList));
                return true;
            }
            throw new C1794("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        } catch (C1794 | JSONException unused) {
            return true;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private C0329<Void> m10914(Map<String, String> map) {
        try {
            C2832.If r0 = C2832.m14774();
            r0.f13260 = new JSONObject(map);
            C2832 r5 = new C2832(r0.f13260, r0.f13261, r0.f13262, (byte) 0);
            C3018 r02 = this.f10079;
            return C0309.m4375(r02.f13924, new mQ(r02, r5)).m4410(r02.f13924, new mQ.C0239(r02, r5)).m4413(C2266.m11828());
        } catch (JSONException unused) {
            C0770 r52 = new C0770();
            r52.m6079(null);
            return r52;
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0329<Boolean> m10920() {
        C3083 r0 = this.f10078;
        long j = r0.f14125.f14207.getLong("minimum_fetch_interval_in_seconds", C3083.f14118);
        if (r0.f14125.f14207.getBoolean("is_developer_mode_enabled", false)) {
            j = 0;
        }
        return r0.f14124.m15465().m4404(r0.f14121, new mQ.C0240(r0, j)).m4413(C2299.m11974()).m4410(this.f10075, new C3604mq(this));
    }
}
