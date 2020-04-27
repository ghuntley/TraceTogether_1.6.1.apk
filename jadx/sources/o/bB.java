package o;

final class bB implements C3315bz {

    /* renamed from: ι  reason: contains not printable characters */
    private final C3269ai f1581;

    public bB(C3269ai aiVar) {
        this.f1581 = aiVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        o.C3285aw.m1667((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        r1 = r0;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0038 */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject m1701() {
        /*
            r4 = this;
            o.C3263ac.m1563()
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            o.bo r2 = new o.bo     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            o.ai r3 = r4.f1581     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            java.io.File r2 = r2.m1824()     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            java.lang.String r3 = "com.crashlytics.settings.json"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            if (r2 == 0) goto L_0x002c
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            java.lang.String r1 = o.C3285aw.m1688((java.io.InputStream) r2)     // Catch:{ Exception -> 0x0038 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0038 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0038 }
            r0 = r2
            goto L_0x0030
        L_0x002c:
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x0037, all -> 0x0035 }
            r3 = r0
        L_0x0030:
            o.C3285aw.m1667((java.io.Closeable) r0)
            r0 = r3
            goto L_0x003e
        L_0x0035:
            r1 = move-exception
            goto L_0x0042
        L_0x0037:
            r2 = r0
        L_0x0038:
            o.C3263ac.m1563()     // Catch:{ all -> 0x003f }
            o.C3285aw.m1667((java.io.Closeable) r2)
        L_0x003e:
            return r0
        L_0x003f:
            r0 = move-exception
            r1 = r0
            r0 = r2
        L_0x0042:
            o.C3285aw.m1667((java.io.Closeable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bB.m1701():org.json.JSONObject");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|11|14|15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r5 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0037 */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1700(long r4, org.json.JSONObject r6) {
        /*
            r3 = this;
            o.C3263ac.m1563()
            if (r6 == 0) goto L_0x0042
            r0 = 0
            java.lang.String r1 = "expires_at"
            r6.put(r1, r4)     // Catch:{ Exception -> 0x0037 }
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x0037 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0037 }
            o.bo r1 = new o.bo     // Catch:{ Exception -> 0x0037 }
            o.ai r2 = r3.f1581     // Catch:{ Exception -> 0x0037 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0037 }
            java.io.File r1 = r1.m1824()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r2 = "com.crashlytics.settings.json"
            r5.<init>(r1, r2)     // Catch:{ Exception -> 0x0037 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r4.write(r5)     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r4.flush()     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            o.C3285aw.m1667((java.io.Closeable) r4)
            return
        L_0x0030:
            r5 = move-exception
            r0 = r4
            goto L_0x003e
        L_0x0033:
            r0 = r4
            goto L_0x0037
        L_0x0035:
            r5 = move-exception
            goto L_0x003e
        L_0x0037:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0035 }
            o.C3285aw.m1667((java.io.Closeable) r0)
            return
        L_0x003e:
            o.C3285aw.m1667((java.io.Closeable) r0)
            throw r5
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bB.m1700(long, org.json.JSONObject):void");
    }
}
