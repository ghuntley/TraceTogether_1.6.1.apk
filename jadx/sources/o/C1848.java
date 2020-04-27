package o;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.Ιͽ  reason: contains not printable characters */
final class C1848 {

    /* renamed from: ɩ  reason: contains not printable characters */
    private final ConcurrentHashMap<C1847, List<Throwable>> f9468 = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: Ι  reason: contains not printable characters */
    private final ReferenceQueue<Throwable> f9469 = new ReferenceQueue<>();

    C1848() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final List<Throwable> m10206(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.f9469.poll();
        while (poll != null) {
            this.f9468.remove(poll);
            poll = this.f9469.poll();
        }
        List<Throwable> list = this.f9468.get(new C1847(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f9468.putIfAbsent(new C1847(th, this.f9469), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
