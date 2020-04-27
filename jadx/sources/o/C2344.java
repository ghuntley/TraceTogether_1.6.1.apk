package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.Б  reason: contains not printable characters */
public final class C2344<T> {

    /* renamed from: ı  reason: contains not printable characters */
    final Set<C2393> f10843;

    /* renamed from: ǃ  reason: contains not printable characters */
    final Set<Class<? super T>> f10844;

    /* renamed from: ɩ  reason: contains not printable characters */
    final int f10845;

    /* renamed from: ɹ  reason: contains not printable characters */
    final Set<Class<?>> f10846;

    /* renamed from: Ι  reason: contains not printable characters */
    final int f10847;

    /* renamed from: ι  reason: contains not printable characters */
    final C2313<T> f10848;

    /* synthetic */ C2344(Set set, Set set2, int i, int i2, C2313 r5, Set set3, byte b) {
        this(set, set2, i, i2, r5, set3);
    }

    private C2344(Set<Class<? super T>> set, Set<C2393> set2, int i, int i2, C2313<T> r5, Set<Class<?>> set3) {
        this.f10844 = Collections.unmodifiableSet(set);
        this.f10843 = Collections.unmodifiableSet(set2);
        this.f10845 = i;
        this.f10847 = i2;
        this.f10848 = r5;
        this.f10846 = Collections.unmodifiableSet(set3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.f10844.toArray()));
        sb.append(">{");
        sb.append(this.f10845);
        sb.append(", type=");
        sb.append(this.f10847);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.f10843.toArray()));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: o.Б$ǃ  reason: contains not printable characters */
    public static class C2345<T> {

        /* renamed from: ı  reason: contains not printable characters */
        public final Set<Class<? super T>> f10849;

        /* renamed from: Ɩ  reason: contains not printable characters */
        private Set<Class<?>> f10850;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Set<C2393> f10851;

        /* renamed from: ɩ  reason: contains not printable characters */
        public int f10852;

        /* renamed from: Ι  reason: contains not printable characters */
        public int f10853;

        /* renamed from: ι  reason: contains not printable characters */
        public C2313<T> f10854;

        public /* synthetic */ C2345(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        @SafeVarargs
        private C2345(Class<T> cls, Class<? super T>... clsArr) {
            this.f10849 = new HashSet();
            this.f10851 = new HashSet();
            int i = 0;
            this.f10853 = 0;
            this.f10852 = 0;
            this.f10850 = new HashSet();
            if (cls != null) {
                this.f10849.add(cls);
                int length = clsArr.length;
                while (i < length) {
                    if (clsArr[i] != null) {
                        i++;
                    } else {
                        throw new NullPointerException("Null interface");
                    }
                }
                Collections.addAll(this.f10849, clsArr);
                return;
            }
            throw new NullPointerException("Null interface");
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final C2344<T> m12231() {
            if (this.f10854 != null) {
                return new C2344(new HashSet(this.f10849), new HashSet(this.f10851), this.f10853, this.f10852, this.f10854, this.f10850, (byte) 0);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2345<T> m12230(C2393 r3) {
            if (!this.f10849.contains(r3.f10944)) {
                this.f10851.add(r3);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final C2345<T> m12229() {
            if (this.f10853 == 0) {
                this.f10853 = 1;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }
}
