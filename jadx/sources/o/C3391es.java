package o;

import java.io.Serializable;
import kotlin.Metadata;
import o.C3396ex;
import o.fU;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u00052\u00060%j\u0002`&:\u0001\bB\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$J\u0017\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00052\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0004\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u0004\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/es;", "Lo/ex$ı;", "ı", "Lo/ex$ı;", "ǃ", "Lo/ex;", "ι", "Lo/ex;", "ɩ", "p0", "", "(Lo/ex$ı;)Z", "(Lo/es;)Z", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "p1", "R", "fold", "(Ljava/lang/Object;Lo/fy;)Ljava/lang/Object;", "Lo/ex$ǃ;", "E", "get", "(Lo/ex$ǃ;)Lo/ex$ı;", "", "hashCode", "()I", "minusKey", "(Lo/ex$ǃ;)Lo/ex;", "", "toString", "()Ljava/lang/String;", "writeReplace", "()Ljava/lang/Object;", "<init>", "(Lo/ex;Lo/ex$ı;)V", "Ljava/io/Serializable;", "Lo/ı;"}, k = 1, mv = {1, 1, 15})
/* renamed from: o.es  reason: case insensitive filesystem */
public final class C3391es implements C3396ex, Serializable {

    /* renamed from: ı  reason: contains not printable characters */
    private final C3396ex.C0169 f2126;

    /* renamed from: ι  reason: contains not printable characters */
    private final C3396ex f2127;

    public C3391es(C3396ex exVar, C3396ex.C0169 r3) {
        fM.m2254(exVar, "");
        fM.m2254(r3, "");
        this.f2127 = exVar;
        this.f2126 = r3;
    }

    public final C3396ex plus(C3396ex exVar) {
        fM.m2254(exVar, "");
        return C3396ex.DefaultImpls.plus(this, exVar);
    }

    public final <E extends C3396ex.C0169> E get(C3396ex.C0170<E> r3) {
        fM.m2254(r3, "");
        C3396ex exVar = this;
        while (true) {
            C3391es esVar = (C3391es) exVar;
            E e = esVar.f2126.get(r3);
            if (e != null) {
                return e;
            }
            exVar = esVar.f2127;
            if (!(exVar instanceof C3391es)) {
                return exVar.get(r3);
            }
        }
    }

    public final <R> R fold(R r, C3423fy<? super R, ? super C3396ex.C0169, ? extends R> fyVar) {
        fM.m2254(fyVar, "");
        return fyVar.m2299(this.f2127.fold(r, fyVar), this.f2126);
    }

    public final C3396ex minusKey(C3396ex.C0170<?> r3) {
        fM.m2254(r3, "");
        if (this.f2126.get(r3) != null) {
            return this.f2127;
        }
        C3396ex minusKey = this.f2127.minusKey(r3);
        if (minusKey == this.f2127) {
            return this;
        }
        if (minusKey == C3395ew.f2135) {
            return this.f2126;
        }
        return new C3391es(minusKey, this.f2126);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    private final int m2215() {
        C3391es esVar = this;
        int i = 2;
        while (true) {
            C3396ex exVar = esVar.f2127;
            if (!(exVar instanceof C3391es)) {
                exVar = null;
            }
            esVar = (C3391es) exVar;
            if (esVar == null) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m2217(C3396ex.C0169 r2) {
        return fM.m2257(get(r2.getKey()), r2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    private final boolean m2216(C3391es esVar) {
        while (m2217(esVar.f2126)) {
            C3396ex exVar = esVar.f2127;
            if (exVar instanceof C3391es) {
                esVar = (C3391es) exVar;
            } else if (exVar != null) {
                return m2217((C3396ex.C0169) exVar);
            } else {
                throw new dA("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3391es) {
                C3391es esVar = (C3391es) obj;
                if (esVar.m2215() != m2215() || !esVar.m2216(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2127.hashCode() + this.f2126.hashCode();
    }

    public final String toString() {
        return "[" + ((String) fold("", AnonymousClass2.f2128)) + "]";
    }

    private final Object writeReplace() {
        int r0 = m2215();
        final C3396ex[] exVarArr = new C3396ex[r0];
        final fU.Cif ifVar = new fU.Cif();
        boolean z = false;
        ifVar.f2169 = 0;
        fold(dF.f2032, new C3423fy<dF, C3396ex.C0169, dF>() {
            /* renamed from: ı  reason: contains not printable characters */
            public final /* synthetic */ Object m2220(Object obj, Object obj2) {
                m2221((dF) obj, (C3396ex.C0169) obj2);
                return dF.f2032;
            }

            /* renamed from: Ι  reason: contains not printable characters */
            public final void m2221(dF dFVar, C3396ex.C0169 r5) {
                fM.m2254(dFVar, "");
                fM.m2254(r5, "");
                C3396ex[] exVarArr = exVarArr;
                fU.Cif ifVar = ifVar;
                int i = ifVar.f2169;
                ifVar.f2169 = i + 1;
                exVarArr[i] = r5;
            }
        });
        if (ifVar.f2169 == r0) {
            z = true;
        }
        if (z) {
            return new C0166(exVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000 \u00012\u00060\fj\u0002`\r:\u0001\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0006¢\u0006\u0006\n\u0004\b\u0001\u0010\u0004"}, d2 = {"Lo/es$ɩ;", "ı", "", "Lo/ex;", "[Lo/ex;", "ι", "", "readResolve", "()Ljava/lang/Object;", "p0", "<init>", "([Lo/ex;)V", "Ljava/io/Serializable;", "Lo/ı;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.es$ɩ  reason: contains not printable characters */
    static final class C0166 implements Serializable {

        /* renamed from: ı  reason: contains not printable characters */
        public static final C0167 f2131 = new C0167((fL) null);

        /* renamed from: ı  reason: contains not printable characters and collision with other field name */
        public final C3396ex[] f2132;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\b\u0003\u0018\u00002\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/es$ɩ$ı;", "<init>", "()V", ""}, k = 1, mv = {1, 1, 15})
        /* renamed from: o.es$ɩ$ı  reason: contains not printable characters */
        public static final class C0167 {
            private C0167() {
            }

            public /* synthetic */ C0167(fL fLVar) {
                this();
            }
        }

        public C0166(C3396ex[] exVarArr) {
            fM.m2254(exVarArr, "");
            this.f2132 = exVarArr;
        }

        private final Object readResolve() {
            C3396ex[] exVarArr = this.f2132;
            C3396ex exVar = C3395ew.f2135;
            for (C3396ex plus : exVarArr) {
                exVar = exVar.plus(plus);
            }
            return exVar;
        }
    }
}
