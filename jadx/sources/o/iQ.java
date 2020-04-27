package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b%\u0010\u0018J\u0019\u0010\u000b\u001a\u00020\u00012\n\u0010\u000f\u001a\u00060\u0000j\u0002`\b¢\u0006\u0004\b\u000b\u0010\u0010J-\u0010\u0005\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\b2\n\u0010\u000f\u001a\u00060\u0000j\u0002`\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0005\u0010\u0013J\u0013\u0010\u0014\u001a\u00060\u0000j\u0002`\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00152\n\u0010\u000f\u001a\u00060\u0000j\u0002`\bH\u0002¢\u0006\u0004\b\u0005\u0010\u0016J\u001b\u0010\u0007\u001a\u00020\u00152\n\u0010\u000f\u001a\u00060\u0000j\u0002`\bH\u0002¢\u0006\u0004\b\u0007\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00060\u0000j\u0002`\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010\u0005\u001a\u00020#2\n\u0010\u000f\u001a\u00060\u0000j\u0002`\b2\n\u0010\u0012\u001a\u00060\u0000j\u0002`\b2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b\u0005\u0010$R\u0013\u0010\u0002\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u00020\u00048G@\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00060\u0000j\u0002`\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u00020\u00048G@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u000e\u001a\u00060\u0000j\u0002`\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\n"}, d2 = {"Lo/iQ;", "", "ı", "()Z", "", "Ι", "()Ljava/lang/Object;", "ɩ", "Lo/ǃ;", "Ӏ", "()Lo/iQ;", "ǃ", "Ɩ", "і", "ι", "p0", "(Lo/iQ;)Z", "Lo/iV;", "p1", "(Lo/iQ;Lo/iV;)Lo/iQ;", "ӏ", "", "(Lo/iQ;)V", "ɹ", "()V", "ɪ", "P_", "Lo/iZ;", "І", "()Lo/iZ;", "", "toString", "()Ljava/lang/String;", "Lo/iQ$ɩ;", "p2", "", "(Lo/iQ;Lo/iQ;Lo/iQ$ɩ;)I", "<init>"}, k = 1, mv = {1, 1, 15})
public class iQ {

    /* renamed from: ǃ  reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f2346;

    /* renamed from: ɩ  reason: contains not printable characters */
    static final AtomicReferenceFieldUpdater f2347;

    /* renamed from: ι  reason: contains not printable characters */
    static final AtomicReferenceFieldUpdater f2348;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    static {
        Class<iQ> cls = iQ.class;
        f2348 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f2347 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_prev");
        f2346 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_removedRef");
    }

