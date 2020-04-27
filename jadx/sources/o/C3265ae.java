package o;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: o.ae  reason: case insensitive filesystem */
final class C3265ae implements Callable<Map<String, C3608mu>> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private String f1508;

    C3265ae(String str) {
        this.f1508 = str;
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static Map<String, C3608mu> m1574() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            C3608mu muVar = new C3608mu("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(muVar.f3332, muVar);
            C3263ac.m1563();
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private Map<String, C3608mu> m1576() {
        C3608mu r3;
        HashMap hashMap = new HashMap();
        ZipFile zipFile = new ZipFile(this.f1508);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7 && (r3 = m1575(zipEntry, zipFile)) != null) {
                hashMap.put(r3.f3332, r3);
                C3263ac.m1563();
                Object[] objArr = {r3.f3332, r3.f3331};
            }
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        o.C3263ac.m1563();
        r5.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        o.C3285aw.m1684((java.io.Closeable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.C3608mu m1575(java.util.zip.ZipEntry r5, java.util.zip.ZipFile r6) {
        /*
            r0 = 0
            java.io.InputStream r6 = r6.getInputStream(r5)     // Catch:{ IOException -> 0x0051, all -> 0x004e }
            java.util.Properties r1 = new java.util.Properties     // Catch:{ IOException -> 0x0052 }
            r1.<init>()     // Catch:{ IOException -> 0x0052 }
            r1.load(r6)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r2 = "fabric-identifier"
            java.lang.String r2 = r1.getProperty(r2)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = "fabric-version"
            java.lang.String r3 = r1.getProperty(r3)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r4 = "fabric-build-type"
            java.lang.String r1 = r1.getProperty(r4)     // Catch:{ IOException -> 0x0052 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException -> 0x0052 }
            if (r4 != 0) goto L_0x0034
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IOException -> 0x0052 }
            if (r4 != 0) goto L_0x0034
            o.mu r4 = new o.mu     // Catch:{ IOException -> 0x0052 }
            r4.<init>(r2, r3, r1)     // Catch:{ IOException -> 0x0052 }
            o.C3285aw.m1684((java.io.Closeable) r6)
            return r4
        L_0x0034:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0052 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = "Invalid format of fabric file,"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r3 = r5.getName()     // Catch:{ IOException -> 0x0052 }
            r2.append(r3)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0052 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0052 }
            throw r1     // Catch:{ IOException -> 0x0052 }
        L_0x004c:
            r5 = move-exception
            goto L_0x005c
        L_0x004e:
            r5 = move-exception
            r6 = r0
            goto L_0x005c
        L_0x0051:
            r6 = r0
        L_0x0052:
            o.C3263ac.m1563()     // Catch:{ all -> 0x004c }
            r5.getName()     // Catch:{ all -> 0x004c }
            o.C3285aw.m1684((java.io.Closeable) r6)
            return r0
        L_0x005c:
            o.C3285aw.m1684((java.io.Closeable) r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3265ae.m1575(java.util.zip.ZipEntry, java.util.zip.ZipFile):o.mu");
    }

    public final /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        SystemClock.elapsedRealtime();
        hashMap.putAll(m1574());
        hashMap.putAll(m1576());
        C3263ac.m1563();
        SystemClock.elapsedRealtime();
        return hashMap;
    }
}
