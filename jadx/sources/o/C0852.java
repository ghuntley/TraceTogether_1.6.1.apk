package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: o.ǀɪ  reason: contains not printable characters */
public abstract class C0852<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: ı  reason: contains not printable characters */
    private static final Object[] f5567 = new Object[0];

    C0852() {
    }

    public abstract boolean contains(Object obj);

    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract C1036<E> iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public Object[] m6404() {
        return null;
    }

    public final Object[] toArray() {
        return toArray(f5567);
    }

    public final <T> T[] toArray(T[] tArr) {
        C0672.m5540(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] r1 = m6404();
            if (r1 != null) {
                return Arrays.copyOfRange(r1, m6401(), m6406(), tArr.getClass());
            }
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        m6403(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public int m6401() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ӏ  reason: contains not printable characters */
    public int m6406() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ι  reason: contains not printable characters */
    public C0719<E> m6405() {
        return isEmpty() ? C0719.m5842() : C0719.m5841(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public int m6403(Object[] objArr, int i) {
        C1036 r0 = (C1036) iterator();
        while (r0.hasNext()) {
            objArr[i] = r0.next();
            i++;
        }
        return i;
    }
}
