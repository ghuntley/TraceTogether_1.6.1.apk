package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.ĿΙ  reason: contains not printable characters */
abstract class C0486<E> extends AbstractList<E> implements C1001<E> {

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f4114 = true;

    C0486() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(E e) {
        g_();
        return super.add(e);
    }

    public void add(int i, E e) {
        g_();
        super.add(i, e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        g_();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        g_();
        return super.addAll(i, collection);
    }

    public void clear() {
        g_();
        super.clear();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public boolean m4848() {
        return this.f4114;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final void m4847() {
        this.f4114 = false;
    }

    public E remove(int i) {
        g_();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        g_();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        g_();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        g_();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        g_();
        return super.set(i, e);
    }

    /* access modifiers changed from: protected */
    public final void g_() {
        if (!this.f4114) {
            throw new UnsupportedOperationException();
        }
    }
}
