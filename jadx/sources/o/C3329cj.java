package o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.cj  reason: case insensitive filesystem */
abstract class C3329cj<T> extends AtomicReference<T> implements C3326cg {
    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public abstract void m1969(T t);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3329cj(T t) {
        super(t);
        if (t != null) {
            return;
        }
        throw new NullPointerException("value is null");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m1970() {
        Object andSet;
        if (get() != null && (andSet = getAndSet((Object) null)) != null) {
            m1969(andSet);
        }
    }
}
