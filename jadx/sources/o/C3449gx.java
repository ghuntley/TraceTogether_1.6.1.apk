package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\f2\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR,\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00020\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/gx;", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/gB;", "ǃ", "Ljava/util/concurrent/atomic/AtomicReference;", "ı", "", "ι", "()Ljava/util/Iterator;", "p0", "<init>", "(Lo/gB;)V", "T"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.gx  reason: case insensitive filesystem */
public final class C3449gx<T> implements gB<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final AtomicReference<gB<T>> f2237;

    public C3449gx(gB<? extends T> gBVar) {
        fM.m2254(gBVar, "");
        this.f2237 = new AtomicReference<>(gBVar);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Iterator<T> m2419() {
        gB andSet = this.f2237.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.m2305();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
