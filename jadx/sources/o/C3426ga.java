package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0011*\u00020\u00042\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00028\u00000\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\b\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ.\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/ga;", "ɩ", "Ljava/lang/Object;", "ǃ", "", "p0", "Lo/gs;", "p1", "ι", "(Ljava/lang/Object;Lo/gs;)Ljava/lang/Object;", "p2", "", "Ι", "(Ljava/lang/Object;Lo/gs;Ljava/lang/Object;)V", "<init>", "()V", "Lo/gh;", "T"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ga  reason: case insensitive filesystem */
final class C3426ga<T> implements C3433gh<Object, T> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private T f2213;

    /* renamed from: ι  reason: contains not printable characters */
    public final T m2385(Object obj, C3444gs<?> gsVar) {
        fM.m2254(gsVar, "");
        T t = this.f2213;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Property " + gsVar.m2414() + " should be initialized before get.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m2384(Object obj, C3444gs<?> gsVar, T t) {
        fM.m2254(gsVar, "");
        fM.m2254(t, "");
        this.f2213 = t;
    }
}
