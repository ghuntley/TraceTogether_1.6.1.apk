package o;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import o.C2344;

/* renamed from: o.вı  reason: contains not printable characters */
public final class C2397 extends C2020 {

    /* renamed from: ι  reason: contains not printable characters */
    private static final C2841<Set<Object>> f10948 = C2391.m12403();

    /* renamed from: ı  reason: contains not printable characters */
    private final Map<Class<?>, C2609<Set<?>>> f10949 = new HashMap();

    /* renamed from: ǃ  reason: contains not printable characters */
    private final C2783 f10950;

    /* renamed from: ɩ  reason: contains not printable characters */
    private final Map<C2344<?>, C2609<?>> f10951 = new HashMap();

    /* renamed from: Ι  reason: contains not printable characters */
    private final Map<Class<?>, C2609<?>> f10952 = new HashMap();

    /* renamed from: ɩ  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Set m12415(Class cls) {
        return super.m10834(cls);
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ Object m12418(Class cls) {
        return super.m10835(cls);
    }

    public C2397(Executor executor, Iterable<ComponentRegistrar> iterable, C2344<?>... r9) {
        this.f10950 = new C2783(executor);
        ArrayList<C2344> arrayList = new ArrayList<>();
        C2783 r0 = this.f10950;
        C2344.C2345 r3 = new C2344.C2345(C2783.class, new Class[]{C3121.class, C3147.class}, (byte) 0);
        r3.f10854 = new C2098(r0);
        arrayList.add(r3.m12231());
        for (ComponentRegistrar components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (int i = 0; i < 8; i++) {
            C2344<?> r8 = r9[i];
            if (r8 != null) {
                arrayList.add(r8);
            }
        }
        C2398.m12420(arrayList);
        for (C2344 r82 : arrayList) {
            this.f10951.put(r82, new C2609(new C2517(this, r82)));
        }
        m12410();
        m12413();
    }

    /* renamed from: ı  reason: contains not printable characters */
    private void m12410() {
        Iterator<Map.Entry<C2344<?>, C2609<?>>> it = this.f10951.entrySet().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            C2344 r4 = (C2344) next.getKey();
            if (r4.f10847 == 0) {
                z = true;
            }
            if (z) {
                C2609 r1 = (C2609) next.getValue();
                for (Class<? super T> put : r4.f10844) {
                    this.f10952.put(put, r1);
                }
            }
        }
        for (C2344 next2 : this.f10951.keySet()) {
            Iterator<C2393> it2 = next2.f10843.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C2393 next3 = it2.next();
                    if ((next3.f10946 == 1) && !this.f10952.containsKey(next3.f10944)) {
                        throw new C2831(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next2, next3.f10944}));
                    }
                }
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private void m12413() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f10951.entrySet()) {
            C2344 r3 = (C2344) next.getKey();
            if (!(r3.f10847 == 0)) {
                C2609 r2 = (C2609) next.getValue();
                for (Class next2 : r3.f10844) {
                    if (!hashMap.containsKey(next2)) {
                        hashMap.put(next2, new HashSet());
                    }
                    ((Set) hashMap.get(next2)).add(r2);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.f10949.put((Class) entry.getKey(), new C2609(new C3160((Set) entry.getValue())));
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static /* synthetic */ Set m12411(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((C2609) it.next()).m13833());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final <T> C2841<T> m12414(Class<T> cls) {
        if (cls != null) {
            return this.f10952.get(cls);
        }
        throw new NullPointerException("Null interface requested.");
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final <T> C2841<Set<T>> m12417(Class<T> cls) {
        C2609 r2 = this.f10949.get(cls);
        if (r2 != null) {
            return r2;
        }
        return f10948;
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final void m12416(boolean z) {
        for (Map.Entry next : this.f10951.entrySet()) {
            C2344 r2 = (C2344) next.getKey();
            C2609 r1 = (C2609) next.getValue();
            boolean z2 = false;
            if (!(r2.f10845 == 1)) {
                if (r2.f10845 == 2) {
                    z2 = true;
                }
                if (z2) {
                    if (!z) {
                    }
                }
            }
            r1.m13833();
        }
        this.f10950.m14699();
    }
}
