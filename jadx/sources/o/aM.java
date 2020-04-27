package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import o.aJ;
import o.aO;
import o.aW;

public final class aM<E extends aJ & aW & aO> extends PriorityBlockingQueue<E> {

    /* renamed from: Ι  reason: contains not printable characters */
    private final ReentrantLock f1463 = new ReentrantLock();

    /* renamed from: ι  reason: contains not printable characters */
    private Queue<E> f1464 = new LinkedList();

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public E peek() {
        try {
            return m1504(1, (Long) null, (TimeUnit) null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public E poll() {
        try {
            return m1504(2, (Long) null, (TimeUnit) null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final int size() {
        try {
            this.f1463.lock();
            return this.f1464.size() + super.size();
        } finally {
            this.f1463.unlock();
        }
    }

    public final <T> T[] toArray(T[] tArr) {
        try {
            this.f1463.lock();
            return m1507((T[]) super.toArray(tArr), (T[]) this.f1464.toArray(tArr));
        } finally {
            this.f1463.unlock();
        }
    }

    public final Object[] toArray() {
        try {
            this.f1463.lock();
            return m1507((T[]) super.toArray(), (T[]) this.f1464.toArray());
        } finally {
            this.f1463.unlock();
        }
    }

    public final int drainTo(Collection<? super E> collection) {
        try {
            this.f1463.lock();
            int drainTo = super.drainTo(collection) + this.f1464.size();
            while (!this.f1464.isEmpty()) {
                collection.add(this.f1464.poll());
            }
            return drainTo;
        } finally {
            this.f1463.unlock();
        }
    }

    public final int drainTo(Collection<? super E> collection, int i) {
        try {
            this.f1463.lock();
            int drainTo = super.drainTo(collection, i);
            while (!this.f1464.isEmpty() && drainTo <= i) {
                collection.add(this.f1464.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f1463.unlock();
        }
    }

    public final boolean contains(Object obj) {
        try {
            this.f1463.lock();
            return super.contains(obj) || this.f1464.contains(obj);
        } finally {
            this.f1463.unlock();
        }
    }

    public final void clear() {
        try {
            this.f1463.lock();
            this.f1464.clear();
            super.clear();
        } finally {
            this.f1463.unlock();
        }
    }

    public final boolean remove(Object obj) {
        try {
            this.f1463.lock();
            return super.remove(obj) || this.f1464.remove(obj);
        } finally {
            this.f1463.unlock();
        }
    }

    public final boolean removeAll(Collection<?> collection) {
        try {
            this.f1463.lock();
            return this.f1464.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f1463.unlock();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private E m1508(int i, Long l, TimeUnit timeUnit) {
        if (i == 0) {
            return (aJ) super.take();
        }
        if (i == 1) {
            return (aJ) super.peek();
        }
        if (i == 2) {
            return (aJ) super.poll();
        }
        if (i != 3) {
            return null;
        }
        return (aJ) super.poll(l.longValue(), timeUnit);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean m1506(int i, E e) {
        try {
            this.f1463.lock();
            if (i == 1) {
                super.remove(e);
            }
            return this.f1464.offer(e);
        } finally {
            this.f1463.unlock();
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private E m1504(int i, Long l, TimeUnit timeUnit) {
        E r0;
        while (true) {
            r0 = m1508(i, l, timeUnit);
            if (r0 == null || r0.m1500()) {
                return r0;
            }
            m1506(i, r0);
        }
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m1509() {
        try {
            this.f1463.lock();
            Iterator it = this.f1464.iterator();
            while (it.hasNext()) {
                aJ aJVar = (aJ) it.next();
                if (aJVar.m1500()) {
                    super.offer(aJVar);
                    it.remove();
                }
            }
        } finally {
            this.f1463.unlock();
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static <T> T[] m1507(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public final /* synthetic */ Object poll(long j, TimeUnit timeUnit) {
        return m1504(3, Long.valueOf(j), timeUnit);
    }

    public final /* synthetic */ Object take() {
        return m1504(0, (Long) null, (TimeUnit) null);
    }
}
