package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0001*\b\b\u0000\u0010\u001e*\u00020\u00192\u00020\u0019:\u0002\u0001\bB\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u0010J'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00122\u0006\u0010\u000f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\b\u0010\u0013J'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00122\u0006\u0010\u000f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\r\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0007J3\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u000e\u0010\u0018J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\f\u0010\u001aJ3\u0010\f\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0013\u0010\b\u001a\u00020\u00068G@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000e\u001a\u00020\u00028G@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\r"}, d2 = {"Lo/iP;", "if", "", "Ɩ", "I", "Ι", "", "()Z", "ı", "ι", "Ӏ", "Z", "ɩ", "()I", "ǃ", "p0", "(Ljava/lang/Object;)I", "", "Lo/Ι;", "(J)Lo/iP;", "p1", "(ILjava/lang/Object;)Lo/iP;", "і", "()J", "()Lo/iP;", "", "()Ljava/lang/Object;", "(II)Lo/iP;", "<init>", "(IZ)V", "E"}, k = 1, mv = {1, 1, 15})
public final class iP<E> {

    /* renamed from: if  reason: not valid java name */
    public static final Cif f2337if = new Cif((fL) null);

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final C3506ja f2338 = new C3506ja("REMOVE_FROZEN");

    /* renamed from: ɩ  reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f2339;

    /* renamed from: І  reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f2340;
    private volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final int f2341;

    /* renamed from: Ɩ  reason: contains not printable characters */
    private final int f2342;

    /* renamed from: ι  reason: contains not printable characters */
    public /* synthetic */ AtomicReferenceArray f2343;
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final boolean f2344;

    public iP(int i, boolean z) {
        this.f2342 = i;
        this.f2344 = z;
        int i2 = this.f2342;
        this.f2341 = i2 - 1;
        this.f2343 = new AtomicReferenceArray(i2);
        boolean z2 = false;
        if (this.f2341 <= 1073741823) {
            if (!((this.f2342 & this.f2341) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2626() {
        Cif ifVar = f2337if;
        long j = this._state$internal;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final int m2627() {
        Cif ifVar = f2337if;
        long j = this._state$internal;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final iP<E> m2615(int i, E e) {
        Object obj = this.f2343.get(this.f2341 & i);
        if (!(obj instanceof C0185) || ((C0185) obj).f2345 != i) {
            return null;
        }
        this.f2343.set(i & this.f2341, e);
        return this;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final iP<E> m2623() {
        return m2616(m2621());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private final iP<E> m2614(long j) {
        iP<E> iPVar = new iP<>(this.f2342 * 2, this.f2344);
        Cif ifVar = f2337if;
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f2341;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f2343.get(i3 & i);
                if (obj == null) {
                    obj = new C0185(i);
                }
                iPVar.f2343.set(iPVar.f2341 & i, obj);
                i++;
            } else {
                iPVar._state$internal = f2337if.m2631(j, 1152921504606846976L);
                return iPVar;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/iP$ı;", "", "ι", "I", "Ι", "p0", "<init>", "(I)V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.iP$ı  reason: contains not printable characters */
    public static final class C0185 {

        /* renamed from: ι  reason: contains not printable characters */
        public final int f2345;

        public C0185(int i) {
            this.f2345 = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0007\u001a\u00020\u0005*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0002\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\nJ\u0019\u0010\u0004\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0004\u0010\nJ\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0007\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u00018\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/iP$if;", "Lo/ja;", "ǃ", "Lo/ja;", "ı", "", "", "Ι", "(J)I", "p0", "(JI)J", "(JJ)J", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.iP$if  reason: invalid class name */
    public static final class Cif {
        /* renamed from: Ι  reason: contains not printable characters */
        public final int m2630(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final long m2631(long j, long j2) {
            return j & (~j2);
        }

        private Cif() {
        }

        public /* synthetic */ Cif(fL fLVar) {
            this();
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final long m2629(long j, int i) {
            return m2631(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final long m2628(long j, int i) {
            return m2631(j, 1152921503533105152L) | (((long) i) << 30);
        }
    }

    static {
        Class<iP> cls = iP.class;
        f2340 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f2339 = AtomicLongFieldUpdater.newUpdater(cls, "_state$internal");
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2622() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f2339.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070 A[LOOP:1: B:20:0x0070->B:23:0x0082, LOOP_START, PHI: r1 
  PHI: (r1v8 o.iP) = (r1v7 o.iP), (r1v10 o.iP) binds: [B:19:0x0066, B:23:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m2624(E r13) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            o.fM.m2254(r13, r0)
        L_0x0005:
            long r3 = r12._state$internal
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r3
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0017
            o.iP$if r13 = f2337if
            int r13 = r13.m2630(r3)
            return r13
        L_0x0017:
            o.iP$if r0 = f2337if
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r3
            r9 = 0
            long r0 = r0 >> r9
            int r1 = (int) r0
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r0 = 30
            long r5 = r5 >> r0
            int r0 = (int) r5
            int r10 = r12.f2341
            int r2 = r0 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0035
            return r6
        L_0x0035:
            boolean r2 = r12.f2344
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0053
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f2343
            r11 = r0 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x0053
            int r2 = r12.f2342
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0052
            int r0 = r0 - r1
            r0 = r0 & r5
            int r1 = r2 >> 1
            if (r0 <= r1) goto L_0x0005
        L_0x0052:
            return r6
        L_0x0053:
            int r1 = r0 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f2339
            o.iP$if r5 = f2337if
            long r5 = r5.m2628(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0005
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.f2343
            r2 = r0 & r10
            r1.set(r2, r13)
            r1 = r12
            o.iP r1 = (o.iP) r1
        L_0x0070:
            long r2 = r1._state$internal
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x007a
            goto L_0x0085
        L_0x007a:
            o.iP r1 = r1.m2623()
            o.iP r1 = r1.m2615(r0, r13)
            if (r1 == 0) goto L_0x0085
            goto L_0x0070
        L_0x0085:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.iP.m2624(java.lang.Object):int");
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object m2625() {
        Object obj;
        while (true) {
            long j = this._state$internal;
            if ((1152921504606846976L & j) == 0) {
                Cif ifVar = f2337if;
                int i = (int) ((1073741823 & j) >> 0);
                if ((this.f2341 & ((int) ((1152921503533105152L & j) >> 30))) != (this.f2341 & i)) {
                    obj = this.f2343.get(this.f2341 & i);
                    if (obj != null) {
                        if (!(obj instanceof C0185)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!f2339.compareAndSet(this, j, f2337if.m2629(j, i2))) {
                                if (this.f2344) {
                                    iP iPVar = this;
                                    do {
                                        iPVar = iPVar.m2617(i, i2);
                                    } while (iPVar != null);
                                    break;
                                }
                            } else {
                                this.f2343.set(this.f2341 & i, (Object) null);
                                break;
                            }
                        } else {
                            return null;
                        }
                    } else if (this.f2344) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return f2338;
            }
        }
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final iP<E> m2617(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            Cif ifVar = f2337if;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (hA.m2423()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return m2623();
            }
        } while (!f2339.compareAndSet(this, j, f2337if.m2629(j, i2)));
        this.f2343.set(this.f2341 & i3, (Object) null);
        return null;
    }

    /* renamed from: і  reason: contains not printable characters */
    private final long m2621() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f2339.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final iP<E> m2616(long j) {
        while (true) {
            iP<E> iPVar = (iP) this._next;
            if (iPVar != null) {
                return iPVar;
            }
            f2340.compareAndSet(this, (Object) null, m2614(j));
        }
    }
}
