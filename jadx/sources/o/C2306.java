package o;

import java.net.URL;
import java.util.Map;
import o.C2745;

/* renamed from: o.Іь  reason: contains not printable characters */
final class C2306 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final URL f10709;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final String f10710;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<String, String> f10711;

    /* renamed from: Ι  reason: contains not printable characters */
    private final byte[] f10712;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2321 f10713;

    /* renamed from: І  reason: contains not printable characters */
    private final /* synthetic */ C2286 f10714;

    public C2306(C2286 r1, String str, URL url, byte[] bArr, Map<String, String> map, C2321 r6) {
        this.f10714 = r1;
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(url);
        C2745.C2746.m14555(r6);
        this.f10709 = url;
        this.f10712 = bArr;
        this.f10713 = r6;
        this.f10710 = str;
        this.f10711 = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4 A[SYNTHETIC, Splitter:B:42:0x00c4] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff A[SYNTHETIC, Splitter:B:55:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            o.Іε r1 = r13.f10714
            r1.m15902()
            r1 = 0
            r2 = 0
            o.Іε r3 = r13.f10714     // Catch:{ IOException -> 0x00f8, all -> 0x00be }
            java.net.URL r4 = r13.f10709     // Catch:{ IOException -> 0x00f8, all -> 0x00be }
            java.net.HttpURLConnection r3 = r3.m11945((java.net.URL) r4)     // Catch:{ IOException -> 0x00f8, all -> 0x00be }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f10711     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f10711     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f10712     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            if (r4 == 0) goto L_0x0086
            o.Іε r4 = r13.f10714     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            o.ιս r4 = r4.p_()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            byte[] r5 = r13.f10712     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            byte[] r4 = r4.m11123((byte[]) r5)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            o.Іε r5 = r13.f10714     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            o.Іɛ r5 = r5.t_()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            o.ϵı r5 = r5.m11713()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r5.m11603(r6, r7)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            int r5 = r4.length     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r3.connect()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            r5.write(r4)     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            goto L_0x0086
        L_0x007c:
            r4 = move-exception
            r11 = r1
            r1 = r5
            goto L_0x00c1
        L_0x0080:
            r4 = move-exception
            r11 = r1
            r9 = r4
            r1 = r5
            goto L_0x00fc
        L_0x0086:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00bb, all -> 0x00b8 }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00b4, all -> 0x00b1 }
            o.Іε r2 = r13.f10714     // Catch:{ IOException -> 0x00af, all -> 0x00ad }
            byte[] r10 = o.C2286.m11943((java.net.HttpURLConnection) r3)     // Catch:{ IOException -> 0x00af, all -> 0x00ad }
            r3.disconnect()
            o.Іε r0 = r13.f10714
            o.іƭ r0 = r0.u_()
            o.Іԑ r1 = new o.Іԑ
            java.lang.String r6 = r13.f10710
            o.Іԁ r7 = r13.f10713
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.m13668((java.lang.Runnable) r1)
            return
        L_0x00ad:
            r4 = move-exception
            goto L_0x00c2
        L_0x00af:
            r4 = move-exception
            goto L_0x00b6
        L_0x00b1:
            r4 = move-exception
            r11 = r1
            goto L_0x00c2
        L_0x00b4:
            r4 = move-exception
            r11 = r1
        L_0x00b6:
            r9 = r4
            goto L_0x00fd
        L_0x00b8:
            r4 = move-exception
            r11 = r1
            goto L_0x00c1
        L_0x00bb:
            r4 = move-exception
            r11 = r1
            goto L_0x00fb
        L_0x00be:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00c1:
            r8 = 0
        L_0x00c2:
            if (r1 == 0) goto L_0x00dc
            r1.close()     // Catch:{ IOException -> 0x00c8 }
            goto L_0x00dc
        L_0x00c8:
            r1 = move-exception
            o.Іε r2 = r13.f10714
            o.Іɛ r2 = r2.t_()
            o.ϵı r2 = r2.m11714()
            java.lang.String r5 = r13.f10710
            java.lang.Object r5 = o.C2244.m11698(r5)
            r2.m11605(r0, r5, r1)
        L_0x00dc:
            if (r3 == 0) goto L_0x00e1
            r3.disconnect()
        L_0x00e1:
            o.Іε r0 = r13.f10714
            o.іƭ r0 = r0.u_()
            o.Іԑ r1 = new o.Іԑ
            java.lang.String r6 = r13.f10710
            o.Іԁ r7 = r13.f10713
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.m13668((java.lang.Runnable) r1)
            throw r4
        L_0x00f8:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00fb:
            r9 = r4
        L_0x00fc:
            r8 = 0
        L_0x00fd:
            if (r1 == 0) goto L_0x0117
            r1.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0117
        L_0x0103:
            r1 = move-exception
            o.Іε r2 = r13.f10714
            o.Іɛ r2 = r2.t_()
            o.ϵı r2 = r2.m11714()
            java.lang.String r4 = r13.f10710
            java.lang.Object r4 = o.C2244.m11698(r4)
            r2.m11605(r0, r4, r1)
        L_0x0117:
            if (r3 == 0) goto L_0x011c
            r3.disconnect()
        L_0x011c:
            o.Іε r0 = r13.f10714
            o.іƭ r0 = r0.u_()
            o.Іԑ r1 = new o.Іԑ
            java.lang.String r6 = r13.f10710
            o.Іԁ r7 = r13.f10713
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.m13668((java.lang.Runnable) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2306.run():void");
    }
}
