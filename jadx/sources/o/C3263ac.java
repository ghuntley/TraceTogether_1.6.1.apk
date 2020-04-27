package o;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import io.fabric.sdk.android.Onboarding;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.ac  reason: case insensitive filesystem */
public class C3263ac {

    /* renamed from: ı  reason: contains not printable characters */
    private static C3275ao f1484 = new C3264ad();

    /* renamed from: ι  reason: contains not printable characters */
    private static volatile C3263ac f1485;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final Map<Class<? extends C3269ai>, C3269ai> f1486;

    /* renamed from: ǃ  reason: contains not printable characters */
    public WeakReference<Activity> f1487;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Context f1488;
    /* access modifiers changed from: private */

    /* renamed from: ɪ  reason: contains not printable characters */
    public AtomicBoolean f1489 = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public final C3267ag<C3263ac> f1490;

    /* renamed from: Ι  reason: contains not printable characters */
    public final ExecutorService f1491;

    /* renamed from: І  reason: contains not printable characters */
    private C3262ab f1492;

    /* renamed from: і  reason: contains not printable characters */
    private final aD f1493;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final C3267ag<?> f1494;

    /* renamed from: ӏ  reason: contains not printable characters */
    private C3275ao f1495;

    /* renamed from: o.ac$ı  reason: contains not printable characters */
    public static class C0118 {

        /* renamed from: ı  reason: contains not printable characters */
        Handler f1500;

        /* renamed from: ǃ  reason: contains not printable characters */
        C3275ao f1501;

        /* renamed from: ɩ  reason: contains not printable characters */
        C3269ai[] f1502;

        /* renamed from: Ι  reason: contains not printable characters */
        final Context f1503;

        /* renamed from: ι  reason: contains not printable characters */
        aP f1504;

        /* renamed from: І  reason: contains not printable characters */
        C3267ag<C3263ac> f1505;

        /* renamed from: Ӏ  reason: contains not printable characters */
        String f1506;

