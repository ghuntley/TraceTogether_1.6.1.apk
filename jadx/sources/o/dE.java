package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00132\b\u0012\u0004\u0012\u00028\u00000\u0012B\u0007¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0007H$¢\u0006\u0004\b\u0003\u0010\bJ\u000f\u0010\t\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0005\u0010\u0010J\u000f\u0010\u0001\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0001\u0010\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/dE;", "ǃ", "Ljava/lang/Object;", "Ι", "Lo/em;", "ι", "Lo/em;", "", "()V", "ı", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "p0", "(Ljava/lang/Object;)V", "<init>", "", "T"}, k = 1, mv = {1, 1, 15})
public abstract class dE<T> implements Iterator<T> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private T f2030;

    /* renamed from: ι  reason: contains not printable characters */
    private C3385em f2031 = C3385em.NotReady;

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m2055();

    public boolean hasNext() {
        if (this.f2031 != C3385em.Failed) {
            int i = dG$WhenMappings.f2033[this.f2031.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m2053();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f2031 = C3385em.NotReady;
            return this.f2030;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final boolean m2053() {
        this.f2031 = C3385em.Failed;
        m2055();
        return this.f2031 == C3385em.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public final void m2056(T t) {
        this.f2030 = t;
        this.f2031 = C3385em.Ready;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m2054() {
        this.f2031 = C3385em.Done;
    }
}
