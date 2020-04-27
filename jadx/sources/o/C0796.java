package o;

import java.net.URL;
import java.util.List;
import java.util.Map;
import o.C2745;

/* renamed from: o.ƭӏ  reason: contains not printable characters */
final class C0796 implements Runnable {

    /* renamed from: ı  reason: contains not printable characters */
    private final byte[] f5261 = null;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final URL f5262;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C0775 f5263;

    /* renamed from: Ι  reason: contains not printable characters */
    private final Map<String, String> f5264;

    /* renamed from: ι  reason: contains not printable characters */
    private final String f5265;

    /* renamed from: І  reason: contains not printable characters */
    private final /* synthetic */ C0637 f5266;

    public C0796(C0637 r1, String str, URL url, byte[] bArr, Map<String, String> map, C0775 r6) {
        this.f5266 = r1;
        C2745.C2746.m14562(str);
        C2745.C2746.m14555(url);
        C2745.C2746.m14555(r6);
        this.f5262 = url;
        this.f5263 = r6;
        this.f5265 = str;
        this.f5264 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            o.ƒӏ r0 = r7.f5266
            r0.m15902()
            r0 = 0
            r1 = 0
            o.ƒӏ r2 = r7.f5266     // Catch:{ IOException -> 0x0075, all -> 0x0068 }
            java.net.URL r3 = r7.f5262     // Catch:{ IOException -> 0x0075, all -> 0x0068 }
            java.net.HttpURLConnection r2 = r2.m5387((java.net.URL) r3)     // Catch:{ IOException -> 0x0075, all -> 0x0068 }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f5264     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f5264     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            goto L_0x001d
        L_0x0039:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x005e, all -> 0x005a }
            o.ƒӏ r4 = r7.f5266     // Catch:{ IOException -> 0x0054, all -> 0x004e }
            byte[] r4 = o.C0637.m5384((java.net.HttpURLConnection) r2)     // Catch:{ IOException -> 0x0054, all -> 0x004e }
            r2.disconnect()
            r7.m6171(r1, r0, r4, r3)
            return
        L_0x004e:
            r4 = move-exception
            r6 = r4
            r4 = r1
            r1 = r3
            r3 = r6
            goto L_0x006c
        L_0x0054:
            r4 = move-exception
            r6 = r4
            r4 = r1
            r1 = r3
            r3 = r6
            goto L_0x0079
        L_0x005a:
            r3 = move-exception
            r4 = r1
            r1 = r0
            goto L_0x006c
        L_0x005e:
            r3 = move-exception
            r4 = r1
            r1 = r0
            goto L_0x0079
        L_0x0062:
            r3 = move-exception
            r1 = r0
            goto L_0x006b
        L_0x0065:
            r3 = move-exception
            r1 = r0
            goto L_0x0078
        L_0x0068:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x006b:
            r4 = 0
        L_0x006c:
            if (r2 == 0) goto L_0x0071
            r2.disconnect()
        L_0x0071:
            r7.m6171(r4, r0, r0, r1)
            throw r3
        L_0x0075:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x0078:
            r4 = 0
        L_0x0079:
            if (r2 == 0) goto L_0x007e
            r2.disconnect()
        L_0x007e:
            r7.m6171(r4, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0796.run():void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m6171(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f5266.u_().m13668((Runnable) new C0802(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final /* synthetic */ void m6172(int i, Exception exc, byte[] bArr, Map map) {
        this.f5263.m6093(this.f5265, i, exc, bArr, map);
    }
}
