package o;

import o.C2691;

/* renamed from: o.ƽ  reason: contains not printable characters */
public final class C0818 implements Runnable {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final Runnable f5325;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final C2291 f5326;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C2498 f5327;

    /* renamed from: ι  reason: contains not printable characters */
    private final int f5328;

    /* renamed from: o.ƽ$if  reason: invalid class name */
    public static final class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        public static final int f5331 = 0;

        /* renamed from: Ɩ  reason: contains not printable characters */
        public static final int f5332 = 0;

        /* renamed from: ǃ  reason: contains not printable characters */
        public static final int[] f5333 = {R.attr.f153442130969155};

        /* renamed from: ɩ  reason: contains not printable characters */
        public static final int f5334 = 0;

        /* renamed from: Ι  reason: contains not printable characters */
        public static final int[] f5335 = {16842755};

        /* renamed from: ι  reason: contains not printable characters */
        public static final int[] f5336 = {16842755};

        /* renamed from: І  reason: contains not printable characters */
        public static final int f5337 = 0;

        /* renamed from: Ӏ  reason: contains not printable characters */
        public static final int[] f5338 = {R.attr.f150802130968867};
    }

    /* renamed from: o.ƽ$If */
    public static final class If implements C2691.C2692 {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final C2291 f5329;

        /* renamed from: ι  reason: contains not printable characters */
        private final C2498 f5330;

        public If(C2498 r1, C2291 r2) {
            this.f5330 = r1;
            this.f5329 = r2;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final Object m6237() {
            C2498 r0 = this.f5330;
            return r0.f11308.m13794(this.f5329);
        }
    }

    public C0818(C2498 r1, C2291 r2, int i, Runnable runnable) {
        this.f5327 = r1;
        this.f5326 = r2;
        this.f5328 = i;
        this.f5325 = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6.f11310.m13832(r7, r8 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        r9.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c6, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            o.чı r6 = r13.f5327
            o.Іϲ r7 = r13.f5326
            int r8 = r13.f5328
            java.lang.Runnable r9 = r13.f5325
            r10 = 1
            o.ҕ r0 = r6.f11313     // Catch:{ ґі -> 0x00b9 }
            o.іЈ r1 = r6.f11308     // Catch:{ ґі -> 0x00b9 }
            o.ƾ$If r2 = new o.ƾ$If     // Catch:{ ґі -> 0x00b9 }
            r2.<init>(r1)     // Catch:{ ґі -> 0x00b9 }
            r0.m14295(r2)     // Catch:{ ґі -> 0x00b9 }
            android.content.Context r0 = r6.f11309     // Catch:{ ґі -> 0x00b9 }
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ ґі -> 0x00b9 }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ ґі -> 0x00b9 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ ґі -> 0x00b9 }
            r1 = 0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isConnected()     // Catch:{ ґі -> 0x00b9 }
            if (r0 == 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r0 != 0) goto L_0x003d
            o.ҕ r0 = r6.f11313     // Catch:{ ґі -> 0x00b9 }
            o.ƾ$ɩ r1 = new o.ƾ$ɩ     // Catch:{ ґі -> 0x00b9 }
            r1.<init>(r6, r7, r8)     // Catch:{ ґі -> 0x00b9 }
            r0.m14295(r1)     // Catch:{ ґі -> 0x00b9 }
            goto L_0x00b3
        L_0x003d:
            o.ЈІ r0 = r6.f11311     // Catch:{ ґі -> 0x00b9 }
            java.lang.String r2 = r7.m11959()     // Catch:{ ґі -> 0x00b9 }
            o.К r0 = r0.m12181(r2)     // Catch:{ ґі -> 0x00b9 }
            o.ҕ r2 = r6.f11313     // Catch:{ ґі -> 0x00b9 }
            o.ƽ$If r3 = new o.ƽ$If     // Catch:{ ґі -> 0x00b9 }
            r3.<init>(r6, r7)     // Catch:{ ґі -> 0x00b9 }
            java.lang.Object r2 = r2.m14295(r3)     // Catch:{ ґі -> 0x00b9 }
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ ґі -> 0x00b9 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ ґі -> 0x00b9 }
            boolean r2 = r2.hasNext()     // Catch:{ ґі -> 0x00b9 }
            if (r2 == 0) goto L_0x00b3
            if (r0 != 0) goto L_0x0070
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ ґі -> 0x00b9 }
            r0[r1] = r7     // Catch:{ ґі -> 0x00b9 }
            o.ІЈ r0 = new o.ІЈ     // Catch:{ ґі -> 0x00b9 }
            o.Іґ$If r1 = o.C2314.If.FATAL_ERROR     // Catch:{ ґі -> 0x00b9 }
            r4 = -1
            r0.<init>(r1, r4)     // Catch:{ ґі -> 0x00b9 }
        L_0x006e:
            r2 = r0
            goto L_0x00a5
        L_0x0070:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ ґі -> 0x00b9 }
            r1.<init>()     // Catch:{ ґі -> 0x00b9 }
            java.util.Iterator r2 = r3.iterator()     // Catch:{ ґі -> 0x00b9 }
        L_0x0079:
            boolean r4 = r2.hasNext()     // Catch:{ ґі -> 0x00b9 }
            if (r4 == 0) goto L_0x008b
            java.lang.Object r4 = r2.next()     // Catch:{ ґі -> 0x00b9 }
            o.јӀ r4 = (o.C2630) r4     // Catch:{ ґі -> 0x00b9 }
            o.Ϲ r4 = r4.f11972     // Catch:{ ґі -> 0x00b9 }
            r1.add(r4)     // Catch:{ ґі -> 0x00b9 }
            goto L_0x0079
        L_0x008b:
            o.Іх$If r2 = new o.Іх$If     // Catch:{ ґі -> 0x00b9 }
            r2.<init>()     // Catch:{ ґі -> 0x00b9 }
            o.ЈΙ$ǃ r1 = r2.m12173(r1)     // Catch:{ ґі -> 0x00b9 }
            byte[] r2 = r7.m11960()     // Catch:{ ґі -> 0x00b9 }
            o.ЈΙ$ǃ r1 = r1.m12172(r2)     // Catch:{ ґі -> 0x00b9 }
            o.ЈΙ r1 = r1.m12174()     // Catch:{ ґі -> 0x00b9 }
            o.Іґ r0 = r0.m12316(r1)     // Catch:{ ґі -> 0x00b9 }
            goto L_0x006e
        L_0x00a5:
            o.ҕ r11 = r6.f11313     // Catch:{ ґі -> 0x00b9 }
            o.ƾ r12 = new o.ƾ     // Catch:{ ґі -> 0x00b9 }
            r0 = r12
            r1 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ ґі -> 0x00b9 }
            r11.m14295(r12)     // Catch:{ ґі -> 0x00b9 }
        L_0x00b3:
            r9.run()
            return
        L_0x00b7:
            r0 = move-exception
            goto L_0x00c3
        L_0x00b9:
            o.іґ r0 = r6.f11310     // Catch:{ all -> 0x00b7 }
            int r8 = r8 + r10
            r0.m13832(r7, r8)     // Catch:{ all -> 0x00b7 }
            r9.run()
            return
        L_0x00c3:
            r9.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0818.run():void");
    }
}
