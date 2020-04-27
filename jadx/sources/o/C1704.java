package o;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import o.C2702;

/* renamed from: o.ʬӀ  reason: contains not printable characters */
abstract class C1704<E> extends AbstractList<E> implements C2702.C2704<E> {

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f8880 = true;

    C1704() {
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

    /* renamed from: Ι  reason: contains not printable characters */
    public final boolean m9677() {
        return this.f8880;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m9676() {
        this.f8880 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m9675() {
        if (!this.f8880) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        if (this.f8880) {
            return super.add(e);
        }
        throw new UnsupportedOperationException();
    }

    public void add(int i, E e) {
        if (this.f8880) {
            super.add(i, e);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        if (this.f8880) {
            return super.addAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        if (this.f8880) {
            return super.addAll(i, collection);
        }
        throw new UnsupportedOperationException();
    }

    public void clear() {
        if (this.f8880) {
            super.clear();
            return;
        }
        throw new UnsupportedOperationException();
    }

    public E remove(int i) {
        if (this.f8880) {
            return super.remove(i);
        }
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj) {
        if (this.f8880) {
            return super.remove(obj);
        }
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        if (this.f8880) {
            return super.removeAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        if (this.f8880) {
            return super.retainAll(collection);
        }
        throw new UnsupportedOperationException();
    }

    public E set(int i, E e) {
        if (this.f8880) {
            return super.set(i, e);
        }
        throw new UnsupportedOperationException();
    }
}
