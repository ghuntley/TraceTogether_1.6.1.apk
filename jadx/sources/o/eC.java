package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aX\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0000\u001a\u00028\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019"}, d2 = {"p0", "Lo/er;", "p1", "", "Lkotlin/Function2;", "", "R", "T", "ι", "(Lo/fy;Ljava/lang/Object;Lo/er;)Lo/er;", "ı", "(Lo/er;)Lo/er;"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "o/eF")
public class eC {
    /* renamed from: ι  reason: contains not printable characters */
    public static final <R, T> C3390er<dF> m2125(C3423fy<? super R, ? super C3390er<? super T>, ? extends Object> fyVar, R r, C3390er<? super T> erVar) {
        C3390er<dF> erVar2;
        fM.m2254(fyVar, "");
        fM.m2254(erVar, "");
        C3390er<? super T> r4 = eN.m2155(erVar);
        if (fyVar instanceof eD) {
            return ((eD) fyVar).m2133(r, r4);
        }
        C3396ex r5 = r4.m2213();
        if (r5 == C3395ew.f2135) {
            erVar2 = new C0160(r4, r4, fyVar, r);
        } else {
            erVar2 = new If(r4, r5, r4, r5, fyVar, r);
        }
        return erVar2;
    }

    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> C3390er<T> m2124(C3390er<? super T> erVar) {
        C3390er<Object> r0;
        fM.m2254(erVar, "");
        eJ eJVar = (eJ) (!(erVar instanceof eJ) ? null : erVar);
        return (eJVar == null || (r0 = eJVar.m2146()) == null) ? erVar : r0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\tJ$\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019¸\u0006\n"}, d2 = {"Lo/eC$ɩ;", "", "ǃ", "I", "ι", "Lo/dx;", "", "p0", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo/eO;", "o/eC$ɩ"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.eC$ǃ  reason: contains not printable characters */
    public static final class C0160 extends eO {

        /* renamed from: ı  reason: contains not printable characters */
        final /* synthetic */ Object f2076;

        /* renamed from: ǃ  reason: contains not printable characters */
        private int f2077;

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ C3390er f2078;

        /* renamed from: ι  reason: contains not printable characters */
        final /* synthetic */ C3423fy f2079;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0160(C3390er erVar, C3390er erVar2, C3423fy fyVar, Object obj) {
            super(erVar2);
            this.f2078 = erVar;
            this.f2079 = fyVar;
            this.f2076 = obj;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m2128(Object obj) {
            int i = this.f2077;
            if (i == 0) {
                this.f2077 = 1;
                C3366du.m2109(obj);
                C3390er erVar = this;
                C3423fy fyVar = this.f2079;
                if (fyVar != null) {
                    return ((C3423fy) fZ.m2284(fyVar, 2)).m2299(this.f2076, erVar);
                }
                throw new dA("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f2077 = 2;
                C3366du.m2109(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\tJ$\u0010\u0002\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/eC$ɩ;", "", "ǃ", "I", "ɩ", "Lo/dx;", "", "p0", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo/eO;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.eC$ɩ  reason: contains not printable characters */
    public static final class C0161 extends eO {

        /* renamed from: ǃ  reason: contains not printable characters */
        private int f2080;

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ C3413fo f2081;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m2129(Object obj) {
            int i = this.f2080;
            if (i == 0) {
                this.f2080 = 1;
                C3366du.m2109(obj);
                return this.f2081.m2298(this);
            } else if (i == 1) {
                this.f2080 = 2;
                C3366du.m2109(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\tJ$\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019¸\u0006\n"}, d2 = {"Lo/eC$ı;", "", "ι", "I", "Lo/dx;", "", "p0", "ǃ", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo/eJ;", "o/eC$ı"}, k = 1, mv = {1, 1, 15})
    public static final class If extends eJ {

        /* renamed from: ı  reason: contains not printable characters */
        final /* synthetic */ C3423fy f2069;

        /* renamed from: ǃ  reason: contains not printable characters */
        final /* synthetic */ C3396ex f2070;

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ Object f2071;

        /* renamed from: Ι  reason: contains not printable characters */
        final /* synthetic */ C3390er f2072;

        /* renamed from: ι  reason: contains not printable characters */
        private int f2073;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public If(C3390er erVar, C3396ex exVar, C3390er erVar2, C3396ex exVar2, C3423fy fyVar, Object obj) {
            super(erVar2, exVar2);
            this.f2072 = erVar;
            this.f2070 = exVar;
            this.f2069 = fyVar;
            this.f2071 = obj;
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m2126(Object obj) {
            int i = this.f2073;
            if (i == 0) {
                this.f2073 = 1;
                C3366du.m2109(obj);
                C3390er erVar = this;
                C3423fy fyVar = this.f2069;
                if (fyVar != null) {
                    return ((C3423fy) fZ.m2284(fyVar, 2)).m2299(this.f2071, erVar);
                }
                throw new dA("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f2073 = 2;
                C3366du.m2109(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b\n\u0018\u00002\u00020\nJ$\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0014ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/eC$ı;", "", "Ι", "I", "ɩ", "Lo/dx;", "", "p0", "ǃ", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo/eJ;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.eC$ı  reason: contains not printable characters */
    public static final class C0159 extends eJ {

        /* renamed from: ɩ  reason: contains not printable characters */
        final /* synthetic */ C3413fo f2074;

        /* renamed from: Ι  reason: contains not printable characters */
        private int f2075;

        /* renamed from: ǃ  reason: contains not printable characters */
        public final Object m2127(Object obj) {
            int i = this.f2075;
            if (i == 0) {
                this.f2075 = 1;
                C3366du.m2109(obj);
                return this.f2074.m2298(this);
            } else if (i == 1) {
                this.f2075 = 2;
                C3366du.m2109(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }
}
