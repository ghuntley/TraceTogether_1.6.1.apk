package o;

/* renamed from: o.ιͱ  reason: contains not printable characters */
public final class C2019<V> {

    /* renamed from: ɹ  reason: contains not printable characters */
    private static final Object f9980 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    private final String f9981;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Object f9982;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final V f9983;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2018<V> f9984;

    /* renamed from: ι  reason: contains not printable characters */
    private final V f9985;

    /* renamed from: І  reason: contains not printable characters */
    private volatile V f9986;

    /* renamed from: і  reason: contains not printable characters */
    private volatile V f9987;

    private C2019(String str, V v, V v2, C2018<V> r5) {
        this.f9982 = new Object();
        this.f9987 = null;
        this.f9986 = null;
        this.f9981 = str;
        this.f9985 = v;
        this.f9983 = v2;
        this.f9984 = r5;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final String m10832() {
        return this.f9981;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x004c */
    /* renamed from: Ι  reason: contains not printable characters */
    public final V m10833(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9982
            monitor-enter(r0)
            V r1 = r3.f9987     // Catch:{ all -> 0x007a }
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0009
            return r4
        L_0x0009:
            o.кӀ r4 = o.C2064.f10131
            if (r4 != 0) goto L_0x0010
            V r4 = r3.f9985
            return r4
        L_0x0010:
            o.кӀ r4 = o.C2064.f10131
            java.lang.Object r4 = f9980
            monitor-enter(r4)
            boolean r0 = o.C2448.m12571()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0026
            V r0 = r3.f9986     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0022
            V r0 = r3.f9985     // Catch:{ all -> 0x0077 }
            goto L_0x0024
        L_0x0022:
            V r0 = r3.f9986     // Catch:{ all -> 0x0077 }
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x0077 }
            return r0
        L_0x0026:
            monitor-exit(r4)     // Catch:{ all -> 0x0077 }
            java.util.List r4 = o.C2529.f11598     // Catch:{ SecurityException -> 0x005e }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005e }
        L_0x002f:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005e }
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005e }
            o.ιͱ r0 = (o.C2019) r0     // Catch:{ SecurityException -> 0x005e }
            boolean r1 = o.C2448.m12571()     // Catch:{ SecurityException -> 0x005e }
            if (r1 != 0) goto L_0x0056
            r1 = 0
            o.ιʭ<V> r2 = r0.f9984     // Catch:{ IllegalStateException -> 0x004c }
            if (r2 == 0) goto L_0x004c
            o.ιʭ<V> r2 = r0.f9984     // Catch:{ IllegalStateException -> 0x004c }
            java.lang.Object r1 = r2.m10831()     // Catch:{ IllegalStateException -> 0x004c }
        L_0x004c:
            java.lang.Object r2 = f9980     // Catch:{ SecurityException -> 0x005e }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005e }
            r0.f9986 = r1     // Catch:{ all -> 0x0053 }
            monitor-exit(r2)     // Catch:{ all -> 0x0053 }
            goto L_0x002f
        L_0x0053:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0053 }
            throw r4     // Catch:{ SecurityException -> 0x005e }
        L_0x0056:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005e }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005e }
            throw r4     // Catch:{ SecurityException -> 0x005e }
        L_0x005e:
        L_0x005f:
            o.ιʭ<V> r4 = r3.f9984
            if (r4 != 0) goto L_0x0068
            o.кӀ r4 = o.C2064.f10131
            V r4 = r3.f9985
            return r4
        L_0x0068:
            java.lang.Object r4 = r4.m10831()     // Catch:{ SecurityException -> 0x0072, IllegalStateException -> 0x006d }
            return r4
        L_0x006d:
            o.кӀ r4 = o.C2064.f10131
            V r4 = r3.f9985
            return r4
        L_0x0072:
            o.кӀ r4 = o.C2064.f10131
            V r4 = r3.f9985
            return r4
        L_0x0077:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0077 }
            throw r0
        L_0x007a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2019.m10833(java.lang.Object):java.lang.Object");
    }
}
