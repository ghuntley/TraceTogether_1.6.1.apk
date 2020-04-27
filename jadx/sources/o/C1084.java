package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import o.C2771;
import o.C2864;

/* renamed from: o.ɍӀ  reason: contains not printable characters */
public final class C1084 extends C0742<C2864.Cif, Path> {

    /* renamed from: ı  reason: contains not printable characters */
    private final C2864.Cif f6472 = new C2864.Cif();

    /* renamed from: Ӏ  reason: contains not printable characters */
    private final Path f6473 = new Path();

    public C1084(List<C2463<C2864.Cif>> list) {
        super(list);
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public final /* synthetic */ Object m7443(C2463 r13, float f) {
        C2864.Cif ifVar = (C2864.Cif) r13.f11217;
        C2864.Cif ifVar2 = (C2864.Cif) r13.f11223;
        C2864.Cif ifVar3 = this.f6472;
        if (ifVar3.f13338 == null) {
            ifVar3.f13338 = new PointF();
        }
        ifVar3.f13337 = ifVar.f13337 || ifVar2.f13337;
        if (ifVar.f13339.size() != ifVar2.f13339.size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(ifVar.f13339.size());
            sb.append("\tShape 2: ");
            sb.append(ifVar2.f13339.size());
            C2414.m12460(sb.toString());
        }
        int min = Math.min(ifVar.f13339.size(), ifVar2.f13339.size());
        if (ifVar3.f13339.size() < min) {
            for (int size = ifVar3.f13339.size(); size < min; size++) {
                ifVar3.f13339.add(new C2771.Cif());
            }
        } else if (ifVar3.f13339.size() > min) {
            for (int size2 = ifVar3.f13339.size() - 1; size2 >= min; size2--) {
                ifVar3.f13339.remove(ifVar3.f13339.size() - 1);
            }
        }
        PointF pointF = ifVar.f13338;
        PointF pointF2 = ifVar2.f13338;
        float r5 = C2493.m13237(pointF.x, pointF2.x, f);
        float r2 = C2493.m13237(pointF.y, pointF2.y, f);
        if (ifVar3.f13338 == null) {
            ifVar3.f13338 = new PointF();
        }
        ifVar3.f13338.set(r5, r2);
        for (int size3 = ifVar3.f13339.size() - 1; size3 >= 0; size3--) {
            C2771.Cif ifVar4 = ifVar.f13339.get(size3);
            C2771.Cif ifVar5 = ifVar2.f13339.get(size3);
            PointF pointF3 = ifVar4.f13123;
            PointF pointF4 = ifVar4.f13124;
            PointF pointF5 = ifVar4.f13125;
            PointF pointF6 = ifVar5.f13123;
            PointF pointF7 = ifVar5.f13124;
            PointF pointF8 = ifVar5.f13125;
            ifVar3.f13339.get(size3).f13123.set(C2493.m13237(pointF3.x, pointF6.x, f), C2493.m13237(pointF3.y, pointF6.y, f));
            ifVar3.f13339.get(size3).f13124.set(C2493.m13237(pointF4.x, pointF7.x, f), C2493.m13237(pointF4.y, pointF7.y, f));
            ifVar3.f13339.get(size3).f13125.set(C2493.m13237(pointF5.x, pointF8.x, f), C2493.m13237(pointF5.y, pointF8.y, f));
        }
        C2493.m13242(this.f6472, this.f6473);
        return this.f6473;
    }
}
