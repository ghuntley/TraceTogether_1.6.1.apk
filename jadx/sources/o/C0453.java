package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: o.ıԁ  reason: contains not printable characters */
final class C0453 extends WeakReference<Throwable> {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f4071;

    public C0453(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f4071 = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.f4071;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C0453 r5 = (C0453) obj;
            return this.f4071 == r5.f4071 && get() == r5.get();
        }
    }
}
