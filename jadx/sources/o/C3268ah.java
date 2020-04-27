package o;

/* renamed from: o.ah  reason: case insensitive filesystem */
final class C3268ah<Result> extends aN<Void, Void, Result> {

    /* renamed from: Ι  reason: contains not printable characters */
    private C3269ai<Result> f1510;

    public C3268ah(C3269ai<Result> aiVar) {
        this.f1510 = aiVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1582() {
        /*
            r2 = this;
            super.m1488()
            o.aH r0 = new o.aH
            o.ai<Result> r1 = r2.f1510
            r1.m1591()
            java.lang.String r1 = "KitInitialization"
            r0.<init>(r1)
            r0.m1496()
            o.ai<Result> r1 = r2.f1510     // Catch:{ aT -> 0x002d, Exception -> 0x0023 }
            boolean r1 = r1.e_()     // Catch:{ aT -> 0x002d, Exception -> 0x0023 }
            r0.m1495()
            if (r1 != 0) goto L_0x0020
            r2.m1489()
        L_0x0020:
            return
        L_0x0021:
            r1 = move-exception
            goto L_0x002f
        L_0x0023:
            o.C3263ac.m1563()     // Catch:{ all -> 0x0021 }
            r0.m1495()
            r2.m1489()
            return
        L_0x002d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x002f:
            r0.m1495()
            r2.m1489()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3268ah.m1582():void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m1585(Result result) {
        this.f1510.m1598(result);
        this.f1510.f1514.m1578();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1583(Result result) {
        this.f1510.m1594(result);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1510.m1591());
        sb.append(" Initialization was cancelled");
        this.f1510.f1514.m1577(new C3266af(sb.toString()));
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final aL m1581() {
        return aL.HIGH;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* synthetic */ Object m1584() {
        this.f1510.m1591();
        aH aHVar = new aH("KitInitialization");
        aHVar.m1496();
        Result r1 = !M_() ? this.f1510.m1587() : null;
        aHVar.m1495();
        return r1;
    }
}
