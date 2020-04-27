package o;

import java.util.logging.Level;
import java.util.logging.Logger;

final class nm {

    /* renamed from: ɩ  reason: contains not printable characters */
    private static final Logger f3405 = Logger.getLogger("Suas");

    interface If {
        /* renamed from: ɩ  reason: contains not printable characters */
        void m3996(nt ntVar, nt ntVar2, boolean z);

        /* renamed from: ι  reason: contains not printable characters */
        String m3997();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static <E> If m3995(Class<E> cls, ng<E> ngVar, nl<E> nlVar) {
        return new C0267(cls, nlVar, ngVar, (byte) 0);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    static <E> If m3994(nq<E> nqVar, ng<nt> ngVar, nl<E> nlVar) {
        return new C0266(nlVar, nqVar, ngVar, (byte) 0);
    }

    /* renamed from: o.nm$ı  reason: contains not printable characters */
    static class C0266<E> implements If {

        /* renamed from: ǃ  reason: contains not printable characters */
        private final nl<E> f3406;

        /* renamed from: ɩ  reason: contains not printable characters */
        private final nq<E> f3407;

        /* renamed from: ι  reason: contains not printable characters */
        private final ng<nt> f3408;

        /* renamed from: ι  reason: contains not printable characters */
        public final String m3999() {
            return null;
        }

        /* synthetic */ C0266(nl nlVar, nq nqVar, ng ngVar, byte b) {
            this(nlVar, nqVar, ngVar);
        }

        private C0266(nl<E> nlVar, nq<E> nqVar, ng<nt> ngVar) {
            this.f3406 = nlVar;
            this.f3407 = nqVar;
            this.f3408 = ngVar;
        }

        /* renamed from: ɩ  reason: contains not printable characters */
        public final void m3998(nt ntVar, nt ntVar2, boolean z) {
            E selectData;
            if (((z && ntVar2 != null) || (ntVar != null && ntVar2 != null && this.f3408.m3988(ntVar, ntVar2))) && (selectData = this.f3407.selectData(ntVar2)) != null) {
                this.f3406.update(selectData);
            }
        }
    }

    /* renamed from: o.nm$ɩ  reason: contains not printable characters */
    static class C0267<E> implements If {

        /* renamed from: ɩ  reason: contains not printable characters */
        private final ng<E> f3409;

        /* renamed from: Ι  reason: contains not printable characters */
        private final Class<E> f3410;

        /* renamed from: ι  reason: contains not printable characters */
        private final nl<E> f3411;

        /* synthetic */ C0267(Class cls, nl nlVar, ng ngVar, byte b) {
            this(cls, nlVar, ngVar);
        }

        private C0267(Class<E> cls, nl<E> nlVar, ng<E> ngVar) {
            this.f3410 = cls;
            this.f3411 = nlVar;
            this.f3409 = ngVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
            if (r1.isInstance(r4) != false) goto L_0x0017;
         */
        /* renamed from: ɩ  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void m4000(o.nt r4, o.nt r5, boolean r6) {
            /*
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L_0x0016
                java.lang.Class<E> r1 = r3.f3410
                java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f3432
                java.lang.String r2 = o.nt.m4028(r1)
                java.lang.Object r4 = r4.get(r2)
                boolean r1 = r1.isInstance(r4)
                if (r1 == 0) goto L_0x0016
                goto L_0x0017
            L_0x0016:
                r4 = r0
            L_0x0017:
                if (r5 == 0) goto L_0x002c
                java.lang.Class<E> r1 = r3.f3410
                java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f3432
                java.lang.String r2 = o.nt.m4028(r1)
                java.lang.Object r5 = r5.get(r2)
                boolean r1 = r1.isInstance(r5)
                if (r1 == 0) goto L_0x002c
                r0 = r5
            L_0x002c:
                o.ng<E> r5 = r3.f3409
                o.nl<E> r1 = r3.f3411
                o.nm.m3993(r0, r4, r5, r1, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.nm.C0267.m4000(o.nt, o.nt, boolean):void");
        }

        /* renamed from: ι  reason: contains not printable characters */
        public final String m4001() {
            return nt.m4028(this.f3410);
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    static /* synthetic */ void m3993(Object obj, Object obj2, ng ngVar, nl nlVar, boolean z) {
        if (obj != null && z) {
            nlVar.update(obj);
        } else if (obj == null || obj2 == null) {
            f3405.log(Level.WARNING, "Requested stateKey not found in store");
        } else if (ngVar.m3988(obj2, obj)) {
            nlVar.update(obj);
        }
    }
}
