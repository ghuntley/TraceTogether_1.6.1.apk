package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o.Ӏı  reason: contains not printable characters */
public class C2751<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: ı  reason: contains not printable characters */
    public C2752<K, V> f13050;

    /* renamed from: ɩ  reason: contains not printable characters */
    public int f13051 = 0;

    /* renamed from: Ι  reason: contains not printable characters */
    public C2752<K, V> f13052;

    /* renamed from: ι  reason: contains not printable characters */
    public WeakHashMap<aux<K, V>, Boolean> f13053 = new WeakHashMap<>();

    /* renamed from: o.Ӏı$aux */
    interface aux<K, V> {
        /* renamed from: Ι  reason: contains not printable characters */
        void m14584(C2752<K, V> r1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: ǃ  reason: contains not printable characters */
    public C2752<K, V> m14579(K k) {
        C2752<K, V> r0 = this.f13052;
        while (r0 != null && !r0.f13055.equals(k)) {
            r0 = r0.f13054;
        }
        return r0;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public V m14578(K k, V v) {
        C2752 r0 = m14579(k);
        if (r0 != null) {
            return r0.f13056;
        }
        m14581(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ɩ  reason: contains not printable characters */
    public final C2752<K, V> m14581(K k, V v) {
        C2752<K, V> r0 = new C2752<>(k, v);
        this.f13051++;
        C2752<K, V> r2 = this.f13050;
        if (r2 == null) {
            this.f13052 = r0;
            this.f13050 = this.f13052;
            return r0;
        }
        r2.f13054 = r0;
        r0.f13057 = r2;
        this.f13050 = r0;
        return r0;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public V m14580(K k) {
        C2752 r4 = m14579(k);
        if (r4 == null) {
            return null;
        }
        this.f13051--;
        if (!this.f13053.isEmpty()) {
            for (aux<K, V> r2 : this.f13053.keySet()) {
                r2.m14584(r4);
            }
        }
        if (r4.f13057 != null) {
            r4.f13057.f13054 = r4.f13054;
        } else {
            this.f13052 = r4.f13054;
        }
        if (r4.f13054 != null) {
            r4.f13054.f13057 = r4.f13057;
        } else {
            this.f13050 = r4.f13057;
        }
        r4.f13054 = null;
        r4.f13057 = null;
        return r4.f13056;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        Cif ifVar = new Cif(this.f13052, this.f13050);
        this.f13053.put(ifVar, Boolean.FALSE);
        return ifVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2751)) {
            return false;
        }
        C2751 r6 = (C2751) obj;
        if (this.f13051 != r6.f13051) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = r6.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: o.Ӏı$ǃ  reason: contains not printable characters */
    static abstract class C2753<K, V> implements Iterator<Map.Entry<K, V>>, aux<K, V> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private C2752<K, V> f13058;

        /* renamed from: Ι  reason: contains not printable characters */
        private C2752<K, V> f13059;

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public abstract C2752<K, V> m14587(C2752<K, V> r1);

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public abstract C2752<K, V> m14588(C2752<K, V> r1);

        C2753(C2752<K, V> r1, C2752<K, V> r2) {
            this.f13058 = r2;
            this.f13059 = r1;
        }

        public boolean hasNext() {
            return this.f13059 != null;
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m14589(C2752<K, V> r3) {
            C2752<K, V> r1 = null;
            if (this.f13058 == r3 && r3 == this.f13059) {
                this.f13059 = null;
                this.f13058 = null;
            }
            C2752<K, V> r0 = this.f13058;
            if (r0 == r3) {
                this.f13058 = m14587(r0);
            }
            C2752<K, V> r02 = this.f13059;
            if (r02 == r3) {
                C2752<K, V> r32 = this.f13058;
                if (!(r02 == r32 || r32 == null)) {
                    r1 = m14588(r02);
                }
                this.f13059 = r1;
            }
        }

        public /* synthetic */ Object next() {
            C2752<K, V> r1;
            C2752<K, V> r0 = this.f13059;
            C2752<K, V> r12 = this.f13058;
            if (r0 == r12 || r12 == null) {
                r1 = null;
            } else {
                r1 = m14588(r0);
            }
            this.f13059 = r1;
            return r0;
        }
    }

    /* renamed from: o.Ӏı$if  reason: invalid class name */
    static class Cif<K, V> extends C2753<K, V> {
        Cif(C2752<K, V> r1, C2752<K, V> r2) {
            super(r1, r2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2752<K, V> m14586(C2752<K, V> r1) {
            return r1.f13054;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2752<K, V> m14585(C2752<K, V> r1) {
            return r1.f13057;
        }
    }

    /* renamed from: o.Ӏı$If */
    public static class If<K, V> extends C2753<K, V> {
        public If(C2752<K, V> r1, C2752<K, V> r2) {
            super(r1, r2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2752<K, V> m14583(C2752<K, V> r1) {
            return r1.f13057;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2752<K, V> m14582(C2752<K, V> r1) {
            return r1.f13054;
        }
    }

    /* renamed from: o.Ӏı$ɩ  reason: contains not printable characters */
    public class C2754 implements Iterator<Map.Entry<K, V>>, aux<K, V> {

        /* renamed from: ǃ  reason: contains not printable characters */
        private boolean f13061 = true;

        /* renamed from: ι  reason: contains not printable characters */
        private C2752<K, V> f13062;

        public C2754() {
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m14590(C2752<K, V> r2) {
            C2752<K, V> r0 = this.f13062;
            if (r2 == r0) {
                this.f13062 = r0.f13057;
                this.f13061 = this.f13062 == null;
            }
        }

        public final boolean hasNext() {
            if (this.f13061) {
                return C2751.this.f13052 != null;
            }
            C2752<K, V> r0 = this.f13062;
            return (r0 == null || r0.f13054 == null) ? false : true;
        }

        public final /* bridge */ /* synthetic */ Object next() {
            C2752<K, V> r0;
            if (this.f13061) {
                this.f13061 = false;
                r0 = C2751.this.f13052;
            } else {
                C2752<K, V> r02 = this.f13062;
                r0 = r02 != null ? r02.f13054 : null;
            }
            this.f13062 = r0;
            return this.f13062;
        }
    }

    /* renamed from: o.Ӏı$ı  reason: contains not printable characters */
    public static class C2752<K, V> implements Map.Entry<K, V> {

        /* renamed from: ǃ  reason: contains not printable characters */
        C2752<K, V> f13054;

        /* renamed from: ɩ  reason: contains not printable characters */
        final K f13055;

        /* renamed from: Ι  reason: contains not printable characters */
        final V f13056;

        /* renamed from: ι  reason: contains not printable characters */
        public C2752<K, V> f13057;

        C2752(K k, V v) {
            this.f13055 = k;
            this.f13056 = v;
        }

        public final K getKey() {
            return this.f13055;
        }

        public final V getValue() {
            return this.f13056;
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13055);
            sb.append("=");
            sb.append(this.f13056);
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2752)) {
                return false;
            }
            C2752 r5 = (C2752) obj;
            return this.f13055.equals(r5.f13055) && this.f13056.equals(r5.f13056);
        }

        public final int hashCode() {
            return this.f13055.hashCode() ^ this.f13056.hashCode();
        }
    }
}
