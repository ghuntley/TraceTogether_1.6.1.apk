package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.ƚſ  reason: contains not printable characters */
public abstract class C0719<E> extends C0852<E> implements List<E>, RandomAccess {

    /* renamed from: ι  reason: contains not printable characters */
    private static final C1024<Object> f4927 = new C0846(C1020.f6218, 0);

    /* renamed from: ɩ  reason: contains not printable characters */
    public static <E> C0719<E> m5842() {
        return C1020.f6218;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final C0719<E> m5846() {
        return this;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <E> C0719<E> m5840(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        int i = 0;
        Object[] objArr = {e, e2, e3, e4, e5, e6, e7, e8};
        while (i < 8) {
            if (objArr[i] != null) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i);
                throw new NullPointerException(sb.toString());
            }
        }
        return new C1020(objArr, 8);
    }

    /* renamed from: ı  reason: contains not printable characters */
    static <E> C0719<E> m5841(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return C1020.f6218;
        }
        return new C1020(objArr, length);
    }

    C0719() {
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final C1036<E> m5843() {
        return (C1024) listIterator();
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (obj.equals(get(i))) {
                    return i;
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (C0580.m5203(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            for (int size = size() - 1; size >= 0; size--) {
                if (obj.equals(get(size))) {
                    return size;
                }
            }
            return -1;
        }
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C0580.m5203(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public C0719<E> subList(int i, int i2) {
        C0672.m5543(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C1020.f6218;
        }
        return new C0946(this, i, i3);
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public int m5845(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean equals(Object obj) {
        if (obj == C0672.m5540(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                    C0719 r0 = this;
                    int size2 = r0.size();
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (i < size2) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object obj2 = r0.get(i);
                            i++;
                            if (!C0580.m5203(obj2, it.next())) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                } else {
                    int i2 = 0;
                    while (i2 < size) {
                        if (C0580.m5203(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        C0672.m5541(i, size());
        if (isEmpty()) {
            return f4927;
        }
        return new C0846(this, i);
    }

    public /* synthetic */ ListIterator listIterator() {
        return (C1024) listIterator(0);
    }
}
