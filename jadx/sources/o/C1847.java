package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: o.Ιͼ  reason: contains not printable characters */
final class C1847 extends WeakReference<Throwable> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f9467;

    public C1847(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f9467 = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.f9467;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C1847 r5 = (C1847) obj;
            return this.f9467 == r5.f9467 && get() == r5.get();
        }
    }
}
