package o;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 \u00012\u00020:2\u00020;:\u0003\u00016\u0011B+\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u000e\u0012\b\b\u0002\u00107\u001a\u00020\u0019¢\u0006\u0004\b8\u00109J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\nJ#\u0010\f\u001a\u00020'2\n\u0010$\u001a\u00060\"j\u0002`#2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b\f\u0010(J\u0015\u0010\u001a\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010)J-\u0010\u0011\u001a\u00020\u001f2\n\u0010$\u001a\u00060\"j\u0002`#2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010*\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010+J\u001b\u0010,\u001a\u00020\u001f2\n\u0010$\u001a\u00060\"j\u0002`#H\u0016¢\u0006\u0004\b,\u0010-J\u001b\u0010\u0011\u001a\u00020\u00022\n\u0010$\u001a\u00060\u001dR\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010.J\u0015\u0010\u0003\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010)J\u001b\u0010\f\u001a\u00020\u001f2\n\u0010$\u001a\u00060\u001dR\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010/J+\u0010\u0005\u001a\u00020\u001f2\n\u0010$\u001a\u00060\u001dR\u00020\u00002\u0006\u0010&\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u00100J\u000f\u0010\u0017\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\u0017\u0010!J\u0017\u0010\u0005\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020'H\u0002¢\u0006\u0004\b\u0005\u00101J\u0015\u0010\f\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u000e¢\u0006\u0004\b\f\u00102J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010$\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0005\u00103J\u000f\u00104\u001a\u00020\u0019H\u0016¢\u0006\u0004\b4\u00105J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0007R\u0017\u0010\u0001\u001a\u00020\u00028Ã\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0003\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0017\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u001dR\u00020\u00000\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001e"}, d2 = {"Lo/jp;", "ɩ", "", "і", "I", "ı", "Ljava/util/concurrent/Semaphore;", "Ljava/util/concurrent/Semaphore;", "Ι", "Ɩ", "()I", "Lo/ju;", "ι", "Lo/ju;", "", "ɨ", "J", "ǃ", "", "Ӏ", "()Z", "І", "Ljava/util/Random;", "ɹ", "Ljava/util/Random;", "", "ɪ", "Ljava/lang/String;", "", "Lo/jp$If;", "[Lo/jp$If;", "", "close", "()V", "Ljava/lang/Runnable;", "Lo/ɩ;", "p0", "Lo/jy;", "p1", "Lo/jx;", "(Ljava/lang/Runnable;Lo/jy;)Lo/jx;", "()Lo/jp$If;", "p2", "(Ljava/lang/Runnable;Lo/jy;Z)V", "execute", "(Ljava/lang/Runnable;)V", "(Lo/jp$If;)I", "(Lo/jp$If;)V", "(Lo/jp$If;II)V", "(Lo/jx;)V", "(J)V", "(Lo/jx;Z)I", "toString", "()Ljava/lang/String;", "If", "p3", "<init>", "(IIJLjava/lang/String;)V", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.jp  reason: case insensitive filesystem */
public final class C3521jp implements Executor, Closeable {

    /* renamed from: ı  reason: contains not printable characters */
    private static final AtomicLongFieldUpdater f2484;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f2485;

    /* renamed from: ǃ  reason: contains not printable characters */
    static final AtomicLongFieldUpdater f2486;
    /* access modifiers changed from: private */

    /* renamed from: ȷ  reason: contains not printable characters */
    public static final int f2487 = C3514ji.m3091$default("kotlinx.coroutines.scheduler.spins", 1000, 1, 0, 8, (Object) null);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final C0192 f2488 = new C0192((fL) null);
    /* access modifiers changed from: private */

    /* renamed from: ɾ  reason: contains not printable characters */
    public static final int f2489 = ((int) TimeUnit.SECONDS.toNanos(1));
    /* access modifiers changed from: private */

