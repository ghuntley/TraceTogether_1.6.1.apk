package com.crashlytics.android.core;

import android.content.Context;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import o.C0708;
import o.C0900;
import o.C0901;
import o.C0961;
import o.C0964;
import o.C0996;
import o.C1006;
import o.C1014;
import o.C1032;
import o.C1065;
import o.C1158;
import o.C1211;
import o.C1343;
import o.C1453;
import o.C2763;
import o.C3263ac;
import o.C3269ai;
import o.C3276ap;
import o.C3281au;
import o.C3285aw;
import o.C3298bi;
import o.C3300bk;
import o.C3301bl;
import o.C3302bm;
import o.C3304bo;
import o.C3308bs;
import o.aA;
import o.aD;
import o.aK;
import o.aL;
import o.aR;
import o.aT;
import o.aW;

@aK(m1501 = {C1032.class})
public class CrashlyticsCore extends C3269ai<Void> {

    /* renamed from: ı  reason: contains not printable characters */
    static final String f474 = "com.crashlytics.RequireBuildId";

    /* renamed from: ŀ  reason: contains not printable characters */
    private static final String f475 = "com.crashlytics.android.core.CrashlyticsCore";

    /* renamed from: Ɩ  reason: contains not printable characters */
    static final int f476 = 1024;

    /* renamed from: ǃ  reason: contains not printable characters */
    static final int f477 = 64;

    /* renamed from: ɩ  reason: contains not printable characters */
    static final boolean f478 = true;

    /* renamed from: ɹ  reason: contains not printable characters */
    static final int f479 = 4;

    /* renamed from: ɿ  reason: contains not printable characters */
    private static final String f480 = "initialization_marker";

    /* renamed from: Ι  reason: contains not printable characters */
    public static final String f481 = "CrashlyticsCore";

    /* renamed from: ι  reason: contains not printable characters */
    static final float f482 = 1.0f;

    /* renamed from: І  reason: contains not printable characters */
    static final String f483 = "crash_marker";

    /* renamed from: ӏ  reason: contains not printable characters */
    private static final String f484 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    /* access modifiers changed from: private */

    /* renamed from: ł  reason: contains not printable characters */
    public C0901 f485;

    /* renamed from: ſ  reason: contains not printable characters */
    private C0961 f486;

    /* renamed from: Ɨ  reason: contains not printable characters */
    private C1006 f487;

    /* renamed from: ƚ  reason: contains not printable characters */
    private C0901 f488;

    /* renamed from: ǀ  reason: contains not printable characters */
    private final C1211 f489;

    /* renamed from: ɍ  reason: contains not printable characters */
    private String f490;

    /* renamed from: ɔ  reason: contains not printable characters */
    private float f491;

    /* renamed from: ɟ  reason: contains not printable characters */
    private String f492;

    /* renamed from: ɺ  reason: contains not printable characters */
    private C3301bl f493;

    /* renamed from: ɼ  reason: contains not printable characters */
    private boolean f494;

    /* renamed from: ʅ  reason: contains not printable characters */
    private String f495;

    /* renamed from: ʟ  reason: contains not printable characters */
    private final long f496;

    /* renamed from: Ј  reason: contains not printable characters */
    private C1032 f497;

    /* renamed from: г  reason: contains not printable characters */
    private final ConcurrentHashMap<String, String> f498;

    /* renamed from: с  reason: contains not printable characters */
    private C0964 f499;

