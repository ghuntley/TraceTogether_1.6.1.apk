package o;

import org.json.JSONObject;

final class bC extends C3273am implements bO {
    public bC(C3269ai aiVar, String str, String str2, C3301bl blVar) {
        this(aiVar, str, str2, blVar, C3302bm.GET);
    }

    private bC(C3269ai aiVar, String str, String str2, C3301bl blVar, C3302bm bmVar) {
        super(aiVar, str, str2, blVar, bmVar);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private JSONObject m1702(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            C3263ac.m1563();
            m1608();
            C3263ac.m1563();
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:75|76|(3:78|(1:80)|81)) */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0138, code lost:
        if (r2 != null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013a, code lost:
        o.C3263ac.m1563();
        r2.m1800();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0142, code lost:
        if (r2.f1751 == null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0144, code lost:
        r2.f1751 = r2.m1802();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014a, code lost:
        r2.f1751.getHeaderField(o.C3273am.f1529);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0150, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0153, code lost:
        o.C3263ac.m1563();
        r2.m1800();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015b, code lost:
        if (r2.f1751 == null) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015d, code lost:
        r2.f1751 = r2.m1802();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0163, code lost:
        r2.f1751.getHeaderField(o.C3273am.f1529);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0135 */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010b A[Catch:{ if -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0115 A[Catch:{ if -> 0x0135 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0153  */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject m1703(o.bQ r7) {
        /*
            r6 = this;
            java.lang.String r0 = "X-REQUEST-ID"
            r1 = 0
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ if -> 0x0134, all -> 0x0131 }
            r2.<init>()     // Catch:{ if -> 0x0134, all -> 0x0131 }
            java.lang.String r3 = "build_version"
            java.lang.String r4 = r7.f1627     // Catch:{ if -> 0x0134, all -> 0x0131 }
            r2.put(r3, r4)     // Catch:{ if -> 0x0134, all -> 0x0131 }
            java.lang.String r3 = "display_version"
            java.lang.String r4 = r7.f1632     // Catch:{ if -> 0x0134, all -> 0x0131 }
            r2.put(r3, r4)     // Catch:{ if -> 0x0134, all -> 0x0131 }
            java.lang.String r3 = "source"
            int r4 = r7.f1630     // Catch:{ if -> 0x0134, all -> 0x0131 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ if -> 0x0134, all -> 0x0131 }
            r2.put(r3, r4)     // Catch:{ if -> 0x0134, all -> 0x0131 }
            java.lang.String r3 = r7.f1631     // Catch:{ if -> 0x0134, all -> 0x0131 }
            if (r3 == 0) goto L_0x002c
            java.lang.String r3 = "icon_hash"
            java.lang.String r4 = r7.f1631     // Catch:{ if -> 0x0134, all -> 0x0131 }
            r2.put(r3, r4)     // Catch:{ if -> 0x0134, all -> 0x0131 }
        L_0x002c:
            java.lang.String r3 = r7.f1624     // Catch:{ if -> 0x0134, all -> 0x0131 }
            boolean r4 = o.C3285aw.m1668((java.lang.String) r3)     // Catch:{ if -> 0x0134, all -> 0x0131 }
            if (r4 != 0) goto L_0x0039
            java.lang.String r4 = "instance"
            r2.put(r4, r3)     // Catch:{ if -> 0x0134, all -> 0x0131 }
        L_0x0039:
            o.bi r2 = r6.m1607(r2)     // Catch:{ if -> 0x0134, all -> 0x0131 }
            java.lang.String r3 = "X-CRASHLYTICS-API-KEY"
            java.lang.String r4 = r7.f1625     // Catch:{ if -> 0x0135 }
            if (r4 == 0) goto L_0x0052
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            if (r5 != 0) goto L_0x004d
            java.net.HttpURLConnection r5 = r2.m1802()     // Catch:{ if -> 0x0135 }
            r2.f1751 = r5     // Catch:{ if -> 0x0135 }
        L_0x004d:
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            r5.setRequestProperty(r3, r4)     // Catch:{ if -> 0x0135 }
        L_0x0052:
            java.lang.String r3 = "X-CRASHLYTICS-API-CLIENT-TYPE"
            java.lang.String r4 = "android"
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            if (r5 != 0) goto L_0x0060
            java.net.HttpURLConnection r5 = r2.m1802()     // Catch:{ if -> 0x0135 }
            r2.f1751 = r5     // Catch:{ if -> 0x0135 }
        L_0x0060:
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            r5.setRequestProperty(r3, r4)     // Catch:{ if -> 0x0135 }
            java.lang.String r3 = "X-CRASHLYTICS-API-CLIENT-VERSION"
            o.ai r4 = r6.f1532     // Catch:{ if -> 0x0135 }
            java.lang.String r4 = r4.m1597()     // Catch:{ if -> 0x0135 }
            if (r4 == 0) goto L_0x007e
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            if (r5 != 0) goto L_0x0079
            java.net.HttpURLConnection r5 = r2.m1802()     // Catch:{ if -> 0x0135 }
            r2.f1751 = r5     // Catch:{ if -> 0x0135 }
        L_0x0079:
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            r5.setRequestProperty(r3, r4)     // Catch:{ if -> 0x0135 }
        L_0x007e:
            java.lang.String r3 = "Accept"
            java.lang.String r4 = "application/json"
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            if (r5 != 0) goto L_0x008c
            java.net.HttpURLConnection r5 = r2.m1802()     // Catch:{ if -> 0x0135 }
            r2.f1751 = r5     // Catch:{ if -> 0x0135 }
        L_0x008c:
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            r5.setRequestProperty(r3, r4)     // Catch:{ if -> 0x0135 }
            java.lang.String r3 = "X-CRASHLYTICS-DEVICE-MODEL"
            java.lang.String r4 = r7.f1626     // Catch:{ if -> 0x0135 }
            if (r4 == 0) goto L_0x00a6
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            if (r5 != 0) goto L_0x00a1
            java.net.HttpURLConnection r5 = r2.m1802()     // Catch:{ if -> 0x0135 }
            r2.f1751 = r5     // Catch:{ if -> 0x0135 }
        L_0x00a1:
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            r5.setRequestProperty(r3, r4)     // Catch:{ if -> 0x0135 }
        L_0x00a6:
            java.lang.String r3 = "X-CRASHLYTICS-OS-BUILD-VERSION"
            java.lang.String r4 = r7.f1629     // Catch:{ if -> 0x0135 }
            if (r4 == 0) goto L_0x00bb
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            if (r5 != 0) goto L_0x00b6
            java.net.HttpURLConnection r5 = r2.m1802()     // Catch:{ if -> 0x0135 }
            r2.f1751 = r5     // Catch:{ if -> 0x0135 }
        L_0x00b6:
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            r5.setRequestProperty(r3, r4)     // Catch:{ if -> 0x0135 }
        L_0x00bb:
            java.lang.String r3 = "X-CRASHLYTICS-OS-DISPLAY-VERSION"
            java.lang.String r4 = r7.f1623     // Catch:{ if -> 0x0135 }
            if (r4 == 0) goto L_0x00d0
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            if (r5 != 0) goto L_0x00cb
            java.net.HttpURLConnection r5 = r2.m1802()     // Catch:{ if -> 0x0135 }
            r2.f1751 = r5     // Catch:{ if -> 0x0135 }
        L_0x00cb:
            java.net.HttpURLConnection r5 = r2.f1751     // Catch:{ if -> 0x0135 }
            r5.setRequestProperty(r3, r4)     // Catch:{ if -> 0x0135 }
        L_0x00d0:
            java.lang.String r3 = "X-CRASHLYTICS-INSTALLATION-ID"
            java.lang.String r7 = r7.f1628     // Catch:{ if -> 0x0135 }
            if (r7 == 0) goto L_0x00e5
            java.net.HttpURLConnection r4 = r2.f1751     // Catch:{ if -> 0x0135 }
            if (r4 != 0) goto L_0x00e0
            java.net.HttpURLConnection r4 = r2.m1802()     // Catch:{ if -> 0x0135 }
            r2.f1751 = r4     // Catch:{ if -> 0x0135 }
        L_0x00e0:
            java.net.HttpURLConnection r4 = r2.f1751     // Catch:{ if -> 0x0135 }
            r4.setRequestProperty(r3, r7)     // Catch:{ if -> 0x0135 }
        L_0x00e5:
            o.C3263ac.m1563()     // Catch:{ if -> 0x0135 }
            r6.m1608()     // Catch:{ if -> 0x0135 }
            o.C3263ac.m1563()     // Catch:{ if -> 0x0135 }
            int r7 = r2.m1799()     // Catch:{ if -> 0x0135 }
            o.C3263ac.m1563()     // Catch:{ if -> 0x0135 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r7 == r3) goto L_0x0108
            r3 = 201(0xc9, float:2.82E-43)
            if (r7 == r3) goto L_0x0108
            r3 = 202(0xca, float:2.83E-43)
            if (r7 == r3) goto L_0x0108
            r3 = 203(0xcb, float:2.84E-43)
            if (r7 != r3) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r7 = 0
            goto L_0x0109
        L_0x0108:
            r7 = 1
        L_0x0109:
            if (r7 == 0) goto L_0x0115
            java.lang.String r7 = r2.m1796()     // Catch:{ if -> 0x0135 }
            org.json.JSONObject r7 = r6.m1702(r7)     // Catch:{ if -> 0x0135 }
            r1 = r7
            goto L_0x011b
        L_0x0115:
            o.C3263ac.m1563()     // Catch:{ if -> 0x0135 }
            r6.m1608()     // Catch:{ if -> 0x0135 }
        L_0x011b:
            o.C3263ac.m1563()
            r2.m1800()
            java.net.HttpURLConnection r7 = r2.f1751
            if (r7 != 0) goto L_0x012b
            java.net.HttpURLConnection r7 = r2.m1802()
            r2.f1751 = r7
        L_0x012b:
            java.net.HttpURLConnection r7 = r2.f1751
            r7.getHeaderField(r0)
            goto L_0x014f
        L_0x0131:
            r7 = move-exception
            r2 = r1
            goto L_0x0151
        L_0x0134:
            r2 = r1
        L_0x0135:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0150 }
            if (r2 == 0) goto L_0x014f
            o.C3263ac.m1563()
            r2.m1800()
            java.net.HttpURLConnection r7 = r2.f1751
            if (r7 != 0) goto L_0x014a
            java.net.HttpURLConnection r7 = r2.m1802()
            r2.f1751 = r7
        L_0x014a:
            java.net.HttpURLConnection r7 = r2.f1751
            r7.getHeaderField(r0)
        L_0x014f:
            return r1
        L_0x0150:
            r7 = move-exception
        L_0x0151:
            if (r2 == 0) goto L_0x0168
            o.C3263ac.m1563()
            r2.m1800()
            java.net.HttpURLConnection r1 = r2.f1751
            if (r1 != 0) goto L_0x0163
            java.net.HttpURLConnection r1 = r2.m1802()
            r2.f1751 = r1
        L_0x0163:
            java.net.HttpURLConnection r1 = r2.f1751
            r1.getHeaderField(r0)
        L_0x0168:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bC.m1703(o.bQ):org.json.JSONObject");
    }
}
