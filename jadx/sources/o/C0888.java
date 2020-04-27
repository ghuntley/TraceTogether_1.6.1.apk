package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.ǃƖ  reason: contains not printable characters */
public abstract class C0888<K, V> {

    /* renamed from: ǃ  reason: contains not printable characters */
    C0888<K, V>.if f5702;

    /* renamed from: ɩ  reason: contains not printable characters */
    C0888<K, V>.If f5703;

    /* renamed from: Ι  reason: contains not printable characters */
    C0888<K, V>.ı f5704;

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract int m6604(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: ı  reason: contains not printable characters */
    public abstract void m6605();

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract V m6606(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public abstract Map<K, V> m6607();

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract int m6609(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract Object m6610(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m6611(int i);

    /* access modifiers changed from: protected */
    /* renamed from: Ι  reason: contains not printable characters */
    public abstract void m6612(K k, V v);

    /* access modifiers changed from: protected */
    /* renamed from: ι  reason: contains not printable characters */
    public abstract int m6613();

    C0888() {
    }

    /* renamed from: o.ǃƖ$ɩ  reason: contains not printable characters */
    final class C0891<T> implements Iterator<T> {

        /* renamed from: ı  reason: contains not printable characters */
        private int f5712;

        /* renamed from: ǃ  reason: contains not printable characters */
        private boolean f5713 = false;

        /* renamed from: Ι  reason: contains not printable characters */
        private int f5715;

        /* renamed from: ι  reason: contains not printable characters */
        final int f5716;

        C0891(int i) {
            this.f5716 = i;
            this.f5712 = C0888.this.m6613();
        }

        public final boolean hasNext() {
            return this.f5715 < this.f5712;
        }

        public final T next() {
            if (hasNext()) {
                T r0 = C0888.this.m6610(this.f5715, this.f5716);
                this.f5715++;
                this.f5713 = true;
                return r0;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f5713) {
                this.f5715--;
                this.f5712--;
                this.f5713 = false;
                C0888.this.m6611(this.f5715);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.ǃƖ$ǃ  reason: contains not printable characters */
    final class C0890 implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: ı  reason: contains not printable characters */
        private int f5708;

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean f5710 = false;

        /* renamed from: ι  reason: contains not printable characters */
        private int f5711;

        C0890() {
            this.f5711 = C0888.this.m6613() - 1;
            this.f5708 = -1;
        }

        public final boolean hasNext() {
            return this.f5708 < this.f5711;
        }

        public final void remove() {
            if (this.f5710) {
                C0888.this.m6611(this.f5708);
                this.f5708--;
                this.f5711--;
                this.f5710 = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final K getKey() {
            if (this.f5710) {
                return C0888.this.m6610(this.f5708, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f5710) {
                return C0888.this.m6610(this.f5708, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V setValue(V v) {
            if (this.f5710) {
                return C0888.this.m6606(this.f5708, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            if (!this.f5710) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C0647.m5431(entry.getKey(), C0888.this.m6610(this.f5708, 0)) || !C0647.m5431(entry.getValue(), C0888.this.m6610(this.f5708, 1))) {
                    return false;
                }
                return true;
            }
        }

        public final int hashCode() {
            int i;
            if (this.f5710) {
                int i2 = 0;
                Object r0 = C0888.this.m6610(this.f5708, 0);
                Object r1 = C0888.this.m6610(this.f5708, 1);
                if (r0 == null) {
                    i = 0;
                } else {
                    i = r0.hashCode();
                }
                if (r1 != null) {
                    i2 = r1.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.f5708++;
                this.f5710 = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: o.ǃƖ$ı  reason: contains not printable characters */
    final class C0889 implements Set<Map.Entry<K, V>> {
        C0889() {
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int r0 = C0888.this.m6613();
            for (Map.Entry entry : collection) {
                C0888.this.m6612(entry.getKey(), entry.getValue());
            }
            return r0 != C0888.this.m6613();
        }

        public final void clear() {
            C0888.this.m6605();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int r0 = C0888.this.m6604(entry.getKey());
            if (r0 < 0) {
                return false;
            }
            return C0647.m5431(C0888.this.m6610(r0, 1), entry.getValue());
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return C0888.this.m6613() == 0;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C0890();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return C0888.this.m6613();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return C0888.m6603(this, obj);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int r0 = C0888.this.m6613() - 1; r0 >= 0; r0--) {
                Object r4 = C0888.this.m6610(r0, 0);
                Object r5 = C0888.this.m6610(r0, 1);
                if (r4 == null) {
                    i = 0;
                } else {
                    i = r4.hashCode();
                }
                if (r5 == null) {
                    i2 = 0;
                } else {
                    i2 = r5.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.ǃƖ$if  reason: invalid class name */
    final class Cif implements Set<K> {
        Cif() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            C0888.this.m6605();
        }

        public final boolean contains(Object obj) {
            return C0888.this.m6604(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map r0 = C0888.this.m6607();
            for (Object containsKey : collection) {
                if (!r0.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return C0888.this.m6613() == 0;
        }

        public final Iterator<K> iterator() {
            return new C0891(0);
        }

        public final boolean remove(Object obj) {
            int r2 = C0888.this.m6604(obj);
            if (r2 < 0) {
                return false;
            }
            C0888.this.m6611(r2);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map r0 = C0888.this.m6607();
            int size = r0.size();
            for (Object remove : collection) {
                r0.remove(remove);
            }
            return size != r0.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return C0888.m6602(C0888.this.m6607(), collection);
        }

        public final int size() {
            return C0888.this.m6613();
        }

        public final Object[] toArray() {
            return C0888.this.m6608(0);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C0888.this.m6614(tArr, 0);
        }

        public final boolean equals(Object obj) {
            return C0888.m6603(this, obj);
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            for (int r0 = C0888.this.m6613() - 1; r0 >= 0; r0--) {
                Object r3 = C0888.this.m6610(r0, 0);
                if (r3 == null) {
                    i = 0;
                } else {
                    i = r3.hashCode();
                }
                i2 += i;
            }
            return i2;
        }
    }

    /* renamed from: o.ǃƖ$If */
    final class If implements Collection<V> {
        If() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            C0888.this.m6605();
        }

        public final boolean contains(Object obj) {
            return C0888.this.m6609(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return C0888.this.m6613() == 0;
        }

        public final Iterator<V> iterator() {
            return new C0891(1);
        }

        public final boolean remove(Object obj) {
            int r2 = C0888.this.m6609(obj);
            if (r2 < 0) {
                return false;
            }
            C0888.this.m6611(r2);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int r0 = C0888.this.m6613();
            int i = 0;
            boolean z = false;
            while (i < r0) {
                if (collection.contains(C0888.this.m6610(i, 1))) {
                    C0888.this.m6611(i);
                    i--;
                    r0--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int r0 = C0888.this.m6613();
            int i = 0;
            boolean z = false;
            while (i < r0) {
                if (!collection.contains(C0888.this.m6610(i, 1))) {
                    C0888.this.m6611(i);
                    i--;
                    r0--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return C0888.this.m6613();
        }

        public final Object[] toArray() {
            return C0888.this.m6608(1);
        }

        public final <T> T[] toArray(T[] tArr) {
            return C0888.this.m6614(tArr, 1);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static <K, V> boolean m6602(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Object[] m6608(int i) {
        int r0 = m6613();
        Object[] objArr = new Object[r0];
        for (int i2 = 0; i2 < r0; i2++) {
            objArr[i2] = m6610(i2, i);
        }
        return objArr;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <T> T[] m6614(T[] tArr, int i) {
        int r0 = m6613();
        if (tArr.length < r0) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), r0);
        }
        for (int i2 = 0; i2 < r0; i2++) {
            tArr[i2] = m6610(i2, i);
        }
        if (tArr.length > r0) {
            tArr[r0] = null;
        }
        return tArr;
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static <T> boolean m6603(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }
}
