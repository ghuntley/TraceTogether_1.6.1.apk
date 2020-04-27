package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import o.iP;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0010*\u00020\u000f2\u00020\u000fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u00020\u00018G@\u0006¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/iS;", "", "ı", "()I", "ǃ", "p0", "", "ɩ", "(Ljava/lang/Object;)Z", "", "()V", "Ι", "()Ljava/lang/Object;", "<init>", "(Z)V", "", "E"}, k = 1, mv = {1, 1, 15})
public class iS<E> {

    /* renamed from: ι  reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2352 = AtomicReferenceFieldUpdater.newUpdater(iS.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal;

    public iS(boolean z) {
        this._cur$internal = new iP(8, z);
    }

    @JvmName(name = "ı")
    /* renamed from: ı  reason: contains not printable characters */
    public final int m2651() {
        return ((iP) this._cur$internal).m2627();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m2652() {
        while (true) {
            iP iPVar = (iP) this._cur$internal;
            if (!iPVar.m2622()) {
                f2352.compareAndSet(this, iPVar, iPVar.m2623());
            } else {
                return;
            }
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m2653(E e) {
        fM.m2254(e, "");
        while (true) {
            iP iPVar = (iP) this._cur$internal;
            int r1 = iPVar.m2624(e);
            if (r1 == 0) {
                return true;
            }
            if (r1 == 1) {
                f2352.compareAndSet(this, iPVar, iPVar.m2623());
            } else if (r1 == 2) {
                return false;
            }
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final E m2654() {
        E e;
        E e2;
        while (true) {
            iP iPVar = (iP) this._cur$internal;
            while (true) {
                long j = iPVar._state$internal;
                e = null;
                if ((1152921504606846976L & j) == 0) {
                    iP.Cif ifVar = iP.f2337if;
                    int i = (int) ((1073741823 & j) >> 0);
                    if ((iPVar.f2341 & ((int) ((1152921503533105152L & j) >> 30))) == (iPVar.f2341 & i)) {
                        break;
                    }
                    e2 = iPVar.f2343.get(iPVar.f2341 & i);
                    if (e2 != null) {
                        if (!(e2 instanceof iP.C0185)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!iP.f2339.compareAndSet(iPVar, j, iP.f2337if.m2629(j, i2))) {
                                if (iPVar.f2344) {
                                    iP iPVar2 = iPVar;
                                    do {
                                        iPVar2 = iPVar2.m2617(i, i2);
                                    } while (iPVar2 != null);
                                    break;
                                }
                            } else {
                                iPVar.f2343.set(iPVar.f2341 & i, (Object) null);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (iPVar.f2344) {
                        break;
                    }
                } else {
                    e = iP.f2338;
                    break;
                }
            }
            e = e2;
            if (e != iP.f2338) {
                return e;
            }
            f2352.compareAndSet(this, iPVar, iPVar.m2623());
        }
    }
}
