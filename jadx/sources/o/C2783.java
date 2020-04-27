package o;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: o.Ӏɐ  reason: contains not printable characters */
public class C2783 implements C3121, C3147 {

    /* renamed from: ı  reason: contains not printable characters */
    private final Map<Class<?>, ConcurrentHashMap<C3197<Object>, Executor>> f13173 = new HashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    private Queue<C3123<?>> f13174 = new ArrayDeque();

    /* renamed from: ι  reason: contains not printable characters */
    private final Executor f13175;

    C2783(Executor executor) {
        this.f13175 = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new o.C3198(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r0 = m14695().iterator();
     */
    /* renamed from: ɩ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14694(o.C3123<?> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0036
            monitor-enter(r4)
            java.util.Queue<o.լӀ<?>> r0 = r4.f13174     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000e
            java.util.Queue<o.լӀ<?>> r0 = r4.f13174     // Catch:{ all -> 0x0033 }
            r0.add(r5)     // Catch:{ all -> 0x0033 }
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            return
        L_0x000e:
            monitor-exit(r4)
            java.util.Set r0 = r4.m14695()
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            o.ւɨ r3 = new o.ւɨ
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0017
        L_0x0032:
            return
        L_0x0033:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0036:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2783.m14694(o.լӀ):void");
    }

    /* renamed from: ι  reason: contains not printable characters */
    private synchronized Set<Map.Entry<C3197<Object>, Executor>> m14695() {
        Map map = this.f13173.get((Object) null);
        if (map == null) {
            return Collections.emptySet();
        }
        return map.entrySet();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final synchronized <T> void m14697(Class<T> cls, Executor executor, C3197<? super T> r5) {
        if (cls == null) {
            throw new NullPointerException();
        } else if (r5 == null) {
            throw new NullPointerException();
        } else if (executor != null) {
            if (!this.f13173.containsKey(cls)) {
                this.f13173.put(cls, new ConcurrentHashMap());
            }
            this.f13173.get(cls).put(r5, executor);
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> void m14698(Class<T> cls, C3197<? super T> r3) {
        m14697(cls, this.f13175, r3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m14699() {
        Queue<C3123<?>> queue;
        synchronized (this) {
            if (this.f13174 != null) {
                queue = this.f13174;
                this.f13174 = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C3123 r1 : queue) {
                m14694(r1);
            }
        }
    }
}
