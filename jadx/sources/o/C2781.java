package o;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Ӏɉ  reason: contains not printable characters */
public abstract class C2781<T> {

    /* renamed from: ı  reason: contains not printable characters */
    private static boolean f13163 = false;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final AtomicInteger f13164 = new AtomicInteger();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Context f13165 = null;

    /* renamed from: ɩ  reason: contains not printable characters */
    private static C0388<C0357<C2621>> f13166;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final Object f13167 = new Object();

    /* renamed from: ɹ  reason: contains not printable characters */
    private final T f13168;

    /* renamed from: ι  reason: contains not printable characters */
    private final C2941 f13169;

    /* renamed from: І  reason: contains not printable characters */
    private final String f13170;

    /* renamed from: і  reason: contains not printable characters */
    private volatile int f13171;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private volatile T f13172;

    /* renamed from: ı  reason: contains not printable characters */
    public static void m14676(Context context) {
        synchronized (f13167) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f13165 != context) {
                C2525.m13414();
                C3004.m15391();
                C2634.m13954();
                f13164.incrementAndGet();
                f13165 = context;
                f13166 = C0447.m4746(C2894.f13464);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract T m14684(Object obj);

    /* renamed from: ı  reason: contains not printable characters */
    static void m14675() {
        f13164.incrementAndGet();
    }

    private C2781(C2941 r2, String str, T t) {
        this.f13171 = -1;
        if (r2.f13665 != null) {
            this.f13169 = r2;
            this.f13170 = str;
            this.f13168 = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private final String m14682(String str) {
        if (str != null && str.isEmpty()) {
            return this.f13170;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f13170);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final String m14686() {
        return m14682(this.f13169.f13662);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T m14685() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f13164
            int r0 = r0.get()
            int r1 = r6.f13171
            if (r1 >= r0) goto L_0x00f8
            monitor-enter(r6)
            int r1 = r6.f13171     // Catch:{ all -> 0x00f5 }
            if (r1 >= r0) goto L_0x00f3
            android.content.Context r1 = f13165     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00eb
            android.content.Context r1 = f13165     // Catch:{ all -> 0x00f5 }
            o.ћ r1 = o.C2634.m13955(r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.m13958(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0031
            java.util.regex.Pattern r2 = o.C2524.f11456     // Catch:{ all -> 0x00f5 }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x00f5 }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r2 = 0
            if (r1 != 0) goto L_0x006f
            o.ӿ r1 = r6.f13169     // Catch:{ all -> 0x00f5 }
            android.net.Uri r1 = r1.f13665     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0058
            android.content.Context r1 = f13165     // Catch:{ all -> 0x00f5 }
            o.ӿ r3 = r6.f13169     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f13665     // Catch:{ all -> 0x00f5 }
            boolean r1 = o.C2812.m14728(r1, r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0056
            android.content.Context r1 = f13165     // Catch:{ all -> 0x00f5 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x00f5 }
            o.ӿ r3 = r6.f13169     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f13665     // Catch:{ all -> 0x00f5 }
            o.эǃ r1 = o.C2525.m13413(r1, r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x005e
        L_0x0056:
            r1 = r2
            goto L_0x005e
        L_0x0058:
            android.content.Context r1 = f13165     // Catch:{ all -> 0x00f5 }
            o.ԧɩ r1 = o.C3004.m15392(r1, r2)     // Catch:{ all -> 0x00f5 }
        L_0x005e:
            if (r1 == 0) goto L_0x0098
            java.lang.String r3 = r6.m14686()     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.m13554(r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r6.m14684((java.lang.Object) r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x0099
        L_0x006f:
            java.lang.String r1 = "PhenotypeFlag"
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = "PhenotypeFlag"
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            java.lang.String r4 = r6.m14686()     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00f5 }
            int r5 = r4.length()     // Catch:{ all -> 0x00f5 }
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x0095
        L_0x008f:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x00f5 }
            r4.<init>(r3)     // Catch:{ all -> 0x00f5 }
            r3 = r4
        L_0x0095:
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x00f5 }
        L_0x0098:
            r1 = r2
        L_0x0099:
            if (r1 == 0) goto L_0x009c
            goto L_0x00bb
        L_0x009c:
            android.content.Context r1 = f13165     // Catch:{ all -> 0x00f5 }
            o.ћ r1 = o.C2634.m13955(r1)     // Catch:{ all -> 0x00f5 }
            o.ӿ r3 = r6.f13169     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r3.f13659     // Catch:{ all -> 0x00f5 }
            java.lang.String r3 = r6.m14682(r3)     // Catch:{ all -> 0x00f5 }
            java.lang.Object r1 = r1.m13554(r3)     // Catch:{ all -> 0x00f5 }
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r6.m14684((java.lang.Object) r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x00b6
        L_0x00b5:
            r1 = r2
        L_0x00b6:
            if (r1 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            T r1 = r6.f13168     // Catch:{ all -> 0x00f5 }
        L_0x00bb:
            o.ıε<o.ıʄ<o.јȷ>> r3 = f13166     // Catch:{ all -> 0x00f5 }
            java.lang.Object r3 = r3.m4649()     // Catch:{ all -> 0x00f5 }
            o.ıʄ r3 = (o.C0357) r3     // Catch:{ all -> 0x00f5 }
            boolean r4 = r3.m4524()     // Catch:{ all -> 0x00f5 }
            if (r4 == 0) goto L_0x00e6
            java.lang.Object r1 = r3.m4523()     // Catch:{ all -> 0x00f5 }
            o.јȷ r1 = (o.C2621) r1     // Catch:{ all -> 0x00f5 }
            o.ӿ r3 = r6.f13169     // Catch:{ all -> 0x00f5 }
            android.net.Uri r3 = r3.f13665     // Catch:{ all -> 0x00f5 }
            o.ӿ r4 = r6.f13169     // Catch:{ all -> 0x00f5 }
            java.lang.String r4 = r4.f13662     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = r6.f13170     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = r1.m13930(r3, r2, r4, r5)     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x00e2
            T r1 = r6.f13168     // Catch:{ all -> 0x00f5 }
            goto L_0x00e6
        L_0x00e2:
            java.lang.Object r1 = r6.m14684((java.lang.Object) r1)     // Catch:{ all -> 0x00f5 }
        L_0x00e6:
            r6.f13172 = r1     // Catch:{ all -> 0x00f5 }
            r6.f13171 = r0     // Catch:{ all -> 0x00f5 }
            goto L_0x00f3
        L_0x00eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f3:
            monitor-exit(r6)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f8
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f5 }
            throw r0
        L_0x00f8:
            T r0 = r6.f13172
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2781.m14685():java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2781<Long> m14678(C2941 r1, String str, long j) {
        return new C2799(r1, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public static C2781<Boolean> m14680(C2941 r1, String str, boolean z) {
        return new C2838(r1, str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public static C2781<Double> m14672(C2941 r1, String str, double d) {
        return new C2815(r1, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public static C2781<String> m14683(C2941 r1, String str, String str2) {
        return new C2943(r1, str, str2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static final /* synthetic */ C0357 m14677() {
        new C2811();
        return C2811.m14727(f13165);
    }

    /* synthetic */ C2781(C2941 r1, String str, Object obj, C2799 r4) {
        this(r1, str, obj);
    }
}
