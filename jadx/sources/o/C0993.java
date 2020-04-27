package o;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import o.C0993.C0994;
import o.mQ;
import o.mT;

/* renamed from: o.ȿı  reason: contains not printable characters */
public abstract class C0993<ResultT extends C0994> extends C0617<ResultT> {

    /* renamed from: ı  reason: contains not printable characters */
    private static final HashMap<Integer, HashSet<Integer>> f6035 = new HashMap<>();

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final HashMap<Integer, HashSet<Integer>> f6036 = new HashMap<>();

    /* renamed from: Ɩ  reason: contains not printable characters */
    private C2038<C3191, ResultT> f6037 = new C2038<>(this, 64, new mT.C3587iF(this));

    /* renamed from: ȷ  reason: contains not printable characters */
    private ResultT f6038;

    /* renamed from: ɩ  reason: contains not printable characters */
    public Object f6039 = new Object();

    /* renamed from: ɹ  reason: contains not printable characters */
    private C2038<C3149<ResultT>, ResultT> f6040 = new C2038<>(this, 448, new mT.C0247(this));

    /* renamed from: Ι  reason: contains not printable characters */
    volatile int f6041 = 1;

    /* renamed from: ι  reason: contains not printable characters */
    private C2038<C3153<? super ResultT>, ResultT> f6042 = new C2038<>(this, 128, new mQ.C0243(this));

    /* renamed from: І  reason: contains not printable characters */
    private C2038<Object<? super ResultT>, ResultT> f6043 = new C2038<>(this, -465, C1628.m9390());

    /* renamed from: і  reason: contains not printable characters */
    private C2038<Object<? super ResultT>, ResultT> f6044 = new C2038<>(this, 16, C2204.m11631());

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C2038<C2970, ResultT> f6045 = new C2038<>(this, 256, new mY(this));

