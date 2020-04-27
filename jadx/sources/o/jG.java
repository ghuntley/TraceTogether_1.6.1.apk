package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0003\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0003\u0010\u0012J\u0017\u0010\r\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0013J\u000f\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0005\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0014J\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0018R\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00068A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lo/jG;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lo/jx;", "ι", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "ɩ", "", "()I", "ı", "p0", "Lo/ju;", "p1", "", "Ι", "(Lo/jx;Lo/ju;)Z", "ǃ", "", "(Lo/ju;Lo/jx;)V", "(Lo/ju;)V", "()Lo/jx;", "(Lo/jx;)Z", "(Lo/jG;Lo/ju;)Z", "", "p2", "(JLo/jG;Lo/ju;)Z", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
public final class jG {

    /* renamed from: ı  reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f2406;

    /* renamed from: ɩ  reason: contains not printable characters */
    static final AtomicIntegerFieldUpdater f2407;

    /* renamed from: Ι  reason: contains not printable characters */
    static final AtomicIntegerFieldUpdater f2408;
    volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;
    /* access modifiers changed from: private */

    /* renamed from: ι  reason: contains not printable characters */
    public final AtomicReferenceArray<C3528jx> f2409 = new AtomicReferenceArray<>(128);

    static {
        Class<jG> cls = jG.class;
        f2406 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f2407 = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f2408 = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
    }

    @JvmName(name = "ι")
    /* renamed from: ι  reason: contains not printable characters */
    public final int m2834() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3528jx m2831() {
        C3528jx jxVar = (C3528jx) f2406.getAndSet(this, (Object) null);
        if (jxVar != null) {
            return jxVar;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (((C3528jx) this.f2409.get(i2)) != null && f2408.compareAndSet(this, i, i + 1)) {
                return (C3528jx) this.f2409.getAndSet(i2, (Object) null);
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m2833(C3528jx jxVar, C3525ju juVar) {
        fM.m2254(jxVar, "");
        fM.m2254(juVar, "");
        C3528jx jxVar2 = (C3528jx) f2406.getAndSet(this, jxVar);
        if (jxVar2 != null) {
            return m2830(jxVar2, juVar);
        }
        return true;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m2830(C3528jx jxVar, C3525ju juVar) {
        fM.m2254(jxVar, "");
        fM.m2254(juVar, "");
        boolean z = true;
        while (!m2826(jxVar)) {
            m2827(juVar);
            z = false;
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: o.jx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ǃ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m2829(o.jG r19, o.C3525ju r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = ""
            o.fM.m2254(r1, r3)
            o.fM.m2254(r2, r3)
            o.jC r3 = o.jB.f2399
            long r3 = r3.m2820()
            int r5 = r19.m2834()
            if (r5 != 0) goto L_0x001f
            boolean r1 = r0.m2828(r3, r1, r2)
            return r1
        L_0x001f:
            int r5 = r5 / 2
            r6 = 1
            int r5 = o.C3435gj.m2407(r5, r6)
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0029:
            if (r8 >= r5) goto L_0x007a
        L_0x002b:
            int r10 = r1.consumerIndex
            int r11 = r1.producerIndex
            int r11 = r10 - r11
            r12 = 0
            if (r11 != 0) goto L_0x0035
            goto L_0x0071
        L_0x0035:
            r11 = r10 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r19.f2409
            java.lang.Object r13 = r13.get(r11)
            o.jx r13 = (o.C3528jx) r13
            if (r13 == 0) goto L_0x002b
            long r13 = r13.f2532
            long r13 = r3 - r13
            long r15 = o.jB.f2394
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L_0x0058
            int r13 = r19.m2834()
            int r14 = o.jB.f2397
            if (r13 <= r14) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r13 = 0
            goto L_0x0059
        L_0x0058:
            r13 = 1
        L_0x0059:
            if (r13 != 0) goto L_0x005c
            goto L_0x0071
        L_0x005c:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = f2408
            int r14 = r10 + 1
            boolean r10 = r13.compareAndSet(r1, r10, r14)
            if (r10 == 0) goto L_0x002b
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r19.f2409
            java.lang.Object r10 = r10.getAndSet(r11, r12)
            r12 = r10
            o.jx r12 = (o.C3528jx) r12
        L_0x0071:
            if (r12 == 0) goto L_0x007a
            r0.m2833(r12, r2)
            int r8 = r8 + 1
            r9 = 1
            goto L_0x0029
        L_0x007a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jG.m2829(o.jG, o.ju):boolean");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final boolean m2828(long j, jG jGVar, C3525ju juVar) {
        C3528jx jxVar = (C3528jx) jGVar.lastScheduledTask;
        if (jxVar == null || j - jxVar.f2532 < jB.f2394 || !f2406.compareAndSet(jGVar, jxVar, (Object) null)) {
            return false;
        }
        m2833(jxVar, juVar);
        return true;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m2832() {
        return this.lastScheduledTask != null ? m2834() + 1 : m2834();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: o.jx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ι  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2827(o.C3525ju r8) {
        /*
            r7 = this;
            int r0 = r7.m2834()
            int r0 = r0 / 2
            r1 = 1
            int r0 = o.C3435gj.m2407(r0, r1)
            r1 = 0
        L_0x000c:
            if (r1 >= r0) goto L_0x0043
        L_0x000e:
            int r2 = r7.consumerIndex
            int r3 = r7.producerIndex
            int r3 = r2 - r3
            r4 = 0
            if (r3 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            r3 = r2 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r7.f2409
            java.lang.Object r5 = r5.get(r3)
            o.jx r5 = (o.C3528jx) r5
            if (r5 == 0) goto L_0x000e
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = f2408
            int r6 = r2 + 1
            boolean r2 = r5.compareAndSet(r7, r2, r6)
            if (r2 == 0) goto L_0x000e
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r7.f2409
            java.lang.Object r2 = r2.getAndSet(r3, r4)
            r4 = r2
            o.jx r4 = (o.C3528jx) r4
        L_0x003b:
            if (r4 == 0) goto L_0x0043
            r7.m2825((o.C3525ju) r8, (o.C3528jx) r4)
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jG.m2827(o.ju):void");
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final void m2825(C3525ju juVar, C3528jx jxVar) {
        if (!juVar.m2653(jxVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m2835(C3525ju juVar) {
        C3528jx jxVar;
        fM.m2254(juVar, "");
        C3528jx jxVar2 = (C3528jx) f2406.getAndSet(this, (Object) null);
        if (jxVar2 != null) {
            m2825(juVar, jxVar2);
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                jxVar = null;
            } else {
                int i2 = i & 127;
                if (((C3528jx) this.f2409.get(i2)) != null && f2408.compareAndSet(this, i, i + 1)) {
                    jxVar = (C3528jx) this.f2409.getAndSet(i2, (Object) null);
                }
            }
            if (jxVar != null) {
                m2825(juVar, jxVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m2826(C3528jx jxVar) {
        if (m2834() == 127) {
            return false;
        }
        int i = this.producerIndex & 127;
        if (this.f2409.get(i) != null) {
            return false;
        }
        this.f2409.lazySet(i, jxVar);
        f2407.incrementAndGet(this);
        return true;
    }
}
