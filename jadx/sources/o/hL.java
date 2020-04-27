package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u00020#2\u00020$:\u0002!\u0004B\u0007¢\u0006\u0004\b\"\u0010\fJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0013\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0004\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0004\u0010\u0016J\u001b\u0010\u0006\u001a\u00020\u00012\n\u0010\u0012\u001a\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\tJ\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\fJ\u000f\u0010\u001a\u001a\u00020\nH\u0004¢\u0006\u0004\b\u001a\u0010\fJ\u001d\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u001b¢\u0006\u0004\b\u0004\u0010\u001cJ\u001f\u0010\b\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\b\u0010\u001eJ\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\b\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010\fR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018U@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00078U@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/hL;", "", "isCompleted", "Z", "ǃ", "()Z", "ı", "", "ɩ", "()J", "", "ӏ", "()V", "Ljava/lang/Runnable;", "Lo/ɩ;", "ɾ", "()Ljava/lang/Runnable;", "Lo/ex;", "p0", "p1", "Ι", "(Lo/ex;Ljava/lang/Runnable;)V", "(Ljava/lang/Runnable;)V", "(Ljava/lang/Runnable;)Z", "ι", "ɨ", "Ɩ", "Lo/hL$if;", "(JLo/hL$if;)V", "", "(JLo/hL$if;)I", "(Lo/hL$if;)Z", "ɹ", "if", "<init>", "Lo/hN;", "Lo/hD;"}, k = 1, mv = {1, 1, 15})
public abstract class hL extends hN implements hD {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f2265;

    /* renamed from: Ι  reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f2266;
    private volatile Object _delayed = null;
    private volatile Object _queue = null;
    /* access modifiers changed from: private */
    public volatile boolean isCompleted;

    static {
        Class<hL> cls = hL.class;
        f2265 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_queue");
        f2266 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_delayed");
    }

