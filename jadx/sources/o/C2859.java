package o;

import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.C0425;
import o.C0944;
import o.C3347cz;

/* renamed from: o.ӄ  reason: contains not printable characters */
public final class C2859 implements C3035 {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final ThreadFactory f13310 = new ThreadFactory() {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final AtomicInteger f13321 = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f13321.getAndIncrement())}));
        }
    };

    /* renamed from: І  reason: contains not printable characters */
    private static final Object f13311 = new Object();

    /* renamed from: ı  reason: contains not printable characters */
    private final C3100 f13312;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final ExecutorService f13313;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final FirebaseApp f13314;

    /* renamed from: Ι  reason: contains not printable characters */
    private final C0387 f13315;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3344cw f13316;

    /* renamed from: і  reason: contains not printable characters */
    private final Object f13317;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final List<C3108> f13318;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2859(com.google.firebase.FirebaseApp r10, o.C1971 r11, o.C1298 r12) {
        /*
            r9 = this;
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            java.util.concurrent.ThreadFactory r7 = f13310
            r1 = 0
            r2 = 1
            r3 = 30
            r0 = r8
            r0.<init>(r1, r2, r3, r5, r6, r7)
            o.ıα r3 = new o.ıα
            android.content.Context r0 = r10.m1074()
            r3.<init>(r0, r11, r12)
            o.լȷ r4 = new o.լȷ
            r4.<init>(r10)
            o.Տ r5 = new o.Տ
            r5.<init>()
            o.cw r6 = new o.cw
            r6.<init>(r10)
            o.Օ r11 = new o.Օ
            r11.<init>()
            r0 = r9
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2859.<init>(com.google.firebase.FirebaseApp, o.ιȣ, o.ɩв):void");
    }

    private C2859(ExecutorService executorService, FirebaseApp firebaseApp, C0387 r3, C3100 r4, C3050 r5, C3344cw cwVar) {
        this.f13317 = new Object();
        this.f13318 = new ArrayList();
        this.f13314 = firebaseApp;
        this.f13315 = r3;
        this.f13313 = executorService;
        this.f13312 = r4;
        this.f13316 = cwVar;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private String m14846() {
        if (TextUtils.isEmpty(this.f13314.m1075().f8949)) {
            return this.f13314.m1075().f8950;
        }
        return this.f13314.m1075().f8949;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0329<String> m14854() {
        m14845();
        C0329<String> r0 = m14852();
        this.f13313.execute(new aB(this));
        return r0;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0329<C2942> m14855() {
        m14845();
        C0329<C2942> r0 = m14849();
        this.f13313.execute(new C3320ca(this));
        return r0;
    }

    /* renamed from: і  reason: contains not printable characters */
    private C0329<String> m14852() {
        C3203 r0 = new C3203();
        C3347cz.C0151 r1 = new C3347cz.C0151(r0);
        synchronized (this.f13317) {
            this.f13318.add(r1);
        }
        return r0.f14555;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    private C0329<C2942> m14849() {
        C3203 r0 = new C3203();
        C3033 r1 = new C3033(r0);
        synchronized (this.f13317) {
            this.f13318.add(r1);
        }
        return r0.f14555;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m14847(C0399 r4) {
        synchronized (this.f13317) {
            Iterator<C3108> it = this.f13318.iterator();
            while (it.hasNext()) {
                if (it.next().m15766(r4)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m14851(C0399 r4, Exception exc) {
        synchronized (this.f13317) {
            Iterator<C3108> it = this.f13318.iterator();
            while (it.hasNext()) {
                if (it.next().m15767(r4, exc)) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016f  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m14844(boolean r14) {
        /*
            r13 = this;
            o.ıϫ r0 = r13.m14853()
            r1 = 0
            if (r14 == 0) goto L_0x0013
            o.ıϫ$If r0 = r0.m4672()
            o.ıϫ$If r0 = r0.m4678(r1)
            o.ıϫ r0 = r0.m4681()
        L_0x0013:
            r13.m14847((o.C0399) r0)
            o.լȷ$If r2 = r0.m4667()     // Catch:{ IOException -> 0x0191 }
            o.լȷ$If r3 = o.C3100.If.REGISTER_ERROR     // Catch:{ IOException -> 0x0191 }
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            java.lang.String r3 = "BAD CONFIG"
            r6 = 2
            if (r2 != 0) goto L_0x00ba
            o.լȷ$If r2 = r0.m4667()     // Catch:{ IOException -> 0x0191 }
            o.լȷ$If r7 = o.C3100.If.UNREGISTERED     // Catch:{ IOException -> 0x0191 }
            if (r2 != r7) goto L_0x0032
            r2 = 1
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            if (r2 == 0) goto L_0x0037
            goto L_0x00ba
        L_0x0037:
            if (r14 != 0) goto L_0x0041
            boolean r14 = o.C3050.m15562(r0)     // Catch:{ IOException -> 0x0191 }
            if (r14 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            return
        L_0x0041:
            o.ıα r14 = r13.f13315     // Catch:{ IOException -> 0x0191 }
            com.google.firebase.FirebaseApp r1 = r13.f13314     // Catch:{ IOException -> 0x0191 }
            o.ͳ r1 = r1.m1075()     // Catch:{ IOException -> 0x0191 }
            java.lang.String r1 = r1.f8953     // Catch:{ IOException -> 0x0191 }
            java.lang.String r2 = r0.m4666()     // Catch:{ IOException -> 0x0191 }
            java.lang.String r7 = r13.m14846()     // Catch:{ IOException -> 0x0191 }
            java.lang.String r8 = r0.m4671()     // Catch:{ IOException -> 0x0191 }
            o.Ȣ r14 = r14.m4648(r1, r2, r7, r8)     // Catch:{ IOException -> 0x0191 }
            int[] r1 = o.C2859.AnonymousClass1.f13319     // Catch:{ IOException -> 0x0191 }
            o.Ȣ$if r2 = r14.m6834()     // Catch:{ IOException -> 0x0191 }
            int r2 = r2.ordinal()     // Catch:{ IOException -> 0x0191 }
            r1 = r1[r2]     // Catch:{ IOException -> 0x0191 }
            if (r1 == r5) goto L_0x0098
            if (r1 == r6) goto L_0x0084
            r14 = 3
            if (r1 != r14) goto L_0x007e
            o.ıϫ$If r14 = r0.m4672()     // Catch:{ IOException -> 0x0191 }
            o.լȷ$If r1 = o.C3100.If.NOT_GENERATED     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4676((o.C3100.If) r1)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ r14 = r14.m4681()     // Catch:{ IOException -> 0x0191 }
            goto L_0x0152
        L_0x007e:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ IOException -> 0x0191 }
            r14.<init>()     // Catch:{ IOException -> 0x0191 }
            throw r14     // Catch:{ IOException -> 0x0191 }
        L_0x0084:
            o.ıϫ$If r14 = r0.m4672()     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4677(r3)     // Catch:{ IOException -> 0x0191 }
            o.լȷ$If r1 = o.C3100.If.REGISTER_ERROR     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4676((o.C3100.If) r1)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ r14 = r14.m4681()     // Catch:{ IOException -> 0x0191 }
            goto L_0x0152
        L_0x0098:
            java.lang.String r1 = r14.m6835()     // Catch:{ IOException -> 0x0191 }
            long r2 = r14.m6833()     // Catch:{ IOException -> 0x0191 }
            long r6 = o.C3050.m15563()     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r0.m4672()     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4678(r1)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4674((long) r2)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4679(r6)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ r14 = r14.m4681()     // Catch:{ IOException -> 0x0191 }
            goto L_0x0152
        L_0x00ba:
            java.lang.String r14 = r0.m4666()     // Catch:{ IOException -> 0x0191 }
            int r14 = r14.length()     // Catch:{ IOException -> 0x0191 }
            r2 = 11
            if (r14 != r2) goto L_0x00cc
            o.cw r14 = r13.f13316     // Catch:{ IOException -> 0x0191 }
            java.lang.String r1 = r14.m2034()     // Catch:{ IOException -> 0x0191 }
        L_0x00cc:
            r12 = r1
            o.ıα r7 = r13.f13315     // Catch:{ IOException -> 0x0191 }
            com.google.firebase.FirebaseApp r14 = r13.f13314     // Catch:{ IOException -> 0x0191 }
            o.ͳ r14 = r14.m1075()     // Catch:{ IOException -> 0x0191 }
            java.lang.String r8 = r14.f8953     // Catch:{ IOException -> 0x0191 }
            java.lang.String r9 = r0.m4666()     // Catch:{ IOException -> 0x0191 }
            java.lang.String r10 = r13.m14846()     // Catch:{ IOException -> 0x0191 }
            com.google.firebase.FirebaseApp r14 = r13.f13314     // Catch:{ IOException -> 0x0191 }
            o.ͳ r14 = r14.m1075()     // Catch:{ IOException -> 0x0191 }
            java.lang.String r11 = r14.f8951     // Catch:{ IOException -> 0x0191 }
            o.ıы r14 = r7.m4647(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0191 }
            int[] r1 = o.C2859.AnonymousClass1.f13320     // Catch:{ IOException -> 0x0191 }
            o.ıы$ı r2 = r14.m4716()     // Catch:{ IOException -> 0x0191 }
            int r2 = r2.ordinal()     // Catch:{ IOException -> 0x0191 }
            r1 = r1[r2]     // Catch:{ IOException -> 0x0191 }
            if (r1 == r5) goto L_0x0114
            if (r1 != r6) goto L_0x010e
            o.ıϫ$If r14 = r0.m4672()     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4677(r3)     // Catch:{ IOException -> 0x0191 }
            o.լȷ$If r1 = o.C3100.If.REGISTER_ERROR     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4676((o.C3100.If) r1)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ r14 = r14.m4681()     // Catch:{ IOException -> 0x0191 }
            goto L_0x0152
        L_0x010e:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ IOException -> 0x0191 }
            r14.<init>()     // Catch:{ IOException -> 0x0191 }
            throw r14     // Catch:{ IOException -> 0x0191 }
        L_0x0114:
            java.lang.String r1 = r14.m4719()     // Catch:{ IOException -> 0x0191 }
            java.lang.String r2 = r14.m4715()     // Catch:{ IOException -> 0x0191 }
            long r6 = o.C3050.m15563()     // Catch:{ IOException -> 0x0191 }
            o.Ȣ r3 = r14.m4718()     // Catch:{ IOException -> 0x0191 }
            java.lang.String r3 = r3.m6835()     // Catch:{ IOException -> 0x0191 }
            o.Ȣ r14 = r14.m4718()     // Catch:{ IOException -> 0x0191 }
            long r8 = r14.m6833()     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r0.m4672()     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4675((java.lang.String) r1)     // Catch:{ IOException -> 0x0191 }
            o.լȷ$If r1 = o.C3100.If.REGISTERED     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4676((o.C3100.If) r1)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4678(r3)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4680(r2)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4674((long) r8)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ$If r14 = r14.m4679(r6)     // Catch:{ IOException -> 0x0191 }
            o.ıϫ r14 = r14.m4681()     // Catch:{ IOException -> 0x0191 }
        L_0x0152:
            o.լȷ r0 = r13.f13312
            r0.m15738(r14)
            o.լȷ$If r0 = r14.m4667()
            o.լȷ$If r1 = o.C3100.If.REGISTER_ERROR
            if (r0 != r1) goto L_0x0161
            r0 = 1
            goto L_0x0162
        L_0x0161:
            r0 = 0
        L_0x0162:
            if (r0 == 0) goto L_0x016f
            o.ԼІ r0 = new o.ԼІ
            o.ԼІ$if r1 = o.C3034.Cif.f13931
            r0.<init>()
            r13.m14851(r14, r0)
            return
        L_0x016f:
            o.լȷ$If r0 = r14.m4667()
            o.լȷ$If r1 = o.C3100.If.NOT_GENERATED
            if (r0 == r1) goto L_0x017f
            o.լȷ$If r0 = r14.m4667()
            o.լȷ$If r1 = o.C3100.If.ATTEMPT_MIGRATION
            if (r0 != r1) goto L_0x0180
        L_0x017f:
            r4 = 1
        L_0x0180:
            if (r4 == 0) goto L_0x018d
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cleared fid due to auth error"
            r0.<init>(r1)
            r13.m14851(r14, r0)
            return
        L_0x018d:
            r13.m14847((o.C0399) r14)
            return
        L_0x0191:
            r14 = move-exception
            r13.m14851(r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2859.m14844(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008a A[Catch:{ IOException -> 0x00ff, all -> 0x00f3, IOException -> 0x00ea }] */
    /* renamed from: Ӏ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.C0399 m14853() {
        /*
            r13 = this;
            java.lang.Object r0 = f13311
            monitor-enter(r0)
            com.google.firebase.FirebaseApp r1 = r13.f13314     // Catch:{ all -> 0x0108 }
            android.content.Context r1 = r1.m1074()     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = "generatefid.lock"
            o.X$ǃ r1 = o.X.C0104.m1428(r1, r2)     // Catch:{ all -> 0x0108 }
            o.լȷ r2 = r13.f13312     // Catch:{ all -> 0x00f3 }
            org.json.JSONObject r2 = r2.m15739()     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = "Fid"
            r4 = 0
            java.lang.String r3 = r2.optString(r3, r4)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = "Status"
            o.լȷ$If r6 = o.C3100.If.ATTEMPT_MIGRATION     // Catch:{ all -> 0x00f3 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x00f3 }
            int r5 = r2.optInt(r5, r6)     // Catch:{ all -> 0x00f3 }
            java.lang.String r6 = "AuthToken"
            java.lang.String r6 = r2.optString(r6, r4)     // Catch:{ all -> 0x00f3 }
            java.lang.String r7 = "RefreshToken"
            java.lang.String r7 = r2.optString(r7, r4)     // Catch:{ all -> 0x00f3 }
            java.lang.String r8 = "TokenCreationEpochInSecs"
            r9 = 0
            long r11 = r2.optLong(r8, r9)     // Catch:{ all -> 0x00f3 }
            java.lang.String r8 = "ExpiresInSecs"
            long r8 = r2.optLong(r8, r9)     // Catch:{ all -> 0x00f3 }
            java.lang.String r10 = "FisError"
            java.lang.String r2 = r2.optString(r10, r4)     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r4 = o.C0399.m4665()     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r3 = r4.m4675((java.lang.String) r3)     // Catch:{ all -> 0x00f3 }
            o.լȷ$If[] r4 = o.C3100.If.values()     // Catch:{ all -> 0x00f3 }
            r4 = r4[r5]     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r3 = r3.m4676((o.C3100.If) r4)     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r3 = r3.m4678(r6)     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r3 = r3.m4680(r7)     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r3 = r3.m4679(r11)     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r3 = r3.m4674((long) r8)     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r2 = r3.m4677(r2)     // Catch:{ all -> 0x00f3 }
            o.ıϫ r2 = r2.m4681()     // Catch:{ all -> 0x00f3 }
            o.լȷ$If r3 = r2.m4667()     // Catch:{ all -> 0x00f3 }
            o.լȷ$If r4 = o.C3100.If.NOT_GENERATED     // Catch:{ all -> 0x00f3 }
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x0087
            o.լȷ$If r3 = r2.m4667()     // Catch:{ all -> 0x00f3 }
            o.լȷ$If r4 = o.C3100.If.ATTEMPT_MIGRATION     // Catch:{ all -> 0x00f3 }
            if (r3 != r4) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r3 = 0
            goto L_0x0088
        L_0x0087:
            r3 = 1
        L_0x0088:
            if (r3 == 0) goto L_0x00de
            com.google.firebase.FirebaseApp r3 = r13.f13314     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = r3.m1076()     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "CHIME_ANDROID_SDK"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00f3 }
            if (r3 != 0) goto L_0x00a6
            com.google.firebase.FirebaseApp r3 = r13.f13314     // Catch:{ all -> 0x00f3 }
            java.lang.String r4 = "[DEFAULT]"
            java.lang.String r3 = r3.m1076()     // Catch:{ all -> 0x00f3 }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x00f3 }
            if (r3 == 0) goto L_0x00b1
        L_0x00a6:
            o.լȷ$If r3 = r2.m4667()     // Catch:{ all -> 0x00f3 }
            o.լȷ$If r4 = o.C3100.If.ATTEMPT_MIGRATION     // Catch:{ all -> 0x00f3 }
            if (r3 != r4) goto L_0x00af
            r5 = 1
        L_0x00af:
            if (r5 != 0) goto L_0x00b6
        L_0x00b1:
            java.lang.String r3 = o.C3059.m15611()     // Catch:{ all -> 0x00f3 }
            goto L_0x00c6
        L_0x00b6:
            o.cw r3 = r13.f13316     // Catch:{ all -> 0x00f3 }
            java.lang.String r3 = r3.m2033()     // Catch:{ all -> 0x00f3 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x00f3 }
            if (r4 == 0) goto L_0x00c6
            java.lang.String r3 = o.C3059.m15611()     // Catch:{ all -> 0x00f3 }
        L_0x00c6:
            o.լȷ r4 = r13.f13312     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r2 = r2.m4672()     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r2 = r2.m4675((java.lang.String) r3)     // Catch:{ all -> 0x00f3 }
            o.լȷ$If r3 = o.C3100.If.UNREGISTERED     // Catch:{ all -> 0x00f3 }
            o.ıϫ$If r2 = r2.m4676((o.C3100.If) r3)     // Catch:{ all -> 0x00f3 }
            o.ıϫ r2 = r2.m4681()     // Catch:{ all -> 0x00f3 }
            o.ıϫ r2 = r4.m15738(r2)     // Catch:{ all -> 0x00f3 }
        L_0x00de:
            java.nio.channels.FileLock r3 = r1.f1366     // Catch:{ IOException -> 0x00ea }
            r3.release()     // Catch:{ IOException -> 0x00ea }
            java.nio.channels.FileChannel r1 = r1.f1365     // Catch:{ IOException -> 0x00ea }
            r1.close()     // Catch:{ IOException -> 0x00ea }
            monitor-exit(r0)     // Catch:{ all -> 0x0108 }
            return r2
        L_0x00ea:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0108 }
            java.lang.String r3 = "exception while using file locks, should never happen"
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0108 }
            throw r2     // Catch:{ all -> 0x0108 }
        L_0x00f3:
            r2 = move-exception
            java.nio.channels.FileLock r3 = r1.f1366     // Catch:{ IOException -> 0x00ff }
            r3.release()     // Catch:{ IOException -> 0x00ff }
            java.nio.channels.FileChannel r1 = r1.f1365     // Catch:{ IOException -> 0x00ff }
            r1.close()     // Catch:{ IOException -> 0x00ff }
            throw r2     // Catch:{ all -> 0x0108 }
        L_0x00ff:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0108 }
            java.lang.String r3 = "exception while using file locks, should never happen"
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0108 }
            throw r2     // Catch:{ all -> 0x0108 }
        L_0x0108:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0108 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2859.m14853():o.ıϫ");
    }

    /* renamed from: o.ӄ$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: ɩ  reason: contains not printable characters */
        static final /* synthetic */ int[] f13319 = new int[C0944.Cif.values().length];

        /* renamed from: Ι  reason: contains not printable characters */
        static final /* synthetic */ int[] f13320 = new int[C0425.C0426.values().length];

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        static {
            /*
                o.Ȣ$if[] r0 = o.C0944.Cif.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13319 = r0
                r0 = 1
                int[] r1 = f13319     // Catch:{ NoSuchFieldError -> 0x0014 }
                o.Ȣ$if r2 = o.C0944.Cif.OK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f13319     // Catch:{ NoSuchFieldError -> 0x001f }
                o.Ȣ$if r3 = o.C0944.Cif.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r2 = f13319     // Catch:{ NoSuchFieldError -> 0x002a }
                o.Ȣ$if r3 = o.C0944.Cif.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                o.ıы$ı[] r2 = o.C0425.C0426.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13320 = r2
                int[] r2 = f13320     // Catch:{ NoSuchFieldError -> 0x003d }
                o.ıы$ı r3 = o.C0425.C0426.OK     // Catch:{ NoSuchFieldError -> 0x003d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = f13320     // Catch:{ NoSuchFieldError -> 0x0047 }
                o.ıы$ı r2 = o.C0425.C0426.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C2859.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private void m14845() {
        if (TextUtils.isEmpty(this.f13314.m1075().f8951)) {
            throw new IllegalArgumentException("Given String is empty or null");
        } else if (TextUtils.isEmpty(m14846())) {
            throw new IllegalArgumentException("Given String is empty or null");
        } else if (TextUtils.isEmpty(this.f13314.m1075().f8953)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static /* synthetic */ void m14850() {
        C2859 r0 = null;
        r0.m14844(true);
    }
}
