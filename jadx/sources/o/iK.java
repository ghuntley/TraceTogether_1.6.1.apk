package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0010 \u00002\u00020\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\f"}, d2 = {"Lo/iK;", "p0", "", "p1", "", "ɩ", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Ι", "(Ljava/lang/Object;)Ljava/lang/Object;", "ι", "ǃ", "", "(Ljava/lang/Object;)Z", "<init>", "()V", "Lo/iV;", "T"}, k = 1, mv = {1, 1, 15})
public abstract class iK<T> extends iV {

    /* renamed from: ι  reason: contains not printable characters */
    private static final AtomicReferenceFieldUpdater f2325 = AtomicReferenceFieldUpdater.newUpdater(iK.class, Object.class, "_consensus");
    private volatile Object _consensus = iG.f2312;

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract Object m2586(T t);

    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m2587(T t, Object obj);

    /* renamed from: ɩ  reason: contains not printable characters */
    public final boolean m2588(Object obj) {
        if (hA.m2423()) {
            if (!(obj != iG.f2312)) {
                throw new AssertionError();
            }
        }
        return f2325.compareAndSet(this, iG.f2312, obj);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private final Object m2585(Object obj) {
        return m2588(obj) ? obj : this._consensus;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Object m2589(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == iG.f2312) {
            obj2 = m2585(m2586(obj));
        }
        m2587(obj, obj2);
        return obj2;
    }
}
