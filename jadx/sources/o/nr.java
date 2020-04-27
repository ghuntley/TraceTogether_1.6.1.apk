package o;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.nd;
import o.nm;

public final class nr implements nu {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public final nf f3412;
    /* access modifiers changed from: private */

    /* renamed from: ǃ  reason: contains not printable characters */
    public final nd f3413;
    /* access modifiers changed from: package-private */

    /* renamed from: ɩ  reason: contains not printable characters */
    public final Map<nl, nm.If> f3414;

    /* renamed from: ɹ  reason: contains not printable characters */
    private final Executor f3415;
    /* access modifiers changed from: package-private */

    /* renamed from: Ι  reason: contains not printable characters */
    public nt f3416;
    /* access modifiers changed from: package-private */

    /* renamed from: ι  reason: contains not printable characters */
    public final Set<nl<nc<?>>> f3417;

    /* renamed from: І  reason: contains not printable characters */
    private final ng f3418;
    /* access modifiers changed from: private */

    /* renamed from: Ӏ  reason: contains not printable characters */
    public final AtomicBoolean f3419 = new AtomicBoolean(false);

    public nr(nt ntVar, nd ndVar, nf nfVar, ng<Object> ngVar, Executor executor) {
        this.f3416 = ntVar;
        this.f3413 = ndVar;
        this.f3412 = nfVar;
        this.f3418 = ngVar;
        this.f3415 = executor;
        this.f3417 = Collections.synchronizedSet(new HashSet());
        this.f3414 = new ConcurrentHashMap();
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final nt m4012() {
        return new nt(new HashMap(this.f3416.f3432));
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public final synchronized void m4015(final nc ncVar) {
        this.f3415.execute(new Runnable() {
            public final void run() {
                nr.m4011(nr.this, ncVar);
                nf r0 = nr.this.f3412;
                nc ncVar = ncVar;
                nr nrVar = nr.this;
                r0.onAction(ncVar, nrVar, nrVar, new nh() {
                    /* renamed from: ı  reason: contains not printable characters */
                    public final void m4018(nc<?> ncVar) {
                        if (nr.this.f3419.compareAndSet(false, true)) {
                            nt ntVar = new nt(new HashMap(nr.this.f3416.f3432));
                            nd r0 = nr.this.f3413;
                            nt ntVar2 = new nt(new HashMap(nr.this.f3416.f3432));
                            nt ntVar3 = new nt();
                            HashSet hashSet = new HashSet();
                            for (np next : r0.f3389) {
                                Object obj = ntVar2.f3432.get(next.getStateKey());
                                Object reduce = next.reduce(obj, ncVar);
                                if (reduce != null) {
                                    ntVar3.f3432.put(next.getStateKey(), reduce);
                                    hashSet.add(next.getStateKey());
                                } else {
                                    ntVar3.f3432.put(next.getStateKey(), obj);
                                }
                            }
                            nd.C0263 r11 = new nd.C0263(hashSet, ntVar3);
                            nt unused = nr.this.f3416 = r11.f3392;
                            nr.this.f3419.set(false);
                            nr.this.m4009(ntVar, new nt(new HashMap(nr.this.f3416.f3432)), r11.f3391);
                            return;
                        }
                        throw new RuntimeException("You must not dispatch actions in your reducer. Seriously. (╯°□°）╯︵ ┻━┻");
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: Ι  reason: contains not printable characters */
    public void m4009(nt ntVar, nt ntVar2, Collection<String> collection) {
        for (nm.If next : this.f3414.values()) {
            if (next.m3997() == null || collection.contains(next.m3997())) {
                next.m3996(ntVar, ntVar2, false);
            }
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final <E> nx m4016(nq<E> nqVar, nl<E> nlVar) {
        Cif ifVar = new Cif(nm.m3994(nqVar, this.f3418, nlVar), nlVar);
        ifVar.m4034();
        return ifVar;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final <E> nx m4013(Class<E> cls, nl<E> nlVar) {
        Cif ifVar = new Cif(nm.m3995(cls, this.f3418, nlVar), nlVar);
        ifVar.m4034();
        return ifVar;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final nx m4014(nl<nc<?>> nlVar) {
        C0268 r0 = new C0268(this, nlVar, (byte) 0);
        r0.m4034();
        return r0;
    }

    /* renamed from: o.nr$ı  reason: contains not printable characters */
    class C0268 implements nx {

        /* renamed from: Ι  reason: contains not printable characters */
        private final nl<nc<?>> f3427;

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m4024() {
        }

        /* synthetic */ C0268(nr nrVar, nl nlVar, byte b) {
            this(nlVar);
        }

        private C0268(nl<nc<?>> nlVar) {
            this.f3427 = nlVar;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m4022() {
            nr nrVar = nr.this;
            nl<nc<?>> nlVar = this.f3427;
            nrVar.f3414.remove(nlVar);
            nrVar.f3417.remove(nlVar);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m4023() {
            nr.this.f3417.add(this.f3427);
        }
    }

    /* renamed from: o.nr$if  reason: invalid class name */
    class Cif implements nx {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final nl f3424;

        /* renamed from: Ι  reason: contains not printable characters */
        private final nm.If f3425;

        Cif(nm.If ifR, nl nlVar) {
            this.f3425 = ifR;
            this.f3424 = nlVar;
        }

        /* renamed from: ı  reason: contains not printable characters */
        public final void m4019() {
            nr nrVar = nr.this;
            nl nlVar = this.f3424;
            nrVar.f3414.remove(nlVar);
            nrVar.f3417.remove(nlVar);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final void m4020() {
            nr.this.f3414.put(this.f3424, this.f3425);
        }

        /* renamed from: Ι  reason: contains not printable characters */
        public final void m4021() {
            this.f3425.m3996((nt) null, new nt(new HashMap(nr.this.f3416.f3432)), true);
        }
    }

    /* renamed from: ι  reason: contains not printable characters */
    public final void m4017(nt ntVar) {
        nt ntVar2 = new nt(new HashMap(this.f3416.f3432));
        this.f3416 = nt.m4027(this.f3413.m3981(), ntVar);
        m4009(ntVar2, this.f3416, this.f3413.f3390);
    }

    /* renamed from: ι  reason: contains not printable characters */
    static /* synthetic */ void m4011(nr nrVar, nc ncVar) {
        for (nl<nc<?>> update : nrVar.f3417) {
            update.update(ncVar);
        }
    }
}
