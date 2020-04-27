package o;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o.mQ;

/* renamed from: o.Զ  reason: contains not printable characters */
public final class C3018 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final Executor f13920 = C3105.m15744();

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Map<String, C3018> f13921 = new HashMap();

    /* renamed from: ı  reason: contains not printable characters */
    public final C3136 f13922;

    /* renamed from: Ι  reason: contains not printable characters */
    public C0329<C2832> f13923 = null;

    /* renamed from: ι  reason: contains not printable characters */
    public final ExecutorService f13924;

    private C3018(ExecutorService executorService, C3136 r2) {
        this.f13924 = executorService;
        this.f13922 = r2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = m15465();
        r1 = java.util.concurrent.TimeUnit.SECONDS;
        r2 = new o.C3018.C3019((byte) 0);
        r0.m4408(f13920, (o.C3153<? super o.C2832>) r2);
        r0.m4403(f13920, (o.C3191) r2);
        r0.m4402(f13920, (o.C2970) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r2.f13925.await(5, r1) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r0.m4421() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        return r0.m4401();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        throw new java.util.concurrent.ExecutionException(r0.m4406());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        throw new java.util.concurrent.TimeoutException("Task await timed out.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        return null;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C2832 m15464() {
        /*
            r5 = this;
            monitor-enter(r5)
            o.ıə<o.Ӏв> r0 = r5.f13923     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0017
            o.ıə<o.Ӏв> r0 = r5.f13923     // Catch:{ all -> 0x005e }
            boolean r0 = r0.m4421()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0017
            o.ıə<o.Ӏв> r0 = r5.f13923     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.m4401()     // Catch:{ all -> 0x005e }
            o.Ӏв r0 = (o.C2832) r0     // Catch:{ all -> 0x005e }
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            return r0
        L_0x0017:
            monitor-exit(r5)
            o.ıə r0 = r5.m15465()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            o.Զ$ǃ r2 = new o.Զ$ǃ     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            r3 = 0
            r2.<init>(r3)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            java.util.concurrent.Executor r3 = f13920     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            r0.m4408((java.util.concurrent.Executor) r3, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            java.util.concurrent.Executor r3 = f13920     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            r0.m4403((java.util.concurrent.Executor) r3, (o.C3191) r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            java.util.concurrent.Executor r3 = f13920     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            r0.m4402((java.util.concurrent.Executor) r3, (o.C2970) r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            java.util.concurrent.CountDownLatch r2 = r2.f13925     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            r3 = 5
            boolean r1 = r2.await(r3, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            if (r1 == 0) goto L_0x0054
            boolean r1 = r0.m4421()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            if (r1 == 0) goto L_0x004a
            java.lang.Object r0 = r0.m4401()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            o.Ӏв r0 = (o.C2832) r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            return r0
        L_0x004a:
            java.util.concurrent.ExecutionException r1 = new java.util.concurrent.ExecutionException     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            java.lang.Exception r0 = r0.m4406()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            r1.<init>(r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            throw r1     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
        L_0x0054:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            java.lang.String r1 = "Task await timed out."
            r0.<init>(r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
            throw r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x005c }
        L_0x005c:
            r0 = 0
            return r0
        L_0x005e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3018.m15464():o.Ӏв");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static /* synthetic */ C0329 m15459(C3018 r0, C2832 r1) {
        r0.m15462(r1);
        C0770 r02 = new C0770();
        r02.m6079(r1);
        return r02;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final synchronized C0329<C2832> m15465() {
        if (this.f13923 == null || (this.f13923.m4415() && !this.f13923.m4421())) {
            this.f13923 = C0309.m4375(this.f13924, new mQ.Cif(this.f13922));
        }
        return this.f13923;
    }

    /* renamed from: o.Զ$ǃ  reason: contains not printable characters */
    static class C3019<TResult> implements C2970 {

        /* renamed from: ı  reason: contains not printable characters */
        final CountDownLatch f13925;

        private C3019() {
            this.f13925 = new CountDownLatch(1);
        }

        /* synthetic */ C3019(byte b) {
            this();
        }

        public final void onSuccess(TResult tresult) {
            this.f13925.countDown();
        }

        public final void onFailure(Exception exc) {
            this.f13925.countDown();
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m15466() {
            this.f13925.countDown();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final C0329<C2832> m15463(C2832 r4) {
        return C0309.m4375(this.f13924, new mQ(this, r4)).m4410(this.f13924, new mQ.C0239(this, r4));
    }

    /* renamed from: ι  reason: contains not printable characters */
    private synchronized void m15462(C2832 r2) {
        C0770 r0 = new C0770();
        r0.m6079(r2);
        this.f13923 = r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static synchronized C3018 m15460(ExecutorService executorService, C3136 r5) {
        C3018 r4;
        synchronized (C3018.class) {
            String str = r5.f14302;
            if (!f13921.containsKey(str)) {
                f13921.put(str, new C3018(executorService, r5));
            }
            r4 = f13921.get(str);
        }
        return r4;
    }
}
