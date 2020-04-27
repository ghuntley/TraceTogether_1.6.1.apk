package o;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: o.Ӏɟ  reason: contains not printable characters */
public final class C2787 extends Thread {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final /* synthetic */ Map f13182;

    public C2787(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f13182 = map;
    }

    public final void run() {
        String message;
        StringBuilder sb;
        String str;
        Exception exc;
        HttpURLConnection httpURLConnection;
        new C2784();
        Map map = this.f13182;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, (String) map.get(str2));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            str = "Error while parsing ping URL: ";
            exc = e;
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), exc);
        } catch (IOException | RuntimeException e2) {
            message = e2.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            str = "Error while pinging URL: ";
            exc = e2;
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w("HttpUrlPinger", sb.toString(), exc);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
