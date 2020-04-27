package o;

import kotlin.Metadata;
import o.C3369dx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aT\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u0007*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0000\u001a\u00028\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aV\u0010\u000b\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0000\u001a\u00028\u00012\"\u0010\u0002\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019"}, d2 = {"p0", "Lo/er;", "p1", "", "Lkotlin/Function2;", "", "R", "T", "ǃ", "(Lo/fy;Ljava/lang/Object;Lo/er;)V", "Lo/he;", "ɩ", "(Lo/he;Ljava/lang/Object;Lo/fy;)Ljava/lang/Object;"}, k = 2, mv = {1, 1, 15})
/* renamed from: o.jo  reason: case insensitive filesystem */
public final class C3520jo {
    /* renamed from: ɩ  reason: contains not printable characters */
    public static final <T, R> Object m3115(C3457he<? super T> heVar, R r, C3423fy<? super R, ? super C3390er<? super T>, ? extends Object> fyVar) {
        Object obj;
        fM.m2254(heVar, "");
        fM.m2254(fyVar, "");
        heVar.O_();
        try {
            obj = ((C3423fy) fZ.m2284(fyVar, 2)).m2299(r, heVar);
        } catch (Throwable th) {
            obj = new C3463hk(th, false, 2, (fL) null);
        }
        if (obj == eF.m2136()) {
            return eF.m2136();
        }
        if (!heVar.m2752(obj, 4)) {
            return eF.m2136();
        }
        Object r4 = heVar.m2741();
        if (!(r4 instanceof C3463hk)) {
            return C3490il.m2784(r4);
        }
        C3463hk hkVar = (C3463hk) r4;
        Throwable th2 = hkVar.f2291;
        throw C3509jd.m3069(heVar, hkVar.f2291);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <R, T> void m3114(C3423fy<? super R, ? super C3390er<? super T>, ? extends Object> fyVar, R r, C3390er<? super T> erVar) {
        C3396ex r5;
        Object r1;
        fM.m2254(fyVar, "");
        fM.m2254(erVar, "");
        C3390er<? super T> r0 = eN.m2155(erVar);
        try {
            r5 = erVar.m2213();
            r1 = C3513jh.m3079(r5, (Object) null);
            Object r3 = ((C3423fy) fZ.m2284(fyVar, 2)).m2299(r, r0);
            C3513jh.m3081(r5, r1);
            if (r3 != eF.m2136()) {
                C3369dx.C0158 r4 = C3369dx.f2060;
                r0.m2214(C3369dx.m2118(r3));
            }
        } catch (Throwable th) {
            C3369dx.C0158 r42 = C3369dx.f2060;
            r0.m2214(C3369dx.m2118(C3366du.m2110(th)));
        }
    }
}
