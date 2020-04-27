package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.Ե  reason: contains not printable characters */
class C3015<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: ı  reason: contains not printable characters */
    private volatile C3015<K, V>.ɩ f13905;

    /* renamed from: ǃ  reason: contains not printable characters */
    List<C3015<K, V>.If> f13906;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int f13907;

    /* renamed from: Ι  reason: contains not printable characters */
    Map<K, V> f13908;

    /* renamed from: ι  reason: contains not printable characters */
    boolean f13909;

    /* synthetic */ C3015(int i, byte b) {
        this(i);
    }

    private C3015(int i) {
        this.f13907 = i;
        this.f13906 = Collections.emptyList();
        this.f13908 = Collections.emptyMap();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m15452() {
        Map<K, V> map;
        if (!this.f13909) {
            if (this.f13908.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f13908);
            }
            this.f13908 = map;
            this.f13909 = true;
        }
    }

    public int size() {
        return this.f13906.size() + this.f13908.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m15451(comparable) >= 0 || this.f13908.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int r0 = m15451(comparable);
        if (r0 >= 0) {
            return this.f13906.get(r0).getValue();
        }
        return this.f13908.get(comparable);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private int m15451(K k) {
        int size = this.f13906.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f13906.get(size).f13910);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f13906.get(i2).f13910);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f13905 == null) {
            this.f13905 = new C3017(this, (byte) 0);
        }
        return this.f13905;
    }

    /* renamed from: o.Ե$If */
    class If implements Map.Entry<K, V>, Comparable<C3015<K, V>.If> {

        /* renamed from: ı  reason: contains not printable characters */
        final K f13910;

        /* renamed from: ι  reason: contains not printable characters */
        private V f13912;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.f13910.compareTo(((If) obj).f13910);
        }

        If(C3015 r2, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        If(K k, V v) {
            this.f13910 = k;
            this.f13912 = v;
        }

        public final V getValue() {
            return this.f13912;
        }

        public final V setValue(V v) {
            if (!C3015.this.f13909) {
                V v2 = this.f13912;
                this.f13912 = v;
                return v2;
            }
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f13910;
            Object key = entry.getKey();
            if (k == null ? key == null : k.equals(key)) {
                V v = this.f13912;
                Object value = entry.getValue();
                if (v == null ? value == null : v.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            K k = this.f13910;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f13912;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13910);
            sb.append("=");
            sb.append(this.f13912);
            return sb.toString();
        }

        public final /* bridge */ /* synthetic */ Object getKey() {
            return this.f13910;
        }
    }

    /* renamed from: o.Ե$ɩ  reason: contains not printable characters */
    class C3017 extends AbstractSet<Map.Entry<K, V>> {
        private C3017() {
        }

        /* synthetic */ C3017(C3015 r1, byte b) {
            this();
        }

        public final /* synthetic */ boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C3015.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new Cif(C3015.this, (byte) 0);
        }

        public final int size() {
            return C3015.this.size();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C3015.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C3015.this.remove(entry.getKey());
            return true;
        }

        public final void clear() {
            C3015.this.clear();
        }
    }

    /* renamed from: o.Ե$if  reason: invalid class name */
    class Cif implements Iterator<Map.Entry<K, V>> {

        /* renamed from: ı  reason: contains not printable characters */
        private int f13913;

        /* renamed from: Ι  reason: contains not printable characters */
        private boolean f13915;

        /* renamed from: ι  reason: contains not printable characters */
        private Iterator<Map.Entry<K, V>> f13916;

        private Cif() {
            this.f13913 = -1;
        }

        /* synthetic */ Cif(C3015 r1, byte b) {
            this();
        }

        public final boolean hasNext() {
            if (this.f13913 + 1 < C3015.this.f13906.size() || m15456().hasNext()) {
                return true;
            }
            return false;
        }

        public final void remove() {
            if (this.f13915) {
                this.f13915 = false;
                if (C3015.this.f13909) {
                    throw new UnsupportedOperationException();
                } else if (this.f13913 < C3015.this.f13906.size()) {
                    C3015 r0 = C3015.this;
                    int i = this.f13913;
                    this.f13913 = i - 1;
                    r0.m15453(i);
                } else {
                    m15456().remove();
                }
            } else {
                throw new IllegalStateException("remove() was called before next()");
            }
        }

        /* renamed from: Ι  reason: contains not printable characters */
        private Iterator<Map.Entry<K, V>> m15456() {
            if (this.f13916 == null) {
                this.f13916 = C3015.this.f13908.entrySet().iterator();
            }
            return this.f13916;
        }

        public final /* synthetic */ Object next() {
            this.f13915 = true;
            int i = this.f13913 + 1;
            this.f13913 = i;
            if (i < C3015.this.f13906.size()) {
                return C3015.this.f13906.get(this.f13913);
            }
            return (Map.Entry) m15456().next();
        }
    }

    /* renamed from: o.Ե$ı  reason: contains not printable characters */
    static class C3016 {
        /* access modifiers changed from: private */

        /* renamed from: ı  reason: contains not printable characters */
        public static final Iterator<Object> f13917 = new Iterator<Object>() {
            public final boolean hasNext() {
                return false;
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };

        /* renamed from: ι  reason: contains not printable characters */
        private static final Iterable<Object> f13918 = new Iterable<Object>() {
            public final Iterator<Object> iterator() {
                return C3016.f13917;
            }
        };

        /* renamed from: ι  reason: contains not printable characters */
        static <T> Iterable<T> m15458() {
            return f13918;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3015)) {
            return super.equals(obj);
        }
        C3015 r8 = (C3015) obj;
        int size = size();
        if (size != r8.size()) {
            return false;
        }
        int size2 = this.f13906.size();
        if (size2 != r8.f13906.size()) {
            return entrySet().equals(r8.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!this.f13906.get(i).equals(r8.f13906.get(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f13908.equals(r8.f13908);
        }
        return true;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final V put(K k, V v) {
        if (!this.f13909) {
            int r0 = m15451(k);
            if (r0 >= 0) {
                return this.f13906.get(r0).setValue(v);
            }
            m15449();
            int i = -(r0 + 1);
            if (i >= this.f13907) {
                return m15450().put(k, v);
            }
            int size = this.f13906.size();
            int i2 = this.f13907;
            if (size == i2) {
                If remove = this.f13906.remove(i2 - 1);
                m15450().put(remove.f13910, remove.getValue());
            }
            this.f13906.add(i, new If(k, v));
            return null;
        }
        throw new UnsupportedOperationException();
    }

    public void clear() {
        if (!this.f13909) {
            if (!this.f13906.isEmpty()) {
                this.f13906.clear();
            }
            if (!this.f13908.isEmpty()) {
                this.f13908.clear();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public V remove(Object obj) {
        if (!this.f13909) {
            Comparable comparable = (Comparable) obj;
            int r0 = m15451(comparable);
            if (r0 >= 0) {
                return m15453(r0);
            }
            if (this.f13908.isEmpty()) {
                return null;
            }
            return this.f13908.remove(comparable);
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final V m15453(int i) {
        if (!this.f13909) {
            V value = this.f13906.remove(i).getValue();
            if (!this.f13908.isEmpty()) {
                Iterator it = m15450().entrySet().iterator();
                this.f13906.add(new If(this, (Map.Entry) it.next()));
                it.remove();
            }
            return value;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private SortedMap<K, V> m15450() {
        if (!this.f13909) {
            if (this.f13908.isEmpty() && !(this.f13908 instanceof TreeMap)) {
                this.f13908 = new TreeMap();
            }
            return (SortedMap) this.f13908;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m15449() {
        if (this.f13909) {
            throw new UnsupportedOperationException();
        } else if (this.f13906.isEmpty() && !(this.f13906 instanceof ArrayList)) {
            this.f13906 = new ArrayList(this.f13907);
        }
    }

    public int hashCode() {
        int size = this.f13906.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f13906.get(i2).hashCode();
        }
        return this.f13908.size() > 0 ? i + this.f13908.hashCode() : i;
    }
}
