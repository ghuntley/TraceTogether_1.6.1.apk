package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C1975;
import o.C2161;
import o.C2163;
import o.C2403;
import o.C2771;
import o.C2832;
import o.C3083;
import o.C3273am;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final Pattern f999 = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: ı  reason: contains not printable characters */
    private final String f1000;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final long f1001;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f1002;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f1003;

    /* renamed from: Ι  reason: contains not printable characters */
    private final String f1004;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f1005;

    /* renamed from: і  reason: contains not printable characters */
    private final long f1006;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f1003 = context;
        this.f1005 = str;
        this.f1004 = str2;
        Matcher matcher = f999.matcher(str);
        this.f1002 = matcher.matches() ? matcher.group(1) : null;
        this.f1000 = str3;
        this.f1006 = j;
        this.f1001 = j2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final HttpURLConnection m1134() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.f1002, this.f1000})).openConnection();
        } catch (IOException e) {
            throw new C2161(e.getMessage());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private String m1132() {
        try {
            byte[] r1 = C1975.m10713(this.f1003, this.f1003.getPackageName());
            if (r1 == null) {
                return null;
            }
            return C2771.If.m14660(r1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private JSONObject m1130(String str, String str2, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f1005);
            Locale locale = this.f1003.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            hashMap.put("languageCode", locale.toString());
            hashMap.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f1003.getPackageManager().getPackageInfo(this.f1003.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f1003.getPackageName());
            hashMap.put("sdkVersion", "19.1.2");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new C2163("Fetch failed: Firebase instance id is null.");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static JSONObject m1131(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static boolean m1133(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C2832 m1129(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        try {
            C2832.If r0 = C2832.m14774();
            r0.f13261 = date;
            JSONArray jSONArray = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                r0.m14777(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
            }
            if (jSONArray != null) {
                r0.m14776(jSONArray);
            }
            return new C2832(r0.f13260, r0.f13261, r0.f13262, (byte) 0);
        } catch (JSONException e) {
            throw new C2163("Fetch failed: fetch response could not be parsed.", e);
        }
    }

    @Keep
    public C3083.C3084 fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Date date) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(this.f1006));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(this.f1001));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f1004);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f1003.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m1132());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("Content-Type", C3273am.f1530);
        httpURLConnection.setRequestProperty(C3273am.f1520, C3273am.f1530);
        for (Map.Entry next : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        try {
            byte[] bytes = m1130(str, str2, map).toString().getBytes("utf-8");
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject r6 = m1131(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                if (!m1133(r6)) {
                    return C3083.C3084.m15693();
                }
                return C3083.C3084.m15694(m1129(r6, date), headerField);
            }
            throw new C2403(responseCode, httpURLConnection.getResponseMessage());
        } catch (IOException | JSONException e) {
            throw new C2163("The client had an error while calling the backend!", e);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
