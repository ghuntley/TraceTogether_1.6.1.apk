package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public final class nd {

    /* renamed from: ı  reason: contains not printable characters */
    final Collection<np> f3389;

    /* renamed from: ι  reason: contains not printable characters */
    final Collection<String> f3390;

    public nd(Collection<np> collection) {
        m3979(collection);
        this.f3389 = collection;
        this.f3390 = m3980(collection);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private static void m3979(Collection<np> collection) {
        if (collection == null || collection.size() == 0) {
            throw new IllegalArgumentException("No reducers provided");
        }
        HashSet hashSet = new HashSet();
        for (np stateKey : collection) {
            hashSet.add(stateKey.getStateKey());
        }
        if (hashSet.size() != collection.size()) {
            throw new IllegalArgumentException("Two or more reducers are tied to the same key");
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    private static Collection<String> m3980(Collection<np> collection) {
        HashSet hashSet = new HashSet();
        for (np stateKey : collection) {
            hashSet.add(stateKey.getStateKey());
        }
        return hashSet;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final nt m3981() {
        HashMap hashMap = new HashMap(this.f3389.size());
        for (np next : this.f3389) {
            hashMap.put(next.getStateKey(), next.getInitialState());
        }
        return new nt(hashMap);
    }

    /* renamed from: o.nd$ǃ  reason: contains not printable characters */
    static class C0263 {

        /* renamed from: ı  reason: contains not printable characters */
        final Collection<String> f3391;

        /* renamed from: Ι  reason: contains not printable characters */
        final nt f3392;

        C0263(Collection<String> collection, nt ntVar) {
            this.f3391 = collection;
            this.f3392 = ntVar;
        }
    }
}
