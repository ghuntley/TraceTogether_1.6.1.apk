package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.Ӿ  reason: contains not printable characters */
public abstract class C2940 {

    /* renamed from: ǃ  reason: contains not printable characters */
    static Uri f13647 = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C3103 f13648 = new bS();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static String f13649;

    /* renamed from: ı  reason: contains not printable characters */
    protected Exception f13650;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private Context f13651;

    /* renamed from: ɪ  reason: contains not printable characters */
    private HttpURLConnection f13652;

    /* renamed from: ɹ  reason: contains not printable characters */
    private Map<String, List<String>> f13653;

    /* renamed from: Ι  reason: contains not printable characters */
    public int f13654;

    /* renamed from: ι  reason: contains not printable characters */
    protected final Uri f13655;

    /* renamed from: І  reason: contains not printable characters */
    private String f13656;

    /* renamed from: і  reason: contains not printable characters */
    private InputStream f13657;

    /* renamed from: ӏ  reason: contains not printable characters */
    private Map<String, String> f13658 = new HashMap();

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public JSONObject m15182() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public byte[] m15185() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract String m15187();

    /* access modifiers changed from: protected */
    /* renamed from: і  reason: contains not printable characters */
    public int m15189() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public Map<String, String> m15190() {
        return null;
    }

    public C2940(Uri uri, FirebaseApp firebaseApp) {
        if (uri == null) {
            throw new NullPointerException("null reference");
        } else if (firebaseApp != null) {
            this.f13655 = uri;
            this.f13651 = firebaseApp.m1074();
            this.f13658.put("x-firebase-gmpid", firebaseApp.m1075().f8951);
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static String m15171() {
        return f13647.getAuthority();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final String m15186() {
        String path = this.f13655.getPath();
        if (path == null) {
            return "";
        }
        return path.startsWith("/") ? path.substring(1) : path;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public Uri m15179() {
        Uri uri = this.f13655;
        if (uri != null) {
            String path = uri.getPath();
            if (path == null) {
                path = "";
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            Uri.Builder buildUpon = f13647.buildUpon();
            buildUpon.appendPath("b");
            buildUpon.appendPath(uri.getAuthority());
            buildUpon.appendPath("o");
            buildUpon.appendPath(path);
            return buildUpon.build();
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m15178() {
        this.f13650 = null;
        this.f13654 = 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15184(String str, String str2) {
        this.f13658.put(str, str2);
    }

    /* renamed from: І  reason: contains not printable characters */
    public final JSONObject m15188() {
        if (TextUtils.isEmpty(this.f13656)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f13656);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m15183(String str, Context context) {
        if (m15175(context)) {
            m15173(str);
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean m15175(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.f13650 = new SocketException("Network subsystem is unavailable");
        this.f13654 = -2;
        return false;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private HttpURLConnection m15174() {
        Uri r0 = m15179();
        Map<String, String> r1 = m15190();
        if (r1 != null) {
            Uri.Builder buildUpon = r0.buildUpon();
            for (Map.Entry next : r1.entrySet()) {
                buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
            r0 = buildUpon.build();
        }
        return f13648.m15741(new URL(r0.toString()));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static String m15176(Context context) {
        if (f13649 == null) {
            try {
                f13649 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (f13649 == null) {
                f13649 = "[No Gmscore]";
            }
        }
        return f13649;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m15177(HttpURLConnection httpURLConnection, String str) {
        int i;
        byte[] bArr;
        OutputStream outputStream;
        if (httpURLConnection != null) {
            if (!TextUtils.isEmpty(str)) {
                httpURLConnection.setRequestProperty("Authorization", "Firebase ".concat(String.valueOf(str)));
            }
            StringBuilder sb = new StringBuilder("Android/");
            String r0 = m15176(this.f13651);
            if (!TextUtils.isEmpty(r0)) {
                sb.append(r0);
            }
            httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", sb.toString());
            for (Map.Entry next : this.f13658.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            JSONObject r7 = m15182();
            if (r7 != null) {
                bArr = r7.toString().getBytes("UTF-8");
                i = bArr.length;
            } else {
                bArr = m15185();
                i = m15189();
                if (i == 0 && bArr != null) {
                    i = bArr.length;
                }
            }
            if (bArr == null || bArr.length <= 0) {
                httpURLConnection.setRequestProperty("Content-Length", "0");
            } else {
                if (r7 != null) {
                    httpURLConnection.setRequestProperty("Content-Type", C3273am.f1530);
                }
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty("Content-Length", Integer.toString(i));
            }
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            if (bArr != null && bArr.length > 0 && (outputStream = httpURLConnection.getOutputStream()) != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                try {
                    bufferedOutputStream.write(bArr, 0, i);
                } finally {
                    bufferedOutputStream.close();
                }
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m15172(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f13656 = sb.toString();
        int i = this.f13654;
        if (!(i >= 200 && i < 300)) {
            this.f13650 = new IOException(this.f13656);
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public final Exception m15180() {
        return this.f13650;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m15173(String str) {
        boolean z = true;
        if (this.f13650 != null) {
            this.f13654 = -1;
        } else {
            if (Log.isLoggable("NetworkRequest", 3)) {
                m15187();
                m15179();
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f13651.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                this.f13654 = -2;
                this.f13650 = new SocketException("Network subsystem is unavailable");
            } else {
                try {
                    this.f13652 = m15174();
                    this.f13652.setRequestMethod(m15187());
                    m15177(this.f13652, str);
                    HttpURLConnection httpURLConnection = this.f13652;
                    if (httpURLConnection != null) {
                        this.f13654 = httpURLConnection.getResponseCode();
                        this.f13653 = httpURLConnection.getHeaderFields();
                        httpURLConnection.getContentLength();
                        if (this.f13654 >= 200 && this.f13654 < 300) {
                            this.f13657 = httpURLConnection.getInputStream();
                        } else {
                            this.f13657 = httpURLConnection.getErrorStream();
                        }
                    } else {
                        throw new NullPointerException("null reference");
                    }
                } catch (IOException e) {
                    m15187();
                    m15179();
                    this.f13650 = e;
                    this.f13654 = -2;
                }
            }
        }
        try {
            if (this.f13654 < 200 || this.f13654 >= 300) {
                z = false;
            }
            if (z) {
                m15172(this.f13657);
            } else {
                m15172(this.f13657);
            }
        } catch (IOException e2) {
            m15187();
            m15179();
            this.f13650 = e2;
            this.f13654 = -2;
        }
        HttpURLConnection httpURLConnection2 = this.f13652;
        if (httpURLConnection2 != null) {
            httpURLConnection2.disconnect();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m15181(String str) {
        List list;
        Map<String, List<String>> map = this.f13653;
        if (map == null || (list = map.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }
}
