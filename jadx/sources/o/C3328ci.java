package o;

/* renamed from: o.ci  reason: case insensitive filesystem */
public final class C3328ci implements C3326cg, C3342cu {

    /* renamed from: Ι  reason: contains not printable characters */
    private cU<C3326cg> f1969;

    /* renamed from: ι  reason: contains not printable characters */
    public volatile boolean f1970;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r1 = r1.f1934;
        r3 = r1.length;
        r5 = null;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r2 >= r3) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r6 = r1[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r6 instanceof o.C3326cg) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((o.C3326cg) r6).m1959();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        o.C2745.m14522(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r5 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r5.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r5.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        throw o.cW.m1935((java.lang.Throwable) r5.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        throw new o.C3337cp((java.lang.Iterable<? extends java.lang.Throwable>) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m1966() {
        /*
            r8 = this;
            boolean r0 = r8.f1970
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r8)
            boolean r0 = r8.f1970     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r8.f1970 = r0     // Catch:{ all -> 0x0056 }
            o.cU<o.cg> r1 = r8.f1969     // Catch:{ all -> 0x0056 }
            r2 = 0
            r8.f1969 = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x0055
            T[] r1 = r1.f1934
            int r3 = r1.length
            r4 = 0
            r5 = r2
            r2 = 0
        L_0x001d:
            if (r2 >= r3) goto L_0x003c
            r6 = r1[r2]
            boolean r7 = r6 instanceof o.C3326cg
            if (r7 == 0) goto L_0x0039
            o.cg r6 = (o.C3326cg) r6     // Catch:{ all -> 0x002b }
            r6.m1959()     // Catch:{ all -> 0x002b }
            goto L_0x0039
        L_0x002b:
            r6 = move-exception
            o.C2745.m14522((java.lang.Throwable) r6)
            if (r5 != 0) goto L_0x0036
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0036:
            r5.add(r6)
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x003c:
            if (r5 == 0) goto L_0x0055
            int r1 = r5.size()
            if (r1 != r0) goto L_0x004f
            java.lang.Object r0 = r5.get(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = o.cW.m1935(r0)
            throw r0
        L_0x004f:
            o.cp r0 = new o.cp
            r0.<init>((java.lang.Iterable<? extends java.lang.Throwable>) r5)
            throw r0
        L_0x0055:
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3328ci.m1966():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        return true;
     */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m1967(o.C3326cg r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0095
            boolean r0 = r10.f1970
            if (r0 != 0) goto L_0x0090
            monitor-enter(r10)
            boolean r0 = r10.f1970     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x008b
            o.cU<o.cg> r0 = r10.f1969     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0016
            o.cU r0 = new o.cU     // Catch:{ all -> 0x008d }
            r0.<init>()     // Catch:{ all -> 0x008d }
            r10.f1969 = r0     // Catch:{ all -> 0x008d }
        L_0x0016:
            T[] r1 = r0.f1934     // Catch:{ all -> 0x008d }
            int r2 = r0.f1936     // Catch:{ all -> 0x008d }
            int r3 = r11.hashCode()     // Catch:{ all -> 0x008d }
            r4 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r3 = r3 * r4
            int r5 = r3 >>> 16
            r3 = r3 ^ r5
            r3 = r3 & r2
            r5 = r1[r3]     // Catch:{ all -> 0x008d }
            r6 = 1
            if (r5 == 0) goto L_0x003f
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x008d }
            if (r5 != 0) goto L_0x0089
        L_0x0032:
            int r3 = r3 + r6
            r3 = r3 & r2
            r5 = r1[r3]     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x003f
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0032
            goto L_0x0089
        L_0x003f:
            r1[r3] = r11     // Catch:{ all -> 0x008d }
            int r11 = r0.f1935     // Catch:{ all -> 0x008d }
            int r11 = r11 + r6
            r0.f1935 = r11     // Catch:{ all -> 0x008d }
            int r1 = r0.f1933     // Catch:{ all -> 0x008d }
            if (r11 < r1) goto L_0x0089
            T[] r11 = r0.f1934     // Catch:{ all -> 0x008d }
            int r1 = r11.length     // Catch:{ all -> 0x008d }
            int r2 = r1 << 1
            int r3 = r2 + -1
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x008d }
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ all -> 0x008d }
            int r7 = r0.f1935     // Catch:{ all -> 0x008d }
        L_0x0057:
            int r8 = r7 + -1
            if (r7 == 0) goto L_0x007d
        L_0x005b:
            int r1 = r1 + -1
            r7 = r11[r1]     // Catch:{ all -> 0x008d }
            if (r7 == 0) goto L_0x005b
            r7 = r11[r1]     // Catch:{ all -> 0x008d }
            int r7 = r7.hashCode()     // Catch:{ all -> 0x008d }
            int r7 = r7 * r4
            int r9 = r7 >>> 16
            r7 = r7 ^ r9
            r7 = r7 & r3
            r9 = r5[r7]     // Catch:{ all -> 0x008d }
            if (r9 == 0) goto L_0x0077
        L_0x0071:
            int r7 = r7 + r6
            r7 = r7 & r3
            r9 = r5[r7]     // Catch:{ all -> 0x008d }
            if (r9 != 0) goto L_0x0071
        L_0x0077:
            r9 = r11[r1]     // Catch:{ all -> 0x008d }
            r5[r7] = r9     // Catch:{ all -> 0x008d }
            r7 = r8
            goto L_0x0057
        L_0x007d:
            r0.f1936 = r3     // Catch:{ all -> 0x008d }
            float r11 = (float) r2     // Catch:{ all -> 0x008d }
            r1 = 1061158912(0x3f400000, float:0.75)
            float r11 = r11 * r1
            int r11 = (int) r11     // Catch:{ all -> 0x008d }
            r0.f1933 = r11     // Catch:{ all -> 0x008d }
            r0.f1934 = r5     // Catch:{ all -> 0x008d }
        L_0x0089:
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            return r6
        L_0x008b:
            monitor-exit(r10)
            goto L_0x0090
        L_0x008d:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x0090:
            r11.m1959()
            r11 = 0
            return r11
        L_0x0095:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "disposable is null"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3328ci.m1967(o.cg):boolean");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final boolean m1968(C3326cg cgVar) {
        if (!m1965(cgVar)) {
            return false;
        }
        cgVar.m1959();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a A[DONT_GENERATE] */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m1965(o.C3326cg r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0051
            boolean r0 = r7.f1970
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            monitor-enter(r7)
            boolean r0 = r7.f1970     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            return r1
        L_0x000f:
            o.cU<o.cg> r0 = r7.f1969     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004c
            T[] r2 = r0.f1934     // Catch:{ all -> 0x004e }
            int r3 = r0.f1936     // Catch:{ all -> 0x004e }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x004e }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004e }
            r6 = 1
            if (r5 != 0) goto L_0x002b
        L_0x0029:
            r8 = 0
            goto L_0x0047
        L_0x002b:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0036
            boolean r8 = r0.m1933(r4, r2, r3)     // Catch:{ all -> 0x004e }
            goto L_0x0047
        L_0x0036:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004e }
            if (r5 != 0) goto L_0x003d
            goto L_0x0029
        L_0x003d:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0036
            boolean r8 = r0.m1933(r4, r2, r3)     // Catch:{ all -> 0x004e }
        L_0x0047:
            if (r8 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            monitor-exit(r7)
            return r6
        L_0x004c:
            monitor-exit(r7)     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x0051:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "disposables is null"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3328ci.m1965(o.cg):boolean");
    }
}
