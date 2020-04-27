package o;

import java.util.List;
import o.C2715;
import o.C2745;

/* renamed from: o.ȥ  reason: contains not printable characters */
public final class C0952 extends C0975<C2715.Cif> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2715.Cif f5948;

    public C0952(List<C2463<C2715.Cif>> list) {
        super(list);
        int i = 0;
        C2715.Cif ifVar = (C2715.Cif) list.get(0).f11217;
        i = ifVar != null ? ifVar.f12563.length : i;
        this.f5948 = new C2715.Cif(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m6856(C2463 r7, float f) {
        C2715.Cif ifVar = this.f5948;
        C2715.Cif ifVar2 = (C2715.Cif) r7.f11217;
        C2715.Cif ifVar3 = (C2715.Cif) r7.f11223;
        if (ifVar2.f12563.length == ifVar3.f12563.length) {
            for (int i = 0; i < ifVar2.f12563.length; i++) {
                ifVar.f12564[i] = C2493.m13237(ifVar2.f12564[i], ifVar3.f12564[i], f);
                ifVar.f12563[i] = C2745.C2748.m14567(f, ifVar2.f12563[i], ifVar3.f12563[i]);
            }
            return this.f5948;
        }
        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(ifVar2.f12563.length);
        sb.append(" vs ");
        sb.append(ifVar3.f12563.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
