package o;

import kotlin.Metadata;
import o.C3369dx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0003\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0003\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0016\u0010\u0001\u001a\u00020\u00008\u0002@\u0003X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo/ja;", "ı", "Lo/ja;", "p0", "", "Lo/er;", "T", "ǃ", "(Lo/er;Ljava/lang/Object;)V", "", "ι", "(Lo/er;Ljava/lang/Throwable;)V"}, k = 2, mv = {1, 1, 15})
public final class hG {
    /* access modifiers changed from: private */

    /* renamed from: ı  reason: contains not printable characters */
    public static final C3506ja f2258 = new C3506ja("UNDEFINED");

    /* renamed from: ǃ  reason: contains not printable characters */
    public static final <T> void m2446(C3390er<? super T> erVar, T t) {
        boolean z;
        C3396ex r3;
        Object r4;
        fM.m2254(erVar, "");
        if (erVar instanceof hE) {
            hE hEVar = (hE) erVar;
            if (hEVar.f2252.m2541(hEVar.m2436())) {
                hEVar.f2255 = t;
                hEVar.f2264 = 1;
                hEVar.f2252.m2543(hEVar.m2436(), hEVar);
                return;
            }
            hO r0 = C3501iw.f2385.m2807();
            if (r0.m2490()) {
                hEVar.f2255 = t;
                hEVar.f2264 = 1;
                r0.m2486((hJ<?>) hEVar);
                return;
            }
            hJ hJVar = hEVar;
            r0.m2481(true);
            try {
                C3483id idVar = (C3483id) hEVar.m2436().get(C3483id.f2366);
                if (idVar == null || idVar.m2670()) {
                    z = false;
                } else {
                    C3369dx.C0158 r42 = C3369dx.f2060;
                    hEVar.m2214(C3369dx.m2118(C3366du.m2110(idVar.m2671())));
                    z = true;
                }
                if (!z) {
                    r3 = hEVar.m2436();
                    r4 = C3513jh.m3079(r3, hEVar.f2253);
                    C3390er<T> erVar2 = hEVar.f2254;
                    C3369dx.C0158 r5 = C3369dx.f2060;
                    erVar2.m2214(C3369dx.m2118(t));
                    dF dFVar = dF.f2032;
                    C3513jh.m3081(r3, r4);
                }
                do {
                } while (r0.m2487());
            } catch (Throwable th) {
                try {
                    hJVar.m2451(th, (Throwable) null);
                } catch (Throwable th2) {
                    r0.m2482(true);
                    throw th2;
                }
            }
            r0.m2482(true);
            return;
        }
        C3369dx.C0158 r02 = C3369dx.f2060;
        erVar.m2214(C3369dx.m2118(t));
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static final <T> void m2447(C3390er<? super T> erVar, Throwable th) {
        C3396ex r2;
        Object r4;
        fM.m2254(erVar, "");
        fM.m2254(th, "");
        if (erVar instanceof hE) {
            hE hEVar = (hE) erVar;
            C3396ex r0 = hEVar.f2254.m2213();
            boolean z = false;
            C3463hk hkVar = new C3463hk(th, false, 2, (fL) null);
            if (hEVar.f2252.m2541(r0)) {
                hEVar.f2255 = new C3463hk(th, false, 2, (fL) null);
                hEVar.f2264 = 1;
                hEVar.f2252.m2543(r0, hEVar);
                return;
            }
            hO r02 = C3501iw.f2385.m2807();
            if (r02.m2490()) {
                hEVar.f2255 = hkVar;
                hEVar.f2264 = 1;
                r02.m2486((hJ<?>) hEVar);
                return;
            }
            hJ hJVar = hEVar;
            r02.m2481(true);
            try {
                C3483id idVar = (C3483id) hEVar.m2436().get(C3483id.f2366);
                if (idVar != null && !idVar.m2670()) {
                    C3369dx.C0158 r42 = C3369dx.f2060;
                    hEVar.m2214(C3369dx.m2118(C3366du.m2110(idVar.m2671())));
                    z = true;
                }
                if (!z) {
                    r2 = hEVar.m2436();
                    r4 = C3513jh.m3079(r2, hEVar.f2253);
                    C3390er<T> erVar2 = hEVar.f2254;
                    C3369dx.C0158 r5 = C3369dx.f2060;
                    erVar2.m2214(C3369dx.m2118(C3366du.m2110(C3507jb.m3057(th, (C3390er<?>) erVar2))));
                    dF dFVar = dF.f2032;
                    C3513jh.m3081(r2, r4);
                }
                do {
                } while (r02.m2487());
            } catch (Throwable th2) {
                try {
                    hJVar.m2451(th2, (Throwable) null);
                } catch (Throwable th3) {
                    r02.m2482(true);
                    throw th3;
                }
            }
            r02.m2482(true);
            return;
        }
        C3369dx.C0158 r03 = C3369dx.f2060;
        erVar.m2214(C3369dx.m2118(C3366du.m2110(C3507jb.m3057(th, (C3390er<?>) erVar))));
    }
}
