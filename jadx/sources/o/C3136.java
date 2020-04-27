package o;

import android.content.Context;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.մ  reason: contains not printable characters */
public final class C3136 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Map<String, C3136> f14300 = new HashMap();

    /* renamed from: ı  reason: contains not printable characters */
    private final Context f14301;

    /* renamed from: ɩ  reason: contains not printable characters */
    final String f14302;

    private C3136(Context context, String str) {
        this.f14301 = context;
        this.f14302 = str;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized Void m15892(C2832 r4) {
        FileOutputStream openFileOutput = this.f14301.openFileOutput(this.f14302, 0);
        try {
            openFileOutput.write(r4.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[SYNTHETIC, Splitter:B:15:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002e }] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized o.C2832 m15891() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.f14301     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002e }
            java.lang.String r2 = r6.f14302     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002e }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0038, all -> 0x002e }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            byte[] r2 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            r3 = 0
            int r4 = r2.length     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            r1.read(r2, r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            java.lang.String r3 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r2, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            r2.<init>(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            o.Ӏв r0 = o.C2832.m14775(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x002c, all -> 0x002a }
            r1.close()     // Catch:{ all -> 0x003f }
            monitor-exit(r6)
            return r0
        L_0x002a:
            r0 = move-exception
            goto L_0x0032
        L_0x002c:
            goto L_0x0039
        L_0x002e:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()     // Catch:{ all -> 0x003f }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x003f }
        L_0x0038:
            r1 = r0
        L_0x0039:
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ all -> 0x003f }
            goto L_0x0042
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0042:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3136.m15891():o.Ӏв");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized Void m15893() {
        this.f14301.deleteFile(this.f14302);
        return null;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static synchronized C3136 m15890(Context context, String str) {
        C3136 r3;
        synchronized (C3136.class) {
            if (!f14300.containsKey(str)) {
                f14300.put(str, new C3136(context, str));
            }
            r3 = f14300.get(str);
        }
        return r3;
    }
}
