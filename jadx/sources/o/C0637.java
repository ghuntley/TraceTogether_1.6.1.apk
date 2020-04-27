package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: o.ƒӏ  reason: contains not printable characters */
public final class C0637 extends C3067 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final SSLSocketFactory f4625;

    C0637(C2658 r2) {
        super(r2);
        this.f4625 = Build.VERSION.SDK_INT < 19 ? new C2271() : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m5390() {
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m5389() {
        NetworkInfo networkInfo;
        m15649();
        try {
            networkInfo = ((ConnectivityManager) m15904().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static byte[] m5384(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream2 = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream2.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final HttpURLConnection m5387(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.f4625;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m5386() {
        super.m15900();
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m5392() {
        super.m15903();
    }

    /* renamed from: і  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void m5391() {
        super.m15902();
    }

    public final /* bridge */ /* synthetic */ void y_() {
        super.y_();
    }

    public final /* bridge */ /* synthetic */ C2337 x_() {
        return super.x_();
    }

    public final /* bridge */ /* synthetic */ C2023 w_() {
        return super.w_();
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Context m5393() {
        return super.m15904();
    }

    public final /* bridge */ /* synthetic */ C2102 v_() {
        return super.v_();
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ C2151 m5388() {
        return super.m15901();
    }

    public final /* bridge */ /* synthetic */ C2570 u_() {
        return super.u_();
    }

    public final /* bridge */ /* synthetic */ C2244 t_() {
        return super.t_();
    }

    public final /* bridge */ /* synthetic */ C2327 s_() {
        return super.s_();
    }

    public final /* bridge */ /* synthetic */ C2518 r_() {
        return super.r_();
    }

    public final /* bridge */ /* synthetic */ C2448 q_() {
        return super.q_();
    }
}
