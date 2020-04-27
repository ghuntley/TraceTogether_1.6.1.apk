package o;

import org.json.JSONObject;

final class bF implements bP {
    bF() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final bM m1705(C3284av avVar, JSONObject jSONObject) {
        long j;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.optInt("settings_version", 0);
        int optInt = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
        jSONObject3.getString("identifier");
        String string = jSONObject3.getString("status");
        String string2 = jSONObject3.getString("url");
        String string3 = jSONObject3.getString("reports_url");
        String string4 = jSONObject3.getString("ndk_reports_url");
        boolean optBoolean = jSONObject3.optBoolean("update_required", false);
        if (jSONObject3.has("icon") && jSONObject3.getJSONObject("icon").has("hash")) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject("icon");
            jSONObject4.getString("hash");
            jSONObject4.getInt("width");
            jSONObject4.getInt("height");
        }
        bA bAVar = new bA(string, string2, string3, string4, optBoolean);
        JSONObject jSONObject5 = jSONObject2.getJSONObject("session");
        jSONObject5.optInt("log_buffer_size", 64000);
        jSONObject5.optInt("max_chained_exception_depth", 8);
        int optInt2 = jSONObject5.optInt("max_custom_exception_events", 64);
        jSONObject5.optInt("max_custom_key_value_pairs", 64);
        jSONObject5.optInt("identifier_mask", 255);
        jSONObject5.optBoolean("send_session_without_crash", false);
        bI bIVar = new bI(optInt2, jSONObject5.optInt("max_complete_sessions_count", 4));
        JSONObject jSONObject6 = jSONObject2.getJSONObject("prompt");
        bL bLVar = new bL(jSONObject6.optString("title", "Send Crash Report?"), jSONObject6.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject6.optString("send_button_title", "Send"), jSONObject6.optBoolean("show_cancel_button", true), jSONObject6.optString("cancel_button_title", "Don't Send"), jSONObject6.optBoolean("show_always_send_button", true), jSONObject6.optString("always_send_button_title", "Always Send"));
        JSONObject jSONObject7 = jSONObject2.getJSONObject("features");
        boolean optBoolean2 = jSONObject7.optBoolean("prompt_enabled", false);
        jSONObject7.optBoolean("collect_logged_exceptions", true);
        bD bDVar = new bD(optBoolean2, jSONObject7.optBoolean("collect_reports", true), jSONObject7.optBoolean("collect_analytics", false), jSONObject7.optBoolean("firebase_crashlytics_enabled", false));
        JSONObject jSONObject8 = jSONObject2.getJSONObject("analytics");
        String optString = jSONObject8.optString("url", "https://e.crashlytics.com/spi/v2/events");
        int optInt3 = jSONObject8.optInt("flush_interval_secs", 600);
        int optInt4 = jSONObject8.optInt("max_byte_size_per_file", C3292bc.f1730);
        jSONObject8.optInt("max_file_count_per_send", 1);
        C3310bu buVar = new C3310bu(optString, optInt3, optInt4, jSONObject8.optInt("max_pending_send_file_count", 100), jSONObject8.optBoolean("forward_to_google_analytics", false), jSONObject8.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject8.optBoolean("track_custom_events", true), jSONObject8.optBoolean("track_predefined_events", true), jSONObject8.optInt("sampling_rate", 1), jSONObject8.optBoolean("flush_on_background", true));
        JSONObject jSONObject9 = jSONObject2.getJSONObject(C0691.f4855);
        jSONObject9.optString("update_endpoint", bN.f1622);
        jSONObject9.optInt("update_suspend_duration", 3600);
        long j2 = (long) optInt;
        if (jSONObject2.has("expires_at")) {
            j = jSONObject2.getLong("expires_at");
        } else {
            j = avVar.m1655() + (j2 * 1000);
        }
        return new bM(j, bAVar, bIVar, bLVar, bDVar, buVar);
    }
}