    /* renamed from: ɿ  reason: contains not printable characters */
    public static final int f2490 = ((int) C3435gj.m2409(C3435gj.m2406(jB.f2394 / ((long) 4), 10), (long) f2489));
    /* access modifiers changed from: private */

    /* renamed from: г  reason: contains not printable characters */
    public static final C3506ja f2491 = new C3506ja("NOT_IN_STACK");
    /* access modifiers changed from: private */

    /* renamed from: ӏ  reason: contains not printable characters */
    public static final int f2492 = (f2487 + C3514ji.m3091$default("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8, (Object) null));
    private volatile int _isTerminated;
    volatile long controlState;
    private volatile long parkedWorkersStack;
    /* access modifiers changed from: private */

    /* renamed from: ɨ  reason: contains not printable characters */
    public final long f2493;
    /* access modifiers changed from: private */

    /* renamed from: ɩ  reason: contains not printable characters and collision with other field name */
    public final Semaphore f2494;
    /* access modifiers changed from: private */

    /* renamed from: ɪ  reason: contains not printable characters */
    public final String f2495;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Random f2496;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final C3525ju f2497;

    /* renamed from: І  reason: contains not printable characters */
    private final int f2498;
    /* access modifiers changed from: private */

    /* renamed from: і  reason: contains not printable characters */
    public final int f2499;
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final If[] f2500;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/jp$ǃ;", "ι", "ǃ", "ɩ", "Ι", "ı", "<init>", "(Ljava/lang/String;I)V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.jp$ǃ  reason: contains not printable characters */
    public enum C0191 {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    public C3521jp(int i, int i2, long j, String str) {
        fM.m2254(str, "");
        this.f2499 = i;
        this.f2498 = i2;
        this.f2493 = j;
        this.f2495 = str;
        if (this.f2499 >= 1) {
            if (this.f2498 >= this.f2499) {
                if (this.f2498 <= 2097150) {
                    if (this.f2493 > 0) {
                        this.f2497 = new C3525ju();
                        this.f2494 = new Semaphore(this.f2499, false);
                        this.parkedWorkersStack = 0;
                        this.f2500 = new If[(this.f2498 + 1)];
                        this.controlState = 0;
                        this.f2496 = new Random();
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + this.f2493 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + this.f2498 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + this.f2498 + " should be greater than or equals to core pool size " + this.f2499).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + this.f2499 + " should be at least 1").toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m3138(If ifR) {
        long j;
        long j2;
        int r0;
        if (ifR.m3173() == f2491) {
            do {
                j = this.parkedWorkersStack;
                int i = (int) (2097151 & j);
                j2 = (2097152 + j) & -2097152;
                r0 = ifR.m3165();
                if (hA.m2423()) {
                    if (!(r0 != 0)) {
                        throw new AssertionError();
                    }
                }
                ifR.m3170((Object) this.f2500[i]);
            } while (!f2484.compareAndSet(this, j, ((long) r0) | j2));
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int m3123(If ifR) {
        Object r2 = ifR.m3173();
        while (r2 != f2491) {
            if (r2 == null) {
                return 0;
            }
            If ifR2 = (If) r2;
            int r0 = ifR2.m3165();
            if (r0 != 0) {
                return r0;
            }
            r2 = ifR2.m3173();
        }
        return -1;
    }

    /* access modifiers changed from: private */
    @JvmName(name = "Ɩ")
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final int m3121() {
        return (int) (this.controlState & 2097151);
    }

    /* access modifiers changed from: private */
    @JvmName(name = "Ӏ")
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean m3146() {
        return this._isTerminated != 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lo/jp$ɩ;", "", "ɾ", "I", "Ι", "ȷ", "ǃ", "ӏ", "ɩ", "ɿ", "ı", "Lo/ja;", "г", "Lo/ja;", "ι", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.jp$ɩ  reason: contains not printable characters */
    public static final class C0192 {
        private C0192() {
        }

        public /* synthetic */ C0192(fL fLVar) {
            this();
        }
    }

    static {
        Class<C3521jp> cls = C3521jp.class;
        f2484 = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f2486 = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f2485 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public final void execute(Runnable runnable) {
        fM.m2254(runnable, "");
        m3126$default(this, runnable, (C3529jy) null, false, 6, (Object) null);
    }

    public final void close() {
        m3149(10000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        if (r9 != null) goto L_0x0078;
     */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m3149(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f2485
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            o.jp$If r0 = r8.m3131()
            o.jp$If[] r3 = r8.f2500
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00a8 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x0062
            r3 = 1
        L_0x001d:
            o.jp$If[] r4 = r8.f2500
            r4 = r4[r3]
            if (r4 != 0) goto L_0x0026
            o.fM.m2256()
        L_0x0026:
            if (r4 == r0) goto L_0x005d
        L_0x0028:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x0038
            r6 = r4
            java.lang.Thread r6 = (java.lang.Thread) r6
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r4.join(r9)
            goto L_0x0028
        L_0x0038:
            o.jp$ǃ r6 = r4.m3169()
            boolean r7 = o.hA.m2423()
            if (r7 == 0) goto L_0x0054
            o.jp$ǃ r7 = o.C3521jp.C0191.TERMINATED
            if (r6 != r7) goto L_0x0048
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r6 == 0) goto L_0x004c
            goto L_0x0054
        L_0x004c:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x0054:
            o.jG r4 = r4.m3161()
            o.ju r6 = r8.f2497
            r4.m2835(r6)
        L_0x005d:
            if (r3 == r5) goto L_0x0062
            int r3 = r3 + 1
            goto L_0x001d
        L_0x0062:
            o.ju r9 = r8.f2497
            r9.m2652()
        L_0x0067:
            if (r0 == 0) goto L_0x0070
            o.jx r9 = r0.m3164()
            if (r9 == 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            o.ju r9 = r8.f2497
            java.lang.Object r9 = r9.m2654()
            o.jx r9 = (o.C3528jx) r9
        L_0x0078:
            if (r9 == 0) goto L_0x007e
            r8.m3120((o.C3528jx) r9)
            goto L_0x0067
        L_0x007e:
            if (r0 == 0) goto L_0x0085
            o.jp$ǃ r9 = o.C3521jp.C0191.TERMINATED
            r0.m3171((o.C3521jp.C0191) r9)
        L_0x0085:
            boolean r9 = o.hA.m2423()
            if (r9 == 0) goto L_0x00a1
            java.util.concurrent.Semaphore r9 = r8.f2494
            int r9 = r9.availablePermits()
            int r10 = r8.f2499
            if (r9 != r10) goto L_0x0096
            r1 = 1
        L_0x0096:
            if (r1 == 0) goto L_0x0099
            goto L_0x00a1
        L_0x0099:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00a1:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        L_0x00a8:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3521jp.m3149(long):void");
    }

    /* renamed from: ǃ$default  reason: contains not printable characters */
    public static /* synthetic */ void m3126$default(C3521jp jpVar, Runnable runnable, C3529jy jyVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            jyVar = C3526jv.f2528;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        jpVar.m3147(runnable, jyVar, z);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m3147(Runnable runnable, C3529jy jyVar, boolean z) {
        fM.m2254(runnable, "");
        fM.m2254(jyVar, "");
        C3500iv r0 = C3499iu.m2796();
        if (r0 != null) {
            r0.m2802();
        }
        C3528jx r2 = m3148(runnable, jyVar);
        int r3 = m3117(r2, z);
        if (r3 == -1) {
            return;
        }
        if (r3 != 1) {
            m3132();
        } else if (this.f2497.m2653(r2)) {
            m3132();
        } else {
            throw new RejectedExecutionException(this.f2495 + " was terminated");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C3528jx m3148(Runnable runnable, C3529jy jyVar) {
        fM.m2254(runnable, "");
        fM.m2254(jyVar, "");
        long r0 = jB.f2399.m2820();
        if (!(runnable instanceof C3528jx)) {
            return new jA(runnable, r0, jyVar);
        }
        C3528jx jxVar = (C3528jx) runnable;
        jxVar.f2532 = r0;
        jxVar.f2531 = jyVar;
        return jxVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m3132() {
        if (this.f2494.availablePermits() == 0) {
            m3142();
        } else if (!m3142()) {
            long j = this.controlState;
            if (((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)) < this.f2499) {
                int r0 = m3127();
                if (r0 == 1 && this.f2499 > 1) {
                    m3127();
                }
                if (r0 > 0) {
                    return;
                }
            }
            m3142();
        }
    }

    /* renamed from: І  reason: contains not printable characters */
    private final boolean m3142() {
        while (true) {
            If r0 = m3144();
            if (r0 == null) {
                return false;
            }
            r0.m3162();
            boolean r1 = r0.m3168();
            LockSupport.unpark(r0);
            if (r1 && r0.m3174()) {
                return true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        return 0;
     */
    /* renamed from: ɨ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m3127() {
        /*
            r10 = this;
            o.jp$If[] r0 = r10.f2500
            monitor-enter(r0)
            boolean r1 = r10.m3146()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x000c
            r1 = -1
            monitor-exit(r0)
            return r1
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x0081 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r6 = (int) r5     // Catch:{ all -> 0x0081 }
            r7 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r7
            r5 = 21
            long r1 = r1 >> r5
            int r2 = (int) r1     // Catch:{ all -> 0x0081 }
            int r1 = r6 - r2
            int r2 = r10.f2499     // Catch:{ all -> 0x0081 }
            r5 = 0
            if (r1 < r2) goto L_0x0027
            monitor-exit(r0)
            return r5
        L_0x0027:
            int r2 = r10.f2498     // Catch:{ all -> 0x0081 }
            if (r6 >= r2) goto L_0x007f
            java.util.concurrent.Semaphore r2 = r10.f2494     // Catch:{ all -> 0x0081 }
            int r2 = r2.availablePermits()     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0034
            goto L_0x007f
        L_0x0034:
            long r6 = r10.controlState     // Catch:{ all -> 0x0081 }
            long r6 = r6 & r3
            int r2 = (int) r6     // Catch:{ all -> 0x0081 }
            r6 = 1
            int r2 = r2 + r6
            if (r2 <= 0) goto L_0x0044
            o.jp$If[] r7 = r10.f2500     // Catch:{ all -> 0x0081 }
            r7 = r7[r2]     // Catch:{ all -> 0x0081 }
            if (r7 != 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x0071
            o.jp$If r7 = new o.jp$If     // Catch:{ all -> 0x0081 }
            r7.<init>(r10, r2)     // Catch:{ all -> 0x0081 }
            r7.start()     // Catch:{ all -> 0x0081 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f2486     // Catch:{ all -> 0x0081 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0081 }
            long r3 = r3 & r8
            int r4 = (int) r3     // Catch:{ all -> 0x0081 }
            if (r2 != r4) goto L_0x005a
            r5 = 1
        L_0x005a:
            if (r5 == 0) goto L_0x0063
            o.jp$If[] r3 = r10.f2500     // Catch:{ all -> 0x0081 }
            r3[r2] = r7     // Catch:{ all -> 0x0081 }
            int r1 = r1 + r6
            monitor-exit(r0)
            return r1
        L_0x0063:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x0071:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r0)
            return r5
        L_0x0081:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3521jp.m3127():int");
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final int m3117(C3528jx jxVar, boolean z) {
        boolean z2;
        If r0 = m3131();
        if (r0 == null || r0.m3169() == C0191.TERMINATED) {
            return 1;
        }
        int i = -1;
        if (jxVar.m3190() == C3530jz.NON_BLOCKING) {
            if (r0.m3167()) {
                i = 0;
            } else if (!r0.m3172()) {
                return 1;
            }
        }
        if (z) {
            z2 = r0.m3161().m2830(jxVar, this.f2497);
        } else {
            z2 = r0.m3161().m2833(jxVar, this.f2497);
        }
        if (!z2 || r0.m3161().m2834() > jB.f2397) {
            return 0;
        }
        return i;
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private final If m3131() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof If)) {
            currentThread = null;
        }
        If ifR = (If) currentThread;
        if (ifR == null || !fM.m2257(ifR.m3163(), this)) {
            return null;
        }
        return ifR;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (If ifR : this.f2500) {
            if (ifR != null) {
                int r10 = ifR.m3161().m2832();
                int i6 = js$WhenMappings.f2522[ifR.m3169().ordinal()];
                if (i6 == 1) {
                    i3++;
                } else if (i6 == 2) {
                    i2++;
                    arrayList.add(String.valueOf(r10) + "b");
                } else if (i6 == 3) {
                    i++;
                    arrayList.add(String.valueOf(r10) + "c");
                } else if (i6 == 4) {
                    i4++;
                    if (r10 > 0) {
                        arrayList.add(String.valueOf(r10) + "r");
                    }
                } else if (i6 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f2495 + '@' + hB.m2427(this) + '[' + "Pool Size {" + "core = " + this.f2499 + ", " + "max = " + this.f2498 + "}, " + "Worker States {" + "CPU = " + i + ", " + "blocking = " + i2 + ", " + "parked = " + i3 + ", " + "retired = " + i4 + ", " + "terminated = " + i5 + "}, " + "running workers queues = " + arrayList + ", " + "global queue size = " + this.f2497.m2651() + ", " + "Control State Workers {" + "created = " + ((int) (2097151 & j)) + ", " + "blocking = " + ((int) ((j & 4398044413952L) >> 21)) + '}' + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m3120(C3528jx jxVar) {
        C3500iv r3;
        try {
            jxVar.run();
            r3 = C3499iu.m2796();
            if (r3 == null) {
                return;
            }
        } catch (Throwable th) {
            C3500iv r0 = C3499iu.m2796();
            if (r0 != null) {
                r0.m2800();
            }
            throw th;
        }
        r3.m2800();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020:B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b7\u00108B\t\b\u0002¢\u0006\u0004\b7\u00109J\u0017\u0010\u000f\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020$H\u0002¢\u0006\u0004\b\u000f\u0010&J\u001f\u0010\u000b\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000b\u0010(J\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010+J\u0017\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0005\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b1\u00100J\u0017\u0010\u0005\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020$H\u0002¢\u0006\u0004\b\u0005\u0010&J\r\u0010\u001c\u001a\u00020%¢\u0006\u0004\b\u001c\u0010+J\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u00102J\u000f\u00103\u001a\u00020%H\u0016¢\u0006\u0004\b3\u0010+J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020 H\u0000¢\u0006\u0004\b\u000b\u00104J\u0011\u00105\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b5\u00100J\u000f\u00106\u001a\u00020%H\u0002¢\u0006\u0004\b6\u0010+R*\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018\u0007@GX\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0005\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\r\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0005\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0019\u0010\f\u001a\u00020\u00128\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007@\u0007X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018\"\u0004\b\u000b\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0013\u0010\u001c\u001a\u00020\u001d8G@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u001c\u0010!\u001a\u00020 8\u0007@\u0006X\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u000b\u0010#R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0010"}, d2 = {"Lo/jp$If;", "", "p0", "indexInArray", "I", "ɩ", "()I", "(I)V", "", "ɹ", "()Z", "ι", "Ι", "ǃ", "", "ı", "J", "і", "Lo/jG;", "Lo/jG;", "()Lo/jG;", "", "nextParkedWorker", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "І", "Ӏ", "Ɩ", "Lo/jp;", "()Lo/jp;", "spins", "Lo/jp$ǃ;", "state", "Lo/jp$ǃ;", "()Lo/jp$ǃ;", "Lo/jz;", "", "(Lo/jz;)V", "p1", "(Lo/jz;J)V", "ӏ", "ɪ", "()V", "ɾ", "(J)Z", "Lo/jx;", "ȷ", "()Lo/jx;", "ɿ", "(I)I", "run", "(Lo/jp$ǃ;)Z", "г", "ɨ", "<init>", "(Lo/jp;I)V", "(Lo/jp;)V", "Ljava/lang/Thread;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.jp$If */
    public final class If extends Thread {

        /* renamed from: ι  reason: contains not printable characters */
        private static final AtomicIntegerFieldUpdater f2501 = AtomicIntegerFieldUpdater.newUpdater(If.class, "terminationState");
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int spins;
        private volatile C0191 state;
        private volatile int terminationState;

        /* renamed from: ı  reason: contains not printable characters */
        private long f2502;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private int f2503;

        /* renamed from: ǃ  reason: contains not printable characters */
        private long f2504;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final jG f2505;

        /* renamed from: І  reason: contains not printable characters */
        private int f2507;

        /* renamed from: і  reason: contains not printable characters */
        private int f2508;

        private If() {
            setDaemon(true);
            this.f2505 = new jG();
            this.state = C0191.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = C3521jp.f2491;
            this.f2507 = C3521jp.f2490;
            this.f2503 = C3521jp.this.f2496.nextInt();
        }

        @JvmName(name = "ɩ")
        /* renamed from: ɩ  reason: contains not printable characters */
        public final int m3165() {
            return this.indexInArray;
        }

        @JvmName(name = "ɩ")
        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m3166(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C3521jp.this.f2495);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public If(C3521jp jpVar, int i) {
            this();
            m3166(i);
        }

        @JvmName(name = "ǃ")
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C3521jp m3163() {
            return C3521jp.this;
        }

        @JvmName(name = "ı")
        /* renamed from: ı  reason: contains not printable characters */
        public final jG m3161() {
            return this.f2505;
        }

        @JvmName(name = "ι")
        /* renamed from: ι  reason: contains not printable characters */
        public final C0191 m3169() {
            return this.state;
        }

        @JvmName(name = "Ι")
        /* renamed from: Ι  reason: contains not printable characters */
        public final boolean m3168() {
            return this.state == C0191.PARKING;
        }

        @JvmName(name = "ɹ")
        /* renamed from: ɹ  reason: contains not printable characters */
        public final boolean m3167() {
            return this.state == C0191.BLOCKING;
        }

        @JvmName(name = "ι")
        /* renamed from: ι  reason: contains not printable characters */
        public final void m3170(Object obj) {
            this.nextParkedWorker = obj;
        }

        @JvmName(name = "і")
        /* renamed from: і  reason: contains not printable characters */
        public final Object m3173() {
            return this.nextParkedWorker;
        }

        /* renamed from: Ӏ  reason: contains not printable characters */
        public final boolean m3174() {
            int i = this.terminationState;
            if (i == 1 || i == -1) {
                return false;
            }
            if (i == 0) {
                return f2501.compareAndSet(this, 0, -1);
            }
            throw new IllegalStateException(("Invalid terminationState = " + i).toString());
        }

        /* renamed from: І  reason: contains not printable characters */
        public final boolean m3172() {
            if (this.state == C0191.CPU_ACQUIRED) {
                return true;
            }
            if (!C3521jp.this.f2494.tryAcquire()) {
                return false;
            }
            this.state = C0191.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final boolean m3171(C0191 r4) {
            fM.m2254(r4, "");
            C0191 r0 = this.state;
            boolean z = r0 == C0191.CPU_ACQUIRED;
            if (z) {
                C3521jp.this.f2494.release();
            }
            if (r0 != r4) {
                this.state = r4;
            }
            return z;
        }

        public final void run() {
            boolean z = false;
            while (!C3521jp.this.m3146() && this.state != C0191.TERMINATED) {
                C3528jx r2 = m3164();
                if (r2 == null) {
                    if (this.state == C0191.CPU_ACQUIRED) {
                        m3155();
                    } else {
                        m3154();
                    }
                    z = true;
                } else {
                    C3530jz r3 = r2.m3190();
                    if (z) {
                        m3152(r3);
                        z = false;
                    }
                    m3157(r3, r2.f2532);
                    C3521jp.this.m3120(r2);
                    m3150(r3);
                }
            }
            m3171(C0191.TERMINATED);
        }

        /* renamed from: ι  reason: contains not printable characters */
        private final void m3157(C3530jz jzVar, long j) {
            if (jzVar != C3530jz.NON_BLOCKING) {
                C3521jp.f2486.addAndGet(C3521jp.this, 2097152);
                if (m3171(C0191.BLOCKING)) {
                    C3521jp.this.m3132();
                }
            } else if (C3521jp.this.f2494.availablePermits() != 0) {
                long r0 = jB.f2399.m2820();
                if (r0 - j >= jB.f2394 && r0 - this.f2502 >= jB.f2394 * ((long) 5)) {
                    this.f2502 = r0;
                    C3521jp.this.m3132();
                }
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        private final void m3150(C3530jz jzVar) {
            if (jzVar != C3530jz.NON_BLOCKING) {
                C3521jp.f2486.addAndGet(C3521jp.this, -2097152);
                C0191 r4 = this.state;
                if (r4 != C0191.TERMINATED) {
                    if (hA.m2423()) {
                        if (!(r4 == C0191.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.state = C0191.RETIRING;
                }
            }
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final int m3160(int i) {
            int i2 = this.f2503;
            this.f2503 = i2 ^ (i2 << 13);
            int i3 = this.f2503;
            this.f2503 = i3 ^ (i3 >> 17);
            int i4 = this.f2503;
            this.f2503 = i4 ^ (i4 << 5);
            int i5 = i - 1;
            if ((i5 & i) == 0) {
                return this.f2503 & i5;
            }
            return (this.f2503 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: ɾ  reason: contains not printable characters */
        private final void m3155() {
            int i = this.spins;
            if (i <= C3521jp.f2492) {
                this.spins = i + 1;
                if (i >= C3521jp.f2487) {
                    Thread.yield();
                    return;
                }
                return;
            }
            if (this.f2507 < C3521jp.f2489) {
                this.f2507 = C3435gj.m2408((this.f2507 * 3) >>> 1, C3521jp.f2489);
            }
            m3171(C0191.PARKING);
            m3153((long) this.f2507);
        }

        /* renamed from: ɪ  reason: contains not printable characters */
        private final void m3154() {
            m3171(C0191.PARKING);
            if (m3159()) {
                this.terminationState = 0;
                if (this.f2504 == 0) {
                    this.f2504 = System.nanoTime() + C3521jp.this.f2493;
                }
                if (m3153(C3521jp.this.f2493) && System.nanoTime() - this.f2504 >= 0) {
                    this.f2504 = 0;
                    m3151();
                }
            }
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private final boolean m3153(long j) {
            C3521jp.this.m3138(this);
            if (!m3159()) {
                return false;
            }
            LockSupport.parkNanos(j);
            return true;
        }

        /* renamed from: ɨ  reason: contains not printable characters */
        private final void m3151() {
            synchronized (C3521jp.this.f2500) {
                if (!C3521jp.this.m3146()) {
                    if (C3521jp.this.m3121() > C3521jp.this.f2499) {
                        if (m3159()) {
                            if (f2501.compareAndSet(this, 0, 1)) {
                                int i = this.indexInArray;
                                m3166(0);
                                C3521jp.this.m3119(this, i, 0);
                                int andDecrement = (int) (C3521jp.f2486.getAndDecrement(C3521jp.this) & 2097151);
                                if (andDecrement != i) {
                                    If ifR = C3521jp.this.f2500[andDecrement];
                                    if (ifR == null) {
                                        fM.m2256();
                                    }
                                    C3521jp.this.f2500[i] = ifR;
                                    ifR.m3166(i);
                                    C3521jp.this.m3119(ifR, andDecrement, i);
                                }
                                C3521jp.this.f2500[andDecrement] = null;
                                dF dFVar = dF.f2032;
                                this.state = C0191.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: ӏ  reason: contains not printable characters */
        private final boolean m3159() {
            C3528jx r0 = C3521jp.this.f2497.m3186(C3530jz.PROBABLY_BLOCKING);
            if (r0 == null) {
                return true;
            }
            this.f2505.m2833(r0, C3521jp.this.f2497);
            return false;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        private final void m3152(C3530jz jzVar) {
            this.f2504 = 0;
            this.f2508 = 0;
            if (this.state == C0191.PARKING) {
                if (hA.m2423()) {
                    if (!(jzVar == C3530jz.PROBABLY_BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.state = C0191.BLOCKING;
                this.f2507 = C3521jp.f2490;
            }
            this.spins = 0;
        }

        /* renamed from: Ɩ  reason: contains not printable characters */
        public final void m3162() {
            this.f2507 = C3521jp.f2490;
            this.spins = 0;
        }

        /* renamed from: ȷ  reason: contains not printable characters */
        public final C3528jx m3164() {
            if (m3172()) {
                return m3156();
            }
            C3528jx r0 = this.f2505.m2831();
            return r0 != null ? r0 : C3521jp.this.f2497.m3186(C3530jz.PROBABLY_BLOCKING);
        }

        /* renamed from: ɿ  reason: contains not printable characters */
        private final C3528jx m3156() {
            C3528jx jxVar;
            C3528jx r1;
            boolean z = m3160(C3521jp.this.f2499 * 2) == 0;
            if (z && (r1 = C3521jp.this.f2497.m3186(C3530jz.NON_BLOCKING)) != null) {
                return r1;
            }
            C3528jx r12 = this.f2505.m2831();
            if (r12 != null) {
                return r12;
            }
            if (z || (jxVar = (C3528jx) C3521jp.this.f2497.m2654()) == null) {
                return m3158();
            }
            return jxVar;
        }

        /* renamed from: г  reason: contains not printable characters */
        private final C3528jx m3158() {
            int r0 = C3521jp.this.m3121();
            if (r0 < 2) {
                return null;
            }
            int i = this.f2508;
            if (i == 0) {
                i = m3160(r0);
            }
            int i2 = i + 1;
            if (i2 > r0) {
                i2 = 1;
            }
            this.f2508 = i2;
            If ifR = C3521jp.this.f2500[i2];
            if (ifR == null || ifR == this || !this.f2505.m2829(ifR.f2505, C3521jp.this.f2497)) {
                return null;
            }
            return this.f2505.m2831();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m3119(If ifR, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            int r0 = i3 == i ? i2 == 0 ? m3123(ifR) : i2 : i3;
            if (r0 >= 0) {
                if (f2484.compareAndSet(this, j, j2 | ((long) r0))) {
                    return;
                }
            }
        }
    }

    /* renamed from: і  reason: contains not printable characters */
    private final If m3144() {
        while (true) {
            long j = this.parkedWorkersStack;
            If ifR = this.f2500[(int) (2097151 & j)];
            if (ifR == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int r4 = m3123(ifR);
            if (r4 >= 0) {
                if (f2484.compareAndSet(this, j, ((long) r4) | j2)) {
                    ifR.m3170((Object) f2491);
                    return ifR;
                }
            }
        }
    }
}
