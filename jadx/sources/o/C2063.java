package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: o.ιє  reason: contains not printable characters */
class C2063<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public Map<K, V> f10124;

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int f10125;

    /* renamed from: ɩ  reason: contains not printable characters */
    private boolean f10126;
    /* access modifiers changed from: private */

    /* renamed from: ɹ  reason: contains not printable characters */
    public Map<K, V> f10127;
    /* access modifiers changed from: private */

    /* renamed from: Ι  reason: contains not printable characters */
    public List<C2108> f10128;

    /* renamed from: ι  reason: contains not printable characters */
    private volatile C2263 f10129;

    /* renamed from: і  reason: contains not printable characters */
    private volatile C2130 f10130;

    /* renamed from: ι  reason: contains not printable characters */
    static <FieldDescriptorType extends C0750<FieldDescriptorType>> C2063<FieldDescriptorType, Object> m10974(int i) {
        return new C2096(i);
    }

    private C2063(int i) {
        this.f10125 = i;
        this.f10128 = Collections.emptyList();
        this.f10124 = Collections.emptyMap();
        this.f10127 = Collections.emptyMap();
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public void m10978() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f10126) {
            if (this.f10124.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f10124);
            }
            this.f10124 = map;
            if (this.f10127.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f10127);
            }
            this.f10127 = map2;
            this.f10126 = true;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final boolean m10977() {
        return this.f10126;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final int m10979() {
        return this.f10128.size();
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final Map.Entry<K, V> m10980(int i) {
        return this.f10128.get(i);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final Iterable<Map.Entry<K, V>> m10982() {
        if (this.f10124.isEmpty()) {
            return C2126.m11300();
        }
        return this.f10124.entrySet();
    }

    public int size() {
        return this.f10128.size() + this.f10124.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m10970(comparable) >= 0 || this.f10124.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int r0 = m10970(comparable);
        if (r0 >= 0) {
            return this.f10128.get(r0).getValue();
        }
        return this.f10124.get(comparable);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final V put(K k, V v) {
        m10972();
        int r0 = m10970(k);
        if (r0 >= 0) {
            return this.f10128.get(r0).setValue(v);
        }
        m10972();
        if (this.f10128.isEmpty() && !(this.f10128 instanceof ArrayList)) {
            this.f10128 = new ArrayList(this.f10125);
        }
        int i = -(r0 + 1);
        if (i >= this.f10125) {
            return m10976().put(k, v);
        }
        int size = this.f10128.size();
        int i2 = this.f10125;
        if (size == i2) {
            C2108 remove = this.f10128.remove(i2 - 1);
            m10976().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f10128.add(i, new C2108(this, k, v));
        return null;
    }

    public void clear() {
        m10972();
        if (!this.f10128.isEmpty()) {
            this.f10128.clear();
        }
        if (!this.f10124.isEmpty()) {
            this.f10124.clear();
        }
    }

    public V remove(Object obj) {
        m10972();
        Comparable comparable = (Comparable) obj;
        int r0 = m10970(comparable);
        if (r0 >= 0) {
            return m10967(r0);
        }
        if (this.f10124.isEmpty()) {
            return null;
        }
        return this.f10124.remove(comparable);
    }

    /* access modifiers changed from: private */
    /* renamed from: ı  reason: contains not printable characters */
    public final V m10967(int i) {
        m10972();
        V value = this.f10128.remove(i).getValue();
        if (!this.f10124.isEmpty()) {
            Iterator it = m10976().entrySet().iterator();
            this.f10128.add(new C2108(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final int m10970(K k) {
        int size = this.f10128.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f10128.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f10128.get(i2).getKey());
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
        if (this.f10129 == null) {
            this.f10129 = new C2263(this, (C2096) null);
        }
        return this.f10129;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι  reason: contains not printable characters */
    public final Set<Map.Entry<K, V>> m10981() {
        if (this.f10130 == null) {
            this.f10130 = new C2130(this, (C2096) null);
        }
        return this.f10130;
    }

    /* access modifiers changed from: private */
    /* renamed from: ɹ  reason: contains not printable characters */
    public final void m10972() {
        if (this.f10126) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final SortedMap<K, V> m10976() {
        m10972();
        if (this.f10124.isEmpty() && !(this.f10124 instanceof TreeMap)) {
            this.f10124 = new TreeMap();
            this.f10127 = ((TreeMap) this.f10124).descendingMap();
        }
        return (SortedMap) this.f10124;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2063)) {
            return super.equals(obj);
        }
        C2063 r8 = (C2063) obj;
        int size = size();
        if (size != r8.size()) {
            return false;
        }
        int r2 = m10979();
        if (r2 != r8.m10979()) {
            return entrySet().equals(r8.entrySet());
        }
        for (int i = 0; i < r2; i++) {
            if (!m10980(i).equals(r8.m10980(i))) {
                return false;
            }
        }
        if (r2 != size) {
            return this.f10124.equals(r8.f10124);
        }
        return true;
    }

    public int hashCode() {
        int r0 = m10979();
        int i = 0;
        for (int i2 = 0; i2 < r0; i2++) {
            i += this.f10128.get(i2).hashCode();
        }
        return this.f10124.size() > 0 ? i + this.f10124.hashCode() : i;
    }

    /* synthetic */ C2063(int i, C2096 r2) {
        this(i);
    }
}
