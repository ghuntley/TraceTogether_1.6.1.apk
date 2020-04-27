package o;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Ιȣ  reason: contains not printable characters */
final class C1805 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final C1805 f9243 = new C1805();

    /* renamed from: ı  reason: contains not printable characters */
    final Map<String, WeakReference<C0993<?>>> f9244 = new HashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    final Object f9245 = new Object();

    C1805() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static C1805 m9990() {
        return f9243;
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final void m9991(C0993<?> r4) {
        synchronized (this.f9245) {
            String obj = r4.m7076().toString();
            WeakReference weakReference = this.f9244.get(obj);
            C0993<?> r2 = weakReference != null ? (C0993) weakReference.get() : null;
            if (r2 == null || r2 == r4) {
                this.f9244.remove(obj);
            }
        }
    }
}
