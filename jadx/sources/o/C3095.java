package o;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.լǀ  reason: contains not printable characters */
public final class C3095<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: Ɩ  reason: contains not printable characters */
    private static /* synthetic */ boolean f14170 = (!C3095.class.desiredAssertionStatus());

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Comparator<Comparable> f14171 = new Comparator<Comparable>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    };

    /* renamed from: ı  reason: contains not printable characters */
    int f14172;

    /* renamed from: ǃ  reason: contains not printable characters */
    final C3096<K, V> f14173;

    /* renamed from: Ι  reason: contains not printable characters */
    int f14174;

    /* renamed from: ι  reason: contains not printable characters */
    private Comparator<? super K> f14175;

    /* renamed from: І  reason: contains not printable characters */
    private C3095<K, V>.ɩ f14176;

    /* renamed from: і  reason: contains not printable characters */
    private C3095<K, V>.If f14177;

    /* renamed from: Ӏ  reason: contains not printable characters */
    private C3096<K, V> f14178;

    public C3095() {
        this(f14171);
    }

    private C3095(Comparator<? super K> comparator) {
        this.f14172 = 0;
        this.f14174 = 0;
        this.f14173 = new C3096<>();
        this.f14175 = comparator == null ? f14171 : comparator;
    }

    public final int size() {
        return this.f14172;
    }

    public final V get(Object obj) {
        C3096 r1 = m15735(obj);
        if (r1 != null) {
            return r1.f14187;
        }
        return null;
    }

    public final boolean containsKey(Object obj) {
        return m15735(obj) != null;
    }

    public final V put(K k, V v) {
        if (k != null) {
            C3096 r2 = m15728(k, true);
            V v2 = r2.f14187;
            r2.f14187 = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public final void clear() {
        this.f14178 = null;
        this.f14172 = 0;
        this.f14174++;
        C3096<K, V> r0 = this.f14173;
        r0.f14180 = r0;
        r0.f14184 = r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private C3096<K, V> m15728(K k, boolean z) {
        int i;
        C3096<K, V> r0;
        C3096<K, V> r5;
        Comparator<? super K> comparator = this.f14175;
        C3096<K, V> r1 = this.f14178;
        if (r1 != null) {
            Comparable comparable = comparator == f14171 ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(r1.f14186);
                } else {
                    i = comparator.compare(k, r1.f14186);
                }
                if (i != 0) {
                    if (i < 0) {
                        r5 = r1.f14185;
                    } else {
                        r5 = r1.f14181;
                    }
                    if (r5 == null) {
                        break;
                    }
                    r1 = r5;
                } else {
                    return r1;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C3096<K, V> r8 = this.f14173;
        if (r1 != null) {
            r0 = new C3096<>(r1, k, r8, r8.f14180);
            if (i < 0) {
                r1.f14185 = r0;
            } else {
                r1.f14181 = r0;
            }
            m15732(r1, true);
        } else if (comparator != f14171 || (k instanceof Comparable)) {
            r0 = new C3096<>(r1, k, r8, r8.f14180);
            this.f14178 = r0;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f14172++;
        this.f14174++;
        return r0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final C3096<K, V> m15735(Object obj) {
        if (obj != null) {
            try {
                return m15728(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C3095.C3096<K, V> m15733(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            o.լǀ$ı r0 = r4.m15735(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f14187
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0020
        L_0x001f:
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            return r0
        L_0x0027:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3095.m15733(java.util.Map$Entry):o.լǀ$ı");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı  reason: contains not printable characters */
    public final void m15734(C3096<K, V> r7, boolean z) {
        int i;
        if (z) {
            r7.f14180.f14184 = r7.f14184;
            r7.f14184.f14180 = r7.f14180;
        }
        C3096<K, V> r8 = r7.f14185;
        C3096<K, V> r0 = r7.f14181;
        C3096<K, V> r1 = r7.f14182;
        int i2 = 0;
        if (r8 == null || r0 == null) {
            if (r8 != null) {
                m15731(r7, r8);
                r7.f14185 = null;
            } else if (r0 != null) {
                m15731(r7, r0);
                r7.f14181 = null;
            } else {
                m15731(r7, (C3096<K, V>) null);
            }
            m15732(r1, false);
            this.f14172--;
            this.f14174++;
            return;
        }
        if (r8.f14183 > r0.f14183) {
            C3096<K, V> r02 = r8.f14181;
            while (true) {
                C3096<K, V> r5 = r02;
                r0 = r8;
                r8 = r5;
                if (r8 == null) {
                    break;
                }
                r02 = r8.f14181;
            }
        } else {
            while (true) {
                C3096<K, V> r82 = r0.f14185;
                if (r82 == null) {
                    break;
                }
                r0 = r82;
            }
        }
        m15734(r0, false);
        C3096<K, V> r83 = r7.f14185;
        if (r83 != null) {
            i = r83.f14183;
            r0.f14185 = r83;
            r83.f14182 = r0;
            r7.f14185 = null;
        } else {
            i = 0;
        }
        C3096<K, V> r84 = r7.f14181;
        if (r84 != null) {
            i2 = r84.f14183;
            r0.f14181 = r84;
            r84.f14182 = r0;
            r7.f14181 = null;
        }
        r0.f14183 = Math.max(i, i2) + 1;
        m15731(r7, r0);
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m15731(C3096<K, V> r3, C3096<K, V> r4) {
        C3096<K, V> r0 = r3.f14182;
        r3.f14182 = null;
        if (r4 != null) {
            r4.f14182 = r0;
        }
        if (r0 == null) {
            this.f14178 = r4;
        } else if (r0.f14185 == r3) {
            r0.f14185 = r4;
        } else if (f14170 || r0.f14181 == r3) {
            r0.f14181 = r4;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m15732(C3096<K, V> r10, boolean z) {
        while (r10 != null) {
            C3096<K, V> r0 = r10.f14185;
            C3096<K, V> r1 = r10.f14181;
            int i = 0;
            int i2 = r0 != null ? r0.f14183 : 0;
            int i3 = r1 != null ? r1.f14183 : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C3096<K, V> r02 = r1.f14185;
                C3096<K, V> r3 = r1.f14181;
                int i5 = r3 != null ? r3.f14183 : 0;
                if (r02 != null) {
                    i = r02.f14183;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m15730(r10);
                } else if (f14170 || i6 == 1) {
                    m15729(r1);
                    m15730(r10);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C3096<K, V> r12 = r0.f14185;
                C3096<K, V> r32 = r0.f14181;
                int i7 = r32 != null ? r32.f14183 : 0;
                if (r12 != null) {
                    i = r12.f14183;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m15729(r10);
                } else if (f14170 || i8 == -1) {
                    m15730(r0);
                    m15729(r10);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                r10.f14183 = i2 + 1;
                if (z) {
                    return;
                }
            } else if (f14170 || i4 == -1 || i4 == 1) {
                r10.f14183 = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            r10 = r10.f14182;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    private void m15730(C3096<K, V> r6) {
        C3096<K, V> r0 = r6.f14185;
        C3096<K, V> r1 = r6.f14181;
        C3096<K, V> r2 = r1.f14185;
        C3096<K, V> r3 = r1.f14181;
        r6.f14181 = r2;
        if (r2 != null) {
            r2.f14182 = r6;
        }
        m15731(r6, r1);
        r1.f14185 = r6;
        r6.f14182 = r1;
        int i = 0;
        r6.f14183 = Math.max(r0 != null ? r0.f14183 : 0, r2 != null ? r2.f14183 : 0) + 1;
        int i2 = r6.f14183;
        if (r3 != null) {
            i = r3.f14183;
        }
        r1.f14183 = Math.max(i2, i) + 1;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private void m15729(C3096<K, V> r6) {
        C3096<K, V> r0 = r6.f14185;
        C3096<K, V> r1 = r6.f14181;
        C3096<K, V> r2 = r0.f14185;
        C3096<K, V> r3 = r0.f14181;
        r6.f14185 = r3;
        if (r3 != null) {
            r3.f14182 = r6;
        }
        m15731(r6, r0);
        r0.f14181 = r6;
        r6.f14182 = r0;
        int i = 0;
        r6.f14183 = Math.max(r1 != null ? r1.f14183 : 0, r3 != null ? r3.f14183 : 0) + 1;
        int i2 = r6.f14183;
        if (r2 != null) {
            i = r2.f14183;
        }
        r0.f14183 = Math.max(i2, i) + 1;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        C3095<K, V>.If ifR = this.f14177;
        if (ifR != null) {
            return ifR;
        }
        C3095<K, V>.If ifR2 = new If();
        this.f14177 = ifR2;
        return ifR2;
    }

    public final Set<K> keySet() {
        C3095<K, V>.ɩ r0 = this.f14176;
        if (r0 != null) {
            return r0;
        }
        C3095<K, V>.ɩ r02 = new C3098();
        this.f14176 = r02;
        return r02;
    }

    /* renamed from: o.լǀ$ı  reason: contains not printable characters */
    static final class C3096<K, V> implements Map.Entry<K, V> {

        /* renamed from: ı  reason: contains not printable characters */
        C3096<K, V> f14180;

        /* renamed from: ǃ  reason: contains not printable characters */
        C3096<K, V> f14181;

        /* renamed from: ɩ  reason: contains not printable characters */
        C3096<K, V> f14182;

        /* renamed from: ɹ  reason: contains not printable characters */
        int f14183;

        /* renamed from: Ι  reason: contains not printable characters */
        C3096<K, V> f14184;

        /* renamed from: ι  reason: contains not printable characters */
        C3096<K, V> f14185;

        /* renamed from: І  reason: contains not printable characters */
        final K f14186;

        /* renamed from: і  reason: contains not printable characters */
        V f14187;

        C3096() {
            this.f14186 = null;
            this.f14180 = this;
            this.f14184 = this;
        }

        C3096(C3096<K, V> r1, K k, C3096<K, V> r3, C3096<K, V> r4) {
            this.f14182 = r1;
            this.f14186 = k;
            this.f14183 = 1;
            this.f14184 = r3;
            this.f14180 = r4;
            r4.f14184 = this;
            r3.f14180 = this;
        }

        public final K getKey() {
            return this.f14186;
        }

        public final V getValue() {
            return this.f14187;
        }

        public final V setValue(V v) {
            V v2 = this.f14187;
            this.f14187 = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f14186;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.f14187;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            K k = this.f14186;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f14187;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f14186);
            sb.append("=");
            sb.append(this.f14187);
            return sb.toString();
        }
    }

    /* renamed from: o.լǀ$ǃ  reason: contains not printable characters */
    abstract class C3097<T> implements Iterator<T> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private C3096<K, V> f14188 = null;

        /* renamed from: ɩ  reason: contains not printable characters */
        private C3096<K, V> f14189 = C3095.this.f14173.f14184;

        /* renamed from: Ι  reason: contains not printable characters */
        private int f14190 = C3095.this.f14174;

        C3097() {
        }

        public final boolean hasNext() {
            return this.f14189 != C3095.this.f14173;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C3096<K, V> m15736() {
            C3096<K, V> r0 = this.f14189;
            if (r0 == C3095.this.f14173) {
                throw new NoSuchElementException();
            } else if (C3095.this.f14174 == this.f14190) {
                this.f14189 = r0.f14184;
                this.f14188 = r0;
                return r0;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final void remove() {
            C3096<K, V> r0 = this.f14188;
            if (r0 != null) {
                C3095.this.m15734(r0, true);
                this.f14188 = null;
                this.f14190 = C3095.this.f14174;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.լǀ$If */
    class If extends AbstractSet<Map.Entry<K, V>> {
        If() {
        }

        public final int size() {
            return C3095.this.f14172;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C3095<K, V>.ǃ<Map.Entry<K, V>>(this) {
                {
                    C3095 r1 = C3095.this;
                }

                public final /* synthetic */ Object next() {
                    return m15736();
                }
            };
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C3095.this.m15733((Map.Entry) obj) != null;
        }

        public final boolean remove(Object obj) {
            C3096 r3;
            if (!(obj instanceof Map.Entry) || (r3 = C3095.this.m15733((Map.Entry) obj)) == null) {
                return false;
            }
            C3095.this.m15734(r3, true);
            return true;
        }

        public final void clear() {
            C3095.this.clear();
        }
    }

    /* renamed from: o.լǀ$ɩ  reason: contains not printable characters */
    final class C3098 extends AbstractSet<K> {
        C3098() {
        }

        public final int size() {
            return C3095.this.f14172;
        }

        public final Iterator<K> iterator() {
            return new C3095<K, V>.ǃ<K>(this) {
                {
                    C3095 r1 = C3095.this;
                }

                public final K next() {
                    return m15736().f14186;
                }
            };
        }

        public final boolean contains(Object obj) {
            return C3095.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            C3095 r0 = C3095.this;
            C3096 r3 = r0.m15735(obj);
            if (r3 != null) {
                r0.m15734(r3, true);
            }
            if (r3 != null) {
                return true;
            }
            return false;
        }

        public final void clear() {
            C3095.this.clear();
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public final V remove(Object obj) {
        C3096 r2 = m15735(obj);
        if (r2 != null) {
            m15734(r2, true);
        }
        if (r2 != null) {
            return r2.f14187;
        }
        return null;
    }
}