    /* renamed from: o.ȿı$ı  reason: contains not printable characters */
    public interface C0994 {
        /* renamed from: ι  reason: contains not printable characters */
        Exception m7078();
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static String m7043(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? i != 16 ? i != 32 ? i != 64 ? i != 128 ? i != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public void m7049() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɪ  reason: contains not printable characters */
    public abstract void m7059();

    /* access modifiers changed from: package-private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public abstract void m7060();

    /* access modifiers changed from: package-private */
    /* renamed from: і  reason: contains not printable characters */
    public abstract ResultT m7075();

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public abstract C0950 m7076();

    static {
        f6036.put(1, new HashSet(Arrays.asList(new Integer[]{16, 256})));
        f6036.put(2, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        f6036.put(4, new HashSet(Arrays.asList(new Integer[]{8, 32})));
        f6036.put(16, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        f6036.put(64, new HashSet(Arrays.asList(new Integer[]{2, 256})));
        f6035.put(1, new HashSet(Arrays.asList(new Integer[]{2, 64})));
        f6035.put(2, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        f6035.put(4, new HashSet(Arrays.asList(new Integer[]{4, 64, 128})));
        f6035.put(8, new HashSet(Arrays.asList(new Integer[]{16, 64, 128})));
        f6035.put(32, new HashSet(Arrays.asList(new Integer[]{256, 64, 128})));
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static /* synthetic */ void m7038(C0993 r1, C3153 r2, C0994 r3) {
        C1805.m9990().m9991(r1);
        r2.onSuccess(r3);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static /* synthetic */ void m7030(C0993 r1, C3191 r2, C0994 r3) {
        C1805.m9990().m9991(r1);
        r2.onFailure(r3.m7078());
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static /* synthetic */ void m7042(C0993 r1, C3149 r2) {
        C1805.m9990().m9991(r1);
        r2.m15936(r1);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static /* synthetic */ void m7029(C0993 r1, C2970 r2) {
        C1805.m9990().m9991(r1);
        r2.m15253();
    }

    protected C0993() {
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public Exception m7054() {
        if (m7039() == null) {
            return null;
        }
        return m7039().m7078();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: І  reason: contains not printable characters */
    public final ResultT m7074() {
        ResultT r1;
        synchronized (this.f6039) {
            r1 = m7075();
        }
        return r1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        return true;
     */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m7053(int[] r8) {
        /*
            r7 = this;
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.Integer>> r0 = f6035
            java.lang.Object r1 = r7.f6039
            monitor-enter(r1)
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r3 > 0) goto L_0x0095
            r4 = r8[r2]     // Catch:{ all -> 0x009f }
            int r5 = r7.f6041     // Catch:{ all -> 0x009f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x009f }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x009f }
            java.util.HashSet r5 = (java.util.HashSet) r5     // Catch:{ all -> 0x009f }
            if (r5 == 0) goto L_0x0091
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x009f }
            boolean r5 = r5.contains(r6)     // Catch:{ all -> 0x009f }
            if (r5 == 0) goto L_0x0091
            r7.f6041 = r4     // Catch:{ all -> 0x009f }
            int r8 = r7.f6041     // Catch:{ all -> 0x009f }
            r0 = 2
            if (r8 == r0) goto L_0x0042
            r0 = 4
            if (r8 == r0) goto L_0x005c
            r0 = 16
            if (r8 == r0) goto L_0x005c
            r0 = 64
            if (r8 == r0) goto L_0x005c
            r0 = 128(0x80, float:1.794E-43)
            if (r8 == r0) goto L_0x005c
            r0 = 256(0x100, float:3.59E-43)
            if (r8 == r0) goto L_0x003e
            goto L_0x005c
        L_0x003e:
            r7.m7049()     // Catch:{ all -> 0x009f }
            goto L_0x005c
        L_0x0042:
            o.Ιȣ r8 = o.C1805.m9990()     // Catch:{ all -> 0x009f }
            java.lang.Object r0 = r8.f9245     // Catch:{ all -> 0x009f }
            monitor-enter(r0)     // Catch:{ all -> 0x009f }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<o.ȿı<?>>> r8 = r8.f9244     // Catch:{ all -> 0x008e }
            o.ȣІ r2 = r7.m7076()     // Catch:{ all -> 0x008e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008e }
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x008e }
            r3.<init>(r7)     // Catch:{ all -> 0x008e }
            r8.put(r2, r3)     // Catch:{ all -> 0x008e }
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
        L_0x005c:
            o.ιϫ<o.յι<? super ResultT>, ResultT> r8 = r7.f6042     // Catch:{ all -> 0x009f }
            r8.m10910()     // Catch:{ all -> 0x009f }
            o.ιϫ<o.ւƖ, ResultT> r8 = r7.f6037     // Catch:{ all -> 0x009f }
            r8.m10910()     // Catch:{ all -> 0x009f }
            o.ιϫ<o.Ԑǃ, ResultT> r8 = r7.f6045     // Catch:{ all -> 0x009f }
            r8.m10910()     // Catch:{ all -> 0x009f }
            o.ιϫ<o.յɩ<ResultT>, ResultT> r8 = r7.f6040     // Catch:{ all -> 0x009f }
            r8.m10910()     // Catch:{ all -> 0x009f }
            o.ιϫ<java.lang.Object<? super ResultT>, ResultT> r8 = r7.f6044     // Catch:{ all -> 0x009f }
            r8.m10910()     // Catch:{ all -> 0x009f }
            o.ιϫ<java.lang.Object<? super ResultT>, ResultT> r8 = r7.f6043     // Catch:{ all -> 0x009f }
            r8.m10910()     // Catch:{ all -> 0x009f }
            java.lang.String r8 = "StorageTask"
            r0 = 3
            boolean r8 = android.util.Log.isLoggable(r8, r0)     // Catch:{ all -> 0x009f }
            if (r8 == 0) goto L_0x008b
            m7043((int) r4)     // Catch:{ all -> 0x009f }
            int r8 = r7.f6041     // Catch:{ all -> 0x009f }
            m7043((int) r8)     // Catch:{ all -> 0x009f }
        L_0x008b:
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            r8 = 1
            return r8
        L_0x008e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009f }
            throw r8     // Catch:{ all -> 0x009f }
        L_0x0091:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0095:
            m7025((int[]) r8)     // Catch:{ all -> 0x009f }
            int r8 = r7.f6041     // Catch:{ all -> 0x009f }
            m7043((int) r8)     // Catch:{ all -> 0x009f }
            monitor-exit(r1)     // Catch:{ all -> 0x009f }
            return r2
        L_0x009f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0993.m7053(int[]):boolean");
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private ResultT m7039() {
        ResultT resultt = this.f6038;
        if (resultt != null) {
            return resultt;
        }
        if (!m4415()) {
            return null;
        }
        if (this.f6038 == null) {
            this.f6038 = m7074();
        }
        return this.f6038;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C0993<ResultT> m7072(C3153<? super ResultT> r3) {
        if (r3 != null) {
            this.f6042.m10911((Activity) null, (Executor) null, r3);
            return this;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public C0993<ResultT> m7056(Executor executor, C3153<? super ResultT> r4) {
        if (executor == null) {
            throw new NullPointerException("null reference");
        } else if (r4 != null) {
            this.f6042.m10911((Activity) null, executor, r4);
            return this;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C0993<ResultT> m7065(C3191 r3) {
        if (r3 != null) {
            this.f6037.m10911((Activity) null, (Executor) null, r3);
            return this;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public C0993<ResultT> m7048(Executor executor, C3191 r4) {
        if (r4 == null) {
            throw new NullPointerException("null reference");
        } else if (executor != null) {
            this.f6037.m10911((Activity) null, executor, r4);
            return this;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final C0993<ResultT> m7057(C3149<ResultT> r3) {
        if (r3 != null) {
            this.f6040.m10911((Activity) null, (Executor) null, r3);
            return this;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public C0993<ResultT> m7055(Executor executor, C3149<ResultT> r4) {
        if (r4 == null) {
            throw new NullPointerException("null reference");
        } else if (executor != null) {
            this.f6040.m10911((Activity) null, executor, r4);
            return this;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public C0993<ResultT> m7069(Activity activity, C3149<ResultT> r4) {
        if (r4 == null) {
            throw new NullPointerException("null reference");
        } else if (activity != null) {
            this.f6040.m10911(activity, (Executor) null, r4);
            return this;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public C0993<ResultT> m7062(C2970 r3) {
        if (r3 != null) {
            this.f6045.m10911((Activity) null, (Executor) null, r3);
            return this;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public C0993<ResultT> m7047(Executor executor, C2970 r4) {
        if (r4 == null) {
            throw new NullPointerException("null reference");
        } else if (executor != null) {
            this.f6045.m10911((Activity) null, executor, r4);
            return this;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public <ContinuationResultT> C0329<ContinuationResultT> m7063(C2979<ResultT, ContinuationResultT> r2) {
        return m7035((Executor) null, r2);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public <ContinuationResultT> C0329<ContinuationResultT> m7070(Executor executor, C2979<ResultT, ContinuationResultT> r2) {
        return m7035(executor, r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private <ContinuationResultT> C0329<ContinuationResultT> m7035(Executor executor, C2979<ResultT, ContinuationResultT> r5) {
        C3203 r0 = new C3203();
        this.f6040.m10911((Activity) null, executor, new na(this, r5, r0));
        return r0.f14555;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static /* synthetic */ void m7033(C0993 r0, C2979 r1, C3203 r2) {
        try {
            Object r02 = r1.m15305(r0);
            if (!r2.f14555.m4415()) {
                r2.f14555.m6079(r02);
            }
        } catch (C3053 e) {
            if (e.getCause() instanceof Exception) {
                r2.f14555.m6073((Exception) e.getCause());
                return;
            }
            r2.f14555.m6073((Exception) e);
        } catch (Exception e2) {
            r2.f14555.m6073(e2);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public <ContinuationResultT> C0329<ContinuationResultT> m7071(C2979<ResultT, C0329<ContinuationResultT>> r2) {
        return m7026((Executor) null, r2);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public <ContinuationResultT> C0329<ContinuationResultT> m7050(Executor executor, C2979<ResultT, C0329<ContinuationResultT>> r2) {
        return m7026(executor, r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public <ContinuationResultT> C0329<ContinuationResultT> m7064(C3184<ResultT, ContinuationResultT> r2) {
        return m7044((Executor) null, r2);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public <ContinuationResultT> C0329<ContinuationResultT> m7061(Executor executor, C3184<ResultT, ContinuationResultT> r2) {
        return m7044(executor, r2);
    }

    /* renamed from: ı  reason: contains not printable characters */
    private <ContinuationResultT> C0329<ContinuationResultT> m7026(Executor executor, C2979<ResultT, C0329<ContinuationResultT>> r6) {
        C2173 r0 = new C2173();
        C3203 r2 = new C3203(r0.f10350);
        this.f6040.m10911((Activity) null, executor, new mQ.IF(this, r6, r2, r0));
        return r2.f14555;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static /* synthetic */ void m7037(C0993 r0, C2979 r1, C3203 r2, C2173 r3) {
        try {
            C0329 r02 = (C0329) r1.m15305(r0);
            if (r2.f14555.m4415()) {
                return;
            }
            if (r02 == null) {
                r2.f14555.m6073((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            r02.m4420(new mT.C0245(r2));
            r02.m4414((C3191) new mT.C0246(r2));
            r02.m4411((C2970) new mT.IF(r3));
        } catch (C3053 e) {
            if (e.getCause() instanceof Exception) {
                r2.f14555.m6073((Exception) e.getCause());
                return;
            }
            r2.f14555.m6073((Exception) e);
        } catch (Exception e2) {
            r2.f14555.m6073(e2);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private <ContinuationResultT> C0329<ContinuationResultT> m7044(Executor executor, C3184<ResultT, ContinuationResultT> r6) {
        C2173 r0 = new C2173();
        C3203 r2 = new C3203(r0.f10350);
        this.f6042.m10911((Activity) null, executor, new mQ.aux(r6, r2, r0));
        return r2.f14555;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static /* synthetic */ void m7031(C3184 r0, C3203 r1, C2173 r2, C0994 r3) {
        try {
            C0329 r02 = r0.m16059(r3);
            r02.m4420(new mT.C0244(r1));
            r02.m4414((C3191) new mT.Cif(r1));
            r02.m4411((C2970) new mT.C3586If(r2));
        } catch (C3053 e) {
            if (e.getCause() instanceof Exception) {
                r1.f14555.m6073((Exception) e.getCause());
                return;
            }
            r1.f14555.m6073((Exception) e);
        } catch (Exception e2) {
            r1.f14555.m6073(e2);
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static /* synthetic */ void m7041(C0993 r1) {
        try {
            r1.m7059();
        } finally {
            r1.m7034();
        }
    }

    /* renamed from: ȷ  reason: contains not printable characters */
    private void m7034() {
        if (!m4415()) {
            if (!((this.f6041 & 16) != 0) && this.f6041 != 2) {
                if (!m7053(new int[]{256})) {
                    m7053(new int[]{64});
                }
            }
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m7025(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int r4 : iArr) {
            sb.append(m7043(r4));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: o.ȿı$if  reason: invalid class name */
    public class Cif implements C0994 {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final Exception f6046;

        public Cif(C0993 r1, Exception exc) {
            if (exc != null) {
                this.f6046 = exc;
            } else if (r1.m4405()) {
                this.f6046 = C1398.m8574(Status.f531);
            } else if (r1.f6041 == 64) {
                this.f6046 = C1398.m8574(Status.f533);
            } else {
                this.f6046 = null;
            }
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final Exception m7077() {
            return this.f6046;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public boolean m7067() {
        return (this.f6041 & 448) != 0;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public boolean m7073() {
        return (this.f6041 & 128) != 0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m7052() {
        return this.f6041 == 256;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public /* synthetic */ Object m7068(Class cls) {
        if (m7039() == null) {
            throw new IllegalStateException();
        } else if (!cls.isInstance(m7039().m7078())) {
            Exception r2 = m7039().m7078();
            if (r2 == null) {
                return m7039();
            }
            throw new C3053(r2);
        } else {
            throw ((Throwable) cls.cast(m7039().m7078()));
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public /* synthetic */ Object m7046() {
        if (m7039() != null) {
            Exception r0 = m7039().m7078();
            if (r0 == null) {
                return m7039();
            }
            throw new C3053(r0);
        }
        throw new IllegalStateException();
    }
}
