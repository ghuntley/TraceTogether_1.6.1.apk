package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import o.C1845;
import o.C1859;
import o.C1861;
import o.C1868;
import o.C1875;
import o.C1885;
import o.C1914;
import o.C1943;
import o.C2033;
import o.C2201;
import o.C2314;

/* renamed from: o.ϲІ  reason: contains not printable characters */
public final class C2177 implements C2362 {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2693 f10358;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2880 f10359;

    /* renamed from: ɩ  reason: contains not printable characters */
    private URL f10360 = m11540(C1758.f9068);

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2693 f10361;

    /* renamed from: ι  reason: contains not printable characters */
    private final ConnectivityManager f10362;

    /* renamed from: o.ϲІ$If */
    public static final class If {

        /* renamed from: ɩ  reason: contains not printable characters */
        public final String f10363;

        /* renamed from: Ι  reason: contains not printable characters */
        public final C1877 f10364;

        /* renamed from: ι  reason: contains not printable characters */
        final URL f10365;

        public If(URL url, C1877 r2, String str) {
            this.f10365 = url;
            this.f10364 = r2;
            this.f10363 = str;
        }
    }

    /* renamed from: o.ϲІ$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ɩ  reason: contains not printable characters */
        final long f10366;

        /* renamed from: Ι  reason: contains not printable characters */
        public final URL f10367;

        /* renamed from: ι  reason: contains not printable characters */
        final int f10368;

