package o;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: o.ɟІ  reason: contains not printable characters */
class C1161 {

    /* renamed from: ı  reason: contains not printable characters */
    private static final String f6706 = "keys";

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final String f6707 = "userId";

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final String f6708 = ".meta";

    /* renamed from: Ι  reason: contains not printable characters */
    private static final String f6709 = "user";

    /* renamed from: ι  reason: contains not printable characters */
    private static final Charset f6710 = Charset.forName("UTF-8");

    /* renamed from: і  reason: contains not printable characters */
    private static final String f6711 = "userEmail";

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static final String f6712 = "userName";

    /* renamed from: ɹ  reason: contains not printable characters */
    private final File f6713;

    public C1161(File file) {
        this.f6713 = file;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002b */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7639(java.lang.String r5, o.C1546 r6) {
        /*
            r4 = this;
            java.io.File r5 = r4.m7637((java.lang.String) r5)
            r0 = 0
            java.lang.String r6 = m7632((o.C1546) r6)     // Catch:{ Exception -> 0x002b }
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x002b }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x002b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002b }
            r3.<init>(r5)     // Catch:{ Exception -> 0x002b }
            java.nio.charset.Charset r5 = f6710     // Catch:{ Exception -> 0x002b }
            r2.<init>(r3, r5)     // Catch:{ Exception -> 0x002b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x002b }
            r1.write(r6)     // Catch:{ Exception -> 0x0027, all -> 0x0024 }
            r1.flush()     // Catch:{ Exception -> 0x0027, all -> 0x0024 }
            o.C3285aw.m1667((java.io.Closeable) r1)
            return
        L_0x0024:
            r5 = move-exception
            r0 = r1
            goto L_0x0032
        L_0x0027:
            r0 = r1
            goto L_0x002b
        L_0x0029:
            r5 = move-exception
            goto L_0x0032
        L_0x002b:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0029 }
            o.C3285aw.m1667((java.io.Closeable) r0)
            return
        L_0x0032:
            o.C3285aw.m1667((java.io.Closeable) r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1161.m7639(java.lang.String, o.ɾɪ):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|13|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r3 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0026 */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.C1546 m7641(java.lang.String r3) {
        /*
            r2 = this;
            java.io.File r3 = r2.m7637((java.lang.String) r3)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x000d
            o.ɾɪ r3 = o.C1546.f8224
            return r3
        L_0x000d:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0026 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r3 = o.C3285aw.m1688((java.io.InputStream) r1)     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            o.ɾɪ r3 = m7636(r3)     // Catch:{ Exception -> 0x0022, all -> 0x001f }
            o.C3285aw.m1667((java.io.Closeable) r1)
            return r3
        L_0x001f:
            r3 = move-exception
            r0 = r1
            goto L_0x002f
        L_0x0022:
            r0 = r1
            goto L_0x0026
        L_0x0024:
            r3 = move-exception
            goto L_0x002f
        L_0x0026:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0024 }
            o.C3285aw.m1667((java.io.Closeable) r0)
            o.ɾɪ r3 = o.C1546.f8224
            return r3
        L_0x002f:
            o.C3285aw.m1667((java.io.Closeable) r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1161.m7641(java.lang.String):o.ɾɪ");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002b */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7640(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r4 = this;
            java.io.File r5 = r4.m7642(r5)
            r0 = 0
            java.lang.String r6 = m7634((java.util.Map<java.lang.String, java.lang.String>) r6)     // Catch:{ Exception -> 0x002b }
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x002b }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x002b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002b }
            r3.<init>(r5)     // Catch:{ Exception -> 0x002b }
            java.nio.charset.Charset r5 = f6710     // Catch:{ Exception -> 0x002b }
            r2.<init>(r3, r5)     // Catch:{ Exception -> 0x002b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x002b }
            r1.write(r6)     // Catch:{ Exception -> 0x0027, all -> 0x0024 }
            r1.flush()     // Catch:{ Exception -> 0x0027, all -> 0x0024 }
            o.C3285aw.m1667((java.io.Closeable) r1)
            return
        L_0x0024:
            r5 = move-exception
            r0 = r1
            goto L_0x0032
        L_0x0027:
            r0 = r1
            goto L_0x002b
        L_0x0029:
            r5 = move-exception
            goto L_0x0032
        L_0x002b:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0029 }
            o.C3285aw.m1667((java.io.Closeable) r0)
            return
        L_0x0032:
            o.C3285aw.m1667((java.io.Closeable) r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1161.m7640(java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|13|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r3 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0028 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> m7638(java.lang.String r3) {
        /*
            r2 = this;
            java.io.File r3 = r2.m7642(r3)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x000f
            java.util.Map r3 = java.util.Collections.emptyMap()
            return r3
        L_0x000f:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0028 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0028 }
            java.lang.String r3 = o.C3285aw.m1688((java.io.InputStream) r1)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            java.util.Map r3 = m7633(r3)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            o.C3285aw.m1667((java.io.Closeable) r1)
            return r3
        L_0x0021:
            r3 = move-exception
            r0 = r1
            goto L_0x0033
        L_0x0024:
            r0 = r1
            goto L_0x0028
        L_0x0026:
            r3 = move-exception
            goto L_0x0033
        L_0x0028:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0026 }
            o.C3285aw.m1667((java.io.Closeable) r0)
            java.util.Map r3 = java.util.Collections.emptyMap()
            return r3
        L_0x0033:
            o.C3285aw.m1667((java.io.Closeable) r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1161.m7638(java.lang.String):java.util.Map");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public File m7637(String str) {
        File file = this.f6713;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user.meta");
        return new File(file, sb.toString());
    }

    /* renamed from: ι  reason: contains not printable characters */
    public File m7642(String str) {
        File file = this.f6713;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys.meta");
        return new File(file, sb.toString());
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C1546 m7636(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new C1546(m7635(jSONObject, f6707), m7635(jSONObject, f6712), m7635(jSONObject, f6711));
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m7632(final C1546 r1) {
        return new JSONObject() {
            {
                put(C1161.f6707, r1.f8225);
                put(C1161.f6712, r1.f8227);
                put(C1161.f6711, r1.f8226);
            }
        }.toString();
    }

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static Map<String, String> m7633(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m7635(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static String m7634(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static String m7635(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }
}
