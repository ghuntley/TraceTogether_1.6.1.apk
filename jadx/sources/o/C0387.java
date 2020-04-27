package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import o.C0425;
import o.C0944;
import o.C1298;
import o.C2771;
import o.C3124;
import o.C3130;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ıα  reason: contains not printable characters */
public final class C0387 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Pattern f3945 = Pattern.compile("[0-9]+s");

    /* renamed from: ι  reason: contains not printable characters */
    private static final Charset f3946 = Charset.forName("UTF-8");

    /* renamed from: ı  reason: contains not printable characters */
    private final C1298 f3947;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C1971 f3948;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f3949;

    public C0387(Context context, C1971 r2, C1298 r3) {
        this.f3949 = context;
        this.f3948 = r2;
        this.f3947 = r3;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0425 m4647(String str, String str2, String str3, String str4, String str5) {
        GZIPOutputStream gZIPOutputStream;
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s?key=%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations", new Object[]{str3}), str}));
        while (i <= 1) {
            HttpURLConnection r7 = m4642(url);
            try {
                r7.setRequestMethod("POST");
                r7.setDoOutput(true);
                if (str5 != null) {
                    r7.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                gZIPOutputStream = new GZIPOutputStream(r7.getOutputStream());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fid", str2);
                jSONObject.put("appId", str4);
                jSONObject.put("authVersion", "FIS_v2");
                jSONObject.put("sdkVersion", "a:16.0.0");
                gZIPOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                int responseCode = r7.getResponseCode();
                if (responseCode == 200) {
                    C0425 r8 = m4645(r7);
                    r7.disconnect();
                    return r8;
                } else if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                    i++;
                    r7.disconnect();
                } else {
                    C0425 r82 = new C3130.C3131().m4722(C0425.C0426.BAD_CONFIG).m4725();
                    r7.disconnect();
                    return r82;
                }
            } catch (JSONException e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                r7.disconnect();
                throw th;
            }
        }
        throw new IOException();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x009b=Splitter:B:23:0x009b, B:28:0x00bb=Splitter:B:28:0x00bb} */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C0944 m4648(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r8
            r8 = 1
            r1[r8] = r7
            java.lang.String r7 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r7 = java.lang.String.format(r7, r1)
            java.net.URL r1 = new java.net.URL
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "firebaseinstallations.googleapis.com"
            r3[r2] = r4
            java.lang.String r4 = "v1"
            r3[r8] = r4
            r3[r0] = r7
            r7 = 3
            r3[r7] = r6
            java.lang.String r6 = "https://%s/%s/%s?key=%s"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.<init>(r6)
        L_0x002a:
            if (r2 > r8) goto L_0x00e6
            java.net.HttpURLConnection r6 = r5.m4642(r1)
            java.lang.String r7 = "POST"
            r6.setRequestMethod(r7)     // Catch:{ all -> 0x00e1 }
            java.lang.String r7 = "Authorization"
            java.lang.String r0 = "FIS_v2 "
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r0.concat(r3)     // Catch:{ all -> 0x00e1 }
            r6.addRequestProperty(r7, r0)     // Catch:{ all -> 0x00e1 }
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x00e1 }
            java.io.OutputStream r0 = r6.getOutputStream()     // Catch:{ all -> 0x00e1 }
            r7.<init>(r0)     // Catch:{ all -> 0x00e1 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d6 }
            r0.<init>()     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r3 = "sdkVersion"
            java.lang.String r4 = "a:16.0.0"
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x00d6 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d6 }
            r3.<init>()     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r4 = "installation"
            r3.put(r4, r0)     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r3 = "UTF-8"
            byte[] r0 = r0.getBytes(r3)     // Catch:{ JSONException -> 0x00d6 }
            r7.write(r0)     // Catch:{ JSONException -> 0x00d6 }
            r7.close()     // Catch:{ all -> 0x00e1 }
            int r7 = r6.getResponseCode()     // Catch:{ all -> 0x00e1 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 != r0) goto L_0x0083
            o.Ȣ r7 = m4646(r6)     // Catch:{ all -> 0x00e1 }
            r6.disconnect()
            return r7
        L_0x0083:
            r0 = 401(0x191, float:5.62E-43)
            r3 = 0
            if (r7 == r0) goto L_0x00bb
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L_0x008e
            goto L_0x00bb
        L_0x008e:
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L_0x00b4
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L_0x009b
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x009b
            goto L_0x00b4
        L_0x009b:
            o.լӏ$ı r7 = new o.լӏ$ı     // Catch:{ all -> 0x00e1 }
            r7.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00e1 }
            r7.f14260 = r8     // Catch:{ all -> 0x00e1 }
            o.Ȣ$if r8 = o.C0944.Cif.BAD_CONFIG     // Catch:{ all -> 0x00e1 }
            o.Ȣ$ɩ r7 = r7.m6836(r8)     // Catch:{ all -> 0x00e1 }
            o.Ȣ r7 = r7.m6839()     // Catch:{ all -> 0x00e1 }
            r6.disconnect()
            return r7
        L_0x00b4:
            int r2 = r2 + 1
            r6.disconnect()
            goto L_0x002a
        L_0x00bb:
            o.լӏ$ı r7 = new o.լӏ$ı     // Catch:{ all -> 0x00e1 }
            r7.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00e1 }
            r7.f14260 = r8     // Catch:{ all -> 0x00e1 }
            o.Ȣ$if r8 = o.C0944.Cif.AUTH_ERROR     // Catch:{ all -> 0x00e1 }
            o.Ȣ$ɩ r7 = r7.m6836(r8)     // Catch:{ all -> 0x00e1 }
            o.Ȣ r7 = r7.m6839()     // Catch:{ all -> 0x00e1 }
            r6.disconnect()
            return r7
        L_0x00d4:
            r8 = move-exception
            goto L_0x00dd
        L_0x00d6:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d4 }
            r9.<init>(r8)     // Catch:{ all -> 0x00d4 }
            throw r9     // Catch:{ all -> 0x00d4 }
        L_0x00dd:
            r7.close()     // Catch:{ all -> 0x00e1 }
            throw r8     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r7 = move-exception
            r6.disconnect()
            throw r7
        L_0x00e6:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0387.m4648(java.lang.String, java.lang.String, java.lang.String, java.lang.String):o.Ȣ");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private HttpURLConnection m4642(URL url) {
        C1298.C1299 r0;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(C3273am.f1527);
        httpURLConnection.setReadTimeout(C3273am.f1527);
        httpURLConnection.addRequestProperty("Content-Type", C3273am.f1530);
        httpURLConnection.addRequestProperty(C3273am.f1520, C3273am.f1530);
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("X-Android-Package", this.f3949.getPackageName());
        C1298 r02 = this.f3947;
        if (!(r02 == null || this.f3948 == null || (r0 = r02.m8241("fire-installations-id")) == C1298.C1299.NONE)) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.f3948.m10705());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(r0.f7277));
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", m4644());
        return httpURLConnection;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static C0425 m4645(HttpURLConnection httpURLConnection) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(httpURLConnection.getInputStream(), f3946));
        C3124.C3125 r4 = new C3124.C3125();
        r4.f14260 = 0L;
        C3130.C3131 r1 = new C3130.C3131();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                r1.m4720(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                r1.m4721(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                r1.m4723(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        r4.m6838(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        r4.m6837(m4643(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                r1.m4724(r4.m6839());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        return r1.m4722(C0425.C0426.OK).m4725();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static C0944 m4646(HttpURLConnection httpURLConnection) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(httpURLConnection.getInputStream(), f3946));
        C3124.C3125 r3 = new C3124.C3125();
        r3.f14260 = 0L;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                r3.m6838(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                r3.m6837(m4643(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        return r3.m6836(C0944.Cif.OK).m6839();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private String m4644() {
        try {
            byte[] r1 = C1975.m10713(this.f3949, this.f3949.getPackageName());
            if (r1 == null) {
                return null;
            }
            return C2771.If.m14660(r1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static long m4643(String str) {
        if (!f3945.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid Expiration Timestamp.");
        } else if (str == null || str.length() == 0) {
            return 0;
        } else {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
    }
}
