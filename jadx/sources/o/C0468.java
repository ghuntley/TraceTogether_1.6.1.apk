package o;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.ıւ  reason: contains not printable characters */
final class C0468 {

    /* renamed from: ǃ  reason: contains not printable characters */
    private final ConcurrentHashMap<C0453, List<Throwable>> f4086 = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: Ι  reason: contains not printable characters */
    private final ReferenceQueue<Throwable> f4087 = new ReferenceQueue<>();

    C0468() {
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final List<Throwable> m4798(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f4087.poll();
        while (poll != null) {
            this.f4086.remove(poll);
            poll = this.f4087.poll();
        }
        List<Throwable> list = this.f4086.get(new C0453(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f4086.putIfAbsent(new C0453(th, this.f4087), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