    /* access modifiers changed from: protected */
    @JvmName(name = "ǃ")
    /* renamed from: ǃ  reason: contains not printable characters */
    public boolean m2467() {
        if (!m2489()) {
            return false;
        }
        C0182 r0 = (C0182) this._delayed;
        if (r0 != null && !r0.m3106()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof iP) {
                return ((iP) obj).m2626();
            }
            if (obj == hQ.f2275) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @JvmName(name = "ɩ")
    /* renamed from: ɩ  reason: contains not printable characters */
    public long m2468() {
        Cif ifVar;
        if (super.m2484() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof iP) {
                if (!((iP) obj).m2626()) {
                    return 0;
                }
            } else if (obj == hQ.f2275) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C0182 r0 = (C0182) this._delayed;
        if (r0 == null || (ifVar = (Cif) r0.m3104()) == null) {
            return Long.MAX_VALUE;
        }
        long j = ifVar.f2267;
        C3500iv r4 = C3499iu.m2796();
        return C3435gj.m2406(j - (r4 != null ? r4.m2804() : System.nanoTime()), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɹ  reason: contains not printable characters */
    public void m2469() {
        C3501iw.f2385.m2805();
        this.isCompleted = true;
        m2463();
        do {
        } while (m2471() <= 0);
        m2458();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0057  */
    /* renamed from: ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m2471() {
        /*
            r7 = this;
            boolean r0 = r7.m2487()
            if (r0 == 0) goto L_0x000b
            long r0 = r7.m2468()
            return r0
        L_0x000b:
            java.lang.Object r0 = r7._delayed
            o.hL$ǃ r0 = (o.hL.C0182) r0
            if (r0 == 0) goto L_0x0051
            boolean r1 = r0.m3106()
            if (r1 != 0) goto L_0x0051
            o.iv r1 = o.C3499iu.m2796()
            if (r1 == 0) goto L_0x0022
            long r1 = r1.m2804()
            goto L_0x0026
        L_0x0022:
            long r1 = java.lang.System.nanoTime()
        L_0x0026:
            monitor-enter(r0)
            o.jk r3 = r0.m3107()     // Catch:{ all -> 0x004e }
            r4 = 0
            if (r3 == 0) goto L_0x0048
            o.hL$if r3 = (o.hL.Cif) r3     // Catch:{ all -> 0x004e }
            boolean r5 = r3.m2473(r1)     // Catch:{ all -> 0x004e }
            r6 = 0
            if (r5 == 0) goto L_0x003e
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r7.m2457(r3)     // Catch:{ all -> 0x004e }
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            if (r3 == 0) goto L_0x0046
            o.jk r3 = r0.m3108(r6)     // Catch:{ all -> 0x004e }
            r4 = r3
        L_0x0046:
            monitor-exit(r0)
            goto L_0x0049
        L_0x0048:
            monitor-exit(r0)
        L_0x0049:
            o.hL$if r4 = (o.hL.Cif) r4
            if (r4 == 0) goto L_0x0051
            goto L_0x0026
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0051:
            java.lang.Runnable r0 = r7.m2461()
            if (r0 == 0) goto L_0x005a
            r0.run()
        L_0x005a:
            long r0 = r7.m2468()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hL.m2471():long");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2470(C3396ex exVar, Runnable runnable) {
        fM.m2254(exVar, "");
        fM.m2254(runnable, "");
        m2466(runnable);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m2466(Runnable runnable) {
        fM.m2254(runnable, "");
        if (m2457(runnable)) {
            m2478();
        } else {
            hC.f2251.m2466(runnable);
        }
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    private final void m2463() {
        if (!hA.m2423() || this.isCompleted) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f2265.compareAndSet(this, (Object) null, hQ.f2275)) {
                        return;
                    }
                } else if (obj instanceof iP) {
                    ((iP) obj).m2622();
                    return;
                } else if (obj != hQ.f2275) {
                    iP iPVar = new iP(8, true);
                    iPVar.m2624((Runnable) obj);
                    if (f2265.compareAndSet(this, obj, iPVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m2465(long j, Cif ifVar) {
        fM.m2254(ifVar, "");
        int r0 = m2459(j, ifVar);
        if (r0 != 0) {
            if (r0 == 1) {
                m2477(j, ifVar);
            } else if (r0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m2460(ifVar)) {
            m2478();
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m2460(Cif ifVar) {
        C0182 r0 = (C0182) this._delayed;
        return (r0 != null ? (Cif) r0.m3104() : null) == ifVar;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int m2459(long j, Cif ifVar) {
        if (this.isCompleted) {
            return 1;
        }
        C0182 r0 = (C0182) this._delayed;
        if (r0 == null) {
            hL hLVar = this;
            f2266.compareAndSet(hLVar, (Object) null, new C0182(j));
            Object obj = hLVar._delayed;
            if (obj == null) {
                fM.m2256();
            }
            r0 = (C0182) obj;
        }
        return ifVar.m2472(j, r0, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final void m2464() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: ɨ  reason: contains not printable characters */
    private final void m2458() {
        Cif ifVar;
        C3500iv r0 = C3499iu.m2796();
        long r02 = r0 != null ? r0.m2804() : System.nanoTime();
        while (true) {
            C0182 r2 = (C0182) this._delayed;
            if (r2 != null && (ifVar = (Cif) r2.m3103()) != null) {
                m2477(r02, ifVar);
            } else {
                return;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u00060\u0014j\u0002`\u00152\b\u0012\u0004\u0012\u00020\u00000\u00162\u00020\u00172\u00020\u0018J%\u0010\u0005\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/hL$if;", "", "ι", "Ljava/lang/Object;", "", "ı", "J", "ǃ", "p0", "Lo/hL$ǃ;", "p1", "Lo/hL;", "p2", "", "(JLo/hL$ǃ;Lo/hL;)I", "", "(J)Z", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Runnable;", "Lo/ɩ;", "", "Lo/hK;", "Lo/jk;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.hL$if  reason: invalid class name */
    public static abstract class Cif implements Runnable, Comparable<Cif>, hK, C3516jk {

        /* renamed from: ı  reason: contains not printable characters */
        public long f2267;

        /* renamed from: ι  reason: contains not printable characters */
        private Object f2268;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final boolean m2473(long j) {
            return j - this.f2267 >= 0;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final synchronized int m2472(long j, C0182 r11, hL hLVar) {
            fM.m2254(r11, "");
            fM.m2254(hLVar, "");
            if (this.f2268 == hQ.f2274) {
                return 2;
            }
            C3516jk jkVar = this;
            synchronized (r11) {
                Cif ifVar = (Cif) r11.m3107();
                if (hLVar.isCompleted) {
                    return 1;
                }
                if (ifVar == null) {
                    r11.f2269 = j;
                } else {
                    long j2 = ifVar.f2267;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - r11.f2269 > 0) {
                        r11.f2269 = j;
                    }
                }
                if (this.f2267 - r11.f2269 < 0) {
                    this.f2267 = r11.f2269;
                }
                r11.m3105(jkVar);
                return 0;
            }
        }

        public String toString() {
            return "Delayed[nanos=" + this.f2267 + ']';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\t0\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/hL$ǃ;", "", "ι", "J", "ǃ", "p0", "<init>", "(J)V", "Lo/jm;", "Lo/hL$if;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.hL$ǃ  reason: contains not printable characters */
    public static final class C0182 extends C3518jm<Cif> {

        /* renamed from: ι  reason: contains not printable characters */
        public long f2269;

        public C0182(long j) {
            this.f2269 = j;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final boolean m2457(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f2265.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof iP) {
                iP iPVar = (iP) obj;
                int r4 = iPVar.m2624(runnable);
                if (r4 == 0) {
                    return true;
                }
                if (r4 == 1) {
                    f2265.compareAndSet(this, obj, iPVar.m2623());
                } else if (r4 == 2) {
                    return false;
                }
            } else if (obj == hQ.f2275) {
                return false;
            } else {
                iP iPVar2 = new iP(8, true);
                iPVar2.m2624((Runnable) obj);
                iPVar2.m2624(runnable);
                if (f2265.compareAndSet(this, obj, iPVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: ɾ  reason: contains not printable characters */
    private final Runnable m2461() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof iP) {
                iP iPVar = (iP) obj;
                Object r2 = iPVar.m2625();
                if (r2 != iP.f2338) {
                    return (Runnable) r2;
                }
                f2265.compareAndSet(this, obj, iPVar.m2623());
            } else if (obj == hQ.f2275) {
                return null;
            } else {
                if (f2265.compareAndSet(this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }
}
