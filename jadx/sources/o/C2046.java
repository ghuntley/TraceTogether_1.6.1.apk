package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.ιв  reason: contains not printable characters */
public final class C2046 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static C2905 f10099;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final long f10100 = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: ι  reason: contains not printable characters */
    private static final Object f10101 = new Object();

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: Ι  reason: contains not printable characters */
    public static android.content.ComponentName m10938(android.content.Context r16, android.content.Intent r17) {
        /*
            r0 = r17
            java.lang.Object r1 = f10101
            monitor-enter(r1)
            o.ӏʄ r2 = f10099     // Catch:{ all -> 0x00d5 }
            r3 = 1
            if (r2 != 0) goto L_0x001d
            o.ӏʄ r2 = new o.ӏʄ     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = "wake:com.google.firebase.iid.WakeLockHolder"
            r5 = r16
            r2.<init>(r5, r4)     // Catch:{ all -> 0x00d5 }
            f10099 = r2     // Catch:{ all -> 0x00d5 }
            android.os.PowerManager$WakeLock r4 = r2.f13520     // Catch:{ all -> 0x00d5 }
            r4.setReferenceCounted(r3)     // Catch:{ all -> 0x00d5 }
            r2.f13519 = r3     // Catch:{ all -> 0x00d5 }
            goto L_0x001f
        L_0x001d:
            r5 = r16
        L_0x001f:
            java.lang.String r2 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r4 = 0
            boolean r2 = r0.getBooleanExtra(r2, r4)     // Catch:{ all -> 0x00d5 }
            java.lang.String r6 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r0.putExtra(r6, r3)     // Catch:{ all -> 0x00d5 }
            android.content.ComponentName r0 = r16.startService(r17)     // Catch:{ all -> 0x00d5 }
            r5 = 0
            if (r0 != 0) goto L_0x0034
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            return r5
        L_0x0034:
            if (r2 != 0) goto L_0x00d3
            o.ӏʄ r2 = f10099     // Catch:{ all -> 0x00d5 }
            long r14 = f10100     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.atomic.AtomicInteger r6 = r2.f13515     // Catch:{ all -> 0x00d5 }
            r6.incrementAndGet()     // Catch:{ all -> 0x00d5 }
            boolean r6 = r2.f13519     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0046
            android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00d5 }
        L_0x0046:
            java.lang.Object r12 = r2.f13514     // Catch:{ all -> 0x00d5 }
            monitor-enter(r12)     // Catch:{ all -> 0x00d5 }
            java.util.Map<java.lang.String, java.lang.Integer[]> r6 = r2.f13522     // Catch:{ all -> 0x00cf }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x00cf }
            if (r6 == 0) goto L_0x0055
            int r6 = r2.f13521     // Catch:{ all -> 0x00cf }
            if (r6 <= 0) goto L_0x0064
        L_0x0055:
            android.os.PowerManager$WakeLock r6 = r2.f13520     // Catch:{ all -> 0x00cf }
            boolean r6 = r6.isHeld()     // Catch:{ all -> 0x00cf }
            if (r6 != 0) goto L_0x0064
            java.util.Map<java.lang.String, java.lang.Integer[]> r6 = r2.f13522     // Catch:{ all -> 0x00cf }
            r6.clear()     // Catch:{ all -> 0x00cf }
            r2.f13521 = r4     // Catch:{ all -> 0x00cf }
        L_0x0064:
            boolean r6 = r2.f13519     // Catch:{ all -> 0x00cf }
            if (r6 == 0) goto L_0x0090
            java.util.Map<java.lang.String, java.lang.Integer[]> r6 = r2.f13522     // Catch:{ all -> 0x00cf }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x00cf }
            java.lang.Integer[] r6 = (java.lang.Integer[]) r6     // Catch:{ all -> 0x00cf }
            if (r6 != 0) goto L_0x0081
            java.util.Map<java.lang.String, java.lang.Integer[]> r6 = r2.f13522     // Catch:{ all -> 0x00cf }
            java.lang.Integer[] r7 = new java.lang.Integer[r3]     // Catch:{ all -> 0x00cf }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00cf }
            r7[r4] = r8     // Catch:{ all -> 0x00cf }
            r6.put(r5, r7)     // Catch:{ all -> 0x00cf }
            r4 = 1
            goto L_0x008e
        L_0x0081:
            r5 = r6[r4]     // Catch:{ all -> 0x00cf }
            int r5 = r5.intValue()     // Catch:{ all -> 0x00cf }
            int r5 = r5 + r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00cf }
            r6[r4] = r5     // Catch:{ all -> 0x00cf }
        L_0x008e:
            if (r4 != 0) goto L_0x0098
        L_0x0090:
            boolean r4 = r2.f13519     // Catch:{ all -> 0x00cf }
            if (r4 != 0) goto L_0x00b3
            int r4 = r2.f13521     // Catch:{ all -> 0x00cf }
            if (r4 != 0) goto L_0x00b3
        L_0x0098:
            android.content.Context r6 = r2.f13517     // Catch:{ all -> 0x00cf }
            android.os.PowerManager$WakeLock r4 = r2.f13520     // Catch:{ all -> 0x00cf }
            java.lang.String r7 = o.C1973.m10710(r4)     // Catch:{ all -> 0x00cf }
            r8 = 7
            java.lang.String r9 = r2.f13516     // Catch:{ all -> 0x00cf }
            r10 = 1
            java.util.List r11 = r2.m15061()     // Catch:{ all -> 0x00cf }
            r4 = r12
            r12 = r14
            o.C1498.m8895(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00cd }
            int r5 = r2.f13521     // Catch:{ all -> 0x00cd }
            int r5 = r5 + r3
            r2.f13521 = r5     // Catch:{ all -> 0x00cd }
            goto L_0x00b4
        L_0x00b3:
            r4 = r12
        L_0x00b4:
            monitor-exit(r4)     // Catch:{ all -> 0x00cd }
            android.os.PowerManager$WakeLock r3 = r2.f13520     // Catch:{ all -> 0x00d5 }
            r3.acquire()     // Catch:{ all -> 0x00d5 }
            r3 = 0
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00d3
            java.util.concurrent.ScheduledExecutorService r3 = o.C2905.f13513     // Catch:{ all -> 0x00d5 }
            o.Ԑı r4 = new o.Ԑı     // Catch:{ all -> 0x00d5 }
            r4.<init>(r2)     // Catch:{ all -> 0x00d5 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00d5 }
            r3.schedule(r4, r14, r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x00d3
        L_0x00cd:
            r0 = move-exception
            goto L_0x00d1
        L_0x00cf:
            r0 = move-exception
            r4 = r12
        L_0x00d1:
            monitor-exit(r4)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00d3:
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            return r0
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2046.m10938(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r14.f13521 == 1) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        o.C1498.m8895(r14.f13517, o.C1973.m10710(r14.f13520), 8, r14.f13516, 1, r14.m15061(), 0);
        r14.f13521--;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10937(android.content.Intent r14) {
        /*
            java.lang.Object r0 = f10101
            monitor-enter(r0)
            o.ӏʄ r1 = f10099     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r2 = 0
            boolean r1 = r14.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r14.putExtra(r1, r2)     // Catch:{ all -> 0x0082 }
            o.ӏʄ r14 = f10099     // Catch:{ all -> 0x0082 }
            java.util.concurrent.atomic.AtomicInteger r1 = r14.f13515     // Catch:{ all -> 0x0082 }
            r1.decrementAndGet()     // Catch:{ all -> 0x0082 }
            boolean r1 = r14.f13519     // Catch:{ all -> 0x0082 }
            r3 = 0
            if (r1 == 0) goto L_0x0024
            android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0082 }
        L_0x0024:
            java.lang.Object r1 = r14.f13514     // Catch:{ all -> 0x0082 }
            monitor-enter(r1)     // Catch:{ all -> 0x0082 }
            boolean r4 = r14.f13519     // Catch:{ all -> 0x007d }
            r5 = 1
            if (r4 == 0) goto L_0x0055
            java.util.Map<java.lang.String, java.lang.Integer[]> r4 = r14.f13522     // Catch:{ all -> 0x007d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x007d }
            java.lang.Integer[] r4 = (java.lang.Integer[]) r4     // Catch:{ all -> 0x007d }
            if (r4 != 0) goto L_0x0037
            goto L_0x0053
        L_0x0037:
            r6 = r4[r2]     // Catch:{ all -> 0x007d }
            int r6 = r6.intValue()     // Catch:{ all -> 0x007d }
            if (r6 != r5) goto L_0x0046
            java.util.Map<java.lang.String, java.lang.Integer[]> r2 = r14.f13522     // Catch:{ all -> 0x007d }
            r2.remove(r3)     // Catch:{ all -> 0x007d }
            r2 = 1
            goto L_0x0053
        L_0x0046:
            r3 = r4[r2]     // Catch:{ all -> 0x007d }
            int r3 = r3.intValue()     // Catch:{ all -> 0x007d }
            int r3 = r3 - r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x007d }
            r4[r2] = r3     // Catch:{ all -> 0x007d }
        L_0x0053:
            if (r2 != 0) goto L_0x005d
        L_0x0055:
            boolean r2 = r14.f13519     // Catch:{ all -> 0x007d }
            if (r2 != 0) goto L_0x0078
            int r2 = r14.f13521     // Catch:{ all -> 0x007d }
            if (r2 != r5) goto L_0x0078
        L_0x005d:
            android.content.Context r6 = r14.f13517     // Catch:{ all -> 0x007d }
            android.os.PowerManager$WakeLock r2 = r14.f13520     // Catch:{ all -> 0x007d }
            java.lang.String r7 = o.C1973.m10710(r2)     // Catch:{ all -> 0x007d }
            java.lang.String r9 = r14.f13516     // Catch:{ all -> 0x007d }
            java.util.List r11 = r14.m15061()     // Catch:{ all -> 0x007d }
            r8 = 8
            r10 = 1
            r12 = 0
            o.C1498.m8895(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x007d }
            int r2 = r14.f13521     // Catch:{ all -> 0x007d }
            int r2 = r2 - r5
            r14.f13521 = r2     // Catch:{ all -> 0x007d }
        L_0x0078:
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            r14.m15060()     // Catch:{ all -> 0x0082 }
            goto L_0x0080
        L_0x007d:
            r14 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0082 }
            throw r14     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x0082 }
            return
        L_0x0082:
            r14 = move-exception
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2046.m10937(android.content.Intent):void");
    }
}
