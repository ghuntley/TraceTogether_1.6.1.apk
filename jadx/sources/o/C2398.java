package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o.вǃ  reason: contains not printable characters */
public final class C2398 {

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String f10953;

    /* renamed from: ι  reason: contains not printable characters */
    public final String f10954;

    /* renamed from: o.вǃ$if  reason: invalid class name */
    static class Cif {

        /* renamed from: ı  reason: contains not printable characters */
        private final Class<?> f10955;

        /* renamed from: Ι  reason: contains not printable characters */
        final boolean f10956;

        /* synthetic */ Cif(Class cls, boolean z, byte b) {
            this(cls, z);
        }

        private Cif(Class<?> cls, boolean z) {
            this.f10955 = cls;
            this.f10956 = z;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Cif) {
                Cif ifVar = (Cif) obj;
                if (!ifVar.f10955.equals(this.f10955) || ifVar.f10956 != this.f10956) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((this.f10955.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f10956).hashCode();
        }
    }

    C2398() {
    }

    /* renamed from: o.вǃ$ǃ  reason: contains not printable characters */
    static class C2399 {

        /* renamed from: ı  reason: contains not printable characters */
        final Set<C2399> f10957 = new HashSet();

        /* renamed from: ǃ  reason: contains not printable characters */
        final C2344<?> f10958;

        /* renamed from: ι  reason: contains not printable characters */
        final Set<C2399> f10959 = new HashSet();

        C2399(C2344<?> r2) {
            this.f10958 = r2;
        }
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static Set<C2399> m12419(Set<C2399> set) {
        HashSet hashSet = new HashSet();
        for (C2399 next : set) {
            if (next.f10957.isEmpty()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static void m12420(List<C2344<?>> list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator<C2344<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C2344 next = it.next();
                C2399 r5 = new C2399(next);
                Iterator<Class<? super T>> it2 = next.f10844.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next2 = it2.next();
                        Cif ifVar = new Cif(next2, !(next.f10847 == 0), (byte) 0);
                        if (!hashMap.containsKey(ifVar)) {
                            hashMap.put(ifVar, new HashSet());
                        }
                        Set set = (Set) hashMap.get(ifVar);
                        if (set.isEmpty() || ifVar.f10956) {
                            set.add(r5);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next2}));
                        }
                    }
                }
            } else {
                for (Set<C2399> it3 : hashMap.values()) {
                    for (C2399 r52 : it3) {
                        for (C2393 next3 : r52.f10958.f10843) {
                            if (next3.f10945 == 0) {
                                Set<C2399> set2 = (Set) hashMap.get(new Cif(next3.f10944, next3.f10946 == 2, (byte) 0));
                                if (set2 != null) {
                                    for (C2399 r8 : set2) {
                                        r52.f10959.add(r8);
                                        r8.f10957.add(r52);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<C2399> hashSet = new HashSet<>();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                Set<C2399> r0 = m12419(hashSet);
                while (!r0.isEmpty()) {
                    C2399 next4 = r0.iterator().next();
                    r0.remove(next4);
                    i++;
                    for (C2399 next5 : next4.f10959) {
                        next5.f10957.remove(next4);
                        if (next5.f10957.isEmpty()) {
                            r0.add(next5);
                        }
                    }
                }
                if (i != list.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (C2399 r1 : hashSet) {
                        if (!r1.f10957.isEmpty() && !r1.f10959.isEmpty()) {
                            arrayList.add(r1.f10958);
                        }
                    }
                    throw new C2394((List<C2344<?>>) arrayList);
                }
                return;
            }
        }
    }

    public C2398(String str, String str2) {
        this.f10954 = str;
        this.f10953 = str2;
    }
}
