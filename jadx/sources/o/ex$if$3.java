package o;

import kotlin.Metadata;
import o.C3396ex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo/ex;", "p0", "Lo/ex$ı;", "p1", "ɩ", "(Lo/ex;Lo/ex$ı;)Lo/ex;"}, k = 3, mv = {1, 1, 15})
final class ex$if$3 extends fO implements C3423fy<C3396ex, C3396ex.C0169, C3396ex> {

    /* renamed from: ı  reason: contains not printable characters */
    public static final ex$if$3 f2136 = new ex$if$3();

    ex$if$3() {
        super(2);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final C3396ex m2227(C3396ex exVar, C3396ex.C0169 r5) {
        C3391es esVar;
        fM.m2254(exVar, "");
        fM.m2254(r5, "");
        C3396ex minusKey = exVar.minusKey(r5.getKey());
        if (minusKey == C3395ew.f2135) {
            return r5;
        }
        C3392et etVar = (C3392et) minusKey.get(C3392et.f2133);
        if (etVar == null) {
            esVar = new C3391es(minusKey, r5);
        } else {
            C3396ex minusKey2 = minusKey.minusKey(C3392et.f2133);
            if (minusKey2 == C3395ew.f2135) {
                esVar = new C3391es(r5, etVar);
            } else {
                esVar = new C3391es(new C3391es(minusKey2, r5), etVar);
            }
        }
        return esVar;
    }
}
