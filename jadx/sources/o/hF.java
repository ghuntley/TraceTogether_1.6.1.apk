package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0016 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0015B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0011\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00018Q@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/hF;", "", "і", "()I", "ı", "", "p0", "p1", "", "ι", "(Ljava/lang/Object;I)V", "ɹ", "()Ljava/lang/Object;", "", "г", "()Z", "ɿ", "Lo/ex;", "Lo/er;", "<init>", "(Lo/ex;Lo/er;)V", "Lo/jc;", "T"}, k = 1, mv = {1, 1, 15})
final class hF<T> extends C3508jc<T> {

    /* renamed from: Ι  reason: contains not printable characters */
    private static final AtomicIntegerFieldUpdater f2257 = AtomicIntegerFieldUpdater.newUpdater(hF.class, "_decision");
    private volatile int _decision = 0;

    @JvmName(name = "і")
    /* renamed from: і  reason: contains not printable characters */
    public final int m2444() {
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hF(C3396ex exVar, C3390er<? super T> erVar) {
        super(exVar, erVar);
        fM.m2254(exVar, "");
        fM.m2254(erVar, "");
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m2443(Object obj, int i) {
        if (!m2441()) {
            super.m3067(obj, i);
        }
    }

    /* renamed from: ɹ  reason: contains not printable characters */
    public final Object m2442() {
        if (m2440()) {
            return eF.m2136();
        }
        Object r0 = C3490il.m2784(m2741());
        if (!(r0 instanceof C3463hk)) {
            return r0;
        }
        throw ((C3463hk) r0).f2291;
    }

    /* renamed from: ɿ  reason: contains not printable characters */
    private final boolean m2440() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f2257.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: г  reason: contains not printable characters */
    private final boolean m2441() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f2257.compareAndSet(this, 0, 2));
        return true;
    }
}
