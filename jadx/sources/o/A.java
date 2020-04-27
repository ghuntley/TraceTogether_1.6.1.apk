package o;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import android.os.Build;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import o.C2648;
import o.C3348d;

public final class A implements C3348d {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Object f1020 = new Object();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final ThreadLocal<StringBuilder> f1021 = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder();
        }
    };

    /* renamed from: ι  reason: contains not printable characters */
    private static volatile Object f1022;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Context f1023;

    public A(Context context) {
        this.f1023 = context.getApplicationContext();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3348d.C0155 m1142(Uri uri, int i) {
        String str;
        if (Build.VERSION.SDK_INT >= 14) {
            Context context = this.f1023;
            if (f1022 == null) {
                try {
                    synchronized (f1020) {
                        if (f1022 == null) {
                            File r0 = C3626z.m4084(context);
                            HttpResponseCache installed = HttpResponseCache.getInstalled();
                            if (installed == null) {
                                installed = HttpResponseCache.install(r0, C3626z.m4090(r0));
                            }
                            f1022 = installed;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setUseCaches(true);
        if (i != 0) {
            if (C3505j.m2818(i)) {
                str = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = f1021.get();
                sb.setLength(0);
                if (!C3505j.m2819(i)) {
                    sb.append("no-cache");
                }
                if (!C3505j.m2817(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                str = sb.toString();
            }
            httpURLConnection.setRequestProperty("Cache-Control", str);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 300) {
            long headerFieldInt = (long) httpURLConnection.getHeaderFieldInt("Content-Length", -1);
            return new C3348d.C0155(httpURLConnection.getInputStream(), C3626z.m4088(httpURLConnection.getHeaderField("X-Android-Response-Source")), headerFieldInt);
        }
        httpURLConnection.disconnect();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(responseCode);
        sb2.append(" ");
        sb2.append(httpURLConnection.getResponseMessage());
        throw new C3348d.C0156(sb2.toString(), i, responseCode);
    }

    /* renamed from: o.A$ǃ  reason: contains not printable characters */
    static class C0079 implements C2979 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final C2648.C2649 f1024;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final Pair f1025;

        C0079(C2648.C2649 r1, Pair pair) {
            this.f1024 = r1;
            this.f1025 = pair;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m1143(C0329 r3) {
            return this.f1024.m14010(this.f1025, r3);
        }
    }
}