        Cif(int i, URL url, long j) {
            this.f10368 = i;
            this.f10367 = url;
            this.f10366 = j;
        }
    }

    public C2177(Context context, C2693 r5, C2693 r6) {
        Class<C1875> cls = C1875.class;
        Class<C1859> cls2 = C1859.class;
        Class<C1868> cls3 = C1868.class;
        Class<C1845> cls4 = C1845.class;
        Class<C1861> cls5 = C1861.class;
        this.f10359 = new C2880() {
            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m15798(Object obj, Writer writer) {
                C3150 r0 = new C3150(writer, C3116.this.f14232, C3116.this.f14233);
                r0.m15938(obj);
                if (r0.f14358) {
                    r0.f14356.flush();
                    return;
                }
                throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
            }

            /* renamed from: ɩ  reason: contains not printable characters */
            public final String m15797(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    m15798(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
        this.f10362 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10361 = r6;
        this.f10358 = r5;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static URL m11540(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C2314 m11542(C2333 r17) {
        C1914.Cif ifVar;
        HashMap hashMap = new HashMap();
        for (C2201 next : r17.m12170()) {
            String r4 = next.m11614();
            if (!hashMap.containsKey(r4)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(r4, arrayList);
            } else {
                ((List) hashMap.get(r4)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            C2201 r7 = (C2201) ((List) entry.getValue()).get(0);
            C1875.C1876 r8 = new C1875.C1876();
            r8.f9563 = Integer.valueOf(RecyclerView.UNDEFINED_DURATION);
            C2033.C2034 r82 = r8.m10895(C1817.DEFAULT).m10899(this.f10358.m14297()).m10898(this.f10361.m14297());
            C1885.Cif r10 = new C1859.C1860().m10292(C1885.C1886.ANDROID);
            C1845.C1846 r11 = new C1845.C1846();
            r11.f9463 = Integer.valueOf(RecyclerView.UNDEFINED_DURATION);
            C2033.C2034 r72 = r82.m10896(r10.m10293(r11.m10118(r7.m11611("sdk-version")).m10119(r7.m11616("model")).m10115(r7.m11616("hardware")).m10113(r7.m11616("device")).m10117(r7.m11616("product")).m10114(r7.m11616("os-uild")).m10121(r7.m11616("manufacturer")).m10116(r7.m11616("fingerprint")).m10120()).m10291());
            try {
                r72.m10897(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                r72.m10894((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (C2201 r102 : (List) entry.getValue()) {
                C2196 r112 = r102.m11608();
                C1733 r12 = r112.f10437;
                if (r12.equals(new C1733("proto"))) {
                    byte[] bArr = r112.f10436;
                    C1868.C1869 r122 = new C1868.C1869();
                    r122.f9549 = Integer.valueOf(RecyclerView.UNDEFINED_DURATION);
                    ifVar = r122.m10400(bArr);
                } else if (r12.equals(new C1733("json"))) {
                    String str = new String(r112.f10436, Charset.forName("UTF-8"));
                    C1868.C1869 r113 = new C1868.C1869();
                    r113.f9549 = Integer.valueOf(RecyclerView.UNDEFINED_DURATION);
                    ifVar = r113.m10399(str);
                } else {
                    new Object[1][0] = r12;
                }
                ifVar.m10398(r102.m11610()).m10403(r102.m11615()).m10397(r102.m11613("tz-offset")).m10402(new C1861.Cif().m10572(C1943.C1945.f9819.get(r102.m11611("net-type"))).m10571(C1943.C1944.f9799.get(r102.m11611("mobile-subtype"))).m10573());
                if (r102.m11612() != null) {
                    ifVar.m10401(r102.m11612().intValue());
                }
                arrayList3.add(ifVar.m10404());
            }
            r72.m10900((List<C1914>) arrayList3);
            arrayList2.add(r72.m10901());
        }
        C1814 r1 = new C1814(arrayList2);
        URL url = this.f10360;
        String str2 = null;
        if (r17.m12171() != null) {
            try {
                String str3 = new String(r17.m12171(), Charset.forName("UTF-8"));
                if (str3.startsWith("1$")) {
                    String[] split = str3.substring(2).split(Pattern.quote("\\"), 2);
                    if (split.length == 2) {
                        String str4 = split[0];
                        if (!str4.isEmpty()) {
                            String str5 = split[1];
                            if (str5.isEmpty()) {
                                str5 = null;
                            }
                            C1758 r5 = new C1758(str4, str5);
                            if (r5.f9071 != null) {
                                str2 = r5.f9071;
                            }
                            if (r5.f9070 != null) {
                                url = m11540(r5.f9070);
                            }
                        } else {
                            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
                        }
                    } else {
                        throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
                    }
                } else {
                    throw new IllegalArgumentException("Version marker missing from extras");
                }
            } catch (IllegalArgumentException unused2) {
                return new C2296(C2314.If.FATAL_ERROR, -1);
            }
        }
        try {
            Cif ifVar2 = (Cif) C2745.m14506(5, new If(url, r1, str2), new C1250(this), C1260.f7100);
            if (ifVar2.f10368 == 200) {
                return new C2296(C2314.If.OK, ifVar2.f10366);
            }
            int i = ifVar2.f10368;
            if (i >= 500 || i == 404) {
                return new C2296(C2314.If.TRANSIENT_ERROR, -1);
            }
            return new C2296(C2314.If.FATAL_ERROR, -1);
        } catch (IOException unused3) {
            return new C2296(C2314.If.TRANSIENT_ERROR, -1);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C2201 m11543(C2201 r5) {
        int i;
        int i2;
        NetworkInfo activeNetworkInfo = this.f10362.getActiveNetworkInfo();
        C2201.C2202 r52 = r5.m11609().m11628("sdk-version", Build.VERSION.SDK_INT).m11620("model", Build.MODEL).m11620("hardware", Build.HARDWARE).m11620("device", Build.DEVICE).m11620("product", Build.PRODUCT).m11620("os-uild", Build.ID).m11620("manufacturer", Build.MANUFACTURER).m11620("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        C2201.C2202 r53 = r52.m11627("tz-offset", (long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        if (activeNetworkInfo == null) {
            i = C1943.C1945.NONE.f9826;
        } else {
            i = activeNetworkInfo.getType();
        }
        C2201.C2202 r54 = r53.m11628("net-type", i);
        if (activeNetworkInfo == null) {
            i2 = C1943.C1944.UNKNOWN_MOBILE_SUBTYPE.f9805;
        } else {
            i2 = activeNetworkInfo.getSubtype();
            if (i2 == -1) {
                i2 = C1943.C1944.COMBINED.f9805;
            } else if (C1943.C1944.f9799.get(i2) == null) {
                i2 = 0;
            }
        }
        return r54.m11628("mobile-subtype", i2).m11621();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:44|45|46|47|48|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r13 = new o.C2177.Cif(400, (java.net.URL) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fe, code lost:
        return r13;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00f1 */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C2177.Cif m11541(o.C2177.If r13) {
        /*
            r12 = this;
            java.net.URL r0 = r13.f10365
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            java.net.URL r0 = r13.f10365
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)
            r2 = 40000(0x9c40, float:5.6052E-41)
            r0.setReadTimeout(r2)
            r0.setDoOutput(r1)
            r0.setInstanceFollowRedirects(r3)
            java.lang.String r2 = "POST"
            r0.setRequestMethod(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "2.2.0"
            r1[r3] = r2
            java.lang.String r2 = "datatransport/%s android/"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "User-Agent"
            r0.setRequestProperty(r2, r1)
            java.lang.String r1 = "gzip"
            java.lang.String r2 = "Content-Encoding"
            r0.setRequestProperty(r2, r1)
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json"
            r0.setRequestProperty(r3, r4)
            java.lang.String r4 = "Accept-Encoding"
            r0.setRequestProperty(r4, r1)
            java.lang.String r4 = r13.f10363
            if (r4 == 0) goto L_0x0053
            java.lang.String r5 = "X-Goog-Api-Key"
            r0.setRequestProperty(r5, r4)
        L_0x0053:
            java.io.OutputStream r4 = r0.getOutputStream()
            java.nio.channels.WritableByteChannel r4 = java.nio.channels.Channels.newChannel(r4)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0103 }
            r5.<init>()     // Catch:{ all -> 0x0103 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0103 }
            r6.<init>(r5)     // Catch:{ all -> 0x0103 }
            r7 = 0
            r9 = 0
            o.ӏƾ r10 = r12.f10359     // Catch:{ IOException | Ը -> 0x00f1 }
            o.Ιх r13 = r13.f10364     // Catch:{ IOException | Ը -> 0x00f1 }
            java.io.OutputStreamWriter r11 = new java.io.OutputStreamWriter     // Catch:{ IOException | Ը -> 0x00f1 }
            r11.<init>(r6)     // Catch:{ IOException | Ը -> 0x00f1 }
            r10.m14946(r13, r11)     // Catch:{ IOException | Ը -> 0x00f1 }
            r6.close()     // Catch:{ all -> 0x0103 }
            byte[] r13 = r5.toByteArray()     // Catch:{ all -> 0x0103 }
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.wrap(r13)     // Catch:{ all -> 0x0103 }
            r4.write(r13)     // Catch:{ all -> 0x0103 }
            int r13 = r0.getResponseCode()     // Catch:{ all -> 0x0103 }
            r0.getHeaderField(r3)     // Catch:{ all -> 0x0103 }
            r0.getHeaderField(r2)     // Catch:{ all -> 0x0103 }
            r3 = 302(0x12e, float:4.23E-43)
            if (r13 == r3) goto L_0x00db
            r3 = 301(0x12d, float:4.22E-43)
            if (r13 == r3) goto L_0x00db
            r3 = 307(0x133, float:4.3E-43)
            if (r13 == r3) goto L_0x00db
            r3 = 200(0xc8, float:2.8E-43)
            if (r13 == r3) goto L_0x00a5
            o.ϲІ$if r0 = new o.ϲІ$if     // Catch:{ all -> 0x0103 }
            r0.<init>(r13, r9, r7)     // Catch:{ all -> 0x0103 }
            r4.close()
            return r0
        L_0x00a5:
            java.lang.String r2 = r0.getHeaderField(r2)     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x00bb
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x0103 }
            if (r1 == 0) goto L_0x00bb
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0103 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ all -> 0x0103 }
            r1.<init>(r0)     // Catch:{ all -> 0x0103 }
            goto L_0x00bf
        L_0x00bb:
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ all -> 0x0103 }
        L_0x00bf:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00d6 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d6 }
            o.ιӷ r0 = o.C2078.m11009(r0)     // Catch:{ all -> 0x00d6 }
            long r2 = r0.f10157     // Catch:{ all -> 0x00d6 }
            o.ϲІ$if r0 = new o.ϲІ$if     // Catch:{ all -> 0x00d6 }
            r0.<init>(r13, r9, r2)     // Catch:{ all -> 0x00d6 }
            r1.close()     // Catch:{ all -> 0x0103 }
            r4.close()
            return r0
        L_0x00d6:
            r13 = move-exception
            r1.close()     // Catch:{ all -> 0x0103 }
            throw r13     // Catch:{ all -> 0x0103 }
        L_0x00db:
            java.lang.String r1 = "Location"
            java.lang.String r0 = r0.getHeaderField(r1)     // Catch:{ all -> 0x0103 }
            o.ϲІ$if r1 = new o.ϲІ$if     // Catch:{ all -> 0x0103 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0103 }
            r2.<init>(r0)     // Catch:{ all -> 0x0103 }
            r1.<init>(r13, r2, r7)     // Catch:{ all -> 0x0103 }
            r4.close()
            return r1
        L_0x00ef:
            r13 = move-exception
            goto L_0x00ff
        L_0x00f1:
            o.ϲІ$if r13 = new o.ϲІ$if     // Catch:{ all -> 0x00ef }
            r0 = 400(0x190, float:5.6E-43)
            r13.<init>(r0, r9, r7)     // Catch:{ all -> 0x00ef }
            r6.close()     // Catch:{ all -> 0x0103 }
            r4.close()
            return r13
        L_0x00ff:
            r6.close()     // Catch:{ all -> 0x0103 }
            throw r13     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r13 = move-exception
            r4.close()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2177.m11541(o.ϲІ$If):o.ϲІ$if");
    }
}
