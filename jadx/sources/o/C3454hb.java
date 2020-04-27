package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aL\u0010\u000e\u001a\u00020\r*\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\n2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/ex;", "p0", "Lkotlin/Function2;", "Lo/hv;", "Lo/er;", "", "p1", "T", "ı", "(Lo/ex;Lo/fy;Lo/er;)Ljava/lang/Object;", "Lo/hw;", "", "p2", "Lo/id;", "Ι", "(Lo/hv;Lo/ex;Lo/hw;Lo/fy;)Lo/id;"}, k = 5, mv = {1, 1, 15}, xs = "o/hc")
/* renamed from: o.hb  reason: case insensitive filesystem */
final /* synthetic */ class C3454hb {
    /* renamed from: Ι$default  reason: contains not printable characters */
    public static /* synthetic */ C3483id m2507$default(C3474hv hvVar, C3396ex exVar, C3475hw hwVar, C3423fy fyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            exVar = C3395ew.f2135;
        }
        if ((i & 2) != 0) {
            hwVar = C3475hw.DEFAULT;
        }
        return C3455hc.m2509(hvVar, exVar, hwVar, fyVar);
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static final C3483id m2506(C3474hv hvVar, C3396ex exVar, C3475hw hwVar, C3423fy<? super C3474hv, ? super C3390er<? super dF>, ? extends Object> fyVar) {
        C3497is isVar;
        fM.m2254(hvVar, "");
        fM.m2254(exVar, "");
        fM.m2254(hwVar, "");
        fM.m2254(fyVar, "");
        C3396ex r1 = C3473hu.m2554(hvVar, exVar);
        if (hwVar.m2556()) {
            isVar = new C3489ik(r1, fyVar);
        } else {
            isVar = new C3497is(r1, true);
        }
        isVar.m2520(hwVar, isVar, fyVar);
        return isVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: ı  reason: contains not printable characters */
    public static final <T> Object m2505(C3396ex exVar, C3423fy<? super C3474hv, ? super C3390er<? super T>, ? extends Object> fyVar, C3390er<? super T> erVar) {
        Object obj;
        C3396ex r0 = erVar.m2213();
        C3396ex plus = r0.plus(exVar);
        iC.m2567(plus);
        if (plus == r0) {
            C3508jc jcVar = new C3508jc(plus, erVar);
            obj = C3520jo.m3115(jcVar, jcVar, fyVar);
        } else if (fM.m2257((C3392et) plus.get(C3392et.f2133), (C3392et) r0.get(C3392et.f2133))) {
            C3504iz izVar = new C3504iz(plus, erVar);
            Object r1 = C3513jh.m3079(plus, (Object) null);
            try {
                Object r4 = C3520jo.m3115(izVar, izVar, fyVar);
                C3513jh.m3081(plus, r1);
                obj = r4;
            } catch (Throwable th) {
                C3513jh.m3081(plus, r1);
                throw th;
            }
        } else {
            hF hFVar = new hF(plus, erVar);
            hFVar.O_();
            C3515jj.m3095(fyVar, hFVar, hFVar);
            obj = hFVar.m2442();
        }
        if (obj == eF.m2136()) {
            eN.m2153(erVar);
        }
        return obj;
    }
}