    /* renamed from: ǃ  reason: contains not printable characters */
    public String m694() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public String m707() {
        return "2.7.0.33";
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$ɩ  reason: contains not printable characters */
    public static class C0051 {

        /* renamed from: ı  reason: contains not printable characters */
        private boolean f504 = false;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C1211 f505;

        /* renamed from: Ι  reason: contains not printable characters */
        private float f506 = -1.0f;

        /* renamed from: ι  reason: contains not printable characters */
        private C0961 f507;

        /* renamed from: ι  reason: contains not printable characters */
        public C0051 m731(float f) {
            if (f <= 0.0f) {
                throw new IllegalArgumentException("delay must be greater than 0");
            } else if (this.f506 <= 0.0f) {
                this.f506 = f;
                return this;
            } else {
                throw new IllegalStateException("delay already set.");
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public C0051 m730(C0961 r2) {
            if (r2 == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.f507 == null) {
                this.f507 = r2;
                return this;
            } else {
                throw new IllegalStateException("listener already set.");
            }
        }

        @Deprecated
        /* renamed from: ǃ  reason: contains not printable characters */
        public C0051 m727(C1211 r2) {
            if (r2 == null) {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            } else if (this.f505 == null) {
                this.f505 = r2;
                return this;
            } else {
                throw new IllegalStateException("pinningInfoProvider already set.");
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public C0051 m728(boolean z) {
            this.f504 = z;
            return this;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public CrashlyticsCore m729() {
            if (this.f506 < 0.0f) {
                this.f506 = CrashlyticsCore.f482;
            }
            return new CrashlyticsCore(this.f506, this.f507, this.f505, this.f504);
        }
    }

    public CrashlyticsCore() {
        this(f482, (C0961) null, (C1211) null, false);
    }

    CrashlyticsCore(float f, C0961 r3, C1211 r4, boolean z, ExecutorService executorService) {
        this.f495 = null;
        this.f490 = null;
        this.f492 = null;
        this.f491 = f;
        this.f486 = r3 == null ? new Cif() : r3;
        this.f489 = r4;
        this.f494 = z;
        this.f499 = new C0964(executorService);
        this.f498 = new ConcurrentHashMap<>();
        this.f496 = System.currentTimeMillis();
    }

    public boolean e_() {
        return m690(super.m1589());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public boolean m690(Context context) {
        String r0;
        Context context2 = context;
        if (!C3281au.m1627(context).m1628()) {
            C3263ac.m1563();
            this.f494 = f478;
        }
        if (this.f494 || (r0 = C3276ap.m1615(context)) == null) {
            return false;
        }
        String r1 = C3285aw.m1678(context);
        if (m686(r1, C3285aw.m1692(context2, f474, f478))) {
            try {
                C3263ac.m1563();
                m1597();
                C3304bo boVar = new C3304bo(this);
                this.f488 = new C0901(f483, boVar);
                this.f485 = new C0901(f480, boVar);
                C1343 r5 = C1343.m8428(new C3308bs(m1589(), f475), this);
                C1014 r2 = this.f489 != null ? new C1014(this.f489) : null;
                C3263ac.m1563();
                this.f493 = new C3300bk((byte) 0);
                this.f493.m1820(r2);
                aD r4 = m1595();
                C0708 r7 = C0708.m5820(context2, r4, r0, r1);
                C1006 r15 = r0;
                C1006 r02 = new C1006(this, this.f499, this.f493, r4, r5, boVar, r7, new C1453(context2, new C1158(context2, r7.f4913)), new C1065(this), C2763.m14618(context));
                this.f487 = r15;
                boolean r03 = m706();
                m684();
                this.f487.m7193(Thread.getDefaultUncaughtExceptionHandler(), aA.m1450(context));
                if (!r03 || !C3285aw.m1669(context)) {
                    C3263ac.m1563();
                    return f478;
                }
                C3263ac.m1563();
                m680();
                return false;
            } catch (Exception unused) {
                C3263ac.m1563();
                this.f487 = null;
                return false;
            }
        } else {
            throw new aT(f484);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        o.C3263ac.m1563();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        m705();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006e */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void m693() {
        /*
            r4 = this;
            r4.m720()
            o.ɂı r0 = r4.f487
            r0.m7201()
            r0 = 0
            o.ɂı r1 = r4.f487     // Catch:{ Exception -> 0x006e }
            r1.m7197()     // Catch:{ Exception -> 0x006e }
            o.bH r1 = o.bH.C0122.f1602     // Catch:{ Exception -> 0x006e }
            o.bM r1 = r1.m1709()     // Catch:{ Exception -> 0x006e }
            if (r1 != 0) goto L_0x001f
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x006e }
            r4.m705()
            return r0
        L_0x001f:
            o.ɂı r2 = r4.f487     // Catch:{ Exception -> 0x006e }
            r2.m7187((o.bM) r1)     // Catch:{ Exception -> 0x006e }
            o.bD r2 = r1.f1618     // Catch:{ Exception -> 0x006e }
            boolean r2 = r2.f1585     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x0031
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x006e }
            r4.m705()
            return r0
        L_0x0031:
            android.content.Context r2 = r4.m1589()     // Catch:{ Exception -> 0x006e }
            o.au r2 = o.C3281au.m1627(r2)     // Catch:{ Exception -> 0x006e }
            boolean r2 = r2.m1628()     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x0046
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x006e }
            r4.m705()
            return r0
        L_0x0046:
            o.ɀ r2 = r4.m692()     // Catch:{ Exception -> 0x006e }
            if (r2 == 0) goto L_0x0057
            o.ɂı r3 = r4.f487     // Catch:{ Exception -> 0x006e }
            boolean r2 = r3.m7189((o.C0996) r2)     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x0057
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x006e }
        L_0x0057:
            o.ɂı r2 = r4.f487     // Catch:{ Exception -> 0x006e }
            o.bI r3 = r1.f1616     // Catch:{ Exception -> 0x006e }
            boolean r2 = r2.m7188((o.bI) r3)     // Catch:{ Exception -> 0x006e }
            if (r2 != 0) goto L_0x0064
            o.C3263ac.m1563()     // Catch:{ Exception -> 0x006e }
        L_0x0064:
            o.ɂı r2 = r4.f487     // Catch:{ Exception -> 0x006e }
            float r3 = r4.f491     // Catch:{ Exception -> 0x006e }
            r2.m7205((float) r3, (o.bM) r1)     // Catch:{ Exception -> 0x006e }
            goto L_0x0071
        L_0x006c:
            r0 = move-exception
            goto L_0x0075
        L_0x006e:
            o.C3263ac.m1563()     // Catch:{ all -> 0x006c }
        L_0x0071:
            r4.m705()
            return r0
        L_0x0075:
            r4.m705()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsCore.m693():java.lang.Void");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static CrashlyticsCore m681() {
        return (CrashlyticsCore) C3263ac.m1559(CrashlyticsCore.class);
    }

    /* renamed from: і  reason: contains not printable characters */
    public C1211 m718() {
        if (!this.f494) {
            return this.f489;
        }
        return null;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m697(Throwable th) {
        if (this.f494 || !m683("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            C3263ac.m1563().m1612(5, f481, "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.f487.m7194(Thread.currentThread(), th);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public void m688(String str) {
        m682(3, f481, str);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m682(int i, String str, String str2) {
        if (!this.f494 && m683("prior to logging messages.")) {
            this.f487.m7206(System.currentTimeMillis() - this.f496, m679(i, str, str2));
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m708(int i, String str, String str2) {
        m682(i, str, str2);
        C3263ac.m1563().m1613(i, "".concat(String.valueOf(str)), "".concat(String.valueOf(str2)));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m709(String str) {
        if (!this.f494 && m683("prior to setting user data.")) {
            this.f495 = m687(str);
            this.f487.m7192(this.f495, this.f492, this.f490);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m695(String str) {
        if (!this.f494 && m683("prior to setting user data.")) {
            this.f492 = m687(str);
            this.f487.m7192(this.f495, this.f492, this.f490);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m713(String str) {
        if (!this.f494 && m683("prior to setting user data.")) {
            this.f490 = m687(str);
            this.f487.m7192(this.f495, this.f492, this.f490);
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m696(String str, String str2) {
        String str3;
        if (this.f494 || !m683("prior to setting keys.")) {
            return;
        }
        if (str == null) {
            Context r3 = m1589();
            if (r3 == null || !C3285aw.m1679(r3)) {
                C3263ac.m1563();
                return;
            }
            throw new IllegalArgumentException("Custom attribute key must not be null.");
        }
        String r32 = m687(str);
        if (this.f498.size() < 64 || this.f498.containsKey(r32)) {
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = m687(str2);
            }
            this.f498.put(r32, str3);
            this.f487.m7186((Map<String, String>) this.f498);
            return;
        }
        C3263ac.m1563();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m715(String str, boolean z) {
        m696(str, Boolean.toString(z));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public void m700(String str, double d) {
        m696(str, Double.toString(d));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public void m714(String str, float f) {
        m696(str, Float.toString(f));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m710(String str, int i) {
        m696(str, Integer.toString(i));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public void m711(String str, long j) {
        m696(str, Long.toString(j));
    }

    /* renamed from: І  reason: contains not printable characters */
    public void m717() {
        new C0900().m6672();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m702(URL url) {
        try {
            return m716(url);
        } catch (Exception unused) {
            C3263ac.m1563();
            return false;
        }
    }

    @Deprecated
    /* renamed from: ɩ  reason: contains not printable characters */
    public synchronized void m701(C0961 r2) {
        C3263ac.m1563();
        if (r2 != null) {
            this.f486 = r2;
        } else {
            throw new IllegalArgumentException("listener must not be null.");
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public Map<String, String> m704() {
        return Collections.unmodifiableMap(this.f498);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public C1006 m719() {
        return this.f487;
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    public String m703() {
        if (m1595().f1396) {
            return this.f495;
        }
        return null;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    public String m699() {
        if (m1595().f1396) {
            return this.f490;
        }
        return null;
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    public String m698() {
        if (m1595().f1396) {
            return this.f492;
        }
        return null;
    }

    /* renamed from: ǀ  reason: contains not printable characters */
    private void m680() {
        AnonymousClass1 r0 = new aR<Void>() {
            /* renamed from: ι  reason: contains not printable characters */
            public Void call() {
                return CrashlyticsCore.this.m693();
            }

            /* renamed from: ı  reason: contains not printable characters */
            public aL m721() {
                return aL.IMMEDIATE;
            }
        };
        for (aW r2 : m1596()) {
            r0.m1524(r2);
        }
        Future submit = m1588().f1491.submit(r0);
        C3263ac.m1563();
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            C3263ac.m1563();
        } catch (ExecutionException unused2) {
            C3263ac.m1563();
        } catch (TimeoutException unused3) {
            C3263ac.m1563();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ӏ  reason: contains not printable characters */
    public void m720() {
        this.f499.m6881(new Callable<Void>() {
            /* renamed from: Ι  reason: contains not printable characters */
            public Void call() {
                CrashlyticsCore.this.f485.m6680();
                C3263ac.m1563();
                return null;
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɾ  reason: contains not printable characters */
    public void m705() {
        this.f499.m6880(new Callable<Boolean>() {
            /* renamed from: ǃ  reason: contains not printable characters */
            public Boolean call() {
                try {
                    boolean r0 = CrashlyticsCore.this.f485.m6681();
                    C3263ac.m1563();
                    return Boolean.valueOf(r0);
                } catch (Exception unused) {
                    C3263ac.m1563();
                    return Boolean.FALSE;
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ʟ  reason: contains not printable characters */
    public boolean m706() {
        return this.f485.m6679();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public void m689(C1032 r1) {
        this.f497 = r1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ł  reason: contains not printable characters */
    public C0996 m692() {
        C1032 r0 = this.f497;
        if (r0 != null) {
            return r0.m7278();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι  reason: contains not printable characters */
    public boolean m716(URL url) {
        if (m718() == null) {
            return false;
        }
        C3298bi r4 = this.f493.m1821(C3302bm.GET, url.toString());
        if (r4.f1751 == null) {
            r4.f1751 = r4.m1802();
        }
        ((HttpsURLConnection) r4.f1751).setInstanceFollowRedirects(false);
        r4.m1799();
        return f478;
    }

    /* renamed from: ɼ  reason: contains not printable characters */
    private void m684() {
        if (Boolean.TRUE.equals((Boolean) this.f499.m6881(new C0050(this.f488)))) {
            try {
                this.f486.m6876();
            } catch (Exception unused) {
                C3263ac.m1563();
            }
        }
    }

    /* renamed from: ŀ  reason: contains not printable characters */
    public void m691() {
        this.f488.m6680();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m679(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C3285aw.m1682(i));
        sb.append("/");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private static boolean m683(String str) {
        CrashlyticsCore r0 = m681();
        if (r0 != null && r0.f487 != null) {
            return f478;
        }
        C3263ac.m1563();
        return false;
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private static String m687(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > f476 ? trim.substring(0, f476) : trim;
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$ǃ  reason: contains not printable characters */
    static final class C0050 implements Callable<Boolean> {

        /* renamed from: ı  reason: contains not printable characters */
        private final C0901 f503;

        public C0050(C0901 r1) {
            this.f503 = r1;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final Boolean call() {
            if (!this.f503.m6679()) {
                return Boolean.FALSE;
            }
            C3263ac.m1563();
            this.f503.m6681();
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.crashlytics.android.core.CrashlyticsCore$if  reason: invalid class name */
    static final class Cif implements C0961 {
        /* renamed from: ı  reason: contains not printable characters */
        public final void m725() {
        }

        private Cif() {
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    static boolean m686(String str, boolean z) {
        if (!z) {
            C3263ac.m1563();
            return f478;
        } else if (!C3285aw.m1668(str)) {
            return f478;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    CrashlyticsCore(float r10, o.C0961 r11, o.C1211 r12, boolean r13) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 1
            r0.<init>(r1)
            o.aB$2 r1 = new o.aB$2
            java.lang.String r2 = "Crashlytics Exception Handler"
            r1.<init>(r2, r0)
            java.util.concurrent.ExecutorService r8 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            o.aB.m1451(r2, r8, r0)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CrashlyticsCore.<init>(float, o.ȷȷ, o.ɨɨ, boolean):void");
    }
}
