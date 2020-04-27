package o;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0012:\u0002\u0010\u0011J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001a\u00028\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00002\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\bH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/ex;", "p0", "Lkotlin/Function2;", "Lo/ex$ı;", "p1", "R", "fold", "(Ljava/lang/Object;Lo/fy;)Ljava/lang/Object;", "Lo/ex$ǃ;", "E", "get", "(Lo/ex$ǃ;)Lo/ex$ı;", "minusKey", "(Lo/ex$ǃ;)Lo/ex;", "plus", "(Lo/ex;)Lo/ex;", "ı", "ǃ", ""}, k = 1, mv = {1, 1, 15})
/* renamed from: o.ex  reason: case insensitive filesystem */
public interface C3396ex {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0003*\u00020\u00022\u00020\u0001"}, d2 = {"Lo/ex$ǃ;", "", "Lo/ex$ı;", "E"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.ex$ǃ  reason: contains not printable characters */
    public interface C0170<E extends C0169> {
    }

    <R> R fold(R r, C3423fy<? super R, ? super C0169, ? extends R> fyVar);

    <E extends C0169> E get(C0170<E> r1);

    C3396ex minusKey(C0170<?> r1);

    C3396ex plus(C3396ex exVar);

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* renamed from: o.ex$DefaultImpls */
    public static final class DefaultImpls {
        public static C3396ex plus(C3396ex exVar, C3396ex exVar2) {
            fM.m2254(exVar2, "");
            return exVar2 == C3395ew.f2135 ? exVar : (C3396ex) exVar2.fold(exVar, ex$if$3.f2136);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\tJ*\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00018'@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ex$ı;", "Lo/ex$ǃ;", "getKey", "()Lo/ex$ǃ;", "Ι", "p0", "E", "get", "(Lo/ex$ǃ;)Lo/ex$ı;", "Lo/ex;"}, k = 1, mv = {1, 1, 15})
    /* renamed from: o.ex$ı  reason: contains not printable characters */
    public interface C0169 extends C3396ex {
        <E extends C0169> E get(C0170<E> r1);

        @JvmName(name = "getKey")
        C0170<?> getKey();

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
        /* renamed from: o.ex$ı$DefaultImpls */
        public static final class DefaultImpls {
            /* renamed from: Ι  reason: contains not printable characters */
            public static C3396ex m2230(C0169 r1, C3396ex exVar) {
                fM.m2254(exVar, "");
                return DefaultImpls.plus(r1, exVar);
            }

            public static <E extends C0169> E get(C0169 r1, C0170<E> r2) {
                fM.m2254(r2, "");
                if (fM.m2257(r1.getKey(), r2)) {
                    return r1;
                }
                return null;
            }

            /* renamed from: ι  reason: contains not printable characters */
            public static <R> R m2231(C0169 r1, R r, C3423fy<? super R, ? super C0169, ? extends R> fyVar) {
                fM.m2254(fyVar, "");
                return fyVar.m2299(r, r1);
            }

            /* renamed from: ı  reason: contains not printable characters */
            public static C3396ex m2229(C0169 r1, C0170<?> r2) {
                fM.m2254(r2, "");
                boolean r22 = fM.m2257(r1.getKey(), r2);
                C3396ex exVar = r1;
                if (r22) {
                    exVar = C3395ew.f2135;
                }
                return exVar;
            }
        }
    }
}
