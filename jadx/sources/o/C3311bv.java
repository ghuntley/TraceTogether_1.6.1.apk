package o;

/* renamed from: o.bv  reason: case insensitive filesystem */
abstract class C3311bv extends C3273am {
    public C3311bv(C3269ai aiVar, String str, String str2, C3301bl blVar, C3302bm bmVar) {
        super(aiVar, str, str2, blVar, bmVar);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m1839(C3309bt btVar) {
        C3298bi r0 = m1606();
        String str = btVar.f1789;
        if (r0.f1751 == null) {
            r0.f1751 = r0.m1802();
        }
        r0.f1751.setRequestProperty(C3273am.f1523, str);
        if (r0.f1751 == null) {
            r0.f1751 = r0.m1802();
        }
        r0.f1751.setRequestProperty(C3273am.f1528, C3273am.f1518);
        String r1 = this.f1532.m1597();
        if (r0.f1751 == null) {
            r0.f1751 = r0.m1802();
        }
        r0.f1751.setRequestProperty(C3273am.f1519, r1);
        C3298bi r02 = m1838(r0, btVar);
        C3263ac.m1563();
        m1608();
        if (btVar.f1795 != null) {
            C3263ac.m1563();
            C3263ac.m1563();
        }
        int r5 = r02.m1799();
        if (r02.f1751 == null) {
            r02.f1751 = r02.m1802();
        }
        "POST".equals(r02.f1751.getRequestMethod());
        C3263ac.m1563();
        r02.m1800();
        if (r02.f1751 == null) {
            r02.f1751 = r02.m1802();
        }
        r02.f1751.getHeaderField(C3273am.f1529);
        C3263ac.m1563();
        return C0336.m4438(r5) == 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00b2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.C3298bi m1838(o.C3298bi r7, o.C3309bt r8) {
        /*
            r6 = this;
            java.lang.String r0 = r8.f1793
            java.lang.String r1 = "app[identifier]"
            o.bi r7 = r7.m1797((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r0 = r8.f1794
            java.lang.String r1 = "app[name]"
            o.bi r7 = r7.m1797((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r0 = r8.f1788
            java.lang.String r1 = "app[display_version]"
            o.bi r7 = r7.m1797((java.lang.String) r1, (java.lang.String) r0)
            java.lang.String r0 = r8.f1786
            java.lang.String r1 = "app[build_version]"
            o.bi r7 = r7.m1797((java.lang.String) r1, (java.lang.String) r0)
            int r0 = r8.f1787
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r0.toString()
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            java.lang.String r2 = "app[source]"
            o.bi r7 = r7.m1797((java.lang.String) r2, (java.lang.String) r0)
            java.lang.String r0 = r8.f1796
            java.lang.String r2 = "app[minimum_sdk_version]"
            o.bi r7 = r7.m1797((java.lang.String) r2, (java.lang.String) r0)
            java.lang.String r0 = r8.f1790
            java.lang.String r2 = "app[built_sdk_version]"
            o.bi r7 = r7.m1797((java.lang.String) r2, (java.lang.String) r0)
            java.lang.String r0 = r8.f1792
            boolean r0 = o.C3285aw.m1668((java.lang.String) r0)
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = r8.f1792
            java.lang.String r2 = "app[instance_identifier]"
            r7.m1797((java.lang.String) r2, (java.lang.String) r0)
        L_0x0054:
            o.bE r0 = r8.f1795
            if (r0 == 0) goto L_0x00bd
            o.ai r0 = r6.f1532     // Catch:{ NotFoundException -> 0x00b2 }
            android.content.Context r0 = r0.m1589()     // Catch:{ NotFoundException -> 0x00b2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x00b2 }
            o.bE r2 = r8.f1795     // Catch:{ NotFoundException -> 0x00b2 }
            int r2 = r2.f1586     // Catch:{ NotFoundException -> 0x00b2 }
            java.io.InputStream r0 = r0.openRawResource(r2)     // Catch:{ NotFoundException -> 0x00b2 }
            java.lang.String r2 = "app[icon][hash]"
            o.bE r3 = r8.f1795     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            java.lang.String r3 = r3.f1587     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            o.bi r2 = r7.m1797((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            java.lang.String r3 = "app[icon][data]"
            java.lang.String r4 = "icon.png"
            java.lang.String r5 = "application/octet-stream"
            o.bi r2 = r2.m1798(r3, r4, r5, r0)     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            java.lang.String r3 = "app[icon][width]"
            o.bE r4 = r8.f1795     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            int r4 = r4.f1589     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            if (r4 == 0) goto L_0x008f
            java.lang.String r4 = r4.toString()     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            goto L_0x0090
        L_0x008f:
            r4 = r1
        L_0x0090:
            o.bi r2 = r2.m1797((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            java.lang.String r3 = "app[icon][height]"
            o.bE r4 = r8.f1795     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            int r4 = r4.f1588     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            if (r4 == 0) goto L_0x00a4
            java.lang.String r1 = r4.toString()     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
        L_0x00a4:
            r2.m1797((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ NotFoundException -> 0x00ad, all -> 0x00ab }
            o.C3285aw.m1667((java.io.Closeable) r0)
            goto L_0x00bd
        L_0x00ab:
            r7 = move-exception
            goto L_0x00b9
        L_0x00ad:
            r1 = r0
            goto L_0x00b2
        L_0x00af:
            r7 = move-exception
            r0 = r1
            goto L_0x00b9
        L_0x00b2:
            o.C3263ac.m1563()     // Catch:{ all -> 0x00af }
            o.C3285aw.m1667((java.io.Closeable) r1)
            goto L_0x00bd
        L_0x00b9:
            o.C3285aw.m1667((java.io.Closeable) r0)
            throw r7
        L_0x00bd:
            java.util.Collection<o.mu> r0 = r8.f1791
            if (r0 == 0) goto L_0x00fc
            java.util.Collection<o.mu> r8 = r8.f1791
            java.util.Iterator r8 = r8.iterator()
        L_0x00c7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r8.next()
            o.mu r0 = (o.C3608mu) r0
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r0.f3332
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "app[build][libraries][%s][version]"
            java.lang.String r1 = java.lang.String.format(r1, r4, r3)
            java.lang.String r3 = r0.f3331
            r7.m1797((java.lang.String) r1, (java.lang.String) r3)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r0.f3332
            r2[r5] = r3
            java.lang.String r3 = "app[build][libraries][%s][type]"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            java.lang.String r0 = r0.f3330
            r7.m1797((java.lang.String) r1, (java.lang.String) r0)
            goto L_0x00c7
        L_0x00fc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3311bv.m1838(o.bi, o.bt):o.bi");
    }
}