    /* renamed from: І  reason: contains not printable characters */
    private final iZ m2637() {
        iZ iZVar = (iZ) this._removedRef;
        if (iZVar != null) {
            return iZVar;
        }
        iZ iZVar2 = new iZ(this);
        f2346.lazySet(this, iZVar2);
        return iZVar2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b \u0018\u00002\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u000fB\u0013\u0012\n\u0010\b\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0001j\u0002`\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0003\u0010\fR\u0017\u0010\u0005\u001a\u00060\u0001j\u0002`\u00028\u0006@\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004"}, d2 = {"Lo/iQ$ɩ;", "Lo/iQ;", "Lo/ǃ;", "ι", "Lo/iQ;", "ǃ", "ı", "ɩ", "p0", "", "p1", "", "(Lo/iQ;Ljava/lang/Object;)V", "<init>", "(Lo/iQ;)V", "Lo/iK;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.iQ$ɩ  reason: contains not printable characters */
    public static abstract class C0187 extends iK<iQ> {

        /* renamed from: ı  reason: contains not printable characters */
        public iQ f2350;

        /* renamed from: ι  reason: contains not printable characters */
        public final iQ f2351;

        public C0187(iQ iQVar) {
            fM.m2254(iQVar, "");
            this.f2351 = iQVar;
        }

        /* renamed from: ι  reason: contains not printable characters */
        public void m2649(iQ iQVar, Object obj) {
            fM.m2254(iQVar, "");
            boolean z = obj == null;
            iQ iQVar2 = z ? this.f2351 : this.f2350;
            if (iQVar2 != null && iQ.f2348.compareAndSet(iQVar, this, iQVar2) && z) {
                iQ iQVar3 = this.f2351;
                iQ iQVar4 = this.f2350;
                if (iQVar4 == null) {
                    fM.m2256();
                }
                iQVar3.m2635(iQVar4);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\u0007J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/iQ$ǃ;", "Lo/iQ;", "Lo/ǃ;", "p0", "", "Ι", "(Lo/iQ;)Ljava/lang/Object;", "Lo/iQ$ɩ;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.iQ$ǃ  reason: contains not printable characters */
    public static final class C0186 extends C0187 {

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ C3409fk f2349;

        /* renamed from: Ι  reason: contains not printable characters */
        public final Object m2647(iQ iQVar) {
            fM.m2254(iQVar, "");
            if (((Boolean) this.f2349.invoke()).booleanValue()) {
                return null;
            }
            return iT.m2655();
        }
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m2639() {
        return m2644() instanceof iZ;
    }

    @JvmName(name = "Ӏ")
    /* renamed from: Ӏ  reason: contains not printable characters */
    public final iQ m2646() {
        return iT.m2656(m2644());
    }

    @JvmName(name = "і")
    /* renamed from: і  reason: contains not printable characters */
    public final iQ m2645() {
        return iT.m2656(m2640());
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final boolean m2641(iQ iQVar) {
        fM.m2254(iQVar, "");
        f2347.lazySet(iQVar, this);
        f2348.lazySet(iQVar, this);
        while (m2644() == this) {
            if (f2348.compareAndSet(this, this, iQVar)) {
                iQVar.m2635(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final int m2643(iQ iQVar, iQ iQVar2, C0187 r4) {
        fM.m2254(iQVar, "");
        fM.m2254(iQVar2, "");
        fM.m2254(r4, "");
        f2347.lazySet(iQVar, this);
        f2348.lazySet(iQVar, iQVar2);
        r4.f2350 = iQVar2;
        if (!f2348.compareAndSet(this, iQVar2, r4)) {
            return 0;
        }
        return r4.m2589(this) == null ? 1 : 2;
    }

    public boolean P_() {
        Object r0;
        iQ iQVar;
        do {
            r0 = m2644();
            if ((r0 instanceof iZ) || r0 == this) {
                return false;
            }
            if (r0 != null) {
                iQVar = (iQ) r0;
            } else {
                throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f2348.compareAndSet(this, r0, iQVar.m2637()));
        m2632(iQVar);
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final void m2632(iQ iQVar) {
        m2642();
        iQVar.m2634(iT.m2656(this._prev), (iV) null);
    }

    /* renamed from: ӏ  reason: contains not printable characters */
    private final iQ m2638() {
        iQ iQVar = this;
        iQ iQVar2 = iQVar;
        while (!(iQVar2 instanceof iR)) {
            iQVar2 = iQVar2.m2646();
            if (hA.m2423()) {
                if (!(iQVar2 != iQVar)) {
                    throw new AssertionError();
                }
            }
        }
        return iQVar2;
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m2642() {
        Object r4;
        iQ iQVar = null;
        iQ r1 = m2633();
        Object obj = this._next;
        if (obj != null) {
            iQ iQVar2 = ((iZ) obj).f2362;
            while (true) {
                iQ iQVar3 = iQVar;
                while (true) {
                    Object r42 = iQVar2.m2644();
                    if (r42 instanceof iZ) {
                        iQVar2.m2633();
                        iQVar2 = ((iZ) r42).f2362;
                    } else {
                        r4 = r1.m2644();
                        if (r4 instanceof iZ) {
                            if (iQVar3 != null) {
                                break;
                            }
                            r1 = iT.m2656(r1._prev);
                        } else if (r4 != this) {
                            if (r4 != null) {
                                iQ iQVar4 = (iQ) r4;
                                if (iQVar4 != iQVar2) {
                                    iQ iQVar5 = iQVar4;
                                    iQVar3 = r1;
                                    r1 = iQVar5;
                                } else {
                                    return;
                                }
                            } else {
                                throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (f2348.compareAndSet(r1, this, iQVar2)) {
                            return;
                        }
                    }
                }
                r1.m2633();
                f2348.compareAndSet(iQVar3, r1, ((iZ) r4).f2362);
                r1 = iQVar3;
            }
        } else {
            throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final iQ m2634(iQ iQVar, iV iVVar) {
        Object obj;
        iQ iQVar2 = null;
        while (true) {
            iQ iQVar3 = iQVar2;
            while (true) {
                obj = iQVar._next;
                if (obj == iVVar) {
                    return iQVar;
                }
                if (obj instanceof iV) {
                    ((iV) obj).m2661(iQVar);
                } else if (!(obj instanceof iZ)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof iZ) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            iQVar3 = iQVar;
                            iQVar = (iQ) obj;
                        } else {
                            throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == iQVar) {
                        return null;
                    } else {
                        if (f2347.compareAndSet(this, obj2, iQVar) && !(iQVar._prev instanceof iZ)) {
                            return null;
                        }
                    }
                } else if (iQVar3 != null) {
                    break;
                } else {
                    iQVar = iT.m2656(iQVar._prev);
                }
            }
            iQVar.m2633();
            f2348.compareAndSet(iQVar3, iQVar, ((iZ) obj).f2362);
            iQVar = iQVar3;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    @JvmName(name = "Ι")
    /* renamed from: Ι  reason: contains not printable characters */
    public final Object m2644() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof iV)) {
                return obj;
            }
            ((iV) obj).m2661(this);
        }
    }

    @JvmName(name = "Ɩ")
    /* renamed from: Ɩ  reason: contains not printable characters */
    public final Object m2640() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof iZ) {
                return obj;
            }
            if (obj != null) {
                iQ iQVar = (iQ) obj;
                if (iQVar.m2644() == this) {
                    return obj;
                }
                m2634(iQVar, (iV) null);
            } else {
                throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2635(iQ iQVar) {
        Object obj;
        do {
            obj = iQVar._prev;
            if ((obj instanceof iZ) || m2644() != iQVar) {
                return;
            }
        } while (!f2347.compareAndSet(iQVar, obj, this));
        if (!(m2644() instanceof iZ)) {
            return;
        }
        if (obj != null) {
            iQVar.m2634((iQ) obj, (iV) null);
            return;
        }
        throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: ɪ  reason: contains not printable characters */
    private final iQ m2633() {
        Object obj;
        iQ iQVar;
        do {
            obj = this._prev;
            if (obj instanceof iZ) {
                return ((iZ) obj).f2362;
            }
            if (obj == this) {
                iQVar = m2638();
            } else if (obj != null) {
                iQVar = (iQ) obj;
            } else {
                throw new dA("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f2347.compareAndSet(this, obj, iQVar.m2637()));
        return (iQ) obj;
    }
}