        public C0118(Context context) {
            if (context != null) {
                this.f1503 = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    private C3263ac(Context context, Map<Class<? extends C3269ai>, C3269ai> map, aP aPVar, C3275ao aoVar, C3267ag agVar, aD aDVar, Activity activity) {
        this.f1488 = context;
        this.f1486 = map;
        this.f1491 = aPVar;
        this.f1495 = aoVar;
        this.f1490 = agVar;
        final int size = map.size();
        this.f1494 = new C3267ag() {

            /* renamed from: ι  reason: contains not printable characters */
            private CountDownLatch f1498 = new CountDownLatch(size);

            /* renamed from: ɩ  reason: contains not printable characters */
            public final void m1567() {
                this.f1498.countDown();
                if (this.f1498.getCount() == 0) {
                    C3263ac.this.f1489.set(true);
                    C3263ac.this.f1490.m1578();
                }
            }

            /* renamed from: ǃ  reason: contains not printable characters */
            public final void m1566(Exception exc) {
                C3263ac.this.f1490.m1577(exc);
            }
        };
        this.f1493 = aDVar;
        this.f1487 = new WeakReference<>(activity);
    }

    /* JADX WARNING: type inference failed for: r11v27, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.C3263ac m1562(android.content.Context r11, o.C3269ai... r12) {
        /*
            o.ac r0 = f1485
            if (r0 != 0) goto L_0x0116
            java.lang.Class<o.ac> r0 = o.C3263ac.class
            monitor-enter(r0)
            o.ac r1 = f1485     // Catch:{ all -> 0x0113 }
            if (r1 != 0) goto L_0x0111
            o.ac$ı r1 = new o.ac$ı     // Catch:{ all -> 0x0113 }
            r1.<init>(r11)     // Catch:{ all -> 0x0113 }
            o.ai[] r11 = r1.f1502     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x0109
            android.content.Context r11 = r1.f1503     // Catch:{ all -> 0x0113 }
            o.au r11 = o.C3281au.m1627(r11)     // Catch:{ all -> 0x0113 }
            boolean r11 = r11.m1628()     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x0068
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0113 }
            r11.<init>()     // Catch:{ all -> 0x0113 }
            int r2 = r12.length     // Catch:{ all -> 0x0113 }
            r3 = 0
            r4 = 0
        L_0x0028:
            if (r4 >= r2) goto L_0x005f
            r5 = r12[r4]     // Catch:{ all -> 0x0113 }
            java.lang.String r6 = r5.m1591()     // Catch:{ all -> 0x0113 }
            r7 = -1
            int r8 = r6.hashCode()     // Catch:{ all -> 0x0113 }
            r9 = 607220212(0x243171f4, float:3.847728E-17)
            r10 = 1
            if (r8 == r9) goto L_0x004b
            r9 = 1830452504(0x6d1a7d18, float:2.988245E27)
            if (r8 == r9) goto L_0x0041
            goto L_0x0054
        L_0x0041:
            java.lang.String r8 = "com.crashlytics.sdk.android:crashlytics"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0113 }
            if (r6 == 0) goto L_0x0054
            r7 = 0
            goto L_0x0054
        L_0x004b:
            java.lang.String r8 = "com.crashlytics.sdk.android:answers"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0113 }
            if (r6 == 0) goto L_0x0054
            r7 = 1
        L_0x0054:
            if (r7 == 0) goto L_0x0059
            if (r7 == r10) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            r11.add(r5)     // Catch:{ all -> 0x0113 }
        L_0x005c:
            int r4 = r4 + 1
            goto L_0x0028
        L_0x005f:
            o.ai[] r12 = new o.C3269ai[r3]     // Catch:{ all -> 0x0113 }
            java.lang.Object[] r11 = r11.toArray(r12)     // Catch:{ all -> 0x0113 }
            r12 = r11
            o.ai[] r12 = (o.C3269ai[]) r12     // Catch:{ all -> 0x0113 }
        L_0x0068:
            r1.f1502 = r12     // Catch:{ all -> 0x0113 }
            o.aP r11 = r1.f1504     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x0074
            o.aP r11 = o.aP.m1521()     // Catch:{ all -> 0x0113 }
            r1.f1504 = r11     // Catch:{ all -> 0x0113 }
        L_0x0074:
            android.os.Handler r11 = r1.f1500     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x0083
            android.os.Handler r11 = new android.os.Handler     // Catch:{ all -> 0x0113 }
            android.os.Looper r12 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0113 }
            r11.<init>(r12)     // Catch:{ all -> 0x0113 }
            r1.f1500 = r11     // Catch:{ all -> 0x0113 }
        L_0x0083:
            o.ao r11 = r1.f1501     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x008e
            o.ad r11 = new o.ad     // Catch:{ all -> 0x0113 }
            r11.<init>()     // Catch:{ all -> 0x0113 }
            r1.f1501 = r11     // Catch:{ all -> 0x0113 }
        L_0x008e:
            java.lang.String r11 = r1.f1506     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x009a
            android.content.Context r11 = r1.f1503     // Catch:{ all -> 0x0113 }
            java.lang.String r11 = r11.getPackageName()     // Catch:{ all -> 0x0113 }
            r1.f1506 = r11     // Catch:{ all -> 0x0113 }
        L_0x009a:
            o.ag<o.ac> r11 = r1.f1505     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x00a2
            o.ag r11 = o.C3267ag.f1509     // Catch:{ all -> 0x0113 }
            r1.f1505 = r11     // Catch:{ all -> 0x0113 }
        L_0x00a2:
            o.ai[] r11 = r1.f1502     // Catch:{ all -> 0x0113 }
            if (r11 != 0) goto L_0x00ad
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x0113 }
            r11.<init>()     // Catch:{ all -> 0x0113 }
            r5 = r11
            goto L_0x00c0
        L_0x00ad:
            o.ai[] r11 = r1.f1502     // Catch:{ all -> 0x0113 }
            java.util.List r11 = java.util.Arrays.asList(r11)     // Catch:{ all -> 0x0113 }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x0113 }
            int r2 = r11.size()     // Catch:{ all -> 0x0113 }
            r12.<init>(r2)     // Catch:{ all -> 0x0113 }
            m1565((java.util.Map<java.lang.Class<? extends o.C3269ai>, o.C3269ai>) r12, (java.util.Collection<? extends o.C3269ai>) r11)     // Catch:{ all -> 0x0113 }
            r5 = r12
        L_0x00c0:
            android.content.Context r11 = r1.f1503     // Catch:{ all -> 0x0113 }
            android.content.Context r4 = r11.getApplicationContext()     // Catch:{ all -> 0x0113 }
            o.aD r9 = new o.aD     // Catch:{ all -> 0x0113 }
            java.lang.String r11 = r1.f1506     // Catch:{ all -> 0x0113 }
            java.util.Collection r12 = r5.values()     // Catch:{ all -> 0x0113 }
            r9.<init>(r4, r11, r12)     // Catch:{ all -> 0x0113 }
            o.ac r11 = new o.ac     // Catch:{ all -> 0x0113 }
            o.aP r6 = r1.f1504     // Catch:{ all -> 0x0113 }
            o.ao r7 = r1.f1501     // Catch:{ all -> 0x0113 }
            o.ag<o.ac> r8 = r1.f1505     // Catch:{ all -> 0x0113 }
            android.content.Context r12 = r1.f1503     // Catch:{ all -> 0x0113 }
            boolean r1 = r12 instanceof android.app.Activity     // Catch:{ all -> 0x0113 }
            if (r1 == 0) goto L_0x00e2
            android.app.Activity r12 = (android.app.Activity) r12     // Catch:{ all -> 0x0113 }
            goto L_0x00e3
        L_0x00e2:
            r12 = 0
        L_0x00e3:
            r10 = r12
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0113 }
            f1485 = r11     // Catch:{ all -> 0x0113 }
            o.ab r12 = new o.ab     // Catch:{ all -> 0x0113 }
            android.content.Context r1 = r11.f1488     // Catch:{ all -> 0x0113 }
            r12.<init>(r1)     // Catch:{ all -> 0x0113 }
            r11.f1492 = r12     // Catch:{ all -> 0x0113 }
            o.ab r12 = r11.f1492     // Catch:{ all -> 0x0113 }
            o.ac$3 r1 = new o.ac$3     // Catch:{ all -> 0x0113 }
            r1.<init>()     // Catch:{ all -> 0x0113 }
            o.ab$if r2 = r12.f1480     // Catch:{ all -> 0x0113 }
            if (r2 == 0) goto L_0x0103
            o.ab$if r12 = r12.f1480     // Catch:{ all -> 0x0113 }
            r12.m1549(r1)     // Catch:{ all -> 0x0113 }
        L_0x0103:
            android.content.Context r12 = r11.f1488     // Catch:{ all -> 0x0113 }
            r11.m1564(r12)     // Catch:{ all -> 0x0113 }
            goto L_0x0111
        L_0x0109:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0113 }
            java.lang.String r12 = "Kits already set."
            r11.<init>(r12)     // Catch:{ all -> 0x0113 }
            throw r11     // Catch:{ all -> 0x0113 }
        L_0x0111:
            monitor-exit(r0)     // Catch:{ all -> 0x0113 }
            goto L_0x0116
        L_0x0113:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        L_0x0116:
            o.ac r11 = f1485
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3263ac.m1562(android.content.Context, o.ai[]):o.ac");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m1560(Map<Class<? extends C3269ai>, C3269ai> map, C3269ai aiVar) {
        aK aKVar = aiVar.f1511;
        if (aKVar != null) {
            for (Class cls : aKVar.m1501()) {
                if (cls.isInterface()) {
                    for (C3269ai next : map.values()) {
                        if (cls.isAssignableFrom(next.getClass())) {
                            aiVar.f1516.m1511(next.f1516);
                        }
                    }
                } else if (map.get(cls) != null) {
                    aiVar.f1516.m1511(map.get(cls).f1516);
                } else {
                    throw new aT("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static C3275ao m1563() {
        if (f1485 == null) {
            return f1484;
        }
        return f1485.f1495;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static boolean m1558() {
        if (f1485 == null) {
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private static void m1565(Map<Class<? extends C3269ai>, C3269ai> map, Collection<? extends C3269ai> collection) {
        for (C3269ai aiVar : collection) {
            map.put(aiVar.getClass(), aiVar);
            if (aiVar instanceof C3270aj) {
                m1565(map, ((C3270aj) aiVar).m1601());
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m1564(Context context) {
        C3275ao aoVar;
        Future submit = this.f1491.submit(new C3265ae(context.getPackageCodePath()));
        Collection<C3269ai> values = this.f1486.values();
        Onboarding onboarding = new Onboarding(submit, values);
        ArrayList<C3269ai> arrayList = new ArrayList<>(values);
        Collections.sort(arrayList);
        onboarding.m1592(context, this, C3267ag.f1509, this.f1493);
        for (C3269ai r3 : arrayList) {
            r3.m1592(context, this, this.f1494, this.f1493);
        }
        onboarding.m1600();
        if (f1485 == null) {
            aoVar = f1484;
        } else {
            aoVar = f1485.f1495;
        }
        StringBuilder sb = aoVar.m1614("Fabric") ? new StringBuilder("Initializing io.fabric.sdk.android:fabric [Version: 1.4.8.32], with the following kits:\n") : null;
        for (C3269ai aiVar : arrayList) {
            aiVar.f1516.m1511(onboarding.f1516);
            m1560(this.f1486, aiVar);
            aiVar.m1600();
            if (sb != null) {
                sb.append(aiVar.m1591());
                sb.append(" [Version: ");
                sb.append(aiVar.m1597());
                sb.append("]\n");
            }
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static <T extends C3269ai> T m1559(Class<T> cls) {
        if (f1485 != null) {
            return (C3269ai) f1485.f1486.get(cls);
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }
}
